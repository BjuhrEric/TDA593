/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ClassDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClassDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ClassDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ClassDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramPackage eINSTANCE = ClassDiagram.impl.ClassDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__GUEST = 0;

	/**
	 * The feature id for the '<em><b>Room Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Cleaning Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CLEANING_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BILL = 4;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Number Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_NUMBER_OF_GUESTS = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___CHECK_IN = 1;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___CHECK_OUT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.PersonImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>First Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Family Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FAMILY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.GuestImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 1;

	/**
	 * The feature id for the '<em><b>First Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FIRST_NAMES = PERSON__FIRST_NAMES;

	/**
	 * The feature id for the '<em><b>Family Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FAMILY_NAMES = PERSON__FAMILY_NAMES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__TITLE = PERSON__TITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__STATUS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Guest Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__GUEST_CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NUMBER_OF_BEDS = 3;

	/**
	 * The feature id for the '<em><b>Number Of Extra Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NUMBER_OF_EXTRA_BEDS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BillImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__COST = 0;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___ADD_COST__ELIST = 0;

	/**
	 * The operation id for the '<em>Remove Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___REMOVE_COST__COST = 1;

	/**
	 * The operation id for the '<em>Split</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___SPLIT = 2;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___MERGE__BILL = 3;

	/**
	 * The operation id for the '<em>Perform Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___PERFORM_PAYMENT__BILLINGINFORMATION = 4;

	/**
	 * The operation id for the '<em>Print Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___PRINT_RECEIPT = 5;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ClassDiagram.Cost <em>Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.Cost
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCost()
	 * @generated
	 */
	int COST = 5;

	/**
	 * The number of structural features of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST___GET_PRICE = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST___GET_NAME = 1;

	/**
	 * The number of operations of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ClassDiagram.BillingInformation <em>Billing Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.BillingInformation
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBillingInformation()
	 * @generated
	 */
	int BILLING_INFORMATION = 6;

	/**
	 * The number of structural features of the '<em>Billing Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_INFORMATION___VALIDATE = 0;

	/**
	 * The operation id for the '<em>Get Payment Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_INFORMATION___GET_PAYMENT_STRATEGY = 1;

	/**
	 * The number of operations of the '<em>Billing Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_INFORMATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ClassDiagram.PaymentStrategy <em>Payment Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.PaymentStrategy
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPaymentStrategy()
	 * @generated
	 */
	int PAYMENT_STRATEGY = 7;

	/**
	 * The number of structural features of the '<em>Payment Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_STRATEGY___PAY__BILL = 0;

	/**
	 * The number of operations of the '<em>Payment Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_STRATEGY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomBookingImpl <em>Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomBookingImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomBooking()
	 * @generated
	 */
	int ROOM_BOOKING = 8;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOM = 2;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOM_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING___CANCEL = 0;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING___CLOSE = 1;

	/**
	 * The operation id for the '<em>Generate PDF</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING___GENERATE_PDF = 2;

	/**
	 * The number of operations of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ItemImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = COST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = COST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = COST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_PRICE = COST___GET_PRICE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_NAME = COST___GET_NAME;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = COST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.EventImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = COST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PRICE = COST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = COST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Responsible Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RESPONSIBLE_ENTITY = COST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NUMBER_OF_GUESTS = COST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__START_TIME = COST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__END_TIME = COST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Venue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VENUE = COST_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = COST_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_PRICE = COST___GET_PRICE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_NAME = COST___GET_NAME;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = COST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.VenueImpl <em>Venue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.VenueImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVenue()
	 * @generated
	 */
	int VENUE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Guest Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__GUEST_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Event Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__EVENT_CAPACITY = 2;

	/**
	 * The number of structural features of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.PackageImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ITEM = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.EventBookingImpl <em>Event Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.EventBookingImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEventBooking()
	 * @generated
	 */
	int EVENT_BOOKING = 13;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__BILL = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__END_TIME = 2;

	/**
	 * The number of structural features of the '<em>Event Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING___CANCEL = 0;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING___CLOSE = 1;

	/**
	 * The operation id for the '<em>Generate PDF</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING___GENERATE_PDF = 2;

	/**
	 * The number of operations of the '<em>Event Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AccountImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 14;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Accounttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNTTYPE = 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Permission</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___ADD_PERMISSION = 0;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___CLEAR_PERMISSIONS = 1;

	/**
	 * The operation id for the '<em>Has Permission</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___HAS_PERMISSION = 2;

	/**
	 * The operation id for the '<em>Has Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___HAS_PERMISSIONS = 3;

	/**
	 * The operation id for the '<em>Remove Permission</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___REMOVE_PERMISSION = 4;

	/**
	 * The operation id for the '<em>Set Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___SET_PERMISSIONS = 5;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AccountTypeImpl <em>Account Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AccountTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAccountType()
	 * @generated
	 */
	int ACCOUNT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TYPE__PERMISSION = 0;

	/**
	 * The number of structural features of the '<em>Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.Customer <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.Customer
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 17;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Billing Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_BILLING_INFORMATION = 0;

	/**
	 * The operation id for the '<em>Get Room Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_ROOM_BOOKINGS = 1;

	/**
	 * The operation id for the '<em>Get Event Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_EVENT_BOOKINGS = 2;

	/**
	 * The operation id for the '<em>Add Room Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING = 3;

	/**
	 * The operation id for the '<em>Add Event Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING = 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.OrganizationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 16;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = CUSTOMER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Billing Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_BILLING_INFORMATION = CUSTOMER___GET_BILLING_INFORMATION;

	/**
	 * The operation id for the '<em>Get Room Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_ROOM_BOOKINGS = CUSTOMER___GET_ROOM_BOOKINGS;

	/**
	 * The operation id for the '<em>Get Event Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_EVENT_BOOKINGS = CUSTOMER___GET_EVENT_BOOKINGS;

	/**
	 * The operation id for the '<em>Add Room Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___ADD_ROOM_BOOKING__ROOMBOOKING = CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING;

	/**
	 * The operation id for the '<em>Add Event Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___ADD_EVENT_BOOKING__EVENTBOOKING = CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = CUSTOMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.IndividualCustomerImpl <em>Individual Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.IndividualCustomerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIndividualCustomer()
	 * @generated
	 */
	int INDIVIDUAL_CUSTOMER = 18;

	/**
	 * The feature id for the '<em><b>First Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER__FIRST_NAMES = PERSON__FIRST_NAMES;

	/**
	 * The feature id for the '<em><b>Family Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER__FAMILY_NAMES = PERSON__FAMILY_NAMES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER__TITLE = PERSON__TITLE;

	/**
	 * The feature id for the '<em><b>Billing Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER__BILLING_INFORMATION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Individual Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Billing Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER___GET_BILLING_INFORMATION = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Room Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER___GET_ROOM_BOOKINGS = PERSON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Event Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER___GET_EVENT_BOOKINGS = PERSON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING = PERSON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Event Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING = PERSON_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Individual Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BookingScheduleImpl <em>Booking Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BookingScheduleImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBookingSchedule()
	 * @generated
	 */
	int BOOKING_SCHEDULE = 19;

	/**
	 * The feature id for the '<em><b>Room Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE__ROOM_BOOKINGS = 0;

	/**
	 * The feature id for the '<em><b>Event Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE__EVENT_BOOKINGS = 1;

	/**
	 * The number of structural features of the '<em>Booking Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Show Booked Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE___SHOW_BOOKED_ROOMS = 0;

	/**
	 * The operation id for the '<em>Show Booked Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE___SHOW_BOOKED_EVENTS = 1;

	/**
	 * The operation id for the '<em>Export Booked Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE___EXPORT_BOOKED_ROOMS = 2;

	/**
	 * The operation id for the '<em>Export Booked Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE___EXPORT_BOOKED_EVENTS = 3;

	/**
	 * The operation id for the '<em>Set Booking Alerts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE___SET_BOOKING_ALERTS__BOOLEAN = 4;

	/**
	 * The number of operations of the '<em>Booking Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_SCHEDULE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FloorMapImpl <em>Floor Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FloorMapImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFloorMap()
	 * @generated
	 */
	int FLOOR_MAP = 20;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_MAP__ROOM = 0;

	/**
	 * The number of structural features of the '<em>Floor Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_MAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Floor Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.Title <em>Title</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.Title
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 21;

	/**
	 * The meta object id for the '{@link ClassDiagram.GuestStatus <em>Guest Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.GuestStatus
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestStatus()
	 * @generated
	 */
	int GUEST_STATUS = 22;

	/**
	 * The meta object id for the '{@link ClassDiagram.RoomStatus <em>Room Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.RoomStatus
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomStatus()
	 * @generated
	 */
	int ROOM_STATUS = 23;

	/**
	 * The meta object id for the '{@link ClassDiagram.CleaningStatus <em>Cleaning Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.CleaningStatus
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCleaningStatus()
	 * @generated
	 */
	int CLEANING_STATUS = 24;

	/**
	 * The meta object id for the '{@link ClassDiagram.Permission <em>Permission</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.Permission
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 25;


	/**
	 * Returns the meta object for class '{@link ClassDiagram.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ClassDiagram.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Room#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see ClassDiagram.Room#getGuest()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Guest();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room#getRoomStatus <em>Room Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Status</em>'.
	 * @see ClassDiagram.Room#getRoomStatus()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomStatus();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room#getCleaningStatus <em>Cleaning Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleaning Status</em>'.
	 * @see ClassDiagram.Room#getCleaningStatus()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_CleaningStatus();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see ClassDiagram.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Room#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see ClassDiagram.Room#getBill()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Bill();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Room#getNumberOfGuests() <em>Get Number Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Guests</em>' operation.
	 * @see ClassDiagram.Room#getNumberOfGuests()
	 * @generated
	 */
	EOperation getRoom__GetNumberOfGuests();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Room#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see ClassDiagram.Room#checkIn()
	 * @generated
	 */
	EOperation getRoom__CheckIn();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Room#checkOut() <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see ClassDiagram.Room#checkOut()
	 * @generated
	 */
	EOperation getRoom__CheckOut();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see ClassDiagram.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Guest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ClassDiagram.Guest#getStatus()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Status();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see ClassDiagram.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute list '{@link ClassDiagram.Person#getFirstNames <em>First Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>First Names</em>'.
	 * @see ClassDiagram.Person#getFirstNames()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstNames();

	/**
	 * Returns the meta object for the attribute list '{@link ClassDiagram.Person#getFamilyNames <em>Family Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Family Names</em>'.
	 * @see ClassDiagram.Person#getFamilyNames()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FamilyNames();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Person#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ClassDiagram.Person#getTitle()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Title();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see ClassDiagram.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomType#getGuestCapacity <em>Guest Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Capacity</em>'.
	 * @see ClassDiagram.RoomType#getGuestCapacity()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_GuestCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomType#getNumberOfBeds <em>Number Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Beds</em>'.
	 * @see ClassDiagram.RoomType#getNumberOfBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumberOfBeds();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomType#getNumberOfExtraBeds <em>Number Of Extra Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Extra Beds</em>'.
	 * @see ClassDiagram.RoomType#getNumberOfExtraBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumberOfExtraBeds();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see ClassDiagram.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Bill#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost</em>'.
	 * @see ClassDiagram.Bill#getCost()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Cost();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Bill#addCost(org.eclipse.emf.common.util.EList) <em>Add Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cost</em>' operation.
	 * @see ClassDiagram.Bill#addCost(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBill__AddCost__EList();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Bill#removeCost(ClassDiagram.Cost) <em>Remove Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Cost</em>' operation.
	 * @see ClassDiagram.Bill#removeCost(ClassDiagram.Cost)
	 * @generated
	 */
	EOperation getBill__RemoveCost__Cost();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Bill#split() <em>Split</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Split</em>' operation.
	 * @see ClassDiagram.Bill#split()
	 * @generated
	 */
	EOperation getBill__Split();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Bill#merge(ClassDiagram.Bill) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see ClassDiagram.Bill#merge(ClassDiagram.Bill)
	 * @generated
	 */
	EOperation getBill__Merge__Bill();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Bill#performPayment(ClassDiagram.BillingInformation) <em>Perform Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Payment</em>' operation.
	 * @see ClassDiagram.Bill#performPayment(ClassDiagram.BillingInformation)
	 * @generated
	 */
	EOperation getBill__PerformPayment__BillingInformation();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Bill#printReceipt() <em>Print Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Receipt</em>' operation.
	 * @see ClassDiagram.Bill#printReceipt()
	 * @generated
	 */
	EOperation getBill__PrintReceipt();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost</em>'.
	 * @see ClassDiagram.Cost
	 * @generated
	 */
	EClass getCost();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Cost#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see ClassDiagram.Cost#getPrice()
	 * @generated
	 */
	EOperation getCost__GetPrice();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Cost#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see ClassDiagram.Cost#getName()
	 * @generated
	 */
	EOperation getCost__GetName();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BillingInformation <em>Billing Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Information</em>'.
	 * @see ClassDiagram.BillingInformation
	 * @generated
	 */
	EClass getBillingInformation();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillingInformation#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see ClassDiagram.BillingInformation#validate()
	 * @generated
	 */
	EOperation getBillingInformation__Validate();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillingInformation#getPaymentStrategy() <em>Get Payment Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment Strategy</em>' operation.
	 * @see ClassDiagram.BillingInformation#getPaymentStrategy()
	 * @generated
	 */
	EOperation getBillingInformation__GetPaymentStrategy();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.PaymentStrategy <em>Payment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Strategy</em>'.
	 * @see ClassDiagram.PaymentStrategy
	 * @generated
	 */
	EClass getPaymentStrategy();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.PaymentStrategy#pay(ClassDiagram.Bill) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see ClassDiagram.PaymentStrategy#pay(ClassDiagram.Bill)
	 * @generated
	 */
	EOperation getPaymentStrategy__Pay__Bill();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking</em>'.
	 * @see ClassDiagram.RoomBooking
	 * @generated
	 */
	EClass getRoomBooking();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomBooking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ClassDiagram.RoomBooking#getStartDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomBooking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ClassDiagram.RoomBooking#getEndDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.RoomBooking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see ClassDiagram.RoomBooking#getRoom()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Room();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.RoomBooking#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Type</em>'.
	 * @see ClassDiagram.RoomBooking#getRoomType()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_RoomType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomBooking#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see ClassDiagram.RoomBooking#cancel()
	 * @generated
	 */
	EOperation getRoomBooking__Cancel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomBooking#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see ClassDiagram.RoomBooking#close()
	 * @generated
	 */
	EOperation getRoomBooking__Close();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomBooking#generatePDF() <em>Generate PDF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate PDF</em>' operation.
	 * @see ClassDiagram.RoomBooking#generatePDF()
	 * @generated
	 */
	EOperation getRoomBooking__GeneratePDF();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see ClassDiagram.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see ClassDiagram.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Event#getPrice()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Price();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getResponsibleEntity <em>Responsible Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible Entity</em>'.
	 * @see ClassDiagram.Event#getResponsibleEntity()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ResponsibleEntity();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see ClassDiagram.Event#getNumberOfGuests()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_NumberOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ClassDiagram.Event#getStartTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Event#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ClassDiagram.Event#getEndTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EndTime();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Event#getVenue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Venue</em>'.
	 * @see ClassDiagram.Event#getVenue()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Venue();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Venue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venue</em>'.
	 * @see ClassDiagram.Venue
	 * @generated
	 */
	EClass getVenue();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Venue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Venue#getName()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Venue#getGuestCapacity <em>Guest Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Capacity</em>'.
	 * @see ClassDiagram.Venue#getGuestCapacity()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_GuestCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Venue#getEventCapacity <em>Event Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Capacity</em>'.
	 * @see ClassDiagram.Venue#getEventCapacity()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_EventCapacity();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see ClassDiagram.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Package#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see ClassDiagram.Package#getEvent()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Event();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Package#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ClassDiagram.Package#getCode()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Code();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Package#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see ClassDiagram.Package#getItem()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Item();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.EventBooking <em>Event Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Booking</em>'.
	 * @see ClassDiagram.EventBooking
	 * @generated
	 */
	EClass getEventBooking();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.EventBooking#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see ClassDiagram.EventBooking#getBill()
	 * @see #getEventBooking()
	 * @generated
	 */
	EReference getEventBooking_Bill();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EventBooking#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ClassDiagram.EventBooking#getStartTime()
	 * @see #getEventBooking()
	 * @generated
	 */
	EAttribute getEventBooking_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EventBooking#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ClassDiagram.EventBooking#getEndTime()
	 * @see #getEventBooking()
	 * @generated
	 */
	EAttribute getEventBooking_EndTime();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.EventBooking#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see ClassDiagram.EventBooking#cancel()
	 * @generated
	 */
	EOperation getEventBooking__Cancel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.EventBooking#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see ClassDiagram.EventBooking#close()
	 * @generated
	 */
	EOperation getEventBooking__Close();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.EventBooking#generatePDF() <em>Generate PDF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate PDF</em>' operation.
	 * @see ClassDiagram.EventBooking#generatePDF()
	 * @generated
	 */
	EOperation getEventBooking__GeneratePDF();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see ClassDiagram.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Account#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see ClassDiagram.Account#getUsername()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Username();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ClassDiagram.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Account#getAccounttype <em>Accounttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accounttype</em>'.
	 * @see ClassDiagram.Account#getAccounttype()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Accounttype();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Account#addPermission() <em>Add Permission</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Permission</em>' operation.
	 * @see ClassDiagram.Account#addPermission()
	 * @generated
	 */
	EOperation getAccount__AddPermission();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Account#clearPermissions() <em>Clear Permissions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Permissions</em>' operation.
	 * @see ClassDiagram.Account#clearPermissions()
	 * @generated
	 */
	EOperation getAccount__ClearPermissions();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Account#hasPermission() <em>Has Permission</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Permission</em>' operation.
	 * @see ClassDiagram.Account#hasPermission()
	 * @generated
	 */
	EOperation getAccount__HasPermission();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Account#hasPermissions() <em>Has Permissions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Permissions</em>' operation.
	 * @see ClassDiagram.Account#hasPermissions()
	 * @generated
	 */
	EOperation getAccount__HasPermissions();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Account#removePermission() <em>Remove Permission</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Permission</em>' operation.
	 * @see ClassDiagram.Account#removePermission()
	 * @generated
	 */
	EOperation getAccount__RemovePermission();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Account#setPermissions() <em>Set Permissions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Permissions</em>' operation.
	 * @see ClassDiagram.Account#setPermissions()
	 * @generated
	 */
	EOperation getAccount__SetPermissions();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Type</em>'.
	 * @see ClassDiagram.AccountType
	 * @generated
	 */
	EClass getAccountType();

	/**
	 * Returns the meta object for the attribute list '{@link ClassDiagram.AccountType#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permission</em>'.
	 * @see ClassDiagram.AccountType#getPermission()
	 * @see #getAccountType()
	 * @generated
	 */
	EAttribute getAccountType_Permission();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see ClassDiagram.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see ClassDiagram.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Customer#getBillingInformation() <em>Get Billing Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Billing Information</em>' operation.
	 * @see ClassDiagram.Customer#getBillingInformation()
	 * @generated
	 */
	EOperation getCustomer__GetBillingInformation();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Customer#getRoomBookings() <em>Get Room Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Bookings</em>' operation.
	 * @see ClassDiagram.Customer#getRoomBookings()
	 * @generated
	 */
	EOperation getCustomer__GetRoomBookings();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Customer#getEventBookings() <em>Get Event Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event Bookings</em>' operation.
	 * @see ClassDiagram.Customer#getEventBookings()
	 * @generated
	 */
	EOperation getCustomer__GetEventBookings();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Customer#addRoomBooking(ClassDiagram.RoomBooking) <em>Add Room Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Booking</em>' operation.
	 * @see ClassDiagram.Customer#addRoomBooking(ClassDiagram.RoomBooking)
	 * @generated
	 */
	EOperation getCustomer__AddRoomBooking__RoomBooking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Customer#addEventBooking(ClassDiagram.EventBooking) <em>Add Event Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Event Booking</em>' operation.
	 * @see ClassDiagram.Customer#addEventBooking(ClassDiagram.EventBooking)
	 * @generated
	 */
	EOperation getCustomer__AddEventBooking__EventBooking();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IndividualCustomer <em>Individual Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Customer</em>'.
	 * @see ClassDiagram.IndividualCustomer
	 * @generated
	 */
	EClass getIndividualCustomer();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.IndividualCustomer#getBillingInformation <em>Billing Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Billing Information</em>'.
	 * @see ClassDiagram.IndividualCustomer#getBillingInformation()
	 * @see #getIndividualCustomer()
	 * @generated
	 */
	EReference getIndividualCustomer_BillingInformation();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.IndividualCustomer#getRoomBookings <em>Room Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Bookings</em>'.
	 * @see ClassDiagram.IndividualCustomer#getRoomBookings()
	 * @see #getIndividualCustomer()
	 * @generated
	 */
	EReference getIndividualCustomer_RoomBookings();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.IndividualCustomer#getEventBookings <em>Event Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Bookings</em>'.
	 * @see ClassDiagram.IndividualCustomer#getEventBookings()
	 * @see #getIndividualCustomer()
	 * @generated
	 */
	EReference getIndividualCustomer_EventBookings();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BookingSchedule <em>Booking Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Schedule</em>'.
	 * @see ClassDiagram.BookingSchedule
	 * @generated
	 */
	EClass getBookingSchedule();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.BookingSchedule#getRoomBookings <em>Room Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Bookings</em>'.
	 * @see ClassDiagram.BookingSchedule#getRoomBookings()
	 * @see #getBookingSchedule()
	 * @generated
	 */
	EReference getBookingSchedule_RoomBookings();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.BookingSchedule#getEventBookings <em>Event Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Bookings</em>'.
	 * @see ClassDiagram.BookingSchedule#getEventBookings()
	 * @see #getBookingSchedule()
	 * @generated
	 */
	EReference getBookingSchedule_EventBookings();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingSchedule#showBookedRooms() <em>Show Booked Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Booked Rooms</em>' operation.
	 * @see ClassDiagram.BookingSchedule#showBookedRooms()
	 * @generated
	 */
	EOperation getBookingSchedule__ShowBookedRooms();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingSchedule#showBookedEvents() <em>Show Booked Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Booked Events</em>' operation.
	 * @see ClassDiagram.BookingSchedule#showBookedEvents()
	 * @generated
	 */
	EOperation getBookingSchedule__ShowBookedEvents();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingSchedule#exportBookedRooms() <em>Export Booked Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export Booked Rooms</em>' operation.
	 * @see ClassDiagram.BookingSchedule#exportBookedRooms()
	 * @generated
	 */
	EOperation getBookingSchedule__ExportBookedRooms();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingSchedule#exportBookedEvents() <em>Export Booked Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export Booked Events</em>' operation.
	 * @see ClassDiagram.BookingSchedule#exportBookedEvents()
	 * @generated
	 */
	EOperation getBookingSchedule__ExportBookedEvents();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingSchedule#setBookingAlerts(boolean) <em>Set Booking Alerts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Booking Alerts</em>' operation.
	 * @see ClassDiagram.BookingSchedule#setBookingAlerts(boolean)
	 * @generated
	 */
	EOperation getBookingSchedule__SetBookingAlerts__boolean();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.FloorMap <em>Floor Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Map</em>'.
	 * @see ClassDiagram.FloorMap
	 * @generated
	 */
	EClass getFloorMap();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.FloorMap#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see ClassDiagram.FloorMap#getRoom()
	 * @see #getFloorMap()
	 * @generated
	 */
	EReference getFloorMap_Room();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title</em>'.
	 * @see ClassDiagram.Title
	 * @generated
	 */
	EEnum getTitle();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.GuestStatus <em>Guest Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guest Status</em>'.
	 * @see ClassDiagram.GuestStatus
	 * @generated
	 */
	EEnum getGuestStatus();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.RoomStatus <em>Room Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Status</em>'.
	 * @see ClassDiagram.RoomStatus
	 * @generated
	 */
	EEnum getRoomStatus();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.CleaningStatus <em>Cleaning Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cleaning Status</em>'.
	 * @see ClassDiagram.CleaningStatus
	 * @generated
	 */
	EEnum getCleaningStatus();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission</em>'.
	 * @see ClassDiagram.Permission
	 * @generated
	 */
	EEnum getPermission();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassDiagramFactory getClassDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__GUEST = eINSTANCE.getRoom_Guest();

		/**
		 * The meta object literal for the '<em><b>Room Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_STATUS = eINSTANCE.getRoom_RoomStatus();

		/**
		 * The meta object literal for the '<em><b>Cleaning Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CLEANING_STATUS = eINSTANCE.getRoom_CleaningStatus();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BILL = eINSTANCE.getRoom_Bill();

		/**
		 * The meta object literal for the '<em><b>Get Number Of Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___GET_NUMBER_OF_GUESTS = eINSTANCE.getRoom__GetNumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___CHECK_IN = eINSTANCE.getRoom__CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___CHECK_OUT = eINSTANCE.getRoom__CheckOut();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.GuestImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__STATUS = eINSTANCE.getGuest_Status();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.PersonImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAMES = eINSTANCE.getPerson_FirstNames();

		/**
		 * The meta object literal for the '<em><b>Family Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FAMILY_NAMES = eINSTANCE.getPerson_FamilyNames();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TITLE = eINSTANCE.getPerson_Title();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Guest Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__GUEST_CAPACITY = eINSTANCE.getRoomType_GuestCapacity();

		/**
		 * The meta object literal for the '<em><b>Number Of Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NUMBER_OF_BEDS = eINSTANCE.getRoomType_NumberOfBeds();

		/**
		 * The meta object literal for the '<em><b>Number Of Extra Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NUMBER_OF_EXTRA_BEDS = eINSTANCE.getRoomType_NumberOfExtraBeds();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BillImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__COST = eINSTANCE.getBill_Cost();

		/**
		 * The meta object literal for the '<em><b>Add Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___ADD_COST__ELIST = eINSTANCE.getBill__AddCost__EList();

		/**
		 * The meta object literal for the '<em><b>Remove Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___REMOVE_COST__COST = eINSTANCE.getBill__RemoveCost__Cost();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___SPLIT = eINSTANCE.getBill__Split();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___MERGE__BILL = eINSTANCE.getBill__Merge__Bill();

		/**
		 * The meta object literal for the '<em><b>Perform Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___PERFORM_PAYMENT__BILLINGINFORMATION = eINSTANCE.getBill__PerformPayment__BillingInformation();

		/**
		 * The meta object literal for the '<em><b>Print Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___PRINT_RECEIPT = eINSTANCE.getBill__PrintReceipt();

		/**
		 * The meta object literal for the '{@link ClassDiagram.Cost <em>Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.Cost
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCost()
		 * @generated
		 */
		EClass COST = eINSTANCE.getCost();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COST___GET_PRICE = eINSTANCE.getCost__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COST___GET_NAME = eINSTANCE.getCost__GetName();

		/**
		 * The meta object literal for the '{@link ClassDiagram.BillingInformation <em>Billing Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.BillingInformation
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBillingInformation()
		 * @generated
		 */
		EClass BILLING_INFORMATION = eINSTANCE.getBillingInformation();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLING_INFORMATION___VALIDATE = eINSTANCE.getBillingInformation__Validate();

		/**
		 * The meta object literal for the '<em><b>Get Payment Strategy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLING_INFORMATION___GET_PAYMENT_STRATEGY = eINSTANCE.getBillingInformation__GetPaymentStrategy();

		/**
		 * The meta object literal for the '{@link ClassDiagram.PaymentStrategy <em>Payment Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.PaymentStrategy
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPaymentStrategy()
		 * @generated
		 */
		EClass PAYMENT_STRATEGY = eINSTANCE.getPaymentStrategy();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_STRATEGY___PAY__BILL = eINSTANCE.getPaymentStrategy__Pay__Bill();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomBookingImpl <em>Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomBookingImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomBooking()
		 * @generated
		 */
		EClass ROOM_BOOKING = eINSTANCE.getRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__START_DATE = eINSTANCE.getRoomBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__END_DATE = eINSTANCE.getRoomBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOM = eINSTANCE.getRoomBooking_Room();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOM_TYPE = eINSTANCE.getRoomBooking_RoomType();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKING___CANCEL = eINSTANCE.getRoomBooking__Cancel();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKING___CLOSE = eINSTANCE.getRoomBooking__Close();

		/**
		 * The meta object literal for the '<em><b>Generate PDF</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKING___GENERATE_PDF = eINSTANCE.getRoomBooking__GeneratePDF();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ItemImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.EventImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__PRICE = eINSTANCE.getEvent_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Responsible Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__RESPONSIBLE_ENTITY = eINSTANCE.getEvent_ResponsibleEntity();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NUMBER_OF_GUESTS = eINSTANCE.getEvent_NumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__START_TIME = eINSTANCE.getEvent_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__END_TIME = eINSTANCE.getEvent_EndTime();

		/**
		 * The meta object literal for the '<em><b>Venue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__VENUE = eINSTANCE.getEvent_Venue();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.VenueImpl <em>Venue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.VenueImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVenue()
		 * @generated
		 */
		EClass VENUE = eINSTANCE.getVenue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__NAME = eINSTANCE.getVenue_Name();

		/**
		 * The meta object literal for the '<em><b>Guest Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__GUEST_CAPACITY = eINSTANCE.getVenue_GuestCapacity();

		/**
		 * The meta object literal for the '<em><b>Event Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__EVENT_CAPACITY = eINSTANCE.getVenue_EventCapacity();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.PackageImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EVENT = eINSTANCE.getPackage_Event();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CODE = eINSTANCE.getPackage_Code();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ITEM = eINSTANCE.getPackage_Item();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.EventBookingImpl <em>Event Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.EventBookingImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEventBooking()
		 * @generated
		 */
		EClass EVENT_BOOKING = eINSTANCE.getEventBooking();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BOOKING__BILL = eINSTANCE.getEventBooking_Bill();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BOOKING__START_TIME = eINSTANCE.getEventBooking_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BOOKING__END_TIME = eINSTANCE.getEventBooking_EndTime();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_BOOKING___CANCEL = eINSTANCE.getEventBooking__Cancel();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_BOOKING___CLOSE = eINSTANCE.getEventBooking__Close();

		/**
		 * The meta object literal for the '<em><b>Generate PDF</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_BOOKING___GENERATE_PDF = eINSTANCE.getEventBooking__GeneratePDF();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AccountImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__USERNAME = eINSTANCE.getAccount_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '<em><b>Accounttype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__ACCOUNTTYPE = eINSTANCE.getAccount_Accounttype();

		/**
		 * The meta object literal for the '<em><b>Add Permission</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___ADD_PERMISSION = eINSTANCE.getAccount__AddPermission();

		/**
		 * The meta object literal for the '<em><b>Clear Permissions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___CLEAR_PERMISSIONS = eINSTANCE.getAccount__ClearPermissions();

		/**
		 * The meta object literal for the '<em><b>Has Permission</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___HAS_PERMISSION = eINSTANCE.getAccount__HasPermission();

		/**
		 * The meta object literal for the '<em><b>Has Permissions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___HAS_PERMISSIONS = eINSTANCE.getAccount__HasPermissions();

		/**
		 * The meta object literal for the '<em><b>Remove Permission</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___REMOVE_PERMISSION = eINSTANCE.getAccount__RemovePermission();

		/**
		 * The meta object literal for the '<em><b>Set Permissions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___SET_PERMISSIONS = eINSTANCE.getAccount__SetPermissions();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AccountTypeImpl <em>Account Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AccountTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAccountType()
		 * @generated
		 */
		EClass ACCOUNT_TYPE = eINSTANCE.getAccountType();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_TYPE__PERMISSION = eINSTANCE.getAccountType_Permission();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.OrganizationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '{@link ClassDiagram.Customer <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.Customer
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Get Billing Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_BILLING_INFORMATION = eINSTANCE.getCustomer__GetBillingInformation();

		/**
		 * The meta object literal for the '<em><b>Get Room Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_ROOM_BOOKINGS = eINSTANCE.getCustomer__GetRoomBookings();

		/**
		 * The meta object literal for the '<em><b>Get Event Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_EVENT_BOOKINGS = eINSTANCE.getCustomer__GetEventBookings();

		/**
		 * The meta object literal for the '<em><b>Add Room Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_ROOM_BOOKING__ROOMBOOKING = eINSTANCE.getCustomer__AddRoomBooking__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Add Event Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_EVENT_BOOKING__EVENTBOOKING = eINSTANCE.getCustomer__AddEventBooking__EventBooking();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.IndividualCustomerImpl <em>Individual Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.IndividualCustomerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIndividualCustomer()
		 * @generated
		 */
		EClass INDIVIDUAL_CUSTOMER = eINSTANCE.getIndividualCustomer();

		/**
		 * The meta object literal for the '<em><b>Billing Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_CUSTOMER__BILLING_INFORMATION = eINSTANCE.getIndividualCustomer_BillingInformation();

		/**
		 * The meta object literal for the '<em><b>Room Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS = eINSTANCE.getIndividualCustomer_RoomBookings();

		/**
		 * The meta object literal for the '<em><b>Event Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS = eINSTANCE.getIndividualCustomer_EventBookings();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BookingScheduleImpl <em>Booking Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BookingScheduleImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBookingSchedule()
		 * @generated
		 */
		EClass BOOKING_SCHEDULE = eINSTANCE.getBookingSchedule();

		/**
		 * The meta object literal for the '<em><b>Room Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_SCHEDULE__ROOM_BOOKINGS = eINSTANCE.getBookingSchedule_RoomBookings();

		/**
		 * The meta object literal for the '<em><b>Event Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_SCHEDULE__EVENT_BOOKINGS = eINSTANCE.getBookingSchedule_EventBookings();

		/**
		 * The meta object literal for the '<em><b>Show Booked Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_SCHEDULE___SHOW_BOOKED_ROOMS = eINSTANCE.getBookingSchedule__ShowBookedRooms();

		/**
		 * The meta object literal for the '<em><b>Show Booked Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_SCHEDULE___SHOW_BOOKED_EVENTS = eINSTANCE.getBookingSchedule__ShowBookedEvents();

		/**
		 * The meta object literal for the '<em><b>Export Booked Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_SCHEDULE___EXPORT_BOOKED_ROOMS = eINSTANCE.getBookingSchedule__ExportBookedRooms();

		/**
		 * The meta object literal for the '<em><b>Export Booked Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_SCHEDULE___EXPORT_BOOKED_EVENTS = eINSTANCE.getBookingSchedule__ExportBookedEvents();

		/**
		 * The meta object literal for the '<em><b>Set Booking Alerts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_SCHEDULE___SET_BOOKING_ALERTS__BOOLEAN = eINSTANCE.getBookingSchedule__SetBookingAlerts__boolean();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.FloorMapImpl <em>Floor Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.FloorMapImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFloorMap()
		 * @generated
		 */
		EClass FLOOR_MAP = eINSTANCE.getFloorMap();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR_MAP__ROOM = eINSTANCE.getFloorMap_Room();

		/**
		 * The meta object literal for the '{@link ClassDiagram.Title <em>Title</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.Title
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getTitle()
		 * @generated
		 */
		EEnum TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link ClassDiagram.GuestStatus <em>Guest Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.GuestStatus
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestStatus()
		 * @generated
		 */
		EEnum GUEST_STATUS = eINSTANCE.getGuestStatus();

		/**
		 * The meta object literal for the '{@link ClassDiagram.RoomStatus <em>Room Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.RoomStatus
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomStatus()
		 * @generated
		 */
		EEnum ROOM_STATUS = eINSTANCE.getRoomStatus();

		/**
		 * The meta object literal for the '{@link ClassDiagram.CleaningStatus <em>Cleaning Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.CleaningStatus
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCleaningStatus()
		 * @generated
		 */
		EEnum CLEANING_STATUS = eINSTANCE.getCleaningStatus();

		/**
		 * The meta object literal for the '{@link ClassDiagram.Permission <em>Permission</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.Permission
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPermission()
		 * @generated
		 */
		EEnum PERMISSION = eINSTANCE.getPermission();

	}

} //ClassDiagramPackage
