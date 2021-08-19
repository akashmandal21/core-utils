package com.stanzaliving.core.food.dish.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.UserFoodOrderMasterDto;
import com.stanzaliving.core.food.dto.response.VasMasterResponseDto;
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
public class DishMasterMasterClientApi {
	
	private StanzaRestClient restClient;
	
	public DishMasterMasterClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	
	public VasMasterResponseDto getVasItemDetails(String vasItemId) {
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("internal/vas/master/get").buildAndExpand(uriVariables).toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", vasItemId);
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<ResponseDto<VasMasterResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<VasMasterResponseDto>>() {
		};
		
		try {
			ResponseDto<VasMasterResponseDto> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
			return responseDto == null || responseDto.getData() == null ? null : responseDto.getData();
		} catch (Exception e) {
			log.error("Error while fetching vas item details for {}", vasItemId, e);
			return null;
		}
	}
	
	
}
