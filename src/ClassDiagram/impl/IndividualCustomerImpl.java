/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillingInformation;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Customer;
import ClassDiagram.EventBooking;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.RoomBooking;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link ClassDiagram.impl.IndividualCustomerImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link ClassDiagram.impl.IndividualCustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link ClassDiagram.impl.IndividualCustomerImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualCustomerImpl extends PersonImpl implements IndividualCustomer {
	/**
	 * The cached value of the '{@link #getBillingInformation() <em>Billing Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<BillingInformation> billingInformation;

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
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Added by thszabi
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated NOT
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Added by thszabi
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated NOT
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;
	
	protected IndividualCustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.INDIVIDUAL_CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BillingInformation> getBillingInformation() {
		if (billingInformation == null) {
			billingInformation = new EObjectResolvingEList<BillingInformation>(BillingInformation.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION);
		}
		return billingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getRoomBookings() {
		if (roomBookings == null) {
			roomBookings = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS);
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
			eventBookings = new EObjectResolvingEList<EventBooking>(EventBooking.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS);
		}
		return eventBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoomBooking(RoomBooking roomBooking) {
		if (roomBookings == null) {
			roomBookings = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS);
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
			eventBookings = new EObjectResolvingEList<EventBooking>(EventBooking.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS);
		}
		eventBookings.add(eventBooking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getID() {
		return id;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Added by thszabi
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setID(long newID) {
		//long oldID = id;
		id = newID;
		//if (eNotificationRequired())
		//	eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ORGANIZATION_ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBillingInformation(BillingInformation info) {
		if (billingInformation == null) {
			billingInformation = new EObjectResolvingEList<BillingInformation>(BillingInformation.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION);
		}
		for (BillingInformation i : billingInformation) {
			if (i.getClass().equals(info.getClass())) {
				billingInformation.remove(i);
			}
		}
		billingInformation.add(info);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION:
				return getBillingInformation();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS:
				return getRoomBookings();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS:
				return getEventBookings();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__PHONE_NUMBER:
				return getPhoneNumber();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EMAIL:
				return getEmail();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ADDRESS:
				return getAddress();
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
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION:
				getBillingInformation().clear();
				getBillingInformation().addAll((Collection<? extends BillingInformation>)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS:
				getRoomBookings().clear();
				getRoomBookings().addAll((Collection<? extends RoomBooking>)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS:
				getEventBookings().clear();
				getEventBookings().addAll((Collection<? extends EventBooking>)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EMAIL:
				setEmail((String)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ADDRESS:
				setAddress((String)newValue);
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
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION:
				getBillingInformation().clear();
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS:
				getRoomBookings().clear();
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS:
				getEventBookings().clear();
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION:
				return billingInformation != null && !billingInformation.isEmpty();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS:
				return roomBookings != null && !roomBookings.isEmpty();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS:
				return eventBookings != null && !eventBookings.isEmpty();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Customer.class) {
			switch (baseOperationID) {
				case ClassDiagramPackage.CUSTOMER___GET_BILLING_INFORMATION: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___GET_BILLING_INFORMATION;
				case ClassDiagramPackage.CUSTOMER___GET_ROOM_BOOKINGS: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___GET_ROOM_BOOKINGS;
				case ClassDiagramPackage.CUSTOMER___GET_EVENT_BOOKINGS: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___GET_EVENT_BOOKINGS;
				case ClassDiagramPackage.CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING;
				case ClassDiagramPackage.CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING;
				case ClassDiagramPackage.CUSTOMER___GET_ID: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___GET_ID;
				case ClassDiagramPackage.CUSTOMER___ADD_BILLING_INFORMATION__BILLINGINFORMATION: return ClassDiagramPackage.INDIVIDUAL_CUSTOMER___ADD_BILLING_INFORMATION__BILLINGINFORMATION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING:
				addRoomBooking((RoomBooking)arguments.get(0));
				return null;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING:
				addEventBooking((EventBooking)arguments.get(0));
				return null;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER___GET_ID:
				getID();
				return null;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER___ADD_BILLING_INFORMATION__BILLINGINFORMATION:
				addBillingInformation((BillingInformation)arguments.get(0));
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
		result.append(" (phoneNumber: ");
		result.append(phoneNumber);
		result.append(", email: ");
		result.append(email);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //IndividualCustomerImpl
