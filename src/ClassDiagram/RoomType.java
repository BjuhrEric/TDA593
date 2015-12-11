/**
 */
package ClassDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.RoomType#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.RoomType#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.RoomType#getGuestCapacity <em>Guest Capacity</em>}</li>
 *   <li>{@link ClassDiagram.RoomType#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link ClassDiagram.RoomType#getNumberOfExtraBeds <em>Number Of Extra Beds</em>}</li>
 *   <li>{@link ClassDiagram.RoomType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends Cost {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getRoomType_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getRoomType_Price()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Returns the value of the '<em><b>Guest Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Capacity</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getRoomType_GuestCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	int getGuestCapacity();

	/**
	 * Returns the value of the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Beds</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getRoomType_NumberOfBeds()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	int getNumberOfBeds();

	/**
	 * Returns the value of the '<em><b>Number Of Extra Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Extra Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Extra Beds</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getRoomType_NumberOfExtraBeds()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	int getNumberOfExtraBeds();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getRoomType_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getDescription();

} // RoomType
