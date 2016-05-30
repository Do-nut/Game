package com.do_nut.game.menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.do_nut.Game;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6579968251444659782L;
	private JPanel contentPane;


	public MainMenu() {
		setTitle("ScienceFairGame2016");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(480, 80);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblRhysScienceFair = new JLabel("Rhys' Science Fair Game");
		lblRhysScienceFair.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblRhysScienceFair.setBounds(10, 5, 287, 30);
		contentPane.add(lblRhysScienceFair);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Game game = new Game();
				game.frame.setResizable(false);
				game.frame.getContentPane().add(game);
				game.frame.pack();
				game.frame.setDefaultCloseOperation(3);
				game.frame.setLocationRelativeTo(null);
				game.frame.setVisible(true);
				game.start();
				
			}
		});
		btnNewButton.setBounds(301, 5, 153, 30);
		contentPane.add(btnNewButton);
		
	}
}
