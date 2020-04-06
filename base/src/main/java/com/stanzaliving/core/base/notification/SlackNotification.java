/**
 *
 */
package com.stanzaliving.core.base.notification;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import lombok.extern.log4j.Log4j2;
import org.slf4j.MDC;
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

    public String sendPushNotificationRequest(String message, String endUrl) {

        String path = UriComponentsBuilder.fromPath(endUrl).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };

        Map<String, String> map = new HashMap<>();
        map.put("text", message);

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, map, headerParams, accept, returnType);
        } catch (Exception e) {
            log.info("Exception caught while sending message on Slack : ", e);
        }

        return null;
    }

    public String sendExceptionNotificationRequest(Exception exception, String endUrl) {

        log.info("Send exception notification on Slack request exception " + exception);

        StringWriter sw = new StringWriter();
        sw.append(MDC.get(StanzaConstants.GUID));
        sw.append("\n");
        exception.printStackTrace(new PrintWriter(sw));

        return sendPushNotificationRequest(sw.toString(), endUrl);
    }
}