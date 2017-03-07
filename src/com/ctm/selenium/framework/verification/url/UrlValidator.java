package com.ctm.selenium.framework.verification.url;

import com.ctm.selenium.framework.error.exceptions.FrameworkException;
import com.ctm.selenium.framework.selenium.mapping.PageObject;
import com.ctm.selenium.framework.selenium.webpage.base.WebPage;

/**
 *
 *
 * UrlValidator.java
 *
 * @author ckiehl Jun 13, 2014
 */
public class UrlValidator {

	private static void throwNewHrefNotFoundException() {
		throw new FrameworkException(
			"\n\nPageObject supplied does not appear to contain a link. " +
			"No 'href' or 'src' attributes could be found\n" +
			"Be sure to double check that your PageObject points to an <a> tag\n");
	}

	public static void validateElementContainsURL(WebPage webPage, PageObject pageObject, String urlAttr) {
		if (!webPage.locateElement().findElement(pageObject).hasAttribute(urlAttr)) throwNewHrefNotFoundException();
	}
}
