package Snake;

import java.util.ArrayList;

public class Snake
{
	public static Head snakeHead = new Head(7, 7);
	public static ArrayList<Body> snakeBody = new ArrayList<>();
	public static Food snakeFood = new Food();
	public static Poison poisonFood = new Poison();
	public static Speed speedFood = new Speed();
	public static Portal portal = new Portal();

	public static int score = 0;
	public static int highscore = 0;

	public static boolean moveDelay = false;

	/**
	 * Method for adding pieces of body to the snake
	 */
	public static void addBody()
	{
		if (snakeBody.size() < 1)
		{
			snakeBody.add(new Body(snakeHead.getX(), snakeHead.getY()));
		} else
		{
			snakeBody.add(new Body(snakeBody.get(snakeBody.size() - 1).x, snakeBody.get(snakeBody.size() - 1).y));
		}
	}

	/**
	 * Method to move our snake
	 */
	public static void move()
	{
		// Move body
		if (snakeBody.size() >= 2)
		{
			for (int i = snakeBody.size() - 1; i >= 1; i--)
			{
				if (snakeBody.get(i).isDelay())
				{
					snakeBody.get(i).setDelay(false);
				} else
				{
					snakeBody.get(i).setX(snakeBody.get(i - 1).getX());
					snakeBody.get(i).setY(snakeBody.get(i - 1).getY());
				}
			}
		}

		// Move first body piece to head
		if (snakeBody.size() >= 1)
		{
			if (snakeBody.get(0).isDelay())
			{
				snakeBody.get(0).setDelay(false);
			} else
			{
				snakeBody.get(0).setX(snakeHead.getX());
				snakeBody.get(0).setY(snakeHead.getY());
			}
		}

		// Move head to a direction
		switch (snakeHead.getHeadDirection())
		{
		case RIGHT:
			snakeHead.setX(snakeHead.getX() + 1);
			break;

		case LEFT:
			snakeHead.setX(snakeHead.getX() - 1);
			break;

		case DOWN:
			snakeHead.setY(snakeHead.getY() + 1);
			break;

		case UP:
			snakeHead.setY(snakeHead.getY() - 1);
			break;
		}
	}

	/**
	 * Calculates the position of the snake to coordinates
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static Positionen positionToCoordinates(int x, int y)
	{
		Positionen posKord = new Positionen(0, 0);
		posKord.x = x * 32 + Frame.xBorder;
		posKord.y = y * 32 + Frame.yBorder;

		return posKord;
	}

	/**
	 * Method to check if the score is the new highscore
	 * 
	 * @return
	 */
	public static int checkForHighscore()
	{
		if (Snake.score > Snake.highscore)
		{
			Snake.highscore = Snake.score;
		}
		return highscore;
	}
}
