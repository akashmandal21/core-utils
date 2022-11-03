package com.stanzaliving.core.client.api;

import com.stanzaliving.core.base.exception.BaseMarker;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.wanda.response.OnBoardingGetResponse;
import com.stanzaliving.wanda.response.WandaResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class WandaV2ClientApi {

    private final StanzaRestClient restClient;

    public WandaV2ClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public WandaResponse<OnBoardingGetResponse> getOnBoardingDetails(String userUuid) {

        try {
            Object postBody = null;

            log.info("get User details by userUuid is {} ", userUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("internal/onboarding/details").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.put("userUuid", Collections.singletonList(userUuid));

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>> returnType = new ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error(BaseMarker.WANDA_API_ERROR, "error while fetching the user details " + e);
            return null;
        }
    }

}
