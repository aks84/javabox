import java.lang.*;
import java.util.*;


public class Greeting1{

	public static void main(String arg[]){
		System.out.println("What's your name please?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("Hello " + name + "!!");

	}
}