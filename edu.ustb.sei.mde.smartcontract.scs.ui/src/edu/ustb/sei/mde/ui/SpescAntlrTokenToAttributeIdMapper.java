package edu.ustb.sei.mde.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class SpescAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
protected String calculateId(String tokenName, int tokenType) {
	if("RULE_SLD".equals(tokenName))
		return HighlightingConfiguration.SLD_ID;
	return super.calculateId(tokenName, tokenType);
}
}
