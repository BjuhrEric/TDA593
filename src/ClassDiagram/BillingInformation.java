/**
 */
package ClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getBillingInformation()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Billing Information'"
 * @generated NOT
 */
public interface BillingInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean validate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated NOT
	 */
	PaymentStrategy getPaymentStrategy();

} // BillingInformation
