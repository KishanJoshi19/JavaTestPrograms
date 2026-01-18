package OOPSDemo;

public class Fan {

	// state of object
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private int Speed; // 1 to 5

	// create
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;

	}

	// print the state
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				Speed);
	}

}
