

class TTTgo {
	
	public TTTgo(){
		Renderer.initialize();
		while (GameLogic.gameOver()!=true){
			Input.getNextInput();
			GameLogic.checkBoard(Board currBoard, int input);
			Board.setBoard(Board currBoard);
			Renderer.draw(Board currBoard);
			GameLogic.gameOver(Board currBoard);
		}
	}	
}
