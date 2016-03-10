/**
 */
package yawlnet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import yawlnet.Arc;
import yawlnet.ArcType;
import yawlnet.EnumArcTypes;
import yawlnet.EnumPlaceTypes;
import yawlnet.EnumTransitonTypes;
import yawlnet.Place;
import yawlnet.PlaceType;
import yawlnet.Transition;
import yawlnet.TransitionType;
import yawlnet.Yawlnet;
import yawlnet.YawlnetFactory;
import yawlnet.YawlnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlnetPackageImpl extends EPackageImpl implements YawlnetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawlnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTransitonTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumArcTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPlaceTypesEEnum = null;

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
	 * @see yawlnet.YawlnetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YawlnetPackageImpl() {
		super(eNS_URI, YawlnetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link YawlnetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YawlnetPackage init() {
		if (isInited) return (YawlnetPackage)EPackage.Registry.INSTANCE.getEPackage(YawlnetPackage.eNS_URI);

		// Obtain or create and register package
		YawlnetPackageImpl theYawlnetPackage = (YawlnetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YawlnetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YawlnetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYawlnetPackage.createPackageContents();

		// Initialize created meta-data
		theYawlnetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYawlnetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YawlnetPackage.eNS_URI, theYawlnetPackage);
		return theYawlnetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYawlnet() {
		return yawlnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Join() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Split() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Arctype() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_Text() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Placetype() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_Text() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceType() {
		return placeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceType_Text() {
		return (EAttribute)placeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumTransitonTypes() {
		return enumTransitonTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumArcTypes() {
		return enumArcTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumPlaceTypes() {
		return enumPlaceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlnetFactory getYawlnetFactory() {
		return (YawlnetFactory)getEFactoryInstance();
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
		yawlnetEClass = createEClass(YAWLNET);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__JOIN);
		createEReference(transitionEClass, TRANSITION__SPLIT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__ARCTYPE);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TEXT);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__PLACETYPE);

		arcTypeEClass = createEClass(ARC_TYPE);
		createEAttribute(arcTypeEClass, ARC_TYPE__TEXT);

		placeTypeEClass = createEClass(PLACE_TYPE);
		createEAttribute(placeTypeEClass, PLACE_TYPE__TEXT);

		// Create enums
		enumTransitonTypesEEnum = createEEnum(ENUM_TRANSITON_TYPES);
		enumArcTypesEEnum = createEEnum(ENUM_ARC_TYPES);
		enumPlaceTypesEEnum = createEEnum(ENUM_PLACE_TYPES);
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

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yawlnetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		transitionTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		arcTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		placeTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(yawlnetEClass, Yawlnet.class, "Yawlnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Join(), this.getTransitionType(), null, "join", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Split(), this.getTransitionType(), null, "split", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Arctype(), this.getArcType(), null, "arctype", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionType_Text(), this.getEnumTransitonTypes(), "text", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Placetype(), this.getPlaceType(), null, "placetype", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcType_Text(), this.getEnumArcTypes(), "text", null, 0, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeTypeEClass, PlaceType.class, "PlaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceType_Text(), this.getEnumPlaceTypes(), "text", null, 0, 1, PlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumTransitonTypesEEnum, EnumTransitonTypes.class, "EnumTransitonTypes");
		addEEnumLiteral(enumTransitonTypesEEnum, EnumTransitonTypes.AND);
		addEEnumLiteral(enumTransitonTypesEEnum, EnumTransitonTypes.OR);
		addEEnumLiteral(enumTransitonTypesEEnum, EnumTransitonTypes.XOR);

		initEEnum(enumArcTypesEEnum, EnumArcTypes.class, "EnumArcTypes");
		addEEnumLiteral(enumArcTypesEEnum, EnumArcTypes.RESET);

		initEEnum(enumPlaceTypesEEnum, EnumPlaceTypes.class, "EnumPlaceTypes");
		addEEnumLiteral(enumPlaceTypesEEnum, EnumPlaceTypes.START);
		addEEnumLiteral(enumPlaceTypesEEnum, EnumPlaceTypes.END);

		// Create resource
		createResource(eNS_URI);
	}

} //YawlnetPackageImpl
