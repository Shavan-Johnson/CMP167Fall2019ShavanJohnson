import java.util.Scanner;

public class IntegerExpressions {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int firstInt;
      int secondInt;
      int thirdInt;
      
      System.out.println("Enter firstInt:");
      firstInt = scnr.nextInt();
      
      System.out.println("Enter secondInt:");
      secondInt = scnr.nextInt();
      
      System.out.println("Enter thirdInt:");
      thirdInt = scnr.nextInt();
      
      int firstResult = (firstInt + secondInt) / thirdInt;
      int secondResult = (secondInt * thirdInt) / (secondInt + firstInt);
      int thirdResult = (firstInt * thirdInt) % secondInt;
      
      System.out.println("First Result = " + firstResult);
      System.out.println("Second Result = " + secondResult);
      System.out.println("Third Result = " + thirdResult);
   }
}
   
   
      