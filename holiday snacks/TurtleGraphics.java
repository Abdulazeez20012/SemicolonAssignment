import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        int[][] floor = new int[20][20];
        

        int x = 0, y = 0; 
        int penStatus = 1;
        int direction = 0; 


        int[] commands = {5, 10, 3, 5, 12, 6, 9}; 

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case 1: 
                    penStatus = 1;
                    break;
                case 2:
                    penStatus = 2;
                    break;
                case 3: 
                    direction = (direction + 1) % 4;
                    break;
                case 4: 
                    direction = (direction + 3) % 4;
                    break;
                case 5: 
                    int steps = 10;
                    if (i + 1 < commands.length) {
                        steps = commands[++i];
                    }
                    for (int j = 0; j < steps; j++) {
                        if (penStatus == 2) {
                            floor[x][y] = 1;           }
                        if (direction == 0) x++; 
                        else if (direction == 1) y++; 
                        else if (direction == 2) x--; 
                        else if (direction == 3) y--;
                    }
                    break;
                case 6: 
                    displayFloor(floor);
                    break;
                case 9:
                    System.out.println("End of program");
                    return;
            }
        }
    }

    public static void displayFloor(int[][] floor) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (floor[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
