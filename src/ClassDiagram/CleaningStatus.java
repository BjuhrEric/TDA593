/**
 */
package ClassDiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cleaning Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage#getCleaningStatus()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Cleaning Status'"
 * @generated
 */
public final class CleaningStatus extends AbstractEnumerator {
	/**
	 * The '<em><b>Clean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEAN_LITERAL
	 * @model name="Clean"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAN = 0;

	/**
	 * The '<em><b>Dirty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dirty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRTY_LITERAL
	 * @model name="Dirty"
	 * @generated
	 * @ordered
	 */
	public static final int DIRTY = 1;

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
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Checked Out'"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_OUT = 2;

	/**
	 * The '<em><b>Clean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAN
	 * @generated
	 * @ordered
	 */
	public static final CleaningStatus CLEAN_LITERAL = new CleaningStatus(CLEAN, "Clean", "Clean");

	/**
	 * The '<em><b>Dirty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRTY
	 * @generated
	 * @ordered
	 */
	public static final CleaningStatus DIRTY_LITERAL = new CleaningStatus(DIRTY, "Dirty", "Dirty");

	/**
	 * The '<em><b>Checked Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT
	 * @generated
	 * @ordered
	 */
	public static final CleaningStatus CHECKED_OUT_LITERAL = new CleaningStatus(CHECKED_OUT, "CheckedOut", "CheckedOut");

	/**
	 * An array of all the '<em><b>Cleaning Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CleaningStatus[] VALUES_ARRAY =
		new CleaningStatus[] {
			CLEAN_LITERAL,
			DIRTY_LITERAL,
			CHECKED_OUT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cleaning Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cleaning Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CleaningStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CleaningStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cleaning Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CleaningStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CleaningStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cleaning Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CleaningStatus get(int value) {
		switch (value) {
			case CLEAN: return CLEAN_LITERAL;
			case DIRTY: return DIRTY_LITERAL;
			case CHECKED_OUT: return CHECKED_OUT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CleaningStatus(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CleaningStatus
