import java.util.*;
import java.io.*;

public class TTTGame{
	
	String i [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	int counter = 0;

	public int run () {
		System.out.println("-------------");
		System.out.println(" --- --- --- ");
		System.out.println("| " + i[0]+" | " + i[1]+" | " + i[2]+" |");
		System.out.println(" --- --- --- ");
		System.out.println(" --- --- --- ");
		System.out.println("| " + i[3]+" | " + i[4]+" | " + i[5]+" |");
		System.out.println(" --- --- --- ");
		System.out.println(" --- --- --- ");
		System.out.println("| " + i[6]+" | " + i[7]+" | " + i[8]+" |");
		System.out.println(" --- --- --- ");
		System.out.println("-------------");
		System.out.println("Testoutput");
		counter++;
		return counter;
	}

	public String[] choice(){
		
		if (counter % 2 == 0){
			try {
			System.out.println ("Player2 choose your field(1-9)");
			Scanner sc = new Scanner(System.in);
			int inp = sc.nextInt();
			if (inp < 1 || inp > 9){
				System.out.println("Not a valid choice, please try again");
				choice();
			}
			else {
				if (i[inp-1] != "X" && i[inp-1] != "O"){
					i[inp-1] = "O";
	//				System.out.println(i[inp-1]);
				}
				else {
					System.out.println("Not a valid choice, please try again");
					choice();
				}
			}
			}catch (InputMismatchException e1){

					System.out.println("Not a valid choice, please try again");
					choice();
			}
		}
		else {
			try {
			System.out.println ("Player1 choose your field(1-9)");
			Scanner sc = new Scanner(System.in);
			int inp = sc.nextInt();

			if (inp < 1 || inp > 9){
				System.out.println("Not a valid choice, please try again");
				choice();
			}
			else {
				if (i[inp-1] != "X" && i[inp-1] != "O"){
					i[inp-1] = "X";
	//				System.out.println(i[inp-1]);
				}
				else {
					System.out.println("Not a valid choice, please try again");
					choice();
				}
			}
			}catch (InputMismatchException e1){
			
					System.out.println("Not a valid choice, please try again");
					choice();
			}
		}
		return i;
		
	}
}


