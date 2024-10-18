import java.util.Scanner;
   public class Digit {
      public static void main(String[] args){
 Scanner input = new Scanner(System.in);
System.out.print("enter three digit number:  ");
      int digit = input.nextInt();

      int digit1 = digit / 100;
      int digit2 = (digit % 100) / 10;
      int digit3 = digit % 10;
      if (digit1 == digit) {
System.out.print(digit + "its a palindrome");
}
else {
   System.out.print(digit + " is not a palindrome");
}



}


}