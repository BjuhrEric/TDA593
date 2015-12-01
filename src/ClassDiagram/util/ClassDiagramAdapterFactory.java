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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage
 * @generated
 */
public class ClassDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramSwitch modelSwitch =
		new ClassDiagramSwitch() {
			public Object caseRoom(Room object) {
				return createRoomAdapter();
			}
			public Object caseGuest(Guest object) {
				return createGuestAdapter();
			}
			public Object casePerson(Person object) {
				return createPersonAdapter();
			}
			public Object caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			public Object caseBill(Bill object) {
				return createBillAdapter();
			}
			public Object caseCost(Cost object) {
				return createCostAdapter();
			}
			public Object caseBillingInformation(BillingInformation object) {
				return createBillingInformationAdapter();
			}
			public Object casePaymentStrategy(PaymentStrategy object) {
				return createPaymentStrategyAdapter();
			}
			public Object caseRoomBooking(RoomBooking object) {
				return createRoomBookingAdapter();
			}
			public Object caseItem(Item object) {
				return createItemAdapter();
			}
			public Object caseEvent(Event object) {
				return createEventAdapter();
			}
			public Object caseVenue(Venue object) {
				return createVenueAdapter();
			}
			public Object casePackage(ClassDiagram.Package object) {
				return createPackageAdapter();
			}
			public Object caseEventBooking(EventBooking object) {
				return createEventBookingAdapter();
			}
			public Object caseAccount(Account object) {
				return createAccountAdapter();
			}
			public Object caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			public Object caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			public Object caseIndividualCustomer(IndividualCustomer object) {
				return createIndividualCustomerAdapter();
			}
			public Object caseBookingSchedule(BookingSchedule object) {
				return createBookingScheduleAdapter();
			}
			public Object caseFloorMap(FloorMap object) {
				return createFloorMapAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Cost
	 * @generated
	 */
	public Adapter createCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.BillingInformation <em>Billing Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.BillingInformation
	 * @generated
	 */
	public Adapter createBillingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.PaymentStrategy <em>Payment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.PaymentStrategy
	 * @generated
	 */
	public Adapter createPaymentStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.RoomBooking
	 * @generated
	 */
	public Adapter createRoomBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Venue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Venue
	 * @generated
	 */
	public Adapter createVenueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.EventBooking <em>Event Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.EventBooking
	 * @generated
	 */
	public Adapter createEventBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.IndividualCustomer <em>Individual Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.IndividualCustomer
	 * @generated
	 */
	public Adapter createIndividualCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.BookingSchedule <em>Booking Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.BookingSchedule
	 * @generated
	 */
	public Adapter createBookingScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.FloorMap <em>Floor Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.FloorMap
	 * @generated
	 */
	public Adapter createFloorMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClassDiagramAdapterFactory
