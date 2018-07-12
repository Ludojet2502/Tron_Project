package model;



public interface IMoto {

	/**
	 *  the method for reset the game 
	 */
	void reset();
	
	/**
	 * get the X 
	 * 
	 * @return x - the X for the position
	 */
	int getX();
	
	/**
	 * set the X of the position
	 * @param x - the X
	 */
	void setX(int x);
	
	/**
	 * get the y of the position
	 * @return y - the Y for the position
	 */
	int getY();
	
	/**
	 * the method for set the Y
	 * @param y - the Y
	 */
	void setY(int y);
	
	/**
	 * get the direction of the direction
	 * 
	 * @return direction - the direction
	 */
	Direction getDirection();
	
	/**
	 * set the direction 
	 * @param direction - the Direction
	 */
	void setDirection(Direction direction);
	
	/**
	 * get the name 
	 * 
	 * @return name - the name
	 */
	String getName();
}
