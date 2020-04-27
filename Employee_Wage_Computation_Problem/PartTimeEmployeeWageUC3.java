public class PartTimeEmployeeWageUC3{
	public static void main(String[] args){
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHr = 20;
		int empHrs;
		int salary;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == isFullTime){
			empHrs = 8;
		}
		else if (empCheck == isPartTime){
			empHrs = 4;
		}
		else{
			empHrs = 0;
		}
		salary = (empHrs * empRatePerHr);
		System.out.println("Employee salary is : "+salary);
	}
}
