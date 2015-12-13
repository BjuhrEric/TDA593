/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Payment#getBill <em>Bill</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see #setBill(Bill)
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Bill()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill getBill();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getBill <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' reference.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(Bill value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paymentMany="true" paymentOrdered="false"
	 * @generated
	 */
	void merge(EList<Payment> payment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" costMany="true" costOrdered="false"
	 * @generated
	 */
	Payment split(EList<Cost> cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model infoRequired="true" infoOrdered="false"
	 * @generated
	 */
	void performPayment(BillingInformation info);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReceipt();

} // Payment
