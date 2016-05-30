package com.do_nut.game.graphics;

import com.do_nut.game.input.SpriteLoader;

public class Sprite {

	public final int size;
	private int x,y;
	public int[] pixels;
	private SpriteLoader sheet;
	
	public Sprite(int size, int x, int y, SpriteLoader sheet){
		this.size=size;
		pixels = new int[size*size];
		this.x=x*size;
		this.y=y*size;
		this.sheet=sheet;
		load();
	}
	
	private void load() {
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				pixels[x+y*size] = sheet.pixels[(x+this.x)+(y+this.y)*sheet.size];
			}
		}
	}
	
	public Sprite(int size, int color){
		this.size=size;
		pixels = new int[size*size];
		setColor(color);
	}
	
	private void setColor(int color){
		for (int i = 0; i <size*size; i++) {
			pixels[i] = color;
		}
	}
}
