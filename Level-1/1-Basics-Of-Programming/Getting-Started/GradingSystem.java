
public class GradingSystem {
	public static void main(String[] args){

		int marks = 50;

		if(marks > 90){
			System.out.println("excellent");
		} else if(marks > 80){
			System.out.println("good");
		} else if(marks > 70){
			System.out.println("fair");
		} else if(marks > 60){
			System.out.println("meets expectations");
		} else {
			System.out.println("below par");
		}
		
	}
}
