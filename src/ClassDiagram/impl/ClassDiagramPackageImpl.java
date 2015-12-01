/**
 */
package ClassDiagram.impl;

import ClassDiagram.Account;
import ClassDiagram.Bill;
import ClassDiagram.BillingInformation;
import ClassDiagram.BookingSchedule;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.CleaningStatus;
import ClassDiagram.Cost;
import ClassDiagram.Customer;
import ClassDiagram.Event;
import ClassDiagram.EventBooking;
import ClassDiagram.FloorMap;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Item;
import ClassDiagram.Organization;
import ClassDiagram.PaymentStrategy;
import ClassDiagram.Permission;
import ClassDiagram.Person;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;
import ClassDiagram.Title;
import ClassDiagram.Venue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagramPackageImpl extends EPackageImpl implements ClassDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass venueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualCustomerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cleaningStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ClassDiagram.ClassDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassDiagramPackageImpl() {
		super(eNS_URI, ClassDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClassDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassDiagramPackage init() {
		if (isInited) return (ClassDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ClassDiagramPackage.eNS_URI);

		// Obtain or create and register package
		ClassDiagramPackageImpl theClassDiagramPackage = (ClassDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassDiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theClassDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theClassDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassDiagramPackage.eNS_URI, theClassDiagramPackage);
		return theClassDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Guest() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomStatus() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_CleaningStatus() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Bill() {
		return (EReference)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Status() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstNames() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FamilyNames() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Title() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_GuestCapacity() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_NumberOfBeds() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_NumberOfExtraBeds() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Description() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Cost() {
		return (EReference)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCost() {
		return costEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillingInformation() {
		return billingInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentStrategy() {
		return paymentStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBooking() {
		return roomBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomBooking_StartDate() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomBooking_EndDate() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBooking_Room() {
		return (EReference)roomBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBooking_RoomType() {
		return (EReference)roomBookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Name() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Price() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Price() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_ResponsibleEntity() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_NumberOfGuests() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_StartTime() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_EndTime() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Venue() {
		return (EReference)eventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVenue() {
		return venueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenue_Name() {
		return (EAttribute)venueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenue_GuestCapacity() {
		return (EAttribute)venueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenue_EventCapacity() {
		return (EAttribute)venueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Event() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Code() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Item() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBooking() {
		return eventBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBooking_Bill() {
		return (EReference)eventBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBooking_StartTime() {
		return (EAttribute)eventBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBooking_EndTime() {
		return (EAttribute)eventBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Permission() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Username() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Password() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualCustomer() {
		return individualCustomerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualCustomer_BillingInformation() {
		return (EReference)individualCustomerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualCustomer_RoomBookings() {
		return (EReference)individualCustomerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualCustomer_EventBookings() {
		return (EReference)individualCustomerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingSchedule() {
		return bookingScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingSchedule_RoomBookings() {
		return (EReference)bookingScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingSchedule_EventBookings() {
		return (EReference)bookingScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorMap() {
		return floorMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloorMap_Room() {
		return (EReference)floorMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTitle() {
		return titleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuestStatus() {
		return guestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomStatus() {
		return roomStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCleaningStatus() {
		return cleaningStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermission() {
		return permissionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramFactory getClassDiagramFactory() {
		return (ClassDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__GUEST);
		createEAttribute(roomEClass, ROOM__ROOM_STATUS);
		createEAttribute(roomEClass, ROOM__CLEANING_STATUS);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEReference(roomEClass, ROOM__BILL);

		guestEClass = createEClass(GUEST);
		createEAttribute(guestEClass, GUEST__STATUS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAMES);
		createEAttribute(personEClass, PERSON__FAMILY_NAMES);
		createEAttribute(personEClass, PERSON__TITLE);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__GUEST_CAPACITY);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NUMBER_OF_BEDS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NUMBER_OF_EXTRA_BEDS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);

		billEClass = createEClass(BILL);
		createEReference(billEClass, BILL__COST);

		costEClass = createEClass(COST);

		billingInformationEClass = createEClass(BILLING_INFORMATION);

		paymentStrategyEClass = createEClass(PAYMENT_STRATEGY);

		roomBookingEClass = createEClass(ROOM_BOOKING);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__START_DATE);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__END_DATE);
		createEReference(roomBookingEClass, ROOM_BOOKING__ROOM);
		createEReference(roomBookingEClass, ROOM_BOOKING__ROOM_TYPE);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__NAME);
		createEAttribute(itemEClass, ITEM__PRICE);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);
		createEAttribute(eventEClass, EVENT__PRICE);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);
		createEAttribute(eventEClass, EVENT__RESPONSIBLE_ENTITY);
		createEAttribute(eventEClass, EVENT__NUMBER_OF_GUESTS);
		createEAttribute(eventEClass, EVENT__START_TIME);
		createEAttribute(eventEClass, EVENT__END_TIME);
		createEReference(eventEClass, EVENT__VENUE);

		venueEClass = createEClass(VENUE);
		createEAttribute(venueEClass, VENUE__NAME);
		createEAttribute(venueEClass, VENUE__GUEST_CAPACITY);
		createEAttribute(venueEClass, VENUE__EVENT_CAPACITY);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__EVENT);
		createEAttribute(packageEClass, PACKAGE__CODE);
		createEReference(packageEClass, PACKAGE__ITEM);

		eventBookingEClass = createEClass(EVENT_BOOKING);
		createEReference(eventBookingEClass, EVENT_BOOKING__BILL);
		createEAttribute(eventBookingEClass, EVENT_BOOKING__START_TIME);
		createEAttribute(eventBookingEClass, EVENT_BOOKING__END_TIME);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__PERMISSION);
		createEAttribute(accountEClass, ACCOUNT__USERNAME);
		createEAttribute(accountEClass, ACCOUNT__PASSWORD);

		organizationEClass = createEClass(ORGANIZATION);

		customerEClass = createEClass(CUSTOMER);

		individualCustomerEClass = createEClass(INDIVIDUAL_CUSTOMER);
		createEReference(individualCustomerEClass, INDIVIDUAL_CUSTOMER__BILLING_INFORMATION);
		createEReference(individualCustomerEClass, INDIVIDUAL_CUSTOMER__ROOM_BOOKINGS);
		createEReference(individualCustomerEClass, INDIVIDUAL_CUSTOMER__EVENT_BOOKINGS);

		bookingScheduleEClass = createEClass(BOOKING_SCHEDULE);
		createEReference(bookingScheduleEClass, BOOKING_SCHEDULE__ROOM_BOOKINGS);
		createEReference(bookingScheduleEClass, BOOKING_SCHEDULE__EVENT_BOOKINGS);

		floorMapEClass = createEClass(FLOOR_MAP);
		createEReference(floorMapEClass, FLOOR_MAP__ROOM);

		// Create enums
		titleEEnum = createEEnum(TITLE);
		guestStatusEEnum = createEEnum(GUEST_STATUS);
		roomStatusEEnum = createEEnum(ROOM_STATUS);
		cleaningStatusEEnum = createEEnum(CLEANING_STATUS);
		permissionEEnum = createEEnum(PERMISSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add supertypes to classes
		guestEClass.getESuperTypes().add(this.getPerson());
		itemEClass.getESuperTypes().add(this.getCost());
		eventEClass.getESuperTypes().add(this.getCost());
		organizationEClass.getESuperTypes().add(this.getCustomer());
		individualCustomerEClass.getESuperTypes().add(this.getPerson());
		individualCustomerEClass.getESuperTypes().add(this.getCustomer());

		// Initialize classes and features; add operations and parameters
		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Guest(), this.getGuest(), null, "guest", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomStatus(), this.getRoomStatus(), "roomStatus", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_CleaningStatus(), this.getCleaningStatus(), "cleaningStatus", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Bill(), this.getBill(), null, "bill", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(roomEClass, theTypesPackage.getInteger(), "getNumberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roomEClass, null, "checkIn");

		addEOperation(roomEClass, null, "checkOut");

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuest_Status(), this.getGuestStatus(), "status", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstNames(), theTypesPackage.getString(), "firstNames", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_FamilyNames(), theTypesPackage.getString(), "familyNames", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Title(), this.getTitle(), "title", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), theTypesPackage.getString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Price(), theTypesPackage.getReal(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_GuestCapacity(), theTypesPackage.getInteger(), "guestCapacity", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_NumberOfBeds(), theTypesPackage.getInteger(), "numberOfBeds", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_NumberOfExtraBeds(), theTypesPackage.getInteger(), "numberOfExtraBeds", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBill_Cost(), this.getCost(), null, "cost", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(billEClass, null, "addCost");
		addEParameter(op, this.getCost(), "cost", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(billEClass, null, "removeCost");
		addEParameter(op, this.getCost(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(billEClass, this.getBill(), "split", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(billEClass, null, "merge");
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(billEClass, null, "performPayment");
		addEParameter(op, this.getBillingInformation(), "info", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(billEClass, null, "printReceipt");

		initEClass(costEClass, Cost.class, "Cost", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(costEClass, theTypesPackage.getReal(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(costEClass, theTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billingInformationEClass, BillingInformation.class, "BillingInformation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(billingInformationEClass, theTypesPackage.getBoolean(), "validate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(billingInformationEClass, this.getPaymentStrategy(), "getPaymentStrategy", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentStrategyEClass, PaymentStrategy.class, "PaymentStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(paymentStrategyEClass, null, "pay");
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomBookingEClass, RoomBooking.class, "RoomBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBooking_Room(), this.getRoom(), null, "room", null, 0, -1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBooking_RoomType(), this.getRoomType(), null, "roomType", null, 0, -1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(roomBookingEClass, null, "cancel");

		addEOperation(roomBookingEClass, null, "close");

		addEOperation(roomBookingEClass, null, "generatePDF");

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), theTypesPackage.getString(), "name", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getItem_Price(), theTypesPackage.getReal(), "price", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), theTypesPackage.getString(), "name", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_Price(), theTypesPackage.getReal(), "price", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_Description(), theTypesPackage.getString(), "description", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_ResponsibleEntity(), theTypesPackage.getString(), "responsibleEntity", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_NumberOfGuests(), theTypesPackage.getInteger(), "numberOfGuests", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_StartTime(), ecorePackage.getEDate(), "startTime", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_EndTime(), ecorePackage.getEDate(), "endTime", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvent_Venue(), this.getVenue(), null, "venue", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(venueEClass, Venue.class, "Venue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVenue_Name(), theTypesPackage.getString(), "name", null, 1, 1, Venue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVenue_GuestCapacity(), theTypesPackage.getInteger(), "guestCapacity", null, 1, 1, Venue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVenue_EventCapacity(), theTypesPackage.getInteger(), "eventCapacity", null, 1, 1, Venue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageEClass, ClassDiagram.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Event(), this.getEvent(), null, "event", null, 0, -1, ClassDiagram.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackage_Code(), theTypesPackage.getString(), "code", null, 1, 1, ClassDiagram.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_Item(), this.getItem(), null, "item", null, 0, -1, ClassDiagram.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventBookingEClass, EventBooking.class, "EventBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventBooking_Bill(), this.getBill(), null, "bill", null, 1, 1, EventBooking.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEventBooking_StartTime(), ecorePackage.getEDate(), "startTime", null, 1, 1, EventBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEventBooking_EndTime(), ecorePackage.getEDate(), "endTime", null, 1, 1, EventBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(eventBookingEClass, null, "cancel");

		addEOperation(eventBookingEClass, null, "close");

		addEOperation(eventBookingEClass, null, "generatePDF");

		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Permission(), this.getPermission(), "permission", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccount_Username(), theTypesPackage.getString(), "username", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccount_Password(), theTypesPackage.getString(), "password", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(accountEClass, null, "addPermission");

		addEOperation(accountEClass, null, "clearPermissions");

		addEOperation(accountEClass, theTypesPackage.getBoolean(), "hasPermission", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(accountEClass, theTypesPackage.getBoolean(), "hasPermissions", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(accountEClass, null, "removePermission");

		addEOperation(accountEClass, null, "setPermissions");

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customerEClass, Customer.class, "Customer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(customerEClass, this.getBillingInformation(), "getBillingInformation", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(customerEClass, this.getRoomBooking(), "getRoomBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(customerEClass, this.getEventBooking(), "getEventBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "addRoomBooking");
		addEParameter(op, this.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "addEventBooking");
		addEParameter(op, this.getEventBooking(), "eventBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(individualCustomerEClass, IndividualCustomer.class, "IndividualCustomer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualCustomer_BillingInformation(), this.getBillingInformation(), null, "billingInformation", null, 0, -1, IndividualCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividualCustomer_RoomBookings(), this.getRoomBooking(), null, "roomBookings", null, 0, -1, IndividualCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividualCustomer_EventBookings(), this.getEventBooking(), null, "eventBookings", null, 0, -1, IndividualCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingScheduleEClass, BookingSchedule.class, "BookingSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingSchedule_RoomBookings(), this.getRoomBooking(), null, "roomBookings", null, 0, -1, BookingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingSchedule_EventBookings(), this.getEventBooking(), null, "eventBookings", null, 0, -1, BookingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(bookingScheduleEClass, null, "showBookedRooms");

		addEOperation(bookingScheduleEClass, null, "showBookedEvents");

		addEOperation(bookingScheduleEClass, null, "exportBookedRooms");

		addEOperation(bookingScheduleEClass, null, "exportBookedEvents");

		op = addEOperation(bookingScheduleEClass, null, "setBookingAlerts");
		addEParameter(op, theTypesPackage.getBoolean(), "on", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(floorMapEClass, FloorMap.class, "FloorMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloorMap_Room(), this.getRoom(), null, "room", null, 0, -1, FloorMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(titleEEnum, Title.class, "Title");
		addEEnumLiteral(titleEEnum, Title.MR_LITERAL);
		addEEnumLiteral(titleEEnum, Title.MRS_LITERAL);
		addEEnumLiteral(titleEEnum, Title.MS_LITERAL);
		addEEnumLiteral(titleEEnum, Title.SIR_LITERAL);
		addEEnumLiteral(titleEEnum, Title.DR_LITERAL);
		addEEnumLiteral(titleEEnum, Title.MDM_LITERAL);

		initEEnum(guestStatusEEnum, GuestStatus.class, "GuestStatus");
		addEEnumLiteral(guestStatusEEnum, GuestStatus.CHECKED_IN_LITERAL);
		addEEnumLiteral(guestStatusEEnum, GuestStatus.CHECKED_OUT_LITERAL);
		addEEnumLiteral(guestStatusEEnum, GuestStatus.NOT_IN_HOTEL_LITERAL);
		addEEnumLiteral(guestStatusEEnum, GuestStatus.NOT_ARRIVED_YET_LITERAL);

		initEEnum(roomStatusEEnum, RoomStatus.class, "RoomStatus");
		addEEnumLiteral(roomStatusEEnum, RoomStatus.AVAILABLE_LITERAL);
		addEEnumLiteral(roomStatusEEnum, RoomStatus.BOOKED_LITERAL);
		addEEnumLiteral(roomStatusEEnum, RoomStatus.OCCUPIED_LITERAL);
		addEEnumLiteral(roomStatusEEnum, RoomStatus.OUT_OF_ORDER_LITERAL);

		initEEnum(cleaningStatusEEnum, CleaningStatus.class, "CleaningStatus");
		addEEnumLiteral(cleaningStatusEEnum, CleaningStatus.CLEAN_LITERAL);
		addEEnumLiteral(cleaningStatusEEnum, CleaningStatus.DIRTY_LITERAL);
		addEEnumLiteral(cleaningStatusEEnum, CleaningStatus.CHECKED_OUT_LITERAL);

		initEEnum(permissionEEnum, Permission.class, "Permission");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (guestStatusEEnum, 
		   source, 
		   new String[] {
			 "originalName", "Guest Status"
		   });	
		addAnnotation
		  (roomStatusEEnum, 
		   source, 
		   new String[] {
			 "originalName", "Room Status"
		   });	
		addAnnotation
		  (cleaningStatusEEnum, 
		   source, 
		   new String[] {
			 "originalName", "Cleaning Status"
		   });	
		addAnnotation
		  ((EEnumLiteral)cleaningStatusEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "Checked Out"
		   });	
		addAnnotation
		  (roomTypeEClass, 
		   source, 
		   new String[] {
			 "originalName", "Room Type"
		   });	
		addAnnotation
		  (billingInformationEClass, 
		   source, 
		   new String[] {
			 "originalName", "Billing Information"
		   });	
		addAnnotation
		  (paymentStrategyEClass, 
		   source, 
		   new String[] {
			 "originalName", "Payment Strategy"
		   });	
		addAnnotation
		  (roomBookingEClass, 
		   source, 
		   new String[] {
			 "originalName", "Room Booking"
		   });	
		addAnnotation
		  (eventBookingEClass, 
		   source, 
		   new String[] {
			 "originalName", "Event Booking"
		   });	
		addAnnotation
		  (individualCustomerEClass, 
		   source, 
		   new String[] {
			 "originalName", "Individual Customer"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //ClassDiagramPackageImpl
