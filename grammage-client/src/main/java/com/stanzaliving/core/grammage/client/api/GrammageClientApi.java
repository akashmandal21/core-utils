package com.stanzaliving.core.grammage.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.grammage.category.request.MenuCategoryVersionDto;
import com.stanzaliving.food.v2.grammage.category.response.CategoryGrammageBaseResponseDto;
import com.stanzaliving.food.v2.grammage.response.MenuOptionGrammage;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.util.Pair;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 20-Jul-2021
 */

@Log4j2
public class GrammageClientApi {

	private final StanzaRestClient restClient;

	public GrammageClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public void copyMenuCategory(String versionId, String uuid){

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/menucategory/copy").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		queryParams.add("uuid", uuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

	}
	
	public Boolean isGrammageDefined(String versionId) {
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/exists").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};

		try {
			ResponseDto<Boolean> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
			return Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData()) && responseDto.getData();
		}catch (Exception e) {
			log.error("Error while checking isGrammageDefined", e);
			return null;
		}
	}
	
	
	public Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>> calculateGrammage(String versionId, Map<String, Map<LocalDate, Map<String, Collection<String>>>> optionWiseItemMap) {
		ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculateGrammage").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		queryParams.add("optionWiseItemMap", optionWiseItemMap.toString());
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>>>() {
		};

		try {
			 responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
			return null;
		}
		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();
	}

	public Map<MealType, Map<DayOfWeek, MenuOptionGrammage>> getGrammageData(MenuCategoryVersionDto menuCategoryVersionDto, Map<Pair<MealType, DayOfWeek>, Collection<String>> menuItems) {
		ResponseDto<Map<MealType, Map<DayOfWeek, MenuOptionGrammage>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/integration/grammageData").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("menuItems", menuItems.toString());
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<Map<MealType, Map<DayOfWeek, MenuOptionGrammage>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<MealType, Map<DayOfWeek, MenuOptionGrammage>>>>() {
		};

		try {
			 responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, menuCategoryVersionDto, headerParams, accept, returnType);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
			return null;
		}
		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();
	}
	
	public Map<MealType, Map<DayOfWeek, MenuOptionGrammage>> getGrammageData(String versionId,
			FoodServeType foodServeType, Map<Pair<MealType, DayOfWeek>, Collection<String>> menuItems) {
		ResponseDto<Map<MealType, Map<DayOfWeek, MenuOptionGrammage>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/integration/grammageData/byfoodservetype").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		queryParams.add("foodServeType", foodServeType.toString());
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<Map<MealType, Map<DayOfWeek, MenuOptionGrammage>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<MealType, Map<DayOfWeek, MenuOptionGrammage>>>>() {
		};

		try {
			 responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, menuItems, headerParams, accept, returnType);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
			return null;
		}
		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();
	}
	
	public Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>> getGrammagesForMenu(String uuid,
			Map<String, Map<DayOfWeek, Map<String, Collection<String>>>> mealThaliItemMap) {
		ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/integration/grammagesForMenu").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("uuid", uuid);

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Map<DayOfWeek, Map<String, MenuOptionGrammage>>>>>() {
		};

		try {
			 responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, mealThaliItemMap, headerParams, accept, returnType);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
			return null;
		}
		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();
	}
	
	

	public List<CategoryGrammageBaseResponseDto> getGrammageVariationDetails(String uuid) {
		ResponseDto<List<CategoryGrammageBaseResponseDto>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/integration/variationDetails").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("uuid", uuid);
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<List<CategoryGrammageBaseResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CategoryGrammageBaseResponseDto>>>() {
		};

		try {
			 responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		}catch (Exception e) {
			log.error("Error while calculateGrammage ", e);
			return null;
		}
		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new ArrayList<>();
	}

	public void deleteGrammages(Collection<String> versionUuidList) {
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/integration/deleteGrammages").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.invokeAPI(path, HttpMethod.POST, queryParams, versionUuidList, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

		
	}

	public void copyGrammageFromBase(String versionId) {
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/integration/copyFromBase").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		try {
			restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

	}

	public Map<MealType, Collection<String>> getThalis(String versionId) {
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/thalis").build().toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<Map<MealType, Collection<String>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<MealType, Collection<String>>>>() {
		};

		try {
			ResponseDto<Map<MealType, Collection<String>>> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
			return Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData()) ? responseDto.getData() : new HashMap<>();
		}catch (Exception e) {
			log.error("Error while getting thalis", e);
			return new HashMap<>();
		}
	}

	public Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>> getGrammages(String categoryVersionUuid, Map<String, Map<LocalDate, Map<String, Collection<String>>>> mealDateItemMap) {
		return new HashMap<>();
	}
}

