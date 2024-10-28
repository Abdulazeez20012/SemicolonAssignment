import java.util.Scanner;
   
public class Energyofwater {
      public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        
         System.out.print("Enter amount of water in kilograms");
         float amount = input.nextFloat();

         System.out.print("Enter innitial temperature of water");
         double innitial  = input.nextDouble();

        System.out.print("Enter final temperature of water");
        double final = input.nextDouble();

        double energy = kiloram *("Final temperature - Innitial temperature * 4184");


System.out.println("The energy needed is : "+(energy));

}




}