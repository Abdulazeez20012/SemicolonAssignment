import java.util.Scanner;
   public class Multiplicationtable {

      public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);



         System.out.println("Input the table number to be calculated ");
            int tableNumber  = scanner.nextInt();
              int limit = 5;

         System.out.println("Multiplication Table "+ tableNumber);


             for (int i = 1; i <= limit; i++) {
      
          	
		System.out.println(tableNumber + " * " + i + " = " + tableNumber * i );
		


}






}



}