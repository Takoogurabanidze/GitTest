import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem40 extends GraphicsProgram {
	private static final int R = 50;

	public void run() {
		GOval oval = new GOval(2 * R, 2 * R);
		int x = 0;
		int y = getHeight() / 2 - R;
		add(oval, x, y);
		oval.setFilled(true);
		int vx = 2;
		int vy = 0;
		while (true) {
			if ((oval.getX() + 2 * R >= getWidth()) || (oval.getX() < 0)) {
				vx = -vx;
			}
			oval.move(vx, vy);
			pause(20);
		}
	}

}