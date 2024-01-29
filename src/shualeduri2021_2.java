import acm.program.ConsoleProgram;

public class shualeduri2021_2 extends ConsoleProgram {
	public void run() {
		println(amIYourFatherLuke("AAATGCGTCGS", "ATTGCCGTA"));

	}

	public boolean amIYourFatherLuke(String a, String l) {
	
	
		for (int i = 0; i < l.length(); i++) {
			for (int j = 0; j < a.length(); j++) {

				String subL = l.substring(i, j);
				if (a.contains(subL) && subL.length() > a.length() / 2) {
					return true;
				}

			}
		}

		return false;
	}

}
