package com.stanzaliving.core.attendance.client.api;

import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AttendanceClientApi {
	
	private StanzaRestClient restClient;

	public AttendanceClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

}
