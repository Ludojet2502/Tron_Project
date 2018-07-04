package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import model.IMoto;

public abstract class InputListener extends KeyAdapter implements IInputListener, IMoto{
	
	Moto player1;
	Moto player2;

    Draw draw;

    boolean debut = false;

    public void debut(Moto player1, Moto player2, Draw draw) {
        this.player1 = player1;
        this.player2 = player2;
        this.draw = draw;
        debut = true;
    }
    
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        Moto.Direction direction1 = player1.getDirection();
        Moto.Direction direction2 = player2.getDirection();
        if (debut) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_W:
                    if(direction1 != Moto.Direction.BAS) player1.setDirection(Moto.Direction.HAUT);
                    break;
                case KeyEvent.VK_A:
                    if(direction1 != Moto.Direction.DROITE) player1.setDirection(Moto.Direction.GAUCHE);
                    break;
                case KeyEvent.VK_S:
                    if(direction1 != Moto.Direction.HAUT) player1.setDirection(Moto.Direction.BAS);
                    break;
                case KeyEvent.VK_D:
                    if(direction1 != Moto.Direction.GAUCHE) player1.setDirection(Moto.Direction.DROITE);
                    break;
                case KeyEvent.VK_UP:
                    if(direction2 != Moto.Direction.BAS) player2.setDirection(Moto.Direction.HAUT);
                    break;
                case KeyEvent.VK_LEFT:
                    if(direction2 != Moto.Direction.DROITE) player2.setDirection(Moto.Direction.GAUCHE);
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction2 != Moto.Direction.HAUT) player2.setDirection(Moto.Direction.BAS);
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction2 != Moto.Direction.GAUCHE) player2.setDirection(Moto.Direction.DROITE);
              
            }
        }
    
}
