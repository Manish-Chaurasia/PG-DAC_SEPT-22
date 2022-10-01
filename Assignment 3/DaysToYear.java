import java.util.Scanner;
class DaysToYear{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days :");
		int num = sc.nextInt();
		
		int y , m , d,temp , t;
		
		y = num/365;
		
		temp = num%365;
		m = temp/30;
		
		temp = num%365;
		t = temp%30;
		
		d = t;
		
		
		System.out.println("number of years :" +y);
		
		System.out.println("number of months :"+m);
		
		System.out.println("number of days :" +d);
		
		
		
	}
}