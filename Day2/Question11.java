import java.util.*;
class Question11{
	public static void main(String[] args){
		
		int[] arr = {1,0,2,0,3,0,5,6,0,3,0};
		
		int[] sort = new int[20];
		sort = allZeroToStart(arr);
		System.out.println(Arrays.toString(sort));
		
	}
	
	public static int[] allZeroToStart(int[] a){
		
		int start = 0;
		int end = a.length-1;
		
		while(start <=end){
			
			if(a[start]!=0 && a[end]==0){
				
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
			else if(a[start]==0 && a[end]==0){
				
				start ++;
			}
			else{
				end--;
			}
		}
		
		return a;
	}
}