import java.util.Scanner;

public class MBTITest {

    public static void main(String[] args) {

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

  
        int[] eI = new int[2]; 
        int[] sN = new int[2]; 
        int[] tF = new int[2]; 
        int[] jP = new int[2]; 

        
        Scanner scanner = new Scanner(System.in);

        
        int i = 0;
        do {
           
            System.out.println(questions[i]);
            System.out.print("Enter your choice (A/B): ");
            String choice = scanner.nextLine().toUpperCase();  

            
            if (choice.equals("A")) {
                
                if (i == 0 || i == 4 || i == 5 || i == 9 || i == 12 || i == 13 || i == 16 || i == 17) {
                    eI[0]++;  
                } else if (i == 1 || i == 6 || i == 7 || i == 10 || i == 11 || i == 14 || i == 15 || i == 18) {
                    sN[0]++;
                } else if (i == 2 || i == 3 || i == 8 || i == 19) {
                    tF[0]++;  
                }

                
                if (i < 10 || (i >= 16 && i < 20)) {
                    jP[0]++;
                }

            } else if (choice.equals("B")) {
                
                if (i == 0 || i == 4 || i == 5 || i == 9 || i == 12 || i == 13 || i == 16 || i == 17) {
                    eI[1]++;  
                } else if (i == 1 || i == 6 || i == 7 || i == 10 || i == 11 || i == 14 || i == 15 || i == 18) {
                    sN[1]++;  
                } else if (i == 2 || i == 3 || i == 8 || i == 19) {
                    tF[1]++;  
                }

                
                if (i < 10 || (i >= 16 && i < 20)) {
                    jP[1]++;  
                }

            } else {
                
                System.out.println("Invalid input. Please enter 'A' or 'B'.");
                continue;  
            }

            i++;  
        } while (i < questions.length); 

        String type = "";
        type += (eI[0] > eI[1]) ? "E" : "I";  
        type += (sN[0] > sN[1]) ? "S" : "N";  
        type += (tF[0] > tF[1]) ? "T" : "F";  
        type += (jP[0] > jP[1]) ? "J" : "P"; ss

        
        System.out.println("\nYour MBTI type is: " + type);
    }
}
