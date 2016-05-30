package com.do_nut.game.input;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteLoader {

	private String path;
	public final int size;
	public int[] pixels;
	
	public SpriteLoader(String path, int size){
		this.path=path;
		this.size=size;
		pixels = new int[size*size];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteLoader.class.getResource(path));
			int w = image.getWidth(), h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
