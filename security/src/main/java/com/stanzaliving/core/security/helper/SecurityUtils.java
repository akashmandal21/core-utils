/**
 * 
 */
package com.stanzaliving.core.security.helper;

import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.context.SecurityContextHolder;
import com.stanzaliving.core.user.enums.UserType;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@UtilityClass
@Log4j2
public class SecurityUtils {

	public static String getCurrentUserName() {

		CurrentUser currentUser = getCurrentUser();

		String userName = "";

		if (currentUser != null) {
			userName = currentUser.getFirstName() + " " + (StringUtils.isNotBlank(currentUser.getLastName()) ? currentUser.getLastName() : "");
		}

		return userName;
	}

	public static String getCurrentUserFirstName() {

		CurrentUser currentUser = getCurrentUser();

		String userName = "";

		if (currentUser != null) {
			userName = currentUser.getFirstName();
		}

		return userName;
	}

	public static String getCurrentUserId() {
		CurrentUser currentUser = getCurrentUser();

		String userId = "";

		if (currentUser != null) {
			userId = currentUser.getUserId();
		}

		return userId;
	}

	public static String getCurrentUserToken() {
		CurrentUser currentUser = getCurrentUser();

		String token = "";

		if (currentUser != null) {
			token = currentUser.getToken();
		}

		return token;
	}
	
	public static String getCurrentUserMobile() {
		CurrentUser currentUser = getCurrentUser();

		String mobile = "";

		if (currentUser != null) {
			mobile = currentUser.getMobile();
		}

		return mobile;
	}
	
	public static Department getCurrentUserDepartment() {
		CurrentUser currentUser = getCurrentUser();

		Department department = null;

		if (currentUser != null) {
			department = currentUser.getDepartment();
		}

		return department;
	}

	public static UserType getCurrentUserType() {
		CurrentUser currentUser = getCurrentUser();

		UserType userType = null;

		if (currentUser != null) {
			userType = currentUser.getUserType();
		}

		return userType;
	}
	
	public static CurrentUser getCurrentUser() {
		CurrentUser currentUser = null;

		try {
			currentUser = SecurityContextHolder.getCurrentUser();
		} catch (Exception e) {
			log.error("Current User Not Found in SecurityContextHolder: ", e);
		}
		return currentUser;
	}

	public static String extractTokenFromRequest(HttpServletRequest request) {
		String token = null;

		if (request.getCookies() != null) {
			for (Cookie cookie : request.getCookies()) {
				if (SecurityConstants.TOKEN_HEADER_NAME.equals(cookie.getName())) {
					token = cookie.getValue();
					break;
				}
			}
		}

		if (token == null) {

			token = request.getHeader(SecurityConstants.AUTHORIZATION_HEADER);
			if (token != null && token.startsWith(SecurityConstants.VENTA_TOKEN_PREFIX)) {		//only if it follows bearer schema, then we would consider valid token
				token = token.replace(SecurityConstants.VENTA_TOKEN_PREFIX, "");
			} else {
				token = null;
			}
		}
		log.debug("token captured: {}",token);
		return token;
	}

}