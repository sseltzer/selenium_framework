package com.ctm.selenium.framework.selenium.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ctm.selenium.framework.selenium.wrappers.WebDriverWrapper;

class FirefoxBrowser extends Browser {

	/**
	 * Create and set the WebDriver for the Browser object. This is unique to each WebDriver instance being
	 * requested for each Browser.
	 * <br><br>
	 * Firefox requires no extra effort since it is supported natively within Selenium. Simply create an
	 * instance of FirefoxDriver and the rest is taken care of.
	 */
	@Override
	public void setWebDriver() {
		WebDriver webDriver = new FirefoxDriver();
		super.webDriverWrapper = WebDriverWrapper.convert(webDriver);
	}

	/**
	 * The quit function will ensure that the connection to the WebDriver is closed.
	 * <br><br>
	 * Firefox requires no extra functions, so simply call quit on the WebDriver.
	 */
	@Override
	public void quit() {
		if (getWebDriver() != null) getWebDriver().quit();
	}
}
