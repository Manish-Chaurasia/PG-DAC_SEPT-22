import java.util.*;
class Question16{
	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7};
		
		int k = 3;
		
		rotate(arr , k);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void rotate(int[] a , int k){
		
		k = k % a.length;
		reverse(a , 0 , a.length-1);
		reverse(a , 0 , k-1);
		reverse(a , k , a.length-1);
	}
	
	public static void reverse(int[] a , int start , int end){
		
		while(start < end){
			
			int temp = a[start];
			a[start] = a[end];
			a[end] =  temp;
			start++;
			end--;
		}
		
	}
}