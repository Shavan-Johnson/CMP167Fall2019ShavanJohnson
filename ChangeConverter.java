import java.util.Scanner;

public class ChangeConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      double totalDollars;
      
      System.out.println("Enter the number of quarters:");
      quarters = scnr.nextInt();
      
      System.out.println("Enter the number of dimes:");
      dimes = scnr.nextInt();
      
      System.out.println("Enter the number of nickels:");
      nickels = scnr.nextInt();
      
      System.out.println("Enter the number of pennies:");
      pennies = scnr.nextInt();
      
      System.out.println("You entered:");
      System.out.println(quarters + " quarters");
      System.out.println(dimes + " dimes");
      System.out.println(nickels + " nickels");
      System.out.println(pennies + " pennies");
      
      totalDollars = ((quarters * 25) + (dimes * 10) + (nickels * 5) + pennies);
      totalDollars /= 100;
      
      
      System.out.printf("The total in dollars is $" + "%.2f", totalDollars);
      
   }
}