public class Renderer{

	Board board = new Board();

	public void draw (String[][] board){
		board.getBoard();
		String values [] = {"|", " ", "-"};
		int counter = 0;
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
	}
}
