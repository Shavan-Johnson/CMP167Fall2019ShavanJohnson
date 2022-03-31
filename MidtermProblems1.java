import java.util.Scanner;
public class MidtermProblems {
	public static void main(String args[]) {
		replaceLast();
	}
		public static String replaceLast(String s, char c) {
			if (s == "") {
				return "";
			}
			if (s == null) {
				return null;
			}
			else if (s != ""){
			String substring = s.substring(0, s.length() - 1);
			String modifiedString = substring + c;
			s = modifiedString;
			}
			return s;
		
	}
}


