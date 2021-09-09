package com.stanzaliving.core.generictaskservice.client.api;

import com.stanzaliving.core.base.http.StanzaRestClient;
import lombok.extern.log4j.Log4j2;

/**
 * @author Vikas S T
 * @date 09-Sep-21
 **/
@Log4j2
public class GenericTaskControllerApi {
    private StanzaRestClient restClient;

    public GenericTaskControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

}
