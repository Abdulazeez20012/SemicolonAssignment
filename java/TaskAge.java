import java.util.Scanner;
	public class TaskAge {
		public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("slot in your age:  ");	
	int age = scanner.nextInt();
		
		if (age==0 || age<=12){
			System.out.println("Child");
		}
		  else if(age==13 || age <=17){
			System.out.println("Teen");
		} 
	          else if(age==18 || age <= 64){

			System.out.println("Adult");

		} else if (age >= 65){

			System.out.println("Senior");





}

}


}