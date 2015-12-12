/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model infoRequired="true" infoOrdered="false"
	 * @generated
	 */
	void addBillingInformation(BillingInformation info);

} // IndividualCustomer
