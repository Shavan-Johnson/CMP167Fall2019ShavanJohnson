import java.lang.Math;
public class MidtermProblems {
	public static void main(String args[]) {
		getDifferencePhrase(0, 0);
	}
		public static String getDifferencePhrase(int a, int b) {
			
		    int difference = a - b;
		    
		    int absDiff = Math.abs(difference);
			
			if (absDiff >= 10) {
				return "Big Difference of " + absDiff;
			}
			if ((absDiff < 10) && (absDiff > 0)) {
				return "Single Digit Difference of " + absDiff;
			}
			else {
			return a + " EQUALS " + b;
		}
}
}
