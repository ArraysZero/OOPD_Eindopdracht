package nl.HAN.game.Pizza;

import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// write your code here
		String[] processingArgs = {"nl.HAN.game.Pizza.PizzaRun.Main"};
		Main mySketch = new Main();

		PApplet.runSketch(processingArgs, mySketch);
	}
}
