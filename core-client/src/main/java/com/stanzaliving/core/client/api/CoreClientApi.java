package com.stanzaliving.core.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.DocumentStatus;
import com.stanzaliving.core.base.enums.DocumentType;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.*;
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
public class CoreClientApi {

    private StanzaRestClient restClient;
    private String token;

    public CoreClientApi( StanzaRestClient stanzaRestClient){
        this.restClient=stanzaRestClient;
    }

    public CoreClientApi( StanzaRestClient stanzaRestClient, String token){
        this.restClient=stanzaRestClient;
        this.token = token;
    }

    public FullUserDto getUserDetails(String userId){
        return getUserDetails(userId, token).getData();
    }


    public UserDetailDto getUserDetailsByUserCode(String userCode){
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("userCode", userCode);

        String path = UriComponentsBuilder.fromPath("/user/userDetailDto").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("userCode", userCode);

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, UserDetailDto.class);
        } catch (Exception e){
            log.error("Error while getting user Details from Core by userCode. " + path + queryParams.toString(), e);
        }
        return null;
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


    public ResponseDto<UserRegistrationDto> updateUserRegistration(String userId, String token, DocumentType documentType, DocumentStatus documentStatus) {
         /* if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for getting all versions ");
        }*/

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/registerUser").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.putAll(restClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(restClient.parameterToMultiValueMap(null, "documentType", documentType));
        queryParams.putAll(restClient.parameterToMultiValueMap(null, "documentStatus", documentStatus));

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FullUserDto>> returnType = new ParameterizedTypeReference<ResponseDto<FullUserDto>>() {
        };

        UserRegistrationDto response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, UserRegistrationDto.class);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setData(response);
        responseDto.setStatus(true);
        responseDto.setHttpStatusCode(200);

        return responseDto;
    }


    public List<RCDetailDto> getContactNumber(String residenceId, String token) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceId", residenceId);

        String path = UriComponentsBuilder.fromPath("/getRCDetail/{residenceId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.BASIC_HEADER_NAME, token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RCDetailDto>> returnType = new ParameterizedTypeReference<List<RCDetailDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }
}
