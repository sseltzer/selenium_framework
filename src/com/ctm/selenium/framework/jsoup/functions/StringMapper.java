
package com.ctm.selenium.framework.jsoup.functions;

import com.ctm.selenium.framework.jsoup.collections.RList;
import com.ctm.selenium.framework.jsoup.collections.RStringList;
import com.google.common.base.Function;

/**
 *
 *
 * StringMapper.java
 *
 * @author ckiehl Aug 26, 2014
 */
public class StringMapper extends Mapper {
	
	private RList<String> elms; 
	
	public StringMapper(RList<String> elements) {
		this.elms = elements;
	}
	
	public RStringList replace(final String target, final String replacement) {
		return new RStringList(this.elms.map(new Function<String, String>() {
			@Override public String apply(String s) { return s.replace(target, replacement); }
		}));
	}
	
	public RStringList toLowerCase() {
		return new RStringList(this.elms.map(new Function<String, String>() {
			@Override public String apply(String s) { return s.toLowerCase(); }
		}));
	}
	
	public RStringList toUpperCase() {
		return new RStringList(this.elms.map(new Function<String, String>() {
			@Override public String apply(String s) { return s.toUpperCase(); }
		}));
	}
	
	public RStringList trimAll() {
		return new RStringList(this.elms.map(new Function<String, String>() {
			@Override public String apply(String s) { return s.trim(); }
		}));
	}
	
}
