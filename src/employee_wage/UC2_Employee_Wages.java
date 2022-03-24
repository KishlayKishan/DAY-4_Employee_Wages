/*
 * @Purpose::Employee Wage Computation Problem to Calculate Daily Employee wages.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package employee_wage;

import java.util.Random;

class Employee1 {
	static final int IS_FULL_TIME = 1;
	static final int EMP_WAGE_PER_DAY = 20;

	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(2);
		return empCheck;
	}

	public static void empSalary(int empCheck) {
		int empWrkHrs = 0;
		if (empCheck == IS_FULL_TIME) {
			empWrkHrs = 8;
		} else {
			empWrkHrs = 0;
		}
		int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
		System.out.println("empWage = " + empWage);
	}
}

public class UC2_Employee_Wages {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Using OOP's Concept");
		int empCheck = Employee1.empCheck();
		Employee1.empSalary(empCheck);
	}

}
