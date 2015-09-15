public class Board {
	
	private String fields[] = new String[10];
	int round = -1;
	
	public void	initializeBoard (){
		for (int l=0; l<9;l++){
			fields[l]=String.valueOf(l+1);
		}
		draw();
	}
	public void changeBoard (int indexOne, String symbol){
		fields[indexOne-1]=symbol;
		draw();
	}

	public void draw (){
		
		String values [] = {"|", " ", "-"};
		int counter = 0;
		for (int i=0; i<5; i++){
			if (i%2==0){
				for (int j=0; j<3; j++){
					String box=values[0]+values[1]+fields[counter]+values[1]+values[0];
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
