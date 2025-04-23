package com.jdbc.maven.listener;

import com.jdbc.maven.dbconnection.ConnectionProvider;

public class JdbcListener {
	public static void main(String[] args) {
		
		System.out.println(ConnectionProvider.getConnection());
	}

}
