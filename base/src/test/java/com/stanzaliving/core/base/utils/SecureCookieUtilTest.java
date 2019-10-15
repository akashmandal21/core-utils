package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import javax.servlet.http.Cookie;
import org.junit.Test;

import com.stanzaliving.core.base.utils.SecureCookieUtil;

public class SecureCookieUtilTest {

	@Test
	public void testCreate() {
		Cookie cookie = new Cookie("test", "test");
		cookie.setSecure(true);
		cookie.setHttpOnly(true);
		cookie.setPath("/");
		assertThat(SecureCookieUtil.create("test", "test", Optional.of(false))).isEqualToComparingFieldByField(cookie);
	}

	@Test
	public void testExpire() {
		Cookie cookie = new Cookie("test", "test");
		cookie.setMaxAge(0);
		cookie.setValue(null);
		cookie.setPath("/");
		Cookie expected = SecureCookieUtil.expire(cookie);
		assertThat(expected).isEqualToComparingFieldByField(cookie);
	}
}