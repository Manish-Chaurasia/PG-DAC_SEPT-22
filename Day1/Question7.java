import java.util.Scanner;
class Question7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		String str = num >=0 ? "Positive":"Negative";
		
		System.out.println(str);
	}
}