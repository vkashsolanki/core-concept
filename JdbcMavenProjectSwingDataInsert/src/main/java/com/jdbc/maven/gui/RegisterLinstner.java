package com.jdbc.maven.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.maven.dbconnection.ConnectionProvider;

//to Perform database data user ActionListener and using callback method
public class RegisterLinstner implements ActionListener {

	UserRegister userRegister;

	public RegisterLinstner(UserRegister register) {
		this.userRegister = register;
	}

	private Object UserRegister;

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// Get all the data of Register form through Jfield data like
		// nameText,mobileText, emailText and passText
		String name = userRegister.nameText.getText();
		String mobile = userRegister.mobileText.getText();
		String email = userRegister.emailText.getText();
		String password = userRegister.passText.getText();

		System.out.println("  " + name + " " + mobile + " " + email + " " + password);
		// From database connect the data
		Connection connection = ConnectionProvider.getConnection();
		// Store into database data
		
		try {
			PreparedStatement statement = connection.prepareStatement("insert into guiuser value(?,?,?,?)");
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, mobile);
			statement.setString(4, password);
			
			statement.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				

	}

}
