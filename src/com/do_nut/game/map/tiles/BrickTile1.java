package com.do_nut.game.map.tiles;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.map.Tile;

public class BrickTile1 extends Tile {

	public BrickTile1() {
		super(Sprites.brick1);
		// TODO Auto-generated constructor stub
	}

	public void render(int x, int y, GameGraphics g){
		g.renderTile(x<<4,y<<4,this);
	}
}
