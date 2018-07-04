package view;

import java.awt.*;

import javax.swing.*;

public class Fenetre {
	
	public static void create(){
        JFrame f = new JFrame("Tron");
        InputListener inputListener = new InputListener();
        Draw g = new Draw(inputListener);
        g.setBackground(Color.BLACK);
        f.setSize(600, 400);
        f.add(g);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(inputListener);
    }
}
