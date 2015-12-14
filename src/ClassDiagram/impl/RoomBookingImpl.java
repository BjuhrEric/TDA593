/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.Payment;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.RoomBookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomBookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomBookingImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomBookingImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomBookingImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomBookingImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingImpl extends MinimalEObjectImpl.Container implements RoomBooking {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomType;

	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_BOOKING__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomType() {
		if (roomType == null) {
			roomType = new EObjectResolvingEList<RoomType>(RoomType.class, this, ClassDiagramPackage.ROOM_BOOKING__ROOM_TYPE);
		}
		return roomType;
	}

	/**
	 * @generated NOT
	 */
	public void setNumberOfGuests(final int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<Room>(Room.class, this, ClassDiagramPackage.ROOM_BOOKING__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_BOOKING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generatePDF() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(Guest guest, Room room) {
		if(rooms.contains(room)) {
			room.addGuest(guest);
		} else {
			//TODO Handle this
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Payment> checkOut() {
		final EList<Payment> payments = new EObjectResolvingEList<Payment>(Payment.class, this, ClassDiagramPackage.PAYMENT);
		for (Room room : rooms) {
			payments.add(room.checkOut());
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoom(Room room) {
		if(this.rooms==null) {
			this.rooms = new EObjectResolvingEList<Room>(Room.class, this, ClassDiagramPackage.ROOM_BOOKING__ROOMS);
		}
		this.rooms.add(room);
		// TODO
		//Database.updateBooking(this);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoom(Room room) {
		this.rooms.remove(room);
		// TODO
		//Database.updateBooking(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoomType(RoomType roomType) {
		if(this.roomType == null) {
			//this.roomType = new EObjectResolvingEList<RoomType>(RoomType.class, this, ClassDiagramPackage.ROOM_BOOKING__ROOM_TYPE); 
			//thszabi: Changed EObjectResolvingEList to BasicEList because EObjectResolvingEList can't store the same elements more than once
			this.roomType = new BasicEList<RoomType>();
		}
			this.roomType.add(roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoomType(RoomType roomType) {
		this.roomType.remove(roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_BOOKING__START_DATE:
				return getStartDate();
			case ClassDiagramPackage.ROOM_BOOKING__END_DATE:
				return getEndDate();
			case ClassDiagramPackage.ROOM_BOOKING__ROOM_TYPE:
				return getRoomType();
			case ClassDiagramPackage.ROOM_BOOKING__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ClassDiagramPackage.ROOM_BOOKING__ROOMS:
				return getRooms();
			case ClassDiagramPackage.ROOM_BOOKING__ID:
				return getId();
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
			case ClassDiagramPackage.ROOM_BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ClassDiagramPackage.ROOM_BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ClassDiagramPackage.ROOM_BOOKING__ROOM_TYPE:
				getRoomType().clear();
				getRoomType().addAll((Collection<? extends RoomType>)newValue);
				return;
			case ClassDiagramPackage.ROOM_BOOKING__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case ClassDiagramPackage.ROOM_BOOKING__ID:
				setId((Long)newValue);
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
			case ClassDiagramPackage.ROOM_BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM_BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM_BOOKING__ROOM_TYPE:
				getRoomType().clear();
				return;
			case ClassDiagramPackage.ROOM_BOOKING__ROOMS:
				getRooms().clear();
				return;
			case ClassDiagramPackage.ROOM_BOOKING__ID:
				setId(ID_EDEFAULT);
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
			case ClassDiagramPackage.ROOM_BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ClassDiagramPackage.ROOM_BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ClassDiagramPackage.ROOM_BOOKING__ROOM_TYPE:
				return roomType != null && !roomType.isEmpty();
			case ClassDiagramPackage.ROOM_BOOKING__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
			case ClassDiagramPackage.ROOM_BOOKING__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case ClassDiagramPackage.ROOM_BOOKING__ID:
				return id != ID_EDEFAULT;
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
			case ClassDiagramPackage.ROOM_BOOKING___CANCEL:
				cancel();
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___CLOSE:
				close();
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___GENERATE_PDF:
				generatePDF();
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___CHECK_IN__GUEST_ROOM:
				checkIn((Guest)arguments.get(0), (Room)arguments.get(1));
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___CHECK_OUT:
				return checkOut();
			case ClassDiagramPackage.ROOM_BOOKING___ADD_ROOM__ROOM:
				addRoom((Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___REMOVE_ROOM__ROOM:
				removeRoom((Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___ADD_ROOM_TYPE__ROOMTYPE:
				addRoomType((RoomType)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_BOOKING___REMOVE_ROOM_TYPE__ROOMTYPE:
				removeRoomType((RoomType)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RoomBookingImpl
