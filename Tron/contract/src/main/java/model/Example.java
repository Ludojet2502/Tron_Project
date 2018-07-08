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
    private final int id;

    /** The name. */
    private String    name;
    
    /** The name of the winner */
    private String vainqueur;

    /**
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     * @param vainqueur
     * 			  the winner           
     * 
     */
    public Example(final int id, final String name) {
        super();
        this.id = id;
        this.name = name;
        
    }
    
    public String setName() {
    	return this.vainqueur;
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
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getId() + " : " + this.getName();
    }
}
