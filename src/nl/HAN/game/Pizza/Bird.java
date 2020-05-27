package nl.HAN.game.Pizza;

import processing.core.PGraphics;

public class Bird extends Enemy {
	public Bird(int health, float xPos, float yPos) {
		super(health, xPos, yPos);
	}

	public Bird(float x, float y, float width, float height, int health, float xPos, float yPos) {
		super(x, y, width, height, health, xPos, yPos);
	}

	@Override
	public void update() {
		super.update();
	}

	@Override
	public void draw(PGraphics g) {
		super.draw(g);
	}

	@Override
	public void move() {
		super.move();
	}
}
