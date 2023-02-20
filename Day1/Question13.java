import java.util.Scanner;
class Question13{
	public static void main(String[] args){
		

		int small = smallest(5,6,3);
		System.out.println("smallest " +small);
		
	}
	
	public static int smallest(int x , int y , int z){
		
		int count = 0;
		
		while(x!=0 && y!=0 && z!=0){
			
			x--;
			y--;
			z--;
			count++;
		}
		
		return count;
	}
}