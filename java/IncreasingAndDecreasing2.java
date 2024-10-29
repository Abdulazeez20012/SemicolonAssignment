import java.util.Scanner;
  public class IncreasingAndDecreasing2 {
    public static void main(String[] args){


     	Scanner scanner = new Scanner(System.in);
  for (int i = 0; i < 3; i++) {

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
  