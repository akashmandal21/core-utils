package com.stanzaliving.core.shorturl.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.shorturl.dto.UrlShortenerDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ShortUrlClientApi {

	private StanzaRestClient restClient;

	public ShortUrlClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public String converUrl(UrlShortenerDto urlShortenerDto) {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/createShortUrl").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, urlShortenerDto, headerParams, accept,
				returnType);

	}

}