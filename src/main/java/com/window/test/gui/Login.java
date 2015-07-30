package com.window.test.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import com.window.test.service.TestService;

public class Login {

	private JFrame frame;
	private JMenu mnNewMenu = new JMenu("Menu Principal");
	private JMenuBar menuBar = new JMenuBar();
	private JSeparator separator = new JSeparator();
	private JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
	private JTextField textField;
	private JPasswordField passwordField;

	@Autowired
	private TestService testService;
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		
		menuBar.add(mnNewMenu);
		mnNewMenu.add(separator);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(99, 42, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(99, 67, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(155, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 64, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(84, 122, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JButton btnLogin = new JButton("Login");
		
		performLogin(btnLogin);
		
		btnLogin.setBounds(215, 122, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		testService.sayHello();
	}

	private void performLogin(JButton btnLogin) {
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Logado!");
			}
		});
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
