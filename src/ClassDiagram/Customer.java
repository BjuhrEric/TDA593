/**
 */
package ClassDiagram;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getCustomer()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface Customer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated NOT
	 */
	List<BillingInformation> getBillingInformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated NOT
	 */
	List<RoomBooking> getRoomBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated NOT
	 */
	List<EventBooking> getEventBookings();

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
