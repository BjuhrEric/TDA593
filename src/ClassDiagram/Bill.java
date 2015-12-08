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
	 * Returns the value of the '<em><b>Cost</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Cost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getBill_Cost()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Cost> getCost();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costRequired="true" costOrdered="false"
	 * @generated
	 */
	void addCost(Cost cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costRequired="true" costOrdered="false"
	 * @generated
	 */
	void removeCost(Cost cost);

} // Bill
