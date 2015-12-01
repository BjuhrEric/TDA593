/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getCustomer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="ClassDiagram.BillingInformation" ordered="false"
	 * @generated
	 */
	EList getBillingInformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="ClassDiagram.RoomBooking" ordered="false"
	 * @generated
	 */
	EList getRoomBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="ClassDiagram.EventBooking" ordered="false"
	 * @generated
	 */
	EList getEventBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void addRoomBooking(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventBookingRequired="true" eventBookingOrdered="false"
	 * @generated
	 */
	void addEventBooking(EventBooking eventBooking);

} // Customer
