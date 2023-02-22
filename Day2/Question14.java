import java.util.*;
class Question14{
	public static void main(String[] args){
		
		int[] arr = {10,20,10,30,10,40,10,50};
		
		// Arrays.sort(arr);
		
		
		System.out.println(mostFreq(arr));		
	}
	
	public static int mostFreq(int[] a){
		
		Arrays.sort(a);
		
		int count = 1;
		int maxCount = 1;
		int number = a[0];
		
		for(int i=1;i<a.length;i++){
			
			if(a[i]==a[i-1]){
				count++;
			}else{
				count = 1;
			}
			
			if(count > maxCount){
				maxCount = count;
				number = a[i-1];
			}
			
		}
		return number;
	}
}