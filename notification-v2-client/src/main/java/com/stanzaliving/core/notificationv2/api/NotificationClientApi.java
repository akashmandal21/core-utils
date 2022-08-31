package com.stanzaliving.core.notificationv2.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.genericdashboard.dto.AudienceLocationDto;
import com.stanzaliving.genericdashboard.dto.CampaignAudienceDto;
import com.stanzaliving.notification.dto.FcmTokenDto;
import com.stanzaliving.notification.dto.NotificationDTO;
import com.stanzaliving.notification.dto.NotificationRegistryDto;
import com.stanzaliving.notification.dto.UserDataDto;

import lombok.extern.log4j.Log4j2;

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

@Log4j2
public class NotificationClientApi {

    public static final String USER_ID = "userId";
    public static final String CAMPAIGN_ID = "campaignId";
    public static final String USER_UUID = "userUuid";
    public static final String RESIDENCE_UUID = "residenceUuid";
    public static final String APPLICATION_NAME = "applicationName";

    private StanzaRestClient restClient;

    public NotificationClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }


    public ResponseDto<UserDataDto> getUserInformation(String userId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(USER_ID, userId);
        String path =
                UriComponentsBuilder.fromPath("api/v1/fcm/user/{userId}/location")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<UserDataDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<UserDataDto>>() {
                };
        return restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<NotificationDTO> saveGenericNotification(
            NotificationDTO notificationRegistryDto) {

        try {
			Object postBody = null;

			String path =
			        UriComponentsBuilder.fromPath("/api/v1/generic-notification")
			                .toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final String[] accepts = {"*/*"};

			final HttpHeaders headerParams = new HttpHeaders();
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<NotificationDTO>> returnType =
			        new ParameterizedTypeReference<ResponseDto<NotificationDTO>>() {
			        };
			postBody = notificationRegistryDto;
			return restClient.invokeAPI(
			        path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(e);
			return ResponseDto.failure(e.getMessage());
		}
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
                new ParameterizedTypeReference<ResponseDto<NotificationRegistryDto>>() {
                };
        postBody = notificationRegistryDto;
        //log post body
        log.info("Temp, log for post Body {}", postBody);
        return restClient.invokeAPI(
                path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<String> getAllUsers(String applicationName) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(APPLICATION_NAME,applicationName);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/application/{applicationName}/users")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {
                };
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

    public List<String> getUserLocation(String applicationName,AudienceLocationDto audienceLocationDto) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(APPLICATION_NAME,applicationName);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/application/{applicationName}/user/list")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {
                };
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

    public void terminateNotification(String uuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", uuid);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/notification/{id}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        restClient.invokeAPI(
                path, HttpMethod.DELETE, queryParams, postBody, headerParams, accept, returnType);
    }

    public void terminateCampaign(String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/user-notification/campaign/{id}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        restClient.invokeAPI(
                path, HttpMethod.DELETE, queryParams, postBody, headerParams, accept, returnType);
    }

    public Date getCampaignEndDate(String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(CAMPAIGN_ID, campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/notification/end-date/campaign/{campaignId}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Date>> returnType = new ParameterizedTypeReference<ResponseDto<Date>>() {
        };
        ResponseDto<Date> response = restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        return response.getData();
    }

    public FcmTokenDto getFcmTokenDto(String userId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(USER_ID, userId);
        String path =
                UriComponentsBuilder.fromPath("api/v1/fcm/user/{userId}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<FcmTokenDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<FcmTokenDto>>() {};
        final ResponseDto<FcmTokenDto> response = restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        return response.getData();
    }

    public Date getNotificationClickedAt(String userId, String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(USER_ID, userId);
        uriVariables.put(CAMPAIGN_ID, campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/user/{userId}/campaign/{campaignId}/notification/clickedAt/latest")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Date>> returnType = new ParameterizedTypeReference<ResponseDto<Date>>() {
        };
        ResponseDto<Date> response = restClient.invokeAPI(
                path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        return response.getData();
    }

    public void updateUserNotificationOnClick(String userUuid, String residenceUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(USER_UUID, userUuid);
        uriVariables.put(RESIDENCE_UUID, residenceUuid);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/user/{userUuid}/residence/{residenceUuid}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        restClient.invokeAPI(
                path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<String> getUserInformation(String applicationName,CampaignAudienceDto audienceDto) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(APPLICATION_NAME,applicationName);

        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/user/application/{applicationName}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        postBody = audienceDto;
        ResponseDto<List<String>> response = restClient.invokeAPI(
                path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        return response.getData();
    }
    
    public Map<String,UserDataDto> getUserDataForUserList(List<String> userIds) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path =
                UriComponentsBuilder.fromPath("/api/v1/fcm/users/location")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final HttpHeaders headerParams = new HttpHeaders();
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String,UserDataDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<String,UserDataDto>>>() {
                };
        postBody = userIds;
        ResponseDto<Map<String, UserDataDto>> userDataMapResponse = restClient.invokeAPI(
                path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        return userDataMapResponse.getData();
    }

    public List<String> getNotificationClickedUserForCampaign(String campaignId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put(CAMPAIGN_ID,campaignId);
        String path =
                UriComponentsBuilder.fromPath("/api/v1/user/notification/campaign/{campaignId}")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {
                };

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
}
