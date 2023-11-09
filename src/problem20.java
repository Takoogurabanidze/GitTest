import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram {
	public void run() {

		int sum = 0;
		int n = readInt("enter amount of number: ");
		for (int i = 0; i < n; i++) {
			int a = readInt("enter number to sum: ");
			sum = sum + a;
		}
		print("The sum is: " + sum);

	}

}
