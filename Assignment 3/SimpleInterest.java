import java.util.Scanner;
class SimpleInterest{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount :");
		double amt = sc.nextDouble();
		
		System.out.println("Enter Rate of interest :");
		double ri = sc.nextDouble();
		
		System.out.println("Enter years :");
		int t = sc.nextInt();
		
		CalculateSI c1 = new CalculateSI();
		//CalculateSI c1 = new CalculateSI(amt , ri , t);
		c1.calSI(amt , ri , t);
	
	
	}
	
}
	class CalculateSI{
	
		double amount;
		double roi;
		int time;
		double si;
		
		/*CalculateSI(double a , double i ,int t){
			
			this.amount=a;
			this.roi=i;
			this.time=t;
		}*/
		
		public void calSI(double a , double i , int t){
			
		double si = (a * i * t)/100 ;
		System.out.println("Simple Interest for given amount and years is : "+ si);
		
		
		}
		
	}
