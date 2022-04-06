/* The following code was generated by JFlex 1.4.3 on 05/04/22 10:46 */

package compilador;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 05/04/22 10:46 from the specification file
 * <tt>D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  7,  6,  0,  7,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     7, 32,  0,  0,  0, 37, 30,  4, 41, 42, 35, 33,  3, 34, 48, 36, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 49, 47, 38, 40, 39,  0, 
     0,  1,  1,  1,  1, 51,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 43,  0, 44,  0, 50, 
     0,  9,  1,  8, 14, 15, 16, 23, 11, 20,  1,  1, 12, 25, 22, 21, 
    19,  1, 24, 13, 10, 17, 28, 27, 18, 26, 29, 45, 31, 46,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\6\17\2"+
    "\2\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\31\1\32\1\0\1\33\22\2"+
    "\1\34\11\2\1\35\1\36\1\37\1\3\1\40\1\0"+
    "\1\41\1\0\1\6\1\42\1\43\1\44\1\3\1\31"+
    "\1\45\1\46\1\45\1\0\3\2\1\47\5\2\1\50"+
    "\7\2\1\51\3\2\1\52\1\53\7\2\1\45\1\54"+
    "\2\0\2\31\1\45\1\3\2\45\1\46\1\45\1\55"+
    "\1\32\2\45\1\55\2\2\1\56\1\57\1\60\5\2"+
    "\1\61\1\62\3\2\1\63\2\2\1\64\1\65\4\2"+
    "\1\66\1\2\1\67\1\70\2\0\1\6\1\45\1\54"+
    "\1\55\1\46\1\45\1\55\1\71\1\72\1\73\6\2"+
    "\1\74\1\75\10\2\1\76\2\54\2\2\1\77\10\2"+
    "\1\100\1\2\1\101\2\2\1\102\25\2\1\103\23\2"+
    "\1\104\4\2\1\105\1\106\1\107\2\2\1\110\2\2"+
    "\1\111\1\112\1\113\1\114\2\2\1\115\2\2\1\116"+
    "\1\117\1\120";

  private static int [] zzUnpackAction() {
    int [] result = new int[283];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\64\0\320\0\u0104\0\64"+
    "\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444"+
    "\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548\0\64\0\64\0\u057c"+
    "\0\u05b0\0\u05e4\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\u0618\0\u064c\0\u0680\0\320\0\64"+
    "\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820"+
    "\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0"+
    "\0\u09f4\0\u0a28\0\150\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c"+
    "\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\64\0\64\0\64\0\u0c30"+
    "\0\u0c64\0\u0c64\0\u0c64\0\u0c98\0\u0ccc\0\64\0\64\0\64"+
    "\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c"+
    "\0\u0ea0\0\150\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8"+
    "\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110\0\u1144\0\150"+
    "\0\u1178\0\u11ac\0\u11e0\0\150\0\150\0\u1214\0\u1248\0\u127c"+
    "\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8\0\u141c"+
    "\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\u15bc"+
    "\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728\0\150"+
    "\0\150\0\150\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860"+
    "\0\150\0\u1894\0\u18c8\0\u18fc\0\150\0\u1930\0\u1964\0\150"+
    "\0\150\0\u1998\0\u19cc\0\u1a00\0\u1a34\0\150\0\u1a68\0\150"+
    "\0\150\0\u1a9c\0\u1ad0\0\u141c\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0"+
    "\0\u1bd4\0\u1c08\0\150\0\150\0\150\0\u1c3c\0\u1c70\0\u1ca4"+
    "\0\u1cd8\0\u1d0c\0\u1d40\0\150\0\150\0\u1d74\0\u1da8\0\u1ddc"+
    "\0\u1e10\0\u1e44\0\u1e78\0\u1eac\0\u1ee0\0\150\0\u1f14\0\u1f48"+
    "\0\u1f7c\0\u1fb0\0\150\0\u1fe4\0\u2018\0\u204c\0\u2080\0\u20b4"+
    "\0\u20e8\0\u211c\0\u2150\0\150\0\u2184\0\150\0\u21b8\0\u21ec"+
    "\0\150\0\u2220\0\u2254\0\u2288\0\u22bc\0\u22f0\0\u2324\0\u2358"+
    "\0\u238c\0\u23c0\0\u23f4\0\u2428\0\u245c\0\u2490\0\u24c4\0\u24f8"+
    "\0\u252c\0\u2560\0\u2594\0\u25c8\0\u25fc\0\u2630\0\150\0\u2664"+
    "\0\u2698\0\u26cc\0\u2700\0\u2734\0\u2768\0\u279c\0\u27d0\0\u2804"+
    "\0\u2838\0\u286c\0\u28a0\0\u28d4\0\u2908\0\u293c\0\u2970\0\u29a4"+
    "\0\u29d8\0\u2a0c\0\150\0\u2a40\0\u2a74\0\u2aa8\0\u2adc\0\150"+
    "\0\150\0\150\0\u2b10\0\u2b44\0\150\0\u2b78\0\u2bac\0\150"+
    "\0\150\0\150\0\150\0\u2be0\0\u2c14\0\150\0\u2c48\0\u2c7c"+
    "\0\150\0\150\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[283];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11"+
    "\1\3\1\12\1\13\1\3\1\14\1\15\1\16\1\17"+
    "\2\3\1\20\1\21\1\22\1\3\1\23\1\24\1\25"+
    "\1\3\1\26\1\27\1\3\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\2\1\3\65\0\2\3\5\0\26\3\24\0\2\3"+
    "\1\0\1\54\1\4\5\0\7\54\1\55\16\54\22\0"+
    "\1\56\2\0\1\55\4\57\1\60\57\57\6\0\1\10"+
    "\56\0\2\3\5\0\1\3\1\61\2\3\1\62\21\3"+
    "\24\0\2\3\1\0\2\3\5\0\20\3\1\63\5\3"+
    "\24\0\2\3\1\0\2\3\5\0\15\3\1\64\10\3"+
    "\24\0\2\3\1\0\2\3\5\0\2\3\1\65\1\3"+
    "\1\66\2\3\1\67\13\3\1\70\2\3\24\0\2\3"+
    "\1\0\2\3\5\0\7\3\1\71\10\3\1\72\5\3"+
    "\24\0\2\3\1\0\2\3\5\0\4\3\1\73\5\3"+
    "\1\74\13\3\24\0\2\3\1\0\2\3\5\0\1\3"+
    "\1\75\2\3\1\76\7\3\1\77\1\100\10\3\24\0"+
    "\2\3\1\0\2\3\5\0\1\3\1\101\13\3\1\102"+
    "\10\3\24\0\2\3\1\0\2\3\5\0\10\3\1\103"+
    "\5\3\1\104\2\3\1\105\4\3\24\0\2\3\1\0"+
    "\2\3\5\0\13\3\1\106\12\3\24\0\2\3\1\0"+
    "\2\3\5\0\7\3\1\107\16\3\24\0\2\3\1\0"+
    "\2\3\5\0\7\3\1\110\16\3\24\0\2\3\1\0"+
    "\2\3\5\0\1\3\1\111\24\3\24\0\2\3\1\0"+
    "\2\3\5\0\3\3\1\112\11\3\1\113\10\3\24\0"+
    "\2\3\1\0\2\3\5\0\15\3\1\114\10\3\24\0"+
    "\2\3\36\0\1\115\64\0\1\116\74\0\1\117\15\0"+
    "\1\120\36\0\1\121\1\122\23\0\1\120\36\0\1\122"+
    "\1\123\63\0\1\124\1\125\70\0\1\126\63\0\1\127"+
    "\63\0\1\130\14\0\2\54\5\0\26\54\25\0\1\54"+
    "\1\0\1\54\1\131\5\0\7\54\1\132\16\54\3\0"+
    "\2\133\20\0\1\132\2\0\1\134\14\0\1\135\40\0"+
    "\1\136\2\0\1\135\1\0\2\3\5\0\2\3\1\137"+
    "\23\3\24\0\2\3\1\0\2\3\5\0\1\3\1\140"+
    "\24\3\24\0\2\3\1\0\2\3\5\0\11\3\1\141"+
    "\10\3\1\142\3\3\24\0\2\3\1\0\2\3\5\0"+
    "\21\3\1\143\4\3\24\0\2\3\1\0\2\3\5\0"+
    "\15\3\1\144\10\3\24\0\2\3\1\0\2\3\5\0"+
    "\7\3\1\145\16\3\24\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\146\23\3\24\0\2\3\1\0\2\3\5\0"+
    "\14\3\1\147\11\3\24\0\2\3\1\0\2\3\5\0"+
    "\10\3\1\150\15\3\24\0\2\3\1\0\2\3\5\0"+
    "\1\3\1\151\24\3\24\0\2\3\1\0\2\3\5\0"+
    "\5\3\1\152\20\3\24\0\2\3\1\0\2\3\5\0"+
    "\1\153\1\154\24\3\24\0\2\3\1\0\2\3\5\0"+
    "\4\3\1\155\21\3\24\0\2\3\1\0\2\3\5\0"+
    "\1\3\1\156\24\3\24\0\2\3\1\0\2\3\5\0"+
    "\4\3\1\157\21\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\160\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\161\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\162\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\163\14\3\1\164\6\3\24\0\2\3\1\0"+
    "\2\3\5\0\13\3\1\165\12\3\24\0\2\3\1\0"+
    "\2\3\5\0\2\3\1\166\23\3\24\0\2\3\1\0"+
    "\2\3\5\0\2\3\1\167\23\3\24\0\2\3\1\0"+
    "\2\3\5\0\2\3\1\170\23\3\24\0\2\3\1\0"+
    "\2\3\5\0\14\3\1\171\11\3\24\0\2\3\1\0"+
    "\2\3\5\0\14\3\1\172\11\3\24\0\2\3\1\0"+
    "\2\3\5\0\20\3\1\173\5\3\24\0\2\3\1\0"+
    "\2\3\5\0\14\3\1\174\11\3\24\0\2\3\2\0"+
    "\1\120\14\0\1\175\40\0\1\56\2\0\1\175\2\0"+
    "\1\176\36\0\2\122\21\0\42\124\1\177\1\200\20\124"+
    "\6\125\1\0\55\125\1\0\1\54\1\131\5\0\7\54"+
    "\1\201\16\54\25\0\1\201\1\0\1\54\1\202\5\0"+
    "\7\54\1\132\16\54\3\0\2\203\20\0\1\132\2\0"+
    "\1\204\14\0\1\205\21\0\2\206\20\0\1\205\2\0"+
    "\1\207\14\0\1\210\40\0\1\211\2\0\1\210\2\0"+
    "\1\212\14\0\1\213\21\0\2\214\20\0\1\213\2\0"+
    "\1\215\55\0\1\136\4\0\2\3\5\0\1\216\25\3"+
    "\24\0\2\3\1\0\2\3\5\0\5\3\1\217\20\3"+
    "\24\0\2\3\1\0\2\3\5\0\7\3\1\220\16\3"+
    "\24\0\2\3\1\0\2\3\5\0\7\3\1\221\16\3"+
    "\24\0\2\3\1\0\2\3\5\0\13\3\1\222\12\3"+
    "\24\0\2\3\1\0\2\3\5\0\7\3\1\223\16\3"+
    "\24\0\2\3\1\0\2\3\5\0\7\3\1\224\1\225"+
    "\15\3\24\0\2\3\1\0\2\3\5\0\2\3\1\226"+
    "\23\3\24\0\2\3\1\0\2\3\5\0\1\3\1\227"+
    "\24\3\24\0\2\3\1\0\2\3\5\0\23\3\1\230"+
    "\2\3\24\0\2\3\1\0\2\3\5\0\7\3\1\231"+
    "\16\3\24\0\2\3\1\0\2\3\5\0\7\3\1\232"+
    "\16\3\24\0\2\3\1\0\2\3\5\0\1\233\25\3"+
    "\24\0\2\3\1\0\2\3\5\0\5\3\1\234\20\3"+
    "\24\0\2\3\1\0\2\3\5\0\17\3\1\235\6\3"+
    "\24\0\2\3\1\0\2\3\5\0\1\3\1\236\2\3"+
    "\1\237\21\3\24\0\2\3\1\0\2\3\5\0\2\3"+
    "\1\240\23\3\24\0\2\3\1\0\2\3\5\0\2\3"+
    "\1\241\23\3\24\0\2\3\1\0\2\3\5\0\7\3"+
    "\1\242\16\3\24\0\2\3\1\0\2\3\5\0\14\3"+
    "\1\243\11\3\24\0\2\3\1\0\2\3\5\0\7\3"+
    "\1\244\16\3\24\0\2\3\1\0\2\3\5\0\11\3"+
    "\1\245\14\3\24\0\2\3\1\0\2\3\5\0\16\3"+
    "\1\246\7\3\24\0\2\3\1\0\2\3\5\0\4\3"+
    "\1\247\21\3\24\0\2\3\1\0\2\3\5\0\6\3"+
    "\1\250\17\3\24\0\2\3\1\0\2\3\5\0\6\3"+
    "\1\251\17\3\24\0\2\3\2\0\1\204\14\0\1\213"+
    "\21\0\2\133\20\0\1\213\2\0\1\176\14\0\1\252"+
    "\40\0\1\253\2\0\1\252\42\124\1\177\1\254\62\124"+
    "\1\0\1\200\20\124\1\0\1\54\1\202\5\0\7\54"+
    "\1\201\16\54\3\0\2\255\20\0\1\201\1\0\1\54"+
    "\1\202\5\0\7\54\1\201\16\54\25\0\1\201\2\0"+
    "\1\255\14\0\1\205\21\0\2\203\20\0\1\205\2\0"+
    "\1\204\14\0\1\205\43\0\1\205\2\0\1\255\14\0"+
    "\1\205\21\0\2\255\20\0\1\205\2\0\1\256\14\0"+
    "\1\205\21\0\2\206\20\0\1\205\2\0\1\207\14\0"+
    "\1\210\40\0\1\257\2\0\1\210\2\0\1\260\14\0"+
    "\1\213\21\0\2\261\20\0\1\213\2\0\1\262\55\0"+
    "\1\211\5\0\1\212\14\0\1\205\43\0\1\205\2\0"+
    "\1\255\14\0\1\213\21\0\2\203\20\0\1\213\2\0"+
    "\1\212\14\0\1\205\21\0\2\203\20\0\1\205\2\0"+
    "\1\257\55\0\1\211\4\0\2\3\5\0\3\3\1\263"+
    "\22\3\24\0\2\3\1\0\2\3\5\0\5\3\1\264"+
    "\20\3\24\0\2\3\1\0\2\3\5\0\13\3\1\265"+
    "\12\3\24\0\2\3\1\0\2\3\5\0\12\3\1\266"+
    "\13\3\24\0\2\3\1\0\2\3\5\0\14\3\1\267"+
    "\11\3\24\0\2\3\1\0\2\3\5\0\1\270\25\3"+
    "\24\0\2\3\1\0\2\3\5\0\11\3\1\271\14\3"+
    "\24\0\2\3\1\0\2\3\5\0\20\3\1\272\5\3"+
    "\24\0\2\3\1\0\2\3\5\0\13\3\1\273\12\3"+
    "\24\0\2\3\1\0\2\3\5\0\2\3\1\274\23\3"+
    "\24\0\2\3\1\0\2\3\5\0\7\3\1\275\16\3"+
    "\24\0\2\3\1\0\2\3\5\0\21\3\1\276\4\3"+
    "\24\0\2\3\1\0\2\3\5\0\1\277\1\3\1\300"+
    "\15\3\1\301\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\302\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\15\3\1\303\10\3\24\0\2\3\1\0\2\3\5\0"+
    "\12\3\1\304\13\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\305\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\7\3\1\306\16\3\24\0\2\3\2\0\1\307\36\0"+
    "\2\252\23\0\1\310\63\0\1\255\14\0\1\205\43\0"+
    "\1\205\2\0\1\256\14\0\1\205\43\0\1\205\2\0"+
    "\1\257\55\0\1\257\5\0\1\260\14\0\1\205\43\0"+
    "\1\205\2\0\1\260\14\0\1\205\21\0\2\206\20\0"+
    "\1\205\2\0\1\262\55\0\1\136\4\0\2\3\5\0"+
    "\2\3\1\311\23\3\24\0\2\3\1\0\2\3\5\0"+
    "\4\3\1\312\21\3\24\0\2\3\1\0\2\3\5\0"+
    "\3\3\1\313\22\3\24\0\2\3\1\0\2\3\5\0"+
    "\4\3\1\314\21\3\24\0\2\3\1\0\2\3\5\0"+
    "\7\3\1\315\16\3\24\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\316\23\3\24\0\2\3\1\0\2\3\5\0"+
    "\7\3\1\317\16\3\24\0\2\3\1\0\2\3\5\0"+
    "\14\3\1\320\11\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\321\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\7\3\1\322\16\3\24\0\2\3\1\0\2\3\5\0"+
    "\20\3\1\323\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\16\3\1\324\7\3\24\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\325\23\3\24\0\2\3\1\0\2\3\5\0"+
    "\16\3\1\326\7\3\24\0\2\3\2\0\1\307\63\0"+
    "\1\310\14\0\1\252\43\0\1\252\1\0\2\3\5\0"+
    "\20\3\1\327\5\3\24\0\2\3\1\0\2\3\5\0"+
    "\1\3\1\330\24\3\24\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\331\23\3\24\0\2\3\1\0\2\3\5\0"+
    "\1\332\25\3\24\0\2\3\1\0\2\3\5\0\14\3"+
    "\1\333\11\3\24\0\2\3\1\0\2\3\5\0\16\3"+
    "\1\334\7\3\24\0\2\3\1\0\2\3\5\0\20\3"+
    "\1\335\5\3\24\0\2\3\1\0\2\3\5\0\14\3"+
    "\1\336\11\3\24\0\2\3\1\0\2\3\5\0\1\337"+
    "\25\3\24\0\2\3\1\0\2\3\5\0\11\3\1\340"+
    "\14\3\24\0\2\3\1\0\2\3\5\0\20\3\1\341"+
    "\5\3\24\0\2\3\1\0\2\3\5\0\11\3\1\342"+
    "\14\3\24\0\2\3\1\0\2\3\5\0\21\3\1\343"+
    "\4\3\24\0\2\3\1\0\2\3\5\0\2\3\1\344"+
    "\23\3\24\0\2\3\1\0\2\3\5\0\15\3\1\345"+
    "\10\3\24\0\2\3\1\0\2\3\5\0\2\3\1\346"+
    "\23\3\24\0\2\3\1\0\2\3\5\0\1\347\25\3"+
    "\24\0\2\3\1\0\2\3\5\0\1\3\1\350\24\3"+
    "\24\0\2\3\1\0\2\3\5\0\2\3\1\351\23\3"+
    "\24\0\2\3\1\0\2\3\5\0\13\3\1\352\12\3"+
    "\24\0\2\3\1\0\2\3\5\0\11\3\1\353\14\3"+
    "\24\0\2\3\1\0\2\3\5\0\5\3\1\354\20\3"+
    "\24\0\2\3\1\0\2\3\5\0\7\3\1\355\16\3"+
    "\24\0\2\3\1\0\2\3\5\0\1\3\1\356\24\3"+
    "\24\0\2\3\1\0\2\3\5\0\16\3\1\357\7\3"+
    "\24\0\2\3\1\0\2\3\5\0\2\3\1\360\23\3"+
    "\24\0\2\3\1\0\2\3\5\0\11\3\1\361\14\3"+
    "\24\0\2\3\1\0\2\3\5\0\16\3\1\362\7\3"+
    "\24\0\2\3\1\0\2\3\5\0\1\3\1\363\24\3"+
    "\24\0\2\3\1\0\2\3\5\0\2\3\1\364\23\3"+
    "\24\0\2\3\1\0\2\3\5\0\5\3\1\365\20\3"+
    "\24\0\2\3\1\0\2\3\5\0\15\3\1\366\10\3"+
    "\24\0\2\3\1\0\2\3\5\0\16\3\1\367\7\3"+
    "\24\0\2\3\1\0\2\3\5\0\16\3\1\370\7\3"+
    "\24\0\2\3\1\0\2\3\5\0\22\3\1\371\3\3"+
    "\24\0\2\3\1\0\2\3\5\0\4\3\1\372\21\3"+
    "\24\0\2\3\1\0\2\3\5\0\17\3\1\373\6\3"+
    "\24\0\2\3\1\0\2\3\5\0\16\3\1\374\7\3"+
    "\24\0\2\3\1\0\2\3\5\0\14\3\1\375\11\3"+
    "\24\0\2\3\1\0\2\3\5\0\15\3\1\376\10\3"+
    "\24\0\2\3\1\0\2\3\5\0\20\3\1\377\5\3"+
    "\24\0\2\3\1\0\2\3\5\0\2\3\1\u0100\23\3"+
    "\24\0\2\3\1\0\2\3\5\0\17\3\1\u0101\6\3"+
    "\24\0\2\3\1\0\2\3\5\0\13\3\1\u0102\12\3"+
    "\24\0\2\3\1\0\2\3\5\0\15\3\1\u0103\10\3"+
    "\24\0\2\3\1\0\2\3\5\0\11\3\1\u0104\14\3"+
    "\24\0\2\3\1\0\2\3\5\0\17\3\1\u0105\6\3"+
    "\24\0\2\3\1\0\2\3\5\0\15\3\1\u0106\10\3"+
    "\24\0\2\3\1\0\2\3\5\0\20\3\1\u0107\5\3"+
    "\24\0\2\3\1\0\2\3\5\0\12\3\1\u0108\7\3"+
    "\1\u0109\2\3\1\u010a\24\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\u010b\23\3\24\0\2\3\1\0\2\3\5\0"+
    "\11\3\1\u010c\14\3\24\0\2\3\1\0\2\3\5\0"+
    "\7\3\1\u010d\16\3\24\0\2\3\1\0\2\3\5\0"+
    "\4\3\1\u010e\21\3\24\0\2\3\1\0\2\3\5\0"+
    "\11\3\1\u010f\14\3\24\0\2\3\1\0\2\3\5\0"+
    "\16\3\1\u0110\7\3\24\0\2\3\1\0\2\3\5\0"+
    "\12\3\1\u0111\7\3\1\u0112\2\3\1\u0113\24\0\2\3"+
    "\1\0\2\3\5\0\22\3\1\u0114\3\3\24\0\2\3"+
    "\1\0\2\3\5\0\4\3\1\u0115\21\3\24\0\2\3"+
    "\1\0\2\3\5\0\15\3\1\u0116\10\3\24\0\2\3"+
    "\1\0\2\3\5\0\4\3\1\u0117\21\3\24\0\2\3"+
    "\1\0\2\3\5\0\13\3\1\u0118\12\3\24\0\2\3"+
    "\1\0\2\3\5\0\15\3\1\u0119\10\3\24\0\2\3"+
    "\1\0\2\3\5\0\15\3\1\u011a\10\3\24\0\2\3"+
    "\1\0\2\3\5\0\7\3\1\u011b\16\3\24\0\2\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11440];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\1\11\25\1\2\11"+
    "\3\1\11\11\3\1\1\0\1\11\34\1\3\11\2\1"+
    "\1\0\1\1\1\0\1\1\3\11\5\1\1\0\40\1"+
    "\2\0\51\1\2\0\160\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[283];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { return new Symbol(sym.SimbEsp_Coma, yychar, yyline, yytext());
          }
        case 81: break;
        case 48: 
          { return new Symbol(sym.PR_Stop, yychar, yyline, yytext());
          }
        case 82: break;
        case 23: 
          { return new Symbol(sym.SimbEsp_Punto, yychar, yyline, yytext());
          }
        case 83: break;
        case 25: 
          { return new Symbol(sym.ERROR5, yychar, yyline, yytext());
          }
        case 84: break;
        case 55: 
          { return new Symbol(sym.PR_Word, yychar, yyline, yytext());
          }
        case 85: break;
        case 66: 
          { return new Symbol(sym.PR_Default, yychar, yyline, yytext());
          }
        case 86: break;
        case 52: 
          { return new Symbol(sym.PR_Part, yychar, yyline, yytext());
          }
        case 87: break;
        case 68: 
          { return new Symbol(sym.PR_Fillcirculo, yychar, yyline, yytext());
          }
        case 88: break;
        case 18: 
          { return new Symbol(sym.OpAgrup_CorchApert, yychar, yyline, yytext());
          }
        case 89: break;
        case 62: 
          { return new Symbol(sym.PR_While, yychar, yyline, yytext());
          }
        case 90: break;
        case 78: 
          { return new Symbol(sym.PR_Drawrectangulo, yychar, yyline, yytext());
          }
        case 91: break;
        case 80: 
          { return new Symbol(sym.PR_Setfilamenttype, yychar, yyline, yytext());
          }
        case 92: break;
        case 24: 
          { return new Symbol(sym.SimbEsp_DosPuntos, yychar, yyline, yytext());
          }
        case 93: break;
        case 54: 
          { return new Symbol(sym.PR_Main, yychar, yyline, yytext());
          }
        case 94: break;
        case 17: 
          { return new Symbol(sym.OpAgrup_ParCierre, yychar, yyline, yytext());
          }
        case 95: break;
        case 27: 
          { return new Symbol(sym.Cadena_texto, yychar, yyline, yytext());
          }
        case 96: break;
        case 47: 
          { return new Symbol(sym.PR_Home, yychar, yyline, yytext());
          }
        case 97: break;
        case 49: 
          { return new Symbol(sym.PR_Draw, yychar, yyline, yytext());
          }
        case 98: break;
        case 26: 
          { return new Symbol(sym.ERROR2, yychar, yyline, yytext());
          }
        case 99: break;
        case 15: 
          { return new Symbol(sym.OpAsig, yychar, yyline, yytext());
          }
        case 100: break;
        case 70: 
          { return new Symbol(sym.PR_Setextrusory, yychar, yyline, yytext());
          }
        case 101: break;
        case 7: 
          { return new Symbol(sym.OpLog_Not, yychar, yyline, yytext());
          }
        case 102: break;
        case 6: 
          { /*Ignore*/
          }
        case 103: break;
        case 30: 
          { return new Symbol(sym.OpLog_Or, yychar, yyline, yytext());
          }
        case 104: break;
        case 21: 
          { return new Symbol(sym.OpAgrup_LlaveCierre, yychar, yyline, yytext());
          }
        case 105: break;
        case 59: 
          { return new Symbol(sym.PR_Sleep, yychar, yyline, yytext());
          }
        case 106: break;
        case 51: 
          { return new Symbol(sym.PR_Flag, yychar, yyline, yytext());
          }
        case 107: break;
        case 36: 
          { return new Symbol(sym.OpRel_Igual, yychar, yyline, yytext());
          }
        case 108: break;
        case 33: 
          { return new Symbol(sym.Op_Decremento, yychar, yyline, yytext());
          }
        case 109: break;
        case 1: 
          { return new Symbol(sym.Simbolo_Especial, yychar, yyline, yytext());
          }
        case 110: break;
        case 20: 
          { return new Symbol(sym.OpAgrup_LlaveApert, yychar, yyline, yytext());
          }
        case 111: break;
        case 71: 
          { return new Symbol(sym.PR_Setextrusorz, yychar, yyline, yytext());
          }
        case 112: break;
        case 29: 
          { return new Symbol(sym.OpLog_And, yychar, yyline, yytext());
          }
        case 113: break;
        case 11: 
          { return new Symbol(sym.OpAritm_Div, yychar, yyline, yytext());
          }
        case 114: break;
        case 19: 
          { return new Symbol(sym.OpAgrup_CorchCierre, yychar, yyline, yytext());
          }
        case 115: break;
        case 22: 
          { return new Symbol(sym.PuntoComa, yychar, yyline, yytext());
          }
        case 116: break;
        case 53: 
          { return new Symbol(sym.PR_Port, yychar, yyline, yytext());
          }
        case 117: break;
        case 65: 
          { return new Symbol(sym.PR_Return, yychar, yyline, yytext());
          }
        case 118: break;
        case 46: 
          { return new Symbol(sym.PR_True, yychar, yyline, yytext());
          }
        case 119: break;
        case 10: 
          { return new Symbol(sym.OpAritm_Mult, yychar, yyline, yytext());
          }
        case 120: break;
        case 38: 
          { return new Symbol(sym.Numero_Part, yychar, yyline, yytext()) ;
          }
        case 121: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 122: break;
        case 13: 
          { return new Symbol(sym.OpRel_Menor, yychar, yyline, yytext());
          }
        case 123: break;
        case 64: 
          { return new Symbol(sym.PR_Option, yychar, yyline, yytext());
          }
        case 124: break;
        case 74: 
          { return new Symbol(sym.PR_Getextrusorx, yychar, yyline, yytext());
          }
        case 125: break;
        case 5: 
          { return new Symbol(sym.SimbEsp_Comilla, yychar, yyline, yytext());
          }
        case 126: break;
        case 41: 
          { return new Symbol(sym.PR_For, yychar, yyline, yytext());
          }
        case 127: break;
        case 16: 
          { return new Symbol(sym.OpAgrup_ParApert, yychar, yyline, yytext());
          }
        case 128: break;
        case 45: 
          { return new Symbol(sym.ERROR3, yychar, yyline, yytext());
          }
        case 129: break;
        case 14: 
          { return new Symbol(sym.OpRel_Mayor, yychar, yyline, yytext());
          }
        case 130: break;
        case 50: 
          { return new Symbol(sym.PR_Else, yychar, yyline, yytext());
          }
        case 131: break;
        case 57: 
          { return new Symbol(sym.PR_Catch, yychar, yyline, yytext());
          }
        case 132: break;
        case 39: 
          { return new Symbol(sym.PR_Try, yychar, yyline, yytext());
          }
        case 133: break;
        case 79: 
          { return new Symbol(sym.PR_Fillrectangulo, yychar, yyline, yytext());
          }
        case 134: break;
        case 40: 
          { return new Symbol(sym.PR_Def, yychar, yyline, yytext());
          }
        case 135: break;
        case 67: 
          { return new Symbol(sym.PR_Exeption, yychar, yyline, yytext());
          }
        case 136: break;
        case 12: 
          { return new Symbol(sym.OpAritm_Resto, yychar, yyline, yytext());
          }
        case 137: break;
        case 8: 
          { return new Symbol(sym.OpAritm_Suma, yychar, yyline, yytext());
          }
        case 138: break;
        case 72: 
          { return new Symbol(sym.PR_Filamenttype, yychar, yyline, yytext());
          }
        case 139: break;
        case 77: 
          { return new Symbol(sym.PR_Filltriangulo, yychar, yyline, yytext());
          }
        case 140: break;
        case 31: 
          { return new Symbol(sym.OpRel_Diferente, yychar, yyline, yytext());
          }
        case 141: break;
        case 37: 
          { return new Symbol(sym.ERROR4, yychar, yyline, yytext());
          }
        case 142: break;
        case 42: 
          { return new Symbol(sym.PR_Ing, yychar, yyline, yytext());
          }
        case 143: break;
        case 58: 
          { return new Symbol(sym.PR_Class, yychar, yyline, yytext());
          }
        case 144: break;
        case 63: 
          { return new Symbol(sym.PR_Switch, yychar, yyline, yytext());
          }
        case 145: break;
        case 56: 
          { return new Symbol(sym.PR_Void, yychar, yyline, yytext());
          }
        case 146: break;
        case 34: 
          { return new Symbol(sym.OpRel_MenorIgual, yychar, yyline, yytext());
          }
        case 147: break;
        case 75: 
          { return new Symbol(sym.PR_Getextrusory, yychar, yyline, yytext());
          }
        case 148: break;
        case 73: 
          { return new Symbol(sym.PR_Interruption, yychar, yyline, yytext());
          }
        case 149: break;
        case 9: 
          { return new Symbol(sym.OpAritm_Resta, yychar, yyline, yytext());
          }
        case 150: break;
        case 32: 
          { return new Symbol(sym.Op_Incremento, yychar, yyline, yytext());
          }
        case 151: break;
        case 43: 
          { return new Symbol(sym.PR_Imp, yychar, yyline, yytext());
          }
        case 152: break;
        case 60: 
          { return new Symbol(sym.PR_Exact, yychar, yyline, yytext());
          }
        case 153: break;
        case 35: 
          { return new Symbol(sym.OpRel_MayorIgual, yychar, yyline, yytext());
          }
        case 154: break;
        case 3: 
          { return new Symbol(sym.Numero_Exact, yychar, yyline, yytext());
          }
        case 155: break;
        case 44: 
          { return new Symbol(sym.ERROR1, yychar, yyline, yytext());
          }
        case 156: break;
        case 69: 
          { return new Symbol(sym.PR_Setextrusorx, yychar, yyline, yytext());
          }
        case 157: break;
        case 61: 
          { return new Symbol(sym.PR_False, yychar, yyline, yytext());
          }
        case 158: break;
        case 76: 
          { return new Symbol(sym.PR_Getextrusorz, yychar, yyline, yytext());
          }
        case 159: break;
        case 28: 
          { return new Symbol(sym.PR_If, yychar, yyline, yytext());
          }
        case 160: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
