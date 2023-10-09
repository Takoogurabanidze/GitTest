import stanford.karel.SuperKarel;

public class problem2 extends SuperKarel{

	public void run(){
		
		moveToTHeBeeperPile();
		pickTenBeepers();
		move();
		putTenBeepers();
	
		}
	
	private void putTenBeepers() {
		for(int i=0;i<10;i++ ){
			putBeeper();
		}
		
	}

	private void pickTenBeepers() {
		for(int i=0; i<10; i++){
			pickBeeper();
		}
		
		
	}

	private void moveToTHeBeeperPile() {
		for(int i=0; i<4; i++){
			move();
	
	


		
			}


	}

	
	}

	

