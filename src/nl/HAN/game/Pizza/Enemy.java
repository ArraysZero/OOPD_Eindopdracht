package nl.HAN.game.Pizza;

<<<<<<< HEAD
import nl.HAN.game.oopg.objects.GameObject;
import processing.core.PGraphics;

public class Enemy extends GameObject {
	private int health;
	private float xPos;
	private float yPos;


	public Enemy(int health, float xPos, float yPos) {
		this.health = health;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public Enemy(float x, float y, float width, float height, int health, float xPos, float yPos) {
		super(x, y, width, height);
		this.health = health;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(PGraphics g) {

	}

	@Override
	public void move() {
		super.move();
	}
=======
public class Enemy {
>>>>>>> parent of 6c3017a... enemy extend
}
