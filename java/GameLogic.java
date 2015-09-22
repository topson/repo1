
class GameLogic {
	
	static int counter = 0;
	static int retMessage;

	public static int checkMove(String[][] currBoard, int input){
		int column = input - 1;
		int row = Math.abs(column / 3);

		if (currBoard[row][column % 3] != "X" && currBoard[row][column % 3] != "O"){
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
		int gg = -1;

		if (2 == retMessage){
			if (currBoard[1][1] == "X"){
				if(currBoard[1][0] == "X" && currBoard[1][2] == "X"){
					gg = 1;
				}
				else if(currBoard[0][0] == "X" && currBoard[2][2] == "X"){
					gg = 1;
				}
				else if(currBoard[2][0] == "X" && currBoard[0][2] == "X"){
					gg = 1;
				}
				else if(currBoard[0][1] == "X" && currBoard[2][1] == "X"){
					gg = 1;
				}
			}
			else if (currBoard[0][0] == "X"){
				if (currBoard[1][0] == "X" && currBoard[2][0] == "X"){
					gg = 1;
				}
				else if (currBoard[0][1] == "X" && currBoard[0][2] == "X"){
					gg = 1;
				}
			}
			else if (currBoard[2][2] == "X"){
				if (currBoard [0][2] == "X" && currBoard[1][2] == "X"){
					gg = 1;
				}
				else if (currBoard[2][0] == "X" && currBoard[2][1] == "X"){
					gg = 1;
				}
			}
			if (1 == gg){
				System.out.println("GAME OVER, Player1 wins");
				over = true;
			}
		}
		else if(3 == retMessage){
			if (currBoard[1][1] == "O"){
				if(currBoard[1][0] == "O" && currBoard[1][2] == "O"){
					gg = 1;
				}
				else if(currBoard[0][0] == "O" && currBoard[2][2] == "O"){
					gg = 1;
				}
				else if(currBoard[2][0] == "O" && currBoard[0][2] == "O"){
					gg = 1;
				}
				else if(currBoard[0][1] == "O" && currBoard[2][1] == "O"){
					gg = 1;
				}
			}
			else if (currBoard[0][0] == "O"){
				if (currBoard[1][0] == "O" && currBoard[2][0] == "O"){
					gg = 1;
				}
				else if (currBoard[0][1] == "O" && currBoard[0][2] == "O"){
					gg = 1;
				}
			}
			else if (currBoard[2][2] == "O"){
				if (currBoard [0][2] == "O" && currBoard[1][2] == "O"){
					gg = 1;
				}
				else if (currBoard[2][0] == "O" && currBoard[2][1] == "O"){
					gg = 1;
				}
			}
			if(1 == gg){
				System.out.println("GAME OVER, Player2 wins");
				over = true;
			}
		}
		return over;
	}
		
}
