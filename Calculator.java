import java.lang.*;
import java.util.*;

public class Calculator{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double d1, d2;
		try{
			System.out.println("Enter Numeric Value: ");
			d1 = sc.nextDouble();
			System.out.println("Enter Numeric Value: ");
			d2 = sc.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("Could not format as a number..");
			return;
		}

		System.out.println("Type an operator from ( +, -, *, / ) ");

		String operator;
		Scanner s1 = new Scanner(System.in);
		operator = s1.nextLine();
		sc.close();


		double result; 

		switch(operator){
			case "+":
				result = CalcHelper.addValue(d1, d2); 
				break;
			case "-":
				result = CalcHelper.subtractValue(d1, d2);
				break;
			case "*":
				result = CalcHelper.multiplyValue(d1, d2);
				break;
			case "/":
				result = CalcHelper.divideValue(d1, d2);
				break;
			default:
				System.out.println("You did not choose a valid operator");
				return;

		}

		System.out.println("It's : " + result);

	}
}