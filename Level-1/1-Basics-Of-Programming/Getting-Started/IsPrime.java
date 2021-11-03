import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while(t > 0){
			int num = scn.nextInt();
			System.out.println((isPrime(num)) ? "prime" : "not prime");
			--t;
		}
		
	}

	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0) return false;
		}
		return true;
	}

	public static boolean isPrimeOpt(int num){
		for(int i = 2; i * i <= num; i++){
			if(num%i == 0) return false;
		}
		return true;
	}
}
