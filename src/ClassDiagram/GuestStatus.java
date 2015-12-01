/**
 */
package ClassDiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guest Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage#getGuestStatus()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guest Status'"
 * @generated
 */
public final class GuestStatus extends AbstractEnumerator {
	/**
	 * The '<em><b>Checked In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checked In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN_LITERAL
	 * @model name="CheckedIn"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_IN = 0;

	/**
	 * The '<em><b>Checked Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checked Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT_LITERAL
	 * @model name="CheckedOut"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_OUT = 1;

	/**
	 * The '<em><b>Not In Hotel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not In Hotel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_IN_HOTEL_LITERAL
	 * @model name="NotInHotel"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IN_HOTEL = 2;

	/**
	 * The '<em><b>Not Arrived Yet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Arrived Yet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ARRIVED_YET_LITERAL
	 * @model name="NotArrivedYet"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ARRIVED_YET = 3;

	/**
	 * The '<em><b>Checked In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN
	 * @generated
	 * @ordered
	 */
	public static final GuestStatus CHECKED_IN_LITERAL = new GuestStatus(CHECKED_IN, "CheckedIn", "CheckedIn");

	/**
	 * The '<em><b>Checked Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT
	 * @generated
	 * @ordered
	 */
	public static final GuestStatus CHECKED_OUT_LITERAL = new GuestStatus(CHECKED_OUT, "CheckedOut", "CheckedOut");

	/**
	 * The '<em><b>Not In Hotel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_IN_HOTEL
	 * @generated
	 * @ordered
	 */
	public static final GuestStatus NOT_IN_HOTEL_LITERAL = new GuestStatus(NOT_IN_HOTEL, "NotInHotel", "NotInHotel");

	/**
	 * The '<em><b>Not Arrived Yet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ARRIVED_YET
	 * @generated
	 * @ordered
	 */
	public static final GuestStatus NOT_ARRIVED_YET_LITERAL = new GuestStatus(NOT_ARRIVED_YET, "NotArrivedYet", "NotArrivedYet");

	/**
	 * An array of all the '<em><b>Guest Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuestStatus[] VALUES_ARRAY =
		new GuestStatus[] {
			CHECKED_IN_LITERAL,
			CHECKED_OUT_LITERAL,
			NOT_IN_HOTEL_LITERAL,
			NOT_ARRIVED_YET_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Guest Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guest Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuestStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuestStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guest Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuestStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuestStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guest Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuestStatus get(int value) {
		switch (value) {
			case CHECKED_IN: return CHECKED_IN_LITERAL;
			case CHECKED_OUT: return CHECKED_OUT_LITERAL;
			case NOT_IN_HOTEL: return NOT_IN_HOTEL_LITERAL;
			case NOT_ARRIVED_YET: return NOT_ARRIVED_YET_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GuestStatus(int value, String name, String literal) {
		super(value, name, literal);
	}

} //GuestStatus
