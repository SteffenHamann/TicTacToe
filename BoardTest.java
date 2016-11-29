import static org.junit.Assert.*;
import org.junit.*;

public class BoardTest {
	
	Board board = new Board();
	boolean result;

	@Before
	 public void clearBoard(){
		 board.clearBoard();
	 }

	 @Test
	 public void emptyBoard(){	

		 assertTrue(board.emptyBoardCheck());
	 }
	 
	 @Test
	 public void noWinner(){
		 
		 board.setMark("x", 0, 0);
		 board.setMark("x", 1, 1);
		 board.setMark("x", 2, 0);
		 board.setMark("o", 0, 2);
		 board.setMark("o", 1, 2);
		 board.setMark("o", 0, 1);
		 assertFalse(board.hasWinner());
		 
	 }
	 
	 @Test
	 public void winner(){
		 board.setMark("x", 0, 0);
		 board.setMark("x", 1, 0);
		 board.setMark("x", 2, 0);
		 board.setMark("o", 0, 2);
		 board.setMark("o", 1, 1);
		 board.setMark("o", 2, 2);
		 assertTrue(board.hasWinner()); 
	 }
	 
	 @Test (expected = ArithmeticException.class)
	 public void invalidInput(){
		 
		 board.setMark("x", 0, 3);
		 
	 }
	 
	 
}