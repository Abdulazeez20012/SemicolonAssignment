import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycle {
    private int cycleLength;
    private int periodLength;
    private LocalDate lastPeriodStart;

    public MenstrualCycle(int cycleLength, int periodLength, String lastPeriodStart) {
        this.cycleLength = cycleLength;
        this.periodLength = periodLength;
        this.lastPeriodStart = LocalDate.parse(lastPeriodStart, DateTimeFormatter.ISO_DATE);
    }

    public String calculateOvulationDate() {
        LocalDate ovulationDate = lastPeriodStart.plusDays(cycleLength / 2);
        return ovulationDate.toString(); 
    }

    public String calculateSafePeriod() {
        LocalDate ovulationDate = LocalDate.parse(calculateOvulationDate());
        LocalDate safeStartBefore = ovulationDate.minusDays(10);
        LocalDate safeEndBefore = ovulationDate.minusDays(7);
        LocalDate safeStartAfter = ovulationDate.plusDays(1);
        LocalDate safeEndAfter = ovulationDate.plusDays(6);

        return safeStartBefore + " to " + safeEndBefore + " and " + safeStartAfter + " to " + safeEndAfter;
    }

    public String calculateNextPeriodStartDate() {
        LocalDate nextPeriod = lastPeriodStart.plusDays(cycleLength);
        return nextPeriod.toString(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Menstrual Cycle Calculator!");

        System.out.print("Enter the length of your menstrual cycle (in days): ");
        int cycleLength = scanner.nextInt();

        System.out.print("Enter the length of your period (in days): ");
        int periodLength = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the start date of your last period (in yyyy-mm-dd format): ");
        String lastPeriodStart = scanner.nextLine();

        MenstrualCycle cycle = new MenstrualCycle(cycleLength, periodLength, lastPeriodStart);

        System.out.println("\nOvulation Date: " + cycle.calculateOvulationDate());
        System.out.println("Safe Period: " + cycle.calculateSafePeriod());
        System.out.println("Next Period Start Date: " + cycle.calculateNextPeriodStartDate());

      
    }
}
