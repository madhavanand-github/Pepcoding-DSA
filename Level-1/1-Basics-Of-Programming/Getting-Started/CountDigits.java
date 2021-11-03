import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(count(n));
		
	}

	public static int count(int num){
		int count = 0;
		while(num != 0){
			count++;
			num /= 10;
		}
		return count;
	}
}
