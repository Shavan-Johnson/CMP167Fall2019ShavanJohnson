import java.util.Scanner;
public class MidtermProblems {
	public static void main(String args[]) {
		evens(0);
	}
		public static String evens(int a) {
			String evenNumbers = "";
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				evenNumbers = evenNumbers + i;
				if (a >= 2) {
					evenNumbers = evenNumbers + ",";
				}
			}
		}
		if(a < 0) {
			return "NONE";
			}
		if (a == 0) {
				return evenNumbers;
				}
		evenNumbers = evenNumbers.replaceAll(",$","");
		return evenNumbers;
		}
}
