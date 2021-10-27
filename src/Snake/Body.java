package Snake;

public class Body
{
	int x;
	int y;
	boolean delay = true;

	// Constructor of body class
	public Body(int xKordBody, int yKordBody)
	{
		this.x = xKordBody;
		this.y = yKordBody;
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

	// Getter for boolean delay
	public boolean isDelay()
	{
		return delay;
	}

	// Setter for boolean delay
	public void setDelay(boolean delay)
	{
		this.delay = delay;
	}
}
