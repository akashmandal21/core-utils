/**
 * 
 */
package com.stanzaliving.core.security.helper;

import com.stanzaliving.core.pojo.CurrentUser;
import com.stanzaliving.core.security.context.SecurityContextHolder;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

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
			userName = currentUser.getFirstName() + " " + currentUser.getLastName();
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

	public static CurrentUser getCurrentUser() {
		CurrentUser currentUser = null;

		try {
			currentUser = SecurityContextHolder.getCurrentUser();
		} catch (Exception e) {
			log.error("Current User Not Found in SecurityContextHolder: ", e);
		}
		return currentUser;
	}
}