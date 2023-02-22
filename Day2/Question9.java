import java.util.*;
class Question9{
	public static void main(String[] args){
		
		int[] arr1 = {1,3,6,4,7,6,2,4,6};
		int[] arr2 = {2,4,6,8,6,3,1,2,6,4};
		
		union(arr1,arr1.length,arr2,arr2.length);
		
	}
	
	public static void union(int arr1[] , int n , int arr2[] , int m){
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<n;i++){
			
			hs.add(arr1[i]);
		}
		
		for(int i=0;i<m;i++){
			
			hs.add(arr2[i]);
		}
		System.out.print(hs.toString() + " ");
	}
}