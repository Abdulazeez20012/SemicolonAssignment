import java.util.Scanner;

public class Feet {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Scanner input = new Scanner(System.in);

         System.out.print("Enter length in feet: ");
         double feet = input.nextDouble();
         double result = feet * 0.305;
       System.out.println("converted to meter is: " + result);
}
}