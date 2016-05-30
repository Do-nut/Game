package com.do_nut.game.graphics.sprites;

public class Sprites {

	public static SpriteLoader tiles = new SpriteLoader("/textures/sheets/sprites.png", 256);
	
	public static Sprite player_up_0 = new Sprite(16, 6, 15, tiles);
	public static Sprite player_down_0 = new Sprite(16, 0, 15, tiles);
	public static Sprite player_left_0 = new Sprite(16, 9, 15, tiles);
	public static Sprite player_right_0 = new Sprite(16, 3, 15, tiles);
	
	public static Sprite player_up_1 = new Sprite(16, 7, 15, tiles);
	public static Sprite player_down_1 = new Sprite(16, 1, 15, tiles);
	public static Sprite player_left_1 = new Sprite(16, 10, 15, tiles);
	public static Sprite player_right_1 = new Sprite(16, 4, 15, tiles);
	
	public static Sprite player_up_2 = new Sprite(16, 8, 15, tiles);
	public static Sprite player_down_2 = new Sprite(16, 2, 15, tiles);
	public static Sprite player_left_2 = new Sprite(16, 11, 15, tiles);
	public static Sprite player_right_2 = new Sprite(16, 5, 15, tiles);
	
	
	
	
	
	
	public static Sprite grass = new Sprite(16, 0, 0, tiles);
	public static Sprite water = new Sprite(16, 1, 0, tiles);
	public static Sprite flower = new Sprite(16, 2, 0, tiles);
	public static Sprite tallgrass = new Sprite(16, 3, 0, tiles);
	public static Sprite tallgrass2 = new Sprite(16, 4, 0, tiles);
	public static Sprite rock = new Sprite(16, 5, 0, tiles);
	public static Sprite brick1 = new Sprite(16, 6, 0, tiles);
	public static Sprite blank = new Sprite(16, 0xF0F0F0);
	
	
}
