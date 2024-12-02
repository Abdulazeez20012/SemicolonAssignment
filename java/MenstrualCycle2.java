import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualCycle2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Menstrual Cycle checker!");

     
        System.out.print("Enter the length of your menstrual cycle (in days): ");
        int cycleLength = scanner.nextInt();


        System.out.print("Enter the length of your period (in days): ");
        int periodLength = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the start date of your last period (in yyyy-mm-dd format): ");
        String lastPeriodStart = scanner.nextLine();

        LocalDate lastPeriod = LocalDate.parse(lastPeriodStart);

        LocalDate ovulationDate = lastPeriod.plusDays(cycleLength / 2);


        LocalDate safeStartBefore = ovulationDate.minusDays(10);
        LocalDate safeEndBefore = ovulationDate.minusDays(7);
        LocalDate safeStartAfter = ovulationDate.plusDays(1);
        LocalDate safeEndAfter = ovulationDate.plusDays(6);

        LocalDate nextPeriodStart = lastPeriod.plusDays(cycleLength);

        System.out.println("\nOvulation Date: " + ovulationDate);
        System.out.println("Safe Period: " + safeStartBefore + " to " + safeEndBefore + " and " + safeStartAfter + " to " + safeEndAfter);
        System.out.println("Next Period Start Date: " + nextPeriodStart);

    }
}
