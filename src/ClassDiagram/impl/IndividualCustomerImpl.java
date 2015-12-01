/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillingInformation;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.EventBooking;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.RoomBooking;

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
	protected EList billingInformation;

	/**
	 * The cached value of the '{@link #getRoomBookings() <em>Room Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomBookings()
	 * @generated
	 * @ordered
	 */
	protected EList roomBookings;

	/**
	 * The cached value of the '{@link #getEventBookings() <em>Event Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBookings()
	 * @generated
	 * @ordered
	 */
	protected EList eventBookings;

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
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.INDIVIDUAL_CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBillingInformation() {
		if (billingInformation == null) {
			billingInformation = new EObjectResolvingEList(BillingInformation.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION);
		}
		return billingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomBookings() {
		if (roomBookings == null) {
			roomBookings = new EObjectResolvingEList(RoomBooking.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS);
		}
		return roomBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEventBookings() {
		if (eventBookings == null) {
			eventBookings = new EObjectResolvingEList(EventBooking.class, this, ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS);
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__BILLING_INFORMATION:
				getBillingInformation().clear();
				getBillingInformation().addAll((Collection)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS:
				getRoomBookings().clear();
				getRoomBookings().addAll((Collection)newValue);
				return;
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS:
				getEventBookings().clear();
				getEventBookings().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //IndividualCustomerImpl
