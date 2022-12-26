package com.stanzaliving.core.messagebird.client.api;

import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.messagebird.client.dto.MessageBirdConversationListDto;
import lombok.extern.log4j.Log4j2;
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

@Log4j2
public class MessageBirdDataControllerApi {

    private StanzaRestClient restClient;

    public MessageBirdDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }


    public MessageBirdConversationListDto getMessagesByConversationId(String conversationId, String key) {
        if (StringUtils.isBlank(key)) {
            throw new IllegalArgumentException("Message bird key missing");
        }

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", conversationId);

        String path = UriComponentsBuilder.fromPath("/v1/conversations/{id}/messages").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        String auth = "AccessKey " + key;

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, auth);

        final String[] accepts = {
                "*/*"
        };
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<MessageBirdConversationListDto> returnType = new ParameterizedTypeReference<MessageBirdConversationListDto>() {
        };

        try {
            log.info("Executing message bird api to get messages of a conversation");
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.info("Exception e {},", var11);
            return null;
        }
    }
}


