

class TTTgo {
	
	public TTTgo(){
		Board gameBoard = new Board();
		Renderer render = new Renderer();
		String [][] board = Renderer.initialize();
		gameBoard.setBoard(board);
		gameBoard.getBoard();
		
		while (GameLogic.gameOver(Board.currBoard) != true){
			int inp = Input.getNextInput();
			GameLogic.checkMove(Board.currBoard, inp);
			
			if (GameLogic.retMessage != 9){
					render.draw(Board.currBoard, inp, GameLogic.retMessage);
					GameLogic.gameOver(Board.currBoard);
			}
		}
	}
}






