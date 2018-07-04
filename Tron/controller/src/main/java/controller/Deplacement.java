package controller;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;


public class Deplacement extends JPanel implements ActionListener, IDeplacement {

	public static int DELTA = 1;
    public static int SIZE = 1;
    public static int DELAY = 5;

    private Timer timer = new Timer(DELAY, this);
    
    Moto player1 = new Moto(1, "Player1");
    Moto player2 = new Moto(2, "Player2");
    Moto loser;
    
    boolean firstTime = true;
    boolean gameOver = false;

    private InputListener inputListener;

    public Deplacement(InputListener inputListener) {
        this.inputListener = inputListener;
    }

    List<Point> points = new ArrayList<Point>();        // Point générale
    List<Point> onePoints = new ArrayList<Point>();     // Point pour le joueur 1
    List<Point> twoPoints = new ArrayList<Point>();     // poibt pour le joueur 2
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (firstTime){
            reset();
            firstTime = false;
        }
        g2d.setColor(Color.GREEN);
        for(Point p : onePoints) {
            g2d.fill(new Rectangle2D.Double(p.getX(), p.getY(), SIZE, SIZE));
        }

        g2d.setColor(Color.RED);
        for(Point p : twoPoints) {
            g2d.fill(new Rectangle2D.Double(p.getX(), p.getY(), SIZE, SIZE));
        }

        if(gameOver) {
            //TODO Bryson run explode code using the 'loser Biker'
            if(loser == null) {
                //TODO Explode both players
            } else {
                System.out.println("Explode " + loser.name);
            }
            timer.stop(); //TODO Remove stop()
        }
    }
    
    public void reset() {
        timer.stop();

        firstTime = true;
        gameOver = false;

        player1.setX(getWidth()*1/10 - SIZE + 1);
        player1.setY(getHeight()*1/2);

        player2.setX(getWidth()*9/10);
        player2.setY(getHeight()* 1/2);

        points.clear();
        onePoints.clear();
        twoPoints.clear();

        player1.reset();
        player2.reset();
        loser = null;

        timer.start();

        inputListener.ready(player1, player2, this);
    }
    
    public void endGame() {
        timer.stop();

        gameOver = true;
    }

    public void endGame(Moto loser) {
        this.loser = loser;
        gameOver = true;
    }

    public void pause() {
        if(!gameOver) {
            if(timer.isRunning()) {
                timer.stop();
            } else {
                timer.start();
            }
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if(!gameOver) {
            switch(player1.getDirection()){
                case HAUT:
                    player1.setY(player1.getY() - DELTA);
                    break;
                case DROITE:
                    player1.setX(player1.getX() + DELTA);
                    break;
                case BAS:
                    player1.setY(player1.getY() + DELTA);
                    break;
                case GAUCHE:
                    player1.setX(player1.getX() - DELTA);
                    break;
            }
            switch(player2.getDirection()){
                case HAUT:
                    player2.setY(player2.getY() - DELTA);
                    break;
                case DROITE:
                    player2.setX(player2.getX() + DELTA);
                    break;
                case BAS:
                    player2.setY(player2.getY() + DELTA);
                    break;
                case GAUCHE:
                    player2.setX(player2.getX() - DELTA);
                    break;
            }
            //Afficher dans une fenetre Pop UP
            Point oneP = new Point(player1.getX(), player1.getY());
            Point twoP = new Point(player2.getX(), player2.getY());

            if(points.contains(oneP) && points.contains(twoP)) {
                System.out.println("NO WIN");
                endGame();
            } else if(points.contains(oneP)) {
                System.out.println("TWO WINS");
                endGame(player1);
            } else if(points.contains(twoP)) {
                System.out.println("ONE WINS");
                endGame(player2);
            } else if(oneP.x == 0 || oneP.x == getWidth() || oneP.y == 0 || oneP.y == getHeight()) {
                System.out.println("TWO WINS");
                endGame(player1);
            } else if(twoP.x == 0 || twoP.x == getWidth() || twoP.y == 0 || twoP.y == getHeight()) {
                System.out.println("ONE WINS");
                endGame(player2);
            } else {
                points.add(oneP);
                points.add(twoP);

                onePoints.add(oneP);
                twoPoints.add(twoP);
            }
        }
        repaint();
    }
}
