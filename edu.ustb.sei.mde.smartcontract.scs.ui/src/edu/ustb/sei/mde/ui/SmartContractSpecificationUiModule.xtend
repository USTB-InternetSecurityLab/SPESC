/*
 * generated by Xtext 2.12.0
 */
package edu.ustb.sei.mde.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import com.google.inject.Binder
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SmartContractSpecificationUiModule extends AbstractSmartContractSpecificationUiModule {
	
	override configure(Binder binder) { 
		super.configure(binder);
		binder.bind(IHighlightingConfiguration).to(HighlightingConfiguration);
		binder.bind(AbstractAntlrTokenToAttributeIdMapper).to(SpescAntlrTokenToAttributeIdMapper);
	}
	
	
	
	
}