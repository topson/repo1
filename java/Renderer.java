import java.util.*;
import java.io.*;

class Renderer{
	public static String [][]board = new String[3][3];
	String values [] = {"|", " "};
	String box=values[0]+values[1]+board+values[1]+values[0];

	public String[][] initialize (){
		int counter = 0;
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				counter++;
				board[i][j]=String.valueOf(counter);
				if (j==2){
					System.out.print(box+"\n");
				}
				else{
					System.out.print(box);
				}
			}
		}
		return board;
	}
	public String[][] draw (Board currBoard){
		for (int row=0; row<3; row++){
			for (int column=0; column<3; column++){
				board[row][column]=Board.currBoard[row][column];
				if (column==2){
					System.out.print(box+"\n");
				}
				else {
					System.out.print(box);
				}
			}
		}

	return board;
	}
}
