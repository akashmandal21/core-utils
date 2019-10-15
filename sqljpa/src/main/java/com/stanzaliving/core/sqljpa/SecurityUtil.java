package com.stanzaliving.core.sqljpa;

import java.util.Objects;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.common.dto.CurrentUser;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SecurityUtil {

	private static ObjectMapper objectMapper = new ObjectMapper();

	static {
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	public static String getCurrentUserId() {
		CurrentUser userIdDto = getCurrentUser();

		String userId = null;

		if (Objects.nonNull(userIdDto)) {
			userId = userIdDto.getUserId();
		}

		return userId;
	}

	private static CurrentUser getCurrentUser() {
		try {
			RequestAttributes attributes = RequestContextHolder.currentRequestAttributes();

			Object scopedObject =
					attributes.getAttribute("com.stanzaliving.core.base.common.dto.CurrentUser", RequestAttributes.SCOPE_REQUEST);

			String json = objectMapper.writeValueAsString(scopedObject);

			return objectMapper.readValue(json, CurrentUser.class);
		} catch (Exception e) {
		}
		return null;
	}

}