import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int R = 50;
	private static final int PAUSE_MS = 20;
	private static final int vx = 2;

	public void run() {

		GOval oval = new GOval(2 * R, 2 * R);
		int x = 0;
		int y = getHeight() / 2 - R;
		add(oval, x, y);
		oval.setFilled(true);
		while (oval.getX() <= getWidth() - 2 * R) {
			int vy = 0;
			oval.move(vx, vy);
			pause(PAUSE_MS);
		}
	}

}