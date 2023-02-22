class Question6{
	public static void main(String[] args){
		
		int[] arr1 = {14,35,36,37,74};
		int[] arr2 = {25,36,58,65,74};
		interSection(arr1,arr2);
		
	}
	
	public static void interSection(int[] arr1, int[] arr2){
		
		int i=0;
		int j=0;
		while(i < arr1.length && j<arr2.length){
			if(arr1[i] < arr2[j]){
				i++;
			}else if(arr1[i] > arr2[j]){
				j++;
			}else{
				System.out.print(arr1[i]+ " ");
				i++;
				j++;
			}
		}
	}
	
}