package model;



public interface IMoto {
	
	
	//void Moto(int joueur, String nom);
	
	void reset();
	
	int getX();
	
	void setX(int x);
	
	int getY();
	
	void setY(int y);
	
	Direction getDirection();
	
	void setDirection(Direction direction);
	
	String getName();
}
