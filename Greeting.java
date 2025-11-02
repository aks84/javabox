import java.lang.*;
import java.util.*;


public class Greeting{

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name please?");
		String name = sc.nextLine();
		System.out.print("Hello, " + name + "!!\n");

	}
}