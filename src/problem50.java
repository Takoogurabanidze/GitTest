import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram {

	public void run() {
		String text = readLine("Enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			tokenizer.nextToken();
			count++;
		}
		println(count);
	}

}