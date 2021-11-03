import java.util.Scanner;

public class PrintDigits {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		prtDig(n);
		
	}

	public static void prtDigRev(int num){
		while(num != 0){
			int digit = num % 10;
			System.out.println(digit);
			num /= 10;
		}
	}

	public static int count(int num){
		int count = 0;
		while(num != 0){
			count++;
			num /= 10;
		}
		return count;
	}

	public static void prtDig(int num){
		int ct = count(num);
		int div = (int)Math.pow(10.0, ct-1);
		while(div != 0){
			int digit = num / div;
			System.out.println(digit);
			num %= div;
			div /=10;
		}
	}
}
