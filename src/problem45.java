import acm.program.ConsoleProgram;

public class problem45 extends ConsoleProgram {
	public void run() {
		String text = readLine("enter word: ");
		String s= readLine("Enter symbol: ");
		char symbol = s.charAt(0);
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				num++;
			}
		}
		println(num);

	}
}