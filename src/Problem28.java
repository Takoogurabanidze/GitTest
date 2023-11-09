import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		int amount = 0;
		while (true) {

			int n = readInt("n: ");
			if (n == -1) {
				break;
			}
			if (n % 2 == 0) {
				amount++;

			}
		}
		print(amount);
	}

}
