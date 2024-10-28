import java.util.Scanner;

public class WeekdayNamejenny5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String weekdayName = getWeekdayName(dayNumber);

        if (weekdayName != null) {
            System.out.println("Weekday name: " + weekdayName);
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }

    public static String getWeekdayName(int dayNumber) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            return weekdays[dayNumber - 1];
        } else {
            return null;
        }
    }
}

