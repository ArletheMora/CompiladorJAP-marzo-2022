package compilador;
import static compilador.Tokens.*;
%%
%class Lexer
%type Tokens
%line
%column
L=[a-zA-Z]+
D=[0-9]+
C=[,]
LineTerminator = \r|\n|\r\n
espacio = {LineTerminator} | [ \t\f]
cadena_texto = (\')~(\')

%{
    public String lexeme;
%}
%%

({cadena_texto}) {lexeme=yytext(); return Cadena_texto;}

/*Palabras reservadas*/
("catch") {lexeme=yytext(); return PR_Catch;}
("class") {lexeme=yytext(); return PR_Class;}
("def") {lexeme=yytext(); return PR_Def;}
("default") {lexeme=yytext(); return PR_Default;}
("else") {lexeme=yytext(); return PR_Else;}
("exact") {lexeme=yytext(); return PR_Exact;}
("exception") {lexeme=yytext(); return PR_Exeption;}
("flag") {lexeme=yytext(); return PR_Flag;}
("for") {lexeme=yytext(); return PR_For;}
("if") {lexeme=yytext(); return PR_If;}
("ing") {lexeme=yytext(); return PR_Ing;}
("interruption") {lexeme=yytext(); return PR_Interruption;}
("imp") {lexeme=yytext(); return PR_Imp;}
("main") {lexeme=yytext(); return PR_Main;}
("option") {lexeme=yytext(); return PR_Option;}
("part") {lexeme=yytext(); return PR_Part;}
("try") {lexeme=yytext(); return PR_Try;}
("switch") {lexeme=yytext(); return PR_Switch;}
("void") {lexeme=yytext(); return PR_Void;}
("while") {lexeme=yytext(); return PR_While;}
("word") {lexeme=yytext(); return PR_Word;}
("return") {lexeme=yytext(); return PR_Return;}

/*aqui se agregaron nueva palabras reservadas*/
("stop") {lexeme=yytext(); return PR_Stop;} /*detiene impresion*/   
("sleep") {lexeme=yytext(); return PR_Sleep;}/*para momentaneamente*/
("filamenttype") {lexeme=yytext(); return PR_Filamenttype;}/*asigna tipo de filamento*/
("setfilamenttype") {lexeme=yytext(); return PR_Setfilamenttype;}/*Cambia el material del filamento.*/
("getextrusorx") {lexeme=yytext(); return PR_Getextrusorx;} /*estas toman las coordenadas x, y, z del extrusor*/
("getextrusory") {lexeme=yytext(); return PR_Getextrusory;}
("getextrusorz") {lexeme=yytext(); return PR_Getextrusorz;}
("setextrusorx") {lexeme=yytext(); return PR_Setextrusorx;} /*para cambiar coordenadas*/
("setextrusory") {lexeme=yytext(); return PR_Setextrusory;}
("setextrusorz") {lexeme=yytext(); return PR_Setextrusorz;}
("drawrectangulo") {lexeme=yytext(); return PR_Drawrectangulo;}/*crea el contorno de una figura plana*/ 
("fillrectangulo") {lexeme=yytext(); return PR_Fillrectangulo;}/*Crea una figura plana rellena*/
("filltriangulo") {lexeme=yytext(); return PR_Filltriangulo;}
("fillcirculo") {lexeme=yytext(); return PR_Fillcirculo;}
("home") {lexeme=yytext(); return PR_Home;}/*Regresa el extrusor a posicion inicial*/
("port") {lexeme=yytext(); return PR_Port;}/*Asigna el n??mero de puerto de la impresora que se usar??*/

/* Coma */
{C} {lexeme=yytext(); return SimbEsp_Coma;}

/*Operadores l??gicos*/
"&&" {lexeme=yytext(); return OpLog_And;}
"||" {lexeme=yytext(); return OpLog_Or;}
"!" {lexeme=yytext(); return OpLog_Not;}

/* Espacios en blanco */
{espacio} {/*Ignore*/}


/* Salto de linea */
( "\n" ) {/*Ignore*/}


/*Operadores aritm??ticos*/
"+" {lexeme=yytext(); return OpAritm_Suma;}
"-" {lexeme=yytext(); return OpAritm_Resta;}
"*" {lexeme=yytext(); return OpAritm_Mult;}
"/" {lexeme=yytext(); return OpAritm_Div;}
"%" {lexeme=yytext(); return OpAritm_Resto;}

/*Operadores relacionales*/
"<" {lexeme=yytext(); return OpRel_Menor;}
">" {lexeme=yytext(); return OpRel_Mayor;}
"==" {lexeme=yytext(); return OpRel_Igual;}
"<=" {lexeme=yytext(); return OpRel_MenorIgual;}
">=" {lexeme=yytext(); return OpRel_MayorIgual;}
"!=" {lexeme=yytext(); return OpRel_Diferente;}

/*Operadores incrementales*/
"++" {lexeme=yytext(); return Op_Incremento;}
"--" {lexeme=yytext(); return Op_Decremento;}

/*Operadores de agrupaci??n*/
"(" {lexeme=yytext(); return OpAgrup_ParApert;}
")" {lexeme=yytext(); return OpAgrup_ParCierre;}
"[" {lexeme=yytext(); return OpAgrup_CorchApert;}
"]" {lexeme=yytext(); return OpAgrup_CorchCierre;}
"{" {lexeme=yytext(); return OpAgrup_LlaveApert;}
"}" {lexeme=yytext(); return OpAgrup_LlaveCierre;}

/*Operador asignaci??n*/
"=" {lexeme=yytext(); return OpAsig;}

/*Valores flag*/
("true") {lexeme=yytext(); return PR_True;}
("false") {lexeme=yytext(); return PR_False;}


/* Comentarios */
"**".* {/*Ignore*/}
"*-" ( [^*] | \*+ [^*-] )* "-*" {/*Ignore*/}

/* Punto y coma */
";" {lexeme=yytext(); return PuntoComa;}

/* Punto */
"." {lexeme=yytext(); return SimbEsp_Punto;}
":" {lexeme=yytext(); return SimbEsp_DosPuntos;}     

/* Comillas */
"'" {lexeme=yytext(); return SimbEsp_Comilla;}

/* Identificador */
{L}({L}|{D}|_)* {lexeme=yytext(); return Identificador;}

/* Numeros */
("+"|"-")? {D}+ (("e"|"E")("+"|"-")?{D}+)? {lexeme=yytext(); return Numero_Exact;}

("+"|"-")? {D}+ ("." {D}+)? (("e"|"E")("+"|"-")?{D}+)? {lexeme=yytext(); return Numero_Part;}

/*Errores l??xicos*/
("+"|"-")*({D}+|{D}+ "." {D}+) (("e"|"E")("+"|"-")*{D}+)? {lexeme=yytext(); return ERROR1;} /*NUMERO_ERRONEO*/

("+"|"-")? (({D}+(".")+ {D}+(".")*){D}*)+ {lexeme=yytext(); return ERROR3;} /*NUMERO_ERRONEO*/


("+"|"-")? ({D}(".")) (("e"|"E")("+"|"-")?{D}+)? {lexeme=yytext(); return ERROR2;} /*NUMERO_ERRONEO*/



({D}+{L}+({D}*|{L}*)*)+ {lexeme=yytext(); return ERROR5;} /*MAL_NOMBRE_PARA_IDENTIFICADOR*/

("+"|"-")?{D}+ ("." {D}*)? (("e"|"E")+("+"|"-")*({D}*((("e"|"E")("+"|"-")?{D}*)?)*)+)?  {lexeme=yytext(); return ERROR4;}



/*(("+"|"-")?{L}+|("+"|"-")?{D}+ "." {D}+)("."|{D}|{L})+ {lexeme=yytext(); return ERROR3;} /*MAL_NOMBRE_PARA_IDENTIFICADOR*/*/
/* Error de analisis */
 . {lexeme=yytext(); return Simbolo_Especial;}