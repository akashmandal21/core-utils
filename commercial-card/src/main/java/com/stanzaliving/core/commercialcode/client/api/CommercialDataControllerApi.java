package com.stanzaliving.core.commercialcode.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commercialcode.dto.*;
import com.stanzaliving.price_strategy.request.CreationDto;
import com.stanzaliving.price_strategy.request.PaymentActionDto;
import com.stanzaliving.price_strategy.response.CommandCenterCodeListDto;
import lombok.extern.log4j.Log4j2;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@Log4j2
public class CommercialDataControllerApi {

    private StanzaRestClient restClient;

    public CommercialDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<CommercialCardListDto> getAllCommercialCards(String token, CommercialCardDto commercialCardDto) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", commercialCardDto.toString());

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-codes").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardListDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardListDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<CodeListDto>> getAllPricingStrategy(String token, CommercialCardDto commercialCardDto) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", commercialCardDto.toString());

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/price-strategy/commercial-codes").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<CodeListDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<CodeListDto>>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<CommandCenterCodeListDto>> getAllPricingStrategyForCommandCenter(String token, CommercialCardDto commercialCardDto) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", commercialCardDto.toString());

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/command-center/pricing-strategies").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<CommandCenterCodeListDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<CommandCenterCodeListDto>>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<CommercialCardUsageDto> updateCommercialCardUsage(String token, CommercialCardBookingDto commercialCardBookingDto) {

        log.info("Commercial-code-Data-Controller::Processing to update commercial card usage", commercialCardBookingDto);

        Object postBody = commercialCardBookingDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-card/usage").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<CommercialCardUsageDto> restoreCommercialCardUsage(String token, CommercialCardBookingDto commercialCardBookingDto) {

        log.info("Commercial-code-Data-Controller::Processing to restore commercial card usage", commercialCardBookingDto);

        Object postBody = commercialCardBookingDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-card/restore").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardUsageDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }
    
	public CommercialCardResponseDto getCommercialCardResponseDto(String commercialCardUuid) {

		Object postBody = null;

		ResponseDto<CommercialCardResponseDto> response = new ResponseDto<>();

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("uuid", commercialCardUuid);

		String path = UriComponentsBuilder.fromPath("/internal/commercial-card/{uuid}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>>() {
		};

		try {
			response = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("error while calling commercial-card service by commercialCardUuid : {} and exception is {}",
					commercialCardUuid, e);
			return null;
		}

		return response.getData();

	}

    public ResponseDto<CommercialCardResponseDto> getCardByUuid(String token, String commercialCardUuid) {

        log.info("Commercial-code-Data-Controller::Processing to retrieve commercial card information {}", commercialCardUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("uuid", commercialCardUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/commercial-card/{uuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }
    public ResponseDto<List<PaymentActionDto>> getPaymentFrequencies(String token, String strategyUuid) {

        log.info("Commercial-code-Data-Controller::Processing to retrieve commercial card information {}", strategyUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("uuid", strategyUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/price-strategy/payment-frequencies/{uuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PaymentActionDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<PaymentActionDto>>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<CreationDto> getStrategyCardByUuid(String token, String StrategyUuid) {

        log.info("PriceStrategy-Controller::Processing to retrieve commercial card information {}", StrategyUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("uuid", StrategyUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/price-strategy/get/{uuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CreationDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CreationDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<PaymentActionDto>> getPaymentFrequenciesForCommandCenter(String currentUserToken, String commandCenterUuid, String commercialCardUuid) {
        log.info("PriceStrategy-Controller::Processing to retrieve payment frequencies for {}, {}", commandCenterUuid, commercialCardUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("commandCenterUuid", commandCenterUuid);
        uriVariables.put("commercialCardUuid", commercialCardUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/command-center/payment-frequencies/{commandCenterUuid}/{commercialCardUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + currentUserToken);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PaymentActionDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<PaymentActionDto>>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<CommandCenterCodeListDto>> getTenureBasedPricingStrategy(String currentUserToken, String commandCenterUuid, String commercialCardUserType, String bookingSubType, Double contractTenure) {
        log.info("PriceStrategy-Controller::Processing to retrieve tenure based pricing strategies for {}, {}, {}, {}", commandCenterUuid, commercialCardUserType, bookingSubType, contractTenure);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("commandCenterUuid", commandCenterUuid);
        uriVariables.put("commercialCardUserType", commercialCardUserType);
        uriVariables.put("bookingSubType", bookingSubType);

        String path = UriComponentsBuilder.fromPath("/api/v1/command-center/tenure/{commandCenterUuid}/{commercialCardUserType}/{bookingSubType}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        if(Objects.nonNull(contractTenure))
            queryParams.add("contractTenure", String.valueOf(contractTenure));
        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + currentUserToken);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<CommandCenterCodeListDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<CommandCenterCodeListDto>>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<CommercialCardResponseDto> getCommercialCardsForCommandCenter(String currentUserToken, String commandCenterUuid, String commercialCardUuid, Double contractTenure) {
        log.info("PriceStrategy-Controller::Processing to retrieve payment frequencies for {}, {}", commandCenterUuid, commercialCardUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("commandCenterUuid", commandCenterUuid);
        uriVariables.put("commercialCardUuid", commercialCardUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/command-center/commercial-code/{commandCenterUuid}/{commercialCardUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        if(Objects.nonNull(contractTenure))
            queryParams.add("contractTenure", String.valueOf(contractTenure));

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + currentUserToken);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardResponseDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.GET
                , queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<CommercialCardListDto> getAllCommercialCardsForCommandCenterBasedOnCommandCenterUuid(CommercialCardDto commercialCardDto, String commandCenterUuid) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}, {}", commercialCardDto.toString(), commandCenterUuid);

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("commandCenterUuid", commandCenterUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/command-center/commercial-codes/{commandCenterUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardListDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardListDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<CommercialCardListDto> getAllCommercialCardsForCommandCenter(CommercialCardDto commercialCardDto) {

        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", commercialCardDto.toString());

        Object postBody = commercialCardDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/command-center/commercial-codes").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<CommercialCardListDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<CommercialCardListDto>>() {};

        return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }
}
