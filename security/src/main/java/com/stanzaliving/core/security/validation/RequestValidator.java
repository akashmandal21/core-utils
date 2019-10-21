package com.stanzaliving.core.security.validation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stanzaliving.core.pojo.CurrentUser;

public interface RequestValidator {

	CurrentUser validate(HttpServletRequest request, HttpServletResponse response, CurrentUser user);
}