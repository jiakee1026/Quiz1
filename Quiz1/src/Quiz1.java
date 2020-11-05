import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your feet : ");
		int feet = input.nextInt();
		System.out.print("Enter your inches : ");
		int inches = input.nextInt();
		
		int height = (feet * 12) + inches;
		
		int Fweight = 40 + (height - 60) * 5;
		int Mweight = 50 + (height - 60) * 6;
		
		System.out.println("Weight of female is " + Fweight + "kg");
		System.out.println("Weight of male is " + Mweight + "kg");
		
	}
}


