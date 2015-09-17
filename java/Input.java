import java.util.*;
import java.io.*;

class Input {
    
    private String [] playerIcons = {"X", "O"};
    private String symbol;
    
    public void write (int player){
	Board board = new Board();
        board.loadBoard();
        if (player%2==0){
            symbol=playerIcons[0];
        }
        else{
            symbol=playerIcons[1];
        }
        System.out.println("Please choose a field:");
        Scanner sc = new Scanner(System.in);
	int inp = sc.nextInt();
	board.saveBoard(symbol, inp-1);	
        board.draw(inp, symbol);
    }
    
}
