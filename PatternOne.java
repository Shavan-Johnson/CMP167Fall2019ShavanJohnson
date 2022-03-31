import java.util.Scanner;

public class PatternOne {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number 1...9 : ");
		int size = input.nextInt();
		if(size > 9) {
			System.exit(0);
		}


	int row;
	int col; 
	 for(row = 1; row <= size; row++)      
	 {           
	 for(col = 1; col <= row; col++)
		 System.out.print(col + " ");
	 {
		 System.out.println();
	 
	 }
	 }
}
}

	

