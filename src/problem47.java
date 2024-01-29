import acm.program.ConsoleProgram;

public class problem47 extends ConsoleProgram {

	public void run() {
		String word = readLine(" word: ");
		int matchingChars = 0;
		for(int i = 0; i < word.length() / 2; i++) {
			if(word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				matchingChars++;
		}
	}
		if(matchingChars == word.length() / 2){
			println("palindrome");
		} else{
			println("no palindrome");
		}
		
	}
}