/**
 */
package yawlnet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import yawlnet.Place;
import yawlnet.PlaceType;
import yawlnet.YawlnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.impl.PlaceImpl#getPlacetype <em>Placetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getPlacetype() <em>Placetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacetype()
	 * @generated
	 * @ordered
	 */
	protected PlaceType placetype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlnetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType getPlacetype() {
		return placetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacetype(PlaceType newPlacetype, NotificationChain msgs) {
		PlaceType oldPlacetype = placetype;
		placetype = newPlacetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlnetPackage.PLACE__PLACETYPE, oldPlacetype, newPlacetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacetype(PlaceType newPlacetype) {
		if (newPlacetype != placetype) {
			NotificationChain msgs = null;
			if (placetype != null)
				msgs = ((InternalEObject)placetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlnetPackage.PLACE__PLACETYPE, null, msgs);
			if (newPlacetype != null)
				msgs = ((InternalEObject)newPlacetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlnetPackage.PLACE__PLACETYPE, null, msgs);
			msgs = basicSetPlacetype(newPlacetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlnetPackage.PLACE__PLACETYPE, newPlacetype, newPlacetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlnetPackage.PLACE__PLACETYPE:
				return basicSetPlacetype(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawlnetPackage.PLACE__PLACETYPE:
				return getPlacetype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlnetPackage.PLACE__PLACETYPE:
				setPlacetype((PlaceType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case YawlnetPackage.PLACE__PLACETYPE:
				setPlacetype((PlaceType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YawlnetPackage.PLACE__PLACETYPE:
				return placetype != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
