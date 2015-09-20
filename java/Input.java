import java.util.*;
import java.io.*;

class Input {


    public int  readInput (){

        System.out.println("Please choose a field:");
		int inp=0;
		try{
			Scanner sc = new Scanner(System.in);	
			inp = sc.nextInt();
			return inp;
		}
		catch(Exception e1){
			System.out.println("Invalid Input, try again");
			restart();		
		}
		return inp;
    }


	public void restart(){
		readInput();	
	}
    
}
