package com.do_nut.game.map.tiles;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.map.Tile;

public class FlowerTile extends Tile {

	public FlowerTile() {
		super(Sprites.flower);
		
	}
	
	public void render(int x, int y, GameGraphics g){
		g.renderTile(x<<4,y<<4,this);
	}

}
