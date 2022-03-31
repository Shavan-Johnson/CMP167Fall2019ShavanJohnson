import java.util.Scanner;
public class MidtermProblems {
	public static void main(String args[]) {
		difference(10, 11);
	}
		public static String difference(int a, int b) {
			int diff = a - b;
			int absoluteDiff = Math.abs(diff);
			if (absoluteDiff >= 10 && absoluteDiff != 0) {
				return "Big Difference " + diff;
			}
			if (absoluteDiff < 10 && absoluteDiff != 0) {
				return "Small Difference " + diff;
			}
				return "EQUAL";
	}
}


