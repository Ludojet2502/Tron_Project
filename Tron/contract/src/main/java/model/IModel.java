package model;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	/**
	 * the method for send information of the game
	 * 
	 * @param name - the name of the winner
	 * @param time - the duration of the game
	 * @throws SQLException - the SQL Exception
	 */
	void sendDataGame( String name, int time) throws SQLException;
	
    
    /**
     * Create the both "LightCycle"
     * 
     * @param joueur - Number of the player 1 or 2
     * @param nom - name of the player
     * @return two lightCycle
     */
    IMoto createMoto(int joueur, String nom);
}
