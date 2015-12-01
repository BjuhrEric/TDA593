/**
 */
package ClassDiagram;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Event#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.Event#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.Event#getResponsibleEntity <em>Responsible Entity</em>}</li>
 *   <li>{@link ClassDiagram.Event#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link ClassDiagram.Event#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ClassDiagram.Event#getEndTime <em>End Time</em>}</li>
 *   <li>{@link ClassDiagram.Event#getVenue <em>Venue</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Cost {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_Name()
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
	 * @see #setPrice(double)
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_Price()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsible Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Entity</em>' attribute.
	 * @see #setResponsibleEntity(String)
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_ResponsibleEntity()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResponsibleEntity();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getResponsibleEntity <em>Responsible Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Entity</em>' attribute.
	 * @see #getResponsibleEntity()
	 * @generated
	 */
	void setResponsibleEntity(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Guests</em>' attribute.
	 * @see #setNumberOfGuests(int)
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_NumberOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_StartTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_EndTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Venue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Venue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue</em>' reference.
	 * @see #setVenue(Venue)
	 * @see ClassDiagram.ClassDiagramPackage#getEvent_Venue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Venue getVenue();

	/**
	 * Sets the value of the '{@link ClassDiagram.Event#getVenue <em>Venue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue</em>' reference.
	 * @see #getVenue()
	 * @generated
	 */
	void setVenue(Venue value);

} // Event
