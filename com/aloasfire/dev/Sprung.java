package com.aloasfire.dev;

public class Sprung extends Thread {

	static boolean fertig = true;
	boolean hochpunkt = false;
	
	
	int sprunghoehe = 86;
	static int ursprungsY = 235; 
	static int sprungposition = ursprungsY;
	
	
	public Sprung(){
		
	}
	
	public void run(){
		
		
		fertig = false;
		
		int Verzoegerung;
				
		while (fertig == false){
			
			Sprung();
			
			 
		
				Verzoegerung =3;
			
			try{
				Thread.sleep(Verzoegerung);
				
			}catch (Exception e)
			{}
			
			
			
		}
		
		hochpunkt= false;
		
	}
	
	
	public void Sprung(){
		if ( hochpunkt == false ){
			sprungposition--;	
		}
		
		if (sprungposition == (ursprungsY-sprunghoehe)){
			hochpunkt = true;
		}
		
		if ( hochpunkt == true && sprungposition <= ursprungsY){
			sprungposition++;
			if(sprungposition == ursprungsY){
				fertig = true;
			}
		}
		
	}
	
		
	}

