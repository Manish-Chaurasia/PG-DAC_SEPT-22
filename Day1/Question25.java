import java.util.Scanner;
class Question25{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		perfectNumber(num);
		
	}
	
	public static void perfectNumber(int n){
		
		int temp = n;
		int sum = 1;
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0){
				sum = sum + i;
			}
		}
		
		if(sum == temp){
			System.out.println("Perfect Number");
		}else{
			System.out.println("NOt a perfect number");
		}
	}
}	