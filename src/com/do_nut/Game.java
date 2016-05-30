package com.do_nut;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.swing.JFrame;

import com.do_nut.game.entity.entities.EntityPlayer;
import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.input.KeyboardInput;
import com.do_nut.game.map.Level;
import com.do_nut.game.map.levels.TestGeneration;
import com.do_nut.game.menu.MainMenu;

public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 8623937059380569597L;
	public static final int width = 200, height = width, scale = 2;
	public static final String title = "ScienceFair2016Game", version="0.1", author="Do-nut";
	private Thread gameThread=new Thread(this, title);
	public boolean running=false;
	
	private GameGraphics g;
	public JFrame frame;
	private EntityPlayer player;
	private KeyboardInput key;
	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	private int frames = 0, updates = 0;
	private Level level;
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	
	private void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs==null){
			createBufferStrategy(3);
			return;}
		g.clear();
		int xScroll = player.x - g.width / 2;
		int yScroll = player.y - g.height / 2;
		level.render(xScroll, yScroll, g);
		player.render(g);
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = g.pixels[i];}
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0 , 0, getWidth(), getHeight(), null);
		g.dispose();
		bs.show();}

	
	
	private void update() {
		key.update();
		player.update();
		
	}
	
	public static void main(String[] args){
		System.out.println(title+" running!");
		new MainMenu();
		
		
		
	}

	public Game() {
		Dimension windowSize = new Dimension(width*scale, height*scale);
		setPreferredSize(windowSize);
		g = new GameGraphics(width, height);
		key = new KeyboardInput();
		frame = new JFrame(title);
		player = new EntityPlayer(key);
		level = new TestGeneration();
		addKeyListener(key);
		player.init(level);
		}

	

	


	@Override
	public void run() {
		long lastTime = System.nanoTime(), timer = System.currentTimeMillis();
		final double nanoSeconds = 1000000000.0 / 60.0; 
		double delta = 0;
		
		requestFocus();
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / nanoSeconds;
			lastTime=now;
			while (delta >= 1) {
			update();
			updates++;
			delta--;
			}
			render();
			frames++;
			if(System.currentTimeMillis() - timer >1000){
				timer += 1000;
				this.frame.setTitle(title+" UPS: "+updates+" | FPS: "+frames);
				updates = 0;
				frames = 0;
			}
		}
		stop();
	}

	public synchronized void start() {
		running=true;
		gameThread.start();
	}
	
	public synchronized void stop() {
		running=false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
