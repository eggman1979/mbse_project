/**
 */
package yawlnet.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import yawlnet.Yawlnet;
import yawlnet.YawlnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yawlnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class YawlnetImpl extends PetriNetTypeImpl implements Yawlnet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public YawlnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlnetPackage.Literals.YAWLNET;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String toString() {
		return "http://mbse.gruppexx/yawlnet";
	}

} //YawlnetImpl
