package model;

import controller.IGame;
/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

    /** The id. */
    private int id;

    /** The name. */
    private String   name;
    
    /** The name of the winner */
    private String 	 vainqueur;
    
    /** the duration of the game. */
    private int 	 Time;

    /**
     * Instantiates a new example.
     *
     *
     * @param vainqueur
     * 			  the winner           
     * 
     */
    public Example(final int Time, final String vainqueur) {
        super();
        this.Time = Time;
        this.vainqueur = vainqueur;
        
    }
    
   
    
    
    
    public int setTime() {
    	return this.Time;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.vainqueur;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String vainqueur) {
        this.vainqueur = vainqueur;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.setTime() + " s : vainqueur " + this.getName();
    }
}
