import java.lang.*;
import java.util.*;

public class Hotel{

	public static void main(String[] args) {
		String day; 
		String cuisine;
		String greeting;
		String mealtype;
		Scanner sc = new Scanner(System.in);

		while(true){
		System.out.println("Welcome!\nEnter day of the week: ");
		day = sc.nextLine();

		switch(day){
		case("monday"):
			cuisine = "Mexican";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		case("tuesday"):
			cuisine = "Continental";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		case("wednesday"):
			cuisine = "Japanese";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		case("thursday"):
			cuisine = "Indian";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		case("friday"):
			cuisine = "Chinese";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		case("saturday"):
			cuisine = "Viatnamese";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		case("sunday"):
			cuisine = "Thai";
			greeting = "We are serving "+ cuisine +" cuisine today.\nWhat would you like to eat (Breakfast, Lunch, Supper, or Dinner)? ";
			System.out.println(greeting);
			mealtype = sc.nextLine();
			System.out.println("Here is your " + cuisine + " "+mealtype + "\n");
			break;

		default:
            greeting = "Invalid Day. Endter (sunday, monday...)";
            System.out.println(greeting);
            break;

			
		}//switch case ends here
		}//while ends here
	}//main method


}//class Hotel