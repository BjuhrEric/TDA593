/**
 */
package ClassDiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guest Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage#getGuestStatus()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guest Status'"
 * @generated
 */
public enum GuestStatus implements Enumerator
{
	/**
	 * The '<em><b>Checked In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKED_IN(0, "CheckedIn", "CheckedIn"),
	/**
	 * The '<em><b>Checked Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKED_OUT(1, "CheckedOut", "CheckedOut"),
	/**
	 * The '<em><b>Not In Hotel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_IN_HOTEL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IN_HOTEL(2, "NotInHotel", "NotInHotel"),
	/**
	 * The '<em><b>Not Arrived Yet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ARRIVED_YET_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ARRIVED_YET(3, "NotArrivedYet", "NotArrivedYet");
	/**
	 * The '<em><b>Checked In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checked In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN
	 * @model name="CheckedIn"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_IN_VALUE = 0;

	/**
	 * The '<em><b>Checked Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checked Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT
	 * @model name="CheckedOut"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_OUT_VALUE = 1;

	/**
	 * The '<em><b>Not In Hotel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not In Hotel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_IN_HOTEL
	 * @model name="NotInHotel"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IN_HOTEL_VALUE = 2;

	/**
	 * The '<em><b>Not Arrived Yet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Arrived Yet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ARRIVED_YET
	 * @model name="NotArrivedYet"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ARRIVED_YET_VALUE = 3;

	/**
	 * An array of all the '<em><b>Guest Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuestStatus[] VALUES_ARRAY =
		new GuestStatus[] {
			CHECKED_IN,
			CHECKED_OUT,
			NOT_IN_HOTEL,
			NOT_ARRIVED_YET,
		};

	/**
	 * A public read-only list of all the '<em><b>Guest Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuestStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case CHECKED_IN_VALUE: return CHECKED_IN;
			case CHECKED_OUT_VALUE: return CHECKED_OUT;
			case NOT_IN_HOTEL_VALUE: return NOT_IN_HOTEL;
			case NOT_ARRIVED_YET_VALUE: return NOT_ARRIVED_YET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GuestStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
