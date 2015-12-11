/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Room#getGuests <em>Guests</em>}</li>
 *   <li>{@link ClassDiagram.Room#getRoomStatus <em>Room Status</em>}</li>
 *   <li>{@link ClassDiagram.Room#getCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link ClassDiagram.Room#getBill <em>Bill</em>}</li>
 *   <li>{@link ClassDiagram.Room#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_Guests()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Guest> getGuests();

	/**
	 * Returns the value of the '<em><b>Room Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ClassDiagram.RoomStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Status</em>' attribute.
	 * @see ClassDiagram.RoomStatus
	 * @see #setRoomStatus(RoomStatus)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomStatus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomStatus getRoomStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room#getRoomStatus <em>Room Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Status</em>' attribute.
	 * @see ClassDiagram.RoomStatus
	 * @see #getRoomStatus()
	 * @generated
	 */
	void setRoomStatus(RoomStatus value);

	/**
	 * Returns the value of the '<em><b>Cleaning Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ClassDiagram.CleaningStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleaning Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleaning Status</em>' attribute.
	 * @see ClassDiagram.CleaningStatus
	 * @see #setCleaningStatus(CleaningStatus)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_CleaningStatus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CleaningStatus getCleaningStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room#getCleaningStatus <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleaning Status</em>' attribute.
	 * @see ClassDiagram.CleaningStatus
	 * @see #getCleaningStatus()
	 * @generated
	 */
	void setCleaningStatus(CleaningStatus value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see #setBill(Bill)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_Bill()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill getBill();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room#getBill <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' reference.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(Bill value);

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkOut();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void addGuest(Guest guest);

} // Room
