import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem56 extends ConsoleProgram {

	public void run() {
 		int n = readInt("enter n: ");
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int m = readInt("enter a number: ");
			myArray.add(m);
		}
		for (int j = myArray.size(); j > 1; j--) {
			int k = findMinimum(myArray);
			myArray.remove(k);
		}
		print(myArray.get(0));
	}

	private int findMinimum(ArrayList<Integer> myArray) {
		int min = myArray.get(0);
		for (int r = 0; r < myArray.size(); r++) {
			if (myArray.get(r) < min) {
				min = myArray.get(r);			
			}			
		}
		print(min);
		return myArray.indexOf(min);
	}
	

}