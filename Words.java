import java.util.Scanner;

public class Words {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String word1;
      String word2;
      String word3;
      String word4;
      
      System.out.println("Enter 4 words:");
      word1 = scnr.next();
      word2 = scnr.next();
      word3 = scnr.next();
      word4 = scnr.next();
      
      
      
      System.out.println("Word 1 = \"" + word1 + "\" Length = " + word1.length() + " position of vowels: 'a' = " + word1.indexOf('a') + ", 'e' = " + word1.indexOf('e') + ", 'i' = " + word1.indexOf('i') + ", 'o' = " + word1.indexOf('o') + ", 'u' = " + word1.indexOf('u'));
      
      System.out.println("Word 2 = \"" + word2 + "\" Length = " + word2.length() + " position of vowels: 'a' = " + word2.indexOf('a') + ", 'e' = " + word2.indexOf('e') + ", 'i' = " + word2.indexOf('i') + ", 'o' = " + word2.indexOf('o') + ", 'u' = " + word2.indexOf('u'));
      
      System.out.println("Word 3 = \"" + word3 + "\" Length = " + word3.length() + " position of vowels: 'a' = " + word3.indexOf('a') + ", 'e' = " + word3.indexOf('e') + ", 'i'  = " + word3.indexOf('i') + ", 'o' = " + word3.indexOf('o') + ", 'u' = " + word3.indexOf('u'));
      
      System.out.println("Word 4 = \"" + word4 + "\" Length = " + word4.length() + " position of vowels: 'a' = " + word4.indexOf('a') + ", 'e' = " + word4.indexOf('e') + ", 'i' = " + word4.indexOf('i') + ", 'o' = " + word4.indexOf('o') + ", 'u' = " + word4.indexOf('u'));
   }
   
}