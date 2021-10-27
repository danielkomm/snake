package Snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Paint extends JPanel
{
	private static final long serialVersionUID = 1L;
	public final static int borderFieldWidth = 512;
	public final static int borderFieldHeight = 512;
	Positionen posOfSnake;

	private BufferedImage gameBackgroundImage;
	private BufferedImage backgroundImage;

	private BufferedImage foodImage;
	private BufferedImage poisonImage;
	private BufferedImage speedMelonImage;

	private BufferedImage snakeHead;
	private BufferedImage snakeHead_UP;
	private BufferedImage snakeHead_DOWN;
	private BufferedImage snakeHead_LEFT;

	private BufferedImage snakeBody;
	private BufferedImage portalFrame;

	// All graphics of the game
	public Paint()
	{
		try
		{
			gameBackgroundImage = ImageIO.read(getClass().getResourceAsStream("/gras.png"));
			backgroundImage = ImageIO.read(getClass().getResourceAsStream("/backg.png"));

			foodImage = ImageIO.read(getClass().getResourceAsStream("/apple.png"));
			poisonImage = ImageIO.read(getClass().getResourceAsStream("/poisonFood.png"));
			speedMelonImage = ImageIO.read(getClass().getResourceAsStream("/speedMelon.png"));

			snakeHead = ImageIO.read(getClass().getResourceAsStream("/snakeHead.png"));
			snakeHead_UP = ImageIO.read(getClass().getResourceAsStream("/snakeHead_UP.png"));
			snakeHead_DOWN = ImageIO.read(getClass().getResourceAsStream("/snakeHead_DOWN.png"));
			snakeHead_LEFT = ImageIO.read(getClass().getResourceAsStream("/snakeHead_LEFT.png"));

			snakeBody = ImageIO.read(getClass().getResourceAsStream("/body.png"));
			portalFrame = ImageIO.read(getClass().getResourceAsStream("/portal.png"));

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Draws the background, the grid and the ingame border.
	 */
	@Override
	public void paint(Graphics gr)
	{
		// Draw frame background
		super.paint(gr);

		gr.drawImage(backgroundImage, 0, 0, 800, 600, null);

		// Draw game field background
		gr.drawImage(gameBackgroundImage, 130, 20, 512, 512, null);

		// Snake body
		for (int i = 0; i < Snake.snakeBody.size(); i++)
		{
			posOfSnake = Snake.positionToCoordinates(Snake.snakeBody.get(i).getX(), Snake.snakeBody.get(i).getY());
			gr.drawImage(snakeBody, posOfSnake.x, posOfSnake.y, 32, 32, null);
		}

		// Snake head
		posOfSnake = Snake.positionToCoordinates(Snake.snakeHead.getX(), Snake.snakeHead.getY());
		switch (Snake.snakeHead.headDirection)
		{
		case UP:
			gr.drawImage(snakeHead_UP, posOfSnake.x, posOfSnake.y, 32, 32, null);
			break;

		case DOWN:
			gr.drawImage(snakeHead_DOWN, posOfSnake.x, posOfSnake.y, 32, 32, null);
			break;

		case LEFT:
			gr.drawImage(snakeHead_LEFT, posOfSnake.x, posOfSnake.y, 32, 32, null);
			break;

		case RIGHT:
			gr.drawImage(snakeHead, posOfSnake.x, posOfSnake.y, 32, 32, null);
			break;
		}

		// Draw Food
		posOfSnake = Snake.positionToCoordinates(Snake.snakeFood.getX(), Snake.snakeFood.getY());
		gr.drawImage(foodImage, posOfSnake.x, posOfSnake.y, 32, 32, null);

		// Draw Poison
		posOfSnake = Snake.positionToCoordinates(Snake.poisonFood.getX(), Snake.poisonFood.getY());
		gr.drawImage(poisonImage, posOfSnake.x, posOfSnake.y, 32, 32, null);

		// Draw SpeedFood
		posOfSnake = Snake.positionToCoordinates(Snake.speedFood.getX(), Snake.speedFood.getY());
		gr.drawImage(speedMelonImage, posOfSnake.x, posOfSnake.y, 32, 32, null);

		// Draw Portal
		posOfSnake = Snake.positionToCoordinates(Snake.portal.getX(), Snake.portal.getY());
		gr.drawImage(portalFrame, posOfSnake.x, posOfSnake.y, 32, 32, null);

		// Draw Grid
		gr.setColor(Color.BLACK);
		for (int i = 0; i < 16; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				gr.drawRect(i * 32 + Frame.xBorder, j * 32 + Frame.yBorder, 32, 32);
			}
		}

		// Draw Ingame Border
		gr.setColor(Color.BLACK);
		gr.drawRect(Frame.xBorder, Frame.yBorder, borderFieldWidth, borderFieldHeight);

		// Draw Score/Highscore
		gr.setFont(new Font("Calibri", Font.BOLD, 20));
		gr.drawString("Score: " + Snake.score, 5, 530);
		gr.drawString("Highscore: " + Snake.highscore, 5, 550);

		// Draw Rules
		gr.setFont(new Font("Calibri", Font.BOLD, 15));
		gr.drawImage(foodImage, 5, 20, 32, 32, null);
		gr.drawString("Score + 1", 40, 42);

		gr.drawImage(poisonImage, 5, 55, 32, 32, null);
		gr.drawString("Score = 0", 40, 77);
		
		gr.drawImage(speedMelonImage, 5, 90, 32, 32, null);
		gr.drawString("Speed + 1", 40, 110);
		
		gr.drawImage(portalFrame, 5, 125, 32, 32, null);
		gr.drawString("Portal", 40, 145);
		repaint();
	}
}