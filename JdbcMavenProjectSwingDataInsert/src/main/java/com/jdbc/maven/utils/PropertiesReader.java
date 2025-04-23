package com.jdbc.maven.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	static Properties env_Properties = new Properties();
	static Properties config_Properties = new Properties();

	static {

		try {
			System.out.println(System.getProperty("user.dir"));

			env_Properties.load(new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\local\\jdbc\\env\\env.properties"));
			String env = (String) env_Properties.get("environment");
			config_Properties.load(new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\local\\jdbc\\env\\" + env + "-config.properties"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static String getProperties(String key) {
		// //passing will be key value of properties file have you mentioned
		return config_Properties.getProperty(key);
	}

	public static void main(String[] args) {
		
		
		System.out.println(PropertiesReader.getProperties("driver"));
	}
}
