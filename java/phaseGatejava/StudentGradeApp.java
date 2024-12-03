import java.util.Scanner;
    public class StudentGradeApp {
      public static void main (String[] args) {
          Scanner scanner = new Scanner(System.in);

System.out.print("How many student do you have? : ");
int numberStudent = scanner.nextInt();

System.out.print("How many subject do you offer? : ");
int numberSubject = scanner.nextInt();

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
System.out.println("Saved Successfully");

int[][] scores = new int[numberStudent][numberSubject];
int[] totals = new int [numberStudent];
double[] averages = new double[numberStudent];
         

		int totalScore = 0;
        for (int a = 0; a < numberStudent; a++) {
		
            System.out.println("\nEnter scores for student "  +  (a + 1)+":");
		for (int b = 0; b < numberSubject; b++){
		     int score;
			do {
			     System.out.println("Enter score for subject" + (b + 1)+":");
                    score = scanner.nextInt();
			     System.out.println("=================================================================");
                    if (score < 0 || score > 100) {
                          System.out.println(" Please enter a score between 0 and 100.");
                    }
                       } while (score < 0 || score > 100);
                         scores[a][b] = score; 
			 totals += score;
    			int arrayLength = score.lenght;
			averages = (totals / (double)arrayLength);


			System.out.println(" totals = " + score);
			System.out.println("averages = " + averages);
           		
      					 
        }



        }
}
     			 
}
