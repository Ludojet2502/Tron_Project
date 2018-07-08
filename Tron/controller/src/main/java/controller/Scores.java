package controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class Scores extends JFrame {

	private JPanel contentPane;
	public JLabel NewLabel1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scores frame = new Scores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scores() {
		
		setTitle("Score de fin de partie !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomDuPerdant = new JLabel("Nom du perdant :");
		lblNomDuPerdant.setBounds(127, 88, 111, 16);
		contentPane.add(lblNomDuPerdant);
		
		JLabel lblTempsDeJeu = new JLabel("Temps de jeu :");
		lblTempsDeJeu.setBounds(127, 132, 111, 16);
		contentPane.add(lblTempsDeJeu);
		
		JLabel lblScoreDeLa = new JLabel("Score de la partie");
		lblScoreDeLa.setFont(new Font("Verdana", Font.ITALIC, 22));
		lblScoreDeLa.setForeground(Color.RED);
		lblScoreDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreDeLa.setBounds(127, 27, 209, 28);
		contentPane.add(lblScoreDeLa);
		
		JLabel NewLabel1 = new JLabel("New label1");
		NewLabel1.setBounds(240, 88, 83, 16);
		contentPane.add(NewLabel1);
		//NewLabel1.setText();
		
		
		
		JLabel NewLabel2 = new JLabel("New label2");
		NewLabel2.setBounds(240, 132, 83, 16);
		contentPane.add(NewLabel2);
		//NewLabel2.setText();
	}
}
