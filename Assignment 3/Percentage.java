import java.util.Scanner;

class Percentage{
	
	public static void main(String[] args){
		
		int sum=0;
		int avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subjects :");
		int num = sc.nextInt();
		
		int mark[] = new int[num]; 
		
		System.out.println("Enter marks for each subject :");
		for(int i=0;i<mark.length;i++){
			
			mark[i]=sc.nextInt();
		}
		
		System.out.println("Your Marks are :" );
		for (int i=0;i<mark.length;i++){
			System.out.print(" " + mark[i]);
			sum = sum+mark[i];
		}
		
		System.out.println();
		System.out.println("Total marks :" +sum);
		System.out.println("Average : " + sum/num +"%");
		
		
	}
}