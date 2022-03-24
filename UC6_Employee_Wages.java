/* working hours or days is reached for a month - Assume 100 hours.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Employee_Wage_Computation;

import java.util.Random;

//Initialization
class Employeeswage {
	static final int IS_FULL_TIME = 1; // constants
	static final int IS_PART_TIME = 2; // constants
	static final int EMP_WAGE_PER_DAY = 20; // constants
	static final int EMP_WAGE_FOR_MONTH = 20; // constants
	static final int TOTAL_WRK_HRS_MONTH = 100; // constants

	/*
	 * generating random numbers with in 3 using random functions
	 */
	public static int empCheck() {
		Random random = new Random();// random is object
		int empCheck = random.nextInt(3);
		return empCheck;
	}

	/*
	 * calculating employee work hours
	 */
	public static int empWrkHrs(int empCheck) {
		int empWrkHrs;
		switch (empCheck) {
		case IS_FULL_TIME:
			empWrkHrs = 8;
		case IS_PART_TIME:
			empWrkHrs = 4;
		default:
			empWrkHrs = 0;
		}
		return empWrkHrs;
	}

	// calculating employee wage per day
	public static int empWage(int empWrkHrs) {
		int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
		return empWage;
	}

	// calculating employee total salary
	public static int totalEmpSalary() {
		int day = 0;
		int totalEmpSalary = 0;
		int empWrkHrs = 0;
		int empWage = 0;
		int empCheck = 0;
		int totalEmpWrkHrs = 0;
		while (day < EMP_WAGE_FOR_MONTH && totalEmpWrkHrs < TOTAL_WRK_HRS_MONTH) {
			empCheck = empCheck();
			empWrkHrs = empWrkHrs(empCheck);
			empWage = empWage(empWrkHrs);
			totalEmpWrkHrs += empWrkHrs;
			++day;
			totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	}

}
/*
 * Main Class And Methods
 */

public class UC6_Employee_Wages {

	public static void main(String[] args) {
		int totalEmpSalary;
		System.out.println("Welcome To Employee Wage Computation Using OOP's Concept");
		totalEmpSalary = Employeeswage.totalEmpSalary();
		System.out.println("totalEmpSalary = " + totalEmpSalary);
	}

}
