/*
 * generated by Xtext 2.12.0
 */
package edu.ustb.sei.mde.formatting2

import com.google.inject.Inject
import edu.ustb.sei.mde.services.SmartContractSpecificationGrammarAccess
import edu.ustb.sei.mde.smartContractSpecification.ComplexType
import edu.ustb.sei.mde.smartContractSpecification.Contract
import edu.ustb.sei.mde.smartContractSpecification.Field
import edu.ustb.sei.mde.smartContractSpecification.Party
import edu.ustb.sei.mde.smartContractSpecification.Term
import edu.ustb.sei.mde.smartContractSpecification.Type
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import edu.ustb.sei.mde.smartContractSpecification.Asset

class SmartContractSpecificationFormatter extends AbstractFormatter2 {
	
	@Inject extension SmartContractSpecificationGrammarAccess

	def dispatch void format(Contract contract, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Party party : contract.getParties()) {
			party.format;
		}
		for (Term term : contract.getTerms()) {
			term.format;
		}
		for (Type type : contract.getTypes()) {
			type.format;
		}
		for (Field field : contract.getFields()) {
			field.format;
		}
		for (Asset asset: contract.getAssets()) {
			asset.format;
		}
	}

	def dispatch void format(ComplexType complexType, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Field field : complexType.getFields()) {
			field.format;
		}
	}
	def dispatch void format(Asset asset, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Field field : asset.getFields()) {
			field.format;
		}
	}
	// TODO: implement for InternalParty, ExternalParty, RightTerm, ConditionalExpression, ImplyExpression, OrExpression, AndExpression, NotExpression, RelationalExpression, AdditiveExpression, MultiplicativeExpression
}
