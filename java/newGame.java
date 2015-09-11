
import java.util.*;
import java.io.*;

public class TTTGame{

	private static final String playerIcons[] = {"X", "O"};

	private boardData int[]; 
	
	private String i [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private int counter = 0;
	private boolean over = false;
	private String player;
	
	public void setOver(boolean overAndOut){
		over = overAndOut;
	}
	public void setCounter(int param){
		counter = param+1;
	}
	public void setInput(String[] input){
		i = input;
	}
	public void setPlayer(String spieler){
		player = spieler;
	}

	public TTTGame() {
		boardData = new int[9];
		for( int i = 0; i < 9; ++i) 
			boardData[i] = -1;
		}

	}

	public String getIconforSlot(int slot) {
		int value = boardData[slot];
		if( value == -1 ) {
			return " ";
		}
		else {
			return playerIcons[value];
		}
	}

	public void drawBoard() {

		System.out.println("-------------");
		System.out.println(" --- --- --- ");
		System.out.println("| " + getIconForSlot(0)+" | " + getIconForSlot(1)+" | " + getIconForSlot(2)+" |");
		System.out.println(" --- --- --- ");
		System.out.println(" --- --- --- ");
		System.out.println("| " + getIconForSlot(3)+" | " +  getIconForSlot(4) +" | " +  getIconForSloti(5)+" |");
		System.out.println(" --- --- --- ");
		System.out.println(" --- --- --- ");
		System.out.println("| " +  getIconForSlot(6)+" | " +  getIconForSlot(7)+" | " +  getIconForSlot(8)+" |");
		System.out.println(" --- --- --- ");
		System.out.println("-------------");
	}

	public void run () {

		while(!over) {
			drawBoard();
			choose();
			check();
			
		}

			System.out.println("The Game is over! "+ player + " has won!");
		
		else {
		setCounter(counter);
		choose();
		}
	}

	public void choose(){
		if (counter % 2 != 0){
			
			System.out.println ("Player" + currentPlayer + " choose your field(1-9)");
			Scanner sc = new Scanner(System.in);
			int inp = -1;
			
			try {
				sc.nextInt();
			}
			catch (InputMismatchException e1){

					System.out.println("Not a valid choice, please try again");
					return;
					
					choose();
			}



			if (inp < 1 || inp > 9){
				System.out.println("Not a valid choice, please try again");
				choose();
			}
			else {
				if (i[inp-1] != "X" && i[inp-1] != "O"){
					i[inp-1] = "O";
				}
				else {
					System.out.println("Not a valid choice, please try again");
					choose();
				}
			}
		}
		else {
			try {
			System.out.println ("Player2 choose your field(1-9)");
			Scanner sc = new Scanner(System.in);
			int inp = sc.nextInt();

			if (inp < 1 || inp > 9){
				System.out.println("Not a valid choice, please try again");
				choose();
			}
			else {
				if (i[inp-1] != "X" && i[inp-1] != "O"){
					i[inp-1] = "X";
				}
				else {
					System.out.println("Not a valid choice, please try again");
					choose();
				}
			}
			}catch (InputMismatchException e1){
			
					System.out.println("Not a valid choice, please try again");
					choose();
			}
		}
		setInput(i);
		check();
	}
	
	public void check (){
		if (((i[0]=="X") && (i[1]=="X") && (i[2]=="X")) || ((i[3]=="X") && (i[4]=="X") && 
			(i[5]=="X"))
			|| ((i[6]=="X") && (i[7]=="X") && (i[8]=="X")) || ((i[0]=="X") && (i[3]=="X") 
			&& (i[6]=="X"))
			|| ((i[1]=="X") && (i[4]=="X") && (i[7]=="X")) || ((i[2]=="X") && (i[5]=="X") 
			&& (i[8]=="X"))
			|| ((i[0]=="X") && (i[4]=="X") && (i[8]=="X")) || ((i[2]=="X") && (i[4]=="X") 
			&& (i[6]=="X"))) {
		setPlayer("Player2");
		setOver(true);	 
		run();
		}
		else if((i[0]=="O") && (i[1]=="O") && (i[2]=="O") ||  ((i[3]=="O") && (i[4]=="O") && 
			(i[5]=="X"))
			|| ((i[6]=="O") && (i[7]=="O") && (i[8]=="O")) || ((i[0]=="O") && (i[3]=="O") 
			&& (i[6]=="O"))
			|| ((i[1]=="O") && (i[4]=="O") && (i[7]=="O")) || ((i[2]=="O") && (i[5]=="O") 
			&& (i[8]=="O"))
			|| ((i[0]=="O") && (i[4]=="O") && (i[8]=="O")) || ((i[2]=="O") && (i[4]=="O") 
			&& (i[6]=="O"))) {
		setPlayer("Player1");
		setOver(true);
		run();
		}
		else {
		run();
		}
	}
}


