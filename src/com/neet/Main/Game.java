package com.neet.Main;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {

                // Adding Title
		JFrame window = new JFrame("Jump Solider v.2");
		window.add(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
}
