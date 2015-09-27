package com.aloasfire.dev;


public class Block {

	final int X;
	final int Y;
	final int WIDTH;
	final int HEIGHT;
	boolean coin = false;
	final java.awt.Color COLOR;
	
	public Block(int p_x,int p_y, int p_Width, int p_Height,java.awt.Color p_color){
		X = p_x;
		Y = p_y;
		WIDTH = p_Width;
		HEIGHT = p_Height;
		COLOR = p_color;	
		
	}
	
	public boolean Kollisionsabfrage(int x_block, int y_block,int x_char,int y_char){
		
		

		if( x_char >= x_block && y_char >= y_block && y_char <= y_block + HEIGHT){
			if(x_char <= x_block+WIDTH){
				coin = true;
				return true;
			}else{
				if(x_char -40 <= x_block + WIDTH){
					coin = true;
					return true;
				}
			}
			
		}else{
			return false;
		}
		return false;
		
    }
	
	public int getX_Block(){
		return X;
	}
	
	public int getY_Block(){
		return Y;
	}
	
	public int getWidth(){
		return WIDTH;
	}
	
	public int getHeight(){
		return HEIGHT;
	}
	
	public java.awt.Color getFarbe() {
		return COLOR;
	}
	
	public boolean Coin(){ 
		return coin;
	}
}
