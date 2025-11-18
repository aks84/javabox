import java.lang.*;

public class Recursion{
	// public static void fun(int n){
	// 	if(n>0){
	// 		System.out.println(n);
	// 		fun(n-1);
	// 		fun(n-1);
	// 	}
	// }

	public static int sum(int n){
		if (n==0){
			return 0;
		}else{
			return sum(n-1)+n;
		}

	}


	public static void main(String[] args) {
		// fun(3);

		int sm;
		sm = sum(5);
		System.out.println(sm);
	}
}