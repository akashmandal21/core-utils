package com.stanzaliving.core.user.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.dto.UserDto;
import com.stanzaliving.core.user.dto.UserProfileDto;
import com.stanzaliving.core.user.request.dto.AddUserRequestDto;
import org.apache.commons.lang3.StringUtils;
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

/**
 * @author harman
 */
public class UserSignupClientApi {

    private final StanzaRestClient restClient;

    public UserSignupClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<String> signUpUser(AddUserRequestDto addUserRequestDto) {

        System.out.println(addUserRequestDto.getEmail());
        System.out.println(addUserRequestDto.getFirstName());
        System.out.println(addUserRequestDto.getMiddleName());
        System.out.println(addUserRequestDto.getLastName());
        System.out.println(addUserRequestDto.getMobile());
        System.out.println(addUserRequestDto.getUserType());
        System.out.println(addUserRequestDto.getDepartment());

        if (Objects.isNull(addUserRequestDto)) {
            throw new IllegalArgumentException("Request is null for adding user");
        }

        AddUserRequestDto postBody = addUserRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/signup/signUpUser").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<UserProfileDto> validateSignUpOtp(String uuid, String otp) {
        String path = UriComponentsBuilder.fromPath("/signup/validateOtp").toUriString();

        if (StringUtils.isBlank(uuid) || StringUtils.isBlank(otp)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("Uuid", uuid);

        queryParams.add("otp", otp);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<UserProfileDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserProfileDto>>() {
        };

        ResponseDto<UserProfileDto> response = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

        if (!response.isStatus()) {
            throw new StanzaSecurityException(response.getMessage());
        }
        return response;
    }
}
