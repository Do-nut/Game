package com.do_nut.game.entity.entities;

import com.do_nut.game.entity.EntityMob;
import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.input.KeyboardInput;

public class EntityPlayer extends EntityMob {

	private KeyboardInput input;
	
	public EntityPlayer(KeyboardInput input) {
		this.input=input;
		
	}
	
	public EntityPlayer(int x,int y, KeyboardInput input){
		this.x=x;
		this.y=y;
		this.input=input;
	}
	
	public void update() {

		int xa=0,ya=0;
			if(input.up) ya--;
			if(input.down) ya++;
			if(input.left) xa--;
			if(input.right) xa++;
			if (xa != 0 || ya != 0) move(xa,ya);
	}
	
	public void render(GameGraphics g) {
		g.renderPlayer(x, y, Sprites.player);
	}
}
