import java.util.Scanner;

public class SecondsConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter the number of seconds:");
   	int totalSeconds = scnr.nextInt();
   	int s = totalSeconds;
    	
    	int numHours = s / 3600;
 	   s %= 3600;
    	int numMinutes = s / 60 ;
 	 
    	s %= 60;
    	int seconds = s;
    	
    	String numShorthour = String.format("%02d", numHours);  
    	String numShortminutes = String.format("%02d", numMinutes);
    	String numShortseconds = String.format("%02d", seconds);
    	
    	System.out.println(totalSeconds + " seconds = " + numHours + " " + "hours, " + numMinutes + " " + "minutes, and " + seconds + " " + "seconds "); 
    	System.out.println(totalSeconds + " seconds = " + numShorthour + "h:" + numShortminutes + "m:" + numShortseconds + "s");
    	
   }
}
