package test.java.is.task.TicTacToe;

import main.java.is.task.TicTacToe.Game;
import main.java.is.task.TicTacToe.Square;
import org.junit.Test;

import static org.junit.Assert.*;


public class GameTest {

	@Test
    public void testGameInitializeBoard() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        assertEquals(1, temp[0][0].getSquareNumber());
        assertEquals(2, temp[0][1].getSquareNumber());
        assertEquals(3, temp[0][2].getSquareNumber());
        assertEquals(4, temp[1][0].getSquareNumber());
        assertEquals(5, temp[1][1].getSquareNumber());
        assertEquals(6, temp[1][2].getSquareNumber());
        assertEquals(7, temp[2][0].getSquareNumber());
        assertEquals(8, temp[2][1].getSquareNumber());
        assertEquals(9, temp[2][2].getSquareNumber());

        assertEquals('-', temp[0][0].getCurrentSquareMark());
        assertEquals('-', temp[0][1].getCurrentSquareMark());
        assertEquals('-', temp[0][2].getCurrentSquareMark());
        assertEquals('-', temp[1][0].getCurrentSquareMark());
        assertEquals('-', temp[1][1].getCurrentSquareMark());
        assertEquals('-', temp[1][2].getCurrentSquareMark());
        assertEquals('-', temp[2][0].getCurrentSquareMark());
        assertEquals('-', temp[2][1].getCurrentSquareMark());
        assertEquals('-', temp[2][2].getCurrentSquareMark());

        assertFalse(temp[0][0].getMarked());
        assertFalse(temp[0][1].getMarked());
        assertFalse(temp[0][2].getMarked());
        assertFalse(temp[1][0].getMarked());
        assertFalse(temp[1][1].getMarked());
        assertFalse(temp[1][2].getMarked());
        assertFalse(temp[2][0].getMarked());
        assertFalse(temp[2][1].getMarked());
        assertFalse(temp[2][2].getMarked());
    }

    @Test
    public void testCheckRowWin_AllSquaresAreXInRow1_ReturnTrue() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[0][1].setCurrentSquareMark('X');
        temp[0][2].setCurrentSquareMark('X');

        assertTrue(g.checkRowWin());
    }

    @Test
    public void testCheckRowWin_SquaresInRow1AreDifferent_ReturnFalse() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[0][1].setCurrentSquareMark('O');
        temp[0][2].setCurrentSquareMark('X');

        assertFalse(g.checkRowWin());
    }

    @Test
    public void testCheckSquares_AllSquaresAreSame_ReturnTrue() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[1][0].setCurrentSquareMark('X');
        temp[2][0].setCurrentSquareMark('X');

        assertTrue(g.checkSquares(temp[0][0], temp[1][0], temp[2][0]));
    }

    @Test
    public void testCheckSquares_SquaresAreDifferent_ReturnFalse() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[1][0].setCurrentSquareMark('O');
        temp[2][0].setCurrentSquareMark('X');

        assertFalse(g.checkSquares(temp[0][0], temp[1][0], temp[2][0]));
    }

        @Test
    public void testCheckColwWin_AllSquaresAreOInCol1_ReturnTrue() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[1][0].setCurrentSquareMark('X');
        temp[2][0].setCurrentSquareMark('X');

        assertTrue(g.checkColumnWin());
    }

    @Test
    public void testCheckColwWin_SquaresInCol1AreDifferent_ReturnFalse() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[1][0].setCurrentSquareMark('O');
        temp[2][0].setCurrentSquareMark('X');

        assertFalse(g.checkColumnWin());
    }

    @Test
    public void testCheckDiagonalwWin_AllSquaresAreX_ReturnTrue() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[1][1].setCurrentSquareMark('X');
        temp[2][2].setCurrentSquareMark('X');

        assertTrue(g.checkDiagonalWin());
    }

    @Test
    public void testCheckDiagonalwWin_SquaresAreDifferent_ReturnFalse() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setCurrentSquareMark('X');
        temp[1][1].setCurrentSquareMark('O');
        temp[2][2].setCurrentSquareMark('X');

        assertFalse(g.checkDiagonalWin());
    }

    @Test
    public void testCheckForTie_AllFieldsAreMarked_ReturnTrue() {
        Game g = new Game();
        Square[][] temp  = g.getGameBoard();

        temp[0][0].setMarked(true);
        temp[0][1].setMarked(true);
        temp[0][2].setMarked(true);
        temp[1][0].setMarked(true);
        temp[1][1].setMarked(true);
        temp[1][2].setMarked(true);
        temp[2][0].setMarked(true);
        temp[2][1].setMarked(true);
        temp[2][2].setMarked(true);

        assertTrue(g.checkForTie());
    }
}