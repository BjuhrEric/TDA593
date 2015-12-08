/**
 */
package ClassDiagram.impl;

import ClassDiagram.Account;
import ClassDiagram.AccountType;
import ClassDiagram.Bill;
import ClassDiagram.BookingSchedule;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.CleaningStatus;
import ClassDiagram.Event;
import ClassDiagram.EventBooking;
import ClassDiagram.FloorMap;
import ClassDiagram.Guest;
import ClassDiagram.GuestStatus;
import ClassDiagram.IndividualCustomer;
import ClassDiagram.Item;
import ClassDiagram.Organization;
import ClassDiagram.Payment;
import ClassDiagram.Permission;
import ClassDiagram.Person;
import ClassDiagram.Room;
import ClassDiagram.RoomBooking;
import ClassDiagram.RoomStatus;
import ClassDiagram.RoomType;
import ClassDiagram.Title;
import ClassDiagram.Venue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagramFactoryImpl extends EFactoryImpl implements ClassDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassDiagramFactory init() {
		try {
			ClassDiagramFactory theClassDiagramFactory = (ClassDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ClassDiagramPackage.eNS_URI);
			if (theClassDiagramFactory != null) {
				return theClassDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassDiagramPackage.ROOM: return createRoom();
			case ClassDiagramPackage.GUEST: return createGuest();
			case ClassDiagramPackage.PERSON: return createPerson();
			case ClassDiagramPackage.ROOM_TYPE: return createRoomType();
			case ClassDiagramPackage.BILL: return createBill();
			case ClassDiagramPackage.ROOM_BOOKING: return createRoomBooking();
			case ClassDiagramPackage.ITEM: return createItem();
			case ClassDiagramPackage.EVENT: return createEvent();
			case ClassDiagramPackage.VENUE: return createVenue();
			case ClassDiagramPackage.PACKAGE: return createPackage();
			case ClassDiagramPackage.EVENT_BOOKING: return createEventBooking();
			case ClassDiagramPackage.ACCOUNT: return createAccount();
			case ClassDiagramPackage.ACCOUNT_TYPE: return createAccountType();
			case ClassDiagramPackage.ORGANIZATION: return createOrganization();
			case ClassDiagramPackage.INDIVIDUAL_CUSTOMER: return createIndividualCustomer();
			case ClassDiagramPackage.BOOKING_SCHEDULE: return createBookingSchedule();
			case ClassDiagramPackage.FLOOR_MAP: return createFloorMap();
			case ClassDiagramPackage.PAYMENT: return createPayment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClassDiagramPackage.TITLE:
				return createTitleFromString(eDataType, initialValue);
			case ClassDiagramPackage.GUEST_STATUS:
				return createGuestStatusFromString(eDataType, initialValue);
			case ClassDiagramPackage.ROOM_STATUS:
				return createRoomStatusFromString(eDataType, initialValue);
			case ClassDiagramPackage.CLEANING_STATUS:
				return createCleaningStatusFromString(eDataType, initialValue);
			case ClassDiagramPackage.PERMISSION:
				return createPermissionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClassDiagramPackage.TITLE:
				return convertTitleToString(eDataType, instanceValue);
			case ClassDiagramPackage.GUEST_STATUS:
				return convertGuestStatusToString(eDataType, instanceValue);
			case ClassDiagramPackage.ROOM_STATUS:
				return convertRoomStatusToString(eDataType, instanceValue);
			case ClassDiagramPackage.CLEANING_STATUS:
				return convertCleaningStatusToString(eDataType, instanceValue);
			case ClassDiagramPackage.PERMISSION:
				return convertPermissionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking createRoomBooking() {
		RoomBookingImpl roomBooking = new RoomBookingImpl();
		return roomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue createVenue() {
		VenueImpl venue = new VenueImpl();
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBooking createEventBooking() {
		EventBookingImpl eventBooking = new EventBookingImpl();
		return eventBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountType createAccountType() {
		AccountTypeImpl accountType = new AccountTypeImpl();
		return accountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualCustomer createIndividualCustomer() {
		IndividualCustomerImpl individualCustomer = new IndividualCustomerImpl();
		return individualCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingSchedule createBookingSchedule() {
		BookingScheduleImpl bookingSchedule = new BookingScheduleImpl();
		return bookingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorMap createFloorMap() {
		FloorMapImpl floorMap = new FloorMapImpl();
		return floorMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitleFromString(EDataType eDataType, String initialValue) {
		Title result = Title.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestStatus createGuestStatusFromString(EDataType eDataType, String initialValue) {
		GuestStatus result = GuestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatus createRoomStatusFromString(EDataType eDataType, String initialValue) {
		RoomStatus result = RoomStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleaningStatus createCleaningStatusFromString(EDataType eDataType, String initialValue) {
		CleaningStatus result = CleaningStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCleaningStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermissionFromString(EDataType eDataType, String initialValue) {
		Permission result = Permission.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramPackage getClassDiagramPackage() {
		return (ClassDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassDiagramPackage getPackage() {
		return ClassDiagramPackage.eINSTANCE;
	}

} //ClassDiagramFactoryImpl
