/*
 * generated by Xtext
 */
package hu.bme.mit.inf.dslreasoner.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AlloyLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalAlloyLanguage.tokens");
	}
}
