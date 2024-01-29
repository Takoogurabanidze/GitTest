import acm.program.ConsoleProgram;

public class shualeduri2019_1 extends ConsoleProgram{
	public void run(){
		println(IsPallindrom(233233442));
	}

	public boolean IsPallindrom(int x){
	
	
		int rev = 0;
		int m=x;
		while (m != 0) {
			rev = rev * 10 + m % 10;
			m /= 10;
		} 
		if(rev==x){
			return true;
		}else{
			return false;
		}
		
	

	}
}
