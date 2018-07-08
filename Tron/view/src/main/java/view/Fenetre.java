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
	
	/**
	 * the constructor can create the Window
	 * 
	 * @param g
	 */
	public Fenetre(IGame g){
		JPanel p = (JPanel)g;
        JFrame f = new JFrame("Tron");
        InputListener inputListener = new InputListener();
        
        g.setInputListener(inputListener);
        p.setBackground(Color.BLACK);
        f.setSize(600, 400);
        f.add(p);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(inputListener);
    }
}
