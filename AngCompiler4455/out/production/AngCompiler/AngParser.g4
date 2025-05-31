parser grammar AngParser;
options {tokenVocab = AngLexer;}

app :
    component+
    ;

component :
    import_statment+ header class html_template?;
statments:
    functionStatment|datatype|enumCreation;
class :
    Export Class ID OpenBrace statments* CloseBrace ;
header_body_value:
StringLiteral|BackTick html_template BackTick;
header_body:
ID Colon OpenBracket? (header_body_value)* CloseBracket? Comma?;
header :
    At ID OpenParen OpenBrace
    header_body*
    CloseBrace CloseParen ;

import_statment :
    Import OpenBrace ID CloseBrace From StringLiteral SemiColon;

//html rools
html_template
    : htmlElement+;

htmlElement
    : LessThan ID htmlAttribute* MoreThan htmlContent LessThan Divide ID MoreThan
    | LessThan ID htmlAttribute* Divide MoreThan;

htmlContent
    : htmlsubcontent*
    | OpenBrace ID  CloseBrace
    | htmltext ((operation|Colon) htmltext )?
    | ID? Colon? htmlElement? OpenBrace  OpenBrace ID ID2 CloseBrace CloseBrace (ID|Dolar)? ;

htmltext
    :OpenBrace OpenBrace ID CloseBrace CloseBrace
    | OpenBrace OpenBrace ID operation Number CloseBrace CloseBrace;
operation:
    Minus
    | Plus
    |Divide
    |Multiply;
htmlsubcontent
    :ID|htmlElement;

htmlAttribute:
    Multiply ID ID2? Assign htmlAttributeValue
    |ID ID2? Assign htmlAttributeValue
    |OpenParen  ID ID2? CloseParen Assign htmlAttributeValue
    |OpenBracket ID ID2? CloseBracket Assign htmlAttributeValue;
htmlAttributeValue
    : StringLiteral
    | OpenBrace ID ID2? CloseBrace;


//data types
datatype:
    variableStatement
    |enumStatment
    |definelist;


keyWord:
    Any
    |Number1
    |Boolean1
    |String
    |EnumID
    |Void;

 keyWordValues:
    Number| StringLiteral|Boolean|enumItem|Null|ID;

 //variabels rools


 variableStatement:
    Let? (This ID2|ID) (Colon keyWord)?  (Assign (keyWordValues))? SemiColon;

//enum rools
enumCreation:
    Enum EnumID OpenBrace (EnumID Comma?)+ CloseBrace;
enumStatment:
    Let ID Colon ID (Assign enumItem)? SemiColon;
enumItem:
    EnumID Dot EnumID;

//function rools
functionBodyStatments:
printStatment| datatype;
functionAttributes:
ID Colon keyWord;
functionBody:
    functionBodyStatments*;
functionStatment:
    Function? ID OpenParen((functionAttributes Comma?)*)?  CloseParen (Colon keyWord)? OpenBrace functionBody CloseBrace;
printStatment:
    Console ID2 OpenParen StringLiteral CloseParen SemiColon;


//list rools
definelist:
    ID Assign OpenBracket row (Comma row)* Comma? CloseBracket  SemiColon;
row:
    OpenBrace  rowvalue(Comma rowvalue)* CloseBrace;
rowvalue:
    ID Colon (Number|StringLiteral|ID);