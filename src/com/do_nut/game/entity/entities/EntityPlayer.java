package com.do_nut.game.entity.entities;

import com.do_nut.game.entity.EntityMob;
import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.graphics.sprites.Sprite;
import com.do_nut.game.graphics.sprites.Sprites;
import com.do_nut.game.input.KeyboardInput;

public class EntityPlayer extends EntityMob {

	private KeyboardInput input;
	private int anim = 0;
	private boolean moving=false;
	
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
		
		if (anim < 999999999) anim++;
		else anim=0;
			if(input.up) ya--;
			if(input.down) ya++;
			if(input.left) xa--;
			if(input.right) xa++;
			if (xa != 0 || ya != 0) { move(xa,ya);
			moving = true;
			}
			else
			{
				moving = false;
			}
			
	}
	
	public void render(GameGraphics g) {
		Sprite playerSprite = Sprites.player_down_0;
		if (direction==0) { playerSprite = Sprites.player_down_0;
			   if (moving) {
			    if (anim % 40 > 30) {
			    playerSprite = Sprites.player_down_1;
			    } else {
			     if (anim % 40 > 20){
			   playerSprite = Sprites.player_down_0;
			     } else {
			      if (anim % 40 > 10) {
			    	  playerSprite = Sprites.player_down_2;
			      } else {
			    	  playerSprite = Sprites.player_down_0;
			      }
			     }
			    }
			   }
		}
		if (direction==2) { playerSprite = Sprites.player_up_0;
		   if (moving) {
			    if (anim % 40 > 30) {
			    playerSprite = Sprites.player_up_1;
			    } else {
			     if (anim % 40 > 20){
			   playerSprite = Sprites.player_up_0;
			     } else {
			      if (anim % 40 > 10) {
			    	  playerSprite = Sprites.player_up_2;
			      } else {
			    	  playerSprite = Sprites.player_up_0;
			      }
			     }
			    }
			   }
		}
		if (direction==1) { playerSprite = Sprites.player_right_0;
		   if (moving) {
			    if (anim % 40 > 30) {
			    playerSprite = Sprites.player_right_1;
			    } else {
			     if (anim % 40 > 20){
			   playerSprite = Sprites.player_right_0;
			     } else {
			      if (anim % 40 > 10) {
			    	  playerSprite = Sprites.player_right_2;
			      } else {
			    	  playerSprite = Sprites.player_right_0;
			      }
			     }
			    }
			   }
		}
		if (direction==3) { playerSprite = Sprites.player_left_0;
		   if (moving) {
			    if (anim % 40 > 30) {
			    playerSprite = Sprites.player_left_1;
			    } else {
			     if (anim % 40 > 20){
			   playerSprite = Sprites.player_left_0;
			     } else {
			      if (anim % 40 > 10) {
			    	  playerSprite = Sprites.player_left_2;
			      } else {
			    	  playerSprite = Sprites.player_left_0;
			      }
			     }
			    }
			   }
		}
		g.renderPlayer(x, y, playerSprite);
	}
}
