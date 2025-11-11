package com.mycompany.helloworld;

import java.util.Iterator;
import java.util.Scanner;


public class HelloWorld extends Thread{
	
	public static void main(String args[]){
		
		System.out.print("\n Enter a month number: ");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		String msg;
		if(month<1 || month > 12)
			msg = "Not a month numbjer";
		else if(month <= 3) {
			msg="1st Quater";
		}
		else if(month <= 6) {
			msg="2nd Quater";
		}
		else if(month <= 9) {
			msg="3rd Quater";
		}else {
			msg = "4th Quater";
		}
		System.out.print(" " + msg + "\n "+ msg.length());
		sc.close();
	
	}

}
