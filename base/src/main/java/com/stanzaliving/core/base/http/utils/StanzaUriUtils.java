package com.stanzaliving.core.base.http.utils;

import lombok.experimental.UtilityClass;
import org.springframework.web.util.UriUtils;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Mar-2021
 */

@UtilityClass
public class StanzaUriUtils {
	public String encodeQueryParam(String path) {
		return UriUtils.encodeQueryParam(path, "UTF-8");
	}
}
