
package com.ctm.selenium.framework.jsoup.webpages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ctm.selenium.framework.jsoup.collections.RList;
import com.ctm.selenium.framework.jsoup.collections.SoupCollection;
import com.ctm.selenium.framework.jsoup.elements.WebElements;
import com.ctm.selenium.framework.jsoup.elements.WebElementsGroup;

/**
 * WebPages.java
 * @author ckiehl Aug 22, 2014
 */
public class SoupPageGroup implements SoupCollection<SoupPageGroup, SoupPage>, Iterable<SoupPage> {
	
	private final RList<SoupPage> pages;
	
	public SoupPageGroup(RList<SoupPage> pages) {
		this.pages = pages;
	}
	
	public SoupPageGroup(List<SoupPage> pages) {
		SoupPage[] pagesArray = pages.toArray(new SoupPage[pages.size()]);
		this.pages = RList.of(pagesArray);
	}
	
	public WebElementsGroup select(String cssQuery) {
		List<WebElements> elementsList = new ArrayList<WebElements>(); 
		for (SoupPage webPage : this.pages) 
			elementsList.add(webPage.select(cssQuery));
		return new WebElementsGroup(elementsList);
	}
	
	@Override
	public Iterator<SoupPage> iterator() {
		return this.pages.iterator();
	}

	@Override
	public SoupPageGroup take(Integer i) {
		return new SoupPageGroup(this.pages.take(i));
	}

	@Override
	public SoupPageGroup drop(Integer i) {
		return new SoupPageGroup(this.pages.drop(i));
	}

	@Override
	public SoupPageGroup init() {
		return new SoupPageGroup(this.pages.init());
	}

	@Override
	public SoupPageGroup tail() {
		return new SoupPageGroup(this.pages.tail()); 
	}

	@Override
	public SoupPage head() {
		return this.pages.head(); 
	}

	@Override
	public SoupPage last() {
		return this.pages.last();
	}
	
	@Override
	public SoupPage get(Integer i) {
		return this.pages.get(i);
	}

	@Override
	public int size() {
		return this.pages.size();
	}

	@Override
	public boolean isEmpty() {
		return this.pages.isEmpty();
	}

	@Override
	public List<SoupPage> toList() {
		return this.pages.toList();
	}
}
