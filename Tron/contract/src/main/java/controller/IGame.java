package controller;

import java.awt.event.ActionListener;

import view.IInputListener;


public interface IGame extends ActionListener{

	void setInputListener(IInputListener inputListener);
	
	
}
