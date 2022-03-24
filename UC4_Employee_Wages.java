/*
 * @Purpose::Employee Wage Computation Problem solving using switch case statement.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Employee_Wage_Computation;

import java.util.Random;

//Initialization
class Employee2 {
	static final int IS_FULL_TIME = 1;// constants
	static final int IS_PART_TIME = 2;// constants
	static final int EMP_WAGE_PER_HOUR = 20;

	/*
	 * generating random numbers with in 3 using random functions
	 */
	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(3);
		return empCheck;
	}

	/*
	 * calculating employee work hours
	 */
	public static void empSalary(int empCheck) {
		int empWrkHrs;
		switch (empCheck) {
		case IS_FULL_TIME:
			empWrkHrs = 8;
		case IS_PART_TIME:
			empWrkHrs = 4;
		default:
			empWrkHrs = 0;
		}
		int empWage = empWrkHrs * EMP_WAGE_PER_HOUR;
		System.out.println("empWage = " + empWage);
	}
}

//Main Class And Methods
public class UC4_Employee_Wages {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Using OOP's Concept");
		int empCheck = Employee2.empCheck();
		Employee2.empSalary(empCheck);

	}

}
