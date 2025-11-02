import java.lang.*;
import java.util.*;

public class Hello{
	public static void main(String arg[]){
		System.out.println("Hello wolrd");
		// System.out.println(arg[2]);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a, b, c; 
		a = s.nextInt();
		b = s.nextInt();
		c = a + b; 
		System.out.println("Sum a & b: " + c);

	}

}