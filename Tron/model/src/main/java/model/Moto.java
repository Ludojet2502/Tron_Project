package model;

import model.*;
/**
 * 
 * @author Ludovic PIERSON
 *
 */
public class Moto implements IMoto{
	private int x = 0;
    private int y = 0;

    private int joueur;

    public String nom;

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

	@Override
	public String getName() {
		return this.nom;
	}
    
}
