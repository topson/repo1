public class Board {

	public void draw (){
		
		String input = " ";
		String values [] = {"|", input, "-"};
		int counter = 1;
		String box[]={values[0]," ",values[1]," ",values[0]};

		for (int i=0; i<5; i++){
			if (i%2==0){
				for (int j=0; j<3; j++){
					if (j==2){
						System.out.print(box+"\n");
					}
					else {
						System.out.print(box);
					}
				}
			}
			else{
				for (int k=0; k<15; k++){
					if (k==14){
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
