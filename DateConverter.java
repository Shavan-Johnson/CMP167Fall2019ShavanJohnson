import java.util.Scanner;

public class DateConverter
{
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
    
    int dayNumber = input.nextInt();
    int monthNumber = input.nextInt();
    int numDate = input.nextInt();
    int year = input.nextInt();
    
  
   if(dayNumber <= 0 || dayNumber > 7)
   { System.out.println("Invalid day number: " + dayNumber + ", please enter a number from 1..7.");
     System.exit(0);
   } 
   if (monthNumber <= 0 || monthNumber > 12) {
      System.out.println("Invalid month number: " + monthNumber + ", please enter a number from 1..12.");
      System.exit(0);
   }
   if (numDate <= 0 || numDate > 31) {
      System.out.println("Invalid date number: " + numDate + ", please enter a number from 1..31.");
      System.exit(0);
   }
  
 if (monthNumber == 2 && numDate == 29) {
   
   if (year % 4 != 0) {
        System.out.println("Invalid date: " + year + " is not a leap year, February does not have " + numDate + " days, please enter a valid date.");
        System.exit(0);
      }
   if ((year % 100 != 0) && (year % 4 == 0)) {
        System.out.println("Invalid date: " + year + " is not a leap year, February does not have " + numDate + " days, please enter a valid date.");
        System.exit(0);
      }
   if ((year % 400 != 0) && (year % 4 == 0)) {
        System.out.println("Invalid date: " + year + " is not a leap year, February does not have " + numDate + " days, please enter a valid date.");
        System.exit(0);
  }
 }
 
 if ((monthNumber == 2 && numDate == 30) || (monthNumber == 2 && numDate == 31) || (monthNumber == 4 && numDate >= 31) || (monthNumber == 6 && numDate >= 31) || (monthNumber == 9 && numDate >= 31) || (monthNumber == 11 && numDate >= 31)) {
     System.out.println("Invalid date: " + month + ", does not have " + date + " days, please enter a valid date.");
     System.exit(0);
   }
   
    else {
    String stringDay = "";
    String month = "";
    String date = "";
    String.valueOf(date);
    
    switch(dayNumber){
     
     case 1: stringDay = "Sunday"; break;   
     case 2: stringDay = "Monday"; break;   
     case 3: stringDay = "Tuesday"; break;
     case 4: stringDay = "Wednesday"; break;
     case 5: stringDay = "Thursday"; break;
     case 6: stringDay = "Friday"; break;
     case 7: stringDay = "Saturday"; break;
        
    }
    
    switch(monthNumber){
     
     case 1: month = "January"; break;   
     case 2: month = "February"; break;   
     case 3: month = "March"; break;
     case 4: month = "April"; break;
     case 5: month = "May"; break;
     case 6: month = "June"; break;
     case 7: month = "July"; break;
     case 8: month = "August"; break;
     case 9: month = "September"; break;
     case 10: month = "October"; break;
     case 11: month = "November"; break;
     case 12: month = "December"; break;
        
    }
    
    switch(numDate){
       
     case 1: date = "1"; break;
     case 2: date = "2"; break;
     case 3: date = "3"; break;
     case 4: date = "4"; break;
     case 5: date = "5"; break;
     case 6: date = "6"; break;
     case 7: date = "7"; break;
     case 8: date = "8"; break;
     case 9: date = "9"; break;
     case 10: date = "10"; break;
     case 11: date = "11"; break;
     case 12: date = "12"; break;
     case 13: date = "13"; break;
     case 14: date = "14"; break;
     case 15: date = "15"; break;
     case 16: date = "16"; break;
     case 17: date = "17"; break;
     case 18: date = "18"; break;
     case 19: date = "19"; break;
     case 20: date = "20"; break;
     case 21: date = "21"; break;
     case 22: date = "22"; break;
     case 23: date = "23"; break;
     case 24: date = "24"; break;
     case 25: date = "25"; break;
     case 26: date = "26"; break;
     case 27: date = "27"; break;
     case 28: date = "28"; break;
     case 29: date = "29"; break;
     case 30: date = "30"; break;
     case 31: date = "31"; break;
    }
       
    System.out.println(dayNumber + " " + monthNumber + " " + numDate + " " + year + " " + "is " + stringDay + " " + month + " " + date + ", " + year);
   
  } 
        
     
    }
}