package model;

import model.*;

public abstract class Moto implements IMoto{
	private int x = 0;
    private int y = 0;

    private int joueur;

    public String nom;

    private Direction direction;

    public Moto(int joueur, String nom) {
        this.joueur = joueur;
        this.nom = nom;
        reset();
    }
    
    public void reset() {
        if(joueur == 1) direction = Direction.DROITE;
        if(joueur == 2) direction = Direction.GAUCHE;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
