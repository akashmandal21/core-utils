package com.stanzaliving.core.dish.client.api;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.food.dto.IngredientDto;
import com.stanzaliving.core.food.dto.IngredientUsageDto;
import com.stanzaliving.core.food.dto.request.IngredientRequestDto;
import com.stanzaliving.core.inventory.dto.InventorySummaryUpdate;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class IngredientClientApi {

	private final StanzaRestClient restClient;

	public IngredientClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	

	public List<IngredientDto> getIngredientList() {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/listing").build().toUriString();

		TypeReference<ResponseDto<List<IngredientDto>>> returnType = new TypeReference<ResponseDto<List<IngredientDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<IngredientDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ingredient list", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}


	public List<IngredientDto> getIngredientTagList(Boolean includePrice) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/listing").build().toUriString();

		TypeReference<ResponseDto<List<IngredientDto>>> returnType = new TypeReference<ResponseDto<List<IngredientDto>>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("includePrice", includePrice.toString());
		
		ResponseDto<List<IngredientDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ingredient tag list", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}


	public List<IngredientDto> getIngredientListFromSearch(IngredientType type) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/listing/by-type").build().toUriString();

		TypeReference<ResponseDto<List<IngredientDto>>> returnType = new TypeReference<ResponseDto<List<IngredientDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("type", type.toString());
		
		ResponseDto<List<IngredientDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ingredient list from search", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public IngredientDto getIngredientDetails(String ingredientId) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/{ingredientId}/details").build().toUriString();

		TypeReference<ResponseDto<IngredientDto>> returnType = new TypeReference<ResponseDto<IngredientDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("ingredientId", ingredientId);
		
		ResponseDto<IngredientDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ingredient details", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public IngredientDto getIngredientTagDetails(String ingredientId) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/{ingredientId}/details").build().toUriString();

		TypeReference<ResponseDto<IngredientDto>> returnType = new TypeReference<ResponseDto<IngredientDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("ingredientId", ingredientId);
		
		ResponseDto<IngredientDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while getng ingredient tag details", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public Map<String, IngredientDto> getIngredientMapWithPrice(Collection<String> ingredients) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/details").build().toUriString();

		TypeReference<ResponseDto<Map<String, IngredientDto>>> returnType = new TypeReference<ResponseDto<Map<String, IngredientDto>>>() {};

		ResponseDto<Map<String, IngredientDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, null, ingredients, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting ingredient map with price", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public Map<String, IngredientDto> getIngredientTagMap(Collection<String> ingredients, Boolean status) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/details").build().toUriString();

		TypeReference<ResponseDto<Map<String, IngredientDto>>> returnType = new TypeReference<ResponseDto<Map<String, IngredientDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("status", status.toString());
		
		ResponseDto<Map<String, IngredientDto>> responseDto = null;

		try {
			 responseDto = restClient.post(path, queryParams, ingredients, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while getting ingredient TagMap", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	public void resetIngredientPrice(String itemId) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/reset/cache/price").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while reset ingredient price", e);
		}
	}

	public void resetIngredientByTag(String tag) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/reset/cache/tag").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("tag", tag);
		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while reset ingredient by tag", e);
		}
	}

	public void storeTagWiseIngredientPrice() {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/store/tag-price").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

		
	}

	public IngredientUsageDto isIngredientUsed(String ingredientUuid) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/{ingredientId}/used").build().toUriString();

		TypeReference<ResponseDto<IngredientUsageDto>> returnType = new TypeReference<ResponseDto<IngredientUsageDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("ingredientUuid", ingredientUuid);

		ResponseDto<IngredientUsageDto> responseDto = null;
		
		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public void updatePrice(InventorySummaryUpdate summaryUpdate) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/updatePrice").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Void> responseDto = null;
		
		try {
			restClient.post(path, queryParams, summaryUpdate, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}
	}
	
	public void addIngredient(IngredientRequestDto ingredientRequestDto) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/addIngredient").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Void> responseDto = null;
		
		try {
			restClient.post(path, queryParams, ingredientRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}
	}
	
	
	public void substituteIngredient(String uuid, String substituteItem) {
		String path = UriComponentsBuilder.fromPath("/internal/ingredients/substituteIngredient").build().toUriString();

		TypeReference<ResponseDto<IngredientUsageDto>> returnType = new TypeReference<ResponseDto<IngredientUsageDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("uuid", uuid);
		queryParams.add("substituteItem", substituteItem);

		ResponseDto<IngredientUsageDto> responseDto = null;
		
		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while adding food item", e);
		}
	}
	
	
	public void updateSearchIndex(Integer fromId, Integer toId) {

		String path = UriComponentsBuilder.fromPath("/internal/ingredients/index").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromId", fromId.toString());
		queryParams.add("toId", toId.toString());

		try {
			 restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while updating food item", e);
		}

	}
	
	
	
	
}



