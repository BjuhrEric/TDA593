/**
 */
package ClassDiagram.impl;

import ClassDiagram.Bill;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.CleaningStatus;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.Payment;
import ClassDiagram.Room;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;
import MockDatabase.RoomsMock;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getRoomStatus <em>Room Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guests;

	/**
	 * The default value of the '{@link #getRoomStatus() <em>Room Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RoomStatus ROOM_STATUS_EDEFAULT = RoomStatus.AVAILABLE;

	/**
	 * The cached value of the '{@link #getRoomStatus() <em>Room Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStatus()
	 * @generated
	 * @ordered
	 */
	protected RoomStatus roomStatus = ROOM_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCleaningStatus() <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaningStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CleaningStatus CLEANING_STATUS_EDEFAULT = CleaningStatus.CLEAN;

	/**
	 * The cached value of the '{@link #getCleaningStatus() <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaningStatus()
	 * @generated
	 * @ordered
	 */
	protected CleaningStatus cleaningStatus = CLEANING_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected Bill bill;

	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomImpl() {
		super();
		bill = ClassDiagramFactoryImpl.eINSTANCE.createBill();
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guest> getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList<Guest>(Guest.class, this, ClassDiagramPackage.ROOM__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRoomStatus(RoomStatus newRoomStatus) {
		RoomsMock db = RoomsMock.getInstance();
		db.deleteRoom(roomNumber);
		RoomStatus oldRoomStatus = roomStatus;
		roomStatus = newRoomStatus == null ? ROOM_STATUS_EDEFAULT : newRoomStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__ROOM_STATUS, oldRoomStatus, roomStatus));
		db.addRoom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleaningStatus getCleaningStatus() {
		return cleaningStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCleaningStatus(CleaningStatus newCleaningStatus) {
		RoomsMock db = RoomsMock.getInstance();
		db.deleteRoom(roomNumber);
		CleaningStatus oldCleaningStatus = cleaningStatus;
		cleaningStatus = newCleaningStatus == null ? CLEANING_STATUS_EDEFAULT : newCleaningStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__CLEANING_STATUS, oldCleaningStatus, cleaningStatus));
		db.addRoom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomsMock db = RoomsMock.getInstance();
		db.deleteRoom(roomNumber);
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
		db.addRoom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill() {
		if (bill != null && bill.eIsProxy()) {
			InternalEObject oldBill = (InternalEObject)bill;
			bill = (Bill)eResolveProxy(oldBill);
			if (bill != oldBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ROOM__BILL, oldBill, bill));
			}
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setBill(Bill newBill) {
		RoomsMock db = RoomsMock.getInstance();
		db.deleteRoom(roomNumber);
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__BILL, oldBill, bill));
		db.addRoom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRoomNumber(int newRoomNumber) {
		RoomsMock db = RoomsMock.getInstance();
		if(roomNumber != 0){
			//this means you want to change room number
			db.deleteRoom(roomNumber);
		}
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
		db.addRoom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumberOfGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList<Guest>(Guest.class, this, ClassDiagramPackage.ROOM__GUESTS);
		}
		return guests.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Payment checkOut() {
		RoomsMock db = RoomsMock.getInstance();
		db.deleteRoom(roomNumber);
		Payment p = ClassDiagramFactoryImpl.eINSTANCE.createPayment();
		p.setBill(bill);
		for (Guest guest: guests) {
			guest.setStatus(GuestStatus.CHECKED_OUT);
		}
		guests.clear();
		setCleaningStatus(CleaningStatus.CHECKED_OUT);
		setRoomStatus(RoomStatus.AVAILABLE);
		db.addRoom(this);
		
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addGuest(Guest guest) {
		RoomsMock db = RoomsMock.getInstance();
		db.deleteRoom(roomNumber);
		if (guests == null) {
			guests = new EObjectResolvingEList<Guest>(Guest.class, this, ClassDiagramPackage.ROOM__GUESTS);
		}
		this.guests.add(guest);
		db.addRoom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM__GUESTS:
				return getGuests();
			case ClassDiagramPackage.ROOM__ROOM_STATUS:
				return getRoomStatus();
			case ClassDiagramPackage.ROOM__CLEANING_STATUS:
				return getCleaningStatus();
			case ClassDiagramPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case ClassDiagramPackage.ROOM__BILL:
				if (resolve) return getBill();
				return basicGetBill();
			case ClassDiagramPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
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
			case ClassDiagramPackage.ROOM__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends Guest>)newValue);
				return;
			case ClassDiagramPackage.ROOM__ROOM_STATUS:
				setRoomStatus((RoomStatus)newValue);
				return;
			case ClassDiagramPackage.ROOM__CLEANING_STATUS:
				setCleaningStatus((CleaningStatus)newValue);
				return;
			case ClassDiagramPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case ClassDiagramPackage.ROOM__BILL:
				setBill((Bill)newValue);
				return;
			case ClassDiagramPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
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
			case ClassDiagramPackage.ROOM__GUESTS:
				getGuests().clear();
				return;
			case ClassDiagramPackage.ROOM__ROOM_STATUS:
				setRoomStatus(ROOM_STATUS_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM__CLEANING_STATUS:
				setCleaningStatus(CLEANING_STATUS_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case ClassDiagramPackage.ROOM__BILL:
				setBill((Bill)null);
				return;
			case ClassDiagramPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
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
			case ClassDiagramPackage.ROOM__GUESTS:
				return guests != null && !guests.isEmpty();
			case ClassDiagramPackage.ROOM__ROOM_STATUS:
				return roomStatus != ROOM_STATUS_EDEFAULT;
			case ClassDiagramPackage.ROOM__CLEANING_STATUS:
				return cleaningStatus != CLEANING_STATUS_EDEFAULT;
			case ClassDiagramPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case ClassDiagramPackage.ROOM__BILL:
				return bill != null;
			case ClassDiagramPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
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
			case ClassDiagramPackage.ROOM___GET_NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ClassDiagramPackage.ROOM___CHECK_OUT:
				return checkOut();
			case ClassDiagramPackage.ROOM___ADD_GUEST__GUEST:
				addGuest((Guest)arguments.get(0));
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
		result.append(" (roomStatus: ");
		result.append(roomStatus);
		result.append(", cleaningStatus: ");
		result.append(cleaningStatus);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
