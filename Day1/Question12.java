import java.util.Scanner;
class Question12{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  : ");
		int num = sc.nextInt();
		int sod = sumOfDigits(num);
		System.out.println("Sum of digits : " +sod);
		
	}
	
	public static int sumOfDigits(int n){
		
		int sum = 0;
		while(n!=0){
		int rem = n % 10;
		sum = sum + rem;
		n = n/10;
		}
		return sum;
	}
}