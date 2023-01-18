package edu.ustb.sei.mde.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.ustb.sei.mde.services.SmartContractSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSmartContractSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SLD", "RULE_INT", "RULE_PLAINTEXT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contract'", "'{'", "'.'", "'}'", "'type'", "'asset'", "'info'", "'right'", "':'", "'set'", "'party'", "'group'", "'external'", "','", "'('", "')'", "'+'", "'auto'", "'break'", "'term'", "'can'", "'when'", "'while'", "'where'", "'must'", "'breach'", "'deposit'", "'withdraw'", "'transfer'", "'to'", "'$'", "'in'", "'such'", "'that'", "'if'", "'then'", "'else'", "'implies'", "'or'", "'||'", "'and'", "'&&'", "'not'", "'this'", "'he'", "'she'", "'his'", "'her'", "'himself'", "'herself'", "'::'", "'value'", "'-'", "'true'", "'false'", "'within'", "'by'", "'every'", "'from'", "'did'", "'is'", "'valid'", "'year'", "'month'", "'day'", "'hour'", "'min'", "'sec'", "'th'", "'@'", "'all'", "'forAll'", "'some'", "'exists'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'<>'", "'isn\\'t'", "'*'", "'/'", "'^'", "'before'", "'after'", "'any'", "'one'", "'the'", "'now'", "'start'", "'end'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SLD=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_PLAINTEXT=7;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSmartContractSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartContractSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartContractSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartContractSpecification.g"; }



     	private SmartContractSpecificationGrammarAccess grammarAccess;

        public InternalSmartContractSpecificationParser(TokenStream input, SmartContractSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Contract";
       	}

       	@Override
       	protected SmartContractSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContract"
    // InternalSmartContractSpecification.g:65:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalSmartContractSpecification.g:65:49: (iv_ruleContract= ruleContract EOF )
            // InternalSmartContractSpecification.g:66:2: iv_ruleContract= ruleContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalSmartContractSpecification.g:72:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= ruleParty ) )+ ( (lv_fields_4_0= ruleField ) )* ( ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.' )* ( (lv_types_7_0= ruleComplexType ) )* ( (lv_assets_8_0= ruleAsset ) )* otherlv_9= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_parties_3_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_terms_5_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_assets_8_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:78:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= ruleParty ) )+ ( (lv_fields_4_0= ruleField ) )* ( ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.' )* ( (lv_types_7_0= ruleComplexType ) )* ( (lv_assets_8_0= ruleAsset ) )* otherlv_9= '}' ) )
            // InternalSmartContractSpecification.g:79:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= ruleParty ) )+ ( (lv_fields_4_0= ruleField ) )* ( ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.' )* ( (lv_types_7_0= ruleComplexType ) )* ( (lv_assets_8_0= ruleAsset ) )* otherlv_9= '}' )
            {
            // InternalSmartContractSpecification.g:79:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= ruleParty ) )+ ( (lv_fields_4_0= ruleField ) )* ( ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.' )* ( (lv_types_7_0= ruleComplexType ) )* ( (lv_assets_8_0= ruleAsset ) )* otherlv_9= '}' )
            // InternalSmartContractSpecification.g:80:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= ruleParty ) )+ ( (lv_fields_4_0= ruleField ) )* ( ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.' )* ( (lv_types_7_0= ruleComplexType ) )* ( (lv_assets_8_0= ruleAsset ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSmartContractSpecification.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContractRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSmartContractSpecification.g:106:3: ( (lv_parties_3_0= ruleParty ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:107:4: (lv_parties_3_0= ruleParty )
            	    {
            	    // InternalSmartContractSpecification.g:107:4: (lv_parties_3_0= ruleParty )
            	    // InternalSmartContractSpecification.g:108:5: lv_parties_3_0= ruleParty
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getContractAccess().getPartiesPartyParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_parties_3_0=ruleParty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getContractRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parties",
            	      						lv_parties_3_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.Party");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalSmartContractSpecification.g:125:3: ( (lv_fields_4_0= ruleField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:126:4: (lv_fields_4_0= ruleField )
            	    {
            	    // InternalSmartContractSpecification.g:126:4: (lv_fields_4_0= ruleField )
            	    // InternalSmartContractSpecification.g:127:5: lv_fields_4_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getContractAccess().getFieldsFieldParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_fields_4_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getContractRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_4_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSmartContractSpecification.g:144:3: ( ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=30 && LA3_0<=32)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:145:4: ( (lv_terms_5_0= ruleTerm ) ) otherlv_6= '.'
            	    {
            	    // InternalSmartContractSpecification.g:145:4: ( (lv_terms_5_0= ruleTerm ) )
            	    // InternalSmartContractSpecification.g:146:5: (lv_terms_5_0= ruleTerm )
            	    {
            	    // InternalSmartContractSpecification.g:146:5: (lv_terms_5_0= ruleTerm )
            	    // InternalSmartContractSpecification.g:147:6: lv_terms_5_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContractAccess().getTermsTermParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_terms_5_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContractRule());
            	      						}
            	      						add(
            	      							current,
            	      							"terms",
            	      							lv_terms_5_0,
            	      							"edu.ustb.sei.mde.SmartContractSpecification.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getContractAccess().getFullStopKeyword_5_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSmartContractSpecification.g:169:3: ( (lv_types_7_0= ruleComplexType ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:170:4: (lv_types_7_0= ruleComplexType )
            	    {
            	    // InternalSmartContractSpecification.g:170:4: (lv_types_7_0= ruleComplexType )
            	    // InternalSmartContractSpecification.g:171:5: lv_types_7_0= ruleComplexType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getContractAccess().getTypesComplexTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_types_7_0=ruleComplexType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getContractRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_7_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.ComplexType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSmartContractSpecification.g:188:3: ( (lv_assets_8_0= ruleAsset ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:189:4: (lv_assets_8_0= ruleAsset )
            	    {
            	    // InternalSmartContractSpecification.g:189:4: (lv_assets_8_0= ruleAsset )
            	    // InternalSmartContractSpecification.g:190:5: lv_assets_8_0= ruleAsset
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getContractAccess().getAssetsAssetParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_assets_8_0=ruleAsset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getContractRule());
            	      					}
            	      					add(
            	      						current,
            	      						"assets",
            	      						lv_assets_8_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.Asset");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleComplexType"
    // InternalSmartContractSpecification.g:215:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalSmartContractSpecification.g:215:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalSmartContractSpecification.g:216:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalSmartContractSpecification.g:222:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:228:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // InternalSmartContractSpecification.g:229:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // InternalSmartContractSpecification.g:229:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // InternalSmartContractSpecification.g:230:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getTypeKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:235:4: (lv_name_1_0= RULE_ID )
            // InternalSmartContractSpecification.g:236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComplexTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSmartContractSpecification.g:256:3: ( (lv_fields_3_0= ruleField ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:257:4: (lv_fields_3_0= ruleField )
            	    {
            	    // InternalSmartContractSpecification.g:257:4: (lv_fields_3_0= ruleField )
            	    // InternalSmartContractSpecification.g:258:5: lv_fields_3_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_3_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleAsset"
    // InternalSmartContractSpecification.g:283:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalSmartContractSpecification.g:283:46: (iv_ruleAsset= ruleAsset EOF )
            // InternalSmartContractSpecification.g:284:2: iv_ruleAsset= ruleAsset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAsset=ruleAsset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAsset; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalSmartContractSpecification.g:290:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'info' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'right' otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_fields_5_0 = null;

        EObject lv_fields_9_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:296:2: ( (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'info' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'right' otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalSmartContractSpecification.g:297:2: (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'info' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'right' otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalSmartContractSpecification.g:297:2: (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'info' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'right' otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalSmartContractSpecification.g:298:3: otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'info' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'right' otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getAssetKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:302:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:303:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:303:4: (lv_name_1_0= RULE_ID )
            // InternalSmartContractSpecification.g:304:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getInfoKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSmartContractSpecification.g:332:3: ( (lv_fields_5_0= ruleField ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:333:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalSmartContractSpecification.g:333:4: (lv_fields_5_0= ruleField )
            	    // InternalSmartContractSpecification.g:334:5: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssetAccess().getFieldsFieldParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_5_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getRightKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_8());
              		
            }
            // InternalSmartContractSpecification.g:363:3: ( (lv_fields_9_0= ruleField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartContractSpecification.g:364:4: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalSmartContractSpecification.g:364:4: (lv_fields_9_0= ruleField )
            	    // InternalSmartContractSpecification.g:365:5: lv_fields_9_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssetAccess().getFieldsFieldParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_fields_9_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_9_0,
            	      						"edu.ustb.sei.mde.SmartContractSpecification.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleSelection"
    // InternalSmartContractSpecification.g:394:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalSmartContractSpecification.g:394:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalSmartContractSpecification.g:395:2: iv_ruleSelection= ruleSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalSmartContractSpecification.g:401:1: ruleSelection returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:407:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSmartContractSpecification.g:408:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSmartContractSpecification.g:408:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:409:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:409:3: (lv_name_0_0= RULE_ID )
            // InternalSmartContractSpecification.g:410:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSelectionRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleField"
    // InternalSmartContractSpecification.g:429:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalSmartContractSpecification.g:429:46: (iv_ruleField= ruleField EOF )
            // InternalSmartContractSpecification.g:430:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalSmartContractSpecification.g:436:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'set' ) )? ( (otherlv_3= RULE_ID ) ) (this_SLD_4= RULE_SLD )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_many_2_0=null;
        Token otherlv_3=null;
        Token this_SLD_4=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:442:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'set' ) )? ( (otherlv_3= RULE_ID ) ) (this_SLD_4= RULE_SLD )? ) )
            // InternalSmartContractSpecification.g:443:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'set' ) )? ( (otherlv_3= RULE_ID ) ) (this_SLD_4= RULE_SLD )? )
            {
            // InternalSmartContractSpecification.g:443:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'set' ) )? ( (otherlv_3= RULE_ID ) ) (this_SLD_4= RULE_SLD )? )
            // InternalSmartContractSpecification.g:444:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_many_2_0= 'set' ) )? ( (otherlv_3= RULE_ID ) ) (this_SLD_4= RULE_SLD )?
            {
            // InternalSmartContractSpecification.g:444:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:445:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:445:4: (lv_name_0_0= RULE_ID )
            // InternalSmartContractSpecification.g:446:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalSmartContractSpecification.g:466:3: ( (lv_many_2_0= 'set' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartContractSpecification.g:467:4: (lv_many_2_0= 'set' )
                    {
                    // InternalSmartContractSpecification.g:467:4: (lv_many_2_0= 'set' )
                    // InternalSmartContractSpecification.g:468:5: lv_many_2_0= 'set'
                    {
                    lv_many_2_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_many_2_0, grammarAccess.getFieldAccess().getManySetKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldRule());
                      					}
                      					setWithLastConsumed(current, "many", lv_many_2_0 != null, "set");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSmartContractSpecification.g:480:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartContractSpecification.g:481:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartContractSpecification.g:481:4: (otherlv_3= RULE_ID )
            // InternalSmartContractSpecification.g:482:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getTypeTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:493:3: (this_SLD_4= RULE_SLD )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SLD) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartContractSpecification.g:494:4: this_SLD_4= RULE_SLD
                    {
                    this_SLD_4=(Token)match(input,RULE_SLD,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SLD_4, grammarAccess.getFieldAccess().getSLDTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleParty"
    // InternalSmartContractSpecification.g:503:1: entryRuleParty returns [EObject current=null] : iv_ruleParty= ruleParty EOF ;
    public final EObject entryRuleParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParty = null;


        try {
            // InternalSmartContractSpecification.g:503:46: (iv_ruleParty= ruleParty EOF )
            // InternalSmartContractSpecification.g:504:2: iv_ruleParty= ruleParty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParty=ruleParty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // InternalSmartContractSpecification.g:510:1: ruleParty returns [EObject current=null] : ( ( () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) | ( () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}' ) | ( () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}' ) ) ;
    public final EObject ruleParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_name_18_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_fields_4_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_fields_12_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_actions_22_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:516:2: ( ( ( () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) | ( () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}' ) | ( () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}' ) ) )
            // InternalSmartContractSpecification.g:517:2: ( ( () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) | ( () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}' ) | ( () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}' ) )
            {
            // InternalSmartContractSpecification.g:517:2: ( ( () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) | ( () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}' ) | ( () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}' ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    alt17=1;
                }
                else if ( (LA17_1==24) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==25) ) {
                alt17=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmartContractSpecification.g:518:3: ( () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
                    {
                    // InternalSmartContractSpecification.g:518:3: ( () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
                    // InternalSmartContractSpecification.g:519:4: () otherlv_1= 'party' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleField ) )* ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}'
                    {
                    // InternalSmartContractSpecification.g:519:4: ()
                    // InternalSmartContractSpecification.g:520:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPartyAccess().getSinglePartyAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPartyAccess().getPartyKeyword_0_1());
                      			
                    }
                    // InternalSmartContractSpecification.g:530:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSmartContractSpecification.g:531:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:531:5: (lv_name_2_0= RULE_ID )
                    // InternalSmartContractSpecification.g:532:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPartyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_0_3());
                      			
                    }
                    // InternalSmartContractSpecification.g:552:4: ( (lv_fields_4_0= ruleField ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==21) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSmartContractSpecification.g:553:5: (lv_fields_4_0= ruleField )
                    	    {
                    	    // InternalSmartContractSpecification.g:553:5: (lv_fields_4_0= ruleField )
                    	    // InternalSmartContractSpecification.g:554:6: lv_fields_4_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPartyAccess().getFieldsFieldParserRuleCall_0_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_fields_4_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPartyRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"fields",
                    	      							lv_fields_4_0,
                    	      							"edu.ustb.sei.mde.SmartContractSpecification.Field");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalSmartContractSpecification.g:571:4: ( (lv_actions_5_0= ruleAction ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSmartContractSpecification.g:572:5: (lv_actions_5_0= ruleAction )
                    	    {
                    	    // InternalSmartContractSpecification.g:572:5: (lv_actions_5_0= ruleAction )
                    	    // InternalSmartContractSpecification.g:573:6: lv_actions_5_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPartyAccess().getActionsActionParserRuleCall_0_5_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_5_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPartyRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"actions",
                    	      							lv_actions_5_0,
                    	      							"edu.ustb.sei.mde.SmartContractSpecification.Action");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_0_6());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:596:3: ( () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}' )
                    {
                    // InternalSmartContractSpecification.g:596:3: ( () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}' )
                    // InternalSmartContractSpecification.g:597:4: () otherlv_8= 'party' otherlv_9= 'group' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '{' ( (lv_fields_12_0= ruleField ) )* ( (lv_actions_13_0= ruleAction ) )* otherlv_14= '}'
                    {
                    // InternalSmartContractSpecification.g:597:4: ()
                    // InternalSmartContractSpecification.g:598:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPartyAccess().getGroupPartyAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPartyAccess().getPartyKeyword_1_1());
                      			
                    }
                    otherlv_9=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPartyAccess().getGroupKeyword_1_2());
                      			
                    }
                    // InternalSmartContractSpecification.g:612:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalSmartContractSpecification.g:613:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:613:5: (lv_name_10_0= RULE_ID )
                    // InternalSmartContractSpecification.g:614:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_10_0, grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPartyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_10_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_1_4());
                      			
                    }
                    // InternalSmartContractSpecification.g:634:4: ( (lv_fields_12_0= ruleField ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1==21) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSmartContractSpecification.g:635:5: (lv_fields_12_0= ruleField )
                    	    {
                    	    // InternalSmartContractSpecification.g:635:5: (lv_fields_12_0= ruleField )
                    	    // InternalSmartContractSpecification.g:636:6: lv_fields_12_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPartyAccess().getFieldsFieldParserRuleCall_1_5_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_fields_12_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPartyRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"fields",
                    	      							lv_fields_12_0,
                    	      							"edu.ustb.sei.mde.SmartContractSpecification.Field");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalSmartContractSpecification.g:653:4: ( (lv_actions_13_0= ruleAction ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSmartContractSpecification.g:654:5: (lv_actions_13_0= ruleAction )
                    	    {
                    	    // InternalSmartContractSpecification.g:654:5: (lv_actions_13_0= ruleAction )
                    	    // InternalSmartContractSpecification.g:655:6: lv_actions_13_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPartyAccess().getActionsActionParserRuleCall_1_6_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_13_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPartyRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"actions",
                    	      							lv_actions_13_0,
                    	      							"edu.ustb.sei.mde.SmartContractSpecification.Action");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_1_7());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:678:3: ( () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}' )
                    {
                    // InternalSmartContractSpecification.g:678:3: ( () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}' )
                    // InternalSmartContractSpecification.g:679:4: () otherlv_16= 'external' otherlv_17= 'party' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= '{' ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )? otherlv_23= '}'
                    {
                    // InternalSmartContractSpecification.g:679:4: ()
                    // InternalSmartContractSpecification.g:680:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPartyAccess().getExternalPartyAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_16=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPartyAccess().getExternalKeyword_2_1());
                      			
                    }
                    otherlv_17=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPartyAccess().getPartyKeyword_2_2());
                      			
                    }
                    // InternalSmartContractSpecification.g:694:4: ( (lv_name_18_0= RULE_ID ) )
                    // InternalSmartContractSpecification.g:695:5: (lv_name_18_0= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:695:5: (lv_name_18_0= RULE_ID )
                    // InternalSmartContractSpecification.g:696:6: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_18_0, grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_2_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPartyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_18_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_2_4());
                      			
                    }
                    // InternalSmartContractSpecification.g:716:4: ( ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSmartContractSpecification.g:717:5: ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )*
                            {
                            // InternalSmartContractSpecification.g:717:5: ( (lv_actions_20_0= ruleAction ) )
                            // InternalSmartContractSpecification.g:718:6: (lv_actions_20_0= ruleAction )
                            {
                            // InternalSmartContractSpecification.g:718:6: (lv_actions_20_0= ruleAction )
                            // InternalSmartContractSpecification.g:719:7: lv_actions_20_0= ruleAction
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPartyAccess().getActionsActionParserRuleCall_2_5_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_actions_20_0=ruleAction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPartyRule());
                              							}
                              							add(
                              								current,
                              								"actions",
                              								lv_actions_20_0,
                              								"edu.ustb.sei.mde.SmartContractSpecification.Action");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSmartContractSpecification.g:736:5: (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==26) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalSmartContractSpecification.g:737:6: otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) )
                            	    {
                            	    otherlv_21=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_21, grammarAccess.getPartyAccess().getCommaKeyword_2_5_1_0());
                            	      					
                            	    }
                            	    // InternalSmartContractSpecification.g:741:6: ( (lv_actions_22_0= ruleAction ) )
                            	    // InternalSmartContractSpecification.g:742:7: (lv_actions_22_0= ruleAction )
                            	    {
                            	    // InternalSmartContractSpecification.g:742:7: (lv_actions_22_0= ruleAction )
                            	    // InternalSmartContractSpecification.g:743:8: lv_actions_22_0= ruleAction
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getPartyAccess().getActionsActionParserRuleCall_2_5_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_actions_22_0=ruleAction();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getPartyRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"actions",
                            	      									lv_actions_22_0,
                            	      									"edu.ustb.sei.mde.SmartContractSpecification.Action");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_2_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRuleAction"
    // InternalSmartContractSpecification.g:771:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartContractSpecification.g:771:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartContractSpecification.g:772:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSmartContractSpecification.g:778:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? (this_SLD_8= RULE_SLD )? ( ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )? )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_SLD_8=null;
        Token lv_IsMany_9_0=null;
        Token lv_Times_10_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:784:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? (this_SLD_8= RULE_SLD )? ( ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )? )? ) )
            // InternalSmartContractSpecification.g:785:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? (this_SLD_8= RULE_SLD )? ( ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )? )? )
            {
            // InternalSmartContractSpecification.g:785:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? (this_SLD_8= RULE_SLD )? ( ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )? )? )
            // InternalSmartContractSpecification.g:786:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? (this_SLD_8= RULE_SLD )? ( ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )? )?
            {
            // InternalSmartContractSpecification.g:786:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:787:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:787:4: (lv_name_0_0= RULE_ID )
            // InternalSmartContractSpecification.g:788:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmartContractSpecification.g:808:3: ( ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmartContractSpecification.g:809:4: ( (lv_parameters_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )*
                    {
                    // InternalSmartContractSpecification.g:809:4: ( (lv_parameters_2_0= ruleField ) )
                    // InternalSmartContractSpecification.g:810:5: (lv_parameters_2_0= ruleField )
                    {
                    // InternalSmartContractSpecification.g:810:5: (lv_parameters_2_0= ruleField )
                    // InternalSmartContractSpecification.g:811:6: lv_parameters_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActionAccess().getParametersFieldParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_parameters_2_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Field");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:828:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSmartContractSpecification.g:829:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSmartContractSpecification.g:833:5: ( (lv_parameters_4_0= ruleField ) )
                    	    // InternalSmartContractSpecification.g:834:6: (lv_parameters_4_0= ruleField )
                    	    {
                    	    // InternalSmartContractSpecification.g:834:6: (lv_parameters_4_0= ruleField )
                    	    // InternalSmartContractSpecification.g:835:7: lv_parameters_4_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActionAccess().getParametersFieldParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_parameters_4_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"edu.ustb.sei.mde.SmartContractSpecification.Field");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmartContractSpecification.g:858:3: (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmartContractSpecification.g:859:4: otherlv_6= ':' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalSmartContractSpecification.g:863:4: ( (otherlv_7= RULE_ID ) )
                    // InternalSmartContractSpecification.g:864:5: (otherlv_7= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:864:5: (otherlv_7= RULE_ID )
                    // InternalSmartContractSpecification.g:865:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getActionRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getActionAccess().getTypeTypeCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSmartContractSpecification.g:877:3: (this_SLD_8= RULE_SLD )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SLD) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmartContractSpecification.g:878:4: this_SLD_8= RULE_SLD
                    {
                    this_SLD_8=(Token)match(input,RULE_SLD,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SLD_8, grammarAccess.getActionAccess().getSLDTerminalRuleCall_5());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:883:3: ( ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmartContractSpecification.g:884:4: ( (lv_IsMany_9_0= '+' ) ) ( (lv_Times_10_0= RULE_INT ) )?
                    {
                    // InternalSmartContractSpecification.g:884:4: ( (lv_IsMany_9_0= '+' ) )
                    // InternalSmartContractSpecification.g:885:5: (lv_IsMany_9_0= '+' )
                    {
                    // InternalSmartContractSpecification.g:885:5: (lv_IsMany_9_0= '+' )
                    // InternalSmartContractSpecification.g:886:6: lv_IsMany_9_0= '+'
                    {
                    lv_IsMany_9_0=(Token)match(input,29,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_IsMany_9_0, grammarAccess.getActionAccess().getIsManyPlusSignKeyword_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getActionRule());
                      						}
                      						setWithLastConsumed(current, "IsMany", lv_IsMany_9_0 != null, "+");
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:898:4: ( (lv_Times_10_0= RULE_INT ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_INT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalSmartContractSpecification.g:899:5: (lv_Times_10_0= RULE_INT )
                            {
                            // InternalSmartContractSpecification.g:899:5: (lv_Times_10_0= RULE_INT )
                            // InternalSmartContractSpecification.g:900:6: lv_Times_10_0= RULE_INT
                            {
                            lv_Times_10_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_Times_10_0, grammarAccess.getActionAccess().getTimesINTTerminalRuleCall_6_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getActionRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"Times",
                              							lv_Times_10_0,
                              							"org.eclipse.xtext.common.Terminals.INT");
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTerm"
    // InternalSmartContractSpecification.g:921:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalSmartContractSpecification.g:921:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalSmartContractSpecification.g:922:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalSmartContractSpecification.g:928:1: ruleTerm returns [EObject current=null] : ( ( () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )? ) | ( () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )? ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_auto_1_0=null;
        Token lv_break_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_auto_17_0=null;
        Token lv_break_18_0=null;
        Token otherlv_19=null;
        Token lv_name_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject lv_condition_11_0 = null;

        EObject lv_transferOperations_13_0 = null;

        EObject lv_postCondition_15_0 = null;

        EObject lv_condition_27_0 = null;

        EObject lv_transferOperations_29_0 = null;

        EObject lv_postCondition_31_0 = null;

        EObject lv_breachOperations_33_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:934:2: ( ( ( () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )? ) | ( () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )? ) ) )
            // InternalSmartContractSpecification.g:935:2: ( ( () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )? ) | ( () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )? ) )
            {
            // InternalSmartContractSpecification.g:935:2: ( ( () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )? ) | ( () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )? ) )
            int alt40=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==31) ) {
                    int LA40_2 = input.LA(3);

                    if ( (LA40_2==32) ) {
                        int LA40_3 = input.LA(4);

                        if ( (LA40_3==RULE_ID) ) {
                            int LA40_4 = input.LA(5);

                            if ( (LA40_4==21) ) {
                                int LA40_5 = input.LA(6);

                                if ( (LA40_5==RULE_ID) ) {
                                    int LA40_6 = input.LA(7);

                                    if ( (LA40_6==37) ) {
                                        alt40=2;
                                    }
                                    else if ( (LA40_6==33) ) {
                                        alt40=1;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 40, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 40, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA40_1==32) ) {
                    int LA40_3 = input.LA(3);

                    if ( (LA40_3==RULE_ID) ) {
                        int LA40_4 = input.LA(4);

                        if ( (LA40_4==21) ) {
                            int LA40_5 = input.LA(5);

                            if ( (LA40_5==RULE_ID) ) {
                                int LA40_6 = input.LA(6);

                                if ( (LA40_6==37) ) {
                                    alt40=2;
                                }
                                else if ( (LA40_6==33) ) {
                                    alt40=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 40, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==32) ) {
                    int LA40_3 = input.LA(3);

                    if ( (LA40_3==RULE_ID) ) {
                        int LA40_4 = input.LA(4);

                        if ( (LA40_4==21) ) {
                            int LA40_5 = input.LA(5);

                            if ( (LA40_5==RULE_ID) ) {
                                int LA40_6 = input.LA(6);

                                if ( (LA40_6==37) ) {
                                    alt40=2;
                                }
                                else if ( (LA40_6==33) ) {
                                    alt40=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 40, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA40_3 = input.LA(2);

                if ( (LA40_3==RULE_ID) ) {
                    int LA40_4 = input.LA(3);

                    if ( (LA40_4==21) ) {
                        int LA40_5 = input.LA(4);

                        if ( (LA40_5==RULE_ID) ) {
                            int LA40_6 = input.LA(5);

                            if ( (LA40_6==37) ) {
                                alt40=2;
                            }
                            else if ( (LA40_6==33) ) {
                                alt40=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSmartContractSpecification.g:936:3: ( () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )? )
                    {
                    // InternalSmartContractSpecification.g:936:3: ( () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )? )
                    // InternalSmartContractSpecification.g:937:4: () ( (lv_auto_1_0= 'auto' ) )? ( (lv_break_2_0= 'break' ) )? otherlv_3= 'term' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'can' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )? (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )? (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )?
                    {
                    // InternalSmartContractSpecification.g:937:4: ()
                    // InternalSmartContractSpecification.g:938:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTermAccess().getRightTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:944:4: ( (lv_auto_1_0= 'auto' ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==30) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSmartContractSpecification.g:945:5: (lv_auto_1_0= 'auto' )
                            {
                            // InternalSmartContractSpecification.g:945:5: (lv_auto_1_0= 'auto' )
                            // InternalSmartContractSpecification.g:946:6: lv_auto_1_0= 'auto'
                            {
                            lv_auto_1_0=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_auto_1_0, grammarAccess.getTermAccess().getAutoAutoKeyword_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getTermRule());
                              						}
                              						setWithLastConsumed(current, "auto", lv_auto_1_0 != null, "auto");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:958:4: ( (lv_break_2_0= 'break' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==31) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSmartContractSpecification.g:959:5: (lv_break_2_0= 'break' )
                            {
                            // InternalSmartContractSpecification.g:959:5: (lv_break_2_0= 'break' )
                            // InternalSmartContractSpecification.g:960:6: lv_break_2_0= 'break'
                            {
                            lv_break_2_0=(Token)match(input,31,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_break_2_0, grammarAccess.getTermAccess().getBreakBreakKeyword_0_2_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getTermRule());
                              						}
                              						setWithLastConsumed(current, "break", lv_break_2_0 != null, "break");
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTermAccess().getTermKeyword_0_3());
                      			
                    }
                    // InternalSmartContractSpecification.g:976:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalSmartContractSpecification.g:977:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:977:5: (lv_name_4_0= RULE_ID )
                    // InternalSmartContractSpecification.g:978:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_4_0, grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTermRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTermAccess().getColonKeyword_0_5());
                      			
                    }
                    // InternalSmartContractSpecification.g:998:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSmartContractSpecification.g:999:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:999:5: (otherlv_6= RULE_ID )
                    // InternalSmartContractSpecification.g:1000:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTermRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getTermAccess().getPartyPartyCrossReference_0_6_0());
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTermAccess().getCanKeyword_0_7());
                      			
                    }
                    // InternalSmartContractSpecification.g:1015:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSmartContractSpecification.g:1016:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:1016:5: (otherlv_8= RULE_ID )
                    // InternalSmartContractSpecification.g:1017:6: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTermRule());
                      						}
                      					
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getTermAccess().getActionActionCrossReference_0_8_0());
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:1028:4: (otherlv_9= ',' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==26) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1029:5: otherlv_9= ','
                            {
                            otherlv_9=(Token)match(input,26,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getTermAccess().getCommaKeyword_0_9());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1034:4: (otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==34) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1035:5: otherlv_10= 'when' ( (lv_condition_11_0= ruleExpression ) )
                            {
                            otherlv_10=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getTermAccess().getWhenKeyword_0_10_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1039:5: ( (lv_condition_11_0= ruleExpression ) )
                            // InternalSmartContractSpecification.g:1040:6: (lv_condition_11_0= ruleExpression )
                            {
                            // InternalSmartContractSpecification.g:1040:6: (lv_condition_11_0= ruleExpression )
                            // InternalSmartContractSpecification.g:1041:7: lv_condition_11_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTermAccess().getConditionExpressionParserRuleCall_0_10_1_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
                            lv_condition_11_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTermRule());
                              							}
                              							set(
                              								current,
                              								"condition",
                              								lv_condition_11_0,
                              								"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1059:4: (otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+ )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==35) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1060:5: otherlv_12= 'while' ( (lv_transferOperations_13_0= ruleTransferOperation ) )+
                            {
                            otherlv_12=(Token)match(input,35,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getTermAccess().getWhileKeyword_0_11_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1064:5: ( (lv_transferOperations_13_0= ruleTransferOperation ) )+
                            int cnt28=0;
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( ((LA28_0>=39 && LA28_0<=41)) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalSmartContractSpecification.g:1065:6: (lv_transferOperations_13_0= ruleTransferOperation )
                            	    {
                            	    // InternalSmartContractSpecification.g:1065:6: (lv_transferOperations_13_0= ruleTransferOperation )
                            	    // InternalSmartContractSpecification.g:1066:7: lv_transferOperations_13_0= ruleTransferOperation
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getTermAccess().getTransferOperationsTransferOperationParserRuleCall_0_11_1_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_37);
                            	    lv_transferOperations_13_0=ruleTransferOperation();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getTermRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"transferOperations",
                            	      								lv_transferOperations_13_0,
                            	      								"edu.ustb.sei.mde.SmartContractSpecification.TransferOperation");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt28 >= 1 ) break loop28;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(28, input);
                                        throw eee;
                                }
                                cnt28++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1084:4: (otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==36) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1085:5: otherlv_14= 'where' ( (lv_postCondition_15_0= ruleExpression ) )
                            {
                            otherlv_14=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getTermAccess().getWhereKeyword_0_12_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1089:5: ( (lv_postCondition_15_0= ruleExpression ) )
                            // InternalSmartContractSpecification.g:1090:6: (lv_postCondition_15_0= ruleExpression )
                            {
                            // InternalSmartContractSpecification.g:1090:6: (lv_postCondition_15_0= ruleExpression )
                            // InternalSmartContractSpecification.g:1091:7: lv_postCondition_15_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTermAccess().getPostConditionExpressionParserRuleCall_0_12_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_postCondition_15_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTermRule());
                              							}
                              							set(
                              								current,
                              								"postCondition",
                              								lv_postCondition_15_0,
                              								"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:1111:3: ( () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )? )
                    {
                    // InternalSmartContractSpecification.g:1111:3: ( () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )? )
                    // InternalSmartContractSpecification.g:1112:4: () ( (lv_auto_17_0= 'auto' ) )? ( (lv_break_18_0= 'break' ) )? otherlv_19= 'term' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) otherlv_23= 'must' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' )? (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )? (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )? (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )? (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )?
                    {
                    // InternalSmartContractSpecification.g:1112:4: ()
                    // InternalSmartContractSpecification.g:1113:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTermAccess().getDutyTermAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:1119:4: ( (lv_auto_17_0= 'auto' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==30) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1120:5: (lv_auto_17_0= 'auto' )
                            {
                            // InternalSmartContractSpecification.g:1120:5: (lv_auto_17_0= 'auto' )
                            // InternalSmartContractSpecification.g:1121:6: lv_auto_17_0= 'auto'
                            {
                            lv_auto_17_0=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_auto_17_0, grammarAccess.getTermAccess().getAutoAutoKeyword_1_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getTermRule());
                              						}
                              						setWithLastConsumed(current, "auto", lv_auto_17_0 != null, "auto");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1133:4: ( (lv_break_18_0= 'break' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==31) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1134:5: (lv_break_18_0= 'break' )
                            {
                            // InternalSmartContractSpecification.g:1134:5: (lv_break_18_0= 'break' )
                            // InternalSmartContractSpecification.g:1135:6: lv_break_18_0= 'break'
                            {
                            lv_break_18_0=(Token)match(input,31,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_break_18_0, grammarAccess.getTermAccess().getBreakBreakKeyword_1_2_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getTermRule());
                              						}
                              						setWithLastConsumed(current, "break", lv_break_18_0 != null, "break");
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTermAccess().getTermKeyword_1_3());
                      			
                    }
                    // InternalSmartContractSpecification.g:1151:4: ( (lv_name_20_0= RULE_ID ) )
                    // InternalSmartContractSpecification.g:1152:5: (lv_name_20_0= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:1152:5: (lv_name_20_0= RULE_ID )
                    // InternalSmartContractSpecification.g:1153:6: lv_name_20_0= RULE_ID
                    {
                    lv_name_20_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_20_0, grammarAccess.getTermAccess().getNameIDTerminalRuleCall_1_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTermRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_20_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTermAccess().getColonKeyword_1_5());
                      			
                    }
                    // InternalSmartContractSpecification.g:1173:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSmartContractSpecification.g:1174:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:1174:5: (otherlv_22= RULE_ID )
                    // InternalSmartContractSpecification.g:1175:6: otherlv_22= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTermRule());
                      						}
                      					
                    }
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_22, grammarAccess.getTermAccess().getPartyPartyCrossReference_1_6_0());
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getTermAccess().getMustKeyword_1_7());
                      			
                    }
                    // InternalSmartContractSpecification.g:1190:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSmartContractSpecification.g:1191:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:1191:5: (otherlv_24= RULE_ID )
                    // InternalSmartContractSpecification.g:1192:6: otherlv_24= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTermRule());
                      						}
                      					
                    }
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getTermAccess().getActionActionCrossReference_1_8_0());
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:1203:4: (otherlv_25= ',' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==26) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1204:5: otherlv_25= ','
                            {
                            otherlv_25=(Token)match(input,26,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_25, grammarAccess.getTermAccess().getCommaKeyword_1_9());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1209:4: (otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==34) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1210:5: otherlv_26= 'when' ( (lv_condition_27_0= ruleExpression ) )
                            {
                            otherlv_26=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_26, grammarAccess.getTermAccess().getWhenKeyword_1_10_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1214:5: ( (lv_condition_27_0= ruleExpression ) )
                            // InternalSmartContractSpecification.g:1215:6: (lv_condition_27_0= ruleExpression )
                            {
                            // InternalSmartContractSpecification.g:1215:6: (lv_condition_27_0= ruleExpression )
                            // InternalSmartContractSpecification.g:1216:7: lv_condition_27_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTermAccess().getConditionExpressionParserRuleCall_1_10_1_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
                            lv_condition_27_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTermRule());
                              							}
                              							set(
                              								current,
                              								"condition",
                              								lv_condition_27_0,
                              								"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1234:4: (otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+ )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==35) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1235:5: otherlv_28= 'while' ( (lv_transferOperations_29_0= ruleTransferOperation ) )+
                            {
                            otherlv_28=(Token)match(input,35,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_28, grammarAccess.getTermAccess().getWhileKeyword_1_11_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1239:5: ( (lv_transferOperations_29_0= ruleTransferOperation ) )+
                            int cnt35=0;
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( ((LA35_0>=39 && LA35_0<=41)) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalSmartContractSpecification.g:1240:6: (lv_transferOperations_29_0= ruleTransferOperation )
                            	    {
                            	    // InternalSmartContractSpecification.g:1240:6: (lv_transferOperations_29_0= ruleTransferOperation )
                            	    // InternalSmartContractSpecification.g:1241:7: lv_transferOperations_29_0= ruleTransferOperation
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getTermAccess().getTransferOperationsTransferOperationParserRuleCall_1_11_1_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_42);
                            	    lv_transferOperations_29_0=ruleTransferOperation();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getTermRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"transferOperations",
                            	      								lv_transferOperations_29_0,
                            	      								"edu.ustb.sei.mde.SmartContractSpecification.TransferOperation");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt35 >= 1 ) break loop35;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(35, input);
                                        throw eee;
                                }
                                cnt35++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1259:4: (otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==36) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1260:5: otherlv_30= 'where' ( (lv_postCondition_31_0= ruleExpression ) )
                            {
                            otherlv_30=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_30, grammarAccess.getTermAccess().getWhereKeyword_1_12_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1264:5: ( (lv_postCondition_31_0= ruleExpression ) )
                            // InternalSmartContractSpecification.g:1265:6: (lv_postCondition_31_0= ruleExpression )
                            {
                            // InternalSmartContractSpecification.g:1265:6: (lv_postCondition_31_0= ruleExpression )
                            // InternalSmartContractSpecification.g:1266:7: lv_postCondition_31_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTermAccess().getPostConditionExpressionParserRuleCall_1_12_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
                            lv_postCondition_31_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTermRule());
                              							}
                              							set(
                              								current,
                              								"postCondition",
                              								lv_postCondition_31_0,
                              								"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:1284:4: (otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+ )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==38) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1285:5: otherlv_32= 'breach' ( (lv_breachOperations_33_0= ruleTransferOperation ) )+
                            {
                            otherlv_32=(Token)match(input,38,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_32, grammarAccess.getTermAccess().getBreachKeyword_1_13_0());
                              				
                            }
                            // InternalSmartContractSpecification.g:1289:5: ( (lv_breachOperations_33_0= ruleTransferOperation ) )+
                            int cnt38=0;
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( ((LA38_0>=39 && LA38_0<=41)) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // InternalSmartContractSpecification.g:1290:6: (lv_breachOperations_33_0= ruleTransferOperation )
                            	    {
                            	    // InternalSmartContractSpecification.g:1290:6: (lv_breachOperations_33_0= ruleTransferOperation )
                            	    // InternalSmartContractSpecification.g:1291:7: lv_breachOperations_33_0= ruleTransferOperation
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getTermAccess().getBreachOperationsTransferOperationParserRuleCall_1_13_1_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_44);
                            	    lv_breachOperations_33_0=ruleTransferOperation();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getTermRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"breachOperations",
                            	      								lv_breachOperations_33_0,
                            	      								"edu.ustb.sei.mde.SmartContractSpecification.TransferOperation");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt38 >= 1 ) break loop38;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(38, input);
                                        throw eee;
                                }
                                cnt38++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTransferOperation"
    // InternalSmartContractSpecification.g:1314:1: entryRuleTransferOperation returns [EObject current=null] : iv_ruleTransferOperation= ruleTransferOperation EOF ;
    public final EObject entryRuleTransferOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransferOperation = null;


        try {
            // InternalSmartContractSpecification.g:1314:58: (iv_ruleTransferOperation= ruleTransferOperation EOF )
            // InternalSmartContractSpecification.g:1315:2: iv_ruleTransferOperation= ruleTransferOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransferOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransferOperation=ruleTransferOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransferOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransferOperation"


    // $ANTLR start "ruleTransferOperation"
    // InternalSmartContractSpecification.g:1321:1: ruleTransferOperation returns [EObject current=null] : ( ( () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) ) ) | ( () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) ) ) | ( () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) ) ) ) ;
    public final EObject ruleTransferOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_money_2_0 = null;

        EObject lv_money_5_0 = null;

        EObject lv_money_8_0 = null;

        EObject lv_account_10_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1327:2: ( ( ( () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) ) ) | ( () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) ) ) | ( () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) ) ) ) )
            // InternalSmartContractSpecification.g:1328:2: ( ( () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) ) ) | ( () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) ) ) | ( () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) ) ) )
            {
            // InternalSmartContractSpecification.g:1328:2: ( ( () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) ) ) | ( () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) ) ) | ( () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt41=1;
                }
                break;
            case 40:
                {
                alt41=2;
                }
                break;
            case 41:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalSmartContractSpecification.g:1329:3: ( () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) ) )
                    {
                    // InternalSmartContractSpecification.g:1329:3: ( () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) ) )
                    // InternalSmartContractSpecification.g:1330:4: () otherlv_1= 'deposit' ( (lv_money_2_0= ruleMoneyExpression ) )
                    {
                    // InternalSmartContractSpecification.g:1330:4: ()
                    // InternalSmartContractSpecification.g:1331:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTransferOperationAccess().getDepositAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTransferOperationAccess().getDepositKeyword_0_1());
                      			
                    }
                    // InternalSmartContractSpecification.g:1341:4: ( (lv_money_2_0= ruleMoneyExpression ) )
                    // InternalSmartContractSpecification.g:1342:5: (lv_money_2_0= ruleMoneyExpression )
                    {
                    // InternalSmartContractSpecification.g:1342:5: (lv_money_2_0= ruleMoneyExpression )
                    // InternalSmartContractSpecification.g:1343:6: lv_money_2_0= ruleMoneyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransferOperationAccess().getMoneyMoneyExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_money_2_0=ruleMoneyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransferOperationRule());
                      						}
                      						set(
                      							current,
                      							"money",
                      							lv_money_2_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.MoneyExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:1362:3: ( () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) ) )
                    {
                    // InternalSmartContractSpecification.g:1362:3: ( () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) ) )
                    // InternalSmartContractSpecification.g:1363:4: () otherlv_4= 'withdraw' ( (lv_money_5_0= ruleMoneyExpression ) )
                    {
                    // InternalSmartContractSpecification.g:1363:4: ()
                    // InternalSmartContractSpecification.g:1364:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTransferOperationAccess().getWithdrawAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTransferOperationAccess().getWithdrawKeyword_1_1());
                      			
                    }
                    // InternalSmartContractSpecification.g:1374:4: ( (lv_money_5_0= ruleMoneyExpression ) )
                    // InternalSmartContractSpecification.g:1375:5: (lv_money_5_0= ruleMoneyExpression )
                    {
                    // InternalSmartContractSpecification.g:1375:5: (lv_money_5_0= ruleMoneyExpression )
                    // InternalSmartContractSpecification.g:1376:6: lv_money_5_0= ruleMoneyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransferOperationAccess().getMoneyMoneyExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_money_5_0=ruleMoneyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransferOperationRule());
                      						}
                      						set(
                      							current,
                      							"money",
                      							lv_money_5_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.MoneyExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:1395:3: ( () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) ) )
                    {
                    // InternalSmartContractSpecification.g:1395:3: ( () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) ) )
                    // InternalSmartContractSpecification.g:1396:4: () otherlv_7= 'transfer' ( (lv_money_8_0= ruleMoneyExpression ) ) otherlv_9= 'to' ( (lv_account_10_0= ruleExpression ) )
                    {
                    // InternalSmartContractSpecification.g:1396:4: ()
                    // InternalSmartContractSpecification.g:1397:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTransferOperationAccess().getTransferAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTransferOperationAccess().getTransferKeyword_2_1());
                      			
                    }
                    // InternalSmartContractSpecification.g:1407:4: ( (lv_money_8_0= ruleMoneyExpression ) )
                    // InternalSmartContractSpecification.g:1408:5: (lv_money_8_0= ruleMoneyExpression )
                    {
                    // InternalSmartContractSpecification.g:1408:5: (lv_money_8_0= ruleMoneyExpression )
                    // InternalSmartContractSpecification.g:1409:6: lv_money_8_0= ruleMoneyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransferOperationAccess().getMoneyMoneyExpressionParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_money_8_0=ruleMoneyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransferOperationRule());
                      						}
                      						set(
                      							current,
                      							"money",
                      							lv_money_8_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.MoneyExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,42,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTransferOperationAccess().getToKeyword_2_3());
                      			
                    }
                    // InternalSmartContractSpecification.g:1430:4: ( (lv_account_10_0= ruleExpression ) )
                    // InternalSmartContractSpecification.g:1431:5: (lv_account_10_0= ruleExpression )
                    {
                    // InternalSmartContractSpecification.g:1431:5: (lv_account_10_0= ruleExpression )
                    // InternalSmartContractSpecification.g:1432:6: lv_account_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransferOperationAccess().getAccountExpressionParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_account_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransferOperationRule());
                      						}
                      						set(
                      							current,
                      							"account",
                      							lv_account_10_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransferOperation"


    // $ANTLR start "entryRuleMoneyExpression"
    // InternalSmartContractSpecification.g:1454:1: entryRuleMoneyExpression returns [EObject current=null] : iv_ruleMoneyExpression= ruleMoneyExpression EOF ;
    public final EObject entryRuleMoneyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoneyExpression = null;


        try {
            // InternalSmartContractSpecification.g:1454:56: (iv_ruleMoneyExpression= ruleMoneyExpression EOF )
            // InternalSmartContractSpecification.g:1455:2: iv_ruleMoneyExpression= ruleMoneyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoneyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMoneyExpression=ruleMoneyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMoneyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoneyExpression"


    // $ANTLR start "ruleMoneyExpression"
    // InternalSmartContractSpecification.g:1461:1: ruleMoneyExpression returns [EObject current=null] : ( () otherlv_1= '$' ( (lv_condition_2_0= ruleExpression ) ) ) ;
    public final EObject ruleMoneyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1467:2: ( ( () otherlv_1= '$' ( (lv_condition_2_0= ruleExpression ) ) ) )
            // InternalSmartContractSpecification.g:1468:2: ( () otherlv_1= '$' ( (lv_condition_2_0= ruleExpression ) ) )
            {
            // InternalSmartContractSpecification.g:1468:2: ( () otherlv_1= '$' ( (lv_condition_2_0= ruleExpression ) ) )
            // InternalSmartContractSpecification.g:1469:3: () otherlv_1= '$' ( (lv_condition_2_0= ruleExpression ) )
            {
            // InternalSmartContractSpecification.g:1469:3: ()
            // InternalSmartContractSpecification.g:1470:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMoneyExpressionAccess().getMoneyExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMoneyExpressionAccess().getDollarSignKeyword_1());
              		
            }
            // InternalSmartContractSpecification.g:1480:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:1481:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:1481:4: (lv_condition_2_0= ruleExpression )
            // InternalSmartContractSpecification.g:1482:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoneyExpressionAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMoneyExpressionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoneyExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalSmartContractSpecification.g:1503:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmartContractSpecification.g:1503:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmartContractSpecification.g:1504:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSmartContractSpecification.g:1510:1: ruleExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression | ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        EObject this_ImplyExpression_1 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1516:2: ( (this_ConditionalExpression_0= ruleConditionalExpression | ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression ) ) )
            // InternalSmartContractSpecification.g:1517:2: (this_ConditionalExpression_0= ruleConditionalExpression | ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression ) )
            {
            // InternalSmartContractSpecification.g:1517:2: (this_ConditionalExpression_0= ruleConditionalExpression | ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression ) )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalSmartContractSpecification.g:1518:3: this_ConditionalExpression_0= ruleConditionalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getConditionalExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionalExpression_0=ruleConditionalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionalExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:1527:3: ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression )
                    {
                    // InternalSmartContractSpecification.g:1527:3: ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression )
                    // InternalSmartContractSpecification.g:1528:4: ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getImplyExpressionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ImplyExpression_1=ruleImplyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplyExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleDescriptiveExpression"
    // InternalSmartContractSpecification.g:1542:1: entryRuleDescriptiveExpression returns [EObject current=null] : iv_ruleDescriptiveExpression= ruleDescriptiveExpression EOF ;
    public final EObject entryRuleDescriptiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptiveExpression = null;


        try {
            // InternalSmartContractSpecification.g:1542:62: (iv_ruleDescriptiveExpression= ruleDescriptiveExpression EOF )
            // InternalSmartContractSpecification.g:1543:2: iv_ruleDescriptiveExpression= ruleDescriptiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescriptiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDescriptiveExpression=ruleDescriptiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescriptiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptiveExpression"


    // $ANTLR start "ruleDescriptiveExpression"
    // InternalSmartContractSpecification.g:1549:1: ruleDescriptiveExpression returns [EObject current=null] : ( (lv_plainText_0_0= RULE_PLAINTEXT ) ) ;
    public final EObject ruleDescriptiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_plainText_0_0=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1555:2: ( ( (lv_plainText_0_0= RULE_PLAINTEXT ) ) )
            // InternalSmartContractSpecification.g:1556:2: ( (lv_plainText_0_0= RULE_PLAINTEXT ) )
            {
            // InternalSmartContractSpecification.g:1556:2: ( (lv_plainText_0_0= RULE_PLAINTEXT ) )
            // InternalSmartContractSpecification.g:1557:3: (lv_plainText_0_0= RULE_PLAINTEXT )
            {
            // InternalSmartContractSpecification.g:1557:3: (lv_plainText_0_0= RULE_PLAINTEXT )
            // InternalSmartContractSpecification.g:1558:4: lv_plainText_0_0= RULE_PLAINTEXT
            {
            lv_plainText_0_0=(Token)match(input,RULE_PLAINTEXT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_plainText_0_0, grammarAccess.getDescriptiveExpressionAccess().getPlainTextPLAINTEXTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDescriptiveExpressionRule());
              				}
              				setWithLastConsumed(
              					current,
              					"plainText",
              					lv_plainText_0_0,
              					"edu.ustb.sei.mde.SmartContractSpecification.PLAINTEXT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptiveExpression"


    // $ANTLR start "entryRuleCollectionSourceExpression"
    // InternalSmartContractSpecification.g:1577:1: entryRuleCollectionSourceExpression returns [EObject current=null] : iv_ruleCollectionSourceExpression= ruleCollectionSourceExpression EOF ;
    public final EObject entryRuleCollectionSourceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionSourceExpression = null;


        try {
            // InternalSmartContractSpecification.g:1577:67: (iv_ruleCollectionSourceExpression= ruleCollectionSourceExpression EOF )
            // InternalSmartContractSpecification.g:1578:2: iv_ruleCollectionSourceExpression= ruleCollectionSourceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionSourceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionSourceExpression=ruleCollectionSourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionSourceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionSourceExpression"


    // $ANTLR start "ruleCollectionSourceExpression"
    // InternalSmartContractSpecification.g:1584:1: ruleCollectionSourceExpression returns [EObject current=null] : (this_SlotRef_0= ruleSlotRef ( ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleCollectionSourceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SlotRef_0 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1590:2: ( (this_SlotRef_0= ruleSlotRef ( ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:1591:2: (this_SlotRef_0= ruleSlotRef ( ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:1591:2: (this_SlotRef_0= ruleSlotRef ( ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) ) )? )
            // InternalSmartContractSpecification.g:1592:3: this_SlotRef_0= ruleSlotRef ( ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCollectionSourceExpressionAccess().getSlotRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_SlotRef_0=ruleSlotRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlotRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:1600:3: ( ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) && (synpred2_InternalSmartContractSpecification())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSmartContractSpecification.g:1601:4: ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) ) ( (lv_condition_3_0= ruleExpression ) )
                    {
                    // InternalSmartContractSpecification.g:1601:4: ( ( ( () 'where' ) )=> ( () otherlv_2= 'where' ) )
                    // InternalSmartContractSpecification.g:1602:5: ( ( () 'where' ) )=> ( () otherlv_2= 'where' )
                    {
                    // InternalSmartContractSpecification.g:1608:5: ( () otherlv_2= 'where' )
                    // InternalSmartContractSpecification.g:1609:6: () otherlv_2= 'where'
                    {
                    // InternalSmartContractSpecification.g:1609:6: ()
                    // InternalSmartContractSpecification.g:1610:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getCollectionSourceExpressionAccess().getSelectExpressionSourceAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getCollectionSourceExpressionAccess().getWhereKeyword_1_0_0_1());
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:1622:4: ( (lv_condition_3_0= ruleExpression ) )
                    // InternalSmartContractSpecification.g:1623:5: (lv_condition_3_0= ruleExpression )
                    {
                    // InternalSmartContractSpecification.g:1623:5: (lv_condition_3_0= ruleExpression )
                    // InternalSmartContractSpecification.g:1624:6: lv_condition_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionSourceExpressionAccess().getConditionExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionSourceExpressionRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionSourceExpression"


    // $ANTLR start "entryRuleIteratorDeclExpression"
    // InternalSmartContractSpecification.g:1646:1: entryRuleIteratorDeclExpression returns [EObject current=null] : iv_ruleIteratorDeclExpression= ruleIteratorDeclExpression EOF ;
    public final EObject entryRuleIteratorDeclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorDeclExpression = null;


        try {
            // InternalSmartContractSpecification.g:1646:63: (iv_ruleIteratorDeclExpression= ruleIteratorDeclExpression EOF )
            // InternalSmartContractSpecification.g:1647:2: iv_ruleIteratorDeclExpression= ruleIteratorDeclExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorDeclExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIteratorDeclExpression=ruleIteratorDeclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorDeclExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIteratorDeclExpression"


    // $ANTLR start "ruleIteratorDeclExpression"
    // InternalSmartContractSpecification.g:1653:1: ruleIteratorDeclExpression returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIteratorDeclExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1659:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSmartContractSpecification.g:1660:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSmartContractSpecification.g:1660:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:1661:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:1661:3: (lv_name_0_0= RULE_ID )
            // InternalSmartContractSpecification.g:1662:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getIteratorDeclExpressionAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIteratorDeclExpressionRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIteratorDeclExpression"


    // $ANTLR start "entryRuleQuantifierExpression"
    // InternalSmartContractSpecification.g:1681:1: entryRuleQuantifierExpression returns [EObject current=null] : iv_ruleQuantifierExpression= ruleQuantifierExpression EOF ;
    public final EObject entryRuleQuantifierExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifierExpression = null;


        try {
            // InternalSmartContractSpecification.g:1681:61: (iv_ruleQuantifierExpression= ruleQuantifierExpression EOF )
            // InternalSmartContractSpecification.g:1682:2: iv_ruleQuantifierExpression= ruleQuantifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifierExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuantifierExpression=ruleQuantifierExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifierExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifierExpression"


    // $ANTLR start "ruleQuantifierExpression"
    // InternalSmartContractSpecification.g:1688:1: ruleQuantifierExpression returns [EObject current=null] : ( ( (lv_qunatifier_0_0= ruleQuantifier ) ) ( (lv_iterator_1_0= ruleIteratorDeclExpression ) ) otherlv_2= 'in' ( (lv_scope_3_0= ruleCollectionSourceExpression ) ) otherlv_4= 'such' otherlv_5= 'that' ( (lv_condition_6_0= ruleExpression ) ) ) ;
    public final EObject ruleQuantifierExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_qunatifier_0_0 = null;

        EObject lv_iterator_1_0 = null;

        EObject lv_scope_3_0 = null;

        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1694:2: ( ( ( (lv_qunatifier_0_0= ruleQuantifier ) ) ( (lv_iterator_1_0= ruleIteratorDeclExpression ) ) otherlv_2= 'in' ( (lv_scope_3_0= ruleCollectionSourceExpression ) ) otherlv_4= 'such' otherlv_5= 'that' ( (lv_condition_6_0= ruleExpression ) ) ) )
            // InternalSmartContractSpecification.g:1695:2: ( ( (lv_qunatifier_0_0= ruleQuantifier ) ) ( (lv_iterator_1_0= ruleIteratorDeclExpression ) ) otherlv_2= 'in' ( (lv_scope_3_0= ruleCollectionSourceExpression ) ) otherlv_4= 'such' otherlv_5= 'that' ( (lv_condition_6_0= ruleExpression ) ) )
            {
            // InternalSmartContractSpecification.g:1695:2: ( ( (lv_qunatifier_0_0= ruleQuantifier ) ) ( (lv_iterator_1_0= ruleIteratorDeclExpression ) ) otherlv_2= 'in' ( (lv_scope_3_0= ruleCollectionSourceExpression ) ) otherlv_4= 'such' otherlv_5= 'that' ( (lv_condition_6_0= ruleExpression ) ) )
            // InternalSmartContractSpecification.g:1696:3: ( (lv_qunatifier_0_0= ruleQuantifier ) ) ( (lv_iterator_1_0= ruleIteratorDeclExpression ) ) otherlv_2= 'in' ( (lv_scope_3_0= ruleCollectionSourceExpression ) ) otherlv_4= 'such' otherlv_5= 'that' ( (lv_condition_6_0= ruleExpression ) )
            {
            // InternalSmartContractSpecification.g:1696:3: ( (lv_qunatifier_0_0= ruleQuantifier ) )
            // InternalSmartContractSpecification.g:1697:4: (lv_qunatifier_0_0= ruleQuantifier )
            {
            // InternalSmartContractSpecification.g:1697:4: (lv_qunatifier_0_0= ruleQuantifier )
            // InternalSmartContractSpecification.g:1698:5: lv_qunatifier_0_0= ruleQuantifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuantifierExpressionAccess().getQunatifierQuantifierEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_qunatifier_0_0=ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuantifierExpressionRule());
              					}
              					set(
              						current,
              						"qunatifier",
              						lv_qunatifier_0_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Quantifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:1715:3: ( (lv_iterator_1_0= ruleIteratorDeclExpression ) )
            // InternalSmartContractSpecification.g:1716:4: (lv_iterator_1_0= ruleIteratorDeclExpression )
            {
            // InternalSmartContractSpecification.g:1716:4: (lv_iterator_1_0= ruleIteratorDeclExpression )
            // InternalSmartContractSpecification.g:1717:5: lv_iterator_1_0= ruleIteratorDeclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuantifierExpressionAccess().getIteratorIteratorDeclExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_iterator_1_0=ruleIteratorDeclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuantifierExpressionRule());
              					}
              					set(
              						current,
              						"iterator",
              						lv_iterator_1_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.IteratorDeclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuantifierExpressionAccess().getInKeyword_2());
              		
            }
            // InternalSmartContractSpecification.g:1738:3: ( (lv_scope_3_0= ruleCollectionSourceExpression ) )
            // InternalSmartContractSpecification.g:1739:4: (lv_scope_3_0= ruleCollectionSourceExpression )
            {
            // InternalSmartContractSpecification.g:1739:4: (lv_scope_3_0= ruleCollectionSourceExpression )
            // InternalSmartContractSpecification.g:1740:5: lv_scope_3_0= ruleCollectionSourceExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuantifierExpressionAccess().getScopeCollectionSourceExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_49);
            lv_scope_3_0=ruleCollectionSourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuantifierExpressionRule());
              					}
              					set(
              						current,
              						"scope",
              						lv_scope_3_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.CollectionSourceExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQuantifierExpressionAccess().getSuchKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getQuantifierExpressionAccess().getThatKeyword_5());
              		
            }
            // InternalSmartContractSpecification.g:1765:3: ( (lv_condition_6_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:1766:4: (lv_condition_6_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:1766:4: (lv_condition_6_0= ruleExpression )
            // InternalSmartContractSpecification.g:1767:5: lv_condition_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuantifierExpressionAccess().getConditionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_condition_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuantifierExpressionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_6_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifierExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalSmartContractSpecification.g:1788:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalSmartContractSpecification.g:1788:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalSmartContractSpecification.g:1789:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalSmartContractSpecification.g:1795:1: ruleConditionalExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenBranch_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseBranch_5_0= ruleExpression ) ) ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenBranch_3_0 = null;

        EObject lv_elseBranch_5_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1801:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenBranch_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseBranch_5_0= ruleExpression ) ) ) )
            // InternalSmartContractSpecification.g:1802:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenBranch_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseBranch_5_0= ruleExpression ) ) )
            {
            // InternalSmartContractSpecification.g:1802:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenBranch_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseBranch_5_0= ruleExpression ) ) )
            // InternalSmartContractSpecification.g:1803:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenBranch_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseBranch_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionalExpressionAccess().getIfKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:1807:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:1808:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:1808:4: (lv_condition_1_0= ruleExpression )
            // InternalSmartContractSpecification.g:1809:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_51);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getThenKeyword_2());
              		
            }
            // InternalSmartContractSpecification.g:1830:3: ( (lv_thenBranch_3_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:1831:4: (lv_thenBranch_3_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:1831:4: (lv_thenBranch_3_0= ruleExpression )
            // InternalSmartContractSpecification.g:1832:5: lv_thenBranch_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getThenBranchExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_thenBranch_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
              					}
              					set(
              						current,
              						"thenBranch",
              						lv_thenBranch_3_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getElseKeyword_4());
              		
            }
            // InternalSmartContractSpecification.g:1853:3: ( (lv_elseBranch_5_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:1854:4: (lv_elseBranch_5_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:1854:4: (lv_elseBranch_5_0= ruleExpression )
            // InternalSmartContractSpecification.g:1855:5: lv_elseBranch_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getElseBranchExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_elseBranch_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
              					}
              					set(
              						current,
              						"elseBranch",
              						lv_elseBranch_5_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleImplyExpression"
    // InternalSmartContractSpecification.g:1876:1: entryRuleImplyExpression returns [EObject current=null] : iv_ruleImplyExpression= ruleImplyExpression EOF ;
    public final EObject entryRuleImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpression = null;


        try {
            // InternalSmartContractSpecification.g:1876:56: (iv_ruleImplyExpression= ruleImplyExpression EOF )
            // InternalSmartContractSpecification.g:1877:2: iv_ruleImplyExpression= ruleImplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImplyExpression=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplyExpression"


    // $ANTLR start "ruleImplyExpression"
    // InternalSmartContractSpecification.g:1883:1: ruleImplyExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleImplyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_implied_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1889:2: ( (this_OrExpression_0= ruleOrExpression ( ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:1890:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:1890:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) ) )? )
            // InternalSmartContractSpecification.g:1891:3: this_OrExpression_0= ruleOrExpression ( ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImplyExpressionAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:1899:3: ( ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred3_InternalSmartContractSpecification()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalSmartContractSpecification.g:1900:4: ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) ) ( (lv_implied_3_0= ruleExpression ) )
                    {
                    // InternalSmartContractSpecification.g:1900:4: ( ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' ) )
                    // InternalSmartContractSpecification.g:1901:5: ( ( () 'implies' ) )=> ( () otherlv_2= 'implies' )
                    {
                    // InternalSmartContractSpecification.g:1907:5: ( () otherlv_2= 'implies' )
                    // InternalSmartContractSpecification.g:1908:6: () otherlv_2= 'implies'
                    {
                    // InternalSmartContractSpecification.g:1908:6: ()
                    // InternalSmartContractSpecification.g:1909:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getImplyExpressionAccess().getImplyExpressionConditionAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getImplyExpressionAccess().getImpliesKeyword_1_0_0_1());
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:1921:4: ( (lv_implied_3_0= ruleExpression ) )
                    // InternalSmartContractSpecification.g:1922:5: (lv_implied_3_0= ruleExpression )
                    {
                    // InternalSmartContractSpecification.g:1922:5: (lv_implied_3_0= ruleExpression )
                    // InternalSmartContractSpecification.g:1923:6: lv_implied_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImplyExpressionAccess().getImpliedExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_implied_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImplyExpressionRule());
                      						}
                      						set(
                      							current,
                      							"implied",
                      							lv_implied_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplyExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalSmartContractSpecification.g:1945:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalSmartContractSpecification.g:1945:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalSmartContractSpecification.g:1946:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalSmartContractSpecification.g:1952:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:1958:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:1959:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:1959:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) ) )? )
            // InternalSmartContractSpecification.g:1960:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:1968:3: ( ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred4_InternalSmartContractSpecification()) ) {
                    alt46=1;
                }
            }
            else if ( (LA46_0==52) ) {
                int LA46_2 = input.LA(2);

                if ( (synpred4_InternalSmartContractSpecification()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalSmartContractSpecification.g:1969:4: ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ) ( (lv_right_4_0= ruleOrExpression ) )
                    {
                    // InternalSmartContractSpecification.g:1969:4: ( ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) )
                    // InternalSmartContractSpecification.g:1970:5: ( ( () ( 'or' | '||' ) ) )=> ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
                    {
                    // InternalSmartContractSpecification.g:1980:5: ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
                    // InternalSmartContractSpecification.g:1981:6: () (otherlv_2= 'or' | otherlv_3= '||' )
                    {
                    // InternalSmartContractSpecification.g:1981:6: ()
                    // InternalSmartContractSpecification.g:1982:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalSmartContractSpecification.g:1988:6: (otherlv_2= 'or' | otherlv_3= '||' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==51) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==52) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalSmartContractSpecification.g:1989:7: otherlv_2= 'or'
                            {
                            otherlv_2=(Token)match(input,51,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_0_0_1_0());
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalSmartContractSpecification.g:1994:7: otherlv_3= '||'
                            {
                            otherlv_3=(Token)match(input,52,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0_0_1_1());
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSmartContractSpecification.g:2001:4: ( (lv_right_4_0= ruleOrExpression ) )
                    // InternalSmartContractSpecification.g:2002:5: (lv_right_4_0= ruleOrExpression )
                    {
                    // InternalSmartContractSpecification.g:2002:5: (lv_right_4_0= ruleOrExpression )
                    // InternalSmartContractSpecification.g:2003:6: lv_right_4_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_4_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_4_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.OrExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalSmartContractSpecification.g:2025:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalSmartContractSpecification.g:2025:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalSmartContractSpecification.g:2026:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalSmartContractSpecification.g:2032:1: ruleAndExpression returns [EObject current=null] : (this_AndExpressionChild_0= ruleAndExpressionChild ( ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AndExpressionChild_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2038:2: ( (this_AndExpressionChild_0= ruleAndExpressionChild ( ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:2039:2: (this_AndExpressionChild_0= ruleAndExpressionChild ( ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:2039:2: (this_AndExpressionChild_0= ruleAndExpressionChild ( ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) ) )? )
            // InternalSmartContractSpecification.g:2040:3: this_AndExpressionChild_0= ruleAndExpressionChild ( ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getAndExpressionChildParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_AndExpressionChild_0=ruleAndExpressionChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpressionChild_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:2048:3: ( ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred5_InternalSmartContractSpecification()) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==54) ) {
                int LA48_2 = input.LA(2);

                if ( (synpred5_InternalSmartContractSpecification()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalSmartContractSpecification.g:2049:4: ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ) ( (lv_right_4_0= ruleAndExpression ) )
                    {
                    // InternalSmartContractSpecification.g:2049:4: ( ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) )
                    // InternalSmartContractSpecification.g:2050:5: ( ( () ( 'and' | '&&' ) ) )=> ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
                    {
                    // InternalSmartContractSpecification.g:2060:5: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
                    // InternalSmartContractSpecification.g:2061:6: () (otherlv_2= 'and' | otherlv_3= '&&' )
                    {
                    // InternalSmartContractSpecification.g:2061:6: ()
                    // InternalSmartContractSpecification.g:2062:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalSmartContractSpecification.g:2068:6: (otherlv_2= 'and' | otherlv_3= '&&' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==53) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==54) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalSmartContractSpecification.g:2069:7: otherlv_2= 'and'
                            {
                            otherlv_2=(Token)match(input,53,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_0_0_1_0());
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalSmartContractSpecification.g:2074:7: otherlv_3= '&&'
                            {
                            otherlv_3=(Token)match(input,54,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0_0_1_1());
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSmartContractSpecification.g:2081:4: ( (lv_right_4_0= ruleAndExpression ) )
                    // InternalSmartContractSpecification.g:2082:5: (lv_right_4_0= ruleAndExpression )
                    {
                    // InternalSmartContractSpecification.g:2082:5: (lv_right_4_0= ruleAndExpression )
                    // InternalSmartContractSpecification.g:2083:6: lv_right_4_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_4_0=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_4_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.AndExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndExpressionChild"
    // InternalSmartContractSpecification.g:2105:1: entryRuleAndExpressionChild returns [EObject current=null] : iv_ruleAndExpressionChild= ruleAndExpressionChild EOF ;
    public final EObject entryRuleAndExpressionChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionChild = null;


        try {
            // InternalSmartContractSpecification.g:2105:59: (iv_ruleAndExpressionChild= ruleAndExpressionChild EOF )
            // InternalSmartContractSpecification.g:2106:2: iv_ruleAndExpressionChild= ruleAndExpressionChild EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionChildRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpressionChild=ruleAndExpressionChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpressionChild; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpressionChild"


    // $ANTLR start "ruleAndExpressionChild"
    // InternalSmartContractSpecification.g:2112:1: ruleAndExpressionChild returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_RelationalExpression_1= ruleRelationalExpression ) ;
    public final EObject ruleAndExpressionChild() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_RelationalExpression_1 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2118:2: ( (this_NotExpression_0= ruleNotExpression | this_RelationalExpression_1= ruleRelationalExpression ) )
            // InternalSmartContractSpecification.g:2119:2: (this_NotExpression_0= ruleNotExpression | this_RelationalExpression_1= ruleRelationalExpression )
            {
            // InternalSmartContractSpecification.g:2119:2: (this_NotExpression_0= ruleNotExpression | this_RelationalExpression_1= ruleRelationalExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            else if ( (LA49_0==EOF||LA49_0==RULE_ID||(LA49_0>=RULE_INT && LA49_0<=RULE_STRING)||LA49_0==15||(LA49_0>=27 && LA49_0<=29)||(LA49_0>=35 && LA49_0<=36)||(LA49_0>=38 && LA49_0<=42)||LA49_0==45||(LA49_0>=48 && LA49_0<=54)||(LA49_0>=56 && LA49_0<=62)||(LA49_0>=64 && LA49_0<=69)||LA49_0==73||(LA49_0>=82 && LA49_0<=96)||(LA49_0>=98 && LA49_0<=105)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSmartContractSpecification.g:2120:3: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAndExpressionChildAccess().getNotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:2129:3: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAndExpressionChildAccess().getRelationalExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationalExpression_1=ruleRelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationalExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpressionChild"


    // $ANTLR start "entryRuleNotExpression"
    // InternalSmartContractSpecification.g:2141:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalSmartContractSpecification.g:2141:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSmartContractSpecification.g:2142:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalSmartContractSpecification.g:2148:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= 'not' ( (lv_inner_1_0= ruleRelationalExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inner_1_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2154:2: ( (otherlv_0= 'not' ( (lv_inner_1_0= ruleRelationalExpression ) ) ) )
            // InternalSmartContractSpecification.g:2155:2: (otherlv_0= 'not' ( (lv_inner_1_0= ruleRelationalExpression ) ) )
            {
            // InternalSmartContractSpecification.g:2155:2: (otherlv_0= 'not' ( (lv_inner_1_0= ruleRelationalExpression ) ) )
            // InternalSmartContractSpecification.g:2156:3: otherlv_0= 'not' ( (lv_inner_1_0= ruleRelationalExpression ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getNotKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:2160:3: ( (lv_inner_1_0= ruleRelationalExpression ) )
            // InternalSmartContractSpecification.g:2161:4: (lv_inner_1_0= ruleRelationalExpression )
            {
            // InternalSmartContractSpecification.g:2161:4: (lv_inner_1_0= ruleRelationalExpression )
            // InternalSmartContractSpecification.g:2162:5: lv_inner_1_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getInnerRelationalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_inner_1_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"inner",
              						lv_inner_1_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.RelationalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalSmartContractSpecification.g:2183:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalSmartContractSpecification.g:2183:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalSmartContractSpecification.g:2184:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalSmartContractSpecification.g:2190:1: ruleRelationalExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2196:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:2197:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:2197:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? )
            // InternalSmartContractSpecification.g:2198:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getArithmeticExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithmeticExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:2206:3: ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalSmartContractSpecification.g:2207:4: ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalSmartContractSpecification.g:2207:4: ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) )
                    // InternalSmartContractSpecification.g:2208:5: ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) )
                    {
                    // InternalSmartContractSpecification.g:2218:5: ( () ( (lv_operator_2_0= ruleRelationOperator ) ) )
                    // InternalSmartContractSpecification.g:2219:6: () ( (lv_operator_2_0= ruleRelationOperator ) )
                    {
                    // InternalSmartContractSpecification.g:2219:6: ()
                    // InternalSmartContractSpecification.g:2220:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalSmartContractSpecification.g:2226:6: ( (lv_operator_2_0= ruleRelationOperator ) )
                    // InternalSmartContractSpecification.g:2227:7: (lv_operator_2_0= ruleRelationOperator )
                    {
                    // InternalSmartContractSpecification.g:2227:7: (lv_operator_2_0= ruleRelationOperator )
                    // InternalSmartContractSpecification.g:2228:8: lv_operator_2_0= ruleRelationOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationOperatorEnumRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_34);
                    lv_operator_2_0=ruleRelationOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"edu.ustb.sei.mde.SmartContractSpecification.RelationOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalSmartContractSpecification.g:2247:4: ( (lv_right_3_0= ruleArithmeticExpression ) )
                    // InternalSmartContractSpecification.g:2248:5: (lv_right_3_0= ruleArithmeticExpression )
                    {
                    // InternalSmartContractSpecification.g:2248:5: (lv_right_3_0= ruleArithmeticExpression )
                    // InternalSmartContractSpecification.g:2249:6: lv_right_3_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightArithmeticExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.ArithmeticExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalSmartContractSpecification.g:2271:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalSmartContractSpecification.g:2271:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalSmartContractSpecification.g:2272:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalSmartContractSpecification.g:2278:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2284:2: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // InternalSmartContractSpecification.g:2285:2: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_AdditiveExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalSmartContractSpecification.g:2296:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalSmartContractSpecification.g:2296:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalSmartContractSpecification.g:2297:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalSmartContractSpecification.g:2303:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2309:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:2310:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:2310:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )? )
            // InternalSmartContractSpecification.g:2311:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:2319:3: ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==29) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred7_InternalSmartContractSpecification()) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==65) ) {
                int LA51_2 = input.LA(2);

                if ( (synpred7_InternalSmartContractSpecification()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalSmartContractSpecification.g:2320:4: ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
                    {
                    // InternalSmartContractSpecification.g:2320:4: ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) )
                    // InternalSmartContractSpecification.g:2321:5: ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) )
                    {
                    // InternalSmartContractSpecification.g:2331:5: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) )
                    // InternalSmartContractSpecification.g:2332:6: () ( (lv_operator_2_0= ruleAdditiveOperator ) )
                    {
                    // InternalSmartContractSpecification.g:2332:6: ()
                    // InternalSmartContractSpecification.g:2333:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalSmartContractSpecification.g:2339:6: ( (lv_operator_2_0= ruleAdditiveOperator ) )
                    // InternalSmartContractSpecification.g:2340:7: (lv_operator_2_0= ruleAdditiveOperator )
                    {
                    // InternalSmartContractSpecification.g:2340:7: (lv_operator_2_0= ruleAdditiveOperator )
                    // InternalSmartContractSpecification.g:2341:8: lv_operator_2_0= ruleAdditiveOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_34);
                    lv_operator_2_0=ruleAdditiveOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"edu.ustb.sei.mde.SmartContractSpecification.AdditiveOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalSmartContractSpecification.g:2360:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
                    // InternalSmartContractSpecification.g:2361:5: (lv_right_3_0= ruleMultiplicativeExpression )
                    {
                    // InternalSmartContractSpecification.g:2361:5: (lv_right_3_0= ruleMultiplicativeExpression )
                    // InternalSmartContractSpecification.g:2362:6: lv_right_3_0= ruleMultiplicativeExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleMultiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.MultiplicativeExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalSmartContractSpecification.g:2384:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalSmartContractSpecification.g:2384:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalSmartContractSpecification.g:2385:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalSmartContractSpecification.g:2391:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_AtomExpression_0= ruleAtomExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) ) )? ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2397:2: ( (this_AtomExpression_0= ruleAtomExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) ) )? ) )
            // InternalSmartContractSpecification.g:2398:2: (this_AtomExpression_0= ruleAtomExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) ) )? )
            {
            // InternalSmartContractSpecification.g:2398:2: (this_AtomExpression_0= ruleAtomExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) ) )? )
            // InternalSmartContractSpecification.g:2399:3: this_AtomExpression_0= ruleAtomExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_AtomExpression_0=ruleAtomExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AtomExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmartContractSpecification.g:2407:3: ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==95) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred8_InternalSmartContractSpecification()) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==96) ) {
                int LA52_2 = input.LA(2);

                if ( (synpred8_InternalSmartContractSpecification()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalSmartContractSpecification.g:2408:4: ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleAtomExpression ) )
                    {
                    // InternalSmartContractSpecification.g:2408:4: ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) )
                    // InternalSmartContractSpecification.g:2409:5: ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) )
                    {
                    // InternalSmartContractSpecification.g:2419:5: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) )
                    // InternalSmartContractSpecification.g:2420:6: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
                    {
                    // InternalSmartContractSpecification.g:2420:6: ()
                    // InternalSmartContractSpecification.g:2421:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalSmartContractSpecification.g:2427:6: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
                    // InternalSmartContractSpecification.g:2428:7: (lv_operator_2_0= ruleMultiplicativeOperator )
                    {
                    // InternalSmartContractSpecification.g:2428:7: (lv_operator_2_0= ruleMultiplicativeOperator )
                    // InternalSmartContractSpecification.g:2429:8: lv_operator_2_0= ruleMultiplicativeOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_34);
                    lv_operator_2_0=ruleMultiplicativeOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"edu.ustb.sei.mde.SmartContractSpecification.MultiplicativeOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalSmartContractSpecification.g:2448:4: ( (lv_right_3_0= ruleAtomExpression ) )
                    // InternalSmartContractSpecification.g:2449:5: (lv_right_3_0= ruleAtomExpression )
                    {
                    // InternalSmartContractSpecification.g:2449:5: (lv_right_3_0= ruleAtomExpression )
                    // InternalSmartContractSpecification.g:2450:6: lv_right_3_0= ruleAtomExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightAtomExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAtomExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.AtomExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleAtomExpression"
    // InternalSmartContractSpecification.g:2472:1: entryRuleAtomExpression returns [EObject current=null] : iv_ruleAtomExpression= ruleAtomExpression EOF ;
    public final EObject entryRuleAtomExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpression = null;


        try {
            // InternalSmartContractSpecification.g:2472:55: (iv_ruleAtomExpression= ruleAtomExpression EOF )
            // InternalSmartContractSpecification.g:2473:2: iv_ruleAtomExpression= ruleAtomExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomExpression=ruleAtomExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomExpression"


    // $ANTLR start "ruleAtomExpression"
    // InternalSmartContractSpecification.g:2479:1: ruleAtomExpression returns [EObject current=null] : ( ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression ) | this_TimePredicate_1= ruleTimePredicate | this_SlotRef_2= ruleSlotRef | this_ThisExpression_3= ruleThisExpression | this_QuantifierExpression_4= ruleQuantifierExpression | this_DescriptiveExpression_5= ruleDescriptiveExpression | this_GlobalTimeQuery_6= ruleGlobalTimeQuery | this_TimeConstant_7= ruleTimeConstant | this_TimeQuery_8= ruleTimeQuery | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) ) ;
    public final EObject ruleAtomExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_ConstantExpression_0 = null;

        EObject this_TimePredicate_1 = null;

        EObject this_SlotRef_2 = null;

        EObject this_ThisExpression_3 = null;

        EObject this_QuantifierExpression_4 = null;

        EObject this_DescriptiveExpression_5 = null;

        EObject this_GlobalTimeQuery_6 = null;

        EObject this_TimeConstant_7 = null;

        EObject this_TimeQuery_8 = null;

        EObject this_Expression_10 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2485:2: ( ( ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression ) | this_TimePredicate_1= ruleTimePredicate | this_SlotRef_2= ruleSlotRef | this_ThisExpression_3= ruleThisExpression | this_QuantifierExpression_4= ruleQuantifierExpression | this_DescriptiveExpression_5= ruleDescriptiveExpression | this_GlobalTimeQuery_6= ruleGlobalTimeQuery | this_TimeConstant_7= ruleTimeConstant | this_TimeQuery_8= ruleTimeQuery | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) ) )
            // InternalSmartContractSpecification.g:2486:2: ( ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression ) | this_TimePredicate_1= ruleTimePredicate | this_SlotRef_2= ruleSlotRef | this_ThisExpression_3= ruleThisExpression | this_QuantifierExpression_4= ruleQuantifierExpression | this_DescriptiveExpression_5= ruleDescriptiveExpression | this_GlobalTimeQuery_6= ruleGlobalTimeQuery | this_TimeConstant_7= ruleTimeConstant | this_TimeQuery_8= ruleTimeQuery | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) )
            {
            // InternalSmartContractSpecification.g:2486:2: ( ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression ) | this_TimePredicate_1= ruleTimePredicate | this_SlotRef_2= ruleSlotRef | this_ThisExpression_3= ruleThisExpression | this_QuantifierExpression_4= ruleQuantifierExpression | this_DescriptiveExpression_5= ruleDescriptiveExpression | this_GlobalTimeQuery_6= ruleGlobalTimeQuery | this_TimeConstant_7= ruleTimeConstant | this_TimeQuery_8= ruleTimeQuery | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) )
            int alt53=10;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalSmartContractSpecification.g:2487:3: ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression )
                    {
                    // InternalSmartContractSpecification.g:2487:3: ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression )
                    // InternalSmartContractSpecification.g:2488:4: ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomExpressionAccess().getConstantExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConstantExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:2499:3: this_TimePredicate_1= ruleTimePredicate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getTimePredicateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimePredicate_1=ruleTimePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimePredicate_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:2508:3: this_SlotRef_2= ruleSlotRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getSlotRefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SlotRef_2=ruleSlotRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SlotRef_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:2517:3: this_ThisExpression_3= ruleThisExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getThisExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ThisExpression_3=ruleThisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ThisExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:2526:3: this_QuantifierExpression_4= ruleQuantifierExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getQuantifierExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QuantifierExpression_4=ruleQuantifierExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QuantifierExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSmartContractSpecification.g:2535:3: this_DescriptiveExpression_5= ruleDescriptiveExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getDescriptiveExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DescriptiveExpression_5=ruleDescriptiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescriptiveExpression_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSmartContractSpecification.g:2544:3: this_GlobalTimeQuery_6= ruleGlobalTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getGlobalTimeQueryParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GlobalTimeQuery_6=ruleGlobalTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GlobalTimeQuery_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSmartContractSpecification.g:2553:3: this_TimeConstant_7= ruleTimeConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getTimeConstantParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeConstant_7=ruleTimeConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeConstant_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalSmartContractSpecification.g:2562:3: this_TimeQuery_8= ruleTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomExpressionAccess().getTimeQueryParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeQuery_8=ruleTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeQuery_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalSmartContractSpecification.g:2571:3: (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' )
                    {
                    // InternalSmartContractSpecification.g:2571:3: (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' )
                    // InternalSmartContractSpecification.g:2572:4: otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAtomExpressionAccess().getLeftParenthesisKeyword_9_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomExpressionAccess().getExpressionParserRuleCall_9_1());
                      			
                    }
                    pushFollow(FOLLOW_59);
                    this_Expression_10=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_11=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAtomExpressionAccess().getRightParenthesisKeyword_9_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomExpression"


    // $ANTLR start "entryRuleThisExpression"
    // InternalSmartContractSpecification.g:2593:1: entryRuleThisExpression returns [EObject current=null] : iv_ruleThisExpression= ruleThisExpression EOF ;
    public final EObject entryRuleThisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisExpression = null;


        try {
            // InternalSmartContractSpecification.g:2593:55: (iv_ruleThisExpression= ruleThisExpression EOF )
            // InternalSmartContractSpecification.g:2594:2: iv_ruleThisExpression= ruleThisExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThisExpression=ruleThisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThisExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThisExpression"


    // $ANTLR start "ruleThisExpression"
    // InternalSmartContractSpecification.g:2600:1: ruleThisExpression returns [EObject current=null] : ( () ( (otherlv_1= 'this' (this_ID_2= RULE_ID )? ) | otherlv_3= 'he' | otherlv_4= 'she' | otherlv_5= 'his' | otherlv_6= 'her' | otherlv_7= 'himself' | otherlv_8= 'herself' ) (otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) ) )? ) ;
    public final EObject ruleThisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_transitive_10_0 = null;

        EObject lv_next_11_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2606:2: ( ( () ( (otherlv_1= 'this' (this_ID_2= RULE_ID )? ) | otherlv_3= 'he' | otherlv_4= 'she' | otherlv_5= 'his' | otherlv_6= 'her' | otherlv_7= 'himself' | otherlv_8= 'herself' ) (otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) ) )? ) )
            // InternalSmartContractSpecification.g:2607:2: ( () ( (otherlv_1= 'this' (this_ID_2= RULE_ID )? ) | otherlv_3= 'he' | otherlv_4= 'she' | otherlv_5= 'his' | otherlv_6= 'her' | otherlv_7= 'himself' | otherlv_8= 'herself' ) (otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) ) )? )
            {
            // InternalSmartContractSpecification.g:2607:2: ( () ( (otherlv_1= 'this' (this_ID_2= RULE_ID )? ) | otherlv_3= 'he' | otherlv_4= 'she' | otherlv_5= 'his' | otherlv_6= 'her' | otherlv_7= 'himself' | otherlv_8= 'herself' ) (otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) ) )? )
            // InternalSmartContractSpecification.g:2608:3: () ( (otherlv_1= 'this' (this_ID_2= RULE_ID )? ) | otherlv_3= 'he' | otherlv_4= 'she' | otherlv_5= 'his' | otherlv_6= 'her' | otherlv_7= 'himself' | otherlv_8= 'herself' ) (otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) ) )?
            {
            // InternalSmartContractSpecification.g:2608:3: ()
            // InternalSmartContractSpecification.g:2609:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getThisExpressionAccess().getThisExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSmartContractSpecification.g:2615:3: ( (otherlv_1= 'this' (this_ID_2= RULE_ID )? ) | otherlv_3= 'he' | otherlv_4= 'she' | otherlv_5= 'his' | otherlv_6= 'her' | otherlv_7= 'himself' | otherlv_8= 'herself' )
            int alt55=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt55=1;
                }
                break;
            case 57:
                {
                alt55=2;
                }
                break;
            case 58:
                {
                alt55=3;
                }
                break;
            case 59:
                {
                alt55=4;
                }
                break;
            case 60:
                {
                alt55=5;
                }
                break;
            case 61:
                {
                alt55=6;
                }
                break;
            case 62:
                {
                alt55=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalSmartContractSpecification.g:2616:4: (otherlv_1= 'this' (this_ID_2= RULE_ID )? )
                    {
                    // InternalSmartContractSpecification.g:2616:4: (otherlv_1= 'this' (this_ID_2= RULE_ID )? )
                    // InternalSmartContractSpecification.g:2617:5: otherlv_1= 'this' (this_ID_2= RULE_ID )?
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getThisExpressionAccess().getThisKeyword_1_0_0());
                      				
                    }
                    // InternalSmartContractSpecification.g:2621:5: (this_ID_2= RULE_ID )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSmartContractSpecification.g:2622:6: this_ID_2= RULE_ID
                            {
                            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_ID_2, grammarAccess.getThisExpressionAccess().getIDTerminalRuleCall_1_0_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:2629:4: otherlv_3= 'he'
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getThisExpressionAccess().getHeKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:2634:4: otherlv_4= 'she'
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getThisExpressionAccess().getSheKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:2639:4: otherlv_5= 'his'
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getThisExpressionAccess().getHisKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:2644:4: otherlv_6= 'her'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getThisExpressionAccess().getHerKeyword_1_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalSmartContractSpecification.g:2649:4: otherlv_7= 'himself'
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getThisExpressionAccess().getHimselfKeyword_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalSmartContractSpecification.g:2654:4: otherlv_8= 'herself'
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getThisExpressionAccess().getHerselfKeyword_1_6());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:2659:3: (otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==63) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSmartContractSpecification.g:2660:4: otherlv_9= '::' ( (lv_transitive_10_0= ruleTransitiveOperator ) )? ( (lv_next_11_0= ruleSlotRef ) )
                    {
                    otherlv_9=(Token)match(input,63,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getThisExpressionAccess().getColonColonKeyword_2_0());
                      			
                    }
                    // InternalSmartContractSpecification.g:2664:4: ( (lv_transitive_10_0= ruleTransitiveOperator ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==95||LA56_0==97) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSmartContractSpecification.g:2665:5: (lv_transitive_10_0= ruleTransitiveOperator )
                            {
                            // InternalSmartContractSpecification.g:2665:5: (lv_transitive_10_0= ruleTransitiveOperator )
                            // InternalSmartContractSpecification.g:2666:6: lv_transitive_10_0= ruleTransitiveOperator
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getThisExpressionAccess().getTransitiveTransitiveOperatorEnumRuleCall_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_3);
                            lv_transitive_10_0=ruleTransitiveOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getThisExpressionRule());
                              						}
                              						set(
                              							current,
                              							"transitive",
                              							lv_transitive_10_0,
                              							"edu.ustb.sei.mde.SmartContractSpecification.TransitiveOperator");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:2683:4: ( (lv_next_11_0= ruleSlotRef ) )
                    // InternalSmartContractSpecification.g:2684:5: (lv_next_11_0= ruleSlotRef )
                    {
                    // InternalSmartContractSpecification.g:2684:5: (lv_next_11_0= ruleSlotRef )
                    // InternalSmartContractSpecification.g:2685:6: lv_next_11_0= ruleSlotRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getThisExpressionAccess().getNextSlotRefParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_11_0=ruleSlotRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getThisExpressionRule());
                      						}
                      						set(
                      							current,
                      							"next",
                      							lv_next_11_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.SlotRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThisExpression"


    // $ANTLR start "entryRuleSlotRef"
    // InternalSmartContractSpecification.g:2707:1: entryRuleSlotRef returns [EObject current=null] : iv_ruleSlotRef= ruleSlotRef EOF ;
    public final EObject entryRuleSlotRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotRef = null;


        try {
            // InternalSmartContractSpecification.g:2707:48: (iv_ruleSlotRef= ruleSlotRef EOF )
            // InternalSmartContractSpecification.g:2708:2: iv_ruleSlotRef= ruleSlotRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSlotRef=ruleSlotRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlotRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSlotRef"


    // $ANTLR start "ruleSlotRef"
    // InternalSmartContractSpecification.g:2714:1: ruleSlotRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) ) )? ) ;
    public final EObject ruleSlotRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_transitive_2_0 = null;

        EObject lv_next_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2720:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) ) )? ) )
            // InternalSmartContractSpecification.g:2721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) ) )? )
            {
            // InternalSmartContractSpecification.g:2721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) ) )? )
            // InternalSmartContractSpecification.g:2722:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) ) )?
            {
            // InternalSmartContractSpecification.g:2722:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:2723:4: (otherlv_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:2723:4: (otherlv_0= RULE_ID )
            // InternalSmartContractSpecification.g:2724:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlotRefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSlotRefAccess().getSlotDataSlotCrossReference_0_0());
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:2735:3: (otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==63) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSmartContractSpecification.g:2736:4: otherlv_1= '::' ( (lv_transitive_2_0= ruleTransitiveOperator ) )? ( (lv_next_3_0= ruleSlotRef ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlotRefAccess().getColonColonKeyword_1_0());
                      			
                    }
                    // InternalSmartContractSpecification.g:2740:4: ( (lv_transitive_2_0= ruleTransitiveOperator ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==95||LA58_0==97) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSmartContractSpecification.g:2741:5: (lv_transitive_2_0= ruleTransitiveOperator )
                            {
                            // InternalSmartContractSpecification.g:2741:5: (lv_transitive_2_0= ruleTransitiveOperator )
                            // InternalSmartContractSpecification.g:2742:6: lv_transitive_2_0= ruleTransitiveOperator
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlotRefAccess().getTransitiveTransitiveOperatorEnumRuleCall_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_3);
                            lv_transitive_2_0=ruleTransitiveOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlotRefRule());
                              						}
                              						set(
                              							current,
                              							"transitive",
                              							lv_transitive_2_0,
                              							"edu.ustb.sei.mde.SmartContractSpecification.TransitiveOperator");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:2759:4: ( (lv_next_3_0= ruleSlotRef ) )
                    // InternalSmartContractSpecification.g:2760:5: (lv_next_3_0= ruleSlotRef )
                    {
                    // InternalSmartContractSpecification.g:2760:5: (lv_next_3_0= ruleSlotRef )
                    // InternalSmartContractSpecification.g:2761:6: lv_next_3_0= ruleSlotRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlotRefAccess().getNextSlotRefParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_3_0=ruleSlotRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlotRefRule());
                      						}
                      						set(
                      							current,
                      							"next",
                      							lv_next_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.SlotRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlotRef"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalSmartContractSpecification.g:2783:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalSmartContractSpecification.g:2783:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalSmartContractSpecification.g:2784:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalSmartContractSpecification.g:2790:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleInteger ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleFloat ) ) ) | ( () ( (lv_value_9_0= 'value' ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_9_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2796:2: ( ( ( () ( (lv_value_1_0= ruleInteger ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleFloat ) ) ) | ( () ( (lv_value_9_0= 'value' ) ) ) ) )
            // InternalSmartContractSpecification.g:2797:2: ( ( () ( (lv_value_1_0= ruleInteger ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleFloat ) ) ) | ( () ( (lv_value_9_0= 'value' ) ) ) )
            {
            // InternalSmartContractSpecification.g:2797:2: ( ( () ( (lv_value_1_0= ruleInteger ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleFloat ) ) ) | ( () ( (lv_value_9_0= 'value' ) ) ) )
            int alt60=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_INT) ) {
                    int LA60_2 = input.LA(3);

                    if ( (LA60_2==EOF||(LA60_2>=28 && LA60_2<=29)||(LA60_2>=35 && LA60_2<=36)||(LA60_2>=38 && LA60_2<=42)||LA60_2==45||(LA60_2>=48 && LA60_2<=54)||LA60_2==65||LA60_2==73||(LA60_2>=87 && LA60_2<=96)) ) {
                        alt60=1;
                    }
                    else if ( (LA60_2==15) ) {
                        int LA60_8 = input.LA(4);

                        if ( (LA60_8==EOF||LA60_8==RULE_INT||LA60_8==15||(LA60_8>=28 && LA60_8<=29)||(LA60_8>=35 && LA60_8<=36)||(LA60_8>=38 && LA60_8<=42)||LA60_8==45||(LA60_8>=48 && LA60_8<=54)||LA60_8==65||LA60_8==73||(LA60_8>=87 && LA60_8<=96)) ) {
                            alt60=4;
                        }
                        else if ( ((LA60_8>=16 && LA60_8<=18)||(LA60_8>=30 && LA60_8<=32)) ) {
                            alt60=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 60, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA60_1==15) ) {
                    alt60=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==EOF||(LA60_2>=28 && LA60_2<=29)||(LA60_2>=35 && LA60_2<=36)||(LA60_2>=38 && LA60_2<=42)||LA60_2==45||(LA60_2>=48 && LA60_2<=54)||LA60_2==65||LA60_2==73||(LA60_2>=87 && LA60_2<=96)) ) {
                    alt60=1;
                }
                else if ( (LA60_2==15) ) {
                    int LA60_8 = input.LA(3);

                    if ( (LA60_8==EOF||LA60_8==RULE_INT||LA60_8==15||(LA60_8>=28 && LA60_8<=29)||(LA60_8>=35 && LA60_8<=36)||(LA60_8>=38 && LA60_8<=42)||LA60_8==45||(LA60_8>=48 && LA60_8<=54)||LA60_8==65||LA60_8==73||(LA60_8>=87 && LA60_8<=96)) ) {
                        alt60=4;
                    }
                    else if ( ((LA60_8>=16 && LA60_8<=18)||(LA60_8>=30 && LA60_8<=32)) ) {
                        alt60=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 8, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt60=2;
                }
                break;
            case 66:
            case 67:
                {
                alt60=3;
                }
                break;
            case 15:
            case 29:
                {
                alt60=4;
                }
                break;
            case 64:
                {
                alt60=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSmartContractSpecification.g:2798:3: ( () ( (lv_value_1_0= ruleInteger ) ) )
                    {
                    // InternalSmartContractSpecification.g:2798:3: ( () ( (lv_value_1_0= ruleInteger ) ) )
                    // InternalSmartContractSpecification.g:2799:4: () ( (lv_value_1_0= ruleInteger ) )
                    {
                    // InternalSmartContractSpecification.g:2799:4: ()
                    // InternalSmartContractSpecification.g:2800:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getIntegerConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:2806:4: ( (lv_value_1_0= ruleInteger ) )
                    // InternalSmartContractSpecification.g:2807:5: (lv_value_1_0= ruleInteger )
                    {
                    // InternalSmartContractSpecification.g:2807:5: (lv_value_1_0= ruleInteger )
                    // InternalSmartContractSpecification.g:2808:6: lv_value_1_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstantExpressionAccess().getValueIntegerParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstantExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Integer");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:2827:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalSmartContractSpecification.g:2827:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalSmartContractSpecification.g:2828:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalSmartContractSpecification.g:2828:4: ()
                    // InternalSmartContractSpecification.g:2829:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:2835:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalSmartContractSpecification.g:2836:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalSmartContractSpecification.g:2836:5: (lv_value_3_0= RULE_STRING )
                    // InternalSmartContractSpecification.g:2837:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getConstantExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstantExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:2855:3: ( () ( (lv_value_5_0= ruleBoolean ) ) )
                    {
                    // InternalSmartContractSpecification.g:2855:3: ( () ( (lv_value_5_0= ruleBoolean ) ) )
                    // InternalSmartContractSpecification.g:2856:4: () ( (lv_value_5_0= ruleBoolean ) )
                    {
                    // InternalSmartContractSpecification.g:2856:4: ()
                    // InternalSmartContractSpecification.g:2857:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getBooleanconstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:2863:4: ( (lv_value_5_0= ruleBoolean ) )
                    // InternalSmartContractSpecification.g:2864:5: (lv_value_5_0= ruleBoolean )
                    {
                    // InternalSmartContractSpecification.g:2864:5: (lv_value_5_0= ruleBoolean )
                    // InternalSmartContractSpecification.g:2865:6: lv_value_5_0= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstantExpressionAccess().getValueBooleanParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstantExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Boolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:2884:3: ( () ( (lv_value_7_0= ruleFloat ) ) )
                    {
                    // InternalSmartContractSpecification.g:2884:3: ( () ( (lv_value_7_0= ruleFloat ) ) )
                    // InternalSmartContractSpecification.g:2885:4: () ( (lv_value_7_0= ruleFloat ) )
                    {
                    // InternalSmartContractSpecification.g:2885:4: ()
                    // InternalSmartContractSpecification.g:2886:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getFloatConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:2892:4: ( (lv_value_7_0= ruleFloat ) )
                    // InternalSmartContractSpecification.g:2893:5: (lv_value_7_0= ruleFloat )
                    {
                    // InternalSmartContractSpecification.g:2893:5: (lv_value_7_0= ruleFloat )
                    // InternalSmartContractSpecification.g:2894:6: lv_value_7_0= ruleFloat
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstantExpressionAccess().getValueFloatParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstantExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.Float");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:2913:3: ( () ( (lv_value_9_0= 'value' ) ) )
                    {
                    // InternalSmartContractSpecification.g:2913:3: ( () ( (lv_value_9_0= 'value' ) ) )
                    // InternalSmartContractSpecification.g:2914:4: () ( (lv_value_9_0= 'value' ) )
                    {
                    // InternalSmartContractSpecification.g:2914:4: ()
                    // InternalSmartContractSpecification.g:2915:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstantExpressionAccess().getValueconstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmartContractSpecification.g:2921:4: ( (lv_value_9_0= 'value' ) )
                    // InternalSmartContractSpecification.g:2922:5: (lv_value_9_0= 'value' )
                    {
                    // InternalSmartContractSpecification.g:2922:5: (lv_value_9_0= 'value' )
                    // InternalSmartContractSpecification.g:2923:6: lv_value_9_0= 'value'
                    {
                    lv_value_9_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_9_0, grammarAccess.getConstantExpressionAccess().getValueValueKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstantExpressionRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_9_0, "value");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleFloat"
    // InternalSmartContractSpecification.g:2940:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalSmartContractSpecification.g:2940:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalSmartContractSpecification.g:2941:2: iv_ruleFloat= ruleFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalSmartContractSpecification.g:2947:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:2953:2: ( ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) ) )
            // InternalSmartContractSpecification.g:2954:2: ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) )
            {
            // InternalSmartContractSpecification.g:2954:2: ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) )
            // InternalSmartContractSpecification.g:2955:3: (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) )
            {
            // InternalSmartContractSpecification.g:2955:3: (kw= '+' | kw= '-' )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==29) ) {
                alt61=1;
            }
            else if ( (LA61_0==65) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // InternalSmartContractSpecification.g:2956:4: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:2962:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloatAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:2968:3: ( (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT) ) {
                alt63=1;
            }
            else if ( (LA63_0==15) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalSmartContractSpecification.g:2969:4: (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? )
                    {
                    // InternalSmartContractSpecification.g:2969:4: (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )? )
                    // InternalSmartContractSpecification.g:2970:5: this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_INT_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_0_0());
                      				
                    }
                    kw=(Token)match(input,15,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0_1());
                      				
                    }
                    // InternalSmartContractSpecification.g:2982:5: (this_INT_4= RULE_INT )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_INT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSmartContractSpecification.g:2983:6: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_4);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_4, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_0_2());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:2993:4: (kw= '.' this_INT_6= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:2993:4: (kw= '.' this_INT_6= RULE_INT )
                    // InternalSmartContractSpecification.g:2994:5: kw= '.' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,15,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_1_0());
                      				
                    }
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_INT_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_INT_6, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleInteger"
    // InternalSmartContractSpecification.g:3012:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSmartContractSpecification.g:3012:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmartContractSpecification.g:3013:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmartContractSpecification.g:3019:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3025:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmartContractSpecification.g:3026:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmartContractSpecification.g:3026:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmartContractSpecification.g:3027:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmartContractSpecification.g:3027:3: (kw= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==65) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSmartContractSpecification.g:3028:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmartContractSpecification.g:3045:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalSmartContractSpecification.g:3045:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSmartContractSpecification.g:3046:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSmartContractSpecification.g:3052:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3058:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSmartContractSpecification.g:3059:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSmartContractSpecification.g:3059:2: (kw= 'true' | kw= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==66) ) {
                alt65=1;
            }
            else if ( (LA65_0==67) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalSmartContractSpecification.g:3060:3: kw= 'true'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:3066:3: kw= 'false'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleTimePredicate"
    // InternalSmartContractSpecification.g:3075:1: entryRuleTimePredicate returns [EObject current=null] : iv_ruleTimePredicate= ruleTimePredicate EOF ;
    public final EObject entryRuleTimePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimePredicate = null;


        try {
            // InternalSmartContractSpecification.g:3075:54: (iv_ruleTimePredicate= ruleTimePredicate EOF )
            // InternalSmartContractSpecification.g:3076:2: iv_ruleTimePredicate= ruleTimePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimePredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimePredicate=ruleTimePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimePredicate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimePredicate"


    // $ANTLR start "ruleTimePredicate"
    // InternalSmartContractSpecification.g:3082:1: ruleTimePredicate returns [EObject current=null] : (this_SimpleTimePredicate_0= ruleSimpleTimePredicate | ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate ) | ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate ) ) ;
    public final EObject ruleTimePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleTimePredicate_0 = null;

        EObject this_BoundedTimePredicate_1 = null;

        EObject this_PeriodicTimePredicate_2 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3088:2: ( (this_SimpleTimePredicate_0= ruleSimpleTimePredicate | ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate ) | ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate ) ) )
            // InternalSmartContractSpecification.g:3089:2: (this_SimpleTimePredicate_0= ruleSimpleTimePredicate | ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate ) | ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate ) )
            {
            // InternalSmartContractSpecification.g:3089:2: (this_SimpleTimePredicate_0= ruleSimpleTimePredicate | ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate ) | ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate ) )
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // InternalSmartContractSpecification.g:3090:3: this_SimpleTimePredicate_0= ruleSimpleTimePredicate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimePredicateAccess().getSimpleTimePredicateParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleTimePredicate_0=ruleSimpleTimePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleTimePredicate_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:3099:3: ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate )
                    {
                    // InternalSmartContractSpecification.g:3099:3: ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate )
                    // InternalSmartContractSpecification.g:3100:4: ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTimePredicateAccess().getBoundedTimePredicateParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_BoundedTimePredicate_1=ruleBoundedTimePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BoundedTimePredicate_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:3111:3: ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate )
                    {
                    // InternalSmartContractSpecification.g:3111:3: ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate )
                    // InternalSmartContractSpecification.g:3112:4: ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTimePredicateAccess().getPeriodicTimePredicateParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PeriodicTimePredicate_2=rulePeriodicTimePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PeriodicTimePredicate_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimePredicate"


    // $ANTLR start "entryRuleSimpleTimePredicate"
    // InternalSmartContractSpecification.g:3126:1: entryRuleSimpleTimePredicate returns [EObject current=null] : iv_ruleSimpleTimePredicate= ruleSimpleTimePredicate EOF ;
    public final EObject entryRuleSimpleTimePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTimePredicate = null;


        try {
            // InternalSmartContractSpecification.g:3126:60: (iv_ruleSimpleTimePredicate= ruleSimpleTimePredicate EOF )
            // InternalSmartContractSpecification.g:3127:2: iv_ruleSimpleTimePredicate= ruleSimpleTimePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleTimePredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTimePredicate=ruleSimpleTimePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleTimePredicate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleTimePredicate"


    // $ANTLR start "ruleSimpleTimePredicate"
    // InternalSmartContractSpecification.g:3133:1: ruleSimpleTimePredicate returns [EObject current=null] : ( ( (lv_operator_0_0= ruleTimePredicateOperator ) ) ( (lv_base_1_0= ruleExpression ) ) ) ;
    public final EObject ruleSimpleTimePredicate() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_base_1_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3139:2: ( ( ( (lv_operator_0_0= ruleTimePredicateOperator ) ) ( (lv_base_1_0= ruleExpression ) ) ) )
            // InternalSmartContractSpecification.g:3140:2: ( ( (lv_operator_0_0= ruleTimePredicateOperator ) ) ( (lv_base_1_0= ruleExpression ) ) )
            {
            // InternalSmartContractSpecification.g:3140:2: ( ( (lv_operator_0_0= ruleTimePredicateOperator ) ) ( (lv_base_1_0= ruleExpression ) ) )
            // InternalSmartContractSpecification.g:3141:3: ( (lv_operator_0_0= ruleTimePredicateOperator ) ) ( (lv_base_1_0= ruleExpression ) )
            {
            // InternalSmartContractSpecification.g:3141:3: ( (lv_operator_0_0= ruleTimePredicateOperator ) )
            // InternalSmartContractSpecification.g:3142:4: (lv_operator_0_0= ruleTimePredicateOperator )
            {
            // InternalSmartContractSpecification.g:3142:4: (lv_operator_0_0= ruleTimePredicateOperator )
            // InternalSmartContractSpecification.g:3143:5: lv_operator_0_0= ruleTimePredicateOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleTimePredicateAccess().getOperatorTimePredicateOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_operator_0_0=ruleTimePredicateOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimpleTimePredicateRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimePredicateOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:3160:3: ( (lv_base_1_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:3161:4: (lv_base_1_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:3161:4: (lv_base_1_0= ruleExpression )
            // InternalSmartContractSpecification.g:3162:5: lv_base_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleTimePredicateAccess().getBaseExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_base_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimpleTimePredicateRule());
              					}
              					set(
              						current,
              						"base",
              						lv_base_1_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTimePredicate"


    // $ANTLR start "entryRuleBoundedTimePredicate"
    // InternalSmartContractSpecification.g:3183:1: entryRuleBoundedTimePredicate returns [EObject current=null] : iv_ruleBoundedTimePredicate= ruleBoundedTimePredicate EOF ;
    public final EObject entryRuleBoundedTimePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedTimePredicate = null;


        try {
            // InternalSmartContractSpecification.g:3183:61: (iv_ruleBoundedTimePredicate= ruleBoundedTimePredicate EOF )
            // InternalSmartContractSpecification.g:3184:2: iv_ruleBoundedTimePredicate= ruleBoundedTimePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundedTimePredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoundedTimePredicate=ruleBoundedTimePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoundedTimePredicate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundedTimePredicate"


    // $ANTLR start "ruleBoundedTimePredicate"
    // InternalSmartContractSpecification.g:3190:1: ruleBoundedTimePredicate returns [EObject current=null] : ( ( (lv_closed_0_0= 'within' ) )? ( (lv_bound_1_0= ruleTimeExpression ) ) ( (lv_operator_2_0= ruleTimePredicateOperator ) ) ( (lv_base_3_0= ruleExpression ) ) ) ;
    public final EObject ruleBoundedTimePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_closed_0_0=null;
        EObject lv_bound_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_base_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3196:2: ( ( ( (lv_closed_0_0= 'within' ) )? ( (lv_bound_1_0= ruleTimeExpression ) ) ( (lv_operator_2_0= ruleTimePredicateOperator ) ) ( (lv_base_3_0= ruleExpression ) ) ) )
            // InternalSmartContractSpecification.g:3197:2: ( ( (lv_closed_0_0= 'within' ) )? ( (lv_bound_1_0= ruleTimeExpression ) ) ( (lv_operator_2_0= ruleTimePredicateOperator ) ) ( (lv_base_3_0= ruleExpression ) ) )
            {
            // InternalSmartContractSpecification.g:3197:2: ( ( (lv_closed_0_0= 'within' ) )? ( (lv_bound_1_0= ruleTimeExpression ) ) ( (lv_operator_2_0= ruleTimePredicateOperator ) ) ( (lv_base_3_0= ruleExpression ) ) )
            // InternalSmartContractSpecification.g:3198:3: ( (lv_closed_0_0= 'within' ) )? ( (lv_bound_1_0= ruleTimeExpression ) ) ( (lv_operator_2_0= ruleTimePredicateOperator ) ) ( (lv_base_3_0= ruleExpression ) )
            {
            // InternalSmartContractSpecification.g:3198:3: ( (lv_closed_0_0= 'within' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSmartContractSpecification.g:3199:4: (lv_closed_0_0= 'within' )
                    {
                    // InternalSmartContractSpecification.g:3199:4: (lv_closed_0_0= 'within' )
                    // InternalSmartContractSpecification.g:3200:5: lv_closed_0_0= 'within'
                    {
                    lv_closed_0_0=(Token)match(input,68,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_closed_0_0, grammarAccess.getBoundedTimePredicateAccess().getClosedWithinKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBoundedTimePredicateRule());
                      					}
                      					setWithLastConsumed(current, "closed", lv_closed_0_0 != null, "within");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3212:3: ( (lv_bound_1_0= ruleTimeExpression ) )
            // InternalSmartContractSpecification.g:3213:4: (lv_bound_1_0= ruleTimeExpression )
            {
            // InternalSmartContractSpecification.g:3213:4: (lv_bound_1_0= ruleTimeExpression )
            // InternalSmartContractSpecification.g:3214:5: lv_bound_1_0= ruleTimeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundedTimePredicateAccess().getBoundTimeExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_66);
            lv_bound_1_0=ruleTimeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoundedTimePredicateRule());
              					}
              					set(
              						current,
              						"bound",
              						lv_bound_1_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimeExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:3231:3: ( (lv_operator_2_0= ruleTimePredicateOperator ) )
            // InternalSmartContractSpecification.g:3232:4: (lv_operator_2_0= ruleTimePredicateOperator )
            {
            // InternalSmartContractSpecification.g:3232:4: (lv_operator_2_0= ruleTimePredicateOperator )
            // InternalSmartContractSpecification.g:3233:5: lv_operator_2_0= ruleTimePredicateOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundedTimePredicateAccess().getOperatorTimePredicateOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_operator_2_0=ruleTimePredicateOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoundedTimePredicateRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimePredicateOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:3250:3: ( (lv_base_3_0= ruleExpression ) )
            // InternalSmartContractSpecification.g:3251:4: (lv_base_3_0= ruleExpression )
            {
            // InternalSmartContractSpecification.g:3251:4: (lv_base_3_0= ruleExpression )
            // InternalSmartContractSpecification.g:3252:5: lv_base_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundedTimePredicateAccess().getBaseExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_base_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoundedTimePredicateRule());
              					}
              					set(
              						current,
              						"base",
              						lv_base_3_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundedTimePredicate"


    // $ANTLR start "entryRulePeriodicTimePredicate"
    // InternalSmartContractSpecification.g:3273:1: entryRulePeriodicTimePredicate returns [EObject current=null] : iv_rulePeriodicTimePredicate= rulePeriodicTimePredicate EOF ;
    public final EObject entryRulePeriodicTimePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicTimePredicate = null;


        try {
            // InternalSmartContractSpecification.g:3273:62: (iv_rulePeriodicTimePredicate= rulePeriodicTimePredicate EOF )
            // InternalSmartContractSpecification.g:3274:2: iv_rulePeriodicTimePredicate= rulePeriodicTimePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPeriodicTimePredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePeriodicTimePredicate=rulePeriodicTimePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePeriodicTimePredicate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePeriodicTimePredicate"


    // $ANTLR start "rulePeriodicTimePredicate"
    // InternalSmartContractSpecification.g:3280:1: rulePeriodicTimePredicate returns [EObject current=null] : (otherlv_0= 'by' ( ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) ) )? otherlv_3= 'every' ( (lv_base_4_0= ruleTimeConstant ) ) ( (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) ) | (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) ) )? ) ;
    public final EObject rulePeriodicTimePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_periodDate_2_0 = null;

        EObject lv_base_4_0 = null;

        EObject lv_period_6_0 = null;

        EObject lv_basefrom_8_0 = null;

        EObject lv_baseto_10_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3286:2: ( (otherlv_0= 'by' ( ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) ) )? otherlv_3= 'every' ( (lv_base_4_0= ruleTimeConstant ) ) ( (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) ) | (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) ) )? ) )
            // InternalSmartContractSpecification.g:3287:2: (otherlv_0= 'by' ( ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) ) )? otherlv_3= 'every' ( (lv_base_4_0= ruleTimeConstant ) ) ( (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) ) | (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) ) )? )
            {
            // InternalSmartContractSpecification.g:3287:2: (otherlv_0= 'by' ( ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) ) )? otherlv_3= 'every' ( (lv_base_4_0= ruleTimeConstant ) ) ( (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) ) | (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) ) )? )
            // InternalSmartContractSpecification.g:3288:3: otherlv_0= 'by' ( ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) ) )? otherlv_3= 'every' ( (lv_base_4_0= ruleTimeConstant ) ) ( (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) ) | (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) ) )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPeriodicTimePredicateAccess().getByKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:3292:3: ( ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=98 && LA68_0<=99)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSmartContractSpecification.g:3293:4: ( (lv_operator_1_0= ruleTimePredicateOperator ) ) ( (lv_periodDate_2_0= ruleTimeConstant ) )
                    {
                    // InternalSmartContractSpecification.g:3293:4: ( (lv_operator_1_0= ruleTimePredicateOperator ) )
                    // InternalSmartContractSpecification.g:3294:5: (lv_operator_1_0= ruleTimePredicateOperator )
                    {
                    // InternalSmartContractSpecification.g:3294:5: (lv_operator_1_0= ruleTimePredicateOperator )
                    // InternalSmartContractSpecification.g:3295:6: lv_operator_1_0= ruleTimePredicateOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPeriodicTimePredicateAccess().getOperatorTimePredicateOperatorEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_68);
                    lv_operator_1_0=ruleTimePredicateOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPeriodicTimePredicateRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.TimePredicateOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSmartContractSpecification.g:3312:4: ( (lv_periodDate_2_0= ruleTimeConstant ) )
                    // InternalSmartContractSpecification.g:3313:5: (lv_periodDate_2_0= ruleTimeConstant )
                    {
                    // InternalSmartContractSpecification.g:3313:5: (lv_periodDate_2_0= ruleTimeConstant )
                    // InternalSmartContractSpecification.g:3314:6: lv_periodDate_2_0= ruleTimeConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPeriodicTimePredicateAccess().getPeriodDateTimeConstantParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_periodDate_2_0=ruleTimeConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPeriodicTimePredicateRule());
                      						}
                      						set(
                      							current,
                      							"periodDate",
                      							lv_periodDate_2_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.TimeConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,70,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPeriodicTimePredicateAccess().getEveryKeyword_2());
              		
            }
            // InternalSmartContractSpecification.g:3336:3: ( (lv_base_4_0= ruleTimeConstant ) )
            // InternalSmartContractSpecification.g:3337:4: (lv_base_4_0= ruleTimeConstant )
            {
            // InternalSmartContractSpecification.g:3337:4: (lv_base_4_0= ruleTimeConstant )
            // InternalSmartContractSpecification.g:3338:5: lv_base_4_0= ruleTimeConstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPeriodicTimePredicateAccess().getBaseTimeConstantParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_71);
            lv_base_4_0=ruleTimeConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPeriodicTimePredicateRule());
              					}
              					set(
              						current,
              						"base",
              						lv_base_4_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimeConstant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:3355:3: ( (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) ) | (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) ) )?
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==44) ) {
                alt69=1;
            }
            else if ( (LA69_0==71) ) {
                alt69=2;
            }
            switch (alt69) {
                case 1 :
                    // InternalSmartContractSpecification.g:3356:4: (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) )
                    {
                    // InternalSmartContractSpecification.g:3356:4: (otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) ) )
                    // InternalSmartContractSpecification.g:3357:5: otherlv_5= 'in' ( (lv_period_6_0= ruleTimeExpression ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPeriodicTimePredicateAccess().getInKeyword_4_0_0());
                      				
                    }
                    // InternalSmartContractSpecification.g:3361:5: ( (lv_period_6_0= ruleTimeExpression ) )
                    // InternalSmartContractSpecification.g:3362:6: (lv_period_6_0= ruleTimeExpression )
                    {
                    // InternalSmartContractSpecification.g:3362:6: (lv_period_6_0= ruleTimeExpression )
                    // InternalSmartContractSpecification.g:3363:7: lv_period_6_0= ruleTimeExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPeriodicTimePredicateAccess().getPeriodTimeExpressionParserRuleCall_4_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_period_6_0=ruleTimeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPeriodicTimePredicateRule());
                      							}
                      							set(
                      								current,
                      								"period",
                      								lv_period_6_0,
                      								"edu.ustb.sei.mde.SmartContractSpecification.TimeExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:3382:4: (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) )
                    {
                    // InternalSmartContractSpecification.g:3382:4: (otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) ) )
                    // InternalSmartContractSpecification.g:3383:5: otherlv_7= 'from' ( (lv_basefrom_8_0= ruleExpression ) ) otherlv_9= 'to' ( (lv_baseto_10_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,71,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPeriodicTimePredicateAccess().getFromKeyword_4_1_0());
                      				
                    }
                    // InternalSmartContractSpecification.g:3387:5: ( (lv_basefrom_8_0= ruleExpression ) )
                    // InternalSmartContractSpecification.g:3388:6: (lv_basefrom_8_0= ruleExpression )
                    {
                    // InternalSmartContractSpecification.g:3388:6: (lv_basefrom_8_0= ruleExpression )
                    // InternalSmartContractSpecification.g:3389:7: lv_basefrom_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPeriodicTimePredicateAccess().getBasefromExpressionParserRuleCall_4_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    lv_basefrom_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPeriodicTimePredicateRule());
                      							}
                      							set(
                      								current,
                      								"basefrom",
                      								lv_basefrom_8_0,
                      								"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,42,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getPeriodicTimePredicateAccess().getToKeyword_4_1_2());
                      				
                    }
                    // InternalSmartContractSpecification.g:3410:5: ( (lv_baseto_10_0= ruleExpression ) )
                    // InternalSmartContractSpecification.g:3411:6: (lv_baseto_10_0= ruleExpression )
                    {
                    // InternalSmartContractSpecification.g:3411:6: (lv_baseto_10_0= ruleExpression )
                    // InternalSmartContractSpecification.g:3412:7: lv_baseto_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPeriodicTimePredicateAccess().getBasetoExpressionParserRuleCall_4_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_baseto_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPeriodicTimePredicateRule());
                      							}
                      							set(
                      								current,
                      								"baseto",
                      								lv_baseto_10_0,
                      								"edu.ustb.sei.mde.SmartContractSpecification.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodicTimePredicate"


    // $ANTLR start "entryRuleTimeExpression"
    // InternalSmartContractSpecification.g:3435:1: entryRuleTimeExpression returns [EObject current=null] : iv_ruleTimeExpression= ruleTimeExpression EOF ;
    public final EObject entryRuleTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExpression = null;


        try {
            // InternalSmartContractSpecification.g:3435:55: (iv_ruleTimeExpression= ruleTimeExpression EOF )
            // InternalSmartContractSpecification.g:3436:2: iv_ruleTimeExpression= ruleTimeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeExpression=ruleTimeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeExpression"


    // $ANTLR start "ruleTimeExpression"
    // InternalSmartContractSpecification.g:3442:1: ruleTimeExpression returns [EObject current=null] : ( ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine ) | this_TimeConstant_1= ruleTimeConstant | this_TimeQuery_2= ruleTimeQuery | this_TimeVarExpression_3= ruleTimeVarExpression | this_TimeThisExpression_4= ruleTimeThisExpression ) ;
    public final EObject ruleTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TimeLine_0 = null;

        EObject this_TimeConstant_1 = null;

        EObject this_TimeQuery_2 = null;

        EObject this_TimeVarExpression_3 = null;

        EObject this_TimeThisExpression_4 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3448:2: ( ( ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine ) | this_TimeConstant_1= ruleTimeConstant | this_TimeQuery_2= ruleTimeQuery | this_TimeVarExpression_3= ruleTimeVarExpression | this_TimeThisExpression_4= ruleTimeThisExpression ) )
            // InternalSmartContractSpecification.g:3449:2: ( ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine ) | this_TimeConstant_1= ruleTimeConstant | this_TimeQuery_2= ruleTimeQuery | this_TimeVarExpression_3= ruleTimeVarExpression | this_TimeThisExpression_4= ruleTimeThisExpression )
            {
            // InternalSmartContractSpecification.g:3449:2: ( ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine ) | this_TimeConstant_1= ruleTimeConstant | this_TimeQuery_2= ruleTimeQuery | this_TimeVarExpression_3= ruleTimeVarExpression | this_TimeThisExpression_4= ruleTimeThisExpression )
            int alt70=5;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalSmartContractSpecification.g:3450:3: ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine )
                    {
                    // InternalSmartContractSpecification.g:3450:3: ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine )
                    // InternalSmartContractSpecification.g:3451:4: ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTimeExpressionAccess().getTimeLineParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeLine_0=ruleTimeLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TimeLine_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:3462:3: this_TimeConstant_1= ruleTimeConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeExpressionAccess().getTimeConstantParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeConstant_1=ruleTimeConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeConstant_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:3471:3: this_TimeQuery_2= ruleTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeExpressionAccess().getTimeQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeQuery_2=ruleTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeQuery_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:3480:3: this_TimeVarExpression_3= ruleTimeVarExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeExpressionAccess().getTimeVarExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeVarExpression_3=ruleTimeVarExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeVarExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:3489:3: this_TimeThisExpression_4= ruleTimeThisExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeExpressionAccess().getTimeThisExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeThisExpression_4=ruleTimeThisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeThisExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeExpression"


    // $ANTLR start "entryRuleTimeQuery"
    // InternalSmartContractSpecification.g:3501:1: entryRuleTimeQuery returns [EObject current=null] : iv_ruleTimeQuery= ruleTimeQuery EOF ;
    public final EObject entryRuleTimeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeQuery = null;


        try {
            // InternalSmartContractSpecification.g:3501:50: (iv_ruleTimeQuery= ruleTimeQuery EOF )
            // InternalSmartContractSpecification.g:3502:2: iv_ruleTimeQuery= ruleTimeQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeQuery=ruleTimeQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeQuery"


    // $ANTLR start "ruleTimeQuery"
    // InternalSmartContractSpecification.g:3508:1: ruleTimeQuery returns [EObject current=null] : (this_ActionEnforcedTimeQuery_0= ruleActionEnforcedTimeQuery | this_TermValidTimeQuery_1= ruleTermValidTimeQuery | this_GlobalTimeQuery_2= ruleGlobalTimeQuery ) ;
    public final EObject ruleTimeQuery() throws RecognitionException {
        EObject current = null;

        EObject this_ActionEnforcedTimeQuery_0 = null;

        EObject this_TermValidTimeQuery_1 = null;

        EObject this_GlobalTimeQuery_2 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3514:2: ( (this_ActionEnforcedTimeQuery_0= ruleActionEnforcedTimeQuery | this_TermValidTimeQuery_1= ruleTermValidTimeQuery | this_GlobalTimeQuery_2= ruleGlobalTimeQuery ) )
            // InternalSmartContractSpecification.g:3515:2: (this_ActionEnforcedTimeQuery_0= ruleActionEnforcedTimeQuery | this_TermValidTimeQuery_1= ruleTermValidTimeQuery | this_GlobalTimeQuery_2= ruleGlobalTimeQuery )
            {
            // InternalSmartContractSpecification.g:3515:2: (this_ActionEnforcedTimeQuery_0= ruleActionEnforcedTimeQuery | this_TermValidTimeQuery_1= ruleTermValidTimeQuery | this_GlobalTimeQuery_2= ruleGlobalTimeQuery )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 56:
            case 83:
            case 85:
            case 100:
            case 101:
            case 102:
                {
                alt71=1;
                }
                break;
            case RULE_ID:
                {
                int LA71_2 = input.LA(2);

                if ( (LA71_2==72) ) {
                    alt71=1;
                }
                else if ( (LA71_2==73) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;
                }
                }
                break;
            case 103:
            case 104:
            case 105:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalSmartContractSpecification.g:3516:3: this_ActionEnforcedTimeQuery_0= ruleActionEnforcedTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeQueryAccess().getActionEnforcedTimeQueryParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ActionEnforcedTimeQuery_0=ruleActionEnforcedTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActionEnforcedTimeQuery_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:3525:3: this_TermValidTimeQuery_1= ruleTermValidTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeQueryAccess().getTermValidTimeQueryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TermValidTimeQuery_1=ruleTermValidTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TermValidTimeQuery_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:3534:3: this_GlobalTimeQuery_2= ruleGlobalTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeQueryAccess().getGlobalTimeQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GlobalTimeQuery_2=ruleGlobalTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GlobalTimeQuery_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeQuery"


    // $ANTLR start "entryRuleActionEnforcedTimeQuery"
    // InternalSmartContractSpecification.g:3546:1: entryRuleActionEnforcedTimeQuery returns [EObject current=null] : iv_ruleActionEnforcedTimeQuery= ruleActionEnforcedTimeQuery EOF ;
    public final EObject entryRuleActionEnforcedTimeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionEnforcedTimeQuery = null;


        try {
            // InternalSmartContractSpecification.g:3546:64: (iv_ruleActionEnforcedTimeQuery= ruleActionEnforcedTimeQuery EOF )
            // InternalSmartContractSpecification.g:3547:2: iv_ruleActionEnforcedTimeQuery= ruleActionEnforcedTimeQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionEnforcedTimeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActionEnforcedTimeQuery=ruleActionEnforcedTimeQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionEnforcedTimeQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionEnforcedTimeQuery"


    // $ANTLR start "ruleActionEnforcedTimeQuery"
    // InternalSmartContractSpecification.g:3553:1: ruleActionEnforcedTimeQuery returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleActionMultiplicity ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= 'did' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleActionEnforcedTimeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3559:2: ( ( ( (lv_multiplicity_0_0= ruleActionMultiplicity ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= 'did' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSmartContractSpecification.g:3560:2: ( ( (lv_multiplicity_0_0= ruleActionMultiplicity ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= 'did' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSmartContractSpecification.g:3560:2: ( ( (lv_multiplicity_0_0= ruleActionMultiplicity ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= 'did' ( (otherlv_3= RULE_ID ) ) )
            // InternalSmartContractSpecification.g:3561:3: ( (lv_multiplicity_0_0= ruleActionMultiplicity ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= 'did' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSmartContractSpecification.g:3561:3: ( (lv_multiplicity_0_0= ruleActionMultiplicity ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==56||LA72_0==83||LA72_0==85||(LA72_0>=100 && LA72_0<=102)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSmartContractSpecification.g:3562:4: (lv_multiplicity_0_0= ruleActionMultiplicity )
                    {
                    // InternalSmartContractSpecification.g:3562:4: (lv_multiplicity_0_0= ruleActionMultiplicity )
                    // InternalSmartContractSpecification.g:3563:5: lv_multiplicity_0_0= ruleActionMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActionEnforcedTimeQueryAccess().getMultiplicityActionMultiplicityEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_multiplicity_0_0=ruleActionMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActionEnforcedTimeQueryRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_0_0,
                      						"edu.ustb.sei.mde.SmartContractSpecification.ActionMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3580:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartContractSpecification.g:3581:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartContractSpecification.g:3581:4: (otherlv_1= RULE_ID )
            // InternalSmartContractSpecification.g:3582:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionEnforcedTimeQueryRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getActionEnforcedTimeQueryAccess().getPartyPartyCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionEnforcedTimeQueryAccess().getDidKeyword_2());
              		
            }
            // InternalSmartContractSpecification.g:3597:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartContractSpecification.g:3598:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartContractSpecification.g:3598:4: (otherlv_3= RULE_ID )
            // InternalSmartContractSpecification.g:3599:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionEnforcedTimeQueryRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getActionEnforcedTimeQueryAccess().getActionActionCrossReference_3_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionEnforcedTimeQuery"


    // $ANTLR start "entryRuleTermValidTimeQuery"
    // InternalSmartContractSpecification.g:3614:1: entryRuleTermValidTimeQuery returns [EObject current=null] : iv_ruleTermValidTimeQuery= ruleTermValidTimeQuery EOF ;
    public final EObject entryRuleTermValidTimeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermValidTimeQuery = null;


        try {
            // InternalSmartContractSpecification.g:3614:59: (iv_ruleTermValidTimeQuery= ruleTermValidTimeQuery EOF )
            // InternalSmartContractSpecification.g:3615:2: iv_ruleTermValidTimeQuery= ruleTermValidTimeQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermValidTimeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTermValidTimeQuery=ruleTermValidTimeQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermValidTimeQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermValidTimeQuery"


    // $ANTLR start "ruleTermValidTimeQuery"
    // InternalSmartContractSpecification.g:3621:1: ruleTermValidTimeQuery returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'valid' ) ;
    public final EObject ruleTermValidTimeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3627:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'valid' ) )
            // InternalSmartContractSpecification.g:3628:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'valid' )
            {
            // InternalSmartContractSpecification.g:3628:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'valid' )
            // InternalSmartContractSpecification.g:3629:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'valid'
            {
            // InternalSmartContractSpecification.g:3629:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmartContractSpecification.g:3630:4: (otherlv_0= RULE_ID )
            {
            // InternalSmartContractSpecification.g:3630:4: (otherlv_0= RULE_ID )
            // InternalSmartContractSpecification.g:3631:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTermValidTimeQueryRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTermValidTimeQueryAccess().getTermTermCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,73,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTermValidTimeQueryAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTermValidTimeQueryAccess().getValidKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermValidTimeQuery"


    // $ANTLR start "entryRuleGlobalTimeQuery"
    // InternalSmartContractSpecification.g:3654:1: entryRuleGlobalTimeQuery returns [EObject current=null] : iv_ruleGlobalTimeQuery= ruleGlobalTimeQuery EOF ;
    public final EObject entryRuleGlobalTimeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalTimeQuery = null;


        try {
            // InternalSmartContractSpecification.g:3654:56: (iv_ruleGlobalTimeQuery= ruleGlobalTimeQuery EOF )
            // InternalSmartContractSpecification.g:3655:2: iv_ruleGlobalTimeQuery= ruleGlobalTimeQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalTimeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalTimeQuery=ruleGlobalTimeQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalTimeQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalTimeQuery"


    // $ANTLR start "ruleGlobalTimeQuery"
    // InternalSmartContractSpecification.g:3661:1: ruleGlobalTimeQuery returns [EObject current=null] : ( (lv_operator_0_0= ruleTimeQueryOperator ) ) ;
    public final EObject ruleGlobalTimeQuery() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3667:2: ( ( (lv_operator_0_0= ruleTimeQueryOperator ) ) )
            // InternalSmartContractSpecification.g:3668:2: ( (lv_operator_0_0= ruleTimeQueryOperator ) )
            {
            // InternalSmartContractSpecification.g:3668:2: ( (lv_operator_0_0= ruleTimeQueryOperator ) )
            // InternalSmartContractSpecification.g:3669:3: (lv_operator_0_0= ruleTimeQueryOperator )
            {
            // InternalSmartContractSpecification.g:3669:3: (lv_operator_0_0= ruleTimeQueryOperator )
            // InternalSmartContractSpecification.g:3670:4: lv_operator_0_0= ruleTimeQueryOperator
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGlobalTimeQueryAccess().getOperatorTimeQueryOperatorEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_operator_0_0=ruleTimeQueryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGlobalTimeQueryRule());
              				}
              				set(
              					current,
              					"operator",
              					lv_operator_0_0,
              					"edu.ustb.sei.mde.SmartContractSpecification.TimeQueryOperator");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalTimeQuery"


    // $ANTLR start "entryRuleTimeLine"
    // InternalSmartContractSpecification.g:3690:1: entryRuleTimeLine returns [EObject current=null] : iv_ruleTimeLine= ruleTimeLine EOF ;
    public final EObject entryRuleTimeLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLine = null;


        try {
            // InternalSmartContractSpecification.g:3690:49: (iv_ruleTimeLine= ruleTimeLine EOF )
            // InternalSmartContractSpecification.g:3691:2: iv_ruleTimeLine= ruleTimeLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeLineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeLine=ruleTimeLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeLine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeLine"


    // $ANTLR start "ruleTimeLine"
    // InternalSmartContractSpecification.g:3697:1: ruleTimeLine returns [EObject current=null] : ( ( (lv_base_0_0= ruleTimeLineChild ) ) ( (lv_operator_1_0= ruleTimeLineOperator ) ) ( (lv_deviation_2_0= ruleTimeLineChild ) ) ) ;
    public final EObject ruleTimeLine() throws RecognitionException {
        EObject current = null;

        EObject lv_base_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_deviation_2_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3703:2: ( ( ( (lv_base_0_0= ruleTimeLineChild ) ) ( (lv_operator_1_0= ruleTimeLineOperator ) ) ( (lv_deviation_2_0= ruleTimeLineChild ) ) ) )
            // InternalSmartContractSpecification.g:3704:2: ( ( (lv_base_0_0= ruleTimeLineChild ) ) ( (lv_operator_1_0= ruleTimeLineOperator ) ) ( (lv_deviation_2_0= ruleTimeLineChild ) ) )
            {
            // InternalSmartContractSpecification.g:3704:2: ( ( (lv_base_0_0= ruleTimeLineChild ) ) ( (lv_operator_1_0= ruleTimeLineOperator ) ) ( (lv_deviation_2_0= ruleTimeLineChild ) ) )
            // InternalSmartContractSpecification.g:3705:3: ( (lv_base_0_0= ruleTimeLineChild ) ) ( (lv_operator_1_0= ruleTimeLineOperator ) ) ( (lv_deviation_2_0= ruleTimeLineChild ) )
            {
            // InternalSmartContractSpecification.g:3705:3: ( (lv_base_0_0= ruleTimeLineChild ) )
            // InternalSmartContractSpecification.g:3706:4: (lv_base_0_0= ruleTimeLineChild )
            {
            // InternalSmartContractSpecification.g:3706:4: (lv_base_0_0= ruleTimeLineChild )
            // InternalSmartContractSpecification.g:3707:5: lv_base_0_0= ruleTimeLineChild
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeLineAccess().getBaseTimeLineChildParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_base_0_0=ruleTimeLineChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeLineRule());
              					}
              					set(
              						current,
              						"base",
              						lv_base_0_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimeLineChild");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:3724:3: ( (lv_operator_1_0= ruleTimeLineOperator ) )
            // InternalSmartContractSpecification.g:3725:4: (lv_operator_1_0= ruleTimeLineOperator )
            {
            // InternalSmartContractSpecification.g:3725:4: (lv_operator_1_0= ruleTimeLineOperator )
            // InternalSmartContractSpecification.g:3726:5: lv_operator_1_0= ruleTimeLineOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeLineAccess().getOperatorTimeLineOperatorEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_76);
            lv_operator_1_0=ruleTimeLineOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeLineRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_1_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimeLineOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:3743:3: ( (lv_deviation_2_0= ruleTimeLineChild ) )
            // InternalSmartContractSpecification.g:3744:4: (lv_deviation_2_0= ruleTimeLineChild )
            {
            // InternalSmartContractSpecification.g:3744:4: (lv_deviation_2_0= ruleTimeLineChild )
            // InternalSmartContractSpecification.g:3745:5: lv_deviation_2_0= ruleTimeLineChild
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeLineAccess().getDeviationTimeLineChildParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_deviation_2_0=ruleTimeLineChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeLineRule());
              					}
              					set(
              						current,
              						"deviation",
              						lv_deviation_2_0,
              						"edu.ustb.sei.mde.SmartContractSpecification.TimeLineChild");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLine"


    // $ANTLR start "entryRuleTimeLineChild"
    // InternalSmartContractSpecification.g:3766:1: entryRuleTimeLineChild returns [EObject current=null] : iv_ruleTimeLineChild= ruleTimeLineChild EOF ;
    public final EObject entryRuleTimeLineChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLineChild = null;


        try {
            // InternalSmartContractSpecification.g:3766:54: (iv_ruleTimeLineChild= ruleTimeLineChild EOF )
            // InternalSmartContractSpecification.g:3767:2: iv_ruleTimeLineChild= ruleTimeLineChild EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeLineChildRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeLineChild=ruleTimeLineChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeLineChild; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeLineChild"


    // $ANTLR start "ruleTimeLineChild"
    // InternalSmartContractSpecification.g:3773:1: ruleTimeLineChild returns [EObject current=null] : (this_TimeConstant_0= ruleTimeConstant | this_TimeQuery_1= ruleTimeQuery ) ;
    public final EObject ruleTimeLineChild() throws RecognitionException {
        EObject current = null;

        EObject this_TimeConstant_0 = null;

        EObject this_TimeQuery_1 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3779:2: ( (this_TimeConstant_0= ruleTimeConstant | this_TimeQuery_1= ruleTimeQuery ) )
            // InternalSmartContractSpecification.g:3780:2: (this_TimeConstant_0= ruleTimeConstant | this_TimeQuery_1= ruleTimeQuery )
            {
            // InternalSmartContractSpecification.g:3780:2: (this_TimeConstant_0= ruleTimeConstant | this_TimeQuery_1= ruleTimeQuery )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==EOF||LA73_0==RULE_INT||LA73_0==15||(LA73_0>=28 && LA73_0<=29)||(LA73_0>=35 && LA73_0<=36)||(LA73_0>=38 && LA73_0<=42)||(LA73_0>=44 && LA73_0<=45)||(LA73_0>=48 && LA73_0<=54)||LA73_0==65||(LA73_0>=70 && LA73_0<=71)||LA73_0==73||(LA73_0>=87 && LA73_0<=96)||(LA73_0>=98 && LA73_0<=99)) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID||LA73_0==56||LA73_0==83||LA73_0==85||(LA73_0>=100 && LA73_0<=105)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalSmartContractSpecification.g:3781:3: this_TimeConstant_0= ruleTimeConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeLineChildAccess().getTimeConstantParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeConstant_0=ruleTimeConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeConstant_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:3790:3: this_TimeQuery_1= ruleTimeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTimeLineChildAccess().getTimeQueryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeQuery_1=ruleTimeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeQuery_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLineChild"


    // $ANTLR start "entryRuleTimeConstant"
    // InternalSmartContractSpecification.g:3802:1: entryRuleTimeConstant returns [EObject current=null] : iv_ruleTimeConstant= ruleTimeConstant EOF ;
    public final EObject entryRuleTimeConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConstant = null;


        try {
            // InternalSmartContractSpecification.g:3802:53: (iv_ruleTimeConstant= ruleTimeConstant EOF )
            // InternalSmartContractSpecification.g:3803:2: iv_ruleTimeConstant= ruleTimeConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeConstant=ruleTimeConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeConstant"


    // $ANTLR start "ruleTimeConstant"
    // InternalSmartContractSpecification.g:3809:1: ruleTimeConstant returns [EObject current=null] : ( () ( ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year' )? ( ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month' )? ( ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day' )? ( ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour' )? ( ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min' )? ( ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec' )? ( ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th' )? ) ;
    public final EObject ruleTimeConstant() throws RecognitionException {
        EObject current = null;

        Token lv_year_1_0=null;
        Token otherlv_2=null;
        Token lv_month_3_0=null;
        Token otherlv_4=null;
        Token lv_day_5_0=null;
        Token otherlv_6=null;
        Token lv_hour_7_0=null;
        Token otherlv_8=null;
        Token lv_min_9_0=null;
        Token otherlv_10=null;
        Token lv_sec_11_0=null;
        Token otherlv_12=null;
        Token lv_date_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:3815:2: ( ( () ( ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year' )? ( ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month' )? ( ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day' )? ( ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour' )? ( ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min' )? ( ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec' )? ( ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th' )? ) )
            // InternalSmartContractSpecification.g:3816:2: ( () ( ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year' )? ( ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month' )? ( ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day' )? ( ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour' )? ( ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min' )? ( ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec' )? ( ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th' )? )
            {
            // InternalSmartContractSpecification.g:3816:2: ( () ( ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year' )? ( ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month' )? ( ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day' )? ( ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour' )? ( ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min' )? ( ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec' )? ( ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th' )? )
            // InternalSmartContractSpecification.g:3817:3: () ( ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year' )? ( ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month' )? ( ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day' )? ( ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour' )? ( ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min' )? ( ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec' )? ( ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th' )?
            {
            // InternalSmartContractSpecification.g:3817:3: ()
            // InternalSmartContractSpecification.g:3818:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTimeConstantAccess().getTimeConstantAction_0(),
              					current);
              			
            }

            }

            // InternalSmartContractSpecification.g:3824:3: ( ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==75) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // InternalSmartContractSpecification.g:3825:4: ( (lv_year_1_0= RULE_INT ) ) otherlv_2= 'year'
                    {
                    // InternalSmartContractSpecification.g:3825:4: ( (lv_year_1_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3826:5: (lv_year_1_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3826:5: (lv_year_1_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3827:6: lv_year_1_0= RULE_INT
                    {
                    lv_year_1_0=(Token)match(input,RULE_INT,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_year_1_0, grammarAccess.getTimeConstantAccess().getYearINTTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"year",
                      							lv_year_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,75,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTimeConstantAccess().getYearKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3848:3: ( ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_INT) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==76) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // InternalSmartContractSpecification.g:3849:4: ( (lv_month_3_0= RULE_INT ) ) otherlv_4= 'month'
                    {
                    // InternalSmartContractSpecification.g:3849:4: ( (lv_month_3_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3850:5: (lv_month_3_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3850:5: (lv_month_3_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3851:6: lv_month_3_0= RULE_INT
                    {
                    lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_month_3_0, grammarAccess.getTimeConstantAccess().getMonthINTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"month",
                      							lv_month_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,76,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTimeConstantAccess().getMonthKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3872:3: ( ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==77) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // InternalSmartContractSpecification.g:3873:4: ( (lv_day_5_0= RULE_INT ) ) otherlv_6= 'day'
                    {
                    // InternalSmartContractSpecification.g:3873:4: ( (lv_day_5_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3874:5: (lv_day_5_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3874:5: (lv_day_5_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3875:6: lv_day_5_0= RULE_INT
                    {
                    lv_day_5_0=(Token)match(input,RULE_INT,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_day_5_0, grammarAccess.getTimeConstantAccess().getDayINTTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"day",
                      							lv_day_5_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,77,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTimeConstantAccess().getDayKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3896:3: ( ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==78) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // InternalSmartContractSpecification.g:3897:4: ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= 'hour'
                    {
                    // InternalSmartContractSpecification.g:3897:4: ( (lv_hour_7_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3898:5: (lv_hour_7_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3898:5: (lv_hour_7_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3899:6: lv_hour_7_0= RULE_INT
                    {
                    lv_hour_7_0=(Token)match(input,RULE_INT,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hour_7_0, grammarAccess.getTimeConstantAccess().getHourINTTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hour",
                      							lv_hour_7_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,78,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getTimeConstantAccess().getHourKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3920:3: ( ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_INT) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==79) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // InternalSmartContractSpecification.g:3921:4: ( (lv_min_9_0= RULE_INT ) ) otherlv_10= 'min'
                    {
                    // InternalSmartContractSpecification.g:3921:4: ( (lv_min_9_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3922:5: (lv_min_9_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3922:5: (lv_min_9_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3923:6: lv_min_9_0= RULE_INT
                    {
                    lv_min_9_0=(Token)match(input,RULE_INT,FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_min_9_0, grammarAccess.getTimeConstantAccess().getMinINTTerminalRuleCall_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"min",
                      							lv_min_9_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,79,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTimeConstantAccess().getMinKeyword_5_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3944:3: ( ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==80) ) {
                    alt79=1;
                }
            }
            switch (alt79) {
                case 1 :
                    // InternalSmartContractSpecification.g:3945:4: ( (lv_sec_11_0= RULE_INT ) ) otherlv_12= 'sec'
                    {
                    // InternalSmartContractSpecification.g:3945:4: ( (lv_sec_11_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3946:5: (lv_sec_11_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3946:5: (lv_sec_11_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3947:6: lv_sec_11_0= RULE_INT
                    {
                    lv_sec_11_0=(Token)match(input,RULE_INT,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sec_11_0, grammarAccess.getTimeConstantAccess().getSecINTTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"sec",
                      							lv_sec_11_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,80,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getTimeConstantAccess().getSecKeyword_6_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:3968:3: ( ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSmartContractSpecification.g:3969:4: ( (lv_date_13_0= RULE_INT ) ) otherlv_14= 'th'
                    {
                    // InternalSmartContractSpecification.g:3969:4: ( (lv_date_13_0= RULE_INT ) )
                    // InternalSmartContractSpecification.g:3970:5: (lv_date_13_0= RULE_INT )
                    {
                    // InternalSmartContractSpecification.g:3970:5: (lv_date_13_0= RULE_INT )
                    // InternalSmartContractSpecification.g:3971:6: lv_date_13_0= RULE_INT
                    {
                    lv_date_13_0=(Token)match(input,RULE_INT,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_date_13_0, grammarAccess.getTimeConstantAccess().getDateINTTerminalRuleCall_7_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTimeConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"date",
                      							lv_date_13_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTimeConstantAccess().getThKeyword_7_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeConstant"


    // $ANTLR start "entryRuleTimeVarExpression"
    // InternalSmartContractSpecification.g:3996:1: entryRuleTimeVarExpression returns [EObject current=null] : iv_ruleTimeVarExpression= ruleTimeVarExpression EOF ;
    public final EObject entryRuleTimeVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeVarExpression = null;


        try {
            // InternalSmartContractSpecification.g:3996:58: (iv_ruleTimeVarExpression= ruleTimeVarExpression EOF )
            // InternalSmartContractSpecification.g:3997:2: iv_ruleTimeVarExpression= ruleTimeVarExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeVarExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeVarExpression=ruleTimeVarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeVarExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeVarExpression"


    // $ANTLR start "ruleTimeVarExpression"
    // InternalSmartContractSpecification.g:4003:1: ruleTimeVarExpression returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) ) )? ) ;
    public final EObject ruleTimeVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_next_3_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4009:2: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) ) )? ) )
            // InternalSmartContractSpecification.g:4010:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) ) )? )
            {
            // InternalSmartContractSpecification.g:4010:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) ) )? )
            // InternalSmartContractSpecification.g:4011:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) ) )?
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTimeVarExpressionAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalSmartContractSpecification.g:4015:3: ( (otherlv_1= RULE_ID ) )
            // InternalSmartContractSpecification.g:4016:4: (otherlv_1= RULE_ID )
            {
            // InternalSmartContractSpecification.g:4016:4: (otherlv_1= RULE_ID )
            // InternalSmartContractSpecification.g:4017:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTimeVarExpressionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getTimeVarExpressionAccess().getSlotDataSlotCrossReference_1_0());
              				
            }

            }


            }

            // InternalSmartContractSpecification.g:4028:3: (otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==63) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSmartContractSpecification.g:4029:4: otherlv_2= '::' ( (lv_next_3_0= ruleSlotRef ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTimeVarExpressionAccess().getColonColonKeyword_2_0());
                      			
                    }
                    // InternalSmartContractSpecification.g:4033:4: ( (lv_next_3_0= ruleSlotRef ) )
                    // InternalSmartContractSpecification.g:4034:5: (lv_next_3_0= ruleSlotRef )
                    {
                    // InternalSmartContractSpecification.g:4034:5: (lv_next_3_0= ruleSlotRef )
                    // InternalSmartContractSpecification.g:4035:6: lv_next_3_0= ruleSlotRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTimeVarExpressionAccess().getNextSlotRefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_3_0=ruleSlotRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTimeVarExpressionRule());
                      						}
                      						set(
                      							current,
                      							"next",
                      							lv_next_3_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.SlotRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeVarExpression"


    // $ANTLR start "entryRuleTimeThisExpression"
    // InternalSmartContractSpecification.g:4057:1: entryRuleTimeThisExpression returns [EObject current=null] : iv_ruleTimeThisExpression= ruleTimeThisExpression EOF ;
    public final EObject entryRuleTimeThisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeThisExpression = null;


        try {
            // InternalSmartContractSpecification.g:4057:59: (iv_ruleTimeThisExpression= ruleTimeThisExpression EOF )
            // InternalSmartContractSpecification.g:4058:2: iv_ruleTimeThisExpression= ruleTimeThisExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeThisExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeThisExpression=ruleTimeThisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeThisExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeThisExpression"


    // $ANTLR start "ruleTimeThisExpression"
    // InternalSmartContractSpecification.g:4064:1: ruleTimeThisExpression returns [EObject current=null] : ( () otherlv_1= '@' ( (otherlv_2= 'this' this_ID_3= RULE_ID ) | otherlv_4= 'he' | otherlv_5= 'she' | otherlv_6= 'his' | otherlv_7= 'her' | otherlv_8= 'himself' | otherlv_9= 'herself' ) (otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) ) )? ) ;
    public final EObject ruleTimeThisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_transitive_11_0 = null;

        EObject lv_next_12_0 = null;



        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4070:2: ( ( () otherlv_1= '@' ( (otherlv_2= 'this' this_ID_3= RULE_ID ) | otherlv_4= 'he' | otherlv_5= 'she' | otherlv_6= 'his' | otherlv_7= 'her' | otherlv_8= 'himself' | otherlv_9= 'herself' ) (otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) ) )? ) )
            // InternalSmartContractSpecification.g:4071:2: ( () otherlv_1= '@' ( (otherlv_2= 'this' this_ID_3= RULE_ID ) | otherlv_4= 'he' | otherlv_5= 'she' | otherlv_6= 'his' | otherlv_7= 'her' | otherlv_8= 'himself' | otherlv_9= 'herself' ) (otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) ) )? )
            {
            // InternalSmartContractSpecification.g:4071:2: ( () otherlv_1= '@' ( (otherlv_2= 'this' this_ID_3= RULE_ID ) | otherlv_4= 'he' | otherlv_5= 'she' | otherlv_6= 'his' | otherlv_7= 'her' | otherlv_8= 'himself' | otherlv_9= 'herself' ) (otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) ) )? )
            // InternalSmartContractSpecification.g:4072:3: () otherlv_1= '@' ( (otherlv_2= 'this' this_ID_3= RULE_ID ) | otherlv_4= 'he' | otherlv_5= 'she' | otherlv_6= 'his' | otherlv_7= 'her' | otherlv_8= 'himself' | otherlv_9= 'herself' ) (otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) ) )?
            {
            // InternalSmartContractSpecification.g:4072:3: ()
            // InternalSmartContractSpecification.g:4073:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTimeThisExpressionAccess().getThisExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTimeThisExpressionAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalSmartContractSpecification.g:4083:3: ( (otherlv_2= 'this' this_ID_3= RULE_ID ) | otherlv_4= 'he' | otherlv_5= 'she' | otherlv_6= 'his' | otherlv_7= 'her' | otherlv_8= 'himself' | otherlv_9= 'herself' )
            int alt82=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt82=1;
                }
                break;
            case 57:
                {
                alt82=2;
                }
                break;
            case 58:
                {
                alt82=3;
                }
                break;
            case 59:
                {
                alt82=4;
                }
                break;
            case 60:
                {
                alt82=5;
                }
                break;
            case 61:
                {
                alt82=6;
                }
                break;
            case 62:
                {
                alt82=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalSmartContractSpecification.g:4084:4: (otherlv_2= 'this' this_ID_3= RULE_ID )
                    {
                    // InternalSmartContractSpecification.g:4084:4: (otherlv_2= 'this' this_ID_3= RULE_ID )
                    // InternalSmartContractSpecification.g:4085:5: otherlv_2= 'this' this_ID_3= RULE_ID
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getTimeThisExpressionAccess().getThisKeyword_2_0_0());
                      				
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ID_3, grammarAccess.getTimeThisExpressionAccess().getIDTerminalRuleCall_2_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4095:4: otherlv_4= 'he'
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTimeThisExpressionAccess().getHeKeyword_2_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:4100:4: otherlv_5= 'she'
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTimeThisExpressionAccess().getSheKeyword_2_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:4105:4: otherlv_6= 'his'
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTimeThisExpressionAccess().getHisKeyword_2_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:4110:4: otherlv_7= 'her'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTimeThisExpressionAccess().getHerKeyword_2_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalSmartContractSpecification.g:4115:4: otherlv_8= 'himself'
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getTimeThisExpressionAccess().getHimselfKeyword_2_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalSmartContractSpecification.g:4120:4: otherlv_9= 'herself'
                    {
                    otherlv_9=(Token)match(input,62,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTimeThisExpressionAccess().getHerselfKeyword_2_6());
                      			
                    }

                    }
                    break;

            }

            // InternalSmartContractSpecification.g:4125:3: (otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==63) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSmartContractSpecification.g:4126:4: otherlv_10= '::' ( (lv_transitive_11_0= ruleTransitiveOperator ) )? ( (lv_next_12_0= ruleSlotRef ) )
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTimeThisExpressionAccess().getColonColonKeyword_3_0());
                      			
                    }
                    // InternalSmartContractSpecification.g:4130:4: ( (lv_transitive_11_0= ruleTransitiveOperator ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==95||LA83_0==97) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalSmartContractSpecification.g:4131:5: (lv_transitive_11_0= ruleTransitiveOperator )
                            {
                            // InternalSmartContractSpecification.g:4131:5: (lv_transitive_11_0= ruleTransitiveOperator )
                            // InternalSmartContractSpecification.g:4132:6: lv_transitive_11_0= ruleTransitiveOperator
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTimeThisExpressionAccess().getTransitiveTransitiveOperatorEnumRuleCall_3_1_0());
                              					
                            }
                            pushFollow(FOLLOW_3);
                            lv_transitive_11_0=ruleTransitiveOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getTimeThisExpressionRule());
                              						}
                              						set(
                              							current,
                              							"transitive",
                              							lv_transitive_11_0,
                              							"edu.ustb.sei.mde.SmartContractSpecification.TransitiveOperator");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSmartContractSpecification.g:4149:4: ( (lv_next_12_0= ruleSlotRef ) )
                    // InternalSmartContractSpecification.g:4150:5: (lv_next_12_0= ruleSlotRef )
                    {
                    // InternalSmartContractSpecification.g:4150:5: (lv_next_12_0= ruleSlotRef )
                    // InternalSmartContractSpecification.g:4151:6: lv_next_12_0= ruleSlotRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTimeThisExpressionAccess().getNextSlotRefParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_12_0=ruleSlotRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTimeThisExpressionRule());
                      						}
                      						set(
                      							current,
                      							"next",
                      							lv_next_12_0,
                      							"edu.ustb.sei.mde.SmartContractSpecification.SlotRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeThisExpression"


    // $ANTLR start "ruleQuantifier"
    // InternalSmartContractSpecification.g:4173:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'exists' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4179:2: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'exists' ) ) )
            // InternalSmartContractSpecification.g:4180:2: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'exists' ) )
            {
            // InternalSmartContractSpecification.g:4180:2: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'exists' ) )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt85=1;
                }
                break;
            case 84:
                {
                alt85=2;
                }
                break;
            case 85:
                {
                alt85=3;
                }
                break;
            case 86:
                {
                alt85=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalSmartContractSpecification.g:4181:3: (enumLiteral_0= 'all' )
                    {
                    // InternalSmartContractSpecification.g:4181:3: (enumLiteral_0= 'all' )
                    // InternalSmartContractSpecification.g:4182:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getForAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getForAllEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4189:3: (enumLiteral_1= 'forAll' )
                    {
                    // InternalSmartContractSpecification.g:4189:3: (enumLiteral_1= 'forAll' )
                    // InternalSmartContractSpecification.g:4190:4: enumLiteral_1= 'forAll'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getForAllEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getForAllEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:4197:3: (enumLiteral_2= 'some' )
                    {
                    // InternalSmartContractSpecification.g:4197:3: (enumLiteral_2= 'some' )
                    // InternalSmartContractSpecification.g:4198:4: enumLiteral_2= 'some'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:4205:3: (enumLiteral_3= 'exists' )
                    {
                    // InternalSmartContractSpecification.g:4205:3: (enumLiteral_3= 'exists' )
                    // InternalSmartContractSpecification.g:4206:4: enumLiteral_3= 'exists'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "ruleRelationOperator"
    // InternalSmartContractSpecification.g:4216:1: ruleRelationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'is' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '!=' ) | (enumLiteral_7= '<>' ) | (enumLiteral_8= 'isn\\'t' ) ) ;
    public final Enumerator ruleRelationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4222:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'is' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '!=' ) | (enumLiteral_7= '<>' ) | (enumLiteral_8= 'isn\\'t' ) ) )
            // InternalSmartContractSpecification.g:4223:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'is' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '!=' ) | (enumLiteral_7= '<>' ) | (enumLiteral_8= 'isn\\'t' ) )
            {
            // InternalSmartContractSpecification.g:4223:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= 'is' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '!=' ) | (enumLiteral_7= '<>' ) | (enumLiteral_8= 'isn\\'t' ) )
            int alt86=9;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt86=1;
                }
                break;
            case 73:
                {
                alt86=2;
                }
                break;
            case 88:
                {
                alt86=3;
                }
                break;
            case 89:
                {
                alt86=4;
                }
                break;
            case 90:
                {
                alt86=5;
                }
                break;
            case 91:
                {
                alt86=6;
                }
                break;
            case 92:
                {
                alt86=7;
                }
                break;
            case 93:
                {
                alt86=8;
                }
                break;
            case 94:
                {
                alt86=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalSmartContractSpecification.g:4224:3: (enumLiteral_0= '=' )
                    {
                    // InternalSmartContractSpecification.g:4224:3: (enumLiteral_0= '=' )
                    // InternalSmartContractSpecification.g:4225:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationOperatorAccess().getEqualEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4232:3: (enumLiteral_1= 'is' )
                    {
                    // InternalSmartContractSpecification.g:4232:3: (enumLiteral_1= 'is' )
                    // InternalSmartContractSpecification.g:4233:4: enumLiteral_1= 'is'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationOperatorAccess().getEqualEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:4240:3: (enumLiteral_2= '<' )
                    {
                    // InternalSmartContractSpecification.g:4240:3: (enumLiteral_2= '<' )
                    // InternalSmartContractSpecification.g:4241:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getLessEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelationOperatorAccess().getLessEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:4248:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSmartContractSpecification.g:4248:3: (enumLiteral_3= '<=' )
                    // InternalSmartContractSpecification.g:4249:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getLessOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getRelationOperatorAccess().getLessOrEqualEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:4256:3: (enumLiteral_4= '>' )
                    {
                    // InternalSmartContractSpecification.g:4256:3: (enumLiteral_4= '>' )
                    // InternalSmartContractSpecification.g:4257:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getGreaterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getRelationOperatorAccess().getGreaterEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartContractSpecification.g:4264:3: (enumLiteral_5= '>=' )
                    {
                    // InternalSmartContractSpecification.g:4264:3: (enumLiteral_5= '>=' )
                    // InternalSmartContractSpecification.g:4265:4: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getGreaterOrEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getRelationOperatorAccess().getGreaterOrEqualEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartContractSpecification.g:4272:3: (enumLiteral_6= '!=' )
                    {
                    // InternalSmartContractSpecification.g:4272:3: (enumLiteral_6= '!=' )
                    // InternalSmartContractSpecification.g:4273:4: enumLiteral_6= '!='
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getNotEqualEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getRelationOperatorAccess().getNotEqualEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartContractSpecification.g:4280:3: (enumLiteral_7= '<>' )
                    {
                    // InternalSmartContractSpecification.g:4280:3: (enumLiteral_7= '<>' )
                    // InternalSmartContractSpecification.g:4281:4: enumLiteral_7= '<>'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getNotEqualEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getRelationOperatorAccess().getNotEqualEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSmartContractSpecification.g:4288:3: (enumLiteral_8= 'isn\\'t' )
                    {
                    // InternalSmartContractSpecification.g:4288:3: (enumLiteral_8= 'isn\\'t' )
                    // InternalSmartContractSpecification.g:4289:4: enumLiteral_8= 'isn\\'t'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationOperatorAccess().getNotEqualEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getRelationOperatorAccess().getNotEqualEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalSmartContractSpecification.g:4299:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4305:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSmartContractSpecification.g:4306:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSmartContractSpecification.g:4306:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==29) ) {
                alt87=1;
            }
            else if ( (LA87_0==65) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalSmartContractSpecification.g:4307:3: (enumLiteral_0= '+' )
                    {
                    // InternalSmartContractSpecification.g:4307:3: (enumLiteral_0= '+' )
                    // InternalSmartContractSpecification.g:4308:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getAddEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4315:3: (enumLiteral_1= '-' )
                    {
                    // InternalSmartContractSpecification.g:4315:3: (enumLiteral_1= '-' )
                    // InternalSmartContractSpecification.g:4316:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveOperatorAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSubEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalSmartContractSpecification.g:4326:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4332:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalSmartContractSpecification.g:4333:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalSmartContractSpecification.g:4333:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==95) ) {
                alt88=1;
            }
            else if ( (LA88_0==96) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalSmartContractSpecification.g:4334:3: (enumLiteral_0= '*' )
                    {
                    // InternalSmartContractSpecification.g:4334:3: (enumLiteral_0= '*' )
                    // InternalSmartContractSpecification.g:4335:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4342:3: (enumLiteral_1= '/' )
                    {
                    // InternalSmartContractSpecification.g:4342:3: (enumLiteral_1= '/' )
                    // InternalSmartContractSpecification.g:4343:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleTransitiveOperator"
    // InternalSmartContractSpecification.g:4353:1: ruleTransitiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '^' ) | (enumLiteral_1= '*' ) ) ;
    public final Enumerator ruleTransitiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4359:2: ( ( (enumLiteral_0= '^' ) | (enumLiteral_1= '*' ) ) )
            // InternalSmartContractSpecification.g:4360:2: ( (enumLiteral_0= '^' ) | (enumLiteral_1= '*' ) )
            {
            // InternalSmartContractSpecification.g:4360:2: ( (enumLiteral_0= '^' ) | (enumLiteral_1= '*' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==97) ) {
                alt89=1;
            }
            else if ( (LA89_0==95) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalSmartContractSpecification.g:4361:3: (enumLiteral_0= '^' )
                    {
                    // InternalSmartContractSpecification.g:4361:3: (enumLiteral_0= '^' )
                    // InternalSmartContractSpecification.g:4362:4: enumLiteral_0= '^'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTransitiveOperatorAccess().getTransitiveEnclosureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTransitiveOperatorAccess().getTransitiveEnclosureEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4369:3: (enumLiteral_1= '*' )
                    {
                    // InternalSmartContractSpecification.g:4369:3: (enumLiteral_1= '*' )
                    // InternalSmartContractSpecification.g:4370:4: enumLiteral_1= '*'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTransitiveOperatorAccess().getSelfTransitiveEnclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTransitiveOperatorAccess().getSelfTransitiveEnclosureEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitiveOperator"


    // $ANTLR start "ruleTimePredicateOperator"
    // InternalSmartContractSpecification.g:4380:1: ruleTimePredicateOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleTimePredicateOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4386:2: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // InternalSmartContractSpecification.g:4387:2: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // InternalSmartContractSpecification.g:4387:2: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==98) ) {
                alt90=1;
            }
            else if ( (LA90_0==99) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalSmartContractSpecification.g:4388:3: (enumLiteral_0= 'before' )
                    {
                    // InternalSmartContractSpecification.g:4388:3: (enumLiteral_0= 'before' )
                    // InternalSmartContractSpecification.g:4389:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimePredicateOperatorAccess().getBeforeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimePredicateOperatorAccess().getBeforeEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4396:3: (enumLiteral_1= 'after' )
                    {
                    // InternalSmartContractSpecification.g:4396:3: (enumLiteral_1= 'after' )
                    // InternalSmartContractSpecification.g:4397:4: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimePredicateOperatorAccess().getAfterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimePredicateOperatorAccess().getAfterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimePredicateOperator"


    // $ANTLR start "ruleActionMultiplicity"
    // InternalSmartContractSpecification.g:4407:1: ruleActionMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'one' ) | (enumLiteral_4= 'this' ) | (enumLiteral_5= 'the' ) ) ;
    public final Enumerator ruleActionMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4413:2: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'one' ) | (enumLiteral_4= 'this' ) | (enumLiteral_5= 'the' ) ) )
            // InternalSmartContractSpecification.g:4414:2: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'one' ) | (enumLiteral_4= 'this' ) | (enumLiteral_5= 'the' ) )
            {
            // InternalSmartContractSpecification.g:4414:2: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'one' ) | (enumLiteral_4= 'this' ) | (enumLiteral_5= 'the' ) )
            int alt91=6;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt91=1;
                }
                break;
            case 100:
                {
                alt91=2;
                }
                break;
            case 85:
                {
                alt91=3;
                }
                break;
            case 101:
                {
                alt91=4;
                }
                break;
            case 56:
                {
                alt91=5;
                }
                break;
            case 102:
                {
                alt91=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalSmartContractSpecification.g:4415:3: (enumLiteral_0= 'all' )
                    {
                    // InternalSmartContractSpecification.g:4415:3: (enumLiteral_0= 'all' )
                    // InternalSmartContractSpecification.g:4416:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionMultiplicityAccess().getAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getActionMultiplicityAccess().getAllEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4423:3: (enumLiteral_1= 'any' )
                    {
                    // InternalSmartContractSpecification.g:4423:3: (enumLiteral_1= 'any' )
                    // InternalSmartContractSpecification.g:4424:4: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionMultiplicityAccess().getAnyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getActionMultiplicityAccess().getAnyEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:4431:3: (enumLiteral_2= 'some' )
                    {
                    // InternalSmartContractSpecification.g:4431:3: (enumLiteral_2= 'some' )
                    // InternalSmartContractSpecification.g:4432:4: enumLiteral_2= 'some'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionMultiplicityAccess().getAnyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getActionMultiplicityAccess().getAnyEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartContractSpecification.g:4439:3: (enumLiteral_3= 'one' )
                    {
                    // InternalSmartContractSpecification.g:4439:3: (enumLiteral_3= 'one' )
                    // InternalSmartContractSpecification.g:4440:4: enumLiteral_3= 'one'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionMultiplicityAccess().getAnyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getActionMultiplicityAccess().getAnyEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartContractSpecification.g:4447:3: (enumLiteral_4= 'this' )
                    {
                    // InternalSmartContractSpecification.g:4447:3: (enumLiteral_4= 'this' )
                    // InternalSmartContractSpecification.g:4448:4: enumLiteral_4= 'this'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionMultiplicityAccess().getThisEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getActionMultiplicityAccess().getThisEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartContractSpecification.g:4455:3: (enumLiteral_5= 'the' )
                    {
                    // InternalSmartContractSpecification.g:4455:3: (enumLiteral_5= 'the' )
                    // InternalSmartContractSpecification.g:4456:4: enumLiteral_5= 'the'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionMultiplicityAccess().getThisEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getActionMultiplicityAccess().getThisEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionMultiplicity"


    // $ANTLR start "ruleTimeLineOperator"
    // InternalSmartContractSpecification.g:4466:1: ruleTimeLineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleTimeLineOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4472:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSmartContractSpecification.g:4473:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSmartContractSpecification.g:4473:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==29) ) {
                alt92=1;
            }
            else if ( (LA92_0==65) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalSmartContractSpecification.g:4474:3: (enumLiteral_0= '+' )
                    {
                    // InternalSmartContractSpecification.g:4474:3: (enumLiteral_0= '+' )
                    // InternalSmartContractSpecification.g:4475:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeLineOperatorAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeLineOperatorAccess().getForwardEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4482:3: (enumLiteral_1= '-' )
                    {
                    // InternalSmartContractSpecification.g:4482:3: (enumLiteral_1= '-' )
                    // InternalSmartContractSpecification.g:4483:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeLineOperatorAccess().getBackwardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeLineOperatorAccess().getBackwardEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLineOperator"


    // $ANTLR start "ruleTimeQueryOperator"
    // InternalSmartContractSpecification.g:4493:1: ruleTimeQueryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'now' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'end' ) ) ;
    public final Enumerator ruleTimeQueryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartContractSpecification.g:4499:2: ( ( (enumLiteral_0= 'now' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'end' ) ) )
            // InternalSmartContractSpecification.g:4500:2: ( (enumLiteral_0= 'now' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'end' ) )
            {
            // InternalSmartContractSpecification.g:4500:2: ( (enumLiteral_0= 'now' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'end' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt93=1;
                }
                break;
            case 104:
                {
                alt93=2;
                }
                break;
            case 105:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalSmartContractSpecification.g:4501:3: (enumLiteral_0= 'now' )
                    {
                    // InternalSmartContractSpecification.g:4501:3: (enumLiteral_0= 'now' )
                    // InternalSmartContractSpecification.g:4502:4: enumLiteral_0= 'now'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeQueryOperatorAccess().getNowEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeQueryOperatorAccess().getNowEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractSpecification.g:4509:3: (enumLiteral_1= 'start' )
                    {
                    // InternalSmartContractSpecification.g:4509:3: (enumLiteral_1= 'start' )
                    // InternalSmartContractSpecification.g:4510:4: enumLiteral_1= 'start'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeQueryOperatorAccess().getContractStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeQueryOperatorAccess().getContractStartEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartContractSpecification.g:4517:3: (enumLiteral_2= 'end' )
                    {
                    // InternalSmartContractSpecification.g:4517:3: (enumLiteral_2= 'end' )
                    // InternalSmartContractSpecification.g:4518:4: enumLiteral_2= 'end'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeQueryOperatorAccess().getContractEndEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeQueryOperatorAccess().getContractEndEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeQueryOperator"

    // $ANTLR start synpred1_InternalSmartContractSpecification
    public final void synpred1_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:1528:4: ( ruleImplyExpression )
        // InternalSmartContractSpecification.g:1528:5: ruleImplyExpression
        {
        pushFollow(FOLLOW_2);
        ruleImplyExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSmartContractSpecification

    // $ANTLR start synpred2_InternalSmartContractSpecification
    public final void synpred2_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:1602:5: ( ( () 'where' ) )
        // InternalSmartContractSpecification.g:1602:6: ( () 'where' )
        {
        // InternalSmartContractSpecification.g:1602:6: ( () 'where' )
        // InternalSmartContractSpecification.g:1603:6: () 'where'
        {
        // InternalSmartContractSpecification.g:1603:6: ()
        // InternalSmartContractSpecification.g:1604:6: 
        {
        }

        match(input,36,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSmartContractSpecification

    // $ANTLR start synpred3_InternalSmartContractSpecification
    public final void synpred3_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:1901:5: ( ( () 'implies' ) )
        // InternalSmartContractSpecification.g:1901:6: ( () 'implies' )
        {
        // InternalSmartContractSpecification.g:1901:6: ( () 'implies' )
        // InternalSmartContractSpecification.g:1902:6: () 'implies'
        {
        // InternalSmartContractSpecification.g:1902:6: ()
        // InternalSmartContractSpecification.g:1903:6: 
        {
        }

        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSmartContractSpecification

    // $ANTLR start synpred4_InternalSmartContractSpecification
    public final void synpred4_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:1970:5: ( ( () ( 'or' | '||' ) ) )
        // InternalSmartContractSpecification.g:1970:6: ( () ( 'or' | '||' ) )
        {
        // InternalSmartContractSpecification.g:1970:6: ( () ( 'or' | '||' ) )
        // InternalSmartContractSpecification.g:1971:6: () ( 'or' | '||' )
        {
        // InternalSmartContractSpecification.g:1971:6: ()
        // InternalSmartContractSpecification.g:1972:6: 
        {
        }

        if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSmartContractSpecification

    // $ANTLR start synpred5_InternalSmartContractSpecification
    public final void synpred5_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:2050:5: ( ( () ( 'and' | '&&' ) ) )
        // InternalSmartContractSpecification.g:2050:6: ( () ( 'and' | '&&' ) )
        {
        // InternalSmartContractSpecification.g:2050:6: ( () ( 'and' | '&&' ) )
        // InternalSmartContractSpecification.g:2051:6: () ( 'and' | '&&' )
        {
        // InternalSmartContractSpecification.g:2051:6: ()
        // InternalSmartContractSpecification.g:2052:6: 
        {
        }

        if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred5_InternalSmartContractSpecification

    // $ANTLR start synpred6_InternalSmartContractSpecification
    public final void synpred6_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:2208:5: ( ( () ( ( ruleRelationOperator ) ) ) )
        // InternalSmartContractSpecification.g:2208:6: ( () ( ( ruleRelationOperator ) ) )
        {
        // InternalSmartContractSpecification.g:2208:6: ( () ( ( ruleRelationOperator ) ) )
        // InternalSmartContractSpecification.g:2209:6: () ( ( ruleRelationOperator ) )
        {
        // InternalSmartContractSpecification.g:2209:6: ()
        // InternalSmartContractSpecification.g:2210:6: 
        {
        }

        // InternalSmartContractSpecification.g:2211:6: ( ( ruleRelationOperator ) )
        // InternalSmartContractSpecification.g:2212:7: ( ruleRelationOperator )
        {
        // InternalSmartContractSpecification.g:2212:7: ( ruleRelationOperator )
        // InternalSmartContractSpecification.g:2213:8: ruleRelationOperator
        {
        pushFollow(FOLLOW_2);
        ruleRelationOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalSmartContractSpecification

    // $ANTLR start synpred7_InternalSmartContractSpecification
    public final void synpred7_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:2321:5: ( ( () ( ( ruleAdditiveOperator ) ) ) )
        // InternalSmartContractSpecification.g:2321:6: ( () ( ( ruleAdditiveOperator ) ) )
        {
        // InternalSmartContractSpecification.g:2321:6: ( () ( ( ruleAdditiveOperator ) ) )
        // InternalSmartContractSpecification.g:2322:6: () ( ( ruleAdditiveOperator ) )
        {
        // InternalSmartContractSpecification.g:2322:6: ()
        // InternalSmartContractSpecification.g:2323:6: 
        {
        }

        // InternalSmartContractSpecification.g:2324:6: ( ( ruleAdditiveOperator ) )
        // InternalSmartContractSpecification.g:2325:7: ( ruleAdditiveOperator )
        {
        // InternalSmartContractSpecification.g:2325:7: ( ruleAdditiveOperator )
        // InternalSmartContractSpecification.g:2326:8: ruleAdditiveOperator
        {
        pushFollow(FOLLOW_2);
        ruleAdditiveOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSmartContractSpecification

    // $ANTLR start synpred8_InternalSmartContractSpecification
    public final void synpred8_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:2409:5: ( ( () ( ( ruleMultiplicativeOperator ) ) ) )
        // InternalSmartContractSpecification.g:2409:6: ( () ( ( ruleMultiplicativeOperator ) ) )
        {
        // InternalSmartContractSpecification.g:2409:6: ( () ( ( ruleMultiplicativeOperator ) ) )
        // InternalSmartContractSpecification.g:2410:6: () ( ( ruleMultiplicativeOperator ) )
        {
        // InternalSmartContractSpecification.g:2410:6: ()
        // InternalSmartContractSpecification.g:2411:6: 
        {
        }

        // InternalSmartContractSpecification.g:2412:6: ( ( ruleMultiplicativeOperator ) )
        // InternalSmartContractSpecification.g:2413:7: ( ruleMultiplicativeOperator )
        {
        // InternalSmartContractSpecification.g:2413:7: ( ruleMultiplicativeOperator )
        // InternalSmartContractSpecification.g:2414:8: ruleMultiplicativeOperator
        {
        pushFollow(FOLLOW_2);
        ruleMultiplicativeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSmartContractSpecification

    // $ANTLR start synpred9_InternalSmartContractSpecification
    public final void synpred9_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:2488:4: ( ruleConstantExpression )
        // InternalSmartContractSpecification.g:2488:5: ruleConstantExpression
        {
        pushFollow(FOLLOW_2);
        ruleConstantExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalSmartContractSpecification

    // $ANTLR start synpred10_InternalSmartContractSpecification
    public final void synpred10_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:3100:4: ( ruleBoundedTimePredicate )
        // InternalSmartContractSpecification.g:3100:5: ruleBoundedTimePredicate
        {
        pushFollow(FOLLOW_2);
        ruleBoundedTimePredicate();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalSmartContractSpecification

    // $ANTLR start synpred11_InternalSmartContractSpecification
    public final void synpred11_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:3112:4: ( rulePeriodicTimePredicate )
        // InternalSmartContractSpecification.g:3112:5: rulePeriodicTimePredicate
        {
        pushFollow(FOLLOW_2);
        rulePeriodicTimePredicate();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalSmartContractSpecification

    // $ANTLR start synpred12_InternalSmartContractSpecification
    public final void synpred12_InternalSmartContractSpecification_fragment() throws RecognitionException {   
        // InternalSmartContractSpecification.g:3451:4: ( ruleTimeLine )
        // InternalSmartContractSpecification.g:3451:5: ruleTimeLine
        {
        pushFollow(FOLLOW_2);
        ruleTimeLine();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalSmartContractSpecification

    // Delegated rules

    public final boolean synpred11_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSmartContractSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSmartContractSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\1\65\77\uffff";
    static final String dfa_3s = "\1\4\77\uffff";
    static final String dfa_4s = "\1\151\77\uffff";
    static final String dfa_5s = "\1\uffff\1\1\76\2";
    static final String dfa_6s = "\1\0\77\uffff}>";
    static final String[] dfa_7s = {
            "\1\24\1\uffff\1\4\1\42\1\5\6\uffff\1\11\13\uffff\1\77\1\76\1\10\5\uffff\1\63\1\64\1\uffff\1\66\1\67\1\70\1\71\1\72\2\uffff\1\73\1\uffff\1\1\1\74\1\75\1\62\1\60\1\61\1\56\1\57\1\2\1\22\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\12\1\3\1\6\1\7\1\15\1\31\3\uffff\1\46\10\uffff\1\30\1\16\1\40\1\20\1\41\1\45\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\43\1\44\1\uffff\1\13\1\14\1\17\1\21\1\23\1\25\1\26\1\27",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1517:2: (this_ConditionalExpression_0= ruleConditionalExpression | ( ( ruleImplyExpression )=>this_ImplyExpression_1= ruleImplyExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==47) ) {s = 1;}

                        else if ( (LA42_0==55) && (synpred1_InternalSmartContractSpecification())) {s = 2;}

                        else if ( (LA42_0==65) && (synpred1_InternalSmartContractSpecification())) {s = 3;}

                        else if ( (LA42_0==RULE_INT) && (synpred1_InternalSmartContractSpecification())) {s = 4;}

                        else if ( (LA42_0==RULE_STRING) && (synpred1_InternalSmartContractSpecification())) {s = 5;}

                        else if ( (LA42_0==66) && (synpred1_InternalSmartContractSpecification())) {s = 6;}

                        else if ( (LA42_0==67) && (synpred1_InternalSmartContractSpecification())) {s = 7;}

                        else if ( (LA42_0==29) && (synpred1_InternalSmartContractSpecification())) {s = 8;}

                        else if ( (LA42_0==15) && (synpred1_InternalSmartContractSpecification())) {s = 9;}

                        else if ( (LA42_0==64) && (synpred1_InternalSmartContractSpecification())) {s = 10;}

                        else if ( (LA42_0==98) && (synpred1_InternalSmartContractSpecification())) {s = 11;}

                        else if ( (LA42_0==99) && (synpred1_InternalSmartContractSpecification())) {s = 12;}

                        else if ( (LA42_0==68) && (synpred1_InternalSmartContractSpecification())) {s = 13;}

                        else if ( (LA42_0==83) && (synpred1_InternalSmartContractSpecification())) {s = 14;}

                        else if ( (LA42_0==100) && (synpred1_InternalSmartContractSpecification())) {s = 15;}

                        else if ( (LA42_0==85) && (synpred1_InternalSmartContractSpecification())) {s = 16;}

                        else if ( (LA42_0==101) && (synpred1_InternalSmartContractSpecification())) {s = 17;}

                        else if ( (LA42_0==56) && (synpred1_InternalSmartContractSpecification())) {s = 18;}

                        else if ( (LA42_0==102) && (synpred1_InternalSmartContractSpecification())) {s = 19;}

                        else if ( (LA42_0==RULE_ID) && (synpred1_InternalSmartContractSpecification())) {s = 20;}

                        else if ( (LA42_0==103) && (synpred1_InternalSmartContractSpecification())) {s = 21;}

                        else if ( (LA42_0==104) && (synpred1_InternalSmartContractSpecification())) {s = 22;}

                        else if ( (LA42_0==105) && (synpred1_InternalSmartContractSpecification())) {s = 23;}

                        else if ( (LA42_0==82) && (synpred1_InternalSmartContractSpecification())) {s = 24;}

                        else if ( (LA42_0==69) && (synpred1_InternalSmartContractSpecification())) {s = 25;}

                        else if ( (LA42_0==57) && (synpred1_InternalSmartContractSpecification())) {s = 26;}

                        else if ( (LA42_0==58) && (synpred1_InternalSmartContractSpecification())) {s = 27;}

                        else if ( (LA42_0==59) && (synpred1_InternalSmartContractSpecification())) {s = 28;}

                        else if ( (LA42_0==60) && (synpred1_InternalSmartContractSpecification())) {s = 29;}

                        else if ( (LA42_0==61) && (synpred1_InternalSmartContractSpecification())) {s = 30;}

                        else if ( (LA42_0==62) && (synpred1_InternalSmartContractSpecification())) {s = 31;}

                        else if ( (LA42_0==84) && (synpred1_InternalSmartContractSpecification())) {s = 32;}

                        else if ( (LA42_0==86) && (synpred1_InternalSmartContractSpecification())) {s = 33;}

                        else if ( (LA42_0==RULE_PLAINTEXT) && (synpred1_InternalSmartContractSpecification())) {s = 34;}

                        else if ( (LA42_0==95) && (synpred1_InternalSmartContractSpecification())) {s = 35;}

                        else if ( (LA42_0==96) && (synpred1_InternalSmartContractSpecification())) {s = 36;}

                        else if ( (LA42_0==87) && (synpred1_InternalSmartContractSpecification())) {s = 37;}

                        else if ( (LA42_0==73) && (synpred1_InternalSmartContractSpecification())) {s = 38;}

                        else if ( (LA42_0==88) && (synpred1_InternalSmartContractSpecification())) {s = 39;}

                        else if ( (LA42_0==89) && (synpred1_InternalSmartContractSpecification())) {s = 40;}

                        else if ( (LA42_0==90) && (synpred1_InternalSmartContractSpecification())) {s = 41;}

                        else if ( (LA42_0==91) && (synpred1_InternalSmartContractSpecification())) {s = 42;}

                        else if ( (LA42_0==92) && (synpred1_InternalSmartContractSpecification())) {s = 43;}

                        else if ( (LA42_0==93) && (synpred1_InternalSmartContractSpecification())) {s = 44;}

                        else if ( (LA42_0==94) && (synpred1_InternalSmartContractSpecification())) {s = 45;}

                        else if ( (LA42_0==53) && (synpred1_InternalSmartContractSpecification())) {s = 46;}

                        else if ( (LA42_0==54) && (synpred1_InternalSmartContractSpecification())) {s = 47;}

                        else if ( (LA42_0==51) && (synpred1_InternalSmartContractSpecification())) {s = 48;}

                        else if ( (LA42_0==52) && (synpred1_InternalSmartContractSpecification())) {s = 49;}

                        else if ( (LA42_0==50) && (synpred1_InternalSmartContractSpecification())) {s = 50;}

                        else if ( (LA42_0==35) && (synpred1_InternalSmartContractSpecification())) {s = 51;}

                        else if ( (LA42_0==36) && (synpred1_InternalSmartContractSpecification())) {s = 52;}

                        else if ( (LA42_0==EOF) && (synpred1_InternalSmartContractSpecification())) {s = 53;}

                        else if ( (LA42_0==38) && (synpred1_InternalSmartContractSpecification())) {s = 54;}

                        else if ( (LA42_0==39) && (synpred1_InternalSmartContractSpecification())) {s = 55;}

                        else if ( (LA42_0==40) && (synpred1_InternalSmartContractSpecification())) {s = 56;}

                        else if ( (LA42_0==41) && (synpred1_InternalSmartContractSpecification())) {s = 57;}

                        else if ( (LA42_0==42) && (synpred1_InternalSmartContractSpecification())) {s = 58;}

                        else if ( (LA42_0==45) && (synpred1_InternalSmartContractSpecification())) {s = 59;}

                        else if ( (LA42_0==48) && (synpred1_InternalSmartContractSpecification())) {s = 60;}

                        else if ( (LA42_0==49) && (synpred1_InternalSmartContractSpecification())) {s = 61;}

                        else if ( (LA42_0==28) && (synpred1_InternalSmartContractSpecification())) {s = 62;}

                        else if ( (LA42_0==27) && (synpred1_InternalSmartContractSpecification())) {s = 63;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\12\13\uffff";
    static final String dfa_10s = "\1\17\11\0\2\uffff";
    static final String dfa_11s = "\1\140\11\0\2\uffff";
    static final String dfa_12s = "\12\uffff\1\2\1\1";
    static final String dfa_13s = "\1\uffff\1\0\1\3\1\5\1\7\1\1\1\4\1\6\1\10\1\2\2\uffff}>";
    static final String[] dfa_14s = {
            "\1\12\14\uffff\2\12\5\uffff\2\12\1\uffff\5\12\2\uffff\1\12\2\uffff\7\12\12\uffff\1\12\7\uffff\1\2\15\uffff\1\1\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\12",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2206:3: ( ( ( ( () ( ( ruleRelationOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleRelationOperator ) ) ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_9 = input.LA(1);

                         
                        int index50_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSmartContractSpecification()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\62\uffff";
    static final String dfa_16s = "\1\23\1\uffff\1\3\7\uffff\1\20\1\uffff\1\41\3\42\5\uffff\7\23\2\uffff\1\20\1\uffff\1\41\14\uffff\2\57\3\uffff";
    static final String dfa_17s = "\1\4\1\uffff\1\17\1\uffff\1\6\1\uffff\6\4\4\17\5\uffff\2\6\1\17\4\6\1\54\1\110\1\17\2\4\4\uffff\1\120\2\uffff\1\116\1\114\1\121\1\117\1\115\2\17\3\uffff";
    static final String dfa_18s = "\1\151\1\uffff\1\140\1\uffff\1\40\1\uffff\4\4\1\140\1\4\1\140\3\143\5\uffff\7\143\2\110\1\140\1\4\1\151\4\uffff\1\121\2\uffff\5\121\2\143\3\uffff";
    static final String dfa_19s = "\1\uffff\1\1\1\uffff\1\1\1\uffff\1\2\12\uffff\1\4\1\5\1\6\1\10\1\12\14\uffff\1\3\1\7\2\2\1\uffff\2\2\7\uffff\1\11\2\2";
    static final String dfa_20s = "\62\uffff}>";
    static final String[] dfa_21s = {
            "\1\14\1\uffff\1\2\1\22\1\1\6\uffff\1\4\13\uffff\1\24\1\23\1\3\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\1\uffff\1\12\6\20\1\uffff\1\3\3\1\2\5\3\uffff\1\23\10\uffff\1\5\1\6\1\21\1\10\1\21\12\23\1\uffff\2\5\1\7\1\11\1\13\1\15\1\16\1\17",
            "",
            "\1\3\14\uffff\2\3\5\uffff\2\3\1\uffff\5\3\2\uffff\1\3\2\uffff\7\3\12\uffff\1\3\7\uffff\1\3\1\uffff\1\30\1\33\1\26\1\32\1\25\1\31\1\27\5\uffff\12\3",
            "",
            "\1\3\11\uffff\3\23\13\uffff\3\23",
            "",
            "\1\34",
            "\1\35",
            "\1\34",
            "\1\35",
            "\1\36\12\uffff\1\20\14\uffff\2\20\5\uffff\2\20\1\uffff\5\20\2\uffff\1\20\2\uffff\7\20\10\uffff\1\20\1\uffff\1\20\7\uffff\1\20\15\uffff\12\20",
            "\1\35",
            "\1\41\14\uffff\2\41\5\uffff\2\41\1\uffff\5\41\2\uffff\1\41\2\uffff\7\41\10\uffff\1\41\1\uffff\1\41\6\uffff\1\37\1\40\15\uffff\12\41",
            "\1\42\14\uffff\1\42\1\43\5\uffff\2\42\1\uffff\5\42\2\uffff\1\42\2\uffff\7\42\12\uffff\1\44\7\uffff\1\42\15\uffff\12\42\1\uffff\2\5",
            "\1\42\14\uffff\1\42\1\43\5\uffff\2\42\1\uffff\5\42\2\uffff\1\42\2\uffff\7\42\12\uffff\1\44\7\uffff\1\42\15\uffff\12\42\1\uffff\2\44",
            "\1\42\14\uffff\1\42\1\43\5\uffff\2\42\1\uffff\5\42\2\uffff\1\42\2\uffff\7\42\12\uffff\1\44\7\uffff\1\42\15\uffff\12\42\1\uffff\2\44",
            "",
            "",
            "",
            "",
            "",
            "\1\45\10\uffff\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\50\10\uffff\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\51\10\uffff\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\52\10\uffff\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\53\10\uffff\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\54\10\uffff\1\23\14\uffff\1\23\1\46\5\uffff\2\23\1\uffff\5\23\2\uffff\1\23\2\uffff\7\23\12\uffff\1\47\7\uffff\1\23\15\uffff\12\23\1\uffff\2\47",
            "\1\21\33\uffff\1\37",
            "\1\37",
            "\1\20\14\uffff\2\20\5\uffff\2\20\1\uffff\5\20\2\uffff\1\20\2\uffff\7\20\10\uffff\1\20\1\uffff\1\20\6\uffff\1\37\1\20\15\uffff\12\20",
            "\1\55",
            "\1\41\1\uffff\3\41\6\uffff\1\41\13\uffff\3\41\5\uffff\2\41\1\uffff\5\41\2\uffff\1\41\2\uffff\7\41\1\uffff\7\41\1\uffff\6\41\3\uffff\1\41\1\56\7\uffff\17\41\1\uffff\10\41",
            "",
            "",
            "",
            "",
            "\1\31\1\27",
            "",
            "",
            "\1\32\1\25\1\31\1\27",
            "\1\33\1\26\1\32\1\25\1\31\1\27",
            "\1\27",
            "\1\25\1\31\1\27",
            "\1\26\1\32\1\25\1\31\1\27",
            "\1\57\14\uffff\1\57\1\60\5\uffff\2\57\1\uffff\5\57\2\uffff\1\57\2\uffff\7\57\12\uffff\1\61\7\uffff\1\57\15\uffff\12\57\1\uffff\2\61",
            "\1\57\14\uffff\1\57\1\60\5\uffff\2\57\1\uffff\5\57\2\uffff\1\57\2\uffff\7\57\12\uffff\1\61\7\uffff\1\57\15\uffff\12\57\1\uffff\2\61",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "2486:2: ( ( ( ruleConstantExpression )=>this_ConstantExpression_0= ruleConstantExpression ) | this_TimePredicate_1= ruleTimePredicate | this_SlotRef_2= ruleSlotRef | this_ThisExpression_3= ruleThisExpression | this_QuantifierExpression_4= ruleQuantifierExpression | this_DescriptiveExpression_5= ruleDescriptiveExpression | this_GlobalTimeQuery_6= ruleGlobalTimeQuery | this_TimeConstant_7= ruleTimeConstant | this_TimeQuery_8= ruleTimeQuery | (otherlv_9= '(' this_Expression_10= ruleExpression otherlv_11= ')' ) )";
        }
    }
    static final String dfa_22s = "\24\uffff";
    static final String dfa_23s = "\1\4\2\0\21\uffff";
    static final String dfa_24s = "\1\151\2\0\21\uffff";
    static final String dfa_25s = "\3\uffff\17\2\1\3\1\1";
    static final String dfa_26s = "\1\0\1\1\1\2\21\uffff}>";
    static final String[] dfa_27s = {
            "\1\15\1\uffff\1\4\26\uffff\1\5\32\uffff\1\13\10\uffff\1\6\2\uffff\1\3\1\22\14\uffff\1\21\1\7\1\uffff\1\11\14\uffff\1\1\1\2\1\10\1\12\1\14\1\16\1\17\1\20",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "3089:2: (this_SimpleTimePredicate_0= ruleSimpleTimePredicate | ( ( ruleBoundedTimePredicate )=>this_BoundedTimePredicate_1= ruleBoundedTimePredicate ) | ( ( rulePeriodicTimePredicate )=>this_PeriodicTimePredicate_2= rulePeriodicTimePredicate ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==98) ) {s = 1;}

                        else if ( (LA66_0==99) ) {s = 2;}

                        else if ( (LA66_0==68) && (synpred10_InternalSmartContractSpecification())) {s = 3;}

                        else if ( (LA66_0==RULE_INT) && (synpred10_InternalSmartContractSpecification())) {s = 4;}

                        else if ( (LA66_0==29) && (synpred10_InternalSmartContractSpecification())) {s = 5;}

                        else if ( (LA66_0==65) && (synpred10_InternalSmartContractSpecification())) {s = 6;}

                        else if ( (LA66_0==83) && (synpred10_InternalSmartContractSpecification())) {s = 7;}

                        else if ( (LA66_0==100) && (synpred10_InternalSmartContractSpecification())) {s = 8;}

                        else if ( (LA66_0==85) && (synpred10_InternalSmartContractSpecification())) {s = 9;}

                        else if ( (LA66_0==101) && (synpred10_InternalSmartContractSpecification())) {s = 10;}

                        else if ( (LA66_0==56) && (synpred10_InternalSmartContractSpecification())) {s = 11;}

                        else if ( (LA66_0==102) && (synpred10_InternalSmartContractSpecification())) {s = 12;}

                        else if ( (LA66_0==RULE_ID) && (synpred10_InternalSmartContractSpecification())) {s = 13;}

                        else if ( (LA66_0==103) && (synpred10_InternalSmartContractSpecification())) {s = 14;}

                        else if ( (LA66_0==104) && (synpred10_InternalSmartContractSpecification())) {s = 15;}

                        else if ( (LA66_0==105) && (synpred10_InternalSmartContractSpecification())) {s = 16;}

                        else if ( (LA66_0==82) && (synpred10_InternalSmartContractSpecification())) {s = 17;}

                        else if ( (LA66_0==69) && (synpred11_InternalSmartContractSpecification())) {s = 18;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 19;}

                        else if ( (synpred10_InternalSmartContractSpecification()) ) {s = 17;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 19;}

                        else if ( (synpred10_InternalSmartContractSpecification()) ) {s = 17;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\50\uffff";
    static final String dfa_29s = "\1\16\12\uffff\3\35\2\uffff\7\16\17\uffff\2\35";
    static final String dfa_30s = "\1\4\1\113\2\0\6\4\1\110\3\17\1\uffff\1\4\3\6\1\17\3\6\1\uffff\1\110\1\4\1\112\2\0\3\uffff\1\121\1\117\1\115\1\120\1\116\1\114\2\17";
    static final String dfa_31s = "\1\151\1\121\2\0\6\4\1\111\3\143\1\uffff\1\76\7\143\1\uffff\1\110\1\4\1\112\2\0\3\uffff\6\121\2\143";
    static final String dfa_32s = "\16\uffff\1\2\10\uffff\1\1\5\uffff\1\3\1\4\1\5\10\uffff";
    static final String dfa_33s = "\2\uffff\1\1\1\2\27\uffff\1\3\1\0\13\uffff}>";
    static final String[] dfa_34s = {
            "\1\12\1\uffff\1\1\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\1\uffff\1\10\10\uffff\1\3\7\uffff\1\16\10\uffff\1\17\1\4\1\uffff\1\6\1\uffff\12\16\1\uffff\2\16\1\5\1\7\1\11\1\13\1\14\1\15",
            "\1\26\1\22\1\25\1\21\1\24\1\20\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\31\1\32",
            "\1\35\14\uffff\1\35\1\33\5\uffff\2\35\1\uffff\5\35\2\uffff\1\35\2\uffff\7\35\12\uffff\1\34\7\uffff\1\35\15\uffff\12\35\1\uffff\2\35",
            "\1\35\14\uffff\1\35\1\33\5\uffff\2\35\1\uffff\5\35\2\uffff\1\35\2\uffff\7\35\12\uffff\1\34\7\uffff\1\35\15\uffff\12\35\1\uffff\2\35",
            "\1\35\14\uffff\1\35\1\33\5\uffff\2\35\1\uffff\5\35\2\uffff\1\35\2\uffff\7\35\12\uffff\1\34\7\uffff\1\35\15\uffff\12\35\1\uffff\2\35",
            "",
            "\1\36\63\uffff\7\37",
            "\1\40\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "\1\41\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "\1\42\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "\1\43\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "\1\44\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "\1\45\10\uffff\1\16\14\uffff\1\16\1\2\5\uffff\2\16\1\uffff\5\16\2\uffff\1\16\2\uffff\7\16\12\uffff\1\3\7\uffff\1\16\15\uffff\12\16\1\uffff\2\16",
            "",
            "\1\31",
            "\1\46",
            "\1\47",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\23",
            "\1\24\1\20\1\23",
            "\1\25\1\21\1\24\1\20\1\23",
            "\1\20\1\23",
            "\1\21\1\24\1\20\1\23",
            "\1\22\1\25\1\21\1\24\1\20\1\23",
            "\1\35\14\uffff\1\35\1\33\5\uffff\2\35\1\uffff\5\35\2\uffff\1\35\2\uffff\7\35\12\uffff\1\34\7\uffff\1\35\15\uffff\12\35\1\uffff\2\35",
            "\1\35\14\uffff\1\35\1\33\5\uffff\2\35\1\uffff\5\35\2\uffff\1\35\2\uffff\7\35\12\uffff\1\34\7\uffff\1\35\15\uffff\12\35\1\uffff\2\35"
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_28;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "3449:2: ( ( ( ruleTimeLine )=>this_TimeLine_0= ruleTimeLine ) | this_TimeConstant_1= ruleTimeConstant | this_TimeQuery_2= ruleTimeQuery | this_TimeVarExpression_3= ruleTimeVarExpression | this_TimeThisExpression_4= ruleTimeThisExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_28 = input.LA(1);

                         
                        int index70_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSmartContractSpecification()) ) {s = 23;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index70_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSmartContractSpecification()) ) {s = 23;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSmartContractSpecification()) ) {s = 23;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_27 = input.LA(1);

                         
                        int index70_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSmartContractSpecification()) ) {s = 23;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index70_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001C2870010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001C0070010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C0070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020200022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001C04000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x7F808000280081D0L,0x000003FC007C003FL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000039000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000005C04000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000005C00000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000005800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000003D000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x000000007F800200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000012L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000010L,0x0000000280000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000000000050L,0x000003F0002C0010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0100000000000050L,0x000003F000280000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x7F00000000000000L});

}