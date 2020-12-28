package com.stanzaliving.core.user.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.StanzaSecurityException;
import com.stanzaliving.core.base.http.StanzaRestClient;
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

import javax.servlet.http.HttpServletResponse;
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
        ResponseDto<String> response = restClient.invokeAPIAndSetToken(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType,null);
        if (!response.isStatus()) {
            throw new StanzaSecurityException(response.getMessage());
        }
        return response;
    }

    public ResponseDto<UserProfileDto> validateSignUpOtp(String uuid, String otp, HttpServletResponse httpServletResponse) {
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

        ResponseDto<UserProfileDto> response = restClient.invokeAPIAndSetToken(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType,httpServletResponse);

        if (!response.isStatus()) {
            throw new StanzaSecurityException(response.getMessage());
        }
        return response;
    }
}
