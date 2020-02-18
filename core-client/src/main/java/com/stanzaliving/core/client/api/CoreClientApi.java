package com.stanzaliving.core.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.FullUserDto;
import com.stanzaliving.core.user.dto.UserDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.base.constants.SecurityConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoreClientApi {

    private StanzaRestClient restClient;

    public CoreClientApi( StanzaRestClient stanzaRestClient){
        this.restClient=stanzaRestClient;
    }

    public ResponseDto<FullUserDto> getUserDetails(String userId, String token){
        /* if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for getting all versions ");
        }*/

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("userId", userId);

        String path = UriComponentsBuilder.fromPath("/fulluserdto/id/{userId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FullUserDto>> returnType = new ParameterizedTypeReference<ResponseDto<FullUserDto>>() {
        };

        FullUserDto fullUserDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, FullUserDto.class);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setData(fullUserDto);
        responseDto.setStatus(true);
        responseDto.setHttpStatusCode(200);

        return responseDto;
    }


}
