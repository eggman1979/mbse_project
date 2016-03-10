/**
 */
package yawlnet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.ArcType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawlnet.YawlnetPackage#getArcType()
 * @model
 * @generated
 */
public interface ArcType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawlnet.EnumArcTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawlnet.EnumArcTypes
	 * @see #setText(EnumArcTypes)
	 * @see yawlnet.YawlnetPackage#getArcType_Text()
	 * @model
	 * @generated
	 */
	EnumArcTypes getText();

	/**
	 * Sets the value of the '{@link yawlnet.ArcType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawlnet.EnumArcTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(EnumArcTypes value);

} // ArcType
