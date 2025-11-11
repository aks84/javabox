import java.lang.*;
import java.util.*;


interface Client{
	void input();
	void output();
}

class Raju implements Client{

	String name;
	double salary;
	public void input(){
		Scanner sc =new Scanner(System.in);
		System.out.print("Name: ");
		name = sc.nextLine();

		System.out.print("Salary: ");
		salary = sc.nextDouble();
	}

	public void output(){
		System.out.println(name + " " +salary);
	}

public static void main(String arg[]){
	Client cl = new Raju();
	cl.input();
	cl.output();

}

}