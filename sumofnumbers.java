package weektwopart2;
import java.util.Scanner;
public class sumofnumbers {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three values to add");
	
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	
	int result = num1 + num2 + num3;
	System.out.println(result);
	

}
}
