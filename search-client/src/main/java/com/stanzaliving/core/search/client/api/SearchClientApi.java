package com.stanzaliving.core.search.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.food.dto.FoodItemSearchDto;
import com.stanzaliving.core.food.dto.response.DataCountPageResponse;
import com.stanzaliving.core.search.client.api.food.FoodDishMasterService;
import com.stanzaliving.core.search.client.api.food.VasMasterService;
import com.stanzaliving.search.food.index.dto.dishmaster.DishMasterSearchIndexDto;
import com.stanzaliving.search.food.index.dto.ingredient.IngredientSearchIndexDto;
import com.stanzaliving.search.food.index.dto.menu.FoodMenuCategoryItemOrderCountIndexDto;
import com.stanzaliving.search.food.index.dto.vasmaster.VasMasterIndexDto;
import com.stanzaliving.search.food.search.dto.CategoryItemOrderCountSearchDto;
import com.stanzaliving.search.food.search.dto.IngredientSearchDto;
import com.stanzaliving.search.food.search.dto.VasMasterSearchDto;
import com.stanzaliving.search.food.search.dto.request.MenuCategoryAggregateRequestDto;
import com.stanzaliving.search.food.search.dto.request.MenuItemAggregateRequestDto;
import com.stanzaliving.search.food.search.dto.request.MenuMicromarketAggregateRequestDto;
import com.stanzaliving.search.food.search.dto.response.menu.consumption.FoodMenuCategoryConsumptionResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.consumption.FoodMenuConsumptionSearchResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.fps.FoodMenuItemFpsResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.fps.MenuCategoryFpsResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.FoodMenuMicromarketRatingResponseDto;
import com.stanzaliving.search.food.search.dto.response.menu.rating.MicromarketItemRatingDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Field;
import java.util.ArrayList;
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

	@Autowired
	private FoodDishMasterService foodDishMasterService;

	@Autowired
	private VasMasterService vasMasterService;

	private final StanzaRestClient restClient;

	public SearchClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<String> autoSuggestDishName(String text) {
		return foodDishMasterService.autoSuggestDishName(restClient, text);
	}

	public PageResponse<DishMasterSearchIndexDto> searchDishMaster(FoodItemSearchDto searchDto) {
		return foodDishMasterService.searchDishMaster(restClient, searchDto);
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
		return vasMasterService.searchVasMaster(restClient, searchDto);
	}

	public FoodMenuMicromarketRatingResponseDto aggregateMenuRating(MenuMicromarketAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/rating/menu/micromarket").build().toUriString();

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

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/rating/menu/micromarket/item").build().toUriString();

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

	public FoodMenuItemFpsResponseDto aggregateMicromarketFps(MenuMicromarketAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/fps/micromarket").build().toUriString();

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

	public MenuCategoryFpsResponseDto aggregateMenuCategoryFps(MenuCategoryAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/fps/menucategory").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<MenuCategoryFpsResponseDto>> returnType = new TypeReference<ResponseDto<MenuCategoryFpsResponseDto>>() {};

		ResponseDto<MenuCategoryFpsResponseDto> responseDto = new ResponseDto<>();

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

	public List<IngredientSearchIndexDto> getIngredientsList() {

		String path = UriComponentsBuilder.fromPath("/internal/search/food/ingredients").build().toUriString();

		IngredientSearchDto searchDto = IngredientSearchDto.builder()
				.pageDto(PageAndSortDto.builder().pageNo(1).limit(3000).build())
				.build();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<PageResponse<IngredientSearchIndexDto>>> returnType = new TypeReference<ResponseDto<PageResponse<IngredientSearchIndexDto>>>() {};

		ResponseDto<PageResponse<IngredientSearchIndexDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.POST, queryParams, searchDto, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while searching from search service.", e);

			throw new ApiValidationException("Some error occurred. Please try again after some time.");

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		List<IngredientSearchIndexDto> responseDtos = new ArrayList<>();

		if (Objects.nonNull(responseDto.getData())) {
			responseDtos = responseDto.getData().getData();
		}

		return responseDtos;
	}

	public FoodMenuConsumptionSearchResponseDto aggregateMenuWeeklyConsumption(MenuMicromarketAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/consumption/weekly/menu/micromarket").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<FoodMenuConsumptionSearchResponseDto>> returnType = new TypeReference<ResponseDto<FoodMenuConsumptionSearchResponseDto>>() {};

		ResponseDto<FoodMenuConsumptionSearchResponseDto> responseDto = new ResponseDto<>();

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

	public FoodMenuCategoryConsumptionResponseDto aggregateMenuCategoryConsumption(MenuCategoryAggregateRequestDto requestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/aggregate/food/consumption/menu/menuCategory").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<FoodMenuCategoryConsumptionResponseDto>> returnType = new TypeReference<ResponseDto<FoodMenuCategoryConsumptionResponseDto>>() {};

		ResponseDto<FoodMenuCategoryConsumptionResponseDto> responseDto = new ResponseDto<>();

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
}

