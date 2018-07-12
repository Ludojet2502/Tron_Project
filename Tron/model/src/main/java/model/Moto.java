package model;

import model.*;
/**
 * <h1>The Class Moto.</h1>
 * @author Ludovic PIERSON
 *
 */
public class Moto implements IMoto{
	
	/** The X */
	private int x = 0;
	
	/** The Y */
    private int y = 0;

    /** The Id of the player */
    private int joueur;

    /** The name of the player */
    public String nom;

    /** The direction */
    private Direction direction;

    /**
     * The constructor of the Class
     * @param joueur - Id of the player
     * @param nom - name of the player
     */
    public Moto(int joueur, String nom) {
        this.joueur = joueur;
        this.nom = nom;
        reset();
    }
    
    /**
     * This method permit to initialize the position for a new game.
     */
    public void reset() {
        if(joueur == 1) direction = Direction.DROITE;
        if(joueur == 2) direction = Direction.GAUCHE;
    }
    
    /**
     * Get X of the position
     */
    public int getX() {
        return x;
    }

    /**
     * Set the X of the position 
     * @param x - X position of the LightCycle
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get Y of the position
     */
    public int getY() {
        return y;
    }

    /**
     * Set Y of the position
     * @param y - Y position of the LightCycle
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Get the direction 
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Set the position
     * 
     * @param direction - Orientation ( Direction ) of the LightCycle
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Get the name.
     * 
     * @return nom - the name
     */
	@Override
	public String getName() {
		return this.nom;
	}
    
}
