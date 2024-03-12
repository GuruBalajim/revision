package mit;
import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter the side");
		double side = scanner.nextDouble();
		System.out.print("enter the base");
		double base = scanner.nextDouble();
		System.out.print("enter the height");
		double height = scanner.nextDouble();
		
		  double area = calculateArea(base,height);
	        double perimeter = calculatePerimeter(side,base);
	        System.out.println("Area of the rectangle: " + area);
	        System.out.println("Perimeter of the rectangle: " + perimeter);

	        scanner.close();
	}
	public static double calculateArea(double base,double height)
	{
		return 0.5*base*height;
	}
	public static double calculatePerimeter(double side,double base)
	{
		return 2*side+base;
	}}