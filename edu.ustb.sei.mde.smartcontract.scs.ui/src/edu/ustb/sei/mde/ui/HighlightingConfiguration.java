package edu.ustb.sei.mde.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration  {

	public static final String SLD_ID = "SLD";
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(SLD_ID, "description", sldTextStyle());
	}
	
	public TextStyle sldTextStyle() {
	    TextStyle textStyle = new TextStyle();
	    textStyle.setColor(new RGB(140, 140, 140));
	    textStyle.setStyle(SWT.ITALIC);
	    return textStyle;
	  }

}
