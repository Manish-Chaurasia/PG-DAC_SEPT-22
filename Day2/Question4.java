import java.util.Scanner;
class Question4{
	public static void main(String[] args){
		
		int[] arr = {1,2,3,5,6,7,8,9,10};
		int misnum = findMissing(arr , 10);
		System.out.println(misnum);
		
	}
	
	public static int findMissing(int[] arr,int n){
		
		int sum = 0;
		for(int i=0; i<arr.length;i++){
			
			sum = sum + arr[i];
			//if(arr[i] > n){
				//n = arr[i];
			//}
		}
		return (n*(n+1)/2) -  sum ;
	}
}