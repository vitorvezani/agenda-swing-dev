package com.window.test;

import java.awt.EventQueue;
import java.util.Arrays;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.window.test.config.AppConfig;
import com.window.test.gui.Login;

public class Main {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Inspecionando os beans fornecido pelo Spring Boot:");

        List<String> beans = Arrays.asList(ctx.getBeanDefinitionNames());
        beans.stream().forEach(System.out::println);
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					
					setLookAndFeel();
					
					Login loginFrame = new Login();
					loginFrame.getFrame().setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	/*
	 * Private Methods
	 */
	
	private static void setLookAndFeel() {
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
	
}
