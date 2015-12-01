/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.BookingSchedule#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link ClassDiagram.BookingSchedule#getEventBookings <em>Event Bookings</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBookingSchedule()
 * @model
 * @generated
 */
public interface BookingSchedule extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getBookingSchedule_RoomBookings()
	 * @model type="ClassDiagram.RoomBooking" ordered="false"
	 * @generated
	 */
	EList getRoomBookings();

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
	 * @see ClassDiagram.ClassDiagramPackage#getBookingSchedule_EventBookings()
	 * @model type="ClassDiagram.EventBooking" ordered="false"
	 * @generated
	 */
	EList getEventBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void showBookedRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void showBookedEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exportBookedRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exportBookedEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model onDataType="org.eclipse.uml2.types.Boolean" onRequired="true" onOrdered="false"
	 * @generated
	 */
	void setBookingAlerts(boolean on);

} // BookingSchedule
