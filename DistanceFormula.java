import java.util.Scanner;

public class DistanceFormula {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double numDist;
      double numXone;
      double numXtwo;
      double numYone;
      double numYtwo;
      
      System.out.println("Coordinates for P1");
      
      System.out.println("Enter X1: ");
      numXone = scnr.nextDouble();
      
      System.out.println("Enter Y1: ");
      numYone = scnr.nextDouble();
      
      System.out.println("Coordinates for P2");
      
      System.out.println("Enter X2: ");
      numXtwo = scnr.nextDouble();
      
      System.out.println("Enter Y2: ");
      numYtwo = scnr.nextDouble();
      
      numDist = Math.sqrt(Math.pow((numXtwo - numXone), 2.0) + Math.pow((numYtwo - numYone), 2.0));
      
      System.out.println("Distance between P1 and P2 = " + numDist);
      
   }
}