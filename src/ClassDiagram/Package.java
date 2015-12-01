/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Package#getEvent <em>Event</em>}</li>
 *   <li>{@link ClassDiagram.Package#getCode <em>Code</em>}</li>
 *   <li>{@link ClassDiagram.Package#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getPackage_Event()
	 * @model type="ClassDiagram.Event" ordered="false"
	 * @generated
	 */
	EList getEvent();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ClassDiagram.ClassDiagramPackage#getPackage_Code()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ClassDiagram.Package#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getPackage_Item()
	 * @model type="ClassDiagram.Item" ordered="false"
	 * @generated
	 */
	EList getItem();

} // Package
