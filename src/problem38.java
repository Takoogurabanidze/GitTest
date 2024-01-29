import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int n=500;

	public void run() {
		double moneyWeHave = n;
		double winningScore = rgen.nextInt(36);
		double yourBetScore = rgen.nextInt(36);
		double bet;
		double counter = 0;
		for (int i = 0; i < 1000; i++) {
			while (moneyWeHave > 0) {
				if (moneyWeHave >= n) {
					bet = 1;
				} else {

					if (moneyWeHave >= (n - moneyWeHave + 1) / 36) {
						bet = (n - moneyWeHave + 1) / 36;
					} else {
						bet = moneyWeHave;
					}
				}
				if (winningScore == yourBetScore) {
					moneyWeHave += bet * 36;
					counter++;

				} else {
					moneyWeHave -= bet;
					counter++;
				}
			}
		}
		println(counter / 1000);
	}
}