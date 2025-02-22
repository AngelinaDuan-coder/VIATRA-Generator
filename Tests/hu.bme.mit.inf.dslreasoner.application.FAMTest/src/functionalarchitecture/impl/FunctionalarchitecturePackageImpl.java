/**
 */
package functionalarchitecture.impl;

import functionalarchitecture.FAMTerminator;
import functionalarchitecture.Function;
import functionalarchitecture.FunctionType;
import functionalarchitecture.FunctionalArchitectureModel;
import functionalarchitecture.FunctionalData;
import functionalarchitecture.FunctionalElement;
import functionalarchitecture.FunctionalInput;
import functionalarchitecture.FunctionalOutput;
import functionalarchitecture.FunctionalarchitectureFactory;
import functionalarchitecture.FunctionalarchitecturePackage;
import functionalarchitecture.InformationLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalarchitecturePackageImpl extends EPackageImpl implements FunctionalarchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalArchitectureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass famTerminatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see functionalarchitecture.FunctionalarchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionalarchitecturePackageImpl() {
		super(eNS_URI, FunctionalarchitectureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FunctionalarchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionalarchitecturePackage init() {
		if (isInited) return (FunctionalarchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(FunctionalarchitecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFunctionalarchitecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FunctionalarchitecturePackageImpl theFunctionalarchitecturePackage = registeredFunctionalarchitecturePackage instanceof FunctionalarchitecturePackageImpl ? (FunctionalarchitecturePackageImpl)registeredFunctionalarchitecturePackage : new FunctionalarchitecturePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFunctionalarchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theFunctionalarchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionalarchitecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionalarchitecturePackage.eNS_URI, theFunctionalarchitecturePackage);
		return theFunctionalarchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalElement() {
		return functionalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalElement_Interface() {
		return (EReference)functionalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalElement_Model() {
		return (EReference)functionalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalElement_Parent() {
		return (EReference)functionalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalArchitectureModel() {
		return functionalArchitectureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalArchitectureModel_RootElements() {
		return (EReference)functionalArchitectureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_SubElements() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Type() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFAMTerminator() {
		return famTerminatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFAMTerminator_Data() {
		return (EReference)famTerminatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationLink() {
		return informationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationLink_From() {
		return (EReference)informationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationLink_To() {
		return (EReference)informationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalInterface() {
		return functionalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalInterface_Data() {
		return (EReference)functionalInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalInterface_Element() {
		return (EReference)functionalInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalInput() {
		return functionalInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalInput_IncomingLinks() {
		return (EReference)functionalInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalOutput() {
		return functionalOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalOutput_OutgoingLinks() {
		return (EReference)functionalOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalData() {
		return functionalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalData_Terminator() {
		return (EReference)functionalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalData_Interface() {
		return (EReference)functionalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFunctionType() {
		return functionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalarchitectureFactory getFunctionalarchitectureFactory() {
		return (FunctionalarchitectureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		functionalElementEClass = createEClass(FUNCTIONAL_ELEMENT);
		createEReference(functionalElementEClass, FUNCTIONAL_ELEMENT__INTERFACE);
		createEReference(functionalElementEClass, FUNCTIONAL_ELEMENT__MODEL);
		createEReference(functionalElementEClass, FUNCTIONAL_ELEMENT__PARENT);

		functionalArchitectureModelEClass = createEClass(FUNCTIONAL_ARCHITECTURE_MODEL);
		createEReference(functionalArchitectureModelEClass, FUNCTIONAL_ARCHITECTURE_MODEL__ROOT_ELEMENTS);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__SUB_ELEMENTS);
		createEAttribute(functionEClass, FUNCTION__TYPE);

		famTerminatorEClass = createEClass(FAM_TERMINATOR);
		createEReference(famTerminatorEClass, FAM_TERMINATOR__DATA);

		informationLinkEClass = createEClass(INFORMATION_LINK);
		createEReference(informationLinkEClass, INFORMATION_LINK__FROM);
		createEReference(informationLinkEClass, INFORMATION_LINK__TO);

		functionalInterfaceEClass = createEClass(FUNCTIONAL_INTERFACE);
		createEReference(functionalInterfaceEClass, FUNCTIONAL_INTERFACE__DATA);
		createEReference(functionalInterfaceEClass, FUNCTIONAL_INTERFACE__ELEMENT);

		functionalInputEClass = createEClass(FUNCTIONAL_INPUT);
		createEReference(functionalInputEClass, FUNCTIONAL_INPUT__INCOMING_LINKS);

		functionalOutputEClass = createEClass(FUNCTIONAL_OUTPUT);
		createEReference(functionalOutputEClass, FUNCTIONAL_OUTPUT__OUTGOING_LINKS);

		functionalDataEClass = createEClass(FUNCTIONAL_DATA);
		createEReference(functionalDataEClass, FUNCTIONAL_DATA__TERMINATOR);
		createEReference(functionalDataEClass, FUNCTIONAL_DATA__INTERFACE);

		// Create enums
		functionTypeEEnum = createEEnum(FUNCTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionEClass.getESuperTypes().add(this.getFunctionalElement());
		functionalInputEClass.getESuperTypes().add(this.getFunctionalData());
		functionalOutputEClass.getESuperTypes().add(this.getFunctionalData());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionalElementEClass, FunctionalElement.class, "FunctionalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalElement_Interface(), this.getFunctionalInterface(), this.getFunctionalInterface_Element(), "interface", null, 0, 1, FunctionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalElement_Model(), this.getFunctionalArchitectureModel(), null, "model", null, 1, 1, FunctionalElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalElement_Parent(), this.getFunction(), this.getFunction_SubElements(), "parent", null, 0, 1, FunctionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalArchitectureModelEClass, FunctionalArchitectureModel.class, "FunctionalArchitectureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalArchitectureModel_RootElements(), this.getFunctionalElement(), null, "rootElements", null, 0, -1, FunctionalArchitectureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_SubElements(), this.getFunctionalElement(), this.getFunctionalElement_Parent(), "subElements", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Type(), this.getFunctionType(), "type", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(famTerminatorEClass, FAMTerminator.class, "FAMTerminator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFAMTerminator_Data(), this.getFunctionalData(), this.getFunctionalData_Terminator(), "data", null, 0, 1, FAMTerminator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationLinkEClass, InformationLink.class, "InformationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationLink_From(), this.getFunctionalOutput(), this.getFunctionalOutput_OutgoingLinks(), "from", null, 0, 1, InformationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationLink_To(), this.getFunctionalInput(), this.getFunctionalInput_IncomingLinks(), "to", null, 1, 1, InformationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalInterfaceEClass, functionalarchitecture.FunctionalInterface.class, "FunctionalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalInterface_Data(), this.getFunctionalData(), this.getFunctionalData_Interface(), "data", null, 0, -1, functionalarchitecture.FunctionalInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalInterface_Element(), this.getFunctionalElement(), this.getFunctionalElement_Interface(), "element", null, 0, 1, functionalarchitecture.FunctionalInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalInputEClass, FunctionalInput.class, "FunctionalInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalInput_IncomingLinks(), this.getInformationLink(), this.getInformationLink_To(), "IncomingLinks", null, 0, -1, FunctionalInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalOutputEClass, FunctionalOutput.class, "FunctionalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalOutput_OutgoingLinks(), this.getInformationLink(), this.getInformationLink_From(), "outgoingLinks", null, 0, -1, FunctionalOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDataEClass, FunctionalData.class, "FunctionalData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalData_Terminator(), this.getFAMTerminator(), this.getFAMTerminator_Data(), "terminator", null, 0, 1, FunctionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalData_Interface(), this.getFunctionalInterface(), this.getFunctionalInterface_Data(), "interface", null, 0, 1, FunctionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(functionTypeEEnum, FunctionType.class, "FunctionType");
		addEEnumLiteral(functionTypeEEnum, FunctionType.ROOT);
		addEEnumLiteral(functionTypeEEnum, FunctionType.INTERMEDIATE);
		addEEnumLiteral(functionTypeEEnum, FunctionType.LEAF);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eclipse.viatra.query.querybasedfeature
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.viatra.query.querybasedfeature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.viatra.query.querybasedfeature";
		addAnnotation
		  (getFunctionalElement_Model(),
		   source,
		   new String[] {
			   "patternFQN", "hu.bme.mit.inf.dslreasoner.domains.fam.model"
		   });
	}

} //FunctionalarchitecturePackageImpl
