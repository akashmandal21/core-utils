package com.stanzaliving.core.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.booking.dto.request.DiscountStrategyBookingDto;
import com.stanzaliving.core.discount.dto.request.BookingDiscountRequestDTO;
import com.stanzaliving.core.discount.dto.response.*;
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
import com.stanzaliving.core.discount.dto.request.BookingDiscountStrategyDto;
import com.stanzaliving.core.discount.dto.request.DiscountSplitterRequestDto;
import com.stanzaliving.wanda.discount.response.DiscountDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DiscountClientApi {

	private StanzaRestClient restClient;

	public DiscountClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public DiscountCodeListDto getDiscountCodeList(VentaDiscountRequestDto ventaDiscountRequestDto) {

		Object postBody = ventaDiscountRequestDto;

		log.info("Received request to getListOfDiscountCode {}", ventaDiscountRequestDto);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/discount-code/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<DiscountCodeListDto>> returnType = new ParameterizedTypeReference<ResponseDto<DiscountCodeListDto>>() {
		};

		try {
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType)
					.getData();

		} catch (Exception e) {
			log.error("Exception while getting List Of DiscountCode from discount service : ", e);
		}

		return null;
	}

	public ResponseDto<List<DiscountStrategyListingResponseDto>> getDiscountStrategyList(
			BookingDiscountStrategyDto requestDto) {

		try {
			Object postBody = requestDto;
			log.info("Received request to get discount strategies {}", requestDto);
			final Map<String, Object> uriVariables = new HashMap<>();
			String path = UriComponentsBuilder.fromPath("/discount-strategy/get").buildAndExpand(uriVariables)
					.toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<List<DiscountStrategyListingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DiscountStrategyListingResponseDto>>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("error while fetching the discount strategy list ", e);
		}
		return null;
	}

	public ResponseDto<DiscountSplitterResponseDto> getDiscountSplitter(
			DiscountSplitterRequestDto discountSplitterRequestDto) {

		try {
			Object postBody = discountSplitterRequestDto;
			log.info("Received request to get discount splitter {}", discountSplitterRequestDto);
			final Map<String, Object> uriVariables = new HashMap<>();
			String path = UriComponentsBuilder.fromPath("/api/v1/discount-splitter/get").buildAndExpand(uriVariables)
					.toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			final HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<DiscountSplitterResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DiscountSplitterResponseDto>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while getting discount splitter : ", e);
		}
		return null;
	}

	public ResponseDto<BookingDiscountDetailsResponseDto> getBookingDiscountDetails(String bookingUuid){
		return getBookingDiscountDetails(bookingUuid, false);
	}

	public ResponseDto<BookingDiscountDetailsResponseDto> getBookingDiscountDetails(String bookingUuid, boolean ignoreAppliedcheck) {

		try {
			Object postBody = null;
			log.info("Received request to get discount for bookingUuid {}", bookingUuid);
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("bookingUuid", bookingUuid);
			String path = UriComponentsBuilder.fromPath("/discount-details/{bookingUuid}").buildAndExpand(uriVariables)
					.toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("ignoreAppliedCheck", String.valueOf(ignoreAppliedcheck));
			final HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<BookingDiscountDetailsResponseDto>> returnType =
					new ParameterizedTypeReference<ResponseDto<BookingDiscountDetailsResponseDto>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while getting discount splitter : ", e);
		}
		return null;
	}

	public ResponseDto<DiscountDto> getDiscountDetail(String discountCode) {

		try {
			Object postBody = null;
			log.info("Received request to get discount details discountCode {}", discountCode);
			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("discountCode", discountCode);

			String path = UriComponentsBuilder.fromPath("/getDiscountDetail/{discountCode}")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			final HttpHeaders headerParams = new HttpHeaders();
	
			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<DiscountDto>> returnType = new ParameterizedTypeReference<ResponseDto<DiscountDto>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while getting discount splitter : ", e);
		}
		return null;
	}

	public ResponseDto<String> removeDiscount(String bookingUuid) {

		try {
			Object postBody = null;
			log.info("Received request to remove discount for bookingUuid {}", bookingUuid);
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("bookingUuid", bookingUuid);
			String path = UriComponentsBuilder.fromPath("/remove/{bookingUuid}").buildAndExpand(uriVariables)
					.toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			final HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while removing discount : ", e);
		}
		return null;
	}

	public ResponseDto<String> disableDiscount(String bookingUuid) {

		try {
			Object postBody = null;
			log.info("Received request to disable discount for bookingUuid {}", bookingUuid);
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("bookingUuid", bookingUuid);
			String path = UriComponentsBuilder.fromPath("/disable/{bookingUuid}").buildAndExpand(uriVariables)
					.toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			final HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while disabling discount : ", e);
		}
		return null;
	}

	public ResponseDto<String> confirmDiscountSplitter(BookingDiscountRequestDTO bookingDiscountRequestDTO) {

		try {
			Object postBody = bookingDiscountRequestDTO;
			log.info("Received request to confirm discount-splitter: {}", bookingDiscountRequestDTO);
			final Map<String, Object> uriVariables = new HashMap<>();
			String path = UriComponentsBuilder.fromPath("/api/v1/discount-splitter/confirm").buildAndExpand(uriVariables)
					.toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			final HttpHeaders headerParams = new HttpHeaders();
			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
			ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while confirming discount : ", e);
		}
		return null;
	}

	public ResponseDto<?> sendDiscountEmailDigest() {
		log.info("Discount Email Digest ");
		try {

			Object postBody = null;

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/internal/digest").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {"*/*"};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<?>> returnType = new ParameterizedTypeReference<ResponseDto<?>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Exception occurred while sending discount Email", e);
			return null;
		}
	}

	public ResponseDto<Boolean> updateDiscountStrategyUsage(DiscountStrategyBookingDto discountStrategyBookingDto) {

		log.info("Discount-Client::Processing to update discount strategy for booking uuid {} and discount strategy uuid {}", discountStrategyBookingDto.getBookingUuid(), discountStrategyBookingDto.getDiscountStrategyUuid());

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/discount-strategy/usage").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType =
				new ParameterizedTypeReference<ResponseDto<Boolean>>() {};

		return this.restClient.invokeAPI(path, HttpMethod.PUT, queryParams, discountStrategyBookingDto, headerParams, accept, returnType);
	}

	public ResponseDto<Boolean> releaseDiscountStrategyUsage(DiscountStrategyBookingDto discountStrategyBookingDto) {

		log.info("Discount-Client::Processing to release discount strategy for booking uuid {} and discount strategy uuid {}", discountStrategyBookingDto.getBookingUuid(), discountStrategyBookingDto.getDiscountStrategyUuid());

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/discount-strategy/release").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();

		String[] accepts = new String[]{"*/*"};

		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType =
				new ParameterizedTypeReference<ResponseDto<Boolean>>() {};

		return this.restClient.invokeAPI(path, HttpMethod.PUT, queryParams, discountStrategyBookingDto, headerParams, accept, returnType);
	}

}