package br.com.carryon.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Sprite {

	private BufferedImage personage;
	private int width;
	private int height;
	private int rows, columns;
	private int positionX;
	private int positionY;
	private BufferedImage sprites[];
	private int appearance;
	private int up, down, left, rigth;
	private String direction;
	private String spriteAdress;

	public Sprite(int width, int height, int rows, int columns, int positionX, int positionY, int appearance,
			String spriteAdress) {

		try {
			this.spriteAdress = spriteAdress;
			this.personage = ImageIO.read(new File(spriteAdress));
			this.appearance = appearance;

			this.width = width;
			this.height = height;
			this.rows = rows;
			this.columns = columns;
			this.positionX = positionX;
			this.positionY = positionY;

			this.sprites = new BufferedImage[rows * columns];

			for (int i = 0; i < columns; i++) {

				for (int j = 0; j < rows; j++) {
					int coordinateX = j * width;
					int coordinateY = i * height;
					sprites[(i * rows) + j] = this.personage.getSubimage(coordinateX, coordinateY, width, height);
				}

			}

		} catch (IOException e) {
			System.err.println("Erro no carregamento de imagem: " + e);
		}

	}

	public abstract void animateSprite(String direction);

	public BufferedImage getPersonage() {
		return personage;
	}

	public void setPersonage(BufferedImage personage) {
		this.personage = personage;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public BufferedImage[] getSprites() {
		return sprites;
	}

	public void setSprites(BufferedImage[] sprites) {
		this.sprites = sprites;
	}

	public int getAppearance() {
		return appearance;
	}

	public void setAppearance(int appearance) {
		this.appearance = appearance;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRigth() {
		return rigth;
	}

	public void setRigth(int rigth) {
		this.rigth = rigth;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getSpriteAdress() {
		return spriteAdress;
	}

	public void setSpriteAdress(String spriteAdress) {
		this.spriteAdress = spriteAdress;
	}

}
