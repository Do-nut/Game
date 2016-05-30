package com.do_nut.game.map.tiles;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.map.Tile;

public class TallGrassTile2 extends Tile {

	public TallGrassTile2() {
		super(Sprites.tallgrass2);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, GameGraphics g){
		g.renderTile(x<<4,y<<4,this);
	}

}
