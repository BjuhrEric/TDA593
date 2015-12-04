/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Event;
import ClassDiagram.Venue;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getResponsibleEntity <em>Responsible Entity</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link ClassDiagram.impl.EventImpl#getVenue <em>Venue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
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
	 * The default value of the '{@link #getResponsibleEntity() <em>Responsible Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibleEntity() <em>Responsible Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleEntity()
	 * @generated
	 * @ordered
	 */
	protected String responsibleEntity = RESPONSIBLE_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVenue() <em>Venue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected Venue venue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.EVENT;
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
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__PRICE, oldPrice, price));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibleEntity() {
		return responsibleEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleEntity(String newResponsibleEntity) {
		String oldResponsibleEntity = responsibleEntity;
		responsibleEntity = newResponsibleEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__RESPONSIBLE_ENTITY, oldResponsibleEntity, responsibleEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfGuests(int newNumberOfGuests) {
		int oldNumberOfGuests = numberOfGuests;
		numberOfGuests = newNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__NUMBER_OF_GUESTS, oldNumberOfGuests, numberOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue getVenue() {
		if (venue != null && venue.eIsProxy()) {
			InternalEObject oldVenue = (InternalEObject)venue;
			venue = (Venue)eResolveProxy(oldVenue);
			if (venue != oldVenue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.EVENT__VENUE, oldVenue, venue));
			}
		}
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue basicGetVenue() {
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVenue(Venue newVenue) {
		Venue oldVenue = venue;
		venue = newVenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EVENT__VENUE, oldVenue, venue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.EVENT__NAME:
				return getName();
			case ClassDiagramPackage.EVENT__PRICE:
				return getPrice();
			case ClassDiagramPackage.EVENT__DESCRIPTION:
				return getDescription();
			case ClassDiagramPackage.EVENT__RESPONSIBLE_ENTITY:
				return getResponsibleEntity();
			case ClassDiagramPackage.EVENT__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ClassDiagramPackage.EVENT__START_TIME:
				return getStartTime();
			case ClassDiagramPackage.EVENT__END_TIME:
				return getEndTime();
			case ClassDiagramPackage.EVENT__VENUE:
				if (resolve) return getVenue();
				return basicGetVenue();
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
			case ClassDiagramPackage.EVENT__PRICE:
				setPrice((Double)newValue);
				return;
			case ClassDiagramPackage.EVENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ClassDiagramPackage.EVENT__RESPONSIBLE_ENTITY:
				setResponsibleEntity((String)newValue);
				return;
			case ClassDiagramPackage.EVENT__NUMBER_OF_GUESTS:
				setNumberOfGuests((Integer)newValue);
				return;
			case ClassDiagramPackage.EVENT__START_TIME:
				setStartTime((Date)newValue);
				return;
			case ClassDiagramPackage.EVENT__END_TIME:
				setEndTime((Date)newValue);
				return;
			case ClassDiagramPackage.EVENT__VENUE:
				setVenue((Venue)newValue);
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
			case ClassDiagramPackage.EVENT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ClassDiagramPackage.EVENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ClassDiagramPackage.EVENT__RESPONSIBLE_ENTITY:
				setResponsibleEntity(RESPONSIBLE_ENTITY_EDEFAULT);
				return;
			case ClassDiagramPackage.EVENT__NUMBER_OF_GUESTS:
				setNumberOfGuests(NUMBER_OF_GUESTS_EDEFAULT);
				return;
			case ClassDiagramPackage.EVENT__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case ClassDiagramPackage.EVENT__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case ClassDiagramPackage.EVENT__VENUE:
				setVenue((Venue)null);
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
			case ClassDiagramPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.EVENT__PRICE:
				return price != PRICE_EDEFAULT;
			case ClassDiagramPackage.EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ClassDiagramPackage.EVENT__RESPONSIBLE_ENTITY:
				return RESPONSIBLE_ENTITY_EDEFAULT == null ? responsibleEntity != null : !RESPONSIBLE_ENTITY_EDEFAULT.equals(responsibleEntity);
			case ClassDiagramPackage.EVENT__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
			case ClassDiagramPackage.EVENT__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case ClassDiagramPackage.EVENT__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case ClassDiagramPackage.EVENT__VENUE:
				return venue != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", responsibleEntity: ");
		result.append(responsibleEntity);
		result.append(", numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //EventImpl
