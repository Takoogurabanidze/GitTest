import org.w3c.dom.Text;

import acm.program.ConsoleProgram;

public class problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		for (int i = 0; i < text.length(); i++) {
			int matches = calculateMatches(text.charAt(i), text, i);
			if (matches != 0) {
				println(text.charAt(i) + " " + matches);
			}
		}
	}

	private int calculateMatches(char charAt, String text, int i) {
		char character = text.charAt(i);
		int match = 0;
		for (int k = i - 1; k >= 0; k--) {
			if (text.charAt(i) == text.charAt(k)) {
				return 0;
			}
		}
		for (int j = 0; j < text.length(); j++) {
			if (character == text.charAt(j)) {
				match++;
			}
		}

		return match;
	}

}