package week1;
import java.util.Scanner;
public class NameGetter {
	//main method,
	//the program stars at the main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for an input
		System.out.println("Enter Your name");
		//Waits for the input from the user
		//and grabs it, then store in variable
		String name = input.nextLine();
		//Reply to user
		System.out.println("Thank you, "+name);
	}
}
