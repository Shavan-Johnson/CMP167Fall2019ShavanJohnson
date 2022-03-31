import java.util.Scanner;

public class TelephoneNumber {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    
		    System.out.println("Please enter a telephone number using letters : ");
		    String letters = input.nextLine();
		    
		    
		       
		    String phonenumber = "";
		    
		    
		    
		    
		    
		    if(letters.length() < 7)
		    {
		         System.exit(0);
		    } 
		    else{
		    	
		    letters = letters.replaceAll("\\s", "");	    
		    
		    letters = letters.toUpperCase();
		
		    }
		    
		    
		    for(int idx = 0; idx < letters.length(); idx++)
		    {
		        
		        char c = letters.charAt(idx);
		        
		        
		        switch(c){
		         
		         case 'A': phonenumber = phonenumber + '2'; break;
		         case 'B': phonenumber = phonenumber + '2'; break;
		         case 'C': phonenumber = phonenumber + '2'; break;
		         case 'D': phonenumber = phonenumber + '3'; break;
		         case 'E': phonenumber = phonenumber + '3'; break;
		         case 'F': phonenumber = phonenumber + '3'; break;
		         case 'G': phonenumber = phonenumber + '4'; break;
		         case 'H': phonenumber = phonenumber + '4'; break;
		         case 'I': phonenumber = phonenumber + '4'; break;
		         case 'J': phonenumber = phonenumber + '5'; break;
		         case 'K': phonenumber = phonenumber + '5'; break;
		         case 'L': phonenumber = phonenumber + '5'; break;
		         case 'M': phonenumber = phonenumber + '6'; break;
		         case 'N': phonenumber = phonenumber + '6'; break;
		         case 'O': phonenumber = phonenumber + '6'; break;
		         case 'P': phonenumber = phonenumber + '7'; break;
		         case 'Q': phonenumber = phonenumber + '7'; break;
		         case 'R': phonenumber = phonenumber + '7'; break;
		         case 'S': phonenumber = phonenumber + '7'; break;
		         case 'T': phonenumber = phonenumber + '8'; break;
		         case 'U': phonenumber = phonenumber + '8'; break;
		         case 'V': phonenumber = phonenumber + '8'; break;
		         case 'W': phonenumber = phonenumber + '9'; break;
		         case 'X': phonenumber = phonenumber + '9'; break;
		         case 'Y': phonenumber = phonenumber + '9'; break;
		         case 'Z': phonenumber = phonenumber + '9'; break; 
		        }
		        
		        
		        if (phonenumber.length() == 7) {
		            break;
		            }
		        

	
			
		    }
		     
		    
		    String hyphenedPhonenumber = phonenumber.substring(0,3) + "-" + phonenumber.substring(3);
		    
		   
		    System.out.println(hyphenedPhonenumber);   
		        
		        
		        
		    }
		        
		     
		    }


