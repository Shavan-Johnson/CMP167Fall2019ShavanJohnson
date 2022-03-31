public class MidtermProblems {
	public static void main(String args[]) {
		getSumOfEvens(0);
	}
		public static int getSumOfEvens(int a) {
			
			int sum = 0;

			if (a <= 0) {
				return a;
			}
			else {
				for (int i = 0; i <= a; i++) {
					if (i % 2 == 0) {
						sum = sum + i;
					}
					
				}
			return sum;
		}
}
}
