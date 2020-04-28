package org.eclipse.viatra.solver.language.ui.highlight

import java.util.Random
import java.util.WeakHashMap
import org.eclipse.viatra.solver.language.solverLanguage.ModelSymbol
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator

class SolverSemanticHighlightCalculator extends DefaultSemanticHighlightingCalculator {
	public static val SmybolCode = "SymbolCode"
	
	val symbolName2ID = new WeakHashMap<String,String>
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (resource === null || resource.getParseResult() === null) {
			return
		} else {
			val modelSymbols = resource.allContents.filter(ModelSymbol)
			while(modelSymbols.hasNext) {
				val symbolElement = modelSymbols.next
				val node = NodeModelUtils::getNode(symbolElement)
				acceptor.addPosition(
					node.getOffset(),
					node.getLength(),
					getSymbolCode(symbolElement.name)
				)
			}
		}
	}
	
	def getSymbolCode(String name) {
		if(symbolName2ID.containsKey(name)) {
			return symbolName2ID.get(name)
		} else {
			val id = calculateSymbolCode(name)
			symbolName2ID.put(name,id)
			return id
		}
	}
	
	def String calculateSymbolCode(String name) {
		val Random random = new Random(name.hashCode)
		val hue = huePick(random.nextFloat)
		val saturation = 0.1+random.nextFloat*0.2
		val brightness = random.nextFloat/4+0.7f
		return '''«SmybolCode» «hue» «saturation» «brightness»'''
	}
	private def huePick(float random) {
		val pink = 300
		val tolerance = 10
		val degree = random*(360-2*tolerance)
		if(degree<pink-tolerance) return degree
		else return degree+2*tolerance
	}
}