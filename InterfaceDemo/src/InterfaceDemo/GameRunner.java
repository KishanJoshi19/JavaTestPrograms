package InterfaceDemo;

public class GameRunner {

	public static void main(String[] args) {

		// MarioGame game = new MarioGame();
		GamingConsole game = new FightGame();

		game.up();
		game.down();
		game.left();
		game.right();
		game.jump();
		game.run();

	}

}
