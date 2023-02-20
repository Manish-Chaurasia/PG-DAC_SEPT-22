import java.util.Scanner;
class Question21{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		isPrime(num);
		
	}
	
	public static void isPrime(int n){
		
		int count = 0;
		for(int i=2;i<=n;i++){
			
			if(n%i==0){
				count++;
		
			}
		}
		if(count == 1){
			System.out.println("Prime");
		}else{
			System.out.println("Not a Prime");
		}
	}
}	
