/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Bill#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' reference.
	 * @see #setCost(Cost)
	 * @see ClassDiagram.ClassDiagramPackage#getBill_Cost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Cost getCost();

	/**
	 * Sets the value of the '{@link ClassDiagram.Bill#getCost <em>Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Cost value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costMany="true" costOrdered="false"
	 * @generated
	 */
	void addCost(EList<Cost> cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costRequired="true" costOrdered="false"
	 * @generated
	 */
	void removeCost(Cost cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Bill> split();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billRequired="true" billOrdered="false"
	 * @generated
	 */
	void merge(Bill bill);

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

} // Bill
