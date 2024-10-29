import java.util.Scanner;
  public class IncreasingAndDecreasing3 {
    public static void main(String[] args){


     	Scanner scanner = new Scanner(System.in);

  while (true) { 
            System.out.print("Enter a number (-1 to exit): ");  
            int num = scanner.nextInt(); 

            if (num == -1) {                   
		 break;

            }
System.out.print("input first number ");
      	int num1 = scanner.nextInt();

        System.out.print("input second number ");
      	int num2 = scanner.nextInt();


      	System.out.print("input third number ");
      	int num3 = scanner.nextInt();


if (num1 < num2 && num2 < num3){
	System.out.print("They are increasing numbers");
}

else if (num1 > num2 && num2 > num3){
	System.out.print("They are decreasing numbers"); 


       }
 
    }
  }	
}
  