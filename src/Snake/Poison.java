package Snake;

import java.util.Random;

public class Poison
{
	int x;
	int y;
	Random poisonCord = new Random();

	public Poison()
	{
		this.x = poisonCord.nextInt(15) + 1;
		this.y = poisonCord.nextInt(15) + 1;
	}

	// Method to reset the position of the Poison
	public void resetPoison()
	{
		this.x = poisonCord.nextInt(15) + 1;
		this.y = poisonCord.nextInt(15) + 1;
	}

	// Getter for x
	public int getX()
	{
		return x;
	}

	// Setter for x
	public void setX(int x)
	{
		this.x = x;
	}

	// Getter for y
	public int getY()
	{
		return y;
	}

	// Setter for y
	public void setY(int y)
	{
		this.y = y;
	}
}
