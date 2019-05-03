package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // n�o precisaria
	}

	protected Board getBoard() {
		return board;
	}

}
