class Pattern39{
	
	public static void main(String[] args){
		
		for(int i=1;i<=9;i++){
			
			for(int j=8;j>=i;j--){
				
				System.out.print("  ");
			}
			
			for(int k= 9;k>=1;k--){
				
				System.out.print(k+" ");
			}
			
			for(int m=i;m>=1;m--){
				
				System.out.print(m+" ");
			}
				System.out.println();
		}
	}
}