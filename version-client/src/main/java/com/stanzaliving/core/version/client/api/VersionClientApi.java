package com.stanzaliving.core.version.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.versioning.dto.VersioningRequestDto;
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
import java.util.Objects;

public class VersionClientApi {

    private StanzaRestClient restClient;

    public VersionClientApi( StanzaRestClient stanzaRestClient){
        this.restClient=stanzaRestClient;
    }

    public ResponseDto<Void> insertVersion(String token, VersioningRequestDto versioningRequestDto) {

        //TODO API HAS NO AUTHENTICATION
        /*if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for adding user roles");
        }*/

        if (Objects.isNull(versioningRequestDto)) {
            throw new IllegalArgumentException("Request is null for insert data ");
        }

        Object postBody = versioningRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/documentversioning/insert").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }



}
