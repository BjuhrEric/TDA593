/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillingInformation;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.EventBooking;
import ClassDiagram.Organization;
import ClassDiagram.RoomBooking;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrganizationImpl extends MinimalEObjectImpl.Container implements Organization {
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
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getRoomBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventBooking> getEventBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.ORGANIZATION___GET_BILLING_INFORMATION:
				return getBillingInformation();
			case ClassDiagramPackage.ORGANIZATION___GET_ROOM_BOOKINGS:
				return getRoomBookings();
			case ClassDiagramPackage.ORGANIZATION___GET_EVENT_BOOKINGS:
				return getEventBookings();
			case ClassDiagramPackage.ORGANIZATION___ADD_ROOM_BOOKING__ROOMBOOKING:
				addRoomBooking((RoomBooking)arguments.get(0));
				return null;
			case ClassDiagramPackage.ORGANIZATION___ADD_EVENT_BOOKING__EVENTBOOKING:
				addEventBooking((EventBooking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrganizationImpl
