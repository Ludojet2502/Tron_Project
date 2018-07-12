package view;

import java.awt.*;
import javax.swing.*;
import view.InputListener;
import controller.IGame;

/**
 * 
 * @author Ludovic PIERSON
 *
 */
public class Fenetre implements IFenetre{
	/** the height. */
	public int height = 400;
	
	/** the width. */
	public int width = 600;
	
	/**
	 * the constructor can create the Window
	 * 
	 * @param g - Parametre for the new Panel
	 */
	public Fenetre(IGame g){
		JPanel p = (JPanel)g;
        JFrame f = new JFrame("Tron");
        InputListener inputListener = new InputListener();
        
        g.setInputListener(inputListener);
        p.setBackground(Color.BLACK);
        f.setSize(width, height);
        f.add(p);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(inputListener);
        
    }
}
