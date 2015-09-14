import java.util.*;
import java.io.*;

class Input {
    
    private String [] playerIcons = {"X", "O"};
    private String symbol;
    
    public void write (int player){
        
        if (player%2==0){
            symbol=playerIcons[0];
        }
        else{
            symbol=playerIcons[1];
        }
        
        Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		
		Board board = new Board();
        board.changeBoard(inp, symbol);
    }
    
}