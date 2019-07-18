package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

/////////////////////
//SQRCNT(v) = # squares containing v / total # squares in model
/////////////////////
class CalcSQRTOT {

	// ///////////////////
	// SQRTOT(v) = # squares containing v / total # of 2-jump paths from v
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRTOTfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var tot2ndNeighbours = 0.0
		var num1stNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size
			tot2ndNeighbours = 0
			var numSquares = 0.0
//			println("xxxxxxxxxxxxxxxx")
//			println(neighbours)
//			println("xxxxxxxxxxxxxxxx")
			for (neighbour1 : neighbours) {
				val neighsOfNeigh = neighbour1.lookup(node2Neighbours)
				tot2ndNeighbours += neighsOfNeigh.size - 1 // -1 to not consider edge to self
				for (neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						for (neighOfNeigh1 : neighsOfNeigh) {
							if (neighOfNeigh1 != node && neighOfNeigh1.lookup(node2Neighbours).contains(neighbour2)) {
//								print("-----")
//								print(neighbour1)
//								print("   ")
//								print(neighbour2)
//								print("   ")
//								print(neighOfNeigh1)
//								println()
								numSquares++
							}
						}

					}
				}
			}

//			println(node)
			val num2ndNeighbours = tot2ndNeighbours

//			print("(" + numSquares + "x" + num2ndNeighbours)
			var sqr = 0.0
			if (num2ndNeighbours != 0) {
				sqr = numSquares / num2ndNeighbours
			}

//			println("=" + sqr + ")")
//			println()
			totalSQR += sqr
		}
		val numNodes = nodes.length
		val avgC = totalSQR / numNodes

		return avgC
	}

	def static getSQRTOTfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQRTOTfromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		// Operations
		val Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> deep2shallowNeighbours = new HashMap

		for (deepNode : nhDeepNodes) {

			// get neighbours
			val Set<AbstractNodeDescriptor> neighbours = new HashSet
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			for (inEdge : deepNodeDesc.incomingEdges.keySet) {
				val edgeDesc = (inEdge as IncomingRelation)
				neighbours.add(edgeDesc.from as AbstractNodeDescriptor)
			}
			for (outEdge : deepNodeDesc.outgoingEdges.keySet) {
				val edgeDesc = (outEdge as OutgoingRelation)
				neighbours.add(edgeDesc.to as AbstractNodeDescriptor)
			}
			deep2shallowNeighbours.put(deepNodeDesc, neighbours)

		}

		var totalSQR = 0.0
		var tot2ndNeighbours = 0.0
		for (deepNode : nhDeepNodes) {
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			var numSquares = 0.0
			if (!Util.toLocalNode(deepNodeDesc).types.empty) {
				// get neighbours
				val Set<AbstractNodeDescriptor> relevantNodes = deepNodeDesc.lookup(deep2shallowNeighbours)

				
				// look for 2ndNeighbours
				for (rel1 : relevantNodes) {
					for (rel2 : relevantNodes) {
						if (rel1 != rel2) {
							for (pot2ndN : nhDeepNodes) {
								if (deepNode != pot2ndN) {
									// find neighbours
									val pot2ndNDesc = pot2ndN as FurtherNodeDescriptor
									val Set<AbstractNodeDescriptor> neighbours = pot2ndNDesc.lookup(
										deep2shallowNeighbours)

									// see if pot2ndN is 2nd Neighbour
									if (neighbours.contains(rel1)) {
										tot2ndNeighbours++
									}

									// see if square exists
									if (neighbours.contains(rel1) && neighbours.contains(rel2)) {
										numSquares++
									}
								}
							}
						}
					}
				}
			}
			var sqr = 0.0
			if (tot2ndNeighbours != 0) {
				sqr = numSquares / tot2ndNeighbours
			}

			totalSQR += sqr

		}

		val numDeepNodes = nhDeepNodes.length

		var averageSQR = 0.0
		if (totalSQR != 0) {
			averageSQR = totalSQR / numDeepNodes
		}

		return averageSQR
	}
}

class CalcSQRMAX {

