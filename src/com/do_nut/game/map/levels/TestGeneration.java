package com.do_nut.game.map.levels;

import java.util.Random;

import com.do_nut.game.map.Level;

public class TestGeneration extends Level {

	private static final Random rand = new Random();
	
	public TestGeneration() {
		super(64, 64);
		
	}
	

	public void generateLevel() {
		for(int y=0; y < height; y++){
			for(int x=0; x < width; x++){
				tiles[x+y*width] = rand.nextInt(4);
			}
		}
		
	}

}
