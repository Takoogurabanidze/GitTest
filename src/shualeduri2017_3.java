import acm.program.ConsoleProgram;

public class shualeduri2017_3 extends ConsoleProgram {
	public void run() {

		println(spellWord("ar", "baro"));
	}

	public boolean spellWord(String a, String b) {
		boolean ans = false;
		String str = "";

		if (a.length() <= b.length()) {
			for (int i = 0; i < a.length(); i++) {
				str = "";
				char chA = a.charAt(i);
				str = str + chA;
				if (b.contains(str)) {
					ans = true;
				} else {
					ans = false;
					return false;
				}
			}
		} else {
			for (int i = 0; i < b.length(); i++) {
				str = "";
				char chA = b.charAt(i);
				str = str + chA;
				if (a.contains(str)) {
					ans = true;
				} else {
					ans = false;
					return false;
				}
			}
		}

		return ans;
	}
}
