import java.util.Scanner;
class Circle{
	
	final static double PI = 3.14;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		double radius = sc.nextDouble();
		System.out.println("Area of the circle is :" + Area(radius));
		System.out.println("Circumference of circle is :" + Circumference(radius));
		
		
	}
	
	public static double Area(double r){
		
		return PI*r*r;
	}
	
	public static double Circumference(double r){
	
		return 2*PI*r;
		}	
}
