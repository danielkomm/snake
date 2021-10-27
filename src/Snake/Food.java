package Snake;

import java.util.Random;

public class Food
{
	int x;
	int y;
	Random foodCord = new Random();

	public Food()
	{
		this.x = foodCord.nextInt(15) + 1;
		this.y = foodCord.nextInt(15) + 1;
	}

	// Method to reset the position of food
	public void resetFood()
	{
		this.x = foodCord.nextInt(15) + 1;
		this.y = foodCord.nextInt(15) + 1;
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
