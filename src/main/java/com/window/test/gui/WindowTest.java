package com.window.test.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WindowTest {

	private JFrame frame;
	private JMenu mnNewMenu = new JMenu("Menu Principal");
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem mntmNewMenuItem = new JMenuItem("Menu Secundário");
	private JSeparator separator = new JSeparator();
	private JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
	private JButton btnNewButton = new JButton("New button");

	/**
	 * Create the application.
	 */
	public WindowTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setLookAndFeel();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1145, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		
		menuBar.add(mnNewMenu);
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(separator);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		frame.getContentPane().setLayout(null);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton.setText("LOL");
			}
		});
		
		btnNewButton.setBounds(79, 54, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	/*
	 * Private Methods
	 */
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
		            UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Getters And Setters
	 */
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
