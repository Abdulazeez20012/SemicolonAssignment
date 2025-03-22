package LG;
import java.util.Random;

public class LudoGame {
    private int[] playerPositions;
    private boolean[] hasStarted;
    private int currentPlayer;
    private Random dice;

    public LudoGame(int numPlayers) {
        if (numPlayers < 2 || numPlayers > 4) {
            throw new IllegalArgumentException("Ludo requires 2-4 players.");
        }
        playerPositions = new int[numPlayers];
        hasStarted = new boolean[numPlayers];
        currentPlayer = 0;
        dice = new Random();
    }

    public int rollDice() {
        return dice.nextInt(6) + 1;
    }

    public boolean movePlayer(int player, int roll) {
        if (player < 0 || player >= playerPositions.length) {
            throw new IllegalArgumentException("Invalid player number.");
        }

        if (!hasStarted[player] && roll != 6) {
            return false;
        }

        if (roll == 6) {
            hasStarted[player] = true;
        }

        if (hasStarted[player]) {
            playerPositions[player] += roll;
        }

        return true;
    }

    public boolean hasWon(int player) {
        return playerPositions[player] >= 57;
    }

    public int getPlayerPosition(int player) {
        return playerPositions[player];
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void nextTurn() {
        currentPlayer = (currentPlayer + 1) % playerPositions.length;
    }
}
