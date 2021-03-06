package com.ctm.selenium.framework.verification.junit;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import com.ctm.selenium.framework.environment.EnvironmentHandler;
import com.ctm.selenium.framework.error.exceptions.FrameworkException;
import com.ctm.selenium.framework.selenium.webpage.base.WebPage;

public class ScreenshotWatcher extends TestWatcher {
    @Override
    protected void failed(Throwable e, Description description) {
    	if (!EnvironmentHandler.getScreenshotOnFail()) return;
    	try {
    		WebPage.getCurrentPage().getBrowser().screenshotAndWriteToDisk(TestScript.methodName + ".png");
		} catch (FrameworkException fe) {
			e.printStackTrace(); // Ignore if we can't write the file.
		}
    }
}
