/*
 * generated by Xtext 2.22.0
 */
package edu.ustb.sei.mde.parser.antlr;

import com.google.inject.Inject;
import edu.ustb.sei.mde.parser.antlr.internal.InternalSmartContractSpecificationParser;
import edu.ustb.sei.mde.services.SmartContractSpecificationGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SmartContractSpecificationParser extends AbstractAntlrParser {

	@Inject
	private SmartContractSpecificationGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSmartContractSpecificationParser createParser(XtextTokenStream stream) {
		return new InternalSmartContractSpecificationParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Contract";
	}

	public SmartContractSpecificationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmartContractSpecificationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}