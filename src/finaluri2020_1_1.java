import java.util.*;

import acm.program.ConsoleProgram;

public class finaluri2020_1_1 extends ConsoleProgram {
	public void run() {
		String res = rearrange("keep calm and code on");
		println(res);
	}

	private String rearrange(String string) {
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(string);
		ArrayList<String> sen = new ArrayList<String>();

		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			sen.add(word);
		}
		for (int i = 0; i < sen.size(); i++) {
			int minIndex = i;
			for (int j = i; j < sen.size(); j++) {
				if (sen.get(j).length() < sen.get(minIndex).length()) {
					minIndex = j;
				}
			}
			int j = minIndex;
			String tmp = sen.get(i);
			sen.set(i, sen.get(j));
			sen.set(j, tmp);
		}
		for (int i = 0; i < sen.size(); i++) {
			String words = sen.get(i);
			result += " " + words;
		}
		return result;
	}
}
