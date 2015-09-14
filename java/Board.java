public class Board {

	public void draw (){
		
		String fields[] = new String[10];
		for (int l=0; l<9;l++){
			fields[l]=String.valueOf(l+1);
		}
		String values [] = {"|", " ", "-"};
		int counter = 0;
		

		for (int i=0; i<5; i++){
			if (i%2==0){
				for (int j=0; j<3; j++){
					String box=values[0]+values[1]+fields[counter]+values[1]+values[0];
					if (j==2){
						System.out.print(box+"\n");
					}
					else {
						System.out.print(box);
					}
					counter++;
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
