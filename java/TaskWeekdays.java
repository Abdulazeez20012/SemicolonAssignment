import java.util.Scanner; 
	public class TaskWeekDays {
		public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);

		System.out.print("slot in number between (1-7):  ");

		int daysnumber = Scanner.nextInt();
Switch(weekdays); {
 case 1:
 System.out.println("Monday is  1");
break;
case 2:
 System.out.println("Tuesday is  2");
 break;

case 3:
 System.out.println("Wednesday is 3");
break;
case 4:
 System.out.println("Thursday is 4");
 break;
case 5: 
System.out.println("Friday is 5");
break;
case 6:
 System.out.println("Saturday is 6");
 break;
case 7:
 System.out.println("Sunday is 7");
 break;
default:
 System.out.println("The number is not 1-7");
 break;

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

 }


 }


}