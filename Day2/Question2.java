class Question2{
	public static void main(String[] args){
		
		int[] arr = {10,20,30,40,50};
		
		int sec = secondLargest(arr);
		System.out.println(sec);
		
	}
	
	public static int secondLargest(int[] arr){
		
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] > largest){
				
				second = largest;
				largest = arr[i];
				
			}
			else if(arr[i]< largest && arr[i]>second){
				second = arr[i];
			}
			
		}
		return second;
	}
}