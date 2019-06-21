package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import linkedList.LinkedListPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class MetricsCalculationUsingShapes {
  private final static InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  private static DecimalFormat df = new DecimalFormat("0.000");
  
  private final static Integer NUMMEASUREMENTS = Integer.valueOf(9);
  
  private final static Integer NUMNA = Integer.valueOf(2);
  
  public static void main(final String[] args) {
    try {
      MetricsCalculationUsingShapes.df.setRoundingMode(RoundingMode.UP);
      final String outputFolder = "outputs//calculatedMetrics//stats//";
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      YakindummPackage.eINSTANCE.eClass();
      LinkedListPackage.eINSTANCE.eClass();
      ReteEngine.class.getClass();
      final String fileDir = "Human//";
      final String outputFileName = "stats.csv";
      final String inputs = "resources//";
      final FileSystemWorkspace workspace = new FileSystemWorkspace(inputs, "");
      List<List<String>> metricValues = CollectionLiterals.<List<String>>newArrayList();
      for (int i = 0; (i < (MetricsCalculationUsingShapes.NUMMEASUREMENTS).intValue()); i++) {
        metricValues.add(CollectionLiterals.<String>newArrayList());
      }
      double metricVal = 0.0;
      int index = 0;
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("sampleList.xmi");
      for (final String fileName : _newArrayList) {
        {
          int _plusPlus = index++;
          InputOutput.<Integer>println(Integer.valueOf(_plusPlus));
          final String nameWOExt = fileName.substring(0, fileName.indexOf("."));
          final EObject model = workspace.<EObject>readModel(EObject.class, fileName);
          final PartialInterpretation partialModel = MetricsCalculationUsingShapes.getPartialModel(workspace, model);
          metricVal = MetricsCalculationUsingShapes.getNAfromModel(model);
          metricValues.get(0).add(MetricsCalculationUsingShapes.df.format(metricVal));
          metricVal = MetricsCalculationUsingShapes.getNAfromNHShape(partialModel);
          metricValues.get(1).add(MetricsCalculationUsingShapes.df.format(metricVal));
          metricVal = MetricsCalculationUsingShapes.getMPCfromModel(model);
          metricValues.get(2).add(MetricsCalculationUsingShapes.df.format(metricVal));
          for (int i = 0; (i < ((MetricsCalculationUsingShapes.NUMMEASUREMENTS).intValue() - 3)); i++) {
            {
              metricVal = MetricsCalculationUsingShapes.getMPCfromNHShape(partialModel, Integer.valueOf(i));
              metricValues.get((i + 3)).add(MetricsCalculationUsingShapes.df.format(metricVal));
            }
          }
        }
      }
      final ArrayList<String> headers = CollectionLiterals.<String>newArrayList("NA,Model,", "NA,Shape,", "MPC,Model,", "MPC,Shape0,", "MPC,Shape1,", "MPC,Shape2,", 
        "MPC,Shape3,", "MPC,Shape4,", "MPC,Shape5,");
      PrintWriter writer = new PrintWriter((outputFolder + "statsNA.csv"));
      for (int i = 0; (i < (MetricsCalculationUsingShapes.NUMNA).intValue()); i++) {
        {
          writer.append(headers.get(i));
          writer.append(String.join(",", metricValues.get(i)));
          writer.append("\n");
        }
      }
      writer.close();
      PrintWriter _printWriter = new PrintWriter((outputFolder + "statsMPC.csv"));
      writer = _printWriter;
      for (Integer i = MetricsCalculationUsingShapes.NUMNA; (i.compareTo(MetricsCalculationUsingShapes.NUMMEASUREMENTS) < 0); i++) {
        {
          writer.append(headers.get((i).intValue()));
          writer.append(String.join(",", metricValues.get((i).intValue())));
          writer.append("\n");
        }
      }
      writer.close();
      InputOutput.<String>println("Node Activity:");
      List<String> _get = metricValues.get(0);
      String _plus = ("from Partial Model: " + _get);
      InputOutput.<String>println(_plus);
      List<String> _get_1 = metricValues.get(1);
      String _plus_1 = ("from NH Shape     : " + _get_1);
      InputOutput.<String>println(_plus_1);
      InputOutput.<String>println("MPC:");
      List<String> _get_2 = metricValues.get(2);
      String _plus_2 = ("from Partial Model: " + _get_2);
      InputOutput.<String>println(_plus_2);
      for (int i = 0; (i < ((MetricsCalculationUsingShapes.NUMMEASUREMENTS).intValue() - 3)); i++) {
        List<String> _get_3 = metricValues.get((i + 3));
        String _plus_3 = ((("from NH Shape " + Integer.valueOf(i)) + "   : ") + _get_3);
        InputOutput.<String>println(_plus_3);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static double getNAfromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    double totalNA = 0.0;
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    Map<EObject, Set<String>> node2ActiveDims = new HashMap<EObject, Set<String>>();
    for (final EObject node : nodes) {
      HashSet<String> _hashSet = new HashSet<String>();
      node2ActiveDims.put(node, _hashSet);
    }
    for (final EObject node_1 : nodes) {
      EList<EReference> _eAllReferences = node_1.eClass().getEAllReferences();
      for (final EReference reference : _eAllReferences) {
        {
          final Object pointingTo = node_1.eGet(reference);
          if ((!(pointingTo instanceof List))) {
            if ((pointingTo != null)) {
              CollectionsUtil.<EObject, Set<String>>lookup(node_1, node2ActiveDims).add(reference.getName());
              CollectionsUtil.<EObject, Set<String>>lookup(((EObject) pointingTo), node2ActiveDims).add(reference.getName());
            }
          } else {
            final List pointingToSet = ((List) pointingTo);
            boolean _isEmpty = pointingToSet.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              for (final Object target : pointingToSet) {
                {
                  CollectionsUtil.<EObject, Set<String>>lookup(node_1, node2ActiveDims).add(reference.getName());
                  CollectionsUtil.<EObject, Set<String>>lookup(((EObject) target), node2ActiveDims).add(reference.getName());
                }
              }
            }
          }
        }
      }
    }
    Collection<Set<String>> _values = node2ActiveDims.values();
    for (final Set<String> activeDims : _values) {
      double _talNA = totalNA;
      int _length = ((Object[])Conversions.unwrapArray(activeDims, Object.class)).length;
      totalNA = (_talNA + _length);
    }
    final double averageNA = (totalNA / numNodes);
    return averageNA;
  }
  
  public static double getNAfromNHLattice(final PartialInterpretation partialModel) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = MetricsCalculationUsingShapes.neighbourhoodComputer.createRepresentation(partialModel, 2, Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = MetricsCalculationUsingShapes.neighbourhoodComputer.createRepresentation(partialModel, 1, Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    Map<AbstractNodeDescriptor, Set<String>> node2ActiveDims = new HashMap<AbstractNodeDescriptor, Set<String>>();
    for (final Object nhNode : nhNodes) {
      HashSet<String> _hashSet = new HashSet<String>();
      node2ActiveDims.put(((AbstractNodeDescriptor) nhNode), _hashSet);
    }
    for (final Object nhDeepNode : nhDeepNodes) {
      {
        final FurtherNodeDescriptor nhDeepNodeDesc = ((FurtherNodeDescriptor) nhDeepNode);
        Object _previousRepresentation = nhDeepNodeDesc.getPreviousRepresentation();
        final AbstractNodeDescriptor nhParentNode = ((AbstractNodeDescriptor) _previousRepresentation);
        Set _keySet = nhDeepNodeDesc.getIncomingEdges().keySet();
        for (final Object inEdge : _keySet) {
          {
            final String edgeDim = ((IncomingRelation) inEdge).getType();
            CollectionsUtil.<AbstractNodeDescriptor, Set<String>>lookup(nhParentNode, node2ActiveDims).add(edgeDim);
          }
        }
        Set _keySet_1 = nhDeepNodeDesc.getOutgoingEdges().keySet();
        for (final Object outEdge : _keySet_1) {
          {
            final String edgeDim = ((OutgoingRelation) outEdge).getType();
            CollectionsUtil.<AbstractNodeDescriptor, Set<String>>lookup(nhParentNode, node2ActiveDims).add(edgeDim);
          }
        }
      }
    }
    double totalNA = 0.0;
    int numModelElems = 0;
    Set<AbstractNodeDescriptor> _keySet = node2ActiveDims.keySet();
    for (final AbstractNodeDescriptor nhNode_1 : _keySet) {
      {
        Set<String> activeDimsForNode = CollectionsUtil.<AbstractNodeDescriptor, Set<String>>lookup(nhNode_1, node2ActiveDims);
        Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(nhNode_1, nhRep);
        Integer numNodeOccurences = ((Integer) _lookup);
        boolean _isEmpty = activeDimsForNode.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          double _talNA = totalNA;
          final Set<String> _converted_activeDimsForNode = (Set<String>)activeDimsForNode;
          int _length = ((Object[])Conversions.unwrapArray(_converted_activeDimsForNode, Object.class)).length;
          int _multiply = (_length * (numNodeOccurences).intValue());
          totalNA = (_talNA + _multiply);
          int _numModelElems = numModelElems;
          numModelElems = (_numModelElems + (numNodeOccurences).intValue());
        }
      }
    }
    final double averageNAwithWeight = (totalNA / numModelElems);
    return averageNAwithWeight;
  }
  
  public static double getNAfromNHShape(final PartialInterpretation pm) {
    return MetricsCalculationUsingShapes.getNAfromNHShape(pm, Integer.valueOf(1));
  }
  
  public static double getNAfromNHShape(final PartialInterpretation partialModel, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = MetricsCalculationUsingShapes.neighbourhoodComputer.createRepresentation(partialModel, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation);
    final GraphShape<Object, Object> nhShapeGraph = MetricsCalculationUsingShapes.neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel);
    double totalMetricValue = 0.0;
    int numNodesTotal = 0;
    Set<Object> activeDims = new HashSet<Object>();
    List<GraphNodeDescriptorGND> _nodes = nhShapeGraph.getNodes();
    for (final GraphNodeDescriptorGND node : _nodes) {
      {
        List<IncomingRelationGND> _incomingEdges = node.getIncomingEdges();
        for (final IncomingRelationGND inEdge : _incomingEdges) {
          activeDims.add(inEdge.getType());
        }
        List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
        for (final OutgoingRelationGND outEdge : _outgoingEdges) {
          activeDims.add(outEdge.getType());
        }
        Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(node.getCorrespondingAND(), nhRep);
        final Integer numOccurrences = ((Integer) _lookup);
        final Set<Object> _converted_activeDims = (Set<Object>)activeDims;
        final int numActDims = ((Object[])Conversions.unwrapArray(_converted_activeDims, Object.class)).length;
        final int totalActDims = (numActDims * (numOccurrences).intValue());
        int _numNodesTotal = numNodesTotal;
        numNodesTotal = (_numNodesTotal + (numOccurrences).intValue());
        double _talMetricValue = totalMetricValue;
        totalMetricValue = (_talMetricValue + totalActDims);
        activeDims.clear();
      }
    }
    final double averageMetricValue = (totalMetricValue / numNodesTotal);
    return averageMetricValue;
  }
  
  public static double getMPCfromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Set<String> allDimensions = new HashSet<String>();
    Map<EObject, Map<String, Integer>> node2Degrees = new HashMap<EObject, Map<String, Integer>>();
    for (final EObject node : nodes) {
      node2Degrees.put(node, CollectionLiterals.<String, Integer>newHashMap());
    }
    for (final EObject node_1 : nodes) {
      EList<EReference> _eAllReferences = node_1.eClass().getEAllReferences();
      for (final EReference reference : _eAllReferences) {
        {
          final Object pointingTo = node_1.eGet(reference);
          if ((!(pointingTo instanceof List))) {
            if ((pointingTo != null)) {
              allDimensions.add(reference.getName());
              MetricsCalculationUsingShapes.putInside(node_1, reference.getName(), 1, node2Degrees);
              MetricsCalculationUsingShapes.putInside(((EObject) pointingTo), reference.getName(), 1, node2Degrees);
            }
          } else {
            final List pointingToList = ((List) pointingTo);
            boolean _isEmpty = pointingToList.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              allDimensions.add(reference.getName());
              MetricsCalculationUsingShapes.putInside(node_1, reference.getName(), pointingToList.size(), node2Degrees);
              for (final Object target : pointingToList) {
                MetricsCalculationUsingShapes.putInside(((EObject) target), reference.getName(), 1, node2Degrees);
              }
            }
          }
        }
      }
    }
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    final Set<String> _converted_allDimensions = (Set<String>)allDimensions;
    final int totalNumDims = ((Object[])Conversions.unwrapArray(_converted_allDimensions, Object.class)).length;
    double totalMPC = 0.0;
    Collection<Map<String, Integer>> _values = node2Degrees.values();
    for (final Map<String, Integer> degrees : _values) {
      {
        int totalDegree = MetricsCalculationUsingShapes.findSum(degrees.values());
        double partialMPC = 1.0;
        Collection<Integer> _values_1 = degrees.values();
        for (final Integer degree : _values_1) {
          double _partialMPC = partialMPC;
          float _floatValue = degree.floatValue();
          float _divide = (_floatValue / totalDegree);
          double _pow = Math.pow(_divide, 2);
          partialMPC = (_partialMPC - _pow);
        }
        double _talMPC = totalMPC;
        totalMPC = (_talMPC + partialMPC);
      }
    }
    float _floatValue = Integer.valueOf(totalNumDims).floatValue();
    float _divide = (_floatValue / (totalNumDims - 1));
    final double averageMPC = (_divide * (totalMPC / numNodes));
    return averageMPC;
  }
  
  public static double getMPCfromNHShape(final PartialInterpretation pm) {
    return MetricsCalculationUsingShapes.getMPCfromNHShape(pm, Integer.valueOf(2));
  }
  
  public static double getMPCfromNHShape(final PartialInterpretation partialModel, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = MetricsCalculationUsingShapes.neighbourhoodComputer.createRepresentation(partialModel, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation);
    final GraphShape<Object, Object> nhShapeGraph = MetricsCalculationUsingShapes.neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel);
    double totalMPC = 0.0;
    int totalDegree = 0;
    double partialMPC = 0.0;
    int numNodes = 0;
    Set<String> allDimensions = new HashSet<String>();
    Map<String, Integer> type2Num = new HashMap<String, Integer>();
    List<GraphNodeDescriptorGND> _nodes = nhShapeGraph.getNodes();
    for (final GraphNodeDescriptorGND node : _nodes) {
      {
        int _size = node.getIncomingEdges().size();
        int _size_1 = node.getOutgoingEdges().size();
        int _plus = (_size + _size_1);
        totalDegree = _plus;
        List<IncomingRelationGND> _incomingEdges = node.getIncomingEdges();
        for (final IncomingRelationGND inEdge : _incomingEdges) {
          {
            final String edgeName = inEdge.getType();
            allDimensions.add(edgeName);
            boolean _contains = type2Num.keySet().contains(edgeName);
            if (_contains) {
              Integer _lookup = CollectionsUtil.<String, Integer>lookup(edgeName, type2Num);
              int _plus_1 = ((_lookup).intValue() + 1);
              type2Num.put(edgeName, Integer.valueOf(_plus_1));
            } else {
              type2Num.put(edgeName, Integer.valueOf(1));
            }
          }
        }
        List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
        for (final OutgoingRelationGND outEdge : _outgoingEdges) {
          {
            final String edgeName = outEdge.getType();
            allDimensions.add(edgeName);
            boolean _contains = type2Num.keySet().contains(edgeName);
            if (_contains) {
              Integer _lookup = CollectionsUtil.<String, Integer>lookup(edgeName, type2Num);
              int _plus_1 = ((_lookup).intValue() + 1);
              type2Num.put(edgeName, Integer.valueOf(_plus_1));
            } else {
              type2Num.put(edgeName, Integer.valueOf(1));
            }
          }
        }
        partialMPC = 1.0;
        Collection<Integer> _values = type2Num.values();
        for (final Integer degree : _values) {
          double _partialMPC = partialMPC;
          float _floatValue = degree.floatValue();
          float _divide = (_floatValue / totalDegree);
          double _pow = Math.pow(_divide, 2);
          partialMPC = (_partialMPC - _pow);
        }
        Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(node.getCorrespondingAND(), nhRep);
        final Integer numOccurrences = ((Integer) _lookup);
        int _numNodes = numNodes;
        numNodes = (_numNodes + (numOccurrences).intValue());
        double _talMPC = totalMPC;
        totalMPC = (_talMPC + (partialMPC * (numOccurrences).intValue()));
        type2Num.clear();
      }
    }
    final int totalNumDims = allDimensions.size();
    float _floatValue = Integer.valueOf(totalNumDims).floatValue();
    float _divide = (_floatValue / (totalNumDims - 1));
    final double averageMPC = (_divide * (totalMPC / numNodes));
    return averageMPC;
  }
  
  public static PartialInterpretation getPartialModel(final FileSystemWorkspace workspace, final EObject model) {
    final EPackage pckg = model.eClass().getEPackage();
    List<EClass> _list = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
    Set<EClass> _emptySet = Collections.<EClass>emptySet();
    List<EEnum> _list_1 = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
    final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
      return it.getELiterals();
    };
    List<EEnumLiteral> _list_2 = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(IterableExtensions.<EEnum, EList<EEnumLiteral>>map(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class), _function)));
    final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
      return it.getEReferences();
    };
    List<EReference> _list_3 = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(IterableExtensions.<EClass, EList<EReference>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_1)));
    final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
      return it.getEAttributes();
    };
    List<EAttribute> _list_4 = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(IterableExtensions.<EClass, EList<EAttribute>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_2)));
    final EcoreMetamodelDescriptor metamodel = new EcoreMetamodelDescriptor(_list, _emptySet, 
      false, _list_1, _list_2, _list_3, _list_4);
    Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
    final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = MetricsCalculationUsingShapes.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
    return MetricsCalculationUsingShapes.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), false);
  }
  
  public static int findSum(final Collection<Integer> integers) {
    int sum = 0;
    for (final Integer integer : integers) {
      int _sum = sum;
      sum = (_sum + (integer).intValue());
    }
    return sum;
  }
  
  public static Integer putInside(final EObject object, final String string, final int i, final Map<EObject, Map<String, Integer>> map) {
    Integer _xblockexpression = null;
    {
      final Map<String, Integer> correspondingMap = CollectionsUtil.<EObject, Map<String, Integer>>lookup(object, map);
      Integer _xifexpression = null;
      boolean _contains = correspondingMap.keySet().contains(string);
      if (_contains) {
        Integer _lookup = CollectionsUtil.<String, Integer>lookup(string, correspondingMap);
        int _plus = ((_lookup).intValue() + i);
        _xifexpression = correspondingMap.put(string, Integer.valueOf(_plus));
      } else {
        _xifexpression = correspondingMap.put(string, Integer.valueOf(i));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
