package view;

import java.awt.event.KeyEvent;
import model.IMoto;

public interface IInputListener {
	
	void debut(Moto player1, Moto player2, Draw draw);
	
	void keyPressed(KeyEvent e);
}
