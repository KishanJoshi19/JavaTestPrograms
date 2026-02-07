package InterfaceDemo;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {

		System.out.println("Climb");

	}

	@Override
	public void down() {
		System.out.println("sit");

	}

	@Override
	public void left() {
		System.out.println("move left");

	}

	@Override
	public void right() {
		System.out.println("move right");

	}

	@Override
	public void jump() {
		System.out.println("jump");

	}

	@Override
	public void run() {
		System.out.println("run");

	}

}
