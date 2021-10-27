package Snake;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	private static final long serialVersionUID = 1L;
	public static final int WINDOW_HEIGHT = 600;
	public static final int WINDOW_WIDTH = 800;
	public static final int xBorder = 130;
	public static final int yBorder = 20;

	/**
	 * Creates game frame
	 */
	public void createFrame()
	{
		this.add(new Paint());
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setVisible(true);
		this.setTitle("Snake by Daniel K.");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(new KeyListenerSnake());
	}

	/**
	 * Main Method of our game
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Frame gameFrame = new Frame();
		gameFrame.createFrame();

		Gameclock gameClock = new Gameclock();
		gameClock.start();
	}
}
