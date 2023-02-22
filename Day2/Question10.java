import java.util.*;
class Question10{
	public static void  main(String[] args){
		
		int[] arr = {0,1,2,0,4,0,3,4,0,1,2};
		
		int[] sort = new int[20];
		sort = moveArrayToEnd(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] moveArrayToEnd(int[] arr){
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			
			if(arr[start] == 0 && arr[end] !=0){
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			
			}else if(arr[start]==0 && arr[end]==0){
				
				end--;
			}else{
				
				start++;
			}
			
		}
		return arr;
	}
}