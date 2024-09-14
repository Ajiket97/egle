package com.egle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.egle.base.Base;

public class BasePage extends Base {
	
	public BasePage(RemoteWebDriver d){
		super.driver=d;
		
	}
}
