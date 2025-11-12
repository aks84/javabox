import java.lang.*;
import java.util.*;

public class RandNumGame{

	public static void main(String[] args) {
		Random rand = new Random();
		int randNum = rand.nextInt(101);
		// System.out.println(randNum);
		while(true){
			System.out.println("Enter Guess Number: ");
			Scanner sc = new Scanner(System.in);
			int guessNum = sc.nextInt();
			if(guessNum == randNum){
				System.out.print("Correct! You Win!!");
			break;
			}else if (randNum > guessNum){
				System.out.println("Above the guessed number. Try again!");
			}else{
				System.out.println("Below the guessed number. Try again!");
			}
		}
	}
}