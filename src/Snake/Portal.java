package Snake;

import java.util.Random;

public class Portal
{
	int x;
	int y;
	Random randomPort = new Random();
	static Random randomCordGenerator = new Random();
	public static int randomCordx = randomCordGenerator.nextInt(15) + 1;
	public static int randomCordy = randomCordGenerator.nextInt(15) + 1;

	public Portal()
	{
		this.x = randomPort.nextInt(15) + 1;
		this.y = randomPort.nextInt(15) + 1;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public static void resetCord()
	{
		randomCordx = randomCordGenerator.nextInt(14);
		randomCordy = randomCordGenerator.nextInt(14);
	}
}
