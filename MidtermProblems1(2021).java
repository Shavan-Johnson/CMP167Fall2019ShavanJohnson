public class MidtermProblems {
	public static void main(String args[]) {
		exchangeFirstWithLast("Yes");
	}
		public static String exchangeFirstWithLast(String s) {
			
		    String substring;
			
			if (s == "") {
				return "";
			}
			if (s == null) {
				return null;
			}
			if (s.length() <= 1) {
			   return s;
			}
			else {
			return s.substring(s.length() - 1) + s.substring(1, s.length() - 1) + s.substring(0, 1);
		}
}
}



