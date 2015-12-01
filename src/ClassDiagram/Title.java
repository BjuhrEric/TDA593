/**
 */
package ClassDiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Title</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage#getTitle()
 * @model
 * @generated
 */
public final class Title extends AbstractEnumerator {
	/**
	 * The '<em><b>Mr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MR_LITERAL
	 * @model name="Mr"
	 * @generated
	 * @ordered
	 */
	public static final int MR = 0;

	/**
	 * The '<em><b>Mrs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mrs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MRS_LITERAL
	 * @model name="Mrs"
	 * @generated
	 * @ordered
	 */
	public static final int MRS = 1;

	/**
	 * The '<em><b>Ms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ms</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MS_LITERAL
	 * @model name="Ms"
	 * @generated
	 * @ordered
	 */
	public static final int MS = 2;

	/**
	 * The '<em><b>Sir</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sir</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIR_LITERAL
	 * @model name="Sir"
	 * @generated
	 * @ordered
	 */
	public static final int SIR = 3;

	/**
	 * The '<em><b>Dr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DR_LITERAL
	 * @model name="Dr"
	 * @generated
	 * @ordered
	 */
	public static final int DR = 4;

	/**
	 * The '<em><b>Mdm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mdm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MDM_LITERAL
	 * @model name="Mdm"
	 * @generated
	 * @ordered
	 */
	public static final int MDM = 5;

	/**
	 * The '<em><b>Mr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR
	 * @generated
	 * @ordered
	 */
	public static final Title MR_LITERAL = new Title(MR, "Mr", "Mr");

	/**
	 * The '<em><b>Mrs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MRS
	 * @generated
	 * @ordered
	 */
	public static final Title MRS_LITERAL = new Title(MRS, "Mrs", "Mrs");

	/**
	 * The '<em><b>Ms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS
	 * @generated
	 * @ordered
	 */
	public static final Title MS_LITERAL = new Title(MS, "Ms", "Ms");

	/**
	 * The '<em><b>Sir</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIR
	 * @generated
	 * @ordered
	 */
	public static final Title SIR_LITERAL = new Title(SIR, "Sir", "Sir");

	/**
	 * The '<em><b>Dr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DR
	 * @generated
	 * @ordered
	 */
	public static final Title DR_LITERAL = new Title(DR, "Dr", "Dr");

	/**
	 * The '<em><b>Mdm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDM
	 * @generated
	 * @ordered
	 */
	public static final Title MDM_LITERAL = new Title(MDM, "Mdm", "Mdm");

	/**
	 * An array of all the '<em><b>Title</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Title[] VALUES_ARRAY =
		new Title[] {
			MR_LITERAL,
			MRS_LITERAL,
			MS_LITERAL,
			SIR_LITERAL,
			DR_LITERAL,
			MDM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Title</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Title result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Title result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title get(int value) {
		switch (value) {
			case MR: return MR_LITERAL;
			case MRS: return MRS_LITERAL;
			case MS: return MS_LITERAL;
			case SIR: return SIR_LITERAL;
			case DR: return DR_LITERAL;
			case MDM: return MDM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Title(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Title
