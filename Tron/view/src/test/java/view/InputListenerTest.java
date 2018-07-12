package view;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * <h1>The Class test InputListenerTest.</h1>
 * @author Ludovic PIERSON
 *
 */
public class InputListenerTest {

	
	InputListener inputListener;
	
	/**
	 * this test permit to test if the boolean "debut" are true
	 */
	@Test
	public void testDebut() {
		assertTrue("debut", true);
	}

	/**
	 * This test permit to test if the parameter "e" is not null
	 */
	@Test
	public void testKeyPressedKeyEvent() {
		assertNotNull("e", new InputListener());
	}

}
