import java.util.Scanner;
class Question26{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			if(isPerfectNumber(i)){
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static boolean isPerfectNumber(int n){
		
		int temp = n;
		int sum = 1;
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0){
				sum = sum + i;
			}
		}
		if(sum == temp){
			return true;
		}else{
			return false;
		}
	}
}	