package com.stanzaliving.core.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.booking.dto.request.VentaDiscountRequestDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.wanda.discount.response.VentaDiscountResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DiscountClientApi {

	private StanzaRestClient restClient;

	public DiscountClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public List<VentaDiscountResponseDto> getDiscountCouponList(VentaDiscountRequestDto ventaDiscountRequestDto) {

		Object postBody = ventaDiscountRequestDto;

		log.info("Received request to getListOfDiscountCode {}", ventaDiscountRequestDto);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/getListOfDiscountCode").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<VentaDiscountResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<VentaDiscountResponseDto>>>() {
		};

		List<VentaDiscountResponseDto> response = null;

		try {
			response = restClient
					.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType)
					.getData();
		} catch (Exception e) {
			log.error("Exception while getting List Of DiscountCode from discount service : ", e);
		}

		return response;
	}

}
