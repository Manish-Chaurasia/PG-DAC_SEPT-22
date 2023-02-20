import java.util.Scanner;
class Question23{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		armstrong(num);
		
	}
	
	public static void armstrong(int n){
		
		int temp = n;
		int sum = 0;
		int count=0;
		
		while(n!=0){
			int rem = n % 10;
			count++;
			n =n/10;
		}
		
		n = temp;
		
		while(n!=0){
			int rem = n % 10;
			sum = sum + (int) Math.pow(rem , count);
			n = n/10;
		}
		
		if(temp==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong Number");
	}
}	