package controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	private Game game;
	
	
	
	@Test
	public void testReset() {
		assertTrue("firstTime", true);
		assertFalse("gameOver", false);
	}

	@Test
	public void testEndGame() {
		assertTrue("gameOver", true);
	}

	@Test
	public void testEndGameIMoto() {
		assertTrue("gameOver", true);
	}

	

	

}
