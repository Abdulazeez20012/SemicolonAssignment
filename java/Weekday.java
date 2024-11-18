
import java.util.Scanner;

public class Weekday{
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
     
     } 


  }