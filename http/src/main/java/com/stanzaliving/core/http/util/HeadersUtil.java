package com.stanzaliving.core.http.util;

import lombok.experimental.UtilityClass;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author piyush srivastava
 *
 * @date 08-Apr-2020
 *
 */

@UtilityClass
public class HeadersUtil {
	public HttpHeaders getDefaultHeaders(){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.ALL));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setCacheControl(CacheControl.noCache());
		return headers;
	}


	public HttpHeaders getHeadersForRequest(HttpHeaders headers){
		HttpHeaders headerParams = new HttpHeaders();
		HttpHeaders defaultHeaders = getDefaultHeaders();

		headerParams.addAll(defaultHeaders);

		if(headers != null) {
			Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
			for (Map.Entry<String, List<String>> entry : entrySet) {
				headerParams.remove(entry.getKey());
			}
			headerParams.addAll(headers);
		}
		return headerParams;
	}
}
