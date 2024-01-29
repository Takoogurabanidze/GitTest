import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class problem53 extends ConsoleProgram {

	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("53"));
			String text = "";
			while (true) {
				String newLine = rd.readLine();
				if (newLine == null) {
					break;
				}
				text = text + newLine + "\n";
			}
			println(text);
			rd.close();
			countStatistics(text);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	private void countStatistics(String text) {
		int Symbols = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				Symbols++;
			}
		}
		int Lines = 1;
		for (int j = 0; j < text.length() - 1; j++) {
			if (text.charAt(j) == '\n') {
				Lines++;
			}
		}
		Symbols = Symbols - Lines;
		println(Symbols);
		println(Lines);

	}
}