import java.util.Scanner;

public class TicTacToe {
    
    public enum Cell {
        X, O, EMPTY
    }

    private Cell[][] board; 
    private int turnCount;    

    public TicTacToe() {
        board = new Cell[3][3];   
        turnCount = 0;             
       
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = Cell.EMPTY;
            }
        }
    }


    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public boolean checkWin(Cell player) {
       
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }
       
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    public boolean checkDraw() {
        return turnCount == 9;
    }

    public boolean makeMove(int row, int col, Cell player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == Cell.EMPTY) {
            board[row][col] = player;
            turnCount++;
            return true;
        }
        return false;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Cell currentPlayer = Cell.X; 

        while (true) {
            printBoard();
            System.out.println(currentPlayer + "'s turn. Enter row and column (0, 1, or 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (makeMove(row, col, currentPlayer)) {
                if (checkWin(currentPlayer)) {
                    printBoard();
                    System.out.println(currentPlayer + " wins!");
                    break;
                }
                if (checkDraw()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

             
                currentPlayer = (currentPlayer == Cell.X) ? Cell.O : Cell.X;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
