import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter initial investment: ");
        double initialInvestment = sc.nextDouble();
        
       
       		 System.out.print("Enter monthly contribution (positive for deposit, negative for withdrawal): ");
       		 double monthlyContribution = sc.nextDouble();
        

        		System.out.print("Enter length of time in years: ");
       			 int years = sc.nextInt();
        
        
        			System.out.print("Enter annual interest rate (as decimal): ");
       				 double interestRate = sc.nextDouble();
        

       					 System.out.print("Enter interest rate variance range  : ");
       					 double variance = sc.nextDouble();
        
        
       						 System.out.print("Enter compound frequency (times per year, 1 for annually, 4 for quarterly): ");
       						 int compoundFrequency = sc.nextInt();
     
       								 System.out.println("\nCalculating compound interest for the following scenarios:");

       for (double rate = interestRate - variance; rate <= interestRate + variance; rate += 0.01) {
        	 double totalAmount = initialInvestment;
          	double monthlyRate = rate / compoundFrequency;
            	int months = years * 12;
            
            		for (int i = 0; i < months; i++) {
               	    	    totalAmount += monthlyContribution; 

                if (i % (12 / compoundFrequency) == 0) { 
                    totalAmount *= (1 + monthlyRate);
                }
            }
            
           System.out.printf("Estimated amount at %.2f%% interest: %.2f\n", rate * 100, totalAmount);
        }
    }
}
