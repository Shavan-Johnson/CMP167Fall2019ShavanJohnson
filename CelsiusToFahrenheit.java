import java.util.Scanner;

public class CelsiusToFahrenheit {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double celsiusTemperature;
      double fahrenheitTemperature;
      
      System.out.println("Enter the Celsius Temperature as a decimal:");
      
      celsiusTemperature = scnr.nextDouble();
      
      fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
      
      System.out.printf(celsiusTemperature + " C = " + fahrenheitTemperature + " F %d\n");
      
   }
}
      