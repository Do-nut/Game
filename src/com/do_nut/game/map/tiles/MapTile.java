package com.do_nut.game.map.tiles;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.map.Tile;

public class MapTile extends Tile {

	public MapTile() {
		super(Sprites.blank2);
		
	}
	
	public void render(int x, int y, GameGraphics g){
		g.renderTile(x<<4, y<<4, this);
	}

	
	public boolean isSolid() {
		return true;
		
	}
}
