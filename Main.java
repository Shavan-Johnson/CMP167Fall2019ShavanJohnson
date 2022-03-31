import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      
      System.out.println("Enter number of Eastern Caribbean Dollars : ");
      double numECDollars = scnr.nextDouble();
      double totalECDollars = numECDollars * 0.37;
      
      System.out.println("Enter number of Dominican Pesos : ");
      double numPesos = scnr.nextDouble();
      double totalPesos = numPesos * 0.019;
      
       
      System.out.print("Enter number of Brazilian Reals : ");
      double numReals = scnr.nextDouble();
      double totalReals = numReals * 0.239;
      
      double total = totalECDollars + totalPesos + totalReals;
      
      System.out.printf("\nUS dollars = $%.2f" , (total) );
      
   }
}
