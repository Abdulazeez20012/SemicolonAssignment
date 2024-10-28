import java.util.Scanner;

      public class Yearcheckerjenny2 {
         public static void main(String[] args){
             Scanner scanner = new Scanner(System.in);
                 System.out.println("enter any year you wish: ");
                    int Year = scanner.nextInt();
if (Year % 4 == 0){
System.out.printf("%d is a leap year", Year);
}

else 
System.out.printf("%d is not a leap year", Year);


}




} 