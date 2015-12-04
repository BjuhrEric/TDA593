/**
 */
package ClassDiagram.impl;

import ClassDiagram.Bill;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.CleaningStatus;
import ClassDiagram.Guest;
import ClassDiagram.Room;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;

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
 *   <li>{@link ClassDiagram.impl.RoomImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getRoomStatus <em>Room Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomImpl#getBill <em>Bill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guest;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
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
	public EList<Guest> getGuest() {
		if (guest == null) {
			guest = new EObjectResolvingEList<Guest>(Guest.class, this, ClassDiagramPackage.ROOM__GUEST);
		}
		return guest;
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
	 * @generated
	 */
	public void setRoomStatus(RoomStatus newRoomStatus) {
		RoomStatus oldRoomStatus = roomStatus;
		roomStatus = newRoomStatus == null ? ROOM_STATUS_EDEFAULT : newRoomStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__ROOM_STATUS, oldRoomStatus, roomStatus));
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
	 * @generated
	 */
	public void setCleaningStatus(CleaningStatus newCleaningStatus) {
		CleaningStatus oldCleaningStatus = cleaningStatus;
		cleaningStatus = newCleaningStatus == null ? CLEANING_STATUS_EDEFAULT : newCleaningStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__CLEANING_STATUS, oldCleaningStatus, cleaningStatus));
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
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
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
	 * @generated
	 */
	public void setBill(Bill newBill) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM__BILL, oldBill, bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut() {
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
			case ClassDiagramPackage.ROOM__GUEST:
				return getGuest();
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
			case ClassDiagramPackage.ROOM__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection<? extends Guest>)newValue);
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
			case ClassDiagramPackage.ROOM__GUEST:
				getGuest().clear();
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
			case ClassDiagramPackage.ROOM__GUEST:
				return guest != null && !guest.isEmpty();
			case ClassDiagramPackage.ROOM__ROOM_STATUS:
				return roomStatus != ROOM_STATUS_EDEFAULT;
			case ClassDiagramPackage.ROOM__CLEANING_STATUS:
				return cleaningStatus != CLEANING_STATUS_EDEFAULT;
			case ClassDiagramPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case ClassDiagramPackage.ROOM__BILL:
				return bill != null;
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
			case ClassDiagramPackage.ROOM___CHECK_IN:
				checkIn();
				return null;
			case ClassDiagramPackage.ROOM___CHECK_OUT:
				checkOut();
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
		result.append(')');
		return result.toString();
	}

} //RoomImpl
