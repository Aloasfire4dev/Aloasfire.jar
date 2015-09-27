package com.aloasfire.dev;

import javax.sound.sampled.*;

public class Sound1{
	

	public static synchronized void playSound() {
		  new Thread(new Runnable() {
		  
		    public void run() {
		      try {
		        Clip clip = AudioSystem.getClip();
		        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
		          Aloasfire.class.getResourceAsStream("/Sounds/S1.mp3"));
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}
	
}
