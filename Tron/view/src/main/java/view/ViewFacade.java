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
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * this method call the constructor of Fenetre for create a new window
     * @param g
     */
    public void createWindow(IGame g) {
    	this.fenetre = new Fenetre(g);
    }

}
