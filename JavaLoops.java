import java.lang.*;

public class JavaLoops{

	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April", "May", "June", "Jyly", "August", "September", "October", "Novermber", "December"};
		System.out.println("\tfor loop");

		for(int i=0; i <= months.length; i++){
			System.out.println(months[i]);
		}

		System.out.println("\tfor each loop");

		for(String month : months){
			System.out.println(month);
		}
		System.out.println("\twhile loop");

		int whileCounter = 0; 
		while (whileCounter<months.length){
			System.out.println(months[whileCounter]);
			whileCounter++;
		}
		System.out.println("\tdo while loop");

		int doCounter = 0; 
		do{
			System.out.println(months[doCounter]);
			doCounter++;
		}while (doCounter<months.length);

	}

}