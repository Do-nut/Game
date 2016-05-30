package com.do_nut.game.graphics;

import java.util.Random;

import com.do_nut.game.graphics.sprites.Sprite;
import com.do_nut.game.map.Tile;

public class GameGraphics {

	public int width, xOffset;
	public int height, yOffset;
	private int mapSize=2;
	
	private int i=0;
	public int[] pixels, tiles = new int[mapSize*mapSize];
	private Random rand = new Random();
	
	public GameGraphics(int width, int height){
		this.width=width;
		this.height=height;
		pixels = new int[width*height];
		for (i=0; i < mapSize*mapSize; i++){
			tiles[i] = rand.nextInt(0xffffff);
		}
	}
	

	
	public void clear() {
		for (int i = 0; i < pixels.length; i++){
			pixels[i]=0;
		}
	}
	
	
	public void renderTile(int xPos, int yPos, Tile tile){
		xPos -= xOffset;
		yPos -= yOffset;
		for (int y = 0; y < tile.sprite.size; y++){
			int ya = yPos+y;
			for (int x = 0; x < tile.sprite.size; x++) {
				int xa = xPos+x;
				if(xa<-tile.sprite.size||xa>=width||ya<-tile.sprite.size||ya>=height) break;
				if(xa<0) xa=0;
				if(ya<0) ya=0;
				pixels[xa+ya*width] = tile.sprite.pixels[x+y*tile.sprite.size];
			}
		}	
	}
	
	public void renderPlayer(int xPos, int yPos, Sprite sprite){
		xPos -= xOffset+7;
		yPos -= yOffset+7;
		for (int y = 0; y < 16; y++) {
				int ya = yPos+y;
				for (int x = 0; x < 16; x++) {
					int xa = xPos+x;
					if(xa<-16||xa>=width||ya<-16||ya>=height) break;
					if(xa<0) xa=0;
					if(ya<0) ya=0;
					int color = sprite.pixels[x+y*16];
					if(color != 0xFFFF00FF) pixels[xa+ya*width] = color;// = sprite.pixels[x+y*16];
				}}
	}
	
	public void setOffset(int xOffset, int yOffset){
		this.xOffset=xOffset;
		this.yOffset=yOffset;
	}
}
