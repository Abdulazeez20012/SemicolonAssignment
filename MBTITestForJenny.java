import java.util.Scanner;

public class MBTITestForJenny {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
            
	System.out.println("What is your name:  ");
	String name = scanner.nextLine();
	

        String[] questions = {
            "1. A expand energy, enjoy groups.(E) \nB conserve energy, enjoy one-on-one.(I)",
            "2. A interpret literally.(S) \nB look for meaning and possibilities.(N)",
            "3. A logical, thinking, questioning.(T) \nB empathic, feelings, accommodating.(F)",
            "4. A organized, orderly.(J) \nB flexible, adaptable.(P)",
            "5. A more outgoing, think out loud.(E) \nB more reserved, think to yourself.(I)",
            "6. A practical, realistic, experiential.(S) \nB imaginative, innovative, theoretical.(N)",
            "7. A candid, straightforward, frank.(T) \nB tactful, kind, encouraging.(F)",
            "8. A plan, schedule.(J) \nB unplanned, spontaneous.(P)",
            "9. A seek many tasks, public activities, interaction with others.(E) \nB seek private, solitary activities with quiet to concentrate.(I)",
            "10. A standard, usual, conventional.(S) \nB different, novel, unique.(N)",
            "11. A firm, tend to criticize, hold the line.(T) \nB gentle, tend to appreciate, conciliate.(F)",
            "12. A regulated, structured.(J) \nB easygoing, 'live' and let 'live'.(P)",
            "13. A external, communicative, express yourself.(E) \nB internal, reticent, keep to yourself.(I)",
            "14. A focus on here-and-now.(S) \nB look to the future, global perspective, 'big picture'.(N)",
            "15. A tough-minded, just.(T) \nB tender-hearted, merciful.(F)",
            "16. A preparation, plan ahead.(J) \nB go with the flow, adapt as you go.(P)",
            "17. A active, initiate.(E) \nB reflective, deliberate.(I)",
            "18. A facts, things, what is.(S) \nB ideas, dreams, what could be, philosophical.(N)",
            "19. A matter of fact, issue-oriented.(T) \nB sensitive, people-oriented, compassionate.(F)",
            "20. A control, govern.(J) \nB latitude, freedom.(P)"
        
        };


		       int[] responses = new int[20];

			int[] eCount = 0;
			int[] iCount = 0;
			int[] sCount = 0;
			int[] nCount = 0;
			int[] tCount = 0;
			int[] fCount = 0;
			int[] jCount = 0;
			int[] pCount = 0;



			
      			  for (int i = 0; i < questions.length; i++) {
           			 System.out.println(questions[i]);
                                 System.out.print("Enter your choice (A/B): ");
                                 String choice = scanner.nextLine().toUpperCase();


           				if (choice.equals("A")) {
              				       responses[i] = 1; 
          			       } else if (choice.equals("B")) {
              					  responses[i] = 2;
            			       } else {
                			    System.out.println("Invalid input, please enter A or B.");
               					 i--; 
                		

			int[] eCount = 0;
			int[] iCount = 0;
			int[] sCount = 0;
			int[] nCount = 0;
			int[] tCount = 0;
			int[] fCount = 0;
			int[] jCount = 0;
			int[] pCount = 0;




          	  }
        }

    }
}
 