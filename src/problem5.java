import stanford.karel.SuperKarel;

public class problem5 extends SuperKarel{
	public void run(){
		
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
				}
			move();
	
		}
		if(noBeepersPresent()){
			putBeeper();
		}
		
		
	}

}
