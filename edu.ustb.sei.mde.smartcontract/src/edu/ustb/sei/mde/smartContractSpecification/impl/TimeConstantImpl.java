/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.TimeConstant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getYear <em>Year</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getDay <em>Day</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getMin <em>Min</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConstantImpl extends TimeExpressionImpl implements TimeConstant {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected int month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected int day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected int hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSec() <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected static final int SEC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSec() <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected int sec = SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final int DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected int date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.TIME_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(int newMonth) {
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(int newDay) {
		int oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(int newHour) {
		int oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSec() {
		return sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSec(int newSec) {
		int oldSec = sec;
		sec = newSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__SEC, oldSec, sec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(int newDate) {
		int oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_CONSTANT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartContractSpecificationPackage.TIME_CONSTANT__YEAR:
				return getYear();
			case SmartContractSpecificationPackage.TIME_CONSTANT__MONTH:
				return getMonth();
			case SmartContractSpecificationPackage.TIME_CONSTANT__DAY:
				return getDay();
			case SmartContractSpecificationPackage.TIME_CONSTANT__HOUR:
				return getHour();
			case SmartContractSpecificationPackage.TIME_CONSTANT__MIN:
				return getMin();
			case SmartContractSpecificationPackage.TIME_CONSTANT__SEC:
				return getSec();
			case SmartContractSpecificationPackage.TIME_CONSTANT__DATE:
				return getDate();
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
			case SmartContractSpecificationPackage.TIME_CONSTANT__YEAR:
				setYear((Integer)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__MONTH:
				setMonth((Integer)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__DAY:
				setDay((Integer)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__HOUR:
				setHour((Integer)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__MIN:
				setMin((Integer)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__SEC:
				setSec((Integer)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__DATE:
				setDate((Integer)newValue);
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
			case SmartContractSpecificationPackage.TIME_CONSTANT__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__SEC:
				setSec(SEC_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TIME_CONSTANT__DATE:
				setDate(DATE_EDEFAULT);
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
			case SmartContractSpecificationPackage.TIME_CONSTANT__YEAR:
				return year != YEAR_EDEFAULT;
			case SmartContractSpecificationPackage.TIME_CONSTANT__MONTH:
				return month != MONTH_EDEFAULT;
			case SmartContractSpecificationPackage.TIME_CONSTANT__DAY:
				return day != DAY_EDEFAULT;
			case SmartContractSpecificationPackage.TIME_CONSTANT__HOUR:
				return hour != HOUR_EDEFAULT;
			case SmartContractSpecificationPackage.TIME_CONSTANT__MIN:
				return min != MIN_EDEFAULT;
			case SmartContractSpecificationPackage.TIME_CONSTANT__SEC:
				return sec != SEC_EDEFAULT;
			case SmartContractSpecificationPackage.TIME_CONSTANT__DATE:
				return date != DATE_EDEFAULT;
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
		result.append(" (year: ");
		result.append(year);
		result.append(", month: ");
		result.append(month);
		result.append(", day: ");
		result.append(day);
		result.append(", hour: ");
		result.append(hour);
		result.append(", min: ");
		result.append(min);
		result.append(", sec: ");
		result.append(sec);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}
	
	public int calsec() {
		int value;
		value = year*31536000 + month*2592000 + day*86400 + hour*3600 + min*60 + sec;
		return value;
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		return String.valueOf(calsec());
	}

} //TimeConstantImpl
