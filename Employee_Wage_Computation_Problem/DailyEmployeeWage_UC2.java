public class DailyEmployeeWageUC2{
	public static void main(String[] args){
		int isPresence = 1;
		int salary;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresence){
			int empRatePerHr = 20;
			int empHrs = 8;
			salary = (empHrs * empRatePerHr);
			System.out.println("Employee Salary is : "+salary);
		}
		else{
			salary = 0;
			System.out.println("Employee salary is : "+salary);
		}
	}
}
