/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.FloorMap#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getFloorMap()
 * @model
 * @generated
 */
public interface FloorMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getFloorMap_Room()
	 * @model type="ClassDiagram.Room" ordered="false"
	 * @generated
	 */
	EList getRoom();

} // FloorMap
