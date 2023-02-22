class Question3{
	public static void  main(String[] args){
		
		int[] arr = {10,20,30,40,50};
		int sec = secondMinimum(arr);
		System.out.println(sec);
		
	}
	
	public static int secondMinimum(int[] arr){
		
		int lowest = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]<lowest){
				
				second = lowest;
				lowest = arr[i];
			}
			else if(arr[i] > lowest && arr[i]<second){
				
				second = arr[i];
			}
		}
		
		return second;
	}
}