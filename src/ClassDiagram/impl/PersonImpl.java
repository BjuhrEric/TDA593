/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Person;
import ClassDiagram.Title;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getFirstNames() <em>First Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> firstNames;

	/**
	 * The cached value of the '{@link #getFamilyNames() <em>Family Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> familyNames;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Title TITLE_EDEFAULT = Title.MR;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Title title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFirstNames() {
		if (firstNames == null) {
			firstNames = new EDataTypeUniqueEList<String>(String.class, this, ClassDiagramPackage.PERSON__FIRST_NAMES);
		}
		return firstNames;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Added by thszabi
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addFirstName(String firstName) {
		if (firstNames == null) {
			firstNames = new EDataTypeUniqueEList<String>(String.class, this, ClassDiagramPackage.PERSON__FIRST_NAMES);
		}
		firstNames.add(firstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFamilyNames() {
		if (familyNames == null) {
			familyNames = new EDataTypeUniqueEList<String>(String.class, this, ClassDiagramPackage.PERSON__FAMILY_NAMES);
		}
		return familyNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Added by thszabi
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addFamilyName(String familyName) {
		if (familyNames == null) {
			familyNames = new EDataTypeUniqueEList<String>(String.class, this, ClassDiagramPackage.PERSON__FAMILY_NAMES);
		}
		familyNames.add(familyName);
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
	 * @generated
	 */
	public void setTitle(Title newTitle) {
		Title oldTitle = title;
		title = newTitle == null ? TITLE_EDEFAULT : newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PERSON__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.PERSON__FIRST_NAMES:
				return getFirstNames();
			case ClassDiagramPackage.PERSON__FAMILY_NAMES:
				return getFamilyNames();
			case ClassDiagramPackage.PERSON__TITLE:
				return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.PERSON__TITLE:
				setTitle((Title)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.PERSON__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.PERSON__FIRST_NAMES:
				return firstNames != null && !firstNames.isEmpty();
			case ClassDiagramPackage.PERSON__FAMILY_NAMES:
				return familyNames != null && !familyNames.isEmpty();
			case ClassDiagramPackage.PERSON__TITLE:
				return title != TITLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

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

} //PersonImpl
