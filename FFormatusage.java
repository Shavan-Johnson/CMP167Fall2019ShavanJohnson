package weektwopart3;

public class FFormatusage {
	public static void main(String[] args) {
		System.out.println(78+98); //176
		System.out.println('a'+'b'); //195
		System.out.println('a'-'b'); //-1
		System.out.println('0'+'0'); //96
		System.out.println('a'+1); //98
		System.out.println('a'); //a
		
		int num = 5;
		double dollars = 15.60;
		String name1 = "Shawn Mendez";
		String name2 = "Camila";
		
		System.out.printf(" I have %d cars %n", num); // I have 10 cars
		System.out.printf(" Maria has %.2f in her pocket", dollars);
		
		System.out.printf("%n %s is %d years older than %s", name1, num, name2);
		
	}

}
