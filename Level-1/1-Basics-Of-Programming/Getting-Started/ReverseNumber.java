import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(rev(num));
	}

	public static int rev(int num){
		int res = 0;
		while(num != 0){
			int mul = (int)Math.pow(10, count(num) - 1);
			int lastDigit = num % 10;
			res += lastDigit * mul;
			num /= 10;
		}
		return res;
	}

	public static int count(int num){
		int count = 0;
		while(num != 0){
			num /= 10;
			count++;
		}
		return count;
	}
}
