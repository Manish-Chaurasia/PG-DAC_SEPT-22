class Pattern29{
	
	public static void main(String[] args){
		
		for(int i=5;i>=1;i--){
			
			for(int j=4;j>=i;j--){
				
				System.out.print(" ");
			}
			
			for(int k=i;k<=i+4;k++){
				
				System.out.print("*");
			}
				System.out.println();
		}
	}
}