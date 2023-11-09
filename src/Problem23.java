import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram{
	public void run(){
		int n = readInt("enter n: ");
		int sum = 0;
		while(n>0){
			sum=sum+n;
			n--;
		}
		println(sum);
	}

}
