/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Venue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Venue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.VenueImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.VenueImpl#getGuestCapacity <em>Guest Capacity</em>}</li>
 *   <li>{@link ClassDiagram.impl.VenueImpl#getEventCapacity <em>Event Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VenueImpl extends MinimalEObjectImpl.Container implements Venue {
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
	 * The default value of the '{@link #getEventCapacity() <em>Event Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventCapacity() <em>Event Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCapacity()
	 * @generated
	 * @ordered
	 */
	protected int eventCapacity = EVENT_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.VENUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.VENUE__NAME, oldName, name));
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
	public void setGuestCapacity(int newGuestCapacity) {
		int oldGuestCapacity = guestCapacity;
		guestCapacity = newGuestCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.VENUE__GUEST_CAPACITY, oldGuestCapacity, guestCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventCapacity() {
		return eventCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventCapacity(int newEventCapacity) {
		int oldEventCapacity = eventCapacity;
		eventCapacity = newEventCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.VENUE__EVENT_CAPACITY, oldEventCapacity, eventCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.VENUE__NAME:
				return getName();
			case ClassDiagramPackage.VENUE__GUEST_CAPACITY:
				return getGuestCapacity();
			case ClassDiagramPackage.VENUE__EVENT_CAPACITY:
				return getEventCapacity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.VENUE__NAME:
				setName((String)newValue);
				return;
			case ClassDiagramPackage.VENUE__GUEST_CAPACITY:
				setGuestCapacity((Integer)newValue);
				return;
			case ClassDiagramPackage.VENUE__EVENT_CAPACITY:
				setEventCapacity((Integer)newValue);
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
			case ClassDiagramPackage.VENUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.VENUE__GUEST_CAPACITY:
				setGuestCapacity(GUEST_CAPACITY_EDEFAULT);
				return;
			case ClassDiagramPackage.VENUE__EVENT_CAPACITY:
				setEventCapacity(EVENT_CAPACITY_EDEFAULT);
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
			case ClassDiagramPackage.VENUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.VENUE__GUEST_CAPACITY:
				return guestCapacity != GUEST_CAPACITY_EDEFAULT;
			case ClassDiagramPackage.VENUE__EVENT_CAPACITY:
				return eventCapacity != EVENT_CAPACITY_EDEFAULT;
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
		result.append(", guestCapacity: ");
		result.append(guestCapacity);
		result.append(", eventCapacity: ");
		result.append(eventCapacity);
		result.append(')');
		return result.toString();
	}

} //VenueImpl
