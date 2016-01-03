/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

//import org.eclipse.emf.common.util.EList; //Commented out by thszabi

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.IndividualCustomer#getBillingInformation <em>Billing Information</em>}</li>
 *   <li>{@link ClassDiagram.IndividualCustomer#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link ClassDiagram.IndividualCustomer#getEventBookings <em>Event Bookings</em>}</li>
 *   <li>{@link ClassDiagram.IndividualCustomer#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link ClassDiagram.IndividualCustomer#getEmail <em>Email</em>}</li>
 *   <li>{@link ClassDiagram.IndividualCustomer#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer()
 * @model
 * @generated
 */
public interface IndividualCustomer extends Person, Customer {

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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_BillingInformation()
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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_RoomBookings()
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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_EventBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventBooking> getEventBookings();

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_PhoneNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link ClassDiagram.IndividualCustomer#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link ClassDiagram.IndividualCustomer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ClassDiagram.IndividualCustomer#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);
	/**
	 * Returns the value of the '<em><b>Billing Information</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.BillingInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * Moved to interface 'Customer' by thszabi
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Information</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_BillingInformation()
	 * @model ordered="false"
	 * @generated NOT
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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_RoomBookings()
	 * @model ordered="false"
	 * @generated NOT
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
	 * @see ClassDiagram.ClassDiagramPackage#getIndividualCustomer_EventBookings()
	 * @model ordered="false"
	 * @generated NOT
	 */
	//EList<EventBooking> getEventBookings();

	/**
	 * <!-- begin-user-doc -->
	 * Moved to interface 'Customer' by thszabi
	 * <!-- end-user-doc -->
	 * @model infoRequired="true" infoOrdered="false"
	 * @generated NOT
	 */
	//void addBillingInformation(BillingInformation info);

} // IndividualCustomer
