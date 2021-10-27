package Snake;

public class Gameclock extends Thread {
	public static boolean running = true;

	public void run() {
		while (Gamestate.RUNNING != null) {
			try {
				sleep(Speed.sleepValue);
				Snake.move();
				Snake.moveDelay = false;
				Collision.collideWithFood();
				Collision.collideWithPoison();
				Collision.collideWithSpeed();
				Collision.collideWithPortal();
				if (Collision.collideWithSnake()) {
					Snake.snakeBody.clear();
					Snake.score = 0;
				}
				if (Collision.collideWithBorder()) {
					Snake.snakeBody.clear();
					Snake.snakeHead.setX(7);
					Snake.snakeHead.setY(7);
					Snake.score = 0;
					Speed.setSpeedNorm();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
