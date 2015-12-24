/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.RoomType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.RoomTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomTypeImpl#getGuestCapacity <em>Guest Capacity</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomTypeImpl#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomTypeImpl#getNumberOfExtraBeds <em>Number Of Extra Beds</em>}</li>
 *   <li>{@link ClassDiagram.impl.RoomTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestCapacity() <em>Guest Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int GUEST_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGuestCapacity() <em>Guest Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestCapacity()
	 * @generated
	 * @ordered
	 */
	protected int guestCapacity = GUEST_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBeds = NUMBER_OF_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfExtraBeds() <em>Number Of Extra Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtraBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_EXTRA_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfExtraBeds() <em>Number Of Extra Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtraBeds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfExtraBeds = NUMBER_OF_EXTRA_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM_TYPE;
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
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGuestCapacity() {
		return guestCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfExtraBeds() {
		return numberOfExtraBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @generated NOT
	 */
	public void setName(String value) {
		name = value;
	}
	
	/**
	 * @generated NOT
	 */
	public void setPrice(double value) {
		price = value;
	}
	
	/**
	 * @generated NOT
	 */
	public void setGuestCapacity(int value) {
		guestCapacity = value;
	}
	
	/**
	 * @generated NOT
	 */
	public void setNumberOfBeds(int value) {
		numberOfBeds = value;
	}
	
	/**
	 * @generated NOT
	 */
	public void setNumberOfExtraBeds(int value) {
		numberOfExtraBeds = value;
	}
	
	/**
	 * @generated NOT
	 */
	public void setDescription(String value) {
		description = value;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_TYPE__NAME:
				return getName();
			case ClassDiagramPackage.ROOM_TYPE__PRICE:
				return getPrice();
			case ClassDiagramPackage.ROOM_TYPE__GUEST_CAPACITY:
				return getGuestCapacity();
			case ClassDiagramPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				return getNumberOfBeds();
			case ClassDiagramPackage.ROOM_TYPE__NUMBER_OF_EXTRA_BEDS:
				return getNumberOfExtraBeds();
			case ClassDiagramPackage.ROOM_TYPE__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case ClassDiagramPackage.ROOM_TYPE__GUEST_CAPACITY:
				return guestCapacity != GUEST_CAPACITY_EDEFAULT;
			case ClassDiagramPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				return numberOfBeds != NUMBER_OF_BEDS_EDEFAULT;
			case ClassDiagramPackage.ROOM_TYPE__NUMBER_OF_EXTRA_BEDS:
				return numberOfExtraBeds != NUMBER_OF_EXTRA_BEDS_EDEFAULT;
			case ClassDiagramPackage.ROOM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
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
		result.append(", price: ");
		result.append(price);
		result.append(", guestCapacity: ");
		result.append(guestCapacity);
		result.append(", numberOfBeds: ");
		result.append(numberOfBeds);
		result.append(", numberOfExtraBeds: ");
		result.append(numberOfExtraBeds);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
