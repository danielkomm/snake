package Snake;

public class Head
{
	Directions headDirection = Directions.RIGHT;

	int x;
	int y;

	public Head(int xKordHead, int yKordHead)
	{
		this.x = xKordHead;
		this.y = yKordHead;
	}

	// Getter for head direction
	public Directions getHeadDirection()
	{
		return headDirection;
	}

	// Setter for head direction
	public void setHeadDirection(Directions headDirection)
	{
		this.headDirection = headDirection;
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
