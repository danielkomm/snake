package Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerSnake implements KeyListener
{
	/**
	 * Keylistener for the snake
	 */
	@Override
	public void keyPressed(KeyEvent e)
	{

		switch (e.getKeyCode())
		{
		case KeyEvent.VK_W:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.DOWN && !Snake.moveDelay))
			{
				Snake.snakeHead.setHeadDirection(Directions.UP);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_A:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.RIGHT && !Snake.moveDelay))
			{
				Snake.snakeHead.setHeadDirection(Directions.LEFT);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_S:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.UP && !Snake.moveDelay))
			{

				Snake.snakeHead.setHeadDirection(Directions.DOWN);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_D:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.LEFT && !Snake.moveDelay))
			{
				Snake.snakeHead.setHeadDirection(Directions.RIGHT);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_UP:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.DOWN && !Snake.moveDelay))
			{
				Snake.snakeHead.setHeadDirection(Directions.UP);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_LEFT:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.RIGHT && !Snake.moveDelay))
			{
				Snake.snakeHead.setHeadDirection(Directions.LEFT);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_DOWN:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.UP && !Snake.moveDelay))
			{

				Snake.snakeHead.setHeadDirection(Directions.DOWN);
				Snake.moveDelay = true;
			}
			break;

		case KeyEvent.VK_RIGHT:
			if (!(Snake.snakeHead.getHeadDirection() == Directions.LEFT && !Snake.moveDelay))
			{
				Snake.snakeHead.setHeadDirection(Directions.RIGHT);
				Snake.moveDelay = true;
			}
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// unused
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// unused
	}

}
