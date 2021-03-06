
package com.ctm.selenium.framework.jsoup.functions;

import com.ctm.selenium.framework.jsoup.collections.RList;
import com.ctm.selenium.framework.jsoup.elements.WebElement;
import com.ctm.selenium.framework.jsoup.elements.WebElements;
import com.google.common.base.Predicate;

/**
 *
 *
 * WebElmFilter.java
 *
 * @author ckiehl Sep 8, 2014
 */
public class WebElmFilter extends Filter {
	
	private RList<WebElement> elms;

	public WebElmFilter(RList<WebElement> elements) {
		this.elms = elements;
	}
	
	public WebElements textMatching(final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement element) { return element.text().matches(criteria); }
		}));
	}
	
	public WebElements textNotMatching(final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement element) { return !element.text().matches(criteria); }
		}));
	}
	
	public WebElements textContaining(final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement e) { return e.text().contains(criteria); }
		}));
	}
	
	public WebElements textNotContaining(final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement e) { return !e.text().contains(criteria); }
		}));
	}
	
	public WebElements attrMatching(final String attrName, final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement e) { return e.attr(attrName).matches(criteria); }
		}));
	}
	
	public WebElements attrNotMatching(final String attrName, final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement e) { return !e.attr(attrName).matches(criteria); }
		}));
	}

	public WebElements attrContaining(final String attrName, final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement e) { return e.attr(attrName).contains(criteria); }
		}));
	}
	
	public WebElements attrNotContaining(final String attrName, final String criteria) {
		return new WebElements(this.elms.filter(new Predicate<WebElement>() {
			@Override public boolean apply(WebElement e) { return !e.attr(attrName).contains(criteria); }
		}));
	}
}
