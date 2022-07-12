package br.com.carryon.model;

public class Personage extends Sprite {

	public Personage(int width, int height, int rows, int columns, int positionX, int positionY, int appearance,
			String spriteAdress) {
		super(width, height, rows, columns, positionX, positionY, appearance, spriteAdress);
	}

	public void move(String direction, int moveSize) {

		if (direction.equals("up")) {
			setPositionY(getPositionY() - moveSize);
			animateSprite(direction);
			return;
		}
		if (direction.equals("down")) {
			setPositionY(getPositionY() + moveSize);
			animateSprite(direction);
			return;
		}
		if (direction.equals("left")) {
			setPositionX(getPositionX() - moveSize);
			animateSprite(direction);
			return;
		}
		if (direction.equals("right")) {
			setPositionX(getPositionX() + moveSize);
			animateSprite(direction);
		}
	}

	@Override
	public void animateSprite(String direction) {

		if (direction.equals("up")) {
			switch (getUp()) {

			case 0:
				setAppearance(0);
				break;
			case 1:
				setAppearance(1);
				break;
			case 2:
				setAppearance(2);
				break;

			case 3:
				setAppearance(3);
				break;

			default:
				break;
			}
		}
		if (direction.equals("down")) {
			switch (getDown()) {

			case 0:
				setAppearance(0);
				break;
			case 1:
				setAppearance(1);
				break;
			case 2:
				setAppearance(2);
				break;

			case 3:
				setAppearance(3);
				break;

			default:
				break;
			}
		}
		if (direction.equals("left")) {
			switch (getLeft()) {

			case 0:
				setAppearance(0);
				break;
			case 1:
				setAppearance(1);
				break;
			case 2:
				setAppearance(2);
				break;

			case 3:
				setAppearance(3);
				break;

			default:
				break;
			}
		}
		if (direction.equals("right")) {
			switch (getRigth()) {

			case 0:
				setAppearance(0);
				break;
			case 1:
				setAppearance(1);
				break;
			case 2:
				setAppearance(2);
				break;

			case 3:
				setAppearance(3);
				break;

			default:
				break;
			}
		}

	}

}
