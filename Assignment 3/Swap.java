import java.util.Scanner;

class Swap{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		
		Swapping(num1 , num2);
		
		
	}	
		public static void Swapping(int n1 , int n2){
		
			System.out.println("Before Swapping Value of first number is " + n1 + " and value of second number is "+ n2);
			
			n2 = n2 + n1 ;  // 20+10=30
			n1 = n2 - n1 ;  // 30-10=20
			n2 = n2 - n1 ;   //20-10=10
			
			System.out.println("After Swapping Value of first number is "+ n1 + " and value of second number is "+ n2);
		}
		
		
	
	
}