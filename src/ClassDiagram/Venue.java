/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Venue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Venue#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.Venue#getGuestCapacity <em>Guest Capacity</em>}</li>
 *   <li>{@link ClassDiagram.Venue#getEventCapacity <em>Event Capacity</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getVenue()
 * @model
 * @generated
 */
public interface Venue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ClassDiagram.ClassDiagramPackage#getVenue_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Venue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guest Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Capacity</em>' attribute.
	 * @see #setGuestCapacity(int)
	 * @see ClassDiagram.ClassDiagramPackage#getVenue_GuestCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getGuestCapacity();

	/**
	 * Sets the value of the '{@link ClassDiagram.Venue#getGuestCapacity <em>Guest Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Capacity</em>' attribute.
	 * @see #getGuestCapacity()
	 * @generated
	 */
	void setGuestCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Event Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Capacity</em>' attribute.
	 * @see #setEventCapacity(int)
	 * @see ClassDiagram.ClassDiagramPackage#getVenue_EventCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getEventCapacity();

	/**
	 * Sets the value of the '{@link ClassDiagram.Venue#getEventCapacity <em>Event Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Capacity</em>' attribute.
	 * @see #getEventCapacity()
	 * @generated
	 */
	void setEventCapacity(int value);

} // Venue
