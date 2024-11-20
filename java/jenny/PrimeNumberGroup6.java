import java.util.Scanner;
public class PrimeNumberGroup6 {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
         System.out.println("Slot in a number");
        int number = scanner.nextInt();
       
            for (int i = 2; i <= Math.sqrt(number); i++) {
                
          		 System.out.println(number + " is a prime number.");
        } 	for (int i =2; i >= Math.sqrt(number); i--){
                    		 System.out.println(number + " is not a prime number.");
      }
}

}
