import java.util.Scanner;
public class SolvingUsingSwitchCaseUC4{
	public static void main(String[] args){
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHr = 20;
		int empHrs;
		double salary;
	   int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Enter your choice: 1.isFullTime, 2.isPartTime");
		switch (empCheck){
			case 1:
				empHrs = 8;
			break;
			case 2:
				empHrs = 4;
			break;
			default:
				empHrs = 0;
		}
		salary = (empHrs * empRatePerHr);
		System.out.println("Employee salary is :"+salary);
	}
}
