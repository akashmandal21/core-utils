package com.stanzaliving.operations.client;

import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OpsCalculatorClient {

	private StanzaRestClient restClient;

	public OpsCalculatorClient(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
}