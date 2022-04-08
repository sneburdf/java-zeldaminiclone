package zeldaminiclone;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 480, HEIGHT = 480;
	

	public Game() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		
	}

	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.setTitle("Mini Zelda");
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.BLACK);;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
