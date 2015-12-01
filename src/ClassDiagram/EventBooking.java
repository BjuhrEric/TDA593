/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.EventBooking#getBill <em>Bill</em>}</li>
 *   <li>{@link ClassDiagram.EventBooking#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ClassDiagram.EventBooking#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getEventBooking()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Event Booking'"
 * @generated
 */
public interface EventBooking extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see ClassDiagram.ClassDiagramPackage#getEventBooking_Bill()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	Bill getBill();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getEventBooking_StartTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link ClassDiagram.EventBooking#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getEventBooking_EndTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link ClassDiagram.EventBooking#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generatePDF();

} // EventBooking
