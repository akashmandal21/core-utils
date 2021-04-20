package com.stanzaliving.core.notifications.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.genericdashboard.dto.AudienceLocationDto;
import com.stanzaliving.notification.dto.NotificationRegistryDto;
import com.stanzaliving.notification.dto.UserDetailsDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationClientApi {
    private StanzaRestClient restClient;

    public NotificationClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<UserDetailsDto> getUserInformation(String userId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userId", userId);
        String path =
                UriComponentsBuilder.fromPath("api/v1/fcm/user/{userId}/location")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<UserDetailsDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<UserDetailsDto>>() {};
        return restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<NotificationRegistryDto> saveNotification(
            NotificationRegistryDto notificationRegistryDto) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path =
                UriComponentsBuilder.fromPath("/api/v1/notification/")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final HttpHeaders headerParams = new HttpHeaders();
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<NotificationRegistryDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<NotificationRegistryDto>>() {};
        postBody = notificationRegistryDto;
        return restClient.invokeAPI(
                path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<String> getAllUsers() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/users")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {};
        final ResponseDto<List<String>> responseDto =
                restClient.invokeAPI(
                        path,
                        HttpMethod.GET,
                        queryParams,
                        postBody,
                        headerParams,
                        accept,
                        returnType);
        return responseDto.getData();
    }

    public List<String> getUserLocation(AudienceLocationDto audienceLocationDto) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/user/list")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {};
        postBody = audienceLocationDto;

        final ResponseDto<List<String>> responseDto =
                restClient.invokeAPI(
                        path,
                        HttpMethod.POST,
                        queryParams,
                        postBody,
                        headerParams,
                        accept,
                        returnType);
        return responseDto.getData();
    }

    public void terminateCampaign(String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("campaignId", campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/notification/campaign/{campaignId}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        restClient.invokeAPI(
                path, HttpMethod.DELETE, queryParams, postBody, headerParams, accept, returnType);
    }

    public Date getCampaignEndDate(String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("campaignId", campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/notification/end-date/campaign/{campaignId}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Date>> returnType = new ParameterizedTypeReference<ResponseDto<Date>>() {};
        ResponseDto<Date> response = restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        return response.getData();
    }

    public String getNotificationClickedAt(String userId, String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userId", userId);
        uriVariables.put("campaignId", campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/notification/campaign/{campaignId}/user/{userId}/notification")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {};
        ResponseDto<String> response = restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        return response.getData();
    }

    public void updateUserNotificationOnClick(String userUuid, String residenceUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userUuid", userUuid);
        uriVariables.put("residenceUuid", residenceUuid);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/user/{userUuid}/residence/{residenceUuid}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {};
        restClient.invokeAPI(
                path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }
}