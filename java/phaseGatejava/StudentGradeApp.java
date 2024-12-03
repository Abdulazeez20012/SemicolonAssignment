import java.util.Scanner;
    public class StudentGradeApp {
      public static void main (String[] args) {
          Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of student: ");
int numberStudent = scanner.nextInt();

System.out.print("Enter the number of subject: ");
int numberSubject = scanner.nextInt();

int[][] scores = new int[numberStudent][numberSubject];

        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");



}






 }


}