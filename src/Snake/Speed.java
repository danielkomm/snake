package Snake;

import java.util.Random;

public class Speed {
	int x;
	int y;
	static int sleepValue = 200;
	Random speedCord = new Random();

	public Speed() {
		this.x = speedCord.nextInt(15) + 1;
		this.y = speedCord.nextInt(15) + 1;
	}

//	 Method to reset the position of the Poison
	public void resetSpeed() {
		this.x = speedCord.nextInt(15) + 1;
		this.y = speedCord.nextInt(15) + 1;
	}

	// Getter for x
	public int getX() {
		return x;
	}

	// Setter for x
	public void setX(int x) {
		this.x = x;
	}

	// Getter for y
	public int getY() {
		return y;
	}

	// Setter for y
	public void setY(int y) {
		this.y = y;
	}

	public static void speed() {
		if (sleepValue > 100) {
			sleepValue -= 10;
			System.out.println(sleepValue);
		}
	}

	public static void setSpeedNorm() {
		sleepValue = 200;
	}
}
