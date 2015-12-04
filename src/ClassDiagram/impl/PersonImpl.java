/**
 */
package ClassDiagram.impl;

import ClassDiagram.Person;
import ClassDiagram.Title;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.PersonImpl#getFirstNames <em>First Names</em>}</li>
 *   <li>{@link ClassDiagram.impl.PersonImpl#getFamilyNames <em>Family Names</em>}</li>
 *   <li>{@link ClassDiagram.impl.PersonImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class PersonImpl implements Person {
	/**
	 * The cached value of the '{@link #getFirstNames() <em>First Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNames()
	 * @generated NOT
	 * @ordered
	 */
	protected List<String> firstNames;

	/**
	 * The cached value of the '{@link #getFamilyNames() <em>Family Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyNames()
	 * @generated NOT
	 * @ordered
	 */
	protected List<String> familyNames;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Title TITLE_DEFAULT = Title.MR;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Title title = TITLE_DEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	public void addFamilyName(String name) {
		if (familyNames == null) {
			familyNames = new ArrayList<>();
		}
		familyNames.add(name);
	}
	
	public void addFirstName(String name) {
		if (firstNames == null) {
			firstNames = new ArrayList<>();
		}
		firstNames.add(name);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getFirstNames() {
		if (firstNames == null) {
			firstNames = new ArrayList<>();
		}
		return new ArrayList<>(firstNames);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getFamilyNames() {
		if (familyNames == null) {
			familyNames = new ArrayList<>();
		}
		return new ArrayList<>(familyNames);
	}
	
	public void removeFirstName(final String name) {
		if (firstNames != null) {
			firstNames.remove(name);
		}
	}
	
	public void removeFamilyName(final String name) {
		if (familyNames != null) {
			familyNames.remove(name);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTitle(Title newTitle) {
		title = newTitle == null ? TITLE_DEFAULT : newTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstNames: ");
		result.append(firstNames);
		result.append(", familyNames: ");
		result.append(familyNames);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

}
