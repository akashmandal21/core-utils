package com.stanzaliving.dispatchservice.client.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.stanzaliving.core.food.dto.*;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.food.dto.request.FullCategoryDto;
import com.stanzaliving.core.food.dto.response.FoodMenuCategoryBasicDetailsDto;
import com.stanzaliving.core.food.dto.response.RecentMealDto;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.opscalculator.dto.OccupiedBedDto;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.common.dto.MealDto;
import com.stanzaliving.food.v2.common.dto.MealTypeAndGroupIdDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceFoodMenuItemIdProjectionDto;
import com.stanzaliving.food.v2.menu.dto.ResidenceMenuDto;
import com.stanzaliving.food.v2.vendor.dto.FoodVendorDTO;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DispatchServiceClientApi {

    private StanzaRestClient restClient;

    public DispatchServiceClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }


	public Map<MealType,Boolean> getMealReceived(String residenceId,LocalDate mealDate){
		String path =
				UriComponentsBuilder.fromPath(
								"/internal/meal/receive")
						.build()
						.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("residenceId",residenceId);
		queryParams.add("mealDate",mealDate.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		TypeReference<ResponseDto<Map<MealType,Boolean>>> returnType =
				new TypeReference<ResponseDto<Map<MealType,Boolean>>>() {};

		ResponseDto<Map<MealType,Boolean>> responseDto = null;
		try {
			responseDto =
					restClient.request(
							path,
							HttpMethod.GET,
							queryParams,
							null,
							headerParams,
							accept,
							returnType,
							MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.info("Error while fetching meal data");
			throw new ApiValidationException(
					"Some error occurred. Please try again after some time.");
		}

		if (!responseDto.isStatus()) {

			throw new PreconditionFailedException(responseDto.getMessage());
		}

		return responseDto.getData();


	}
	
}