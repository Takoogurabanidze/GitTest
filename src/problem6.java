import stanford.karel.SuperKarel;

public class problem6 extends SuperKarel{

	public void run(){
		
		move();
		moveFirstPileToDestinationAndBackup();
		move();
		moveSecondPileToDestinationAndBackup();
		restoreFromBackup();
		restoreFromBackup();
	}

	private void moveSecondPileToDestinationAndBackup() {
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromfirstPileToDestination();
			backupBeeper();
		}
		
	}

	private void moveFirstPileToDestinationAndBackup() {
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromfirstPileToDestination();
			backupBeeper();
		}
		
	}

	private void backupBeeper() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		
	}

	private void moveBeeperFromfirstPileToDestination() {
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
	}
	
}
