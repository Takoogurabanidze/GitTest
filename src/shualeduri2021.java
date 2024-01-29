import acm.program.ConsoleProgram;

public class shualeduri2021 extends ConsoleProgram{
	
	
	public void run(){

		println(log(9,90));
	}
	public int log(int a, int b){
		int i = a;
		int ans = 0;
		while(i<=b){
			i=a*i;
			ans++;
		}
		return ans;
		
	}

}
