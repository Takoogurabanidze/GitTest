import java.util.*;

import acm.program.ConsoleProgram;

public class problem60 extends ConsoleProgram {
	public void run() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (true) {
			int n = readInt("? ");
			if (n == -1) {
				break;
			}
			arr.add(n);

		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			println(arr.get(i));
		}
	}

}
