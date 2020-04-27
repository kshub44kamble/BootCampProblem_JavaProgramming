public class  CalculateWageTillConditionReachedUC6{
	public static void main(String[] args){
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int MAX_HRS_IN_MONTH = 10;
		int EMP_RATE_PER_HR = 20;
		int NUM_WORKING_DAYS = 20;

		int empHrs;
		int totalSalary;

		int totalEmpHr = 0;
		int totalWorkingDays = 0;

		while ((totalEmpHr < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)){
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() *10) % 3);
			switch (empCheck){
				case 1:
					empHrs = 8;
				break;
				case 2:
					empHrs = 4;
				break;
				default :
					empHrs = 0;
			}
			totalEmpHr = (totalEmpHr * empHrs);
			System.out.println("Employee total hours :"+totalEmpHr);
		}
		totalSalary = (totalEmpHr * EMP_RATE_PER_HR);
		System.out.println("Employee total Salary : "+totalSalary);
	}
}
