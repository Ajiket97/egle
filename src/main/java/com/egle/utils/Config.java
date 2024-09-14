package com.egle.utils;

public class Config {
	public String readProperties(String key) {
		String baseDir = System.getProperty("user.dir");
		String filePath = baseDir + "/src/main/resources/config.properties";
		PropUtil pU = new PropUtil(filePath);
		return pU.readPropertiesFile(filePath, key);

	}

	public String openBrowser() {
		return readProperties("browserName");
	}

	public String launchUrl() {
		return readProperties("appUrl");
	}
	public String enterUserName() {
		return readProperties("userName");
	}
	public String enterPassword() {
		return readProperties("password");
	}
}
