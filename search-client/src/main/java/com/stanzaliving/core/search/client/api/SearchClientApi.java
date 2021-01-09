package com.stanzaliving.core.search.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.FoodItemSearchDto;
import com.stanzaliving.core.utilservice.utils.ReflectionUtils;
import com.stanzaliving.search.food.index.dto.dishmaster.DishMasterSearchIndexDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

	public PageResponse<DishMasterSearchIndexDto> searchDishMaster(FoodItemSearchDto searchDto) {

		String path = UriComponentsBuilder.fromPath("search/dish/master").build().toUriString();

		final MultiValueMap<String, String> queryParams = convertToQueryParams(searchDto);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<PageResponse<DishMasterSearchIndexDto>>> returnType = new TypeReference<ResponseDto<PageResponse<DishMasterSearchIndexDto>>>() {};

		ResponseDto<PageResponse<DishMasterSearchIndexDto>> responseDto = new ResponseDto<>();

		try {

			responseDto = restClient.request(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());

		}

		return responseDto.getData();
	}

	private MultiValueMap<String, String> convertToQueryParams(FoodItemSearchDto searchDto) {

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

		Field[] fields = searchDto.getClass().getFields();

		if (fields != null) {

			Arrays.stream(fields).forEach(field -> {

				try {
					Object value = field.get(searchDto);

					if (Objects.nonNull(value)) {
						map.add(field.getName(), value.toString());
					}

				} catch (IllegalAccessException e) {
					log.error(e);
				}
			});
		}

		return map;
	}

}

