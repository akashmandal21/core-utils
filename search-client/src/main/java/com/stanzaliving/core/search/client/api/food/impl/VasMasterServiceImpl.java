package com.stanzaliving.core.search.client.api.food.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.response.DataCountPageResponse;
import com.stanzaliving.core.search.client.api.food.VasMasterService;
import com.stanzaliving.search.food.index.dto.vasmaster.VasMasterIndexDto;
import com.stanzaliving.search.food.search.dto.VasMasterSearchDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 17-Mar-2021
 */

@Log4j2
@Service
public class VasMasterServiceImpl implements VasMasterService {

	@Override
	public DataCountPageResponse<VasMasterIndexDto> searchVasMaster(StanzaRestClient restClient, VasMasterSearchDto searchDto) {

		String path = UriComponentsBuilder.fromPath("/internal/search/food/vas/master").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<DataCountPageResponse<VasMasterIndexDto>>> returnType = new TypeReference<ResponseDto<DataCountPageResponse<VasMasterIndexDto>>>() {};

		ResponseDto<DataCountPageResponse<VasMasterIndexDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, searchDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}
}
