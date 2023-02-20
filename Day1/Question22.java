import java.util.Scanner;
class Question22{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			
			boolean flag = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag = false;
					break;
				}
				
			}
			
			if(flag){
				System.out.print(i+ " ");
			}
			
		}
		

}
}	