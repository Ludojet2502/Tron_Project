package view;

import java.awt.*;
import javax.swing.*;
import view.InputListener;
import controller.IDeplacement;

public class Fenetre implements IFenetre{
	
	public static void create(){
        JFrame f = new JFrame("Tron");
        InputListener inputListener = new InputListener();
        Deplacement g = new Deplacement(inputListener);
        g.setBackground(Color.BLACK);
        f.setSize(600, 400);
        f.add(g);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(inputListener);
    }
}
