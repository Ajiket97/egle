package com.egle.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.egle.utils.Config;

public class Base {
	protected RemoteWebDriver driver;
	Config conf = new Config();

	@BeforeMethod

	public WebDriver setUp() throws InvalidBrowserException {
		if (conf.openBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (conf.openBrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new InvalidBrowserException(conf.openBrowser());
		}
		driver.get(conf.launchUrl());
		driver.manage().window().maximize();
		return driver;
	}

	public void tearDown() {
		driver.close();

	}
	public void takeScreenshot(String fileName) {
        File file = driver.getScreenshotAs(OutputType.FILE);
        String dest = "C:\\Users\\shrik\\eclipse-workspace\\egle\\test-output" + fileName + ".png";
        try {
			FileUtils.copyFile(file, new File(dest));
		} catch (IOException e) {
		
		}
	}

}
