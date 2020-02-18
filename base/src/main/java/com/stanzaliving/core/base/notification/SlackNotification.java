/**
 *
 */
package com.stanzaliving.core.base.notification;

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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Amit
 *
 */
@Log4j2
public class SlackNotification {

    private StanzaRestClient restClient;

    public SlackNotification(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<String> sendPushNotificationRequest(String message, String endUrl) {

        String path = UriComponentsBuilder.fromPath(endUrl).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        Map<String, String> map = new HashMap<>();
        map.put("text", message);

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept,
                returnType);
    }

    public ResponseDto<String> sendExceptionNotificationRequest(Exception exception, String endUrl) {

        log.info("Send exception notification on Slack request exception " + exception);

        StringWriter sw = new StringWriter();
        exception.printStackTrace(new PrintWriter(sw));

        return sendPushNotificationRequest(sw.toString(), endUrl);
    }
}