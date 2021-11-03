import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int last1 = 0;
		int last2 = 1;

		for(int i = 1; i <= n; i++){
			if(i == 1) System.out.println(0);
			else if(i == 2) System.out.println(1);
			else {
				int ans = last1 + last2;
				last1 = last2;
				last2 = ans;
				System.out.println(ans);
			}
		}

		System.out.println("---------------");
		fib(n);

	}

	public static void fib(int num){

		int a = 0;
		int b = 1;
		int c = 0;

		for(int i = 0; i < num; i++){
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
