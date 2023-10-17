import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class problem12 extends GraphicsProgram{
	public void run(){
		
		walls();
     	door();
		roof();
	    window();
		
	 

	}

	private void roof() {
		int width = 200;
		int height = 250;
		int T = 1;
		int x = (getWidth() - width)/ 2 ;
		int y = (getHeight() - height) - T;
		GPoint[] points = { 
		new GPoint(x, y), 
		new GPoint(x + width, y), 
		new GPoint(x + width / 2, y - 60) };
		GPolygon roof = new GPolygon(points);
		roof.setFilled(true);
		roof.setColor(Color.BLACK);
		add(roof);
		
	}

	private void window() {
		int width = 40;
		int height = 45;
		int x = getWidth() / 2 + width / 2;
		int y = getHeight() - 220;
		GRect window = new GRect(width, height);
		window.setFilled(true);
		window.setColor(Color.DARK_GRAY);
		add(window, x, y);
		
	}

	private void door() {
		int width = 50;
		int height = 70;
		int T = 1;
		int x = (getWidth() - width)/ 2 ;
		int y = (getHeight() - height) - T;
		GRect door = new GRect(width, height);
		door.setFilled(true);
		door.setColor(Color.CYAN);
		add(door, x, y);
		
	}

	private void walls() {
		int width = 200;
		int height = 250;
		int T = 1;
		int x = (getWidth() - width)/ 2 ;
		int y = (getHeight() - height) - T;
		GRect wall = new GRect(width, height);
		wall.setFilled(true);
		wall.setColor(Color.BLUE);
		add(wall, x, y);
		
	}

}
