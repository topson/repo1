import java.util.*;
import java.io.*;

class Input {


    private Integer readInput (){

        System.out.println("Please choose a field:");
		Integer inp = null;
		try{
			Scanner sc = new Scanner(System.in);	
			inp = sc.nextInt();
		}
		catch(Exception e1){
			System.out.println("Invalid Input, try again");
		}
		return inp;
    }
	
	public int getNextInput(){
		Integer inp = null;
		while(null == inp){
			inp = readInput();
		}
		return inp;
	}

}
