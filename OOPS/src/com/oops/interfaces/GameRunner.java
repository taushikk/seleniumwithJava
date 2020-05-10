package com.oops.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole[] games = { new ChessGame(), new ChessGame() };
		// GamingConsole game = new ChessGame();
		// MarioGame game = new MarioGame();
		// ChessGame chess = new ChessGame();
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();

		}
}

}
