/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.FloorMap;
import ClassDiagram.Room;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.FloorMapImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloorMapImpl extends MinimalEObjectImpl.Container implements FloorMap {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.FLOOR_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList(Room.class, this, ClassDiagramPackage.FLOOR_MAP__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.FLOOR_MAP__ROOM:
				return getRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.FLOOR_MAP__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.FLOOR_MAP__ROOM:
				getRoom().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.FLOOR_MAP__ROOM:
				return room != null && !room.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FloorMapImpl
