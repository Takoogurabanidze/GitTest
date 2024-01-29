import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {

	public void run() {
		String text = readLine("Enter text: ");
		int maxCount = 0;
		int maxChar;
		for (int i = 0; i < text.length(); i++) {
			int num = 0;
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) == text.charAt(i)) {
					num++;
				}
			}

			if (num > maxCount) {
				maxCount = num;
				maxChar = text.charAt(i);
			}
		}

	}

}