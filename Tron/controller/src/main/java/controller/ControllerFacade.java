package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import controller.Game;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    private String vainqueur;
    
    private int tempsFinal;
    
    private Game game;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        //this.getView().displayMessage(this.getModel().getExampleById(1).toString());

        //this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

        /*final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());*/
        
    	
    	
        
    	
        IGame g = new Game(this.getModel().createMoto(1, "Player1"), this.getModel().createMoto(2, "Player2"));
        this.getView().setInputListener(g);
        System.out.println("test reset");
        g.reset();
        
        //g.endGame(g.getWinner());
        
         	
        System.out.println("test avant create");
        this.getView().createWindow(g);
        System.out.println("test apres create");
        

        long currentTime;
        double dt;
        double fps = 60.0;
        long lastTime = -1;
        
                
        while(!g.isGameOver()) {
        	 currentTime = System.currentTimeMillis();
             dt = (currentTime - lastTime)/1000.0;
             
             if (dt*fps >= 1.0) {
                 lastTime = currentTime;
                 System.out.println("Update While");
             	g.update();
             }
        	
        }
        
        
        
        String nom;
    	if (g.getWinner() == null) {
    		nom = "Pas de Vainqueur";
    	}else {
    		nom = g.getWinner().getName();
    	}
    	
        this.getModel().sendDataGame(nom, g.getTempsFinale());
        
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}
