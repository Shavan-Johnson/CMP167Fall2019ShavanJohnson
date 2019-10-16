import java.util.Scanner;

public class SMSAbbreviations1 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation: ");
		String abbreviation = scnr.nextLine();
		
		String translation = "";
		
		if (abbreviation.equals ("LOL")) {
			translation = (" Laughing Out Loud");
			
		}
		else if (abbreviation.equals ("TMI")) {
			translation = (" Too Much Information");
			
		}
		else if (abbreviation.equals ("SMH")) {
			translation = (" Shaking My Head");
			
		}
		else
			System.out.println("Unknown Abbreviation");
			
			
	
		System.out.println(abbreviation  + "means"  + translation);
		
		return;
		
	}
	
	

}
