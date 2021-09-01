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
import com.stanzaliving.core.food.dto.FoodItemTagsDto;
import com.stanzaliving.core.food.dto.TagDto;
import com.stanzaliving.core.food.dto.request.FoodItemTagsRequestDto;
import com.stanzaliving.core.food.dto.request.TagRequestDto;
import com.stanzaliving.core.food.enums.TagLabel;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class TagClientApi {

	private final StanzaRestClient restClient;

	public TagClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	

	public TagDto addTag(TagRequestDto tagRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/tag/add").build().toUriString();

		TypeReference<ResponseDto<TagDto>> returnType = new TypeReference<ResponseDto<TagDto>>() {};

		ResponseDto<TagDto> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, tagRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding tag", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public PageResponse<TagDto> searchTag(int pageNo, int limit, String tagName) {

		String path = UriComponentsBuilder.fromPath("/internal/tag/search/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<TagDto>>> returnType = new TypeReference<ResponseDto<PageResponse<TagDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("tagName", tagName);
		
		ResponseDto<PageResponse<TagDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while searching Tag", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public List<ListingDto> getTagsForLabel(List<TagLabel> tagLabel) {
		
		String path = UriComponentsBuilder.fromPath("/internal/tag/get/listing").build().toUriString();

		TypeReference<ResponseDto<List<ListingDto>>> returnType = new TypeReference<ResponseDto<List<ListingDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<ListingDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting tags for label", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public List<ListingDto> getTagsForItem(String itemId) {
		
		String path = UriComponentsBuilder.fromPath("/internal/tag/item/get/listing").build().toUriString();

		TypeReference<ResponseDto<List<ListingDto>>> returnType = new TypeReference<ResponseDto<List<ListingDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<List<ListingDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting tags for label", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	public List<ListingDto> getServiceMixEnabledTags() {

		String path = UriComponentsBuilder.fromPath("/internal/tag/get/serviceMixListing").build().toUriString();

		TypeReference<ResponseDto<List<ListingDto>>> returnType = new TypeReference<ResponseDto<List<ListingDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<ListingDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting serviceMix enabled tags", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
 
	public FoodItemTagsDto addFoodItemTags(FoodItemTagsRequestDto foodItemTagsRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/tag/add/foodItemTag").build().toUriString();

		TypeReference<ResponseDto<FoodItemTagsDto>> returnType = new TypeReference<ResponseDto<FoodItemTagsDto>>() {};

		ResponseDto<FoodItemTagsDto> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, foodItemTagsRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding tag", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public PageResponse<FoodItemTagsDto> searchFoodItemTags(int pageNo, int limit, String tagId) {

		String path = UriComponentsBuilder.fromPath("/internal/tag/search/foodItemTag/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<FoodItemTagsDto>>> returnType = new TypeReference<ResponseDto<PageResponse<FoodItemTagsDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("tagId", tagId);
		
		ResponseDto<PageResponse<FoodItemTagsDto>> responseDto = null;

		try {
			 responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while search foodItem tag", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	
}

