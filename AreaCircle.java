
import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		System.out.println("Area of Circle Calculator");
		System.out.println("Insert the radius of the circle");
		double radius = sc.nextDouble();
		System.out.println("the radius is :"+ radius);
		System.out.println("Calculating....");
		double area = pi*Math.pow(radius, 2);
		System.out.println("the area is: "+ area);
		System.out.println("half the area of the circle is: " + area/2);
		sc.close();
		
		
		
	}

}

