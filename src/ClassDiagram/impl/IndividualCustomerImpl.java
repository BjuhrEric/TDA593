/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillingInformation;
import ClassDiagram.EventBooking;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.RoomBooking;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.IndividualCustomerImpl#getBillingInformation <em>Billing Information</em>}</li>
 *   <li>{@link ClassDiagram.impl.IndividualCustomerImpl#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link ClassDiagram.impl.IndividualCustomerImpl#getEventBookings <em>Event Bookings</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class IndividualCustomerImpl extends PersonImpl implements IndividualCustomer {
	/**
	 * The cached value of the '{@link #getBillingInformation() <em>Billing Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingInformation()
	 * @generated NOT
	 * @ordered
	 */
	protected List<BillingInformation> billingInformation;

	/**
	 * The cached value of the '{@link #getRoomBookings() <em>Room Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomBookings()
	 * @generated NOT
	 * @ordered
	 */
	protected List<RoomBooking> roomBookings;

	/**
	 * The cached value of the '{@link #getEventBookings() <em>Event Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBookings()
	 * @generated NOT
	 * @ordered
	 */
	protected List<EventBooking> eventBookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualCustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<BillingInformation> getBillingInformation() {
		if (billingInformation == null) {
			billingInformation = new ArrayList<>();
		}
		return billingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<RoomBooking> getRoomBookings() {
		if (roomBookings == null) {
			roomBookings = new ArrayList<>();
		}
		return roomBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<EventBooking> getEventBookings() {
		if (eventBookings == null) {
			eventBookings = new ArrayList<>();
		}
		return eventBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoomBooking(RoomBooking roomBooking) {
		if (roomBookings == null) {
			roomBookings = new ArrayList<>();
		}
		roomBookings.add(roomBooking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addEventBooking(EventBooking eventBooking) {
		if (eventBookings == null) {
			eventBookings = new ArrayList<>();
		}
		eventBookings.add(eventBooking);
	}

}
