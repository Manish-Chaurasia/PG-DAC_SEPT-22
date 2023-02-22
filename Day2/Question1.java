import java.util.Scanner;
class Question1{
	public static void main(String[] args){
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Average of sum is : "+average(arr));
		
		
	}
	
	public static int average(int[] arr){
		
		int sum=0; 
		int avg;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			
		}
		
		return sum/arr.length;
	}
	
	
	
}