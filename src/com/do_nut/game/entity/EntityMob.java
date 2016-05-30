package com.do_nut.game.entity;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.Sprite;

public abstract class EntityMob extends Entity {

	public Sprite sprite;
	public int direction = 0;
	public boolean motion = false;
	
	public void move(int xa, int ya){
		if(ya>0) direction=0;
		if(xa>0) direction=1;
		if(ya<0) direction=2;
		if(xa<0) direction=3;
		
		if (!collidable(xa, ya))
		x+=xa;
		y+=ya;
	}
	
	public void update() {
		
	}
	
	private boolean collidable(int xa, int ya) {
		boolean isSolid = false;
		if(level.getTile((x+xa)/16, (y+ya)/16).isSolid()) isSolid=true;
		return isSolid;
	}
			
	public void render(GameGraphics g) {
		
	}
			
}
