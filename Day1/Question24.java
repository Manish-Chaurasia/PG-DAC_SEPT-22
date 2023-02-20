import java.util.Scanner;
class Question24{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			
			if(isArmstrong(i)){
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static boolean isArmstrong(int n){
		
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
			return true;
		else
			return false;
	}
}	