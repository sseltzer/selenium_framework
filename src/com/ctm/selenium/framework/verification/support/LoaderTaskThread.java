/**
 *
 *
 * ThreadedLoader.java
 *
 * @author ckiehl Apr 28, 2014
 */
package com.ctm.selenium.framework.verification.support;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.concurrent.Callable;

import com.ctm.selenium.framework.error.exceptions.PublicException;

public final class LoaderTaskThread implements Callable<HttpURLConnection> {
	private String testUrl;

	public LoaderTaskThread(String testUrl) {
		this.testUrl = testUrl;
	}

	@Override
	public HttpURLConnection call() {
		try {
			URL url = new URL(this.testUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			return connection;
		} catch (MalformedURLException e) {
			throw new PublicException(e);
		} catch (ProtocolException e) {
			throw new PublicException(e);
		} catch (IOException e) {
			throw new PublicException(e);
		}
	}
}
