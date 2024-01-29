import acm.program.ConsoleProgram;

public class problem55 extends ConsoleProgram{
	
	public void run(){
		boolean ans= true;
		int n = readInt("enter n: ");
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = readInt("enter a number : ");
		}
		for(int i = 0 ; i < array.length - 1; i++){
			if(array[i + 1] < array[i]){
				ans = false;
				break;
			}
		}
		println(ans);
	}

}