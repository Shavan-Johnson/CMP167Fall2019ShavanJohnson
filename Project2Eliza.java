//https://youtu.be/5gIJkNheRr0
import java.util.Scanner;
public class ProjectEliza {

	static String sentence = "";
	static Scanner in = new Scanner(System.in);
public static void main(String[] args) {

	
	System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
	System.out.print("USER: ");
	String name = in.nextLine();
	if(name.equalsIgnoreCase("EXIT")) {
	checkifEXIT(name);
	}
	System.out.println("ELIZA: Hello " + name + " Tell me what is on your mind today in 1 sentence.");
	System.out.print("USER: ");
	sentence = in.nextLine();
		if (sentence.equalsIgnoreCase("EXIT")) {
			checkifEXIT(sentence);
		}
			
		else {
            conversation();
            
		}
		
}
	public static void conversation() {
		
    PromptBank.PromptBank();
    
	while (!sentence.equalsIgnoreCase("EXIT")) {
	
	if(sentence.charAt(sentence.length() - 1) == '?') {

		PromptBank.populateQuestionsArray(sentence);
		
		String question = PromptBank.getRandomQuestionTrunk();
		
		System.out.println("ELIZA: " + question);
		
		
	}
	else if (sentence.charAt(sentence.length() - 1) == '!') {
		
		PromptBank.populateStatementsArray(sentence);
		
		String statement = PromptBank.getRandomStatementTrunk();
		
		System.out.println("ELIZA: WOW! Dramatic! " + statement);
	}
	
	else {
		
		PromptBank.populateStatementsArray(sentence);
		
		String statement = PromptBank.getRandomStatementTrunk();
		
		System.out.println("ELIZA: " + statement);
		
	}
	System.out.print("USER: ");
	sentence = in.nextLine();
	}
	if (sentence.equalsIgnoreCase("EXIT")) {
	checkifEXIT(sentence);
	}
}

public static void checkifEXIT(String name) {
			Scanner in = new Scanner(System.in);
			System.out.println("Do you want to run the session again?");
			String endConvo = in.next();
			endConvo = endConvo.toUpperCase();
			if (endConvo.equals("YES")) {
				ProjectEliza.main(null);
			}
			if (endConvo.contentEquals("NO")) {
				System.out.println("Goodbye, until next time.");
				System.exit(0);
			}
		}
}


