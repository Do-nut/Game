package com.do_nut.game.graphics.sprites;

public class Sprites {

	public static SpriteLoader tiles = new SpriteLoader("/textures/sheets/sprites.png", 256);
	
	public static Sprite grass = new Sprite(16, 0, 0, tiles);
	public static Sprite water = new Sprite(16, 1, 0, tiles);
	public static Sprite flower = new Sprite(16, 2, 0, tiles);
	public static Sprite tallgrass = new Sprite(16, 3, 0, tiles);
	public static Sprite tallgrass2 = new Sprite(16, 4, 0, tiles);
	public static Sprite rock = new Sprite(16, 5, 0, tiles);
	public static Sprite brick1 = new Sprite(16, 6, 0, tiles);
	public static Sprite player = new Sprite(16, 0, 15, tiles);
	public static Sprite blank = new Sprite(16, 0xFFFFFF);
	public static Sprite blank2 = new Sprite(16, 0xF0F0F0);
	
}
