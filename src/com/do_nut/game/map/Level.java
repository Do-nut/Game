package com.do_nut.game.map;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.map.tiles.Tiles;

public class Level {

	public int width, height;
	public int tiles[];
	
	public Level(int width, int height) {
		this.width=width;
		this.height=height;
		tiles = new int[width*height];
		generateLevel();
	}
	
	public Level(String path){
		loadLevel(path);
	}

	private void loadLevel(String path) {
				
	}

	public void generateLevel() {
		
		
	}
	
	public void update() {
		
	}
	
	public void time() {
		
	}
	
	public void render(int xScroll, int yScroll, GameGraphics g){
	g.setOffset(xScroll, yScroll);
	int y0 = yScroll>>4;
	int y1 = (yScroll + g.height+16)>>4;
	int x0 = xScroll>>4;
	int x1 = (xScroll + g.width+16)>>4;
	
	for (int y = y0; y < y1; y++) {
		for (int x = x0; x < x1; x++) {
			getTile(x,y).render(x, y, g);
		}
	}
	}
	
	public Tile getTile(int x, int y){
		if (x<0||y<0||x>=width||y>=height) return Tiles.grass;
		//if (tiles[x+y*width]==0) return Tiles.untextured;
		if (tiles[x+y*width]==0) return Tiles.grass;
		//if (tiles[x+y*width]==1) return Tiles.water;
		if (tiles[x+y*width]==1) return Tiles.flower;
		if (tiles[x+y*width]==2) return Tiles.tallgrass;
		if (tiles[x+y*width]==3) return Tiles.tallgrass2;
		return Tiles.blank;
	}
}
