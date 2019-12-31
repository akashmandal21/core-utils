package com.stanzaliving.core.security.service;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.user.dto.UserDto;
import com.stanzaliving.core.user.dto.UserProfileDto;

public interface AuthService {

	ResponseDto<UserProfileDto> validateToken(String token);

	void validateUrlPermission(String userId, String uri);

	ResponseDto<UserProfileDto> getUserProfile();

}