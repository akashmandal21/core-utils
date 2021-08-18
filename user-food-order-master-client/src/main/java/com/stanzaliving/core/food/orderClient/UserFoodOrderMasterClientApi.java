package com.stanzaliving.core.food.orderClient;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.core.food.dto.UserFoodOrderMasterDto;
import com.stanzaliving.core.food.enums.FoodOrderType;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class UserFoodOrderMasterClientApi {
	
	private StanzaRestClient restClient;
	
	public UserFoodOrderMasterClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	
	public UserFoodOrderMasterDto getOrderDetails(String orderId, FoodOrderType orderType) {
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("internal/order/master/get").buildAndExpand(uriVariables).toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("orderId", orderId);
		queryParams.add("orderType", orderType.name());
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<UserFoodOrderMasterDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserFoodOrderMasterDto>>() {
		};
		
		try {
			ResponseDto<UserFoodOrderMasterDto> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
			return responseDto == null || responseDto.getData() == null ? null : responseDto.getData();
		} catch (Exception e) {
			log.error("Error while fetching order details orderId: {}", orderId, e);
			return null;
		}
	}
	
	public UserFoodOrderMasterDto createOrder(UserFoodOrderMasterDto orderDetails) {
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("internal/order/master/create").buildAndExpand(uriVariables).toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<UserFoodOrderMasterDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserFoodOrderMasterDto>>() {
		};
		
		
		try {
			ResponseDto<UserFoodOrderMasterDto> responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, orderDetails, headerParams, accept, returnType);
			return responseDto == null || responseDto.getData() == null ? null : responseDto.getData();
		} catch (Exception e) {
			log.error("Error while creating order {}", ObjectMapperUtil.getString(orderDetails), e);
			return null;
		}
	}
	
}
