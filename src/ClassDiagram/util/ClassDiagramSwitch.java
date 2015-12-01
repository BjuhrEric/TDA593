/**
 */
package ClassDiagram.util;

import ClassDiagram.Account;
import ClassDiagram.Bill;
import ClassDiagram.BillingInformation;
import ClassDiagram.BookingSchedule;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Cost;
import ClassDiagram.Customer;
import ClassDiagram.Event;
import ClassDiagram.EventBooking;
import ClassDiagram.FloorMap;
import ClassDiagram.Guest;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Item;
import ClassDiagram.Organization;
import ClassDiagram.PaymentStrategy;
import ClassDiagram.Person;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomType;
import ClassDiagram.Venue;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage
 * @generated
 */
public class ClassDiagramSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClassDiagramPackage.ROOM: {
				Room room = (Room)theEObject;
				Object result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.GUEST: {
				Guest guest = (Guest)theEObject;
				Object result = caseGuest(guest);
				if (result == null) result = casePerson(guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.PERSON: {
				Person person = (Person)theEObject;
				Object result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				Object result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BILL: {
				Bill bill = (Bill)theEObject;
				Object result = caseBill(bill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.COST: {
				Cost cost = (Cost)theEObject;
				Object result = caseCost(cost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BILLING_INFORMATION: {
				BillingInformation billingInformation = (BillingInformation)theEObject;
				Object result = caseBillingInformation(billingInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.PAYMENT_STRATEGY: {
				PaymentStrategy paymentStrategy = (PaymentStrategy)theEObject;
				Object result = casePaymentStrategy(paymentStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_BOOKING: {
				RoomBooking roomBooking = (RoomBooking)theEObject;
				Object result = caseRoomBooking(roomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ITEM: {
				Item item = (Item)theEObject;
				Object result = caseItem(item);
				if (result == null) result = caseCost(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.EVENT: {
				Event event = (Event)theEObject;
				Object result = caseEvent(event);
				if (result == null) result = caseCost(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.VENUE: {
				Venue venue = (Venue)theEObject;
				Object result = caseVenue(venue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.PACKAGE: {
				ClassDiagram.Package package_ = (ClassDiagram.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.EVENT_BOOKING: {
				EventBooking eventBooking = (EventBooking)theEObject;
				Object result = caseEventBooking(eventBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				Object result = caseAccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				Object result = caseOrganization(organization);
				if (result == null) result = caseCustomer(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				Object result = caseCustomer(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER: {
				IndividualCustomer individualCustomer = (IndividualCustomer)theEObject;
				Object result = caseIndividualCustomer(individualCustomer);
				if (result == null) result = casePerson(individualCustomer);
				if (result == null) result = caseCustomer(individualCustomer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BOOKING_SCHEDULE: {
				BookingSchedule bookingSchedule = (BookingSchedule)theEObject;
				Object result = caseBookingSchedule(bookingSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.FLOOR_MAP: {
				FloorMap floorMap = (FloorMap)theEObject;
				Object result = caseFloorMap(floorMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuest(Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBill(Bill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCost(Cost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billing Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBillingInformation(BillingInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePaymentStrategy(PaymentStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomBooking(RoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Venue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Venue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVenue(Venue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(ClassDiagram.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEventBooking(EventBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndividualCustomer(IndividualCustomer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBookingSchedule(BookingSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFloorMap(FloorMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ClassDiagramSwitch
