import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	private static final int R = 30;

	public void run() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		addBall(e.getX(), e.getY());
	}

	public void mouseDragged(MouseEvent e) {
		addBall(e.getX(), e.getY());
	}

	private void addBall(int x, int y) {
		GOval ball = new GOval(2 * R, 2 * R);
		ball.setFilled(true);
		add(ball, x - R, y - R);
	}
}