import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter n: ");
		int a = readInt("enter a: ");
		for (int m = 1; m <= n * a; m++) {
			if (m % n == 0 && m % a == 0) {
				println(m);
				break;
			}
		}
	}

}
