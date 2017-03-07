package com.ctm.selenium.framework.selenium.webpage.base;

import com.ctm.selenium.framework.selenium.browsers.Browser;
import com.ctm.selenium.framework.selenium.website.AppWebsite;

public class AppPage {

	public static WebPage getInstance(Browser browser) {
		return WebPage.getInstance(browser, new AppWebsite(browser));
	}
}
