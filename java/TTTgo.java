

class TTTgo {
	
	public TTTgo(){
		while (GameLogic.gameOver!=true){
		Rederer.initialize();
		Input.readInput();
		GameLogic.checkBoard();
		Board.setBoard();
		Renderer.draw();
		
	}	
}
