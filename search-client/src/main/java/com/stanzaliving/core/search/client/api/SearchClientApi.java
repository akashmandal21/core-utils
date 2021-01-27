package com.stanzaliving.core.search.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemSearchDto;
import com.stanzaliving.core.food.dto.response.DataCountPageResponse;
import com.stanzaliving.search.food.index.dto.dishmaster.DishMasterSearchIndexDto;
import com.stanzaliving.search.food.index.dto.menu.FoodMenuCategoryItemOrderCountIndexDto;
import com.stanzaliving.search.food.index.dto.vasmaster.VasMasterIndexDto;
import com.stanzaliving.search.food.search.dto.CategoryItemOrderCountSearchDto;
import com.stanzaliving.search.food.search.dto.VasMasterSearchDto;
import com.stanzaliving.search.food.search.dto.request.MenuItemAggregateRequestDto;
import com.stanzaliving.search.food.search.dto.request.MenuMicromarketAggregateRequestDto;
import com.stanzaliving.search.food.search.dto.response.menu.fps.FoodMenuItemFpsResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.FoodMenuMicromarketRatingResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.MicromarketItemRatingDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 07-Jan-2021
 */

@Log4j2
public class SearchClientApi {

	private final StanzaRestClient restClient;

	public SearchClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<String> autoSuggestDishName(String text) {

		String path = UriComponentsBuilder.fromPath("/internal/search/dish/master/autosuggest").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("name", text);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<String>>> returnType = new TypeReference<ResponseDto<List<String>>>() {};

		ResponseDto<List<String>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	public PageResponse<DishMasterSearchIndexDto> searchDishMaster(FoodItemSearchDto searchDto) {

		String path = UriComponentsBuilder.fromPath("/internal/search/dish/master").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<PageResponse<DishMasterSearchIndexDto>>> returnType = new TypeReference<ResponseDto<PageResponse<DishMasterSearchIndexDto>>>() {};

		ResponseDto<PageResponse<DishMasterSearchIndexDto>> responseDto = new ResponseDto<>();

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

	private MultiValueMap<String, String> convertToQueryParams(FoodItemSearchDto searchDto) {

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

		Field[] fields = FoodItemSearchDto.class.getDeclaredFields();

		if (fields != null) {

			for (Field field : fields ) {

				try {
					boolean accessible = field.isAccessible();
					field.setAccessible(true);
					Object value = field.get(searchDto);
					field.setAccessible(accessible);

					if (Objects.nonNull(value)) {
						map.add(field.getName(), value.toString());
					}

				} catch (IllegalAccessException e) {
					log.error(e);
				}
			}
		}

		return map;
	}

	public DataCountPageResponse<VasMasterIndexDto> searchVasMaster(VasMasterSearchDto searchDto) {

		String path = UriComponentsBuilder.fromPath("/internal/search/vas/master").build().toUriString();

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

	public FoodMenuMicromarketRatingResponseDto aggregateMenuRating(MenuMicromarketAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/rating/menu/micromarket").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<FoodMenuMicromarketRatingResponseDto>> returnType = new TypeReference<ResponseDto<FoodMenuMicromarketRatingResponseDto>>() {};

		ResponseDto<FoodMenuMicromarketRatingResponseDto> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	public List<MicromarketItemRatingDto> aggregateMenuItemsRating(MenuItemAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/rating/menu/micromarket/item").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<MicromarketItemRatingDto>>> returnType = new TypeReference<ResponseDto<List<MicromarketItemRatingDto>>>() {};

		ResponseDto<List<MicromarketItemRatingDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	public FoodMenuItemFpsResponseDto aggregateMenuItemFps(MenuItemAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/menu/item/fps").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<FoodMenuItemFpsResponseDto>> returnType = new TypeReference<ResponseDto<FoodMenuItemFpsResponseDto>>() {};

		ResponseDto<FoodMenuItemFpsResponseDto> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, requestDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	public List<FoodMenuCategoryItemOrderCountIndexDto> searchCategoryItemOrderCount(CategoryItemOrderCountSearchDto searchDto) {

		String path = UriComponentsBuilder.fromPath("/internal/category/item/order/count").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<List<FoodMenuCategoryItemOrderCountIndexDto>>> returnType = new TypeReference<ResponseDto<List<FoodMenuCategoryItemOrderCountIndexDto>>>() {};

		ResponseDto<List<FoodMenuCategoryItemOrderCountIndexDto>> responseDto = new ResponseDto<>();

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

