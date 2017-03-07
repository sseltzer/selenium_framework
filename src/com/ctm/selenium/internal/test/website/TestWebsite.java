package com.ctm.selenium.internal.test.website;

import com.ctm.selenium.framework.selenium.browsers.Browser;
import com.ctm.selenium.framework.selenium.website.Website;

/**
 *
 *
 * TestWebsite.java
 *
 * @author ckiehl Jun 16, 2014
 */
public class TestWebsite extends Website {

	public TestWebsite(Browser browser) {
		super(browser);
	}

	@Override
	public void setBaseURL() {
		super.setBaseURL("http://vpdev.valpak.com/redesign/");
	}
}