	// ///////////////////
	// SQRMAX(v) = # squares containing v / (# neighbours of v * max # of neeighbours of any neighbour of v)
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRMAXfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalC = 0.0
		var max2ndNeighbours = 0.0
		var num1stNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size
			max2ndNeighbours = 0
			var numSquares = 0.0
			for (neighbour1 : neighbours) {
				for (neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						val neighsOfNeigh = neighbour1.lookup(node2Neighbours)
						if (max2ndNeighbours < neighsOfNeigh.size) {
							max2ndNeighbours = neighsOfNeigh.size
						}
						for (neighOfNeigh1 : neighsOfNeigh) {
							if (neighOfNeigh1 != node && neighOfNeigh1.lookup(node2Neighbours).contains(neighbour2)) {
//								print(neighbour1)
//								print("   ")
//								print(neighbour2)
//								print("   ")
//								print(neighOfNeigh1)
//								println()
								numSquares++
							}
						}

					}
				}
			}
//			println(node)
			val num2ndNeighbours = num1stNeighbours * max2ndNeighbours

//			print("(" + numSquares + "x" + num2ndNeighbours)
			var sqr = 0.0
			if (num2ndNeighbours != 0) {
				sqr = numSquares / num2ndNeighbours
			}

//			println("=" + sqr + ")")
			totalC += sqr
		}
		val numNodes = nodes.length
		val avgC = totalC / numNodes

		return avgC
	}

	def static getSQRMAXfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQRMAXfromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQROSZ {

	// ///////////////////
	// SQROSZ(v) = # depth-4 paths that lead to v / 
	// (# 1-d neighs * # 2-d neighs * # 3-d neighs * # 4-d neighs) (NOT MEANINGFUL????)
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQROSZfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var totalDenom = 0.0
		var num1stNeighbours = 0.0
		var num2ndNeighbours = 0.0
		var num3rdNeighbours = 0.0
		var num4thNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size

			for (neighbour1 : neighbours) {
				val neighbours1 = neighbour1.lookup(node2Neighbours)
				num2ndNeighbours = neighbours1.size

				for (neighbour2 : neighbours1) {
					val neighbours2 = neighbour2.lookup(node2Neighbours)
					num3rdNeighbours = neighbours2.size

					for (neighbour3 : neighbours2) {
						val neighbours3 = neighbour3.lookup(node2Neighbours)
						num4thNeighbours = neighbours3.size

						if (neighbours3.contains(node)) {
							totalSQR += 1
						}
						totalDenom += num1stNeighbours * num2ndNeighbours * num3rdNeighbours * num4thNeighbours
					}
				}
			}
		}
		val avgSQR = totalSQR / totalDenom

		return avgSQR
	}

	def static getSQROSZfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQROSZfromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQROSZ2 {

	// ///////////////////
	// SQROSZ2(v) = # depth-4 paths that lead to v / total # depth-4 paths
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQROSZ2fromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var totalDenom = 0.0
		var num4thNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)

			for (neighbour1 : neighbours) {
				val neighbours1 = neighbour1.lookup(node2Neighbours)

				for (neighbour2 : neighbours1) {
					val neighbours2 = neighbour2.lookup(node2Neighbours)

					for (neighbour3 : neighbours2) {
						val neighbours3 = neighbour3.lookup(node2Neighbours)
						num4thNeighbours = neighbours3.size

						if (neighbours3.contains(node)) {
							totalSQR += 1
						}
						totalDenom += num4thNeighbours
					}
				}
			}
		}
		val avgSQR = totalSQR / totalDenom

		return avgSQR
	}

	def static getSQROSZ2fromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQROSZ2fromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQROCOOL {

	// ///////////////////
	// SQROCOOL (v) = (# 1-d neighs * # 1-d neighs ) / (# 1-d neighs * # 1-d neighs * # depth-2 paths from v)
	// 1 / # depth-2 paths from v
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQROCOOLfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var totalDenom = 0.0
		var num4thNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)

			for (neighbour1 : neighbours) {

				for (neighbour2 : neighbours) {

					for (neighbour3 : neighbours) {
						val neighbours3 = neighbour3.lookup(node2Neighbours)
						num4thNeighbours = neighbours3.size

						if (neighbours3.contains(node)) {
							totalSQR += 1
						}
						totalDenom += num4thNeighbours
					}
				}
			}
		}
		val avgSQR = totalSQR / totalDenom

		return avgSQR
	}

	def static getSQROCOOLfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQROCOOLfromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQRCNT {

	// ///////////////////
	// SQRCNT(v) = # neighbour pairs of v that are linked by a 2-jump path / 
	// (# neighbours of v * (#neighbours of v - 1) )
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRCNTfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var numNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			numNeighbours = neighbours.size
			var numSquares = 0.0
//			println("xxxxxxxxxxxxxxxx")
//			println(neighbours)
//			println("xxxxxxxxxxxxxxxx")
			for (neighbour1 : neighbours) {

				val neighsOfNeigh = neighbour1.lookup(node2Neighbours)

				for (neighbour2 : neighbours) {
					var foundSquare = false
					if (neighbour1 != neighbour2) {
						for (neighOfNeigh1 : neighsOfNeigh) {
							if (!foundSquare) {
								if (neighOfNeigh1 != node &&
									neighOfNeigh1.lookup(node2Neighbours).contains(neighbour2)) {
//								print("-----")
//								print(neighbour1)
//								print("   ")
//								print(neighbour2)
//								print("   ")
//								print(neighOfNeigh1)
//								println()
									numSquares++
									foundSquare = true
								}
							}
						}

					}
				}
			}

//			println(node)
//			print("(" + numSquares + "x" + num2ndNeighbours)
			var sqr = 0.0
			if (numSquares != 0) {
				sqr = numSquares / numNeighbours / (numNeighbours - 1 )
			}

//			println("=" + sqr + ")")
//			println()
			totalSQR += sqr
		}
		val numNodes = nodes.length
		var avgSQR = 0.0
		if (totalSQR != 0) {
			avgSQR = totalSQR / numNodes
		}

//		println("RESULT : " + avgSQR)
		return avgSQR
	}

	def static getSQRCNTfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQRCNTfromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		val Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> deep2shallowNeighbours = new HashMap

		for (deepNode : nhDeepNodes) {

			// get neighbours
			val Set<AbstractNodeDescriptor> neighbours = new HashSet
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			for (inEdge : deepNodeDesc.incomingEdges.keySet) {
				val edgeDesc = (inEdge as IncomingRelation)
				neighbours.add(edgeDesc.from as AbstractNodeDescriptor)
			}
			for (outEdge : deepNodeDesc.outgoingEdges.keySet) {
				val edgeDesc = (outEdge as OutgoingRelation)
				neighbours.add(edgeDesc.to as AbstractNodeDescriptor)
			}
			deep2shallowNeighbours.put(deepNodeDesc, neighbours)

		}
//		printMap(nhDeepRep, deep2shallowNeighbours)
		// Operations
		var totalSQR = 0.0
		var totNumNodes = 0.0
		var numNeighbours = 0.0
		for (deepNode : nhDeepNodes) {
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			if (!Util.toLocalNode(deepNodeDesc).types.empty) {
				// get neighbours
				val Set<AbstractNodeDescriptor> relevantNodes = deepNodeDesc.lookup(deep2shallowNeighbours)

				numNeighbours = relevantNodes.size // V1
				var numSquares = 0.0
				// look for 2ndNeighbours
				for (rel1 : relevantNodes) {
//					numNeighbours += rel1.lookup(nhRep) as Integer//V2
					for (rel2 : relevantNodes) {
						var foundSquare = false
						if (rel1 != rel2) {
							for (pot2ndN : nhDeepNodes) {
								if (!foundSquare) {
									if (deepNode != pot2ndN) {
										// find neighbours
										val pot2ndNDesc = pot2ndN as FurtherNodeDescriptor

										val Set<AbstractNodeDescriptor> neighbours = pot2ndNDesc.lookup(
											deep2shallowNeighbours)

										// see if square exists
										if (neighbours.contains(rel1) && neighbours.contains(rel2)) {
											numSquares++ // V1
//											numSquares += rel1.lookup(nhRep) as Integer * rel2.lookup(nhRep) as Integer//V2
											foundSquare = true
										}
									}
								}
							}
						}
					}
				}

				var sqr = 0.0
				if (numSquares != 0) {
					sqr = numSquares / numNeighbours / (numNeighbours - 1 )
				}

				var numOcc = deepNode.lookup(nhDeepRep) as Integer
				sqr *= numOcc
				totNumNodes += numOcc

				totalSQR += sqr

			}

		}

		var avgSQR = 0.0
		if (totalSQR != 0) {
			avgSQR = totalSQR / totNumNodes
		}
//		println("RESULT : " + avgSQR)
		return avgSQR
	}

	def static printMap(Map<AbstractNodeDescriptor, Integer> nhDeepRep,
		Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> map) {
		for (key : map.keySet) {
			println(key.lookup(nhDeepRep) + " " + key + " -> " + key.lookup(map))
		}
	}
}
