import stanford.karel.SuperKarel;

public class problem7 extends SuperKarel{
	public void run(){
   
//		while nextLineExsists
		
          fillLine();
          while(leftIsClear()){
          
        	  
        	  moveToNextLineStart();
        	  fillLine();
          
          }
          
         
			
	}

	private void moveToNextLineStart() {
		turnLeft();
		move();
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnAround();
		
	}

	private void fillLine() {
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
