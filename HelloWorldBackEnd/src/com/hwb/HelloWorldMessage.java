package com.hwb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HelloWorldMessage {
	private String message = "Version 26";

	public String getMessage() {
		return this.message;
	}

	public String getEnvironment() {
		Properties properties = new Properties();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("helloWorld.properties");
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties.getProperty("environment");
	}
}