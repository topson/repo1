import java.util.*;
import java.io.*;

class Board {
	
	public static String [][]currBoard = new String[3][3];
	
	public String[][] getBoard (){

		return this.currBoard;

	}
	
	public void setBoard (Renderer board){
		
		this.currBoard=Renderer.board;	
	}

	
}
