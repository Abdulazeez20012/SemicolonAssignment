import java.util.Scanner;

  public class TaskDepartment {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
System.out.println("Department\n1. IT\n2. HR\n3. Finance");
 int department = input.nextInt();
 switch(department) {
  case 1:
   System.out.println("Role\n1. Manager\n2. Analyst\n3. Intern");
    int manager = input.nextInt();
    switch(manager) {
      case 1:
     System.out.println("You are doing well manager");
     break;
      case 2:
     System.out.println("You are doing well Analyst");
     break;
      case 3:
     System.out.println("You are doing well Intern");
     break; 
    }
     break;
      case 2:
      System.out.println("Role\n1. Manager\n2. Analyst\n3. Intern");
       int Analyist = input.nextInt();
       switch(Analyst) {
             case 1:
     System.out.println("You are doing well manager");
     break;
      case 2:
     System.out.println("You are doing well Analyst");
     break;
      case 3:
     System.out.println("You are doing well Intern");
     break; 
      }
     break;
     case 3: 
 System.out.println("Role\n1. Manager\n2. Analyst\n3. Intern");
       int intern = input.nextInt();
       switch(intern) {
     case 1:
     System.out.println("You are doing well manager");
     break;
      case 2:
     System.out.println("You are doing well Analyst");
     break;
      case 3:
     System.out.println("You are doing well Intern");
     break; 
   
  }
     break;
}
}
}
