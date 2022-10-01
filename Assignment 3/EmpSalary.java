import java.util.Scanner;
class EmpSalary{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary of employee : ");
		int salary = sc.nextInt();
		
		System.out.println("Gross Salary of employee (including HRA & DA) is :" +CalculateSalary(salary));	
	}
	
	public static double CalculateSalary(double amount){
		
		double hra , da ,gross;
		if(amount< 10000){
			
			hra = (amount*10)/100;
			da = (amount*90)/100;
			gross = amount + hra + da;
		
		}else{
			
			hra = 2000;
			da = (amount*98)/100;
			gross = amount + hra + da;
		}
		return gross;
	}
}