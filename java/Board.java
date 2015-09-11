public class Board {

	public void draw (){
		int counter= 0;
		String values[]={"|", " ", "-"};
		String input[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String box[]= {values[0], input[counter], values[0]}; 

		
		for (int k=0; k<5; k++){
			if (k%2==0){
				for (int l=0; l<3; l++){
					if (l==2){
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
