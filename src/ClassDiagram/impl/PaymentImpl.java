/**
 */
package ClassDiagram.impl;

import ClassDiagram.Bill;
import ClassDiagram.BillingInformation;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Cost;
import ClassDiagram.Payment;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getBill <em>Bill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected Bill bill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}
	protected PaymentImpl(Bill bill){
		this.bill = bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill() {
		if (bill != null && bill.eIsProxy()) {
			InternalEObject oldBill = (InternalEObject)bill;
			bill = (Bill)eResolveProxy(oldBill);
			if (bill != oldBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.PAYMENT__BILL, oldBill, bill));
			}
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill(Bill newBill) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__BILL, oldBill, bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void merge(EList<Payment> payment) {
		for(Payment e : payment){
			EList<Cost> costs = e.getBill().getCost();
			for(Cost c : costs){
				bill.addCost(c);
			}
			e.getBill().remove();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Payment split(EList<Cost> costs) {
		Payment p = ClassDiagramFactoryImpl.eINSTANCE.createPayment();
		Bill b = ClassDiagramFactoryImpl.eINSTANCE.createBill();
		for (Cost c : costs) {
			if (bill.getCost().contains(c)) {
				b.addCost(c);
				bill.removeCost(c);
			}
		}
		
		p.setBill(b);
		return p;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void performPayment(BillingInformation info) {
		info.getPaymentStrategy().pay(bill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void printReceipt() {
		System.out.println();
		System.out.println("Receipt:");
		bill.getCost().forEach((cost) -> System.out.println(cost)); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.PAYMENT__BILL:
				if (resolve) return getBill();
				return basicGetBill();
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
			case ClassDiagramPackage.PAYMENT__BILL:
				setBill((Bill)newValue);
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
			case ClassDiagramPackage.PAYMENT__BILL:
				setBill((Bill)null);
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
			case ClassDiagramPackage.PAYMENT__BILL:
				return bill != null;
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
			case ClassDiagramPackage.PAYMENT___MERGE__ELIST:
				merge((EList<Payment>)arguments.get(0));
				return null;
			case ClassDiagramPackage.PAYMENT___SPLIT__ELIST:
				return split((EList<Cost>)arguments.get(0));
			case ClassDiagramPackage.PAYMENT___PERFORM_PAYMENT__BILLINGINFORMATION:
				performPayment((BillingInformation)arguments.get(0));
				return null;
			case ClassDiagramPackage.PAYMENT___PRINT_RECEIPT:
				printReceipt();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentImpl
