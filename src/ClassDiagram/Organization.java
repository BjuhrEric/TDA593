/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

//import org.eclipse.emf.common.util.EList; //Commented out by thszabi


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Organization#getBillingInformation <em>Billing Information</em>}</li>
 *   <li>{@link ClassDiagram.Organization#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link ClassDiagram.Organization#getEventBookings <em>Event Bookings</em>}</li>
 *   <li>{@link ClassDiagram.Organization#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.Organization#getAddress <em>Address</em>}</li>
 *   <li>{@link ClassDiagram.Organization#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link ClassDiagram.Organization#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends Customer {

	/**
	 * Returns the value of the '<em><b>Billing Information</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.BillingInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * Moved to interface 'Customer' by thszabi
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Information</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_BillingInformation()
	 * @model ordered="false"
	 * @generated
	 */
	//EList<BillingInformation> getBillingInformation();

	/**
	 * Returns the value of the '<em><b>Room Bookings</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * Moved to interface 'Customer' by thszabi
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Bookings</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_RoomBookings()
	 * @model ordered="false"
	 * @generated
	 */
	//EList<RoomBooking> getRoomBookings();

	/**
	 * Returns the value of the '<em><b>Event Bookings</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.EventBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * Moved to interface 'Customer' by thszabi
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Bookings</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_EventBookings()
	 * @model ordered="false"
	 * @generated
	 */
	//EList<EventBooking> getEventBookings();

	/**
	 * Returns the value of the '<em><b>Billing Information</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.BillingInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Information</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_BillingInformation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BillingInformation> getBillingInformation();

	/**
	 * Returns the value of the '<em><b>Room Bookings</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Bookings</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_RoomBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomBooking> getRoomBookings();

	/**
	 * Returns the value of the '<em><b>Event Bookings</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.EventBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Bookings</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_EventBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventBooking> getEventBookings();

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
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ClassDiagram.Organization#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' reference.
	 * @see #setResponsiblePerson(Person)
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_ResponsiblePerson()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getResponsiblePerson();

	/**
	 * Sets the value of the '{@link ClassDiagram.Organization#getResponsiblePerson <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' reference.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(Person value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see ClassDiagram.ClassDiagramPackage#getOrganization_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link ClassDiagram.Organization#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);
} // Organization
