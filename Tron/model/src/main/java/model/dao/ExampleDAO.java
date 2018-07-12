package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;
import controller.IGame;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql insert information. */
    private static String sqlinfoGame = "{call infoEndGame( ?, ?)}";

    /** the game. */
    static IGame game;
    
    /**
     * 
     * @param name - Name of the player
     * @param time - duration of the Game
     * @throws SQLException - the SQL exception
     */
    public static void sendDataGame( String name, int time) throws SQLException {
    	final CallableStatement callStatement = prepareCall(sqlinfoGame);
    	
    	callStatement.setString(1, name);
    	
    	callStatement.setInt(2, time);
    	
    	callStatement.execute();
    	
    }
}
