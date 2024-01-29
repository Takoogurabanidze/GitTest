import acm.program.ConsoleProgram;

public class shualeduri2017_2 extends ConsoleProgram {

	public void run() {
		println(ifPrime(25));
		println(getBiggestDivisor(49 * 121));
	}

	public boolean ifPrime(int n) {
		boolean ans = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				ans = false;
			}
		}
		return ans;
	}

	public int getBiggestDivisor(int n) {
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			boolean primeI = ifPrime(i);
			if (ifPrime(i)) {
				if (n % i == 0 && ans < i) {
					ans = i;
				}
			}
		}

		return ans;
	}
}
