import java.lang.*;
import java.util.*;

public class RockPaperScisors{

	public static void main(String[] args) {

		String rps[] = {"r", "p", "s"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		Scanner sc = new Scanner(System.in);
		String playerMove;
		while(true){
			System.out.println("\nEnter your move (r, p, or s)");
			playerMove = sc.nextLine();
			if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
 			}else{
				System.out.println(playerMove + " is not a valid move. ");
			}
			System.out.println("Computer played " + computerMove);
			if (playerMove.equals(computerMove)){
			System.out.println("The game was a tie! ");

			}else if(playerMove.equals("r")){
				if (computerMove.equals("p")){
					System.out.println("\t\tYou lose!");
				}else if (computerMove.equals("s")){
					System.out.println("\t\tYou win!");

				}
			}

			else if(playerMove.equals("p")){
				if (computerMove.equals("r")){
					System.out.println("\t\tYou win!");
				}else if (computerMove.equals("s")){
					System.out.println("\t\tYou lose!");

				}
			}

			else if(playerMove.equals("s")){
				if (computerMove.equals("p")){
					System.out.println("\t\tYou win!");
				}else if (computerMove.equals("r")){
					System.out.println("\t\tYou lose!");

				}
			}


		} // while ends
		
	} // main ends
} // class ends.