// $ANTLR 3.4 D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g 2013-10-22 08:58:06

  package compiler.Frontend;
  
  import java.util.LinkedList;
  import compiler.IR.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "IDENT", "INT", "LOWER", "NEWLINE", "NONNULL", "NUMBER", "STRING", "UPPER", "WHITESPACE", "'!'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "';'", "'<'", "'='", "'=='", "'String[]'", "'System.out.print'", "'System.out.println'", "'['", "']'", "'boolean'", "'class'", "'else'", "'extends'", "'false'", "'if'", "'int'", "'new int'", "'new'", "'public'", "'return'", "'static'", "'this'", "'true'", "'void'", "'while'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MiniJavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g"; }





    // $ANTLR start "program"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:17:1: program returns [MJProgram p] :mc= mainClass (cd= classDeclaration )* ;
    public final MJProgram program() throws RecognitionException {
        MJProgram p = null;


        MJClass mc =null;

        MJClass cd =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:18:3: (mc= mainClass (cd= classDeclaration )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:18:5: mc= mainClass (cd= classDeclaration )*
            {
             LinkedList<MJClass> cdl = new LinkedList<MJClass>(); 

            pushFollow(FOLLOW_mainClass_in_program52);
            mc=mainClass();

            state._fsp--;


             cdl.add(mc); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:21:7: (cd= classDeclaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:21:9: cd= classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_program74);
            	    cd=classDeclaration();

            	    state._fsp--;


            	     cdl.add(cd); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             
                  p = new MJProgram(cdl);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "program"



    // $ANTLR start "classDeclaration"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:29:1: classDeclaration returns [MJClass c] : 'class' cname= IDENT ( 'extends' scname= IDENT )? '{' (vd= varDeclaration )* (md= methodDeclaration )* '}' ;
    public final MJClass classDeclaration() throws RecognitionException {
        MJClass c = null;


        Token cname=null;
        Token scname=null;
        MJVariable vd =null;

        MJMethod md =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:30:3: ( 'class' cname= IDENT ( 'extends' scname= IDENT )? '{' (vd= varDeclaration )* (md= methodDeclaration )* '}' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:30:5: 'class' cname= IDENT ( 'extends' scname= IDENT )? '{' (vd= varDeclaration )* (md= methodDeclaration )* '}'
            {
             String superClass = "Object"; 
                  LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
                  LinkedList<MJMethod> mdl = new LinkedList<MJMethod>();
                

            match(input,34,FOLLOW_34_in_classDeclaration126); 

            cname=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDeclaration132); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:34:27: ( 'extends' scname= IDENT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:34:29: 'extends' scname= IDENT
                    {
                    match(input,36,FOLLOW_36_in_classDeclaration136); 

                    scname=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDeclaration142); 

                     superClass = (scname!=null?scname.getText():null); 

                    }
                    break;

            }


            match(input,49,FOLLOW_49_in_classDeclaration153); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:35:9: (vd= varDeclaration )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==IDENT) ) {
                        int LA3_5 = input.LA(3);

                        if ( (LA3_5==24) ) {
                            alt3=1;
                        }


                    }


                    }
                    break;
                case 39:
                    {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3==IDENT) ) {
                        int LA3_5 = input.LA(3);

                        if ( (LA3_5==24) ) {
                            alt3=1;
                        }


                    }


                    }
                    break;
                case IDENT:
                    {
                    int LA3_4 = input.LA(2);

                    if ( (LA3_4==IDENT) ) {
                        int LA3_5 = input.LA(3);

                        if ( (LA3_5==24) ) {
                            alt3=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:35:11: vd= varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_classDeclaration161);
            	    vd=varDeclaration();

            	    state._fsp--;


            	     vd.setField();
            	                vdl.add(vd);
            	              

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:40:9: (md= methodDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT||LA4_0==33||LA4_0==39||LA4_0==42||LA4_0==44||LA4_0==47) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:40:11: md= methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_classDeclaration202);
            	    md=methodDeclaration();

            	    state._fsp--;


            	     mdl.add(md);
            	              

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,50,FOLLOW_50_in_classDeclaration233); 


                  c = new MJClass((cname!=null?cname.getText():null), superClass, vdl, mdl);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "classDeclaration"



    // $ANTLR start "mainClass"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:50:1: mainClass returns [MJClass c] : 'class' cname= IDENT '{' 'public' 'static' 'void' name= IDENT '(' 'String[]' parname= IDENT ')' b= block '}' ;
    public final MJClass mainClass() throws RecognitionException {
        MJClass c = null;


        Token cname=null;
        Token name=null;
        Token parname=null;
        MJBlock b =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:51:3: ( 'class' cname= IDENT '{' 'public' 'static' 'void' name= IDENT '(' 'String[]' parname= IDENT ')' b= block '}' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:51:5: 'class' cname= IDENT '{' 'public' 'static' 'void' name= IDENT '(' 'String[]' parname= IDENT ')' b= block '}'
            {
            match(input,34,FOLLOW_34_in_mainClass256); 

            cname=(Token)match(input,IDENT,FOLLOW_IDENT_in_mainClass262); 

            match(input,49,FOLLOW_49_in_mainClass269); 

            match(input,42,FOLLOW_42_in_mainClass278); 

            match(input,44,FOLLOW_44_in_mainClass280); 

            match(input,47,FOLLOW_47_in_mainClass282); 

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_mainClass288); 

            match(input,17,FOLLOW_17_in_mainClass290); 

            match(input,28,FOLLOW_28_in_mainClass292); 

            parname=(Token)match(input,IDENT,FOLLOW_IDENT_in_mainClass298); 

            match(input,18,FOLLOW_18_in_mainClass300); 

            pushFollow(FOLLOW_block_in_mainClass306);
            b=block();

            state._fsp--;


            match(input,50,FOLLOW_50_in_mainClass312); 


                  MJType partype = MJType.getArrayType(MJType.getClassType("String"));
                  MJVariable par = new MJVariable( partype, (parname!=null?parname.getText():null));
                  LinkedList<MJVariable> parlist = new LinkedList<MJVariable>();
                  parlist.add(par);
                 
                  MJMethod md = new MJMethod(MJType.getVoidType(), (name!=null?name.getText():null), parlist, b, true, true, true);
                  c = new MJClass((cname!=null?cname.getText():null), md);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "mainClass"



    // $ANTLR start "block"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:66:1: block returns [MJBlock b] : '{' (vd= varDeclaration )* (sd= statement )* '}' ;
    public final MJBlock block() throws RecognitionException {
        MJBlock b = null;


        MJVariable vd =null;

        MJStatement sd =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:67:3: ( '{' (vd= varDeclaration )* (sd= statement )* '}' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:67:5: '{' (vd= varDeclaration )* (sd= statement )* '}'
            {
              LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
                   LinkedList<MJStatement> sdl = new LinkedList<MJStatement>();    
                

            match(input,49,FOLLOW_49_in_block343); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:70:9: (vd= varDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENT) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==IDENT) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==33||LA5_0==39) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:70:11: vd= varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_block351);
            	    vd=varDeclaration();

            	    state._fsp--;


            	     vdl.add(vd); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:73:9: (sd= statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= COMMENT && LA6_0 <= IDENT)||(LA6_0 >= 29 && LA6_0 <= 30)||LA6_0==38||LA6_0==45||(LA6_0 >= 48 && LA6_0 <= 49)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:73:11: sd= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block392);
            	    sd=statement();

            	    state._fsp--;


            	     sdl.add(sd); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,50,FOLLOW_50_in_block422); 


                   b = new MJBlock(vdl, sdl);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return b;
    }
    // $ANTLR end "block"



    // $ANTLR start "varDeclaration"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:82:1: varDeclaration returns [MJVariable vd] :t= type n= IDENT ';' ;
    public final MJVariable varDeclaration() throws RecognitionException {
        MJVariable vd = null;


        Token n=null;
        MJType t =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:83:3: (t= type n= IDENT ';' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:83:5: t= type n= IDENT ';'
            {
             MJExpression init = new MJNoExpression(); 

            pushFollow(FOLLOW_type_in_varDeclaration459);
            t=type();

            state._fsp--;


            n=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclaration465); 

            match(input,24,FOLLOW_24_in_varDeclaration467); 

             vd = new MJVariable(t, (n!=null?n.getText():null));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return vd;
    }
    // $ANTLR end "varDeclaration"



    // $ANTLR start "type"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:89:1: type returns [MJType t] : ( 'boolean' | 'int' | IDENT );
    public final MJType type() throws RecognitionException {
        MJType t = null;


        Token IDENT1=null;

        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:90:3: ( 'boolean' | 'int' | IDENT )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case IDENT:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:90:5: 'boolean'
                    {
                    match(input,33,FOLLOW_33_in_type491); 

                     t = MJType.getBooleanType();; 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:92:5: 'int'
                    {
                    match(input,39,FOLLOW_39_in_type503); 

                     t = MJType.getIntType(); 

                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:94:5: IDENT
                    {
                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_type516); 

                     t = MJType.getClassType((IDENT1!=null?IDENT1.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "type"



    // $ANTLR start "methodDeclaration"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:98:1: methodDeclaration returns [MJMethod md] : ( 'public' )? ( 'static' )? mtype= procType mname= IDENT '(' (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )? ')' '{' (vd= varDeclaration )* (sd= statement )* 'return' retExp= optExpression ';' '}' ;
    public final MJMethod methodDeclaration() throws RecognitionException {
        MJMethod md = null;


        Token mname=null;
        Token n1=null;
        Token n2=null;
        MJType mtype =null;

        MJType t1 =null;

        MJType t2 =null;

        MJVariable vd =null;

        MJStatement sd =null;

        MJExpression retExp =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:99:3: ( ( 'public' )? ( 'static' )? mtype= procType mname= IDENT '(' (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )? ')' '{' (vd= varDeclaration )* (sd= statement )* 'return' retExp= optExpression ';' '}' )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:99:5: ( 'public' )? ( 'static' )? mtype= procType mname= IDENT '(' (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )? ')' '{' (vd= varDeclaration )* (sd= statement )* 'return' retExp= optExpression ';' '}'
            {
             LinkedList<MJVariable> parlist = new LinkedList<MJVariable>(); 
                  boolean isStatic = false;
                  boolean isPublic = false;
                  LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
                  LinkedList<MJStatement> sdl = new LinkedList<MJStatement>();    
                

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:105:5: ( 'public' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:105:7: 'public'
                    {
                    match(input,42,FOLLOW_42_in_methodDeclaration548); 

                     isPublic = true; 

                    }
                    break;

            }


            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:106:5: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:106:7: 'static'
                    {
                    match(input,44,FOLLOW_44_in_methodDeclaration561); 

                     isStatic = true; 

                    }
                    break;

            }


            pushFollow(FOLLOW_procType_in_methodDeclaration576);
            mtype=procType();

            state._fsp--;


            mname=(Token)match(input,IDENT,FOLLOW_IDENT_in_methodDeclaration582); 

            match(input,17,FOLLOW_17_in_methodDeclaration589); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:109:7: (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==33||LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:109:9: t1= type n1= IDENT ( ',' t2= type n2= IDENT )*
                    {
                    pushFollow(FOLLOW_type_in_methodDeclaration604);
                    t1=type();

                    state._fsp--;


                    n1=(Token)match(input,IDENT,FOLLOW_IDENT_in_methodDeclaration610); 

                     parlist.add(new MJVariable(t1,(n1!=null?n1.getText():null))); 

                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:111:9: ( ',' t2= type n2= IDENT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:111:11: ',' t2= type n2= IDENT
                    	    {
                    	    match(input,21,FOLLOW_21_in_methodDeclaration633); 

                    	    pushFollow(FOLLOW_type_in_methodDeclaration639);
                    	    t2=type();

                    	    state._fsp--;


                    	    n2=(Token)match(input,IDENT,FOLLOW_IDENT_in_methodDeclaration645); 

                    	     parlist.add(new MJVariable(t2,(n2!=null?n2.getText():null))); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,18,FOLLOW_18_in_methodDeclaration686); 

            match(input,49,FOLLOW_49_in_methodDeclaration693); 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:116:9: (vd= varDeclaration )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==IDENT) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==IDENT) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==33||LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:116:11: vd= varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_methodDeclaration701);
            	    vd=varDeclaration();

            	    state._fsp--;


            	     vdl.add(vd); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:119:9: (sd= statement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= COMMENT && LA13_0 <= IDENT)||(LA13_0 >= 29 && LA13_0 <= 30)||LA13_0==38||LA13_0==45||(LA13_0 >= 48 && LA13_0 <= 49)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:119:11: sd= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_methodDeclaration742);
            	    sd=statement();

            	    state._fsp--;


            	     sdl.add(sd); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,43,FOLLOW_43_in_methodDeclaration776); 

            pushFollow(FOLLOW_optExpression_in_methodDeclaration782);
            retExp=optExpression();

            state._fsp--;


            match(input,24,FOLLOW_24_in_methodDeclaration784); 

             
                      MJReturn r = new MJReturn(retExp);
                      sdl.add(r);
                    

            match(input,50,FOLLOW_50_in_methodDeclaration800); 


                  MJBlock b = new MJBlock(vdl, sdl);
                  md = new MJMethod(mtype, (mname!=null?mname.getText():null), parlist,  b, isStatic, isPublic);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return md;
    }
    // $ANTLR end "methodDeclaration"



    // $ANTLR start "procType"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:134:1: procType returns [MJType pt] : (t= type | 'void' );
    public final MJType procType() throws RecognitionException {
        MJType pt = null;


        MJType t =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:135:3: (t= type | 'void' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENT||LA14_0==33||LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==47) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:135:5: t= type
                    {
                    pushFollow(FOLLOW_type_in_procType833);
                    t=type();

                    state._fsp--;


                     pt = t; 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:137:5: 'void'
                    {
                    match(input,47,FOLLOW_47_in_procType843); 

                     pt = MJType.getVoidType(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return pt;
    }
    // $ANTLR end "procType"



    // $ANTLR start "statement"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:141:1: statement returns [MJStatement s] : (c= comment |b= block | 'if' '(' e= expression ')' ib= block ( 'else' eb= block )? | 'while' '(' e= expression ')' doblock= statement |va= id '=' ea= expression ';' |i= id '[' e= expression ']' '=' ex= expression ';' | 'System.out.println' '(' ep= expression ')' ';' | 'System.out.print' '(' ep= expression ')' ';' |ident= id '(' (onepara= expression ( ',' nextpara= expression )* )? ')' ';' );
    public final MJStatement statement() throws RecognitionException {
        MJStatement s = null;


        MJComment c =null;

        MJBlock b =null;

        MJExpression e =null;

        MJBlock ib =null;

        MJBlock eb =null;

        MJStatement doblock =null;

        MJIdentifier va =null;

        MJExpression ea =null;

        MJIdentifier i =null;

        MJExpression ex =null;

        MJExpression ep =null;

        MJIdentifier ident =null;

        MJExpression onepara =null;

        MJExpression nextpara =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:142:3: (c= comment |b= block | 'if' '(' e= expression ')' ib= block ( 'else' eb= block )? | 'while' '(' e= expression ')' doblock= statement |va= id '=' ea= expression ';' |i= id '[' e= expression ']' '=' ex= expression ';' | 'System.out.println' '(' ep= expression ')' ';' | 'System.out.print' '(' ep= expression ')' ';' |ident= id '(' (onepara= expression ( ',' nextpara= expression )* )? ')' ';' )
            int alt18=9;
            switch ( input.LA(1) ) {
            case COMMENT:
                {
                alt18=1;
                }
                break;
            case 49:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 48:
                {
                alt18=4;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt18=5;
                    }
                    break;
                case 23:
                    {
                    int LA18_10 = input.LA(3);

                    if ( (LA18_10==IDENT) ) {
                        switch ( input.LA(4) ) {
                        case 26:
                            {
                            alt18=5;
                            }
                            break;
                        case 31:
                            {
                            alt18=6;
                            }
                            break;
                        case 17:
                            {
                            alt18=9;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 13, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                case 31:
                    {
                    alt18=6;
                    }
                    break;
                case 17:
                    {
                    alt18=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 5, input);

                    throw nvae;

                }

                }
                break;
            case 45:
                {
                int LA18_6 = input.LA(2);

                if ( (LA18_6==23) ) {
                    int LA18_10 = input.LA(3);

                    if ( (LA18_10==IDENT) ) {
                        switch ( input.LA(4) ) {
                        case 26:
                            {
                            alt18=5;
                            }
                            break;
                        case 31:
                            {
                            alt18=6;
                            }
                            break;
                        case 17:
                            {
                            alt18=9;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 13, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 10, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;

                }
                }
                break;
            case 30:
                {
                alt18=7;
                }
                break;
            case 29:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:142:5: c= comment
                    {
                    pushFollow(FOLLOW_comment_in_statement870);
                    c=comment();

                    state._fsp--;


                     s = c; 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:144:5: b= block
                    {
                    pushFollow(FOLLOW_block_in_statement886);
                    b=block();

                    state._fsp--;


                     s = b; 

                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:146:5: 'if' '(' e= expression ')' ib= block ( 'else' eb= block )?
                    {
                    match(input,38,FOLLOW_38_in_statement898); 

                    match(input,17,FOLLOW_17_in_statement900); 

                    pushFollow(FOLLOW_expression_in_statement906);
                    e=expression();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_statement908); 

                    pushFollow(FOLLOW_block_in_statement914);
                    ib=block();

                    state._fsp--;


                     s = new MJIfElse(e, ib); 

                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:146:73: ( 'else' eb= block )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==35) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:146:74: 'else' eb= block
                            {
                            match(input,35,FOLLOW_35_in_statement919); 

                            pushFollow(FOLLOW_block_in_statement925);
                            eb=block();

                            state._fsp--;


                             s = new MJIfElse(e, ib, eb); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:147:5: 'while' '(' e= expression ')' doblock= statement
                    {
                    match(input,48,FOLLOW_48_in_statement936); 

                    match(input,17,FOLLOW_17_in_statement938); 

                    pushFollow(FOLLOW_expression_in_statement944);
                    e=expression();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_statement946); 

                    pushFollow(FOLLOW_statement_in_statement952);
                    doblock=statement();

                    state._fsp--;


                     s = new MJWhile(e, doblock); 

                    }
                    break;
                case 5 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:149:5: va= id '=' ea= expression ';'
                    {
                    pushFollow(FOLLOW_id_in_statement968);
                    va=id();

                    state._fsp--;


                    match(input,26,FOLLOW_26_in_statement970); 

                    pushFollow(FOLLOW_expression_in_statement976);
                    ea=expression();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_statement978); 

                     s = new MJAssign(va, ea); 

                    }
                    break;
                case 6 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:151:5: i= id '[' e= expression ']' '=' ex= expression ';'
                    {
                    pushFollow(FOLLOW_id_in_statement992);
                    i=id();

                    state._fsp--;


                    match(input,31,FOLLOW_31_in_statement994); 

                    pushFollow(FOLLOW_expression_in_statement1000);
                    e=expression();

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_statement1002); 

                    match(input,26,FOLLOW_26_in_statement1004); 

                    pushFollow(FOLLOW_expression_in_statement1010);
                    ex=expression();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_statement1012); 

                     s = new MJAssign(new MJArray(i, e), ex); 

                    }
                    break;
                case 7 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:153:5: 'System.out.println' '(' ep= expression ')' ';'
                    {
                    match(input,30,FOLLOW_30_in_statement1025); 

                    match(input,17,FOLLOW_17_in_statement1027); 

                    pushFollow(FOLLOW_expression_in_statement1033);
                    ep=expression();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_statement1035); 

                    match(input,24,FOLLOW_24_in_statement1037); 

                     s = new MJPrintln(ep); 

                    }
                    break;
                case 8 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:155:5: 'System.out.print' '(' ep= expression ')' ';'
                    {
                    match(input,29,FOLLOW_29_in_statement1049); 

                    match(input,17,FOLLOW_17_in_statement1051); 

                    pushFollow(FOLLOW_expression_in_statement1057);
                    ep=expression();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_statement1059); 

                    match(input,24,FOLLOW_24_in_statement1061); 

                     s = new MJPrint(ep); 

                    }
                    break;
                case 9 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:157:5: ident= id '(' (onepara= expression ( ',' nextpara= expression )* )? ')' ';'
                    {
                    LinkedList<MJExpression> hej = new LinkedList<MJExpression>(); 

                    pushFollow(FOLLOW_id_in_statement1082);
                    ident=id();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_statement1084); 

                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:158:18: (onepara= expression ( ',' nextpara= expression )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0 >= IDENT && LA17_0 <= INT)||LA17_0==STRING||LA17_0==15||LA17_0==17||LA17_0==22||LA17_0==37||(LA17_0 >= 40 && LA17_0 <= 41)||(LA17_0 >= 45 && LA17_0 <= 46)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:158:20: onepara= expression ( ',' nextpara= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_statement1091);
                            onepara=expression();

                            state._fsp--;


                            hej.add(onepara);

                            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:158:61: ( ',' nextpara= expression )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==21) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:158:62: ',' nextpara= expression
                            	    {
                            	    match(input,21,FOLLOW_21_in_statement1096); 

                            	    pushFollow(FOLLOW_expression_in_statement1102);
                            	    nextpara=expression();

                            	    state._fsp--;


                            	    hej.add(nextpara);

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,18,FOLLOW_18_in_statement1109); 

                    match(input,24,FOLLOW_24_in_statement1111); 

                    s = new MJMethodCallStmt(ident, hej); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "statement"



    // $ANTLR start "comment"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:162:1: comment returns [MJComment c] : COMMENT ;
    public final MJComment comment() throws RecognitionException {
        MJComment c = null;


        Token COMMENT2=null;

        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:163:3: ( COMMENT )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:163:5: COMMENT
            {
            COMMENT2=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment1136); 

             c = new MJComment((COMMENT2!=null?COMMENT2.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "comment"



    // $ANTLR start "expression"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:167:1: expression returns [MJExpression res] : arg1= level1 ( '&&' arg2= level1 )* ;
    public final MJExpression expression() throws RecognitionException {
        MJExpression res = null;


        MJExpression arg1 =null;

        MJExpression arg2 =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:168:3: (arg1= level1 ( '&&' arg2= level1 )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:168:5: arg1= level1 ( '&&' arg2= level1 )*
            {
            pushFollow(FOLLOW_level1_in_expression1166);
            arg1=level1();

            state._fsp--;


             res = arg1; 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:170:5: ( '&&' arg2= level1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:170:7: '&&' arg2= level1
            	    {
            	    match(input,16,FOLLOW_16_in_expression1181); 

            	    pushFollow(FOLLOW_level1_in_expression1187);
            	    arg2=level1();

            	    state._fsp--;


            	     MJAnd op = new MJAnd( res, arg2);
            	            res = op;
            	          

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return res;
    }
    // $ANTLR end "expression"



    // $ANTLR start "level1"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:177:1: level1 returns [MJExpression res] : arg1= level2 ( '==' arg2= level2 )* ;
    public final MJExpression level1() throws RecognitionException {
        MJExpression res = null;


        MJExpression arg1 =null;

        MJExpression arg2 =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:178:3: (arg1= level2 ( '==' arg2= level2 )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:178:5: arg1= level2 ( '==' arg2= level2 )*
            {
            pushFollow(FOLLOW_level2_in_level11224);
            arg1=level2();

            state._fsp--;


              res = arg1; 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:180:5: ( '==' arg2= level2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:180:7: '==' arg2= level2
            	    {
            	    match(input,27,FOLLOW_27_in_level11238); 

            	    pushFollow(FOLLOW_level2_in_level11244);
            	    arg2=level2();

            	    state._fsp--;


            	     MJEqual opeq = new MJEqual( res, arg2); 
            	            res = opeq;
            	          

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return res;
    }
    // $ANTLR end "level1"



    // $ANTLR start "level2"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:187:1: level2 returns [MJExpression res] : arg1= level3 ( '<' arg2= level3 )* ;
    public final MJExpression level2() throws RecognitionException {
        MJExpression res = null;


        MJExpression arg1 =null;

        MJExpression arg2 =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:188:3: (arg1= level3 ( '<' arg2= level3 )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:188:5: arg1= level3 ( '<' arg2= level3 )*
            {
            pushFollow(FOLLOW_level3_in_level21283);
            arg1=level3();

            state._fsp--;


              res = arg1; 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:190:4: ( '<' arg2= level3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:190:6: '<' arg2= level3
            	    {
            	    match(input,25,FOLLOW_25_in_level21295); 

            	    pushFollow(FOLLOW_level3_in_level21301);
            	    arg2=level3();

            	    state._fsp--;


            	     MJLess opless = new MJLess( res, arg2);
            	         	res = opless;
            	         

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return res;
    }
    // $ANTLR end "level2"



    // $ANTLR start "level3"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:197:1: level3 returns [MJExpression res] : arg1= level4 ( ( '+' | '-' ) arg2= level4 )* ;
    public final MJExpression level3() throws RecognitionException {
        MJExpression res = null;


        MJExpression arg1 =null;

        MJExpression arg2 =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:198:3: (arg1= level4 ( ( '+' | '-' ) arg2= level4 )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:198:5: arg1= level4 ( ( '+' | '-' ) arg2= level4 )*
            {
            pushFollow(FOLLOW_level4_in_level31339);
            arg1=level4();

            state._fsp--;


              res = arg1; 
                   MJBinaryOp opbin = null; 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:201:5: ( ( '+' | '-' ) arg2= level4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20||LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:202:7: ( '+' | '-' ) arg2= level4
            	    {
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:202:7: ( '+' | '-' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==20) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==22) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:202:9: '+'
            	            {
            	            match(input,20,FOLLOW_20_in_level31362); 

            	             opbin = new MJPlus(res); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:202:44: '-'
            	            {
            	            match(input,22,FOLLOW_22_in_level31368); 

            	             opbin = new MJMinus(res);

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_level4_in_level31385);
            	    arg2=level4();

            	    state._fsp--;


            	     opbin.setRhs(arg2);
            	            res = opbin;
            	          

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return res;
    }
    // $ANTLR end "level3"



    // $ANTLR start "level4"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:210:1: level4 returns [MJExpression res] : arg1= level5 ( '*' arg2= level5 )* ;
    public final MJExpression level4() throws RecognitionException {
        MJExpression res = null;


        MJExpression arg1 =null;

        MJExpression arg2 =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:211:3: (arg1= level5 ( '*' arg2= level5 )* )
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:211:5: arg1= level5 ( '*' arg2= level5 )*
            {
            pushFollow(FOLLOW_level5_in_level41422);
            arg1=level5();

            state._fsp--;


              res = arg1; 

            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:213:5: ( '*' arg2= level5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:213:7: '*' arg2= level5
            	    {
            	    match(input,19,FOLLOW_19_in_level41434); 

            	    pushFollow(FOLLOW_level5_in_level41440);
            	    arg2=level5();

            	    state._fsp--;


            	     MJMult op = new MJMult( res, arg2); 
            	            res = op;
            	          

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return res;
    }
    // $ANTLR end "level4"



    // $ANTLR start "level5"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:220:1: level5 returns [MJExpression res] : ( '-' l= level5 | '!' l= level5 | 'new int' '[' exp= expression ']' | 'new' IDENT '(' ')' |i= id |i= id '[' e= expression ']' |i= id '(' (e1= expression ( ',' e2= expression )* )? ')' | '(' e= expression ')' | 'true' | 'false' | INT | STRING );
    public final MJExpression level5() throws RecognitionException {
        MJExpression res = null;


        Token IDENT3=null;
        Token INT4=null;
        Token STRING5=null;
        MJExpression l =null;

        MJExpression exp =null;

        MJIdentifier i =null;

        MJExpression e =null;

        MJExpression e1 =null;

        MJExpression e2 =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:221:3: ( '-' l= level5 | '!' l= level5 | 'new int' '[' exp= expression ']' | 'new' IDENT '(' ')' |i= id |i= id '[' e= expression ']' |i= id '(' (e1= expression ( ',' e2= expression )* )? ')' | '(' e= expression ')' | 'true' | 'false' | INT | STRING )
            int alt27=12;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt27=1;
                }
                break;
            case 15:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            case 41:
                {
                alt27=4;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case 16:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 24:
                case 25:
                case 27:
                case 32:
                    {
                    alt27=5;
                    }
                    break;
                case 23:
                    {
                    int LA27_13 = input.LA(3);

                    if ( (LA27_13==IDENT) ) {
                        switch ( input.LA(4) ) {
                        case 16:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 24:
                        case 25:
                        case 27:
                        case 32:
                            {
                            alt27=5;
                            }
                            break;
                        case 31:
                            {
                            alt27=6;
                            }
                            break;
                        case 17:
                            {
                            alt27=7;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 16, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case 31:
                    {
                    alt27=6;
                    }
                    break;
                case 17:
                    {
                    alt27=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 5, input);

                    throw nvae;

                }

                }
                break;
            case 45:
                {
                int LA27_6 = input.LA(2);

                if ( (LA27_6==23) ) {
                    int LA27_13 = input.LA(3);

                    if ( (LA27_13==IDENT) ) {
                        switch ( input.LA(4) ) {
                        case 16:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 24:
                        case 25:
                        case 27:
                        case 32:
                            {
                            alt27=5;
                            }
                            break;
                        case 31:
                            {
                            alt27=6;
                            }
                            break;
                        case 17:
                            {
                            alt27=7;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 16, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 13, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 6, input);

                    throw nvae;

                }
                }
                break;
            case 17:
                {
                alt27=8;
                }
                break;
            case 46:
                {
                alt27=9;
                }
                break;
            case 37:
                {
                alt27=10;
                }
                break;
            case INT:
                {
                alt27=11;
                }
                break;
            case STRING:
                {
                alt27=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:221:5: '-' l= level5
                    {
                    match(input,22,FOLLOW_22_in_level51475); 

                    pushFollow(FOLLOW_level5_in_level51482);
                    l=level5();

                    state._fsp--;


                     res = new MJUnaryMinus(l); 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:223:5: '!' l= level5
                    {
                    match(input,15,FOLLOW_15_in_level51494); 

                    pushFollow(FOLLOW_level5_in_level51500);
                    l=level5();

                    state._fsp--;


                     res = new MJNegate(l);

                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:225:5: 'new int' '[' exp= expression ']'
                    {
                    match(input,40,FOLLOW_40_in_level51512); 

                    match(input,31,FOLLOW_31_in_level51514); 

                    pushFollow(FOLLOW_expression_in_level51520);
                    exp=expression();

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_level51522); 

                     res = new MJNewArray(exp); 

                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:227:5: 'new' IDENT '(' ')'
                    {
                    match(input,41,FOLLOW_41_in_level51534); 

                    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_level51536); 

                    match(input,17,FOLLOW_17_in_level51538); 

                    match(input,18,FOLLOW_18_in_level51540); 

                     res = new MJNew((IDENT3!=null?IDENT3.getText():null)); 

                    }
                    break;
                case 5 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:229:5: i= id
                    {
                    pushFollow(FOLLOW_id_in_level51556);
                    i=id();

                    state._fsp--;


                     res = i; 

                    }
                    break;
                case 6 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:231:5: i= id '[' e= expression ']'
                    {
                    pushFollow(FOLLOW_id_in_level51572);
                    i=id();

                    state._fsp--;


                    match(input,31,FOLLOW_31_in_level51574); 

                    pushFollow(FOLLOW_expression_in_level51580);
                    e=expression();

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_level51582); 

                     res = new MJArray(i, e); 

                    }
                    break;
                case 7 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:233:5: i= id '(' (e1= expression ( ',' e2= expression )* )? ')'
                    {
                    LinkedList<MJExpression> exprList = new LinkedList<MJExpression>(); 

                    pushFollow(FOLLOW_id_in_level51602);
                    i=id();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_level51604); 

                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:234:13: (e1= expression ( ',' e2= expression )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0 >= IDENT && LA26_0 <= INT)||LA26_0==STRING||LA26_0==15||LA26_0==17||LA26_0==22||LA26_0==37||(LA26_0 >= 40 && LA26_0 <= 41)||(LA26_0 >= 45 && LA26_0 <= 46)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:234:15: e1= expression ( ',' e2= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_level51611);
                            e1=expression();

                            state._fsp--;


                            exprList.add(e1);

                            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:234:50: ( ',' e2= expression )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==21) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:234:51: ',' e2= expression
                            	    {
                            	    match(input,21,FOLLOW_21_in_level51615); 

                            	    pushFollow(FOLLOW_expression_in_level51621);
                            	    e2=expression();

                            	    state._fsp--;


                            	    exprList.add(e2);

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,18,FOLLOW_18_in_level51629); 

                    res = new MJMethodCallExpr(i, exprList); 

                    }
                    break;
                case 8 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:236:5: '(' e= expression ')'
                    {
                    match(input,17,FOLLOW_17_in_level51641); 

                    pushFollow(FOLLOW_expression_in_level51647);
                    e=expression();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_level51649); 

                     res = new MJParentheses(e); 

                    }
                    break;
                case 9 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:238:5: 'true'
                    {
                    match(input,46,FOLLOW_46_in_level51661); 

                     res = MJBoolean.True; 

                    }
                    break;
                case 10 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:240:5: 'false'
                    {
                    match(input,37,FOLLOW_37_in_level51674); 

                     res = MJBoolean.False; 

                    }
                    break;
                case 11 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:242:5: INT
                    {
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_level51687); 

                     res = new MJInteger((INT4!=null?INT4.getText():null)); 

                    }
                    break;
                case 12 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:244:5: STRING
                    {
                    STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_level51700); 

                     res = new MJString((STRING5!=null?STRING5.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return res;
    }
    // $ANTLR end "level5"



    // $ANTLR start "id"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:250:3: id returns [MJIdentifier e] : ( IDENT |t= thisid '.' IDENT );
    public final MJIdentifier id() throws RecognitionException {
        MJIdentifier e = null;


        Token IDENT6=null;
        Token IDENT7=null;
        MJIdentifier t =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:251:3: ( IDENT |t= thisid '.' IDENT )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENT) ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1 >= 16 && LA28_1 <= 22)||(LA28_1 >= 24 && LA28_1 <= 27)||(LA28_1 >= 31 && LA28_1 <= 32)) ) {
                    alt28=1;
                }
                else if ( (LA28_1==23) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA28_0==45) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:251:5: IDENT
                    {
                    IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_id1734); 

                     e = new MJIdentifier((IDENT6!=null?IDENT6.getText():null));

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:253:5: t= thisid '.' IDENT
                    {
                    pushFollow(FOLLOW_thisid_in_id1750);
                    t=thisid();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_id1752); 

                    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_id1754); 

                     
                          MJIdentifier i = new MJIdentifier((IDENT7!=null?IDENT7.getText():null));
                          e = new MJSelector(t,i);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "id"



    // $ANTLR start "thisid"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:260:1: thisid returns [MJIdentifier e] : ( 'this' | IDENT );
    public final MJIdentifier thisid() throws RecognitionException {
        MJIdentifier e = null;


        Token IDENT8=null;

        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:261:3: ( 'this' | IDENT )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            else if ( (LA29_0==IDENT) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:261:5: 'this'
                    {
                    match(input,45,FOLLOW_45_in_thisid1777); 

                     e= new MJIdentifier("this"); 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:263:5: IDENT
                    {
                    IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_thisid1790); 

                     e = new MJIdentifier((IDENT8!=null?IDENT8.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "thisid"



    // $ANTLR start "optExpression"
    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:267:1: optExpression returns [MJExpression e] : (ex= expression |);
    public final MJExpression optExpression() throws RecognitionException {
        MJExpression e = null;


        MJExpression ex =null;


        try {
            // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:268:3: (ex= expression |)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0 >= IDENT && LA30_0 <= INT)||LA30_0==STRING||LA30_0==15||LA30_0==17||LA30_0==22||LA30_0==37||(LA30_0 >= 40 && LA30_0 <= 41)||(LA30_0 >= 45 && LA30_0 <= 46)) ) {
                alt30=1;
            }
            else if ( (LA30_0==24) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:268:5: ex= expression
                    {
                    pushFollow(FOLLOW_expression_in_optExpression1819);
                    ex=expression();

                    state._fsp--;


                     e = ex; 

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\DTU\\Compilerteknik\\projekt\\MiniJava.g:271:5: 
                    {
                     e = new MJNoExpression(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "optExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_mainClass_in_program52 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_classDeclaration_in_program74 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_classDeclaration126 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration132 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_36_in_classDeclaration136 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration142 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_classDeclaration153 = new BitSet(new long[]{0x0004948200000040L});
    public static final BitSet FOLLOW_varDeclaration_in_classDeclaration161 = new BitSet(new long[]{0x0004948200000040L});
    public static final BitSet FOLLOW_methodDeclaration_in_classDeclaration202 = new BitSet(new long[]{0x0004948200000040L});
    public static final BitSet FOLLOW_50_in_classDeclaration233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_mainClass256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_mainClass262 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_mainClass269 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_mainClass278 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_mainClass280 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_mainClass282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_mainClass288 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_mainClass290 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_mainClass292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_mainClass298 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_mainClass300 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_mainClass306 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_mainClass312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_block343 = new BitSet(new long[]{0x000720C260000060L});
    public static final BitSet FOLLOW_varDeclaration_in_block351 = new BitSet(new long[]{0x000720C260000060L});
    public static final BitSet FOLLOW_statement_in_block392 = new BitSet(new long[]{0x0007204060000060L});
    public static final BitSet FOLLOW_50_in_block422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration459 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_varDeclaration465 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_varDeclaration467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_type491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_methodDeclaration548 = new BitSet(new long[]{0x0000908200000040L});
    public static final BitSet FOLLOW_44_in_methodDeclaration561 = new BitSet(new long[]{0x0000808200000040L});
    public static final BitSet FOLLOW_procType_in_methodDeclaration576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclaration582 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_methodDeclaration589 = new BitSet(new long[]{0x0000008200040040L});
    public static final BitSet FOLLOW_type_in_methodDeclaration604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclaration610 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_methodDeclaration633 = new BitSet(new long[]{0x0000008200000040L});
    public static final BitSet FOLLOW_type_in_methodDeclaration639 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclaration645 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_methodDeclaration686 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_methodDeclaration693 = new BitSet(new long[]{0x000328C260000060L});
    public static final BitSet FOLLOW_varDeclaration_in_methodDeclaration701 = new BitSet(new long[]{0x000328C260000060L});
    public static final BitSet FOLLOW_statement_in_methodDeclaration742 = new BitSet(new long[]{0x0003284060000060L});
    public static final BitSet FOLLOW_43_in_methodDeclaration776 = new BitSet(new long[]{0x00006320014290C0L});
    public static final BitSet FOLLOW_optExpression_in_methodDeclaration782 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_methodDeclaration784 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_methodDeclaration800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_procType833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_procType843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_statement870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_statement898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement900 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement908 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_statement914 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statement919 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_statement925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_statement936 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement938 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement944 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement946 = new BitSet(new long[]{0x0003204060000060L});
    public static final BitSet FOLLOW_statement_in_statement952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_statement968 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement970 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement976 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_statement992 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement994 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement1000 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement1002 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement1004 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement1010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_statement1025 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement1027 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement1033 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement1035 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_statement1049 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement1051 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement1057 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement1059 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_statement1082 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement1084 = new BitSet(new long[]{0x00006320004690C0L});
    public static final BitSet FOLLOW_expression_in_statement1091 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_statement1096 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_statement1102 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_statement1109 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_comment1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_level1_in_expression1166 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_expression1181 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level1_in_expression1187 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_level2_in_level11224 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_level11238 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level2_in_level11244 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_level3_in_level21283 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_level21295 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level3_in_level21301 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_level4_in_level31339 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_level31362 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_22_in_level31368 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level4_in_level31385 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_level5_in_level41422 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_level41434 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level5_in_level41440 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_22_in_level51475 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level5_in_level51482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_level51494 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_level5_in_level51500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_level51512 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_level51514 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_level51520 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_level51522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_level51534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_level51536 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_level51538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_level51540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_level51556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_level51572 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_level51574 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_level51580 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_level51582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_level51602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_level51604 = new BitSet(new long[]{0x00006320004690C0L});
    public static final BitSet FOLLOW_expression_in_level51611 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_level51615 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_level51621 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_level51629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_level51641 = new BitSet(new long[]{0x00006320004290C0L});
    public static final BitSet FOLLOW_expression_in_level51647 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_level51649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_level51661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_level51674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_level51687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_level51700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_id1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thisid_in_id1750 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_id1752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_id1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_thisid1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_thisid1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_optExpression1819 = new BitSet(new long[]{0x0000000000000002L});

}