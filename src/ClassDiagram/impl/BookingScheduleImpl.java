/**
 */
package ClassDiagram.impl;

import ClassDiagram.BookingSchedule;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.EventBooking;
import ClassDiagram.RoomBooking;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.BookingScheduleImpl#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link ClassDiagram.impl.BookingScheduleImpl#getEventBookings <em>Event Bookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingScheduleImpl extends MinimalEObjectImpl.Container implements BookingSchedule {
	/**
	 * The cached value of the '{@link #getRoomBookings() <em>Room Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBooking> roomBookings;

	/**
	 * The cached value of the '{@link #getEventBookings() <em>Event Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<EventBooking> eventBookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BOOKING_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getRoomBookings() {
		if (roomBookings == null) {
			roomBookings = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, ClassDiagramPackage.BOOKING_SCHEDULE__ROOM_BOOKINGS);
		}
		return roomBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventBooking> getEventBookings() {
		if (eventBookings == null) {
			eventBookings = new EObjectResolvingEList<EventBooking>(EventBooking.class, this, ClassDiagramPackage.BOOKING_SCHEDULE__EVENT_BOOKINGS);
		}
		return eventBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void showBookedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void showBookedEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exportBookedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exportBookedEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingAlerts(boolean on) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_SCHEDULE__ROOM_BOOKINGS:
				return getRoomBookings();
			case ClassDiagramPackage.BOOKING_SCHEDULE__EVENT_BOOKINGS:
				return getEventBookings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_SCHEDULE__ROOM_BOOKINGS:
				getRoomBookings().clear();
				getRoomBookings().addAll((Collection<? extends RoomBooking>)newValue);
				return;
			case ClassDiagramPackage.BOOKING_SCHEDULE__EVENT_BOOKINGS:
				getEventBookings().clear();
				getEventBookings().addAll((Collection<? extends EventBooking>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_SCHEDULE__ROOM_BOOKINGS:
				getRoomBookings().clear();
				return;
			case ClassDiagramPackage.BOOKING_SCHEDULE__EVENT_BOOKINGS:
				getEventBookings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_SCHEDULE__ROOM_BOOKINGS:
				return roomBookings != null && !roomBookings.isEmpty();
			case ClassDiagramPackage.BOOKING_SCHEDULE__EVENT_BOOKINGS:
				return eventBookings != null && !eventBookings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.BOOKING_SCHEDULE___SHOW_BOOKED_ROOMS:
				showBookedRooms();
				return null;
			case ClassDiagramPackage.BOOKING_SCHEDULE___SHOW_BOOKED_EVENTS:
				showBookedEvents();
				return null;
			case ClassDiagramPackage.BOOKING_SCHEDULE___EXPORT_BOOKED_ROOMS:
				exportBookedRooms();
				return null;
			case ClassDiagramPackage.BOOKING_SCHEDULE___EXPORT_BOOKED_EVENTS:
				exportBookedEvents();
				return null;
			case ClassDiagramPackage.BOOKING_SCHEDULE___SET_BOOKING_ALERTS__BOOLEAN:
				setBookingAlerts((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingScheduleImpl
