import java.util.Scanner;

public class PrimesTill {
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();

		for (int i = low; i <= high; i++) {
			if(isPrime(i)) System.out.println(i);
		}


	}

	public static boolean isPrime(int num){
		for (int i = 2; i*i <= num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
}
