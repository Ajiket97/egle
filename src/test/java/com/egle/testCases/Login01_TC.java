package com.egle.testCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.egle.base.Base;
import com.egle.base.TestListener;
import com.egle.pages.BasePage;
import com.egle.pages.LoginPage;
import com.egle.utils.Config;
@Listeners(TestListener.class)
public class Login01_TC extends Base {

	LoginPage lP = new LoginPage();

	@Test
	public void verifyLoginFuncationality() {
		String xpected = "pass";
		PageFactory.initElements(driver, lP);
		lP.userName();
		lP.passWord();
		lP.clickLoginBtn();
		String actul = lP.getText();
		Assert.assertEquals(actul, xpected);
	}
}
