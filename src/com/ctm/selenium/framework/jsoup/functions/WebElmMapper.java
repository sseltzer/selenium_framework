
package com.ctm.selenium.framework.jsoup.functions;

import com.ctm.selenium.framework.jsoup.collections.RList;
import com.ctm.selenium.framework.jsoup.collections.RStringList;
import com.ctm.selenium.framework.jsoup.elements.WebElement;
import com.google.common.base.Function;

/**
 *
 *
 * WebElmMapper.java
 *
 * @author ckiehl Sep 5, 2014
 */
public class WebElmMapper extends Mapper {
	
	private RList<WebElement> elms;

	public WebElmMapper(RList<WebElement> elements) {
		this.elms = elements;
	}
	
	public RStringList toText() {
		return new RStringList(this.elms.map(new Function<WebElement, String>() {
			@Override public String apply(WebElement e) { return e.text(); }
		}));
	}
	
	public RStringList toAttr(final String attrName) {
		return new RStringList(this.elms.map(new Function<WebElement, String>() {
			@Override public String apply(WebElement e) { return e.attr(attrName); }
		}));
	}
}
