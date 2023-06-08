package com.stanzaliving.core.shorturl.api;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.shorturl.dto.UrlShortenerDto;
import lombok.extern.log4j.Log4j2;
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

	public String createShortUrlIfNotExist(UrlShortenerDto urlShortenerDto) {

		try {
			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/createShortUrlIfNotExist").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {"*/*"};

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, urlShortenerDto, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating shortUrl.", e);
			return null;
		}
	}

	public String getOriginalUrl(String shortUrl) {

		try {
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("shortUrl", shortUrl);

			String path = UriComponentsBuilder.fromPath("/get/{shortUrl}").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {"*/*"};

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error("Error while creating shortUrl.", e);
			return "";
		}
	}

}