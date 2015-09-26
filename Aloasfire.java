package com.aloasfire.dev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Aloasfire  extends JFrame implements ActionListener {

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
	
	
	public static void einstell(){
		JFrame einstell = new JFrame("Einstellungen");
		einstell.setVisible(true);
		einstell.setSize(600, 600);
		JLabel t1 = new JLabel();
		t1.setText("Lautst\u00e4rke");
		einstell.add(t1);
		JSlider Ls = new JSlider(0, 255, 0);
		einstell.add(Ls);
	}
	public static void fenster(){
		
		
		JFrame fenster = new JFrame("Game");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(650,350);
		fenster.setVisible(true);
		fenster.add(new gui());
		
		
		
			
		}
		
	//public static void auswahl(){
		
	//}
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		

		if (e.getSource()== schliessen ){
			fenster();	
		}
		if(e.getSource() == einstellung){
			einstell();
		}
		
		if (e.getSource() == info ){
			Object[] options = { "OK"};
			
			JOptionPane.showOptionDialog(null,"Programm developed by Aloasfire ink.","Information",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);	
		}
		
		if(e.getSource() == einstellung){
			
		//	auswahl();
		
		}
		
		if(e.getSource() == ende){
			System.exit(0);
		}
		
	}

}
