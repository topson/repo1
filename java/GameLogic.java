
class GameLogic {
	
	static int counter = 0;
	static int retMessage;

	public static int checkMove(String[][] currBoard, int input){
		int column = (input-1) % 3;
		int row = Math.abs(column);

		if (currBoard[row][column] != "X" && currBoard[row][column] != "O"){
			if (counter % 2 == 0){
				retMessage = 2;
			}
			else {
				retMessage = 3;
			}
			counter++;
		}
		else {
			retMessage = 9;
		}
		return retMessage;
	}

	public static boolean gameOver(String[][] currBoard){
		
		boolean over = false;
		return over;
	}
		
}
