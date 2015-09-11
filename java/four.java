class Java {

	static final int above[] =  {0,1};
	static final int rsAbove[] = {1,1};
	static final int rightOf[] = {1,0};
	static final int rsBelow[] = {1, -1};
	static final int below[] = {0, -1};
	static final int lsBelow[] = {-1, -1};
	static final int leftOf[] = {-1, 0};
	static final int lsAbove[] = {-1, 1};
	static final int directions[][]={above, rsAbove, rightOf, rsBelow, below, lsBelow, leftOf, lsAbove};
	static final int tert [] = {0, 1, 2};

	public void build(){
		int [][]field = new int [7][6];
		for (i=0; i<7;i++){
			for (j=0; j<6; j++){
				field[i][j]=tert[0];
			}
		}

		boolean over = false;
	}

	public static void Java(){

		public void setField (int x, int y, int player){
			field[x][y]= ter[player];
		}
		public int[][] getField(){
			return field;
		}
	}

	public void gamestate(int[][]){
		getField();
		for (k=0; k<8; k++){
			for (i=0; i<7;i++){
				for (j=0; j<6; j++){
					if (field[i][j]==field[i+directions[k][0]][j+directions[k][1]]){
						if (k==0 && field[i][j]==0){
																																																		    

						}
					}
				}
			}
		}
	}

	public static void main(String[] args){
		Java();
	}

}

