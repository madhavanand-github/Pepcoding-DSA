import java.util.Scanner;

public class InverseNumber {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt(); // 2143
		System.out.println(inverse(num));
	}

	public static int inverse(int num){
		int count = 0;
		int res = 0;
		while(num != 0){
			count++;
			int lastDigit = num % 10;
			num /= 10;
			res += count * (int)Math.pow(10, lastDigit - 1);
		}
		return res;
	}
}
