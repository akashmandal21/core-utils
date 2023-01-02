package com.stanzaliving.core.payment.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.TransactionDto;
import com.stanzaliving.core.pojo.AttachmentDto;
import com.stanzaliving.core.projectservice.dto.PaymentDetailDto;
import com.stanzaliving.website.constants.WebsiteSelfRefundPageConstants;
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.WebsiteSelfRefundResponseDto;
import lombok.extern.log4j.Log4j2;
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

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.TransactionDto;
import com.stanzaliving.core.pojo.AttachmentDto;
import com.stanzaliving.core.projectservice.dto.PaymentDetailDto;
import com.stanzaliving.website.constants.WebsiteSelfRefundPageConstants;
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.WebsiteSelfRefundResponseDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PaymentControllerApi {

    private StanzaRestClient restClient;

    public PaymentControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PaymentDetailDto> getPaymentDetails(String uuid) {

        log.info("Called api to fetch payment details");
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid", uuid);
        String path = UriComponentsBuilder.fromPath("/payment/Details/{uuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PaymentDetailDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentDetailDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payement details with uuid", uuid);
        }
        return null;
    }

    public ResponseDto<PaymentDetailDto> getPaymentAmountDetails(String bookingUuid) {

        log.info("Called api to fetch payment amount details");
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/payment/amount/Details/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PaymentDetailDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentDetailDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payement amount details with uuid", bookingUuid);
        }
        return null;
    }


    public ResponseDto<TransactionDto> getPaymentDetailsFromUuid(String uuid) {

        log.info("Called api to fetch payment  details");
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid", uuid);
        String path = UriComponentsBuilder.fromPath("/payment/Details/FromUuid/{uuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<TransactionDto>> returnType = new ParameterizedTypeReference<ResponseDto<TransactionDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payement  details with uuid", uuid);
        }
        return null;
    }

    public ResponseDto<List<AttachmentDto>> getTransactionReceipt(String transactionId) {

        log.info("Called api to fetch TransactionReceipt");
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("transactionId", transactionId);
        String path = UriComponentsBuilder.fromPath("/payment/receipt/generate-pdf/{transactionId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        TypeReference<ResponseDto<List<AttachmentDto>>> returnType = new TypeReference<ResponseDto<List<AttachmentDto>>>() {
        };
        ResponseDto<List<AttachmentDto>> responseDto;
        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept,
                    returnType);
            return responseDto;

        } catch (Exception e) {
            log.error("Exception while fetching Transaction Receipt with transactionId", transactionId);
        }
        return null;
    }

    public ResponseDto<WebsiteSelfRefundResponseDto> checkEligiblityOfSelfRefundForPrebookedLead(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/self/refund/prebooked/lead/check/eligiblity").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<WebsiteSelfRefundResponseDto>> returnType = new TypeReference<ResponseDto<WebsiteSelfRefundResponseDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {

            log.error("Exception while check eligiblity of self refund for prebooked lead");
            return ResponseDto.failure(WebsiteSelfRefundPageConstants.CONTACT_STANZA_SUPPORT_MESSAGE);
        }
    }

    public ResponseDto<WebsiteSelfRefundResponseDto> initiateSelfRefundForPrebookedLead(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/self/refund/initiate/for/prebooked/lead").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<WebsiteSelfRefundResponseDto>> returnType = new TypeReference<ResponseDto<WebsiteSelfRefundResponseDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while initiating self refund for prebooked lead");
            return ResponseDto.failure(WebsiteSelfRefundPageConstants.CONTACT_STANZA_SUPPORT_MESSAGE);
        }
    }
}
