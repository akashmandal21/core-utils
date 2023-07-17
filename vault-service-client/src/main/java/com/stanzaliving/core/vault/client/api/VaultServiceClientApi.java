package com.stanzaliving.core.vault.client.api;

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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class VaultServiceClientApi {

    private StanzaRestClient restClient;

    public VaultServiceClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    public ResponseDto<?> updateAccrualVaultCoins() {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/updateAccrualVaultCoins")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<?>> returnType = new ParameterizedTypeReference<ResponseDto<?>>() {
        };
        try {
            log.info("Executing Api for Updating vault for Accrual with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caught while Updating vault for Accrual, Exception is ", e);
        }
        return null;
    }

    public ResponseDto<?> getAvailableCoinsForResidence(String residenceId) {

        try {
            Object postBody = null;
            log.info("Received request to get available coins for residenceId {}", residenceId);
            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("residenceId", residenceId);
            String path = UriComponentsBuilder.fromPath("/getAvialableCoinsForResidenceId/{residenceId}").buildAndExpand(uriVariables)
                    .toUriString();
            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            final HttpHeaders headerParams = new HttpHeaders();
            final String[] accepts = { "*/*" };

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference<ResponseDto<?>> returnType = new ParameterizedTypeReference<ResponseDto<?>>() {
            };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception occurred while fetching available coins : ", e);
        }
        return null;
    }
}
