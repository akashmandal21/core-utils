package com.stanzaliving.core.payment.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.RazorPayXDto;
import com.stanzaliving.ledger.dto.RefundRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Log4j2
public class RazorPayXControllerApi {
    private StanzaRestClient restClient;

    public RazorPayXControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<List<String>> getResponseFromRazorpayX(RazorPayXDto razorPayXDto) {
        if (Objects.isNull(razorPayXDto)) {
            throw new IllegalArgumentException("Required payload is missing");
        }

        Object postBody = razorPayXDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/payment/razorpayX/response")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<List<String>>> returnType = new TypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseEntity<HashMap<String, String>> initiateRazorpayXPayout(RefundRequest refundRequestDTO){
        log.info("Initiate RazorpayXPayout Controller");

        Object postBody = refundRequestDTO;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/payment/razorpayX/initiate").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseEntity<HashMap<String, String>>> returnType = new ParameterizedTypeReference<ResponseEntity<HashMap<String, String>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }
}
