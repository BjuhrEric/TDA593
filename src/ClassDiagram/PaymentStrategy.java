/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getPaymentStrategy()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Payment Strategy'"
 * @generated
 */
public interface PaymentStrategy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billRequired="true" billOrdered="false"
	 * @generated
	 */
	void pay(Bill bill);

} // PaymentStrategy
