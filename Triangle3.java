import java.lang.*;
import java.util.Scanner;


public class Triangle3{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter all 3 sides: ");
		float a, b, c;
		double area, s; 
		System.out.print("A "); a = sc.nextFloat();
		System.out.print("B "); b = sc.nextFloat();
		System.out.print("C "); c = sc.nextFloat();
		s = (a + b +c)/2f;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area : " + area);


	}
}