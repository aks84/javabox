import java.lang.*;
import java.util.*;


public class TriangleArea{

	public static void main(String arg[]){
		float height;
		float base;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height of the Triangle:");
		height = sc.nextFloat();
		System.out.println("Enter Base of the Triangle:");
		base = sc.nextFloat();
		area = height * base;
		area = area / 2; 
		System.out.println("Triangle Area: " + area);
	}
}