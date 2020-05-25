package nl.HAN.game.Pizza;

import nl.HAN.game.oopg.objects.GameObject;
import nl.HAN.game.oopg.objects.Sprite;
import nl.HAN.game.oopg.tile.Tile;
import processing.core.PGraphics;

public class Wall extends Tile {
	/**
	 * @param sprite The image which will be drawn whenever the draw method of the tile is called.
	 */
	public Wall(Sprite sprite) {
		super(sprite);
	}
}
