import java.util.Scanner;
	public class Tasktax {
		public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("slot in your Annual income:$  ");	
	double income = scanner.nextDouble();
	if (income==0 || income<=9875){
		System.out.print("10%");

	} else if(income==9876 && income<=40125){
		System.out.print("12%");

	} else if (income==40125 || income<=85525){
		System.out.print("22%");

         }else if(income>=85525){

		System.out.print("24%");
}
	

}
}


		