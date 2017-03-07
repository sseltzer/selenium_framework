package com.ctm.selenium.internal.test.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.ctm.selenium.framework.error.ErrorManager;
import com.ctm.selenium.framework.verification.junit.TestSuite;
import com.ctm.selenium.internal.test.tests.environment.EnumTester;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		EnumTester.class, 
		ErrorManager.class
})
public class SuiteAllTest extends TestSuite {
}
