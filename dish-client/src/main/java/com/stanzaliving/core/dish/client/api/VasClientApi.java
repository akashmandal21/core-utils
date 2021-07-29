package com.stanzaliving.core.dish.client.api;

import java.util.List;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.food.dto.request.VasMasterSearchRequestDto;
import com.stanzaliving.core.food.dto.request.VasMasterUpdateRequestDto;
import com.stanzaliving.core.food.dto.response.VasDataCountDto;
import com.stanzaliving.core.food.dto.response.VasMasterResponseDto;
import com.stanzaliving.core.food.dto.response.VasMasterSearchResponseDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class VasClientApi {

	private final StanzaRestClient restClient;

	public VasClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	
	public List<ListingDto> listing() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/category/listing").build().toUriString();

		TypeReference<ResponseDto<List<ListingDto>>> returnType = new TypeReference<ResponseDto<List<ListingDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<ListingDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting category list for vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public List<KeyValuePairDto> getFeedbackOptionsListing() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/feedback/listing").build().toUriString();

		TypeReference<ResponseDto<List<KeyValuePairDto>>> returnType = new TypeReference<ResponseDto<List<KeyValuePairDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<KeyValuePairDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting feedback option list for vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public VasMasterResponseDto getVasMaster() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/id/{vasMasterId}").build().toUriString();

		TypeReference<ResponseDto<VasMasterResponseDto>> returnType = new TypeReference<ResponseDto<VasMasterResponseDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<VasMasterResponseDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public PageResponse<VasMasterSearchResponseDto> search(int pageNo, int limit, VasMasterSearchRequestDto searchRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/search/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<VasMasterSearchResponseDto>>> returnType = new TypeReference<ResponseDto<PageResponse<VasMasterSearchResponseDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<PageResponse<VasMasterSearchResponseDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, searchRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while search from vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public VasDataCountDto getDataCount() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/data/count").build().toUriString();

		TypeReference<ResponseDto<VasDataCountDto>> returnType = new TypeReference<ResponseDto<VasDataCountDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<VasDataCountDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public String addUpdate(VasMasterUpdateRequestDto updateRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/add").build().toUriString();

		TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<String> responseDto = null;

		try {
			responseDto = restClient.put(path, queryParams, updateRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while add/update", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
}

