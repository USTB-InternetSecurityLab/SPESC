/*
 * generated by Xtext 2.22.0
 */
package edu.ustb.sei.mde.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SmartContractSpecificationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("edu/ustb/sei/mde/parser/antlr/internal/InternalSmartContractSpecification.tokens");
	}
}