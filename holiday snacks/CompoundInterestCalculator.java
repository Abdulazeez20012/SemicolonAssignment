import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter initial investment: ");
        double initialInvestment = scanner.nextDouble();
        
       
       		 System.out.print("Enter monthly contribution:  ");
       		 double monthlyContribution = scanner.nextDouble();
        

        		System.out.print("Enter length of time in years: ");
       			 int years = scanner.nextInt();
        
        
        			System.out.print("Enter annual interest rate : ");
       				 double interestRate = scanner.nextDouble();
        

       					 System.out.print("Enter interest rate variance range: ");
       					 double variance = scanner.nextDouble();
        
         
       						 System.out.print("Enter compound frequency: ");
       						 int compoundFrequency = scanner.nextInt();
     
       	System.out.println("\nCalculating compound interest:");

       for (double rate = interestRate - variance; rate <= interestRate + variance; rate += 0.01)  {
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
