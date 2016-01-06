/**
 */
package ClassDiagram.impl;

import ClassDiagram.Bill;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Cost;
import MockDatabase.BillsMock;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.BillImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ClassDiagram.impl.BillImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected EList<Cost> cost;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;
	
	private BillsMock billsMock = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BillImpl() {
		super();
		cost = new EObjectResolvingEList<Cost>(Cost.class, this, ClassDiagramPackage.BILL__COST);
		id = UUID.randomUUID().getLeastSignificantBits();
		billsMock = BillsMock.getInstance();
		//Add this bill to database
		billsMock.saveBill(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cost> getCost() {
		if (cost == null) {
			cost = new EObjectResolvingEList<Cost>(Cost.class, this, ClassDiagramPackage.BILL__COST);
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setId(long newId) {
		//You probably dont want to do this since the bill is stored in the "database" but if you insist..
		billsMock.removeBill(this);
		long oldId = id;
		id = newId;
		billsMock.saveBill(this);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BILL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addCost(Cost cost) {
		billsMock.removeBill(this);
		if (this.cost == null) {
			this.cost = new EObjectResolvingEList<Cost>(Cost.class, this, ClassDiagramPackage.BILL__COST);
		}
		this.cost.add(cost);
		billsMock.saveBill(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeCost(Cost cost) {
		billsMock.removeBill(this);
		this.cost.remove(cost);
		billsMock.saveBill(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * @returns Null if failed to remove bill (this bill did not exist in the database), 'this' if all went well
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill remove() {
		if(billsMock.removeBill(this)){
			return this;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BILL__COST:
				return getCost();
			case ClassDiagramPackage.BILL__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.BILL__COST:
				getCost().clear();
				getCost().addAll((Collection<? extends Cost>)newValue);
				return;
			case ClassDiagramPackage.BILL__ID:
				setId((Long)newValue);
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
			case ClassDiagramPackage.BILL__COST:
				getCost().clear();
				return;
			case ClassDiagramPackage.BILL__ID:
				setId(ID_EDEFAULT);
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
			case ClassDiagramPackage.BILL__COST:
				return cost != null && !cost.isEmpty();
			case ClassDiagramPackage.BILL__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.BILL___ADD_COST__COST:
				addCost((Cost)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL___REMOVE_COST__COST:
				removeCost((Cost)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL___REMOVE:
				return remove();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BillImpl
