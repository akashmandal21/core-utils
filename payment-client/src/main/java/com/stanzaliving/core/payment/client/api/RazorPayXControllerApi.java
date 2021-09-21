package com.stanzaliving.core.payment.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.TransactionDto;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
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
public class RazorPayXControllerApi {
    private StanzaRestClient restClient;

    public RazorPayXControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<?> getResponseFromRazorpayX(String payoutId,
                                                   Boolean isRefund ) {
        Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/payment/razorpayX/response")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("payoutId", payoutId);
        queryParams.add("isRefund", isRefund.toString());

         HttpHeaders headerParams = new HttpHeaders();

         String[] accepts = { "*/*" };
         List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<?>> returnType = new ParameterizedTypeReference<ResponseDto<?>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching razorPayX details  {} ", e.getMessage());
        }
        return null;

    }
}
