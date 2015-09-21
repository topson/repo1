

class TTTgo {
	
	public TTTgo(){
	Rederer.initialize();
	Board.setBoard();
	Input.readInput();
	GameLogic.checkBoard();
	Board.setBoard();
	Renderer.draw();
	}	
}
