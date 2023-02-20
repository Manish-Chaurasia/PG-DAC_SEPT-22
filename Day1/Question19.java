import java.util.Scanner;
class Question19{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		palindrome(num);
		
	}
	
	public static void palindrome(int n){
		
		int temp = n;
		int sum = 0;
		while(n!=0){
			
			int rem = n%10;
			sum = sum * 10 + rem;
			n =  n/10;
		}
		
		if(sum==temp){
			
			System.out.println("Palindrome");
		}else{
			
			System.out.println("Not Palindrome");
		}
	}
}