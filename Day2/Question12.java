import java.util.*;
class Question12{
	public static void main(String[] args){
		
		int[] arr = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static int[] reverse(int[] a){
		
		int start =0;
		int end = a.length-1;
		
		while(start<=end){
			
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		return a;
	}
}