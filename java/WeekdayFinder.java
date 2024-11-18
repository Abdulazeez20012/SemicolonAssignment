

import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            String weekday = getWeekday(dayNumber);
            System.out.println("The weekday is: " + weekday);
        }

        scanner.close();
    }

    public static String getWeekday(int dayNumber) {
        String weekday;

        if (dayNumber == 1) {
            weekday = "Monday";
        } else if (dayNumber == 2) {
            weekday = "Tuesday";
        } else if (dayNumber == 3) {
            weekday = "Wednesday";
        } else if (dayNumber == 4) {
            weekday = "Thursday";
        } else if (dayNumber == 5) {
            weekday = "Friday";
        } else if (dayNumber == 6) {
            weekday = "Saturday";
        } else {
            weekday = "Sunday";
        }

        return weekday;
    }
}


