
class GameLogic {
	
	int counter = 0;

	public int checkMove(Board currBoard, int input){
		int retMessage;
		int column = input-1;
		int row = Math.abs(column/3);

		if (Board.currBoard[row][column%3]!="X" && Board.currBoard[row][column%3]!="O"){
			if (counter%2==0){
				retMessage=1;
			}
			else {
				retMessage=2;
			}
			counter++;
		}
		else {
			retMessage = 9;
		}
		return retMessage;
	}

	/*public boolean gameOver(Board currBoard){
		
		boolean over;

	}
	*/	
}
