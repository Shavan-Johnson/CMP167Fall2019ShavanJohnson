
public class PromptBank {
	static String [] questions;
	static String [] statements;
	static String BLANK1;
	static String BLANK2;
	public static void PromptBank(){
		
		questions = new String[5];
		statements = new String[5];
		BLANK1 = "";
		BLANK2 = "";
	}

	public static void populateStatementsArray(String sentence){
		
		String inptarr [] = sentence.split(" ");
		String BLANK1 = inptarr[0];
		String BLANK2 = inptarr[inptarr.length - 1].substring(0, (inptarr[inptarr.length - 1]).length());
		
	    statements[0] = "Tell me more about " + BLANK1 + " and " + BLANK2;
		statements[1] = BLANK1 + " seems important to you, so does " + BLANK2 + ". Please tell me more.";
		statements[2] = BLANK1 + " and " + BLANK2 + " seem to be on your mind. Let's talk about it.";
		statements[3] = BLANK1 + " seems more important than " + BLANK2 + ". Please explain why.";
		statements[4] = "I'm confused about " + BLANK2 + " and " + BLANK1 + ". Please clarify what you mean.";
	}
	public static void populateQuestionsArray(String sentence){
		
		String inptarr [] = sentence.split(" ");
		String BLANK1 = inptarr[0];
		String BLANK2 = inptarr[inptarr.length - 1].substring(0, (inptarr[inptarr.length - 1]).length());
		
		questions[0] = "Is there anything else about " + BLANK1 + " and " + BLANK2 + "?";
		questions[1] = "Does " + BLANK1 + " bother you? How about " + BLANK2 + "?";
		questions[2] = "Are " + BLANK1 +  " and " + BLANK2 +  " things you think about often?";
		questions[3] = "How do you feel about " + BLANK1 + "? What about " + BLANK2 + "?";
		questions[4] = "Why did you mention " + BLANK1 + " or " + BLANK2 + "?";
		
	}
	public static String getRandomStatementTrunk(){
		
		int idx = 0 + (int)(Math.random() * ((4 - 0) + 1));
		return statements[idx];
	}
	
	
	public static String getRandomQuestionTrunk(){
		
		int idx = 0 + (int)(Math.random() * ((4 - 0) + 1));
		return questions[idx];
		
	}
	
	
}




