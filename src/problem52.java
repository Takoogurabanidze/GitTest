import java.io.*;

import acm.program.ConsoleProgram;

public class problem52 extends ConsoleProgram {

	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("52"));
			while (true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}