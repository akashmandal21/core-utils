package com.stanzaliving.core.pushnotification.client.api;


import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.pushnotification.pojo.WebEngageTransactionNotificationRequestDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

//Though this client doesn't call push notification service, but if required, it has to go through push notification only
@Log4j2
public class WebEngageClient {

    private StanzaRestClient restClient;
    private String webEngageKey;
    private Boolean webEngageEnabled;

    public WebEngageClient(StanzaRestClient stanzaRestClient, String webEngageKey, Boolean webEngageEnabled) {
        this.restClient = stanzaRestClient;
        this.webEngageKey = webEngageKey;
        this.webEngageEnabled = webEngageEnabled;
    }

    public void pushNotification(WebEngageTransactionNotificationRequestDto webEngageTransactionNotificationRequestDto) {

        if (!webEngageEnabled) {
            log.info("WebEngage is disabled on current environment, fyi, notificationDto {}", webEngageTransactionNotificationRequestDto);
        }

        if (StringUtils.isBlank(webEngageTransactionNotificationRequestDto.getUserId())) {
            throw new IllegalArgumentException("Mandatory Parameter Missing -> userId");
        }

        Map<String, Object> postBody = getBody(webEngageTransactionNotificationRequestDto);

        String path = getApiPath(webEngageTransactionNotificationRequestDto);


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add("Authorization", webEngageKey);


        final String[] accepts = {
                "*/*"
        };
        ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, responseType);
        log.info("response for webengage api {}", response);

    }

    private String getApiPath(WebEngageTransactionNotificationRequestDto webEngageTransactionNotificationRequestDto) {
        String path;

        final Map<String, Object> uriVariables = new HashMap<>();

        if (StringUtils.isNotEmpty(webEngageTransactionNotificationRequestDto.getAccountId()) && StringUtils.isNotEmpty(webEngageTransactionNotificationRequestDto.getCampaignId())) {
            uriVariables.put("accountId", webEngageTransactionNotificationRequestDto.getAccountId());
            uriVariables.put("campaignId", webEngageTransactionNotificationRequestDto.getCampaignId());
            path = UriComponentsBuilder.fromPath("/{accountId}/experiments/{campaignId}/transaction").buildAndExpand(uriVariables).toUriString();
        } else {
            path = UriComponentsBuilder.fromPath("").buildAndExpand(uriVariables).toUriString();
        }
        return path;
    }

    private Map<String, Object> getBody(WebEngageTransactionNotificationRequestDto webEngageTransactionNotificationRequestDto) {
        Map<String, Object> postBody = new HashMap<>();

        postBody.put("userId", webEngageTransactionNotificationRequestDto.getUserId());
        if (Objects.nonNull(webEngageTransactionNotificationRequestDto.getTtl())) {
            postBody.put("ttl", webEngageTransactionNotificationRequestDto.getTtl());
        }
        if (MapUtils.isNotEmpty(webEngageTransactionNotificationRequestDto.getOverrideData())) {
            Map<String, String> token = webEngageTransactionNotificationRequestDto.getOverrideData();
            Map<String, Map> context = Collections.singletonMap("token", token);
            Map<String, Map> overrideData = Collections.singletonMap("context", context);
            postBody.put("overrideData", overrideData);
        }
        postBody.put("txnId", StanzaUtils.generateUniqueId());
        return postBody;
    }

}
