package com.stanzaliving.core.payment.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.projectservice.dto.UserVirtualAccountDetailsDto;
import com.stanzaliving.core.projectservice.dto.PaymentDetailDto;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class PaymentControllerApi {

    private StanzaRestClient restClient;

    public PaymentControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PaymentDetailDto> getPaymentDetails(String uuid){

        log.info("Called api to fetch payment details");
        Object postBody=null;
        final Map<String,Object> uriVariables=new HashMap<>();
        uriVariables.put("uuid",uuid);
        String path= UriComponentsBuilder.fromPath("/payment/Details/{uuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams=new HttpHeaders();
        final String[] accepts = { "*/*" };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PaymentDetailDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentDetailDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payement details with uuid",uuid);
        }
        return null;
    }
    public ResponseDto<PaymentDetailDto> getPaymentAmountDetails(String bookingUuid){

        log.info("Called api to fetch payment amount details");
        Object postBody=null;
        final Map<String,Object> uriVariables=new HashMap<>();
        uriVariables.put("bookingUuid",bookingUuid);
        String path= UriComponentsBuilder.fromPath("/payment/amount/Details/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams=new HttpHeaders();
        final String[] accepts = { "*/*" };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PaymentDetailDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentDetailDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payement amount details with uuid",bookingUuid);
        }
        return null;
    }
}

