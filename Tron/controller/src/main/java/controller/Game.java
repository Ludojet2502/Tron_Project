package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import model.IMoto;
import view.IInputListener;

/**
 * 
 * @author Ludovic PIERSON
 *
 */
public class Game extends JPanel implements IGame {

	public static int DELTA = 1;
    public static int SIZE = 1;
    public static int DELAY = 5;

    private Timer timer = new Timer(DELAY, this);
    
    private IMoto player1;
    private IMoto player2;
    private IMoto winner;
    
    boolean firstTime = true;
    boolean gameOver = false;

    private IInputListener inputListener;
    
    
    public int tempsFinale;
    public String vainqueur;
    
    JOptionPane jop1;
   
    /**
     * The constructor of the class
     * @param player1
     * @param player2
     */

    public Game(IMoto player1, IMoto player2) {
    	super();
        this.player1 = player1;
        this.player2 = player2;
    }

    List<Point> points = new ArrayList<Point>();        // Point g�n�rale
    List<Point> onePoints = new ArrayList<Point>();     // Point pour le joueur 1
    List<Point> twoPoints = new ArrayList<Point>();     // poibt pour le joueur 2
    
    /**
     * 
     * This method permit to draw the wall behind players
     * @param g
     */
    public void paintComponent(Graphics g){
    	
        super.paintComponent(g);
        
        Date dStart = new Date();
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        try {
			Image image = ImageIO.read(new File("/resources/Map_de_base2.jpg"));
			g2d.drawImage(image, SIZE, SIZE, this);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
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
           
            if(winner == null) {
               
            	System.out.println("Explode " + winner.getName());
            } else {
            	vainqueur = winner.getName();
                System.out.println("Explode " + winner.getName());
            }
            timer.stop(); 
            Date dStop = new Date(); 
            tempsFinale = (int) (dStop.getTime()- dStart.getTime()) ;
            System.out.println("Temps : "+ (tempsFinale+ " s"));
            
            jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "le joueur " + vainqueur+ " a gagn� en "+ tempsFinale +" s", "Recap' de la partie", JOptionPane.INFORMATION_MESSAGE);
            
            // Afficher les scores .....
            //Scores.main(null);
            
            
            
            
        }
    }
    
    /**
     * 
     * This method permit to describ how the reset work.
     * 
     */
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
        winner = null;

        timer.start();

        inputListener.debut(player1, player2, this);
    }
    
    /**
     * 
     * this Method permit to describ the first part of the end 
     */
    public void endGame() {
        timer.stop();

        gameOver = true;
    }

    /**
     * 
     * this method permit to describ what the program do when the players lose. 
     * 
     * @param loser
     */
    public void endGame(IMoto winner) {
        this.winner = winner;
        gameOver = true;
    }

    /**
     * 
     * This method permit to the put in pause the game
     * 
     */
    public void pause() {
        if(!gameOver) {
            if(timer.isRunning()) {
                timer.stop();
            } else {
                timer.start();
            }
        }
    }
    
    /**
     * 
     * this method permit to manage all the move
     * 
     * @param e
     */
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
    
    /**
     * Get the InputListener
     * 
     * @return inputListener
     */
    public IInputListener getInputListener() {
        return this.inputListener;
    }
    
    /**
     * Set the InputListener
     * 
     * @param inputListener
     */
    public void setInputListener(IInputListener inputListener) {
    	this.inputListener = inputListener;
    }

	
}
