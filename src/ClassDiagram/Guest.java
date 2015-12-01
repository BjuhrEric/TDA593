/**
 */
package ClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Guest#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends Person {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ClassDiagram.GuestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ClassDiagram.GuestStatus
	 * @see #setStatus(GuestStatus)
	 * @see ClassDiagram.ClassDiagramPackage#getGuest_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GuestStatus getStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Guest#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ClassDiagram.GuestStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GuestStatus value);

} // Guest
