import java.util.Scanner;

public class StudentGradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have: ");
        int numberStudents = scanner.nextInt();

        System.out.print("How many subject subject do they offer: ");
        int numberSubjects = scanner.nextInt();

        int[][] scores = new int[numberStudents][numberSubjects];
        int[] totalScores = new int[numberStudents];
        double[] averages = new double[numberStudents];

        for (int a = 0; a < numberStudents; a++) {
            System.out.println("\nEnter scores for Student " + (a + 1) + ":");

            int total = 0;

            for (int b = 0; b < numberSubjects; b++) {
                int score;
                do {
                    System.out.print("Enter score for Subject " + (b + 1) + " : ");
                    score = scanner.nextInt();
	
          if (score < 0 || score > 100) {
                        System.out.println("it is not among the assigned range Please enter a score between 0 and 100.");
                    }
                } while (score < 0 || score > 100);

                scores[a][b] = score;
                total += score;
            }

            totalScores[a] = total;
            averages[a] = total / (double) numberSubjects;
        }
      
        System.out.println("\nClass Summary:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s\n", "Student", "SUB", "TOT", "AVE", "POS");
        System.out.println("-------------------------------------------------------------");

        for (int a = 0; a < numberStudents; a++) {
            System.out.printf("%-15s%-10s%-10d%-10.2f%-10d\n", "Student " + (a + 1), numberSubjects, totalScores[a], averages[a], a + 1);
        

}

}

}