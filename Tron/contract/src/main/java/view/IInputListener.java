package view;

import java.awt.event.KeyEvent;
import model.IMoto;
import controller.IGame;;

/**
 * <h1>The Interface IInputListener.</h1>
 * 
 * @author Ludovic PIERSON
 *
 */
public interface IInputListener {
	
	/**
	 * initialize the both players and the game
	 * 
	 * @param player1 - the player 1
	 * @param player2 - the player 2
	 * @param game - the game
	 */
	void debut(IMoto player1, IMoto player2, IGame game);
	
	/**
	 * set up the direction of the player when a key was pressed
	 * 
	 * @param e - fro recupt the code
	 */
	void keyPressed(KeyEvent e);
}
