import java.util.Scanner;
class Question10{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("digit : " + digits(num));
		
	}
	
	public static int digits(int n){
		
		int count=0;
		while(n!=0){
			
			int rem = n%10;
			count++;
			n = n/10;
		}
		return count;
	}
}