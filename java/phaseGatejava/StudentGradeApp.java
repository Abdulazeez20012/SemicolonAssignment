import java.util.Scanner;

public class StudentGradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("How many students do you have? ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("How many subjects do they offer? ");
        int numberOfSubjects = scanner.nextInt();

 	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully.");
       
       
        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        int[] totals = new int[numberOfStudents];
        double[] averages = new double[numberOfStudents];

      
        int[] subjectTotals = new int[numberOfSubjects];
        int[] subjectPasses = new int[numberOfSubjects];
        int[] subjectFails = new int[numberOfSubjects];
        int[] subjectHighest = new int[numberOfSubjects];
        int[] subjectLowest = new int[numberOfSubjects];

       
        for (int a = 0; a < numberOfStudents; a++) {
            System.out.println("Enter scores for student " + (a + 1));
            int total = 0;

            for (int j = 0; j < numberOfSubjects; j++) {
                int score;
                do {
                    System.out.print("Enter score for subject " + (j + 1) + ": ");
          	 score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("it is not among the assigned range of number given  Score must be between 0 and 100.");
                    }
			} while (score < 0 || score > 100);

               		 scores[a][a] = score;
               		 total += score;

              
               	 subjectTotals[a] += score;
                if (score >= 50) subjectPasses[a]++;
                	else subjectFails[a]++;

                
                if (a == 0 || score > scores[subjectHighest[a]][a]) {
                    subjectHighest[a] = a;
                }
                if (a == 0 || score < scores[subjectLowest[a]][a]) {
                    subjectLowest[a] = a;
                }
            
            }

            totals[a] = total;
            averages[a] = total / (double) numberOfSubjects;
        }
	System.out.println("===============================================================");
         System.out.println("Student \tSub1 \tSub2 \tSub3 \tTot \tAve \tPos");
	System.out.println("===============================================================");
        for (int a = 0; a < numberOfStudents; a++) {
            System.out.print(" Student "   + "\t" +  (a + 1) );
            for (int b = 0; b < numberOfSubjects; b++) {
                System.out.print(scores[a][b]);

            }
            System.out.println(totals[a] + "\t" + ( averages[a]) + "\t" + (a + 1));
        }

	System.out.println("===============================================================");

   for (int b = 0; b < numberOfSubjects; b++) {
            int highestScore = scores[subjectHighest[b]][b];
            int lowestScore = scores[subjectLowest[b]][b];
            int totalScore = subjectTotals[b];
            double averageScore = totalScore / (double) numberOfStudents;

            System.out.println("Subject " + (b + 1));
            System.out.println("Highest scoring student is: Student " + (subjectHighest[b] + 1) + " scoring " + highestScore);
            System.out.println("Lowest scoring student is: Student " + (subjectLowest[b] + 1) + " scoring " + lowestScore);
            System.out.println("Total score is: " + totalScore);
            System.out.println("Average score is: " + (averageScore));
            System.out.println("Number of passes: " + subjectPasses[b]);
            System.out.println("Number of fails: " + subjectFails[b]);
       
        }

int classTotalScore = 0;
        double classAverageScore = 0;
        int bestStudent = 0;
        int worstStudent = 0;

        for (int a = 0; a < numberOfStudents; a++) {
            classTotalScore += totals[a];
            if (totals[a] > totals[bestStudent]) {
                bestStudent = a;
            }
            if (totals[a] < totals[worstStudent]) {
                worstStudent = a;
            }
        }


        classAverageScore = classTotalScore / (double) numberOfStudents;

        System.out.println("Class Total Score: " + classTotalScore);
        System.out.println("Class Average Score: " + (classAverageScore));
        System.out.println("Best Graduating Student is: Student " + (bestStudent + 1) + " scoring " + totals[bestStudent]);
        System.out.println("Worst Graduating Student is: Student " + (worstStudent + 1) + " scoring " + totals[worstStudent]);
    }
}
