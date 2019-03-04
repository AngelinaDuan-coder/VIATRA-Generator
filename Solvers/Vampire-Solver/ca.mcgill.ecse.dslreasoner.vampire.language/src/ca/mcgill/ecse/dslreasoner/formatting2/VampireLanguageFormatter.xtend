/*
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.dslreasoner.formatting2

import ca.mcgill.ecse.dslreasoner.services.VampireLanguageGrammarAccess
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSComment
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSInclude
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSName
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class VampireLanguageFormatter extends AbstractFormatter2 {
	
	@Inject extension VampireLanguageGrammarAccess

	def dispatch void format(VampireModel vampireModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (VLSInclude vLSInclude : vampireModel.getIncludes()) {
			vLSInclude.format;
		}
		for (VLSComment vLSComment : vampireModel.getComments()) {
			vLSComment.format;
		}
		for (VLSFofFormula vLSFofFormula : vampireModel.getFormulas()) {
			vLSFofFormula.format;
		}
	}

	def dispatch void format(VLSInclude vLSInclude, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (VLSName vLSName : vLSInclude.getNames()) {
			vLSName.format;
		}
	}
	
	def dispatch void format(VLSFofFormula formula, extension IFormattableDocument document){
		formula.append[newLine]
	}
	
	def dispatch void format(VLSComment comment, extension IFormattableDocument document){
		comment.append[newLine]
	}
	// TODO: implement for VLSFofFormula, VLSAnnotation, VLSAnd, VLSOr, VLSUniversalQuantifier, VLSExistentialQuantifier, VLSUnaryNegation, VLSFunction, VLSLess, VLSFunctionFof, VLSEquivalent, VLSImplies, VLSRevImplies, VLSXnor, VLSNor, VLSNand, VLSInequality, VLSEquality, VLSAssignment
}
