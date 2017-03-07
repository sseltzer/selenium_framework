package com.ctm.selenium.framework.strings;

import org.junit.Test;

import com.ctm.selenium.framework.strings.maps.FrameworkStrings;
import com.ctm.selenium.framework.strings.maps.InternalErrorStrings;
import com.ctm.selenium.framework.strings.maps.PublicErrorStrings;

public class StringLoaderTester {

	@Test
	public void testThis() {
		System.out.println(FrameworkStrings.FILTERPACKAGE);
		System.out.println(InternalErrorStrings.WARNING);
		System.out.println(PublicErrorStrings.FAILED_FORM_FILL);
	}
}
