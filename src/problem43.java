import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram {
	private static final int R = 50;
	private GOval circle;
	private GObject lastPressed;
	private int prevX;
	private int prevY;

	public void run() {
		circle = new GOval(2 * R, 2 * R);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - R, getHeight() / 2 - R);
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		lastPressed = obj;
		if (obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}