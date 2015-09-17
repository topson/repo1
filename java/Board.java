import java.util.*;
import java.io.*;


public class Board {
	
	private String fields[] = new String[10];
	int round = -1;
	ArrayList<String> arrList = new ArrayList<String>();
	
	//public void	initializeBoard (){
	//	for (int l=0; l<9;l++){
	//		fields[l]=String.valueOf(l+1);
	//		saveBoard(fields[l], l);
	//	}
	//	draw(10, "X");
	//}
	public void changeBoard (int indexOne, String symbol){
		if (fields[indexOne-1]!="X" && fields[indexOne-1]!="O"){	
			fields[indexOne-1]=symbol;
		}
		else{
			System.out.println("Field already taken");
			
		}
			
	}
	public String[] loadBoard (){
		for (int k=0; k<9;k++){
			if (arrList.size()==9){
				fields[k]=arrList.get(k);
			}
			else{
				fields[k]=String.valueOf(k+1);
			}
		return fields[k];				
	}
	public void saveBoard (String oneOfTwo, int leCount){
		int idx = leCount;
		String plvalue = oneOfTwo;
		if (arrList.size()==10){
			arrList.set(idx, plvalue);
		}
		else {
			arrList.add(idx, plvalue);
		}			
	}

	public void draw (int fieldnr, String playericon){
		String values [] = {"|", " ", "-"};
		int counter = 0;
		int fieldnmbr = fieldnr;		
		String playersIcon = playericon;
	//	loadBoard();
		changeBoard(fieldnmbr, playersIcon);	
		for (int i=0; i<5; i++){
			if (i%2==0){
				for (int j=0; j<3; j++){
					String box=values[0]+values[1]+fields[counter]+values[1]+values[0];
					saveBoard(fields[counter], counter);
					if (j==2){
						System.out.print(box+"\n");
					}
					else{
						System.out.print(box);
					}
					counter++;
				}
			}
			else{
				for (int m=0; m<15; m++){
					if (m==14){
						System.out.print(values[2]+"\n");
					}
					else{
					System.out.print(values[2]);
					}
				}
			}
		}
		round++;
		Input input	= new Input();
		input.write(round);
	}
	
}
