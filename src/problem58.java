import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram {
	public void run() {
		println(isAnagram("inoramak", "kamaroni"));

	}

	private boolean isAnagram(String str1, String str2) {

		int[] s1 = array(str1);
		int[] s2 = array(str2);


		if (Arrays.equals(s1, s2)) {
			return true;
		}

		return false;
	}

	private int[] array(String st) {
		int[] s = new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			int index = ch - 'a';
			s[index]++;

		}
		return s;

	}

}
