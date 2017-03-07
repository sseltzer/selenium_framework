package com.ctm.selenium.framework.utility.parallelism;

/**
 *
 * Function.java
 *
 * @author ckiehl Aug 1, 2014
 */
public interface Function<E, T> {
	public T apply(E e) throws Exception;
}
