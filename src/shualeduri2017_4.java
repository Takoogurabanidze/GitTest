import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class shualeduri2017_4 extends ConsoleProgram {

	private static final int EXPERIMENT_COUNT = 10;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int SENTINEL = 0;

	public void run() {
		println(countSequence(100));
	}

	public int countSequence(int n) {

		int counter = 0;

		int newN = n;

		for (int i = 0; i < EXPERIMENT_COUNT; i++) {
			while (true) {
				int doN = rgen.nextInt(1, 2);
				if (doN == 1) {

					newN = newN / 2;

				}
				if (doN == 2) {
					newN = newN - 1;

				}
				counter++;

				if (newN == SENTINEL) {
					break;
				}
			}
		}
		return counter / EXPERIMENT_COUNT;
	}
}
