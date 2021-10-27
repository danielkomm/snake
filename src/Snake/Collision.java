package Snake;

public class Collision {
	/**
	 * Condition of collision with ourself
	 * 
	 * @return
	 */
	public static boolean collideWithSnake() {
		for (int i = 0; i < Snake.snakeBody.size(); i++) {
			if (Snake.snakeHead.getX() == Snake.snakeBody.get(i).getX()
					&& Snake.snakeHead.getY() == Snake.snakeBody.get(i).getY() && !Snake.snakeBody.get(i).isDelay()) {
				Speed.setSpeedNorm();
				return true;
			}
		}
		return false;
	}

	/**
	 * Condition of collision with the border
	 * 
	 * @return
	 */
	public static boolean collideWithBorder() {
		return (Snake.snakeHead.getX() < 0 || Snake.snakeHead.getX() > 15 || Snake.snakeHead.getY() < 0
				|| Snake.snakeHead.getY() > 15);
	}

	/**
	 * Condition of collision with the food
	 * 
	 * @return
	 */
	public static void collideWithFood() {
		if (Snake.snakeHead.getX() == Snake.snakeFood.getX() && Snake.snakeHead.getY() == Snake.snakeFood.getY()) {
			Snake.snakeFood.resetFood();
			Snake.addBody();
			Snake.score += 1;
			Snake.checkForHighscore();
			Snake.poisonFood.resetPoison();
			Speed.setSpeedNorm();
		}
	}

	/**
	 * Condition of collision with the poison
	 */
	public static void collideWithPoison() {
		if (Snake.snakeHead.getX() == Snake.poisonFood.getX() && Snake.snakeHead.getY() == Snake.poisonFood.getY()) {
			Snake.poisonFood.resetPoison();
			Snake.snakeBody.clear();
			Snake.score = 0;
		}
	}

	public static void collideWithSpeed() {
		if (Snake.snakeHead.getX() == Snake.speedFood.getX() && Snake.snakeHead.getY() == Snake.speedFood.getY()) {
			Snake.speedFood.resetSpeed();
			Speed.speed();
		}
	}

	public static void collideWithPortal() {
		if (Snake.snakeHead.getX() == Snake.portal.getX() && Snake.snakeHead.getY() == Snake.portal.getY()) {
			Snake.snakeHead.setX(Portal.randomCordx);
			Snake.snakeHead.setY(Portal.randomCordy);
			Portal.resetCord();
		}
	}
}
