lexer grammar AngLexer;

channels { ERROR }

At : '@';




OpenBracket:                    '[';
CloseBracket:                   ']';
OpenParen:                      '(';
CloseParen:                     ')';
OpenBrace:                      '{' ;
CloseBrace:                     '}' ;
SemiColon:                      ';';
Comma:                          ',';
Assign:                         '=';
Colon:                          ':';
Ellipsis:                       '...';
Dot:                            '.';
PlusPlus:                       '++';
MinusMinus:                     '--';
Plus:                           '+';
Minus:                          '-';
BitNot:                         '~';
Not:                            '!';
Multiply:                       '*';
Divide:                         '/';
Modulus:                        '%';
Power:                          '**';
NullCoalesce:                   '??';
QuestionMark:                    '?';
Hashtag:                        '#';
RightShiftArithmetic:           '>>';
LeftShiftArithmetic:            '<<';
RightShiftLogical:              '>>>';
LessThan:                       '<';
MoreThan:                       '>';
LessThanEquals:                 '<=';
GreaterThanEquals:              '>=';
Equals_:                        '==';
NotEquals:                      '!=';
Dolar:                             '$';
IdentityEquals:                 '===';
IdentityNotEquals:              '!==';
BitAnd:                         '&';
BitXOr:                         '^';
BitOr:                          '|';
And:                            '&&';
Or:                             '||';
MultiplyAssign:                 '*=';
DivideAssign:                   '/=';
ModulusAssign:                  '%=';
PlusAssign:                     '+=';
MinusAssign:                    '-=';
LeftShiftArithmeticAssign:      '<<=';
RightShiftArithmeticAssign:     '>>=';
RightShiftLogicalAssign:        '>>>=';
BitAndAssign:                   '&=';
BitXorAssign:                   '^=';
BitOrAssign:                    '|=';
PowerAssign:                    '**=';
ARROW:                          '=>';
Null:                           'null';
Import:                         'import';
Break:                          'break';
Map:                            'map';
Do:                             'do';
Instanceof:                     'instanceof';
Typeof:                         'typeof';
Case:                           'case';
Else:                           'else';
New:                            'new';
Var:                            'var';
Catch:                          'catch';
Finally:                        'finally';
Return:                         'return';
Void:                           'void';
Continue:                       'continue';
Console:                        'console';
For:                            'for';
Switch:                         'switch';
While:                          'while';
Debugger:                       'debugger';
Function:                      'function';
This:                           'this';
With:                           'with';
Default:                        'default';
If:                             'if';
Throw:                          'throw';
Delete:                         'delete';
In:                             'in';
Try:                            'try';
As:                             'as';
From:                           'from';
UseState:                       'useState';
UseRef:                         'useRef';
UseEffect:                      'useEffect';
Class:                          'class';
Enum:                           'enum';
Extends:                        'extends';
Super:                          'super';
Const:                          'const';
Export:                         'export';
Async:                          'async';
Await:                          'await';
Implements:                     'implements' ;
Let:                            'let' ;
Private:                        'private' ;
Public:                         'public';
Interface:                      'interface' ;
Package:                        'package' ;
Protected:                      'protected' ;
Static:                         'static' ;
Yield:                          'yield' ;
React:                           'React';
Number1:                          'number';
String:                          'string';
Boolean1:                          'boolean';
Log:                               'log';
Tuple : 'tuple';
Any : 'any';
Array: 'Array';

CreateElement:                    Dot 'createElement';
Boolean:               'true'
| 'false';
Number: [0-9] [0-9]*;
ID: [a-zA-Z_] ([a-zA-Z0-9_]|Minus | QuestionMark)* ;//(OpenBracket [0-9]+ CloseBracket)? ;
ID2:Dot [a-z][a-zA-Z_]* ;
EnumID : [A-Za-z_] ([a-zA-Z0-9_]|Minus | QuestionMark)*;

DecimalLiteral:                 DecimalIntegerLiteral '.' [0-9] [0-9_]*
              |                 '.' [0-9] [0-9_]*
              |                 DecimalIntegerLiteral
              ;
StringLiteral:                 ('"' DoubleStringCharacter* '"'
             |                  '\'' SingleStringCharacter* '\'')           ;
BackTick:                       '`'  ;
JsxComment:                     '{/*' .*? '*/}'           -> channel(HIDDEN);
MultiLineComment:               '/*' .*? '*/'             -> channel(HIDDEN);
HtmlComment:                    '<!--' .*? '-->' -> channel(HIDDEN);
SingleLineComment:                        '//' .*? '\n' ->channel(HIDDEN);
UnexpectedCharacter:            . -> channel(ERROR);
CDATA:                          '<![CDATA[' .*? ']]>' -> channel(HIDDEN);

BackTickInside:                 '`'  -> type(BackTick), popMode;
TemplateStringStartExpression:  '${' -> pushMode(DEFAULT_MODE);
TemplateStringAtom:             ~[`];

fragment DoubleQuoteString
    : '"' ~[<"]* '"'
    ;
fragment SingleQuoteString
    : '\'' ~[<']* '\''
    ;
fragment DoubleStringCharacter
    : ~["\\]
    | LineContinuation
    ;
fragment SingleStringCharacter
    : ~['\\]
    | LineContinuation
    ;

fragment LineContinuation
    : '\\' [\r\n\u2028\u2029]
    ;

fragment DecimalIntegerLiteral
    : '0'
    | [1-9] [0-9_]*
    ;

