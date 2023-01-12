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

import java.util.*;
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

	private LoadingCache<String, Optional<UserProfileDto>> userProfileCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Optional<UserProfileDto>>() {

						@Override
						public Optional<UserProfileDto> load(String key) {
							try {
								ResponseDto<UserProfileDto> responseDto = userClientApi.getUserProfileByUuid(key);

								if (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) {
									return Optional.ofNullable(responseDto.getData());
								}
							} catch (Exception e) {
								log.error("Unable to get User Profile by userUuid" + key, e);
							}
							return Optional.ofNullable(null);
						}
					});

	public UserProfileDto getUserForUuid(String uuid) {
		try {
			Optional<UserProfileDto> optionalUserProfileDto = userProfileCache.getUnchecked(uuid);
			return optionalUserProfileDto.isPresent() ? optionalUserProfileDto.get() : null;
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
		Optional<UserProfileDto> optionalUserProfileDto = userProfileCache.getUnchecked(uuid);
		if (optionalUserProfileDto.isPresent()) {
			UserProfileDto userProfileDto = optionalUserProfileDto.get();
			userName = userProfileDto.getFirstName() + " " + (StringUtils.isNotBlank(userProfileDto.getLastName()) ? userProfileDto.getLastName() : "");
		}
		return userName;
	}
}