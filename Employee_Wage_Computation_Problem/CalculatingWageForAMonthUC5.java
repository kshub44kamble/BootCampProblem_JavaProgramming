public class  CalculatingWageForAMonthUC5{
	public static void main(String[] args){
		int isPartTime = 1;
		int isFullTime = 2;
		double totalSalary = 0;
		int empRatePerHr = 20;
		int numWorkingDays = 20;
		int empHr;
		double salary;
		for (int day=1; day<=numWorkingDays; day++){
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck){
				case 1:
					empHr = 8;
				break;
				case 2:
					empHr = 4;
				break;
				default:
					empHr = 0;
			}
			salary = (empHr * empRatePerHr);
			System.out.println("Employee salary is : "+salary);
			totalSalary = (totalSalary + salary);
			System.out.println("Employee Total Salary is :"+totalSalary);
		}
	}
}
