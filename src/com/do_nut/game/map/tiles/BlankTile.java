package com.do_nut.game.map.tiles;

import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.map.Tile;

public class BlankTile extends Tile {

	public BlankTile() {
		super(Sprites.blank);
		
	}
	
	public boolean isSolid(){
		return true;
	}

}
