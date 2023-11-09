import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter n: ");
		int a = readInt("enter a: ");
		for (int m = n; m <= n; m--) {
			if (n % m == 0 && a % m == 0) {
				println(m);
				break;
			}
		}
	}

}
