package view;

import static org.junit.Assert.*;

import org.junit.Test;

public class InputListenerTest {

	InputListener inputListener;
	
	@Test
	public void testDebut() {
		assertTrue("debut", true);
	}

	@Test
	public void testKeyPressedKeyEvent() {
		assertNotNull("e", new InputListener());
	}

}
