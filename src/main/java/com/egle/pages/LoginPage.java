package com.egle.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.egle.base.Base;
import com.egle.utils.Config;

public class LoginPage {
	

	@FindBy(xpath = "//input[@id=\"user-name\"]")
	private WebElement userName;

	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//input[@id=\"login-button\"]")
	private WebElement loginBtn;
	@FindBy(xpath="//h3/button")
	private WebElement text;
	
	Config con = new Config();
	public void userName() {
		userName.sendKeys(con.enterUserName());
	}

	public void passWord() {
		password.sendKeys(con.enterPassword());

	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
	public String getText() {
		return text.getText();
	}
}
