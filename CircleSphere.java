import java.util.Scanner;

public class CircleSphere {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double radius;
      
      System.out.println("Enter radius:");
      
      radius = scnr.nextDouble();
      
      double circleCircumference = 2 * radius * Math.PI;
      
      double circleArea = Math.PI * (Math.pow(radius, 2.0));
      
      double sphereArea = 4 * Math.PI * (Math.pow(radius, 2.0));
      
      double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
      
      System.out.println("Circle Circumference = " + circleCircumference);
      System.out.println("Circle Area = " + circleArea);
      System.out.println("Sphere Area = " + sphereArea);
      System.out.println("Sphere Volume = " + sphereVolume);
      
   }
}
      
      