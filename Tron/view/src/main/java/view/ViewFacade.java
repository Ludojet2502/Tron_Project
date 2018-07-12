package view;

import javax.swing.JOptionPane;

import controller.IGame;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

	/** the fenetre. */
	private IFenetre fenetre;
	
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * this method call the constructor of Fenetre for create a new window
     * @param g - the Window
     */
    public void createWindow(IGame g) {
    	this.fenetre = new Fenetre(g);
    }
    
    /**
     * This method permit to set the inputListener
     * @param g - The 
     */
    public void setInputListener(IGame g) {
    	g.setInputListener(new InputListener());
    }

}
