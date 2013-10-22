// $ANTLR 3.4 D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g 2013-10-22 07:04:03

  package compiler.Frontend;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int IDENT=6;
    public static final int INT=7;
    public static final int LOWER=8;
    public static final int NEWLINE=9;
    public static final int NONNULL=10;
    public static final int NUMBER=11;
    public static final int STRING=12;
    public static final int UPPER=13;
    public static final int WHITESPACE=14;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniJavaLexer() {} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:6:7: ( '!' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:6:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:7:7: ( '&&' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:7:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:8:7: ( '(' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:9:7: ( ')' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:10:7: ( '*' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:10:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:11:7: ( '+' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:12:7: ( ',' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:13:7: ( '-' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:14:7: ( '.' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:15:7: ( ';' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:16:7: ( '<' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:17:7: ( '=' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:18:7: ( '==' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:18:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:19:7: ( 'String[]' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:19:9: 'String[]'
            {
            match("String[]"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:20:7: ( 'System.out.print' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:20:9: 'System.out.print'
            {
            match("System.out.print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:21:7: ( 'System.out.println' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:21:9: 'System.out.println'
            {
            match("System.out.println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:22:7: ( '[' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:23:7: ( ']' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:24:7: ( 'boolean' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:24:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:25:7: ( 'class' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:25:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:26:7: ( 'else' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:26:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:27:7: ( 'extends' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:27:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:28:7: ( 'false' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:28:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:29:7: ( 'if' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:29:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:30:7: ( 'int' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:30:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:31:7: ( 'new int' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:31:9: 'new int'
            {
            match("new int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:32:7: ( 'new' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:32:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:33:7: ( 'public' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:33:9: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:34:7: ( 'return' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:34:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:35:7: ( 'static' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:35:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:36:7: ( 'this' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:36:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:37:7: ( 'true' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:37:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:38:7: ( 'void' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:38:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:39:7: ( 'while' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:39:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:40:7: ( '{' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:41:7: ( '}' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:41:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:274:16: ( ( 'a' .. 'z' ) )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:275:16: ( ( 'A' .. 'Z' ) )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "NONNULL"
    public final void mNONNULL() throws RecognitionException {
        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:276:18: ( ( '1' .. '9' ) )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:
            {
            if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NONNULL"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:277:17: ( ( '0' | NONNULL ) )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:278:7: ( ( LOWER | UPPER ) ( LOWER | UPPER | NUMBER | '_' )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:278:9: ( LOWER | UPPER ) ( LOWER | UPPER | NUMBER | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:278:27: ( LOWER | UPPER | NUMBER | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:279:17: ( ( '\\r' )? '\\n' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:279:18: ( '\\r' )? '\\n'
            {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:279:18: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:279:18: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:280:5: ( '0' | ( NONNULL ( NUMBER )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:280:7: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:280:13: ( NONNULL ( NUMBER )* )
                    {
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:280:13: ( NONNULL ( NUMBER )* )
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:280:15: NONNULL ( NUMBER )*
                    {
                    mNONNULL(); 


                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:280:23: ( NUMBER )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:15: ( ' ' | '!' | ( '\\u0023' .. '\\u005B' ) | ( '\\u005D' .. '\\u007E' ) | '\\\\\"' | '\\\\\\\\' | '\\\\t' | '\\\\n' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt5=1;
                }
                break;
            case '!':
                {
                alt5=2;
                }
                break;
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
                {
                alt5=3;
                }
                break;
            case ']':
            case '^':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '{':
            case '|':
            case '}':
            case '~':
                {
                alt5=4;
                }
                break;
            case '\\':
                {
                switch ( input.LA(2) ) {
                case '\"':
                    {
                    alt5=5;
                    }
                    break;
                case '\\':
                    {
                    alt5=6;
                    }
                    break;
                case 't':
                    {
                    alt5=7;
                    }
                    break;
                case 'n':
                    {
                    alt5=8;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:17: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:23: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:29: ( '\\u0023' .. '\\u005B' )
                    {
                    if ( (input.LA(1) >= '#' && input.LA(1) <= '[') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:52: ( '\\u005D' .. '\\u007E' )
                    {
                    if ( (input.LA(1) >= ']' && input.LA(1) <= '~') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:75: '\\\\\"'
                    {
                    match("\\\""); 



                    }
                    break;
                case 6 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:83: '\\\\\\\\'
                    {
                    match("\\\\"); 



                    }
                    break;
                case 7 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:92: '\\\\t'
                    {
                    match("\\t"); 



                    }
                    break;
                case 8 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:281:100: '\\\\n'
                    {
                    match("\\n"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:282:8: ( '\"' ( CHAR )* '\"' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:282:10: '\"' ( CHAR )* '\"'
            {
            match('\"'); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:282:14: ( CHAR )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= ' ' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '~')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:282:14: CHAR
            	    {
            	    mCHAR(); 


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:9: ( ( '//' ( . )* NEWLINE | '/*' ( . )* '*/' ) )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:11: ( '//' ( . )* NEWLINE | '/*' ( . )* '*/' )
            {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:11: ( '//' ( . )* NEWLINE | '/*' ( . )* '*/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='/') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='*') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:13: '//' ( . )* NEWLINE
                    {
                    match("//"); 



                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:18: ( . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\r') ) {
                            alt7=2;
                        }
                        else if ( (LA7_0=='\n') ) {
                            alt7=2;
                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:18: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    mNEWLINE(); 


                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:31: '/*' ( . )* '*/'
                    {
                    match("/*"); 



                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:36: ( . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:283:36: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;

            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:284:13: ( ( ' ' | '\\t' | NEWLINE )+ )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:284:17: ( ' ' | '\\t' | NEWLINE )+
            {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:284:17: ( ' ' | '\\t' | NEWLINE )+
            int cnt10=0;
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt10=1;
                    }
                    break;
                case '\t':
                    {
                    alt10=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:284:19: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:284:25: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:284:32: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | IDENT | INT | STRING | COMMENT | WHITESPACE )
        int alt11=41;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:88: T__28
                {
                mT__28(); 


                }
                break;
            case 15 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:94: T__29
                {
                mT__29(); 


                }
                break;
            case 16 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:100: T__30
                {
                mT__30(); 


                }
                break;
            case 17 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:106: T__31
                {
                mT__31(); 


                }
                break;
            case 18 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:112: T__32
                {
                mT__32(); 


                }
                break;
            case 19 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:118: T__33
                {
                mT__33(); 


                }
                break;
            case 20 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:124: T__34
                {
                mT__34(); 


                }
                break;
            case 21 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:130: T__35
                {
                mT__35(); 


                }
                break;
            case 22 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:136: T__36
                {
                mT__36(); 


                }
                break;
            case 23 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:142: T__37
                {
                mT__37(); 


                }
                break;
            case 24 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:148: T__38
                {
                mT__38(); 


                }
                break;
            case 25 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:154: T__39
                {
                mT__39(); 


                }
                break;
            case 26 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:160: T__40
                {
                mT__40(); 


                }
                break;
            case 27 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:166: T__41
                {
                mT__41(); 


                }
                break;
            case 28 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:172: T__42
                {
                mT__42(); 


                }
                break;
            case 29 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:178: T__43
                {
                mT__43(); 


                }
                break;
            case 30 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:184: T__44
                {
                mT__44(); 


                }
                break;
            case 31 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:190: T__45
                {
                mT__45(); 


                }
                break;
            case 32 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:196: T__46
                {
                mT__46(); 


                }
                break;
            case 33 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:202: T__47
                {
                mT__47(); 


                }
                break;
            case 34 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:208: T__48
                {
                mT__48(); 


                }
                break;
            case 35 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:214: T__49
                {
                mT__49(); 


                }
                break;
            case 36 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:220: T__50
                {
                mT__50(); 


                }
                break;
            case 37 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:226: IDENT
                {
                mIDENT(); 


                }
                break;
            case 38 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:232: INT
                {
                mINT(); 


                }
                break;
            case 39 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:236: STRING
                {
                mSTRING(); 


                }
                break;
            case 40 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:243: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 41 :
                // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:1:251: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\14\uffff\1\44\1\36\2\uffff\14\36\11\uffff\7\36\1\75\20\36\1\uffff"+
        "\1\116\1\120\13\36\1\134\2\36\3\uffff\3\36\1\142\1\143\1\144\4\36"+
        "\1\151\1\uffff\1\36\1\153\3\36\3\uffff\1\157\3\36\1\uffff\1\36\1"+
        "\uffff\1\164\1\165\1\166\3\uffff\1\170\1\171\15\uffff\1\u0083\2"+
        "\uffff";
    static final String DFA11_eofS =
        "\u0084\uffff";
    static final String DFA11_minS =
        "\1\11\13\uffff\1\75\1\164\2\uffff\1\157\2\154\1\141\1\146\1\145"+
        "\1\165\1\145\1\164\1\150\1\157\1\150\11\uffff\1\162\1\163\1\157"+
        "\1\141\1\163\1\164\1\154\1\60\1\164\1\167\1\142\1\164\1\141\1\151"+
        "\1\165\3\151\1\164\1\154\1\163\2\145\1\163\1\uffff\1\60\1\40\1\154"+
        "\1\165\1\164\1\163\1\145\1\144\1\154\1\156\2\145\1\163\1\60\1\156"+
        "\1\145\3\uffff\1\151\1\162\1\151\3\60\1\145\1\147\1\155\1\141\1"+
        "\60\1\uffff\1\144\1\60\1\143\1\156\1\143\3\uffff\1\60\1\133\1\56"+
        "\1\156\1\uffff\1\163\1\uffff\3\60\2\uffff\1\157\2\60\3\uffff\1\165"+
        "\2\uffff\1\164\1\56\1\160\1\162\1\151\1\156\1\164\1\154\2\uffff";
    static final String DFA11_maxS =
        "\1\175\13\uffff\1\75\1\171\2\uffff\1\157\1\154\1\170\1\141\1\156"+
        "\1\145\1\165\1\145\1\164\1\162\1\157\1\150\11\uffff\1\162\1\163"+
        "\1\157\1\141\1\163\1\164\1\154\1\172\1\164\1\167\1\142\1\164\1\141"+
        "\1\151\1\165\3\151\1\164\1\154\1\163\2\145\1\163\1\uffff\2\172\1"+
        "\154\1\165\1\164\1\163\1\145\1\144\1\154\1\156\2\145\1\163\1\172"+
        "\1\156\1\145\3\uffff\1\151\1\162\1\151\3\172\1\145\1\147\1\155\1"+
        "\141\1\172\1\uffff\1\144\1\172\1\143\1\156\1\143\3\uffff\1\172\1"+
        "\133\1\56\1\156\1\uffff\1\163\1\uffff\3\172\2\uffff\1\157\2\172"+
        "\3\uffff\1\165\2\uffff\1\164\1\56\1\160\1\162\1\151\1\156\1\164"+
        "\1\154\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff"+
        "\1\21\1\22\14\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\15\1\14"+
        "\30\uffff\1\30\20\uffff\1\31\1\32\1\33\13\uffff\1\25\5\uffff\1\37"+
        "\1\40\1\41\4\uffff\1\24\1\uffff\1\27\3\uffff\1\42\1\16\3\uffff\1"+
        "\34\1\35\1\36\1\uffff\1\23\1\26\10\uffff\1\20\1\17";
    static final String DFA11_specialS =
        "\u0084\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\1\1\40\3\uffff\1\2\1\uffff"+
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\41\12\37\1\uffff\1\12\1\13"+
            "\1\14\3\uffff\22\36\1\15\7\36\1\16\1\uffff\1\17\3\uffff\1\36"+
            "\1\20\1\21\1\36\1\22\1\23\2\36\1\24\4\36\1\25\1\36\1\26\1\36"+
            "\1\27\1\30\1\31\1\36\1\32\1\33\3\36\1\34\1\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51\13\uffff\1\52",
            "\1\53",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\11\uffff\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\117\17\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\152",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\167",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\1\172",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | IDENT | INT | STRING | COMMENT | WHITESPACE );";
        }
    }
 

}