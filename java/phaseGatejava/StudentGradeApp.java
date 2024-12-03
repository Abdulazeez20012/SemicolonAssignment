import java.util.Scanner;
    public class StudentGradeApp {
      public static void main (String[] args) {
          Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of student: ");
int numberStudent = scanner.nextInt();

System.out.print("Enter the number of subject: ");
int numberSubject = scanner.nextInt();

int[][] scores = new int[numberStudent][numberSubject];

        for (int a = 0; a < numberStudent; a++) {
            System.out.println("Enter scores for student " + (a + 1) + ":");
		for (int b = 0; b < numberSubject; b++){
		     int score;
			do {
			     System.out.print("Enter score for subject" + (b + 1) + " (0-100) :");
                    score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                          System.out.println(" Please enter a score between 0 and 100.");
                    }
                } while (score < 0 || score > 100);
                scores[a][b] = score;
            }
        }
}

}

