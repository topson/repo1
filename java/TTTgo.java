

class TTTgo {
	
	public TTTgo(){
	Rederer.initialize();
	Input.readInput();
	GameLogic.checkBoard();
	Board.setBoard();
	Renderer.draw();
	}	
}
