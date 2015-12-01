/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getBillingInformation()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Billing Information'"
 * @generated
 */
public interface BillingInformation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean validate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	PaymentStrategy getPaymentStrategy();

} // BillingInformation
