package com.jdbc.maven.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserRegister {

	public JLabel name, mobile, email, password;
	public JButton register,login;
	public JTextField nameText, mobileText, emailText, passText;
	public JFrame frame;

	UserRegister() {
		frame = new JFrame("Register Page");
		frame.setSize(250, 280);
		frame.setLayout(new FlowLayout());
		frame.setLocation(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Initialize components
		name = new JLabel("Enter the Name");
		nameText = new JTextField(15);
		mobile = new JLabel("Enter the Mobile");
		mobileText = new JTextField(15);
		email = new JLabel("Enter the Email");
		emailText = new JTextField(15);
		password = new JLabel("Enter the Password");
		passText = new JTextField(15);

		register = new JButton("Register");
		login = new JButton("Login");

		// Add components to frame
		frame.add(name);
		frame.add(nameText);
		frame.add(mobile);
		frame.add(mobileText);
		frame.add(email);
		frame.add(emailText);
		frame.add(password);
		frame.add(passText);
		frame.add(register);
		frame.add(login);

		// close window frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Event handling login page
		login.addActionListener(a -> UserLogin.main(null));
		
		//pass RegisterListener object
		register.addActionListener(new RegisterLinstner(this));

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		UserRegister uRegister = new UserRegister();
	}
}
