package com.ctm.selenium.internal.test.website;

import com.ctm.selenium.framework.selenium.browsers.Browser;
import com.ctm.selenium.framework.selenium.website.Website;

public class GoogleWebsite extends Website {

	public GoogleWebsite(Browser browser) {
		super(browser);
	}

	@Override
	public void setBaseURL() {
		super.setBaseURL("http://www.google.com");
	}
}
