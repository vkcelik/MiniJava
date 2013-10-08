// $ANTLR 3.5 /Users/probst/Desktop/02332/MiniJava.g 2013-09-24 10:50:07

  package compiler.Frontend;
  
  import java.util.LinkedList;
  import compiler.IR.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MiniJavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "IDENT", "INT", 
		"LOWER", "NEWLINE", "NONNULL", "NUMBER", "STRING", "UPPER", "WHITESPACE", 
		"'!'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "';'", 
		"'<'", "'='", "'=='", "'String[]'", "'System.out.print'", "'System.out.println'", 
		"'['", "']'", "'boolean'", "'class'", "'else'", "'extends'", "'false'", 
		"'if'", "'int'", "'new'", "'public'", "'return'", "'static'", "'super'", 
		"'this'", "'true'", "'void'", "'while'", "'{'", "'}'"
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

	@Override public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/probst/Desktop/02332/MiniJava.g"; }





	// $ANTLR start "program"
	// /Users/probst/Desktop/02332/MiniJava.g:17:1: program returns [MJProgram p] :mc= mainClass (cd= classDeclaration )* ;
	public final MJProgram program() throws RecognitionException {
		MJProgram p = null;


		MJClass mc =null;
		MJClass cd =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:18:3: (mc= mainClass (cd= classDeclaration )* )
			// /Users/probst/Desktop/02332/MiniJava.g:18:5: mc= mainClass (cd= classDeclaration )*
			{
			 LinkedList<MJClass> cdl = new LinkedList<MJClass>(); 
			pushFollow(FOLLOW_mainClass_in_program52);
			mc=mainClass();
			state._fsp--;

			 cdl.add(mc); 
			// /Users/probst/Desktop/02332/MiniJava.g:21:7: (cd= classDeclaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==34) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:21:9: cd= classDeclaration
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
			}

			 
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
	// /Users/probst/Desktop/02332/MiniJava.g:29:1: classDeclaration returns [MJClass c] : 'class' cname= IDENT ( 'extends' scname= IDENT )? '{' (vd= varDeclaration )* (md= methodDeclaration )* '}' ;
	public final MJClass classDeclaration() throws RecognitionException {
		MJClass c = null;


		Token cname=null;
		Token scname=null;
		MJVariable vd =null;
		MJMethod md =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:30:3: ( 'class' cname= IDENT ( 'extends' scname= IDENT )? '{' (vd= varDeclaration )* (md= methodDeclaration )* '}' )
			// /Users/probst/Desktop/02332/MiniJava.g:30:5: 'class' cname= IDENT ( 'extends' scname= IDENT )? '{' (vd= varDeclaration )* (md= methodDeclaration )* '}'
			{
			 String superClass = "Object"; 
			      LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
			      LinkedList<MJMethod> mdl = new LinkedList<MJMethod>();
			    
			match(input,34,FOLLOW_34_in_classDeclaration126); 
			cname=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDeclaration132); 
			// /Users/probst/Desktop/02332/MiniJava.g:34:27: ( 'extends' scname= IDENT )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==36) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:34:29: 'extends' scname= IDENT
					{
					match(input,36,FOLLOW_36_in_classDeclaration136); 
					scname=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDeclaration142); 
					 superClass = (scname!=null?scname.getText():null); 
					}
					break;

			}

			match(input,49,FOLLOW_49_in_classDeclaration153); 
			// /Users/probst/Desktop/02332/MiniJava.g:35:9: (vd= varDeclaration )*
			loop3:
			while (true) {
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
					if ( (LA3_3==31) ) {
						int LA3_6 = input.LA(3);
						if ( (LA3_6==32) ) {
							int LA3_8 = input.LA(4);
							if ( (LA3_8==IDENT) ) {
								int LA3_5 = input.LA(5);
								if ( (LA3_5==24) ) {
									alt3=1;
								}

							}

						}

					}
					else if ( (LA3_3==IDENT) ) {
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
					// /Users/probst/Desktop/02332/MiniJava.g:35:11: vd= varDeclaration
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
			}

			// /Users/probst/Desktop/02332/MiniJava.g:40:9: (md= methodDeclaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==IDENT||LA4_0==33||LA4_0==39||LA4_0==41||LA4_0==43||LA4_0==47) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:40:11: md= methodDeclaration
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
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:50:1: mainClass returns [MJClass c] : 'class' cname= IDENT '{' 'public' 'static' 'void' name= IDENT '(' 'String[]' parname= IDENT ')' b= block '}' ;
	public final MJClass mainClass() throws RecognitionException {
		MJClass c = null;


		Token cname=null;
		Token name=null;
		Token parname=null;
		MJBlock b =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:51:3: ( 'class' cname= IDENT '{' 'public' 'static' 'void' name= IDENT '(' 'String[]' parname= IDENT ')' b= block '}' )
			// /Users/probst/Desktop/02332/MiniJava.g:51:5: 'class' cname= IDENT '{' 'public' 'static' 'void' name= IDENT '(' 'String[]' parname= IDENT ')' b= block '}'
			{
			match(input,34,FOLLOW_34_in_mainClass256); 
			cname=(Token)match(input,IDENT,FOLLOW_IDENT_in_mainClass262); 
			match(input,49,FOLLOW_49_in_mainClass269); 
			match(input,41,FOLLOW_41_in_mainClass278); 
			match(input,43,FOLLOW_43_in_mainClass280); 
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
	// /Users/probst/Desktop/02332/MiniJava.g:66:1: block returns [MJBlock b] : '{' (vd= varDeclaration )* (sd= statement )* '}' ;
	public final MJBlock block() throws RecognitionException {
		MJBlock b = null;


		MJVariable vd =null;
		MJStatement sd =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:67:3: ( '{' (vd= varDeclaration )* (sd= statement )* '}' )
			// /Users/probst/Desktop/02332/MiniJava.g:67:5: '{' (vd= varDeclaration )* (sd= statement )* '}'
			{
			  LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
			       LinkedList<MJStatement> sdl = new LinkedList<MJStatement>();    
			    
			match(input,49,FOLLOW_49_in_block343); 
			// /Users/probst/Desktop/02332/MiniJava.g:70:9: (vd= varDeclaration )*
			loop5:
			while (true) {
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
					// /Users/probst/Desktop/02332/MiniJava.g:70:11: vd= varDeclaration
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
			}

			// /Users/probst/Desktop/02332/MiniJava.g:73:9: (sd= statement )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= COMMENT && LA6_0 <= IDENT)||(LA6_0 >= 29 && LA6_0 <= 30)||LA6_0==38||(LA6_0 >= 44 && LA6_0 <= 45)||(LA6_0 >= 48 && LA6_0 <= 49)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:73:11: sd= statement
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
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:82:1: varDeclaration returns [MJVariable vd] :t= type n= IDENT ';' ;
	public final MJVariable varDeclaration() throws RecognitionException {
		MJVariable vd = null;


		Token n=null;
		MJType t =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:83:3: (t= type n= IDENT ';' )
			// /Users/probst/Desktop/02332/MiniJava.g:83:5: t= type n= IDENT ';'
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
	// /Users/probst/Desktop/02332/MiniJava.g:89:1: type returns [MJType t] : ( 'boolean' | 'int' ( '[' ']' )? | IDENT );
	public final MJType type() throws RecognitionException {
		MJType t = null;


		Token IDENT1=null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:90:3: ( 'boolean' | 'int' ( '[' ']' )? | IDENT )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 33:
				{
				alt8=1;
				}
				break;
			case 39:
				{
				alt8=2;
				}
				break;
			case IDENT:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:90:5: 'boolean'
					{
					match(input,33,FOLLOW_33_in_type491); 
					 t = MJType.getBooleanType();; 
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:92:5: 'int' ( '[' ']' )?
					{
					match(input,39,FOLLOW_39_in_type503); 
					 t = MJType.getIntType();; 
					// /Users/probst/Desktop/02332/MiniJava.g:94:5: ( '[' ']' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==31) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:94:7: '[' ']'
							{
							match(input,31,FOLLOW_31_in_type518); 
							match(input,32,FOLLOW_32_in_type520); 
							 t = MJType.getArrayType(MJType.getIntType()); 
							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/probst/Desktop/02332/MiniJava.g:97:5: IDENT
					{
					IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_type542); 
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
	// /Users/probst/Desktop/02332/MiniJava.g:101:1: methodDeclaration returns [MJMethod md] : ( 'public' )? ( 'static' )? mtype= procType mname= IDENT '(' (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )? ')' '{' (vd= varDeclaration )* (sd= statement )* 'return' retExp= optExpression ';' '}' ;
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
			// /Users/probst/Desktop/02332/MiniJava.g:102:3: ( ( 'public' )? ( 'static' )? mtype= procType mname= IDENT '(' (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )? ')' '{' (vd= varDeclaration )* (sd= statement )* 'return' retExp= optExpression ';' '}' )
			// /Users/probst/Desktop/02332/MiniJava.g:102:5: ( 'public' )? ( 'static' )? mtype= procType mname= IDENT '(' (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )? ')' '{' (vd= varDeclaration )* (sd= statement )* 'return' retExp= optExpression ';' '}'
			{
			 LinkedList<MJVariable> parlist = new LinkedList<MJVariable>(); 
			      boolean isStatic = false;
			      boolean isPublic = false;
			      LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
			      LinkedList<MJStatement> sdl = new LinkedList<MJStatement>();    
			    
			// /Users/probst/Desktop/02332/MiniJava.g:108:5: ( 'public' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==41) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:108:7: 'public'
					{
					match(input,41,FOLLOW_41_in_methodDeclaration574); 
					 isPublic = true; 
					}
					break;

			}

			// /Users/probst/Desktop/02332/MiniJava.g:109:5: ( 'static' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==43) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:109:7: 'static'
					{
					match(input,43,FOLLOW_43_in_methodDeclaration587); 
					 isStatic = true; 
					}
					break;

			}

			pushFollow(FOLLOW_procType_in_methodDeclaration602);
			mtype=procType();
			state._fsp--;

			mname=(Token)match(input,IDENT,FOLLOW_IDENT_in_methodDeclaration608); 
			match(input,17,FOLLOW_17_in_methodDeclaration615); 
			// /Users/probst/Desktop/02332/MiniJava.g:112:7: (t1= type n1= IDENT ( ',' t2= type n2= IDENT )* )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENT||LA12_0==33||LA12_0==39) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:112:9: t1= type n1= IDENT ( ',' t2= type n2= IDENT )*
					{
					pushFollow(FOLLOW_type_in_methodDeclaration630);
					t1=type();
					state._fsp--;

					n1=(Token)match(input,IDENT,FOLLOW_IDENT_in_methodDeclaration636); 
					 parlist.add(new MJVariable(t1,(n1!=null?n1.getText():null))); 
					// /Users/probst/Desktop/02332/MiniJava.g:114:9: ( ',' t2= type n2= IDENT )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==21) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:114:11: ',' t2= type n2= IDENT
							{
							match(input,21,FOLLOW_21_in_methodDeclaration659); 
							pushFollow(FOLLOW_type_in_methodDeclaration665);
							t2=type();
							state._fsp--;

							n2=(Token)match(input,IDENT,FOLLOW_IDENT_in_methodDeclaration671); 
							 parlist.add(new MJVariable(t2,(n2!=null?n2.getText():null))); 
							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;

			}

			match(input,18,FOLLOW_18_in_methodDeclaration712); 
			match(input,49,FOLLOW_49_in_methodDeclaration719); 
			// /Users/probst/Desktop/02332/MiniJava.g:119:9: (vd= varDeclaration )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==IDENT) ) {
					int LA13_2 = input.LA(2);
					if ( (LA13_2==IDENT) ) {
						alt13=1;
					}

				}
				else if ( (LA13_0==33||LA13_0==39) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:119:11: vd= varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_methodDeclaration727);
					vd=varDeclaration();
					state._fsp--;

					 vdl.add(vd); 
					}
					break;

				default :
					break loop13;
				}
			}

			// /Users/probst/Desktop/02332/MiniJava.g:122:9: (sd= statement )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= COMMENT && LA14_0 <= IDENT)||(LA14_0 >= 29 && LA14_0 <= 30)||LA14_0==38||(LA14_0 >= 44 && LA14_0 <= 45)||(LA14_0 >= 48 && LA14_0 <= 49)) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:122:11: sd= statement
					{
					pushFollow(FOLLOW_statement_in_methodDeclaration768);
					sd=statement();
					state._fsp--;

					 sdl.add(sd); 
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,42,FOLLOW_42_in_methodDeclaration802); 
			pushFollow(FOLLOW_optExpression_in_methodDeclaration808);
			retExp=optExpression();
			state._fsp--;

			match(input,24,FOLLOW_24_in_methodDeclaration810); 
			 
			          MJReturn r = new MJReturn(retExp);
			          sdl.add(r);
			        
			match(input,50,FOLLOW_50_in_methodDeclaration826); 

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
	// /Users/probst/Desktop/02332/MiniJava.g:137:1: procType returns [MJType pt] : (t= type | 'void' );
	public final MJType procType() throws RecognitionException {
		MJType pt = null;


		MJType t =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:138:3: (t= type | 'void' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==IDENT||LA15_0==33||LA15_0==39) ) {
				alt15=1;
			}
			else if ( (LA15_0==47) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:138:5: t= type
					{
					pushFollow(FOLLOW_type_in_procType859);
					t=type();
					state._fsp--;

					 pt = t; 
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:140:5: 'void'
					{
					match(input,47,FOLLOW_47_in_procType869); 
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
	// /Users/probst/Desktop/02332/MiniJava.g:144:1: statement returns [MJStatement s] : (c= comment | block | 'if' '(' expression ')' block ( 'else' block )? | 'while' '(' expression ')' block |va= id '=' ea= expression ';' | 'System.out.println' '(' ep= expression ')' ';' | 'System.out.print' '(' expression ')' ';' | id '(' ( expression ( ',' expression )* )? ')' ';' );
	public final MJStatement statement() throws RecognitionException {
		MJStatement s = null;


		MJComment c =null;
		MJIdentifier va =null;
		MJExpression ea =null;
		MJExpression ep =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:145:3: (c= comment | block | 'if' '(' expression ')' block ( 'else' block )? | 'while' '(' expression ')' block |va= id '=' ea= expression ';' | 'System.out.println' '(' ep= expression ')' ';' | 'System.out.print' '(' expression ')' ';' | id '(' ( expression ( ',' expression )* )? ')' ';' )
			int alt19=8;
			switch ( input.LA(1) ) {
			case COMMENT:
				{
				alt19=1;
				}
				break;
			case 49:
				{
				alt19=2;
				}
				break;
			case 38:
				{
				alt19=3;
				}
				break;
			case 48:
				{
				alt19=4;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 26:
					{
					alt19=5;
					}
					break;
				case 23:
					{
					int LA19_11 = input.LA(3);
					if ( (LA19_11==IDENT) ) {
						int LA19_13 = input.LA(4);
						if ( (LA19_13==26) ) {
							alt19=5;
						}
						else if ( (LA19_13==17) ) {
							alt19=8;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 19, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 17:
					{
					alt19=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 45:
				{
				int LA19_6 = input.LA(2);
				if ( (LA19_6==23) ) {
					int LA19_11 = input.LA(3);
					if ( (LA19_11==IDENT) ) {
						int LA19_13 = input.LA(4);
						if ( (LA19_13==26) ) {
							alt19=5;
						}
						else if ( (LA19_13==17) ) {
							alt19=8;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 19, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 44:
				{
				int LA19_7 = input.LA(2);
				if ( (LA19_7==23) ) {
					int LA19_11 = input.LA(3);
					if ( (LA19_11==IDENT) ) {
						int LA19_13 = input.LA(4);
						if ( (LA19_13==26) ) {
							alt19=5;
						}
						else if ( (LA19_13==17) ) {
							alt19=8;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 19, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 30:
				{
				alt19=6;
				}
				break;
			case 29:
				{
				alt19=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:145:5: c= comment
					{
					pushFollow(FOLLOW_comment_in_statement896);
					c=comment();
					state._fsp--;

					 s = c; 
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:147:5: block
					{
					pushFollow(FOLLOW_block_in_statement908);
					block();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/probst/Desktop/02332/MiniJava.g:148:5: 'if' '(' expression ')' block ( 'else' block )?
					{
					match(input,38,FOLLOW_38_in_statement914); 
					match(input,17,FOLLOW_17_in_statement916); 
					pushFollow(FOLLOW_expression_in_statement918);
					expression();
					state._fsp--;

					match(input,18,FOLLOW_18_in_statement920); 
					pushFollow(FOLLOW_block_in_statement922);
					block();
					state._fsp--;

					// /Users/probst/Desktop/02332/MiniJava.g:149:5: ( 'else' block )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==35) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:149:7: 'else' block
							{
							match(input,35,FOLLOW_35_in_statement931); 
							pushFollow(FOLLOW_block_in_statement933);
							block();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 4 :
					// /Users/probst/Desktop/02332/MiniJava.g:151:5: 'while' '(' expression ')' block
					{
					match(input,48,FOLLOW_48_in_statement947); 
					match(input,17,FOLLOW_17_in_statement949); 
					pushFollow(FOLLOW_expression_in_statement951);
					expression();
					state._fsp--;

					match(input,18,FOLLOW_18_in_statement953); 
					pushFollow(FOLLOW_block_in_statement955);
					block();
					state._fsp--;

					}
					break;
				case 5 :
					// /Users/probst/Desktop/02332/MiniJava.g:152:5: va= id '=' ea= expression ';'
					{
					pushFollow(FOLLOW_id_in_statement965);
					va=id();
					state._fsp--;

					match(input,26,FOLLOW_26_in_statement967); 
					pushFollow(FOLLOW_expression_in_statement973);
					ea=expression();
					state._fsp--;

					match(input,24,FOLLOW_24_in_statement975); 

					    s = new MJAssign(va, ea);
					  
					}
					break;
				case 6 :
					// /Users/probst/Desktop/02332/MiniJava.g:156:5: 'System.out.println' '(' ep= expression ')' ';'
					{
					match(input,30,FOLLOW_30_in_statement985); 
					match(input,17,FOLLOW_17_in_statement987); 
					pushFollow(FOLLOW_expression_in_statement993);
					ep=expression();
					state._fsp--;

					match(input,18,FOLLOW_18_in_statement995); 
					match(input,24,FOLLOW_24_in_statement997); 

					      s = new MJPrintln(ep);
					    
					}
					break;
				case 7 :
					// /Users/probst/Desktop/02332/MiniJava.g:160:5: 'System.out.print' '(' expression ')' ';'
					{
					match(input,29,FOLLOW_29_in_statement1009); 
					match(input,17,FOLLOW_17_in_statement1011); 
					pushFollow(FOLLOW_expression_in_statement1013);
					expression();
					state._fsp--;

					match(input,18,FOLLOW_18_in_statement1015); 
					match(input,24,FOLLOW_24_in_statement1017); 
					}
					break;
				case 8 :
					// /Users/probst/Desktop/02332/MiniJava.g:161:5: id '(' ( expression ( ',' expression )* )? ')' ';'
					{
					pushFollow(FOLLOW_id_in_statement1023);
					id();
					state._fsp--;

					match(input,17,FOLLOW_17_in_statement1025); 
					// /Users/probst/Desktop/02332/MiniJava.g:162:5: ( expression ( ',' expression )* )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( ((LA18_0 >= IDENT && LA18_0 <= INT)||LA18_0==STRING||LA18_0==15||LA18_0==17||LA18_0==22||LA18_0==37||LA18_0==40||(LA18_0 >= 44 && LA18_0 <= 46)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:162:7: expression ( ',' expression )*
							{
							pushFollow(FOLLOW_expression_in_statement1034);
							expression();
							state._fsp--;

							// /Users/probst/Desktop/02332/MiniJava.g:163:7: ( ',' expression )*
							loop17:
							while (true) {
								int alt17=2;
								int LA17_0 = input.LA(1);
								if ( (LA17_0==21) ) {
									alt17=1;
								}

								switch (alt17) {
								case 1 :
									// /Users/probst/Desktop/02332/MiniJava.g:163:8: ',' expression
									{
									match(input,21,FOLLOW_21_in_statement1044); 
									pushFollow(FOLLOW_expression_in_statement1046);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop17;
								}
							}

							}
							break;

					}

					match(input,18,FOLLOW_18_in_statement1065); 
					match(input,24,FOLLOW_24_in_statement1067); 
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
	// /Users/probst/Desktop/02332/MiniJava.g:168:1: comment returns [MJComment c] : COMMENT ;
	public final MJComment comment() throws RecognitionException {
		MJComment c = null;


		Token COMMENT2=null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:169:3: ( COMMENT )
			// /Users/probst/Desktop/02332/MiniJava.g:169:5: COMMENT
			{
			COMMENT2=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment1089); 
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
	// /Users/probst/Desktop/02332/MiniJava.g:173:1: expression returns [MJExpression res] : arg1= level1 ( '&&' arg2= level1 )* ;
	public final MJExpression expression() throws RecognitionException {
		MJExpression res = null;


		MJExpression arg1 =null;
		MJExpression arg2 =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:174:3: (arg1= level1 ( '&&' arg2= level1 )* )
			// /Users/probst/Desktop/02332/MiniJava.g:174:5: arg1= level1 ( '&&' arg2= level1 )*
			{
			pushFollow(FOLLOW_level1_in_expression1119);
			arg1=level1();
			state._fsp--;

			 res = arg1; 
			// /Users/probst/Desktop/02332/MiniJava.g:176:5: ( '&&' arg2= level1 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==16) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:176:7: '&&' arg2= level1
					{
					match(input,16,FOLLOW_16_in_expression1134); 
					pushFollow(FOLLOW_level1_in_expression1140);
					arg2=level1();
					state._fsp--;

					 MJAnd op = new MJAnd( res, arg2);
					        res = op;
					      
					}
					break;

				default :
					break loop20;
				}
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:183:1: level1 returns [MJExpression res] : arg1= level2 ( '==' arg2= level2 )* ;
	public final MJExpression level1() throws RecognitionException {
		MJExpression res = null;


		MJExpression arg1 =null;
		MJExpression arg2 =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:184:3: (arg1= level2 ( '==' arg2= level2 )* )
			// /Users/probst/Desktop/02332/MiniJava.g:184:5: arg1= level2 ( '==' arg2= level2 )*
			{
			pushFollow(FOLLOW_level2_in_level11177);
			arg1=level2();
			state._fsp--;

			  res = arg1; 
			// /Users/probst/Desktop/02332/MiniJava.g:186:5: ( '==' arg2= level2 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==27) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:186:7: '==' arg2= level2
					{
					match(input,27,FOLLOW_27_in_level11191); 
					pushFollow(FOLLOW_level2_in_level11197);
					arg2=level2();
					state._fsp--;

					 MJEqual op = new MJEqual( res, arg2); 
					        res = op;
					      
					}
					break;

				default :
					break loop21;
				}
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:193:1: level2 returns [MJExpression res] : arg1= level3 ( '<' level3 )* ;
	public final MJExpression level2() throws RecognitionException {
		MJExpression res = null;


		MJExpression arg1 =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:194:3: (arg1= level3 ( '<' level3 )* )
			// /Users/probst/Desktop/02332/MiniJava.g:194:5: arg1= level3 ( '<' level3 )*
			{
			pushFollow(FOLLOW_level3_in_level21236);
			arg1=level3();
			state._fsp--;

			  res = arg1; 
			// /Users/probst/Desktop/02332/MiniJava.g:196:5: ( '<' level3 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==25) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:196:7: '<' level3
					{
					match(input,25,FOLLOW_25_in_level21249); 
					pushFollow(FOLLOW_level3_in_level21251);
					level3();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:200:1: level3 returns [MJExpression res] : arg1= level4 ( ( '+' | '-' ) arg2= level4 )* ;
	public final MJExpression level3() throws RecognitionException {
		MJExpression res = null;


		MJExpression arg1 =null;
		MJExpression arg2 =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:201:3: (arg1= level4 ( ( '+' | '-' ) arg2= level4 )* )
			// /Users/probst/Desktop/02332/MiniJava.g:201:5: arg1= level4 ( ( '+' | '-' ) arg2= level4 )*
			{
			pushFollow(FOLLOW_level4_in_level31284);
			arg1=level4();
			state._fsp--;

			  res = arg1; 
			// /Users/probst/Desktop/02332/MiniJava.g:203:5: ( ( '+' | '-' ) arg2= level4 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==20||LA24_0==22) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:203:7: ( '+' | '-' ) arg2= level4
					{
					 MJBinaryOp op = null;
					// /Users/probst/Desktop/02332/MiniJava.g:204:7: ( '+' | '-' )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==20) ) {
						alt23=1;
					}
					else if ( (LA23_0==22) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:204:9: '+'
							{
							match(input,20,FOLLOW_20_in_level31308); 
							 op = new MJPlus(); 
							}
							break;
						case 2 :
							// /Users/probst/Desktop/02332/MiniJava.g:204:38: '-'
							{
							match(input,22,FOLLOW_22_in_level31314); 
							 op = new MJMinus(); 
							}
							break;

					}

					pushFollow(FOLLOW_level4_in_level31331);
					arg2=level4();
					state._fsp--;

					 op.setLeftOperand( res );
					        op.setRightOperand(arg2);
					        res = op;
					      
					}
					break;

				default :
					break loop24;
				}
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:213:1: level4 returns [MJExpression res] : arg1= level5 ( '*' level5 )* ;
	public final MJExpression level4() throws RecognitionException {
		MJExpression res = null;


		MJExpression arg1 =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:214:3: (arg1= level5 ( '*' level5 )* )
			// /Users/probst/Desktop/02332/MiniJava.g:214:5: arg1= level5 ( '*' level5 )*
			{
			pushFollow(FOLLOW_level5_in_level41368);
			arg1=level5();
			state._fsp--;

			  res = arg1; 
			// /Users/probst/Desktop/02332/MiniJava.g:216:5: ( '*' level5 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==19) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:216:7: '*' level5
					{
					match(input,19,FOLLOW_19_in_level41382); 
					pushFollow(FOLLOW_level5_in_level41384);
					level5();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

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
	// /Users/probst/Desktop/02332/MiniJava.g:220:1: level5 returns [MJExpression res] : ( '-' l= level5 | '!' level5 | 'new' 'int' '[' size= expression ']' | 'new' IDENT '(' ( expression ( ',' expression )* )? ')' |i= id |i= id '[' idx= expression ']' | id '(' ( expression ( ',' expression )* )? ')' | '(' e= expression ')' | 'true' | 'false' | INT | STRING );
	public final MJExpression level5() throws RecognitionException {
		MJExpression res = null;


		Token INT3=null;
		Token STRING4=null;
		MJExpression l =null;
		MJExpression size =null;
		MJIdentifier i =null;
		MJExpression idx =null;
		MJExpression e =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:221:3: ( '-' l= level5 | '!' level5 | 'new' 'int' '[' size= expression ']' | 'new' IDENT '(' ( expression ( ',' expression )* )? ')' |i= id |i= id '[' idx= expression ']' | id '(' ( expression ( ',' expression )* )? ')' | '(' e= expression ')' | 'true' | 'false' | INT | STRING )
			int alt30=12;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt30=1;
				}
				break;
			case 15:
				{
				alt30=2;
				}
				break;
			case 40:
				{
				int LA30_3 = input.LA(2);
				if ( (LA30_3==39) ) {
					alt30=3;
				}
				else if ( (LA30_3==IDENT) ) {
					alt30=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

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
					alt30=5;
					}
					break;
				case 23:
					{
					int LA30_15 = input.LA(3);
					if ( (LA30_15==IDENT) ) {
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
							alt30=5;
							}
							break;
						case 31:
							{
							alt30=6;
							}
							break;
						case 17:
							{
							alt30=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 31:
					{
					alt30=6;
					}
					break;
				case 17:
					{
					alt30=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 45:
				{
				int LA30_5 = input.LA(2);
				if ( (LA30_5==23) ) {
					int LA30_15 = input.LA(3);
					if ( (LA30_15==IDENT) ) {
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
							alt30=5;
							}
							break;
						case 31:
							{
							alt30=6;
							}
							break;
						case 17:
							{
							alt30=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 44:
				{
				int LA30_6 = input.LA(2);
				if ( (LA30_6==23) ) {
					int LA30_15 = input.LA(3);
					if ( (LA30_15==IDENT) ) {
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
							alt30=5;
							}
							break;
						case 31:
							{
							alt30=6;
							}
							break;
						case 17:
							{
							alt30=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 17:
				{
				alt30=8;
				}
				break;
			case 46:
				{
				alt30=9;
				}
				break;
			case 37:
				{
				alt30=10;
				}
				break;
			case INT:
				{
				alt30=11;
				}
				break;
			case STRING:
				{
				alt30=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:221:5: '-' l= level5
					{
					match(input,22,FOLLOW_22_in_level51411); 
					pushFollow(FOLLOW_level5_in_level51417);
					l=level5();
					state._fsp--;

					 res = new MJUnaryMinus(l); 
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:223:5: '!' level5
					{
					match(input,15,FOLLOW_15_in_level51429); 
					pushFollow(FOLLOW_level5_in_level51431);
					level5();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/probst/Desktop/02332/MiniJava.g:224:5: 'new' 'int' '[' size= expression ']'
					{
					match(input,40,FOLLOW_40_in_level51438); 
					match(input,39,FOLLOW_39_in_level51440); 
					match(input,31,FOLLOW_31_in_level51442); 
					pushFollow(FOLLOW_expression_in_level51448);
					size=expression();
					state._fsp--;

					match(input,32,FOLLOW_32_in_level51450); 
					}
					break;
				case 4 :
					// /Users/probst/Desktop/02332/MiniJava.g:225:5: 'new' IDENT '(' ( expression ( ',' expression )* )? ')'
					{
					match(input,40,FOLLOW_40_in_level51456); 
					match(input,IDENT,FOLLOW_IDENT_in_level51458); 
					match(input,17,FOLLOW_17_in_level51460); 
					// /Users/probst/Desktop/02332/MiniJava.g:226:5: ( expression ( ',' expression )* )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= IDENT && LA27_0 <= INT)||LA27_0==STRING||LA27_0==15||LA27_0==17||LA27_0==22||LA27_0==37||LA27_0==40||(LA27_0 >= 44 && LA27_0 <= 46)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:226:7: expression ( ',' expression )*
							{
							pushFollow(FOLLOW_expression_in_level51468);
							expression();
							state._fsp--;

							// /Users/probst/Desktop/02332/MiniJava.g:227:7: ( ',' expression )*
							loop26:
							while (true) {
								int alt26=2;
								int LA26_0 = input.LA(1);
								if ( (LA26_0==21) ) {
									alt26=1;
								}

								switch (alt26) {
								case 1 :
									// /Users/probst/Desktop/02332/MiniJava.g:227:8: ',' expression
									{
									match(input,21,FOLLOW_21_in_level51478); 
									pushFollow(FOLLOW_expression_in_level51480);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop26;
								}
							}

							}
							break;

					}

					match(input,18,FOLLOW_18_in_level51504); 
					}
					break;
				case 5 :
					// /Users/probst/Desktop/02332/MiniJava.g:231:5: i= id
					{
					pushFollow(FOLLOW_id_in_level51514);
					i=id();
					state._fsp--;

					 res = i; 
					}
					break;
				case 6 :
					// /Users/probst/Desktop/02332/MiniJava.g:233:5: i= id '[' idx= expression ']'
					{
					pushFollow(FOLLOW_id_in_level51530);
					i=id();
					state._fsp--;

					match(input,31,FOLLOW_31_in_level51532); 
					pushFollow(FOLLOW_expression_in_level51538);
					idx=expression();
					state._fsp--;

					match(input,32,FOLLOW_32_in_level51540); 
					 res = new MJArray(i, idx); 
					}
					break;
				case 7 :
					// /Users/probst/Desktop/02332/MiniJava.g:235:5: id '(' ( expression ( ',' expression )* )? ')'
					{
					pushFollow(FOLLOW_id_in_level51552);
					id();
					state._fsp--;

					match(input,17,FOLLOW_17_in_level51554); 
					// /Users/probst/Desktop/02332/MiniJava.g:236:5: ( expression ( ',' expression )* )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( ((LA29_0 >= IDENT && LA29_0 <= INT)||LA29_0==STRING||LA29_0==15||LA29_0==17||LA29_0==22||LA29_0==37||LA29_0==40||(LA29_0 >= 44 && LA29_0 <= 46)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/probst/Desktop/02332/MiniJava.g:236:7: expression ( ',' expression )*
							{
							pushFollow(FOLLOW_expression_in_level51563);
							expression();
							state._fsp--;

							// /Users/probst/Desktop/02332/MiniJava.g:237:7: ( ',' expression )*
							loop28:
							while (true) {
								int alt28=2;
								int LA28_0 = input.LA(1);
								if ( (LA28_0==21) ) {
									alt28=1;
								}

								switch (alt28) {
								case 1 :
									// /Users/probst/Desktop/02332/MiniJava.g:237:8: ',' expression
									{
									match(input,21,FOLLOW_21_in_level51573); 
									pushFollow(FOLLOW_expression_in_level51575);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop28;
								}
							}

							}
							break;

					}

					match(input,18,FOLLOW_18_in_level51594); 
					}
					break;
				case 8 :
					// /Users/probst/Desktop/02332/MiniJava.g:240:5: '(' e= expression ')'
					{
					match(input,17,FOLLOW_17_in_level51604); 
					pushFollow(FOLLOW_expression_in_level51610);
					e=expression();
					state._fsp--;

					match(input,18,FOLLOW_18_in_level51612); 
					 res = new MJParentheses(e); 
					}
					break;
				case 9 :
					// /Users/probst/Desktop/02332/MiniJava.g:242:5: 'true'
					{
					match(input,46,FOLLOW_46_in_level51624); 
					 res = MJBoolean.True; 
					}
					break;
				case 10 :
					// /Users/probst/Desktop/02332/MiniJava.g:244:5: 'false'
					{
					match(input,37,FOLLOW_37_in_level51637); 
					 res = MJBoolean.False; 
					}
					break;
				case 11 :
					// /Users/probst/Desktop/02332/MiniJava.g:246:5: INT
					{
					INT3=(Token)match(input,INT,FOLLOW_INT_in_level51650); 
					 res = new MJInteger((INT3!=null?INT3.getText():null)); 
					}
					break;
				case 12 :
					// /Users/probst/Desktop/02332/MiniJava.g:248:5: STRING
					{
					STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_level51663); 
					 res = new MJString((STRING4!=null?STRING4.getText():null)); 
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
	// /Users/probst/Desktop/02332/MiniJava.g:252:3: id returns [MJIdentifier e] : ( IDENT |t= thisid '.' IDENT );
	public final MJIdentifier id() throws RecognitionException {
		MJIdentifier e = null;


		Token IDENT5=null;
		Token IDENT6=null;
		MJIdentifier t =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:253:3: ( IDENT |t= thisid '.' IDENT )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==IDENT) ) {
				int LA31_1 = input.LA(2);
				if ( ((LA31_1 >= 16 && LA31_1 <= 22)||(LA31_1 >= 24 && LA31_1 <= 27)||(LA31_1 >= 31 && LA31_1 <= 32)) ) {
					alt31=1;
				}
				else if ( (LA31_1==23) ) {
					alt31=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA31_0 >= 44 && LA31_0 <= 45)) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:253:5: IDENT
					{
					IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_id1691); 
					 e = new MJIdentifier((IDENT5!=null?IDENT5.getText():null));
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:255:5: t= thisid '.' IDENT
					{
					pushFollow(FOLLOW_thisid_in_id1707);
					t=thisid();
					state._fsp--;

					match(input,23,FOLLOW_23_in_id1709); 
					IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_id1711); 
					 
					      MJIdentifier i = new MJIdentifier((IDENT6!=null?IDENT6.getText():null));
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
	// /Users/probst/Desktop/02332/MiniJava.g:262:1: thisid returns [MJIdentifier e] : ( 'this' | 'super' | IDENT );
	public final MJIdentifier thisid() throws RecognitionException {
		MJIdentifier e = null;


		Token IDENT7=null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:263:3: ( 'this' | 'super' | IDENT )
			int alt32=3;
			switch ( input.LA(1) ) {
			case 45:
				{
				alt32=1;
				}
				break;
			case 44:
				{
				alt32=2;
				}
				break;
			case IDENT:
				{
				alt32=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:263:5: 'this'
					{
					match(input,45,FOLLOW_45_in_thisid1734); 
					 e= new MJIdentifier("this"); 
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:265:5: 'super'
					{
					match(input,44,FOLLOW_44_in_thisid1747); 
					 e= new MJIdentifier("super"); 
					}
					break;
				case 3 :
					// /Users/probst/Desktop/02332/MiniJava.g:267:5: IDENT
					{
					IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_thisid1759); 
					 e = new MJIdentifier((IDENT7!=null?IDENT7.getText():null));
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
	// /Users/probst/Desktop/02332/MiniJava.g:271:1: optExpression returns [MJExpression e] : (ex= expression |);
	public final MJExpression optExpression() throws RecognitionException {
		MJExpression e = null;


		MJExpression ex =null;

		try {
			// /Users/probst/Desktop/02332/MiniJava.g:272:3: (ex= expression |)
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( ((LA33_0 >= IDENT && LA33_0 <= INT)||LA33_0==STRING||LA33_0==15||LA33_0==17||LA33_0==22||LA33_0==37||LA33_0==40||(LA33_0 >= 44 && LA33_0 <= 46)) ) {
				alt33=1;
			}
			else if ( (LA33_0==24) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/probst/Desktop/02332/MiniJava.g:272:5: ex= expression
					{
					pushFollow(FOLLOW_expression_in_optExpression1788);
					ex=expression();
					state._fsp--;

					 e = ex; 
					}
					break;
				case 2 :
					// /Users/probst/Desktop/02332/MiniJava.g:275:5: 
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
	public static final BitSet FOLLOW_49_in_classDeclaration153 = new BitSet(new long[]{0x00048A8200000040L});
	public static final BitSet FOLLOW_varDeclaration_in_classDeclaration161 = new BitSet(new long[]{0x00048A8200000040L});
	public static final BitSet FOLLOW_methodDeclaration_in_classDeclaration202 = new BitSet(new long[]{0x00048A8200000040L});
	public static final BitSet FOLLOW_50_in_classDeclaration233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_mainClass256 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_mainClass262 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_mainClass269 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_mainClass278 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_mainClass280 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_mainClass282 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_mainClass288 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_mainClass290 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_mainClass292 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_mainClass298 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_mainClass300 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_block_in_mainClass306 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_mainClass312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_block343 = new BitSet(new long[]{0x000730C260000060L});
	public static final BitSet FOLLOW_varDeclaration_in_block351 = new BitSet(new long[]{0x000730C260000060L});
	public static final BitSet FOLLOW_statement_in_block392 = new BitSet(new long[]{0x0007304060000060L});
	public static final BitSet FOLLOW_50_in_block422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_varDeclaration459 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_varDeclaration465 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_varDeclaration467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_type491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_type503 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_type518 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_type520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_type542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_methodDeclaration574 = new BitSet(new long[]{0x0000888200000040L});
	public static final BitSet FOLLOW_43_in_methodDeclaration587 = new BitSet(new long[]{0x0000808200000040L});
	public static final BitSet FOLLOW_procType_in_methodDeclaration602 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_methodDeclaration608 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_methodDeclaration615 = new BitSet(new long[]{0x0000008200040040L});
	public static final BitSet FOLLOW_type_in_methodDeclaration630 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_methodDeclaration636 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_21_in_methodDeclaration659 = new BitSet(new long[]{0x0000008200000040L});
	public static final BitSet FOLLOW_type_in_methodDeclaration665 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_methodDeclaration671 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_18_in_methodDeclaration712 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_methodDeclaration719 = new BitSet(new long[]{0x000334C260000060L});
	public static final BitSet FOLLOW_varDeclaration_in_methodDeclaration727 = new BitSet(new long[]{0x000334C260000060L});
	public static final BitSet FOLLOW_statement_in_methodDeclaration768 = new BitSet(new long[]{0x0003344060000060L});
	public static final BitSet FOLLOW_42_in_methodDeclaration802 = new BitSet(new long[]{0x00007120014290C0L});
	public static final BitSet FOLLOW_optExpression_in_methodDeclaration808 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_methodDeclaration810 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_methodDeclaration826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_procType859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_procType869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_statement896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_statement914 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement916 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_statement918 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_statement920 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_block_in_statement922 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_statement931 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_block_in_statement933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_statement947 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement949 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_statement951 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_statement953 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_block_in_statement955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_statement965 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_statement967 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_statement973 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_statement975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_statement985 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement987 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_statement993 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_statement995 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_statement997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_statement1009 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement1011 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_statement1013 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_statement1015 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_statement1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_statement1023 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_statement1025 = new BitSet(new long[]{0x00007120004690C0L});
	public static final BitSet FOLLOW_expression_in_statement1034 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_21_in_statement1044 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_statement1046 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_18_in_statement1065 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_statement1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_level1_in_expression1119 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_expression1134 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level1_in_expression1140 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_level2_in_level11177 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_level11191 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level2_in_level11197 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_level3_in_level21236 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_level21249 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level3_in_level21251 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_level4_in_level31284 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_20_in_level31308 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_22_in_level31314 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level4_in_level31331 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_level5_in_level41368 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_level41382 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level5_in_level41384 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_22_in_level51411 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level5_in_level51417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_level51429 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_level5_in_level51431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_level51438 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_level51440 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_level51442 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_level51448 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_level51450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_level51456 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_level51458 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_level51460 = new BitSet(new long[]{0x00007120004690C0L});
	public static final BitSet FOLLOW_expression_in_level51468 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_21_in_level51478 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_level51480 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_18_in_level51504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_level51514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_level51530 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_level51532 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_level51538 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_level51540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_level51552 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_level51554 = new BitSet(new long[]{0x00007120004690C0L});
	public static final BitSet FOLLOW_expression_in_level51563 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_21_in_level51573 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_level51575 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_18_in_level51594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_level51604 = new BitSet(new long[]{0x00007120004290C0L});
	public static final BitSet FOLLOW_expression_in_level51610 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_level51612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_level51624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_level51637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_level51650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_level51663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_id1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_thisid_in_id1707 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_id1709 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_id1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_thisid1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_thisid1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_thisid1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_optExpression1788 = new BitSet(new long[]{0x0000000000000002L});
}
