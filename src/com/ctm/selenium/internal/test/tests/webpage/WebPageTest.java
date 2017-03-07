package com.ctm.selenium.internal.test.tests.webpage;

import org.junit.Test;

import com.ctm.selenium.framework.selenium.wrappers.TimingManager;
import com.ctm.selenium.framework.verification.junit.TestScript;
import com.ctm.selenium.internal.test.website.GoogleWebsite;

public class WebPageTest extends TestScript {

	@Test
	public void testOpenGoogle() {
		new GoogleWebsite(getBrowser()).open();
		TimingManager.waitForSpecifiedDuration(3000);
	}
}
