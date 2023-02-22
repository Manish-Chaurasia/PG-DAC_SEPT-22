class Question13{
	public static void main(String[] args){
		
		int[] arr = {10,20,10,30,10,40,10,50};
		
		System.out.println(maxFreq(arr));
	}
	
	public static int maxFreq(int[] a){
		
		int maxCount = 0;
		int count;
		int number=0 ;
		
		for(int i=0;i<a.length;i++){
			
			count = 0;
			for(int j=0;j<i;j++){
				
				if(a[i]==a[j]){
					
					count++;
				}
			}
			
			if(count > maxCount){
				
				maxCount = count;
				number = a[i];
			}
		}
		return number;
	}
	
}