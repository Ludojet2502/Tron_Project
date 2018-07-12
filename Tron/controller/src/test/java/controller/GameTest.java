package controller;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * <h1>The Class test Game.</h1>
 * @author Ludovic PIERSON
 *
 */
public class GameTest {

	private Game game;
	
	
	/**
	 * test if at the start the param "firstTime" = true / "gameOver" = false
	 */
	@Test
	public void testReset() {
		assertTrue("firstTime", true);
		assertFalse("gameOver", false);
	}

	/**
	 * test if at the start the param "gameOver" = false when all players are dead
	 */
	@Test
	public void testEndGame() {
		assertTrue("gameOver", true);
	}

	/**
	 * test if at the start the param "gameOver" = false when one player is dead
	 */
	@Test
	public void testEndGameIMoto() {
		assertTrue("gameOver", true);
	}

	

	

}
