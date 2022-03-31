import java.util.Scanner;

public class YardsFeetInches {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter number of inches: ");
      
      int inches = scnr.nextInt();
      
      int numYards = inches / (12 * 3);
      
      inches %= (12 * 3);
      
      int numFeet = inches / 12;
      
      int numInches = inches % 12;
      
      System.out.println(numYards + " " + "yards, " + numFeet + " feet, and " + numInches + " inches."); 
   }
}
      
      