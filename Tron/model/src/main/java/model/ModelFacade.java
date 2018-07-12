package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /**
     * this method send the data of the game at the end of the game. 
     * 
     * @param name - the name of the player 
     * @param time - the duration of the game
     * @throws SQLException
     */
    @Override
    public void sendDataGame( String name, int time) throws SQLException {
    	ExampleDAO.sendDataGame(name, time);
    }
    
    /**
     * This method permit to create a new moto.
     * 
     * @param joueur - id of the player 
     * @param nom - name of the player
     */
    public IMoto createMoto(int joueur, String nom) {
    	return new Moto( joueur, nom);
    }

}
