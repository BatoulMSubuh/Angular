parser grammar AngParser;
options { tokenVocab = AngLexer; }

app
    : codeLine+
    ;
codeLine
    : import_statment # Import
    | header # Headers
    | class # ClassCode
    | html_template # Html
    ;

//component
//    : import_statment+ header class html_template?
//    ;

statments
    : functionStatment                                #FunctionStatementRules
    | datatype                                         #DatatypeRule
    | enumCreation                                     #EnumCreationRules
    ;

class
    : Export Class ID OpenBrace statments* CloseBrace
    ;

header_body_value
    : StringLiteral  #StringLiteralRule
    | BackTick html_template BackTick   #BackTickRule
    ;

header_body
    : ID Colon OpenBracket? (header_body_value)* CloseBracket? Comma?
    ;

header
    : At ID OpenParen OpenBrace header_body* CloseBrace CloseParen
    ;

import_statment
    : Import OpenBrace ID CloseBrace From StringLiteral SemiColon
    ;

// ------------------
// HTML Rules
// ------------------

html_template
    : htmlElement+
    ;

htmlElement
    : LessThan ID htmlAttribute* MoreThan htmlContent LessThan Divide ID MoreThan  #HtmlElementWithContent
    | LessThan ID htmlAttribute* Divide MoreThan                                   #HtmlElementSelfClosing
    ;

htmlContent
    : htmlsubcontent*                                  #HmlSubcontentList
    | OpenBrace ID CloseBrace                          #HtmlContentExpression
    | htmltext ((operation | Colon) htmltext )?        #HtmlTextWithOperation
    | ID? Colon? htmlElement? OpenBrace OpenBrace ID ID2 CloseBrace CloseBrace (ID | Dolar)? #ComplexBinding
    ;

htmltext
    : OpenBrace OpenBrace ID CloseBrace CloseBrace                             #HtmlTextSimple
    | OpenBrace OpenBrace ID operation Number CloseBrace CloseBrace    #HtmlTextWithArithmetic
    ;

operation
    : Minus                                                            #OpMinus
    | Plus                                                             #OpPlus
    | Divide                                                           #OpDivide
    | Multiply                                                         #OpMultiply
    ;

htmlsubcontent
    : ID                                                              #HtmlSubID
    | htmlElement                                                     #HtmlSubElement
    ;

htmlAttribute
    : Multiply ID ID2? Assign htmlAttributeValue                      #HtmlAttrStar
    | ID ID2? Assign htmlAttributeValue                               #HtmlAttrNormal
    | OpenParen ID ID2? CloseParen Assign htmlAttributeValue          #HtmlAttrEventBinding
    | OpenBracket ID ID2? CloseBracket Assign htmlAttributeValue      #HtmlAttrPropertyBinding
    ;

htmlAttributeValue
    : StringLiteral                                    #HtmlAttrString
    | OpenBrace ID ID2? CloseBrace                     #HtmlAttrBinding
    ;

// ------------------
// Data Types
// ------------------

datatype
    : variableStatement                                
    | enumStatment
    | definelist
    ;

keyWord
    : Any
    | Number1
    | Boolean1
    | String
    | EnumID
    | Void
    ;

keyWordValues
    : Number                                           #KWValueNumber
    | StringLiteral                                    #KWValueString
    | Boolean                                          #KWValueBoolean
    | enumItem                                         #KWValueEnumItem
    | Null                                             #KWValueNull
    | ID                                               #KWValueID
    ;

// ------------------
// Variables
// ------------------

variableStatement
    : varType? (This ID2 | ID) (Colon keyWord)? (Assign keyWordValues)? SemiColon #VariableStatementRule
    ;

// ------------------
// Enums
// ------------------

enumCreation
    : Enum EnumID OpenBrace (EnumID Comma?)+ CloseBrace
    ;

varType : Let
    | Const
    | Var
    ;

enumStatment
    : varType ID Colon ID (Assign enumItem)? SemiColon
    ;

enumItem
    : EnumID Dot EnumID
    ;

// ------------------
// Functions
// ------------------

functionBodyStatments
    : printStatment                                     #FuncPrint
    | datatype                                          #FuncDatatype
    ;

functionAttributes
    : ID Colon keyWord
    ;

functionBody
    : functionBodyStatments*
    ;

functionStatment:
    Function? ID OpenParen (functionAttributes Comma?)* CloseParen (Colon keyWord)? OpenBrace functionBody CloseBrace
  ;

printStatment
    : Console ID2 OpenParen StringLiteral CloseParen SemiColon
    ;

// ------------------
// Lists
// ------------------

definelist
    : ID Assign OpenBracket row (Comma row)* Comma? CloseBracket SemiColon
    ;

row
    : OpenBrace rowvalue (Comma rowvalue)* CloseBrace
    ;

rowvalue
    : ID Colon (Number | StringLiteral | ID)
    ;
