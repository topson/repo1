import java.util.*;
import java.io.*;

class Renderer{

	public static String [][] board = new String[3][3];
	static String values [] = {"|", " ", "X", "O"};
	static String boxString = values[0] + values[1] + "%s" + values[1] + values[0];

	public static String[][] initialize (){

		int counter = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				counter++;
				board[i][j] = "" + counter; 
				String formattedString = String.format(boxString, counter);
				if (2 == j){
					formattedString += "\n";
				}
				System.out.print(formattedString);
			}
		}	
		return board;
	}

	public String[][] draw (String[][] currBoard, int inp, int retMessage){
		int calcColumn = inp - 1;
		int calcRow = Math.abs(calcColumn / 3);
		for (int row = 0; row < 3; row++){
			for (int column = 0; column < 3; column++){
				if (row == calcRow && column == (calcColumn % 3)){
					board[row][column] = values[retMessage];
				}
				else{
					board[row][column]=currBoard[row][column];
				}
					String formattedString = String.format(boxString, board[row][column]);
				if (2 == column){
					formattedString += "\n";
				}
				System.out.print(formattedString);
			}
		}
		
	return board;
	}
}
