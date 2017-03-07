
package com.ctm.selenium.internal.test.tests.jsoup;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.ctm.selenium.internal.test.tests.jsoup.collections.RlistTest;
import com.ctm.selenium.internal.test.tests.jsoup.functions.TestStringFilter;
import com.ctm.selenium.internal.test.tests.jsoup.functions.TestStringMapper;
import com.ctm.selenium.internal.test.tests.jsoup.functions.TestWebElmFilter;
import com.ctm.selenium.internal.test.tests.jsoup.functions.TestWebElmMapper;
/**
 *
 *
 * SoupKitchenTestSuite.java
 *
 * @author ckiehl Aug 25, 2014
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	RlistTest.class, 
	TestWebElmMapper.class,
	TestWebElmFilter.class,
	TestStringFilter.class, 
	TestStringMapper.class 
})
public class SoupSuite {

}
