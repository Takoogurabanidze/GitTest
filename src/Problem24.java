import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter number: ");
		int amount = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				amount++;
			}
		}
		println(amount);
	}

}
