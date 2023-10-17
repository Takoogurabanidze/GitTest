import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem13 extends GraphicsProgram {
	public void run(){
		 
		double y1= getHeight()/2;
		double x2= getWidth();
		double y2=y1;
		GLine middleLine = new GLine(0, y1 , x2, y2 );
		add(middleLine);
				
		
	}

}
