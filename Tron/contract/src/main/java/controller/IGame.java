package controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IMoto;
import view.IInputListener;


public interface IGame extends ActionListener{

	void setInputListener(IInputListener inputListener);
	
	public void reset();
	
	public void endGame();
	
	public void endGame(IMoto winner);
	
	public void pause();
	
	public void actionPerformed(ActionEvent e);
	
	public void paintComponent(Graphics g);
	
	public IMoto getWinner();
	
	public void setVainqueur(IMoto winner);
	
	public int getTempsFinale();
	
	public void setTempsFinale(int tempsFinale);
	
	public void update();
	
	public boolean isGameOver();
}
