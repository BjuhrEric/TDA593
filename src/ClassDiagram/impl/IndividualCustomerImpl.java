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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
	public void getID() {
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
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION:
				return getBillingInformation();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS:
				return getRoomBookings();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS:
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //IndividualCustomerImpl
