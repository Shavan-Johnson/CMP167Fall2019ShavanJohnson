import java.util.Scanner;
public class MidtermProblems {
	public static void main(String args[]) {
		productAll(0,0);
	}
		public static int productAll(int a, int b) {
		int product = 1;
			if (b > a) {
			for (;b >= a; a++) {
		     product = a * product;
		     
			}
		}
			else if (a > b) {
			for (; a >= b; b++) {
				product = b * product;
			}
		}
		if ( a == b) {
		product = a * b;
			}
		return product;
}
}
