
//Link to Video https://youtu.be/aVnMRPoZQ-k

import java.util.Scanner;
public class Menu {
	static String orderString = "";
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to the food festival!");
		System.out.println("Would you like to place an order?");

		String Yesorno = input.next();
		Yesorno = Yesorno.toUpperCase();
		// There is no order, end here
		if (Yesorno.equals("NO")) {
			System.out.println("Thank you for stopping by, maybe next time you'll sample our menu.");
			return;

		} else if (Yesorno.equals("YES")) {
			Menu.MainMenu();
		}
	}


	public static void MainMenu() {
		
	Scanner input = new Scanner(System.in);
		boolean continueMenu = true;
		System.out.println("What is the name for your order?");
        //Get the name of the order
		String Username = input.next();
		
		
		while (continueMenu = true) {
			System.out.println("Select from menu " + Username + ":");
			System.out.println("0 - Nothing");
			System.out.println("1 - Appetizer");
			System.out.println("2 - Main Course");
			System.out.println("3 - Dessert");
			System.out.println("Enter the number for your selection:");
                
			//Select the menu
			int choice = input.nextInt();
				switch (choice) {
				case 1:
					appetizerMenu();
					break;
				case 2:
					maincourseMenu();
					break;
				case 3:
					dessertMenu();
					break;
					}
				if(choice == 0) {//The order is done
					continueMenu = false;
					System.out.println("Here is your order, " + Username + ":");
					System.out.println(orderString);
					System.out.println("Enjoy your meal!");
					System.exit(0);
				}
		}
	}
	public static void appetizerMenu() {
		
		boolean continueMenu = true;
		Scanner input = new Scanner(System.in);
		
		while (continueMenu = true) {
			System.out.println("Appetizer Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Bread");
			System.out.println("2 - Wings");
			System.out.println("3 - Mozzarella Sticks");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			//Choose an appetizer
			switch(choice) {
			case 1:
				toppingsMenu();
				break;
			case 2:
				sauceMenu();
				break;
			case 3:
				dippingsauceMenu();
				break;
			}//return to Main Menu
			if (choice == 0) {
				continueMenu = false;
				break;
			}
		}

		}
	
   public static void toppingsMenu() {
		
	   //Start order
	    orderString = (orderString + "Appetizer: [ Bread: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		//Choose some toppings
		
		while(continueMenu = true) {
			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Garlic");
			System.out.println("2 - Paprika");
			System.out.println("3 - Cheese");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();

			if (choice == 1) {//add to order
				orderString = (orderString + "Garlic, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Paprika, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Cheese, ");
			}
			if (choice == 0) {//close order and move to next line
				orderString = (orderString + "]\n");
				continueMenu = false;
				break;

			
		}
		}
	

}
   public static void sauceMenu() {
		
	
	    orderString = (orderString + "Appetizer: [ Wings: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Garlic Paremsan");
			System.out.println("2 - Barbeque Sauce");
			System.out.println("3 - Buffalo Sauce");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Barbecue Sauce, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Garlic Parmesan Sauce, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Buffalo Sauce, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void dippingsauceMenu() {
		
	   
	    orderString = (orderString + "Appetizer: [ Mozzarella Sticks: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
            System.out.println("0 - Nothing");
			System.out.println("1 - Marinara Sauce");
			System.out.println("2 - Alfredo Sauce");
			System.out.println("3 - Ketchup");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Marinara Sauce, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Alfredo Sauce, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Ketchup, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void maincourseMenu() {
		
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {
			System.out.println("Main Course Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Steak");
			System.out.println("2 - Chicken");
			System.out.println("3 - Vegan");

			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				steaktoppingsMenu();
				break;
			case 2:
				chickentoppingsMenu();
				break;
			case 3:
				vegantoppingsMenu();
				break;
			}
			if (choice == 0) {
				continueMenu = false;
				break;

		
				

		}
		}
	

}
   public static void steaktoppingsMenu() {
		
	  
	    orderString = (orderString + "Main Course: [ Steak: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Steak Sauce");
			System.out.println("2 - Garlic");
			System.out.println("3 - Pepper");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Steak Sauce, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Garlic, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Pepper, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void chickentoppingsMenu() {
		
	   
	    orderString = (orderString + "Main Course [ Chicken: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Garlic Parmesan Sauce");
			System.out.println("2 - Alfredo Sauce");
			System.out.println("3 - Sauce of the Day");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Garlic Parmesan Sauce, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Alfredo Sauce, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Sauce of the Day, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void vegantoppingsMenu() {
		
	   
	    orderString = (orderString + "Main Course: [ Vegan Meat: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Artichoke");
			System.out.println("2 - Spinach");
			System.out.println("3 - Hummus");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Artichoke, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Spinach, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Hummus, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void dessertMenu() {
		
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {
			System.out.println("Dessert Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Apple Pie");
			System.out.println("2 - Ice Cream");
			System.out.println("3 - Cake");

			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				applepietoppingsMenu();
				break;
			case 2:
				icecreamtoppingsMenu();
				break;
			case 3:
				caketoppingsMenu();
				break;
			}
			if (choice == 0) {
				continueMenu = false;
				break;

		
				

		}
		}
	

}
   public static void applepietoppingsMenu() {
		
	   
	    orderString = (orderString + "Dessert: [ Apple Pie: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Scoop of Vanilla Ice Cream");
			System.out.println("2 - Honey");
			System.out.println("3 - Syrup");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Scoop of Vanill Ice Cream, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Honey, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Syrup, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void icecreamtoppingsMenu() {
		
	   
	    orderString = (orderString + "Dessert: [ Ice Cream: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Nuts");
			System.out.println("2 - Chocolate Syrup");
			System.out.println("3 - Rainbow Sprinkles");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Chocolate Sprinkles, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Chocolate Syrup, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Rainbow Sprinkles, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
   public static void caketoppingsMenu() {
		
	   
	    orderString = (orderString + "Dessert: [ Cake: ");
		boolean continueMenu = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueMenu = true) {

			System.out.println("Toppings Menu:");
			System.out.println("0 - Nothing");
			System.out.println("1 - Chocolate Syrup");
			System.out.println("2 - Powdered Sugar");
			System.out.println("3 - Scoop of Vanilla Ice Cream");
			System.out.println("Enter the number for your selection:");

			int choice = input.nextInt();
			
			if (choice == 1) {
				orderString = (orderString + "Chocolate Syrup, ");
			}
			if (choice == 2) {
				orderString = (orderString + "Powdered Sugar, ");
			}
			if (choice == 3) {
				orderString = (orderString + "Scoop of Vanilla Ice Cream, ");
			}
			if (choice == 0) {
				orderString = (orderString + "]\n");
				break;

		}
		}
	

}
}
		
