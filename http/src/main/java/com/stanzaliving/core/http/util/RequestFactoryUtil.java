package com.stanzaliving.core.http.util;

import com.sun.deploy.net.proxy.ProxyConfigException;
import lombok.experimental.UtilityClass;
import org.springframework.http.client.AbstractClientHttpRequestFactoryWrapper;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

import java.net.UnknownHostException;

/**
 * @author piyush srivastava
 *
 * @date 08-Apr-2020
 *
 */


@UtilityClass
public class RequestFactoryUtil {
	public SimpleClientHttpRequestFactory getSimpleClientRequestfactory(int connectTimeout, int readTimeout, String proxy) throws ProxyConfigException, UnknownHostException {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setConnectTimeout(connectTimeout);
		requestFactory.setReadTimeout(readTimeout);

		if(proxy != null){
			requestFactory.setProxy(ProxyUtil.getProxy(proxy));
		}
		return requestFactory;
	}


	public AbstractClientHttpRequestFactoryWrapper getRequestFactory(int connectTimeout, int readTimeout, String proxy) throws ProxyConfigException, UnknownHostException {
		return new BufferingClientHttpRequestFactory(getSimpleClientRequestfactory(connectTimeout, readTimeout, proxy));
	}
}
