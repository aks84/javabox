import java.lang.*;
import java.util.*;

public class Cuboid{

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		float height, length, breadth, volume, totalArea;
		System.out.print("Enter Height: "); height = sc.nextFloat();
		System.out.print("Enter Length: "); length = sc.nextFloat();
		System.out.print("Enter Breadth: "); breadth = sc.nextFloat();
		System.out.println("Volume: " + height*length*breadth );
		totalArea = (length*height*2) + (breadth*height*2) + (length*breadth*2);
		System.out.print("Total Area: " + totalArea);
	}
}