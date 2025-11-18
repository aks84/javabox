import java.lang.*;
import java.util.*;

public class Restaurand{

	public static void main(String[] args) {
		String day; 
		String cuisine;
		String greeting;
		String mealtype;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Enter day of the week: ");
		day = sc.nextLine();
		switch(day){
		case("monday"):
			cuisine = "Mexican";
			greeting = "It's monday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;

		case("tuesday"):
			cuisine = "Continental";
			greeting = "It's tuesday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;

		case("wednesday"):
			cuisine = "Japanese";
			greeting = "It's wednesday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;

		case("thursday"):
			cuisine = "Indian";
			greeting = "It's thursday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;
		case("friday"):
			cuisine = "Chinese";
			greeting = "It's friday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;
		case("saturday"):
			cuisine = "viatnamese";
			greeting = "It's saturday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;
		case("sunday"):
			cuisine = "thai";
			greeting = "It's sunday today! We are serving "+ cuisine +" cuisine What would you like to eat (Breakfast, Lunch, Supper, or Dinner) ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype);
			break;
		}
	}
	}


}