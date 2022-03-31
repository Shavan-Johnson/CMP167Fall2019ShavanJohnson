import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        
    
    int gradeCount = 0;
    int countA = 0;
    int countAMinus = 0;
    int countBPlus = 0;
    int countB = 0;
    int countBMinus = 0;
    int countCPlus = 0;
    int countC = 0;
    int countCMinus = 0;
    int countD = 0;
    int countF = 0;
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a grade: ");
    int grade = input.nextInt();
    
   
   
    
    while(grade >= 0){
        
     if(93 <= grade && 100 >= grade)
      countA++;
      
     if(90 <= grade && 93 > grade)
      countAMinus++;
      
     if(87 <= grade && 90 > grade)
       countBPlus++;
     
      if(83 <= grade && 87 > grade)
       countB++;  
      
      if(80 <= grade && 83 > grade)
       countBMinus++; 
      
      if(77 <= grade && 80 > grade)
          countCPlus++; 
      
      if(73 <= grade && 77 > grade)
          countC++; 
      
      if(70 <= grade && 73 > grade)
          countCMinus++; 
      
      if(60 <= grade && 70 > grade)
          countD++; 
      
      if(0 <= grade && 60 > grade)
          countF++; 
      
      gradeCount++;
            
     System.out.println("Enter a grade: ");
     grade = input.nextInt();
    }

   
    System.out.println("Total number of grades = " + gradeCount);
    System.out.println("Number of A's  = " + countA);
    System.out.println("Number of A-'s = " + countAMinus);
    System.out.println("Number of B+'s = " + countBPlus); 
    System.out.println("Number of B's  = " + countB);
    System.out.println("Number of B-'s = " + countBMinus);
    System.out.println("Number of C+'s = " + countCPlus); 
    System.out.println("Number of C's  = " + countC);
    System.out.println("Number of C-'s = " + countCMinus);       
    System.out.println("Number of D's  = " + countD);
    System.out.println("Number of F's  = " + countF);    
    
    }

}
