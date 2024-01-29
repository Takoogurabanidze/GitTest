import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram {
	GOval circle;

	public void run() {
		circle = new GOval(2 * 50, 2 * 50);
		circle.setFilled(true);
		addMouseListeners();
		while (true) {
			circle.move(0, 5);
			pause(20);
		}
	}

	public void mouseClicked(MouseEvent e) {
		add(circle, e.getX() - 50, e.getY() - 50);
	}
}