class Question17{
	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 7;
		
		System.out.println(pairOfElements(arr,target));
		
		
	}
	
	public static int pairOfElements(int[] a , int target){
		
		int count=0;
		for(int i=0;i<a.length;i++){
			
			for(int j = i+1;j<a.length;j++){
				
				if(a[i] + a[j]==target){
					
					count++;
				}
			}
		}
		return count;
	}
}