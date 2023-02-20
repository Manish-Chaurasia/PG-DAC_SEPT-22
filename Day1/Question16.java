import java.util.Scanner;
class Question16{
	public static void main(String[] args){
		
		int gcd , lcm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number  : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		
		int a = num1;
		int b = num2;
		
		while(b!=0){
			
			int temp = b;
			b = a % b;
			a = temp;
		}
			gcd = a;
			//lcm = (num1 * num2 )/gcd;
			
			System.out.println("GCD : "  + gcd);
		
		
	}
}