package com.aloasfire.dev;

import javax.swing.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Aloasfire  extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4254370175792140925L;
	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;
	
	
	
	public static void main(String[] args) {
		Aloasfire frame = new Aloasfire("Men\u00fc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
	
	public Aloasfire(String title){
		
		super(title);
		
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(120,40,160,40);
		schliessen.addActionListener(this);
		add(schliessen);
		
		einstellung	 = new JButton("Einstellungen");
		einstellung.setBounds(120,120,160,40);
		einstellung.addActionListener(this);
		
		add(einstellung);
		
		info = new JButton("Credits");
		info.setBounds(120,200,160,40);
		info.addActionListener(this);
		add(info);
		
		ende = new JButton("Ende");
		ende.setBounds(120,280,160,40);
		ende.addActionListener(this);
		add(ende);
		
		
		
	}
	
	
	public static void fenster(){
		
		
		JFrame fenster = new JFrame("Game");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(650,350);
		fenster.setVisible(true);
		fenster.add(new gui());
		
		String p = "Sound1.mp3";
		try{
		FileInputStream in = new FileInputStream(p);
		
		Player p1 = new Player(in);
		p1.play();
		}
		catch(JavaLayerException jle){
			jle.printStackTrace();
		}
		catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
	}
		
		
		
		
			
		
		
	//public static void auswahl(){
		
	//}
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		

		if (e.getSource()== schliessen ){
			fenster();	
		}
		if(e.getSource() == einstellung){
			Object[] options = { "OK"};

			JOptionPane.showOptionDialog(null,"Bald kannst du hier Einstellungen Vornmen","Coming soon",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);	

			// new Einstellungen();
			
		}
		
		if (e.getSource() == info ){
			Object[] options = { "OK"};
			
			JOptionPane.showOptionDialog(null,"Programm developed by Aloasfire ","Information",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);	
		}
		
		if(e.getSource() == einstellung){
			
		//	auswahl();
		
		}
		
		if(e.getSource() == ende){
			System.exit(0);
		}
		
		
	}
}
	
 
