/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillingInformation;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.EventBooking;
import ClassDiagram.Organization;
import ClassDiagram.Person;
import ClassDiagram.RoomBooking;

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
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.OrganizationImpl#getBillingInformation <em>Billing Information</em>}</li>
 *   <li>{@link ClassDiagram.impl.OrganizationImpl#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link ClassDiagram.impl.OrganizationImpl#getEventBookings <em>Event Bookings</em>}</li>
 *   <li>{@link ClassDiagram.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.OrganizationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ClassDiagram.impl.OrganizationImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends MinimalEObjectImpl.Container implements Organization {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
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
	 * The cached value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected Person responsiblePerson;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BillingInformation> getBillingInformation() {
		if (billingInformation == null) {
			billingInformation = new EObjectResolvingEList<BillingInformation>(BillingInformation.class, this, ClassDiagramPackage.ORGANIZATION__BILLING_INFORMATION);
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
			roomBookings = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, ClassDiagramPackage.ORGANIZATION__ROOM_BOOKINGS);
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
			eventBookings = new EObjectResolvingEList<EventBooking>(EventBooking.class, this, ClassDiagramPackage.ORGANIZATION__EVENT_BOOKINGS);
		}
		return eventBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ORGANIZATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ORGANIZATION__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getResponsiblePerson() {
		if (responsiblePerson != null && responsiblePerson.eIsProxy()) {
			InternalEObject oldResponsiblePerson = (InternalEObject)responsiblePerson;
			responsiblePerson = (Person)eResolveProxy(oldResponsiblePerson);
			if (responsiblePerson != oldResponsiblePerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ORGANIZATION__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
			}
		}
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetResponsiblePerson() {
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePerson(Person newResponsiblePerson) {
		Person oldResponsiblePerson = responsiblePerson;
		responsiblePerson = newResponsiblePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ORGANIZATION__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomBooking(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEventBooking(EventBooking eventBooking) {
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
			case ClassDiagramPackage.ORGANIZATION__BILLING_INFORMATION:
				return getBillingInformation();
			case ClassDiagramPackage.ORGANIZATION__ROOM_BOOKINGS:
				return getRoomBookings();
			case ClassDiagramPackage.ORGANIZATION__EVENT_BOOKINGS:
				return getEventBookings();
			case ClassDiagramPackage.ORGANIZATION__NAME:
				return getName();
			case ClassDiagramPackage.ORGANIZATION__ADDRESS:
				return getAddress();
			case ClassDiagramPackage.ORGANIZATION__RESPONSIBLE_PERSON:
				if (resolve) return getResponsiblePerson();
				return basicGetResponsiblePerson();
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
			case ClassDiagramPackage.ORGANIZATION__BILLING_INFORMATION:
				getBillingInformation().clear();
				getBillingInformation().addAll((Collection<? extends BillingInformation>)newValue);
				return;
			case ClassDiagramPackage.ORGANIZATION__ROOM_BOOKINGS:
				getRoomBookings().clear();
				getRoomBookings().addAll((Collection<? extends RoomBooking>)newValue);
				return;
			case ClassDiagramPackage.ORGANIZATION__EVENT_BOOKINGS:
				getEventBookings().clear();
				getEventBookings().addAll((Collection<? extends EventBooking>)newValue);
				return;
			case ClassDiagramPackage.ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case ClassDiagramPackage.ORGANIZATION__ADDRESS:
				setAddress((String)newValue);
				return;
			case ClassDiagramPackage.ORGANIZATION__RESPONSIBLE_PERSON:
				setResponsiblePerson((Person)newValue);
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
			case ClassDiagramPackage.ORGANIZATION__BILLING_INFORMATION:
				getBillingInformation().clear();
				return;
			case ClassDiagramPackage.ORGANIZATION__ROOM_BOOKINGS:
				getRoomBookings().clear();
				return;
			case ClassDiagramPackage.ORGANIZATION__EVENT_BOOKINGS:
				getEventBookings().clear();
				return;
			case ClassDiagramPackage.ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.ORGANIZATION__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ClassDiagramPackage.ORGANIZATION__RESPONSIBLE_PERSON:
				setResponsiblePerson((Person)null);
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
			case ClassDiagramPackage.ORGANIZATION__BILLING_INFORMATION:
				return billingInformation != null && !billingInformation.isEmpty();
			case ClassDiagramPackage.ORGANIZATION__ROOM_BOOKINGS:
				return roomBookings != null && !roomBookings.isEmpty();
			case ClassDiagramPackage.ORGANIZATION__EVENT_BOOKINGS:
				return eventBookings != null && !eventBookings.isEmpty();
			case ClassDiagramPackage.ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.ORGANIZATION__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ClassDiagramPackage.ORGANIZATION__RESPONSIBLE_PERSON:
				return responsiblePerson != null;
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
			case ClassDiagramPackage.ORGANIZATION___ADD_ROOM_BOOKING__ROOMBOOKING:
				addRoomBooking((RoomBooking)arguments.get(0));
				return null;
			case ClassDiagramPackage.ORGANIZATION___ADD_EVENT_BOOKING__EVENTBOOKING:
				addEventBooking((EventBooking)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
