
package com.ctm.selenium.framework.jsoup.functions;

import com.ctm.selenium.framework.jsoup.collections.RList;
import com.google.common.base.Predicate;

/**
 *
 *
 * StringFilter.java
 *
 * @author ckiehl Sep 8, 2014
 */
public class StringFilter extends Filter {
	
	private RList<String> elms; 
	
	public StringFilter(RList<String> elements) {
		this.elms = elements;
	}
	
	public RList<String> stringMatching(final String criteria) {
		return this.elms.filter(new Predicate<String>() {
			@Override public boolean apply(String s) { return s.matches(criteria); }
		});
	}
	
	public RList<String> stringNotMatching(final String criteria) {
		return this.elms.filter(new Predicate<String>() {
			@Override public boolean apply(String s) { return !s.matches(criteria); }
		});
	}
	
	public RList<String> stringContaining(final String criteria) {
		return this.elms.filter(new Predicate<String>() {
			@Override public boolean apply(String s) { return s.contains(criteria); }
		});
	}
	
	public RList<String> stringNotContaining(final String criteria) {
		return this.elms.filter(new Predicate<String>() {
			@Override public boolean apply(String s) { return !s.contains(criteria); }
		});
	}
}




