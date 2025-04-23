package com.jdbc.maven.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.jdbc.maven.utils.PropertiesReader;

public final class ConnectionProvider {

	private static Connection connection = null;

	private ConnectionProvider() {

	}

	public static final synchronized Connection getConnection() {
		try {
			
			
			if(connection==null) {
			Class.forName(PropertiesReader.getProperties("driver"));
			// creating connection
			connection = DriverManager.getConnection(PropertiesReader.getProperties("url"),
					PropertiesReader.getProperties("username"), PropertiesReader.getProperties("password"));
			
			}
			else
			{
				return connection;
			}

		} catch (Exception e) {

		}

		return connection;

	}
}
