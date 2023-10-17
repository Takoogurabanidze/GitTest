import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicsPractice extends GraphicsProgram {
	public void run(){
		
		GOval myOval = new GOval(100, 200);
		add(myOval, 100, 100);
//		GOval myOval2 = new GOval(100, 200);
		GOval oldBall=myOval;
		myOval = new GOval(200, 200);
		add(myOval, 200, 200);
		add(myOval);
		myOval.setFilled(true);
		myOval.setColor(Color.RED);
	
		oldBall.setFilled(true);
		oldBall.setColor(Color.PINK);
		
	}

}
