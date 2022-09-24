class Pattern34{
	
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
			
			for(int j=i;j<5;j++){
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=5;k++){
				
				if(i==5 || k==i || k==1){
					
					System.out.print("*");
				}else{
				
				System.out.print(" ");
				}
			}
				System.out.println();
		}
	}
}