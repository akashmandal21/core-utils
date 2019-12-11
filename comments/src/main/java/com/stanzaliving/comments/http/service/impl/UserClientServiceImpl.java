package com.stanzaliving.comments.http.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.stanzaliving.comments.http.service.UserClientService;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.client.api.UserClientApi;
import com.stanzaliving.core.user.dto.UserProfileDto;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserClientServiceImpl implements UserClientService {

	@Qualifier("userClient")
	@Autowired
	private StanzaRestClient stanzaRestClient;

	private UserClientApi userClientApi;

	@PostConstruct
	public void init() {
		userClientApi = new UserClientApi(stanzaRestClient);
	}

	
	@Override
	public Map<String, String> findUserNames(List<String> userIds) {
		
		log.info("Request find user names for userids ["+userIds+"]");
		
		Map<String, String> userIdVsName = new HashMap<>();

		if (CollectionUtils.isNotEmpty(userIds)) {
			ResponseDto<PageResponse<UserProfileDto>> responseDto = userClientApi.getUserDetails(1, userIds.size(),
					userIds);

			if (Objects.nonNull(responseDto) && responseDto.isStatus() && responseDto.getData().getRecords() > 0) {

				userIdVsName = new HashMap<>();

				List<UserProfileDto> userProfileDtos = responseDto.getData().getData();

				for (UserProfileDto userProfileDto : userProfileDtos) {
					userIdVsName.put(userProfileDto.getUuid(),
							userProfileDto.getFirstName() + " " + userProfileDto.getLastName());
				}
			}
		}
		return userIdVsName;

	
	}

}
