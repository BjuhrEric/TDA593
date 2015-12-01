/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Person#getFirstNames <em>First Names</em>}</li>
 *   <li>{@link ClassDiagram.Person#getFamilyNames <em>Family Names</em>}</li>
 *   <li>{@link ClassDiagram.Person#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Names</em>' attribute list.
	 * @see ClassDiagram.ClassDiagramPackage#getPerson_FirstNames()
	 * @model dataType="org.eclipse.uml2.types.String" changeable="false" ordered="false"
	 * @generated
	 */
	EList getFirstNames();

	/**
	 * Returns the value of the '<em><b>Family Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Names</em>' attribute list.
	 * @see ClassDiagram.ClassDiagramPackage#getPerson_FamilyNames()
	 * @model dataType="org.eclipse.uml2.types.String" changeable="false" ordered="false"
	 * @generated
	 */
	EList getFamilyNames();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The literals are from the enumeration {@link ClassDiagram.Title}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see ClassDiagram.Title
	 * @see #setTitle(Title)
	 * @see ClassDiagram.ClassDiagramPackage#getPerson_Title()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Title getTitle();

	/**
	 * Sets the value of the '{@link ClassDiagram.Person#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see ClassDiagram.Title
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Title value);

} // Person
