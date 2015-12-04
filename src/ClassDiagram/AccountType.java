/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.AccountType#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAccountType()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Account Type'"
 * @generated
 */
public interface AccountType extends EObject {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute list.
	 * The list contents are of type {@link ClassDiagram.Permission}.
	 * The literals are from the enumeration {@link ClassDiagram.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute list.
	 * @see ClassDiagram.Permission
	 * @see ClassDiagram.ClassDiagramPackage#getAccountType_Permission()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Permission> getPermission();

} // AccountType
