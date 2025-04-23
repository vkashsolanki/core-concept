package com.jdbc.maven.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLogin {

	JFrame frame;
	JLabel email, password;
	JTextField emailField;
	JPasswordField passwordField;
	JButton login, register;

	UserLogin() {
		frame = new JFrame("Login Page");
		frame.setSize(200, 250);
		frame.setLayout(new FlowLayout());
		frame.setLocation(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Labels
		email = new JLabel("Enter the Email");
		password = new JLabel("Enter the Password");

		// Text fields
		emailField = new JTextField(15);
		passwordField = new JPasswordField(15);

		// Buttons
		login = new JButton("Login");
		register = new JButton("Register");

		// Add components to frame
		frame.add(email);
		frame.add(emailField);
		frame.add(password);
		frame.add(passwordField);
		frame.add(login);
		frame.add(register);

		// Event handling register page
		register.addActionListener(a -> UserRegister.main(null));

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		UserLogin user = new UserLogin();
	}
}
