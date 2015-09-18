import java.util.*;
import java.io.*;

class Input {

 	Board board = new Board();

    public void write (){
		int idx;

        System.out.println("Please choose a field:");
        Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		if (inp <4){
			idx=0;
		}
		else if (inp <7){
			idx=1;
		}
		else {
			idx=2;	
		}

    }
    
}
