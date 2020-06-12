package com.stanzaliving.core.user.client.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.CollectionUtils;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.user.client.api.UserClientApi;
import com.stanzaliving.core.user.dto.UserProfileDto;

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

	public UserProfileDto getUserForUuid(String uuid) {
		return getAllUsers().get(uuid);
	}
}