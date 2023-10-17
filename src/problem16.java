import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram{
	public void run(){
		//კონსოლიდან წაიკითხეთ სამი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო ჰარმონიული.
		//შეგახსენებთ, რომ სამი რიცხვის საშუალო ჰარმონიულის გამოთვლის ფორმულა არის 
		
		double a = readDouble("enter the first number: ");
		double b = readDouble("enter the second number: ");
		double c = readDouble("enter the third number: ");
		
		double answer= 1/(1/a+1/b+1/c);
		print(answer);
		
		
		
	}

}
