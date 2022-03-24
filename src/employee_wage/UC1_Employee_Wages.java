/*
 * @Purpose::Employee Wage Computation Problem to check Employee is Present or Absent.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package employee_wage;

import java.util.Random;

public class UC1_Employee_Wages {

	public static void EmpWageUC1() {
		Random ran = new Random();
		int present = 1;
		int empCheck = ran.nextInt(2);
		if (empCheck == present) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Using OOP's Concept");
		EmpWageUC1();

	}

}
