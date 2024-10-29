 import java.util.Scanner; 

public class Divisible2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        for (int i = 0; i < 3; i++) { 
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); 


            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println(num + " is divisible by 5 and 11.");
            } else {
                System.out.println(num + " is not divisible by 5 and 11.");  
            }
        }

        
    }
}
 



