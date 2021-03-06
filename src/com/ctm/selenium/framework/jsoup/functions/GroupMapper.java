
package com.ctm.selenium.framework.jsoup.functions;

import com.ctm.selenium.framework.jsoup.collections.RList;
import com.ctm.selenium.framework.jsoup.elements.WebElements;
import com.google.common.base.Function;

/**
 *
 *
 * GroupMapper.java
 *
 * @author ckiehl Aug 25, 2014
 */
public class GroupMapper {
	
	private RList<WebElements> elmGroup;

	public GroupMapper(RList<WebElements> elementsGroup) {
		this.elmGroup = elementsGroup;
	}
	
	public RList<RList<String>> toText() {
		return this.elmGroup.map(new Function<WebElements, RList<String>>() {
			@Override public RList<String> apply(WebElements elmGroup) { return elmGroup.map().toText(); }
		});
	}
	
	public RList<RList<String>> toAttr(final String attrName) {
		return this.elmGroup.map(new Function<WebElements, RList<String>>() {
			@Override public RList<String> apply(WebElements elmGroup) { return elmGroup.map().toAttr(attrName); }
		});
	}
	
}
