/**
 */
package yawlnet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import yawlnet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlnetFactoryImpl extends EFactoryImpl implements YawlnetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YawlnetFactory init() {
		try {
			YawlnetFactory theYawlnetFactory = (YawlnetFactory)EPackage.Registry.INSTANCE.getEFactory(YawlnetPackage.eNS_URI);
			if (theYawlnetFactory != null) {
				return theYawlnetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YawlnetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlnetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case YawlnetPackage.YAWLNET: return createYawlnet();
			case YawlnetPackage.TRANSITION: return createTransition();
			case YawlnetPackage.ARC: return createArc();
			case YawlnetPackage.TRANSITION_TYPE: return createTransitionType();
			case YawlnetPackage.PLACE: return createPlace();
			case YawlnetPackage.ARC_TYPE: return createArcType();
			case YawlnetPackage.PLACE_TYPE: return createPlaceType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case YawlnetPackage.ENUM_TRANSITON_TYPES:
				return createEnumTransitonTypesFromString(eDataType, initialValue);
			case YawlnetPackage.ENUM_ARC_TYPES:
				return createEnumArcTypesFromString(eDataType, initialValue);
			case YawlnetPackage.ENUM_PLACE_TYPES:
				return createEnumPlaceTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case YawlnetPackage.ENUM_TRANSITON_TYPES:
				return convertEnumTransitonTypesToString(eDataType, instanceValue);
			case YawlnetPackage.ENUM_ARC_TYPES:
				return convertEnumArcTypesToString(eDataType, instanceValue);
			case YawlnetPackage.ENUM_PLACE_TYPES:
				return convertEnumPlaceTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yawlnet createYawlnet() {
		YawlnetImpl yawlnet = new YawlnetImpl();
		return yawlnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType createPlaceType() {
		PlaceTypeImpl placeType = new PlaceTypeImpl();
		return placeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTransitonTypes createEnumTransitonTypesFromString(EDataType eDataType, String initialValue) {
		EnumTransitonTypes result = EnumTransitonTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTransitonTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumArcTypes createEnumArcTypesFromString(EDataType eDataType, String initialValue) {
		EnumArcTypes result = EnumArcTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumArcTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPlaceTypes createEnumPlaceTypesFromString(EDataType eDataType, String initialValue) {
		EnumPlaceTypes result = EnumPlaceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumPlaceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlnetPackage getYawlnetPackage() {
		return (YawlnetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YawlnetPackage getPackage() {
		return YawlnetPackage.eINSTANCE;
	}

} //YawlnetFactoryImpl
