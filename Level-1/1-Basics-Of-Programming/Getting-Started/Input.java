import java.util.Scanner;

public class Input {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter num space name");
		int salary = scn.nextInt();
		String name = scn.nextLine();
		System.out.println(salary + 123 + " " + name);

		System.out.println("Enter num enter name");
		salary = Integer.parseInt(scn.nextLine());
		name = scn.nextLine();
		System.out.println(salary + 123 + " " + name);


	}
	
}
