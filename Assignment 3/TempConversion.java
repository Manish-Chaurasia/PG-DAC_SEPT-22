import java.util.Scanner;
class TempConversion{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temparature in Farenheit : ");
		double temp = sc.nextDouble();
		
		Cal(temp);
		
		
	}
		
		public static void Cal(double tempInFar){
			
			
			//double tempInFar;
			
			double tempInCel = (tempInFar - 32) * 5/9;
			System.out.println(tempInFar + " Farenheit " + " is equal to "+ tempInCel +  " degree Celcius ");
		}
	
}