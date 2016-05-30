package com.do_nut.game.map;

import java.awt.event.KeyListener;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprite;

public class Tile {

	public int x,y;
	public Sprite sprite;
	
	//TODO Single picture sprite.
	//TODO NO SPRITE INPUT (find sprite from tileName)
	public Tile(Sprite sprite){
		this.sprite=sprite;
	}
	
	public void render(int x, int y, GameGraphics g){
		
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public void update(KeyListener key){
		
	}
}
