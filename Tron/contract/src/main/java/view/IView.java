package view;

import controller.IGame;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);

    /**
     * Create Window 
     * 
     * @param g - The window
     */
	void createWindow(IGame g);
	
	/**
	 * set the inputListener 
	 * 
	 * @param g - the game
	 */
	public void setInputListener(IGame g);
}
