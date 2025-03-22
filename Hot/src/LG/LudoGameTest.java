package LG;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LudoGameTest {
    private LudoGame game;

    @Before
    public void setUp() {
        game = new LudoGame(2);
    }

    @Test
    public void testGameStartsWithZeroPosition() {
        game.rollDice();
        assertEquals(0, game.getPlayerPosition(0));
        assertEquals(0, game.getPlayerPosition(1));
    }

    @Test
    public void testPlayerCannotMoveWithoutRollingSix() {
        game.rollDice();
        assertFalse(game.movePlayer(0, 3));
        assertEquals(0, game.getPlayerPosition(0));
    }

    @Test
    public void testPlayerStartsOnRollingSix() {
        game.rollDice();
        assertTrue(game.movePlayer(0, 6));
        assertEquals(6, game.getPlayerPosition(0));
    }

    @Test
    public void testPlayerMovesCorrectlyAfterStarting() {
        game.rollDice();
        game.movePlayer(0, 6);
        game.movePlayer(0, 4);
        assertEquals(10, game.getPlayerPosition(0));
    }

    @Test
    public void testGameWinCondition() {
        game.rollDice();
        for (int i = 0; i < 10; i++) {
            game.movePlayer(0, 6);
        }
        assertTrue(game.hasWon(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerThrowsException() {
        game.rollDice();
        game.movePlayer(3, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTooManyPlayersThrowsException() {
        new LudoGame(5);
        game.rollDice();
    }

    @Test
    public void testTurnSwitchesCorrectly() {
        game.rollDice();
        assertEquals(0, game.getCurrentPlayer());
        game.nextTurn();
        assertEquals(1, game.getCurrentPlayer());
        game.nextTurn();
        assertEquals(0, game.getCurrentPlayer());
    }
}

