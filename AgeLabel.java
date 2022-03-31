import java.util.Scanner;
public class AgeLabel {

	    public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter an age in number of days :");
	    double age  = input.nextDouble();
	    
	    age = age / 365;
	    
	    
	    if(age > 0 && age <= 1)
	    { System.out.println("You are an infant"); }
	    else
	    {
	        if(age > 1 && age <= 3)
	         { System.out.println("You are a toddler");  }
	        else{
	         if(age > 3 && age <= 12)
	         {
	             System.out.println("You are a child");
	         }
	         else{
	           if(age > 12 && age <= 19)
	            {
	             System.out.println("You are a teenager");
	            }  
	           else  {
	        	   if(age > 19 && age <= 21)  {
	        		 System.out.println("You are a young adult");
	        	   }
	        	   else {
	        		   if(age > 21 && age <= 50)  {
	        			   System.out.println("You are an adult");
	        			   
	        		   }
	        		   else {
	        			   if(age > 50 && age <= 65)  {
	        				   System.out.println("You are middle aged");
	        				   
	        			   }
	        		   
	        	  
	         
	            else{
	              if(age > 65)
	            {
	             System.out.println("You are a senior citizen");
	            }   
	                
	            }
	             
	             
	         }
	        
	        }
	    }


	    
	    
	        
	     
	         } 
	        }
	    }
	    }
}


