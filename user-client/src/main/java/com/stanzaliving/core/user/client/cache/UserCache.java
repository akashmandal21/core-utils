package com.stanzaliving.core.user.client.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.user.client.api.UserClientApi;
import com.stanzaliving.core.user.dto.UserProfileDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Log4j2
public class UserCache {

	private UserClientApi userClientApi;

	public UserCache(UserClientApi userClientApi) {
		this.userClientApi = userClientApi;
	}

	private LoadingCache<String, Map<String, UserProfileDto>> allUserCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String, UserProfileDto>>() {

						@Override
						public Map<String, UserProfileDto> load(String key) {

							Map<String, UserProfileDto> userMap = new HashMap<>();

							ResponseDto<List<UserProfileDto>> responseDto = userClientApi.getAllUsers();

							if (Objects.nonNull(responseDto) && responseDto.isStatus() && CollectionUtils.isNotEmpty(responseDto.getData())) {

								responseDto.getData().forEach(user -> userMap.put(user.getUuid(), user));

							}

							return userMap;
						}
					});

	public Map<String, UserProfileDto> getAllUsers() {
		return allUserCache.getUnchecked("users");
	}

	private LoadingCache<String, UserProfileDto> userProfileCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, UserProfileDto>() {

						@Override
						public UserProfileDto load(String key) {
							ResponseDto<UserProfileDto> responseDto = userClientApi.getUserProfileByUuid(key);

							if (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) {
								return responseDto.getData();
							}
							return null;
						}
					});

	public UserProfileDto getUserForUuid(String uuid) {
		try {
			return userProfileCache.getUnchecked(uuid);
		} catch (Exception e) {
			log.error("Unable to get UserProfile from uuid {}", uuid, e);
			return null;
		}
	}

	public String getUserName(String uuid) {

		String userName = "";
		if (StringUtils.isBlank(uuid)) {
			return userName;
		}

		UserProfileDto userProfileDto = userProfileCache.getUnchecked(uuid);
		if (userProfileDto != null) {
			userName = userProfileDto.getFirstName() + " " + userProfileDto.getLastName();
		}
		return userName;
	}
}