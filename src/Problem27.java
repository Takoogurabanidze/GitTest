import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
	public void run() {
		int n0 = readInt("enter n: ");
		int m = readInt("enter m: "); // n^m

		int n = n0;
		for (int i = 1; i < m; i++) {
			n = n0 * n;

		}
		println(n);
	}

}
