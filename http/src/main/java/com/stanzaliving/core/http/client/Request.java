package com.stanzaliving.core.http.client;

import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.http.config.Mapper;
import com.stanzaliving.core.http.util.HeadersUtil;
import com.stanzaliving.core.http.util.RequestFactoryUtil;
import com.sun.deploy.net.proxy.ProxyConfigException;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.http.dto.StanzaHttpRequestDto;

import java.net.URI;
import java.net.UnknownHostException;


/**
 * @author piyush srivastava
 *
 * @date 03-Apr-2020
 *
 */


@Log4j2
@UtilityClass
public class Request {

	private static final RestTemplate appRestClient = new RestTemplate();
	static {
		Mapper.configureRestTemplate(appRestClient);
	}


	private <T> ResponseEntity<T> makeRequest(HttpMethod method, String uriString, HttpEntity<Object> httpEntity, ParameterizedTypeReference<T> responseType){
		ResponseEntity<T> responseEntity = null;
		try{
			log.info("Accessing Api with method: "+ method + " and url: " + uriString);
			responseEntity = appRestClient.exchange(uriString, method, httpEntity, responseType);
			log.info("Successfully got the response with method: "+ method + " and url: " + uriString);
		} catch (HttpClientErrorException e){
			log.error("Error while making request to url: " + uriString, e);
			if(!e.getStatusCode().is2xxSuccessful()){
				responseEntity = new ResponseEntity<T>(null , e.getResponseHeaders(), e.getStatusCode());
			}
		}
		return responseEntity;
	}


	private <T> ResponseEntity<T> doRequest(
			String url,
			HttpMethod method,
			MultiValueMap<String, String> params,
			Object requestBody,
			HttpHeaders headers,
			ParameterizedTypeReference<T> responseType,
			int connectTimeout,
			int readTimeout,
			String proxy
	) {
		ResponseEntity<T> responseEntity = null;
		try {
			params = (params == null) ? new LinkedMultiValueMap<>() : params;
			final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
			final String uriString = builder.queryParams(params).toUriString();
			appRestClient.setRequestFactory(RequestFactoryUtil.getRequestFactory(connectTimeout, readTimeout, proxy));
			HttpEntity<Object> httpEntity = new HttpEntity<>(requestBody, HeadersUtil.getHeadersForRequest(headers));
			responseEntity = makeRequest(method, uriString, httpEntity, responseType);
		} catch (UnknownHostException | ProxyConfigException | RestClientException e){
			log.error("Error while requesting to url:" + url, e);
			throw new StanzaHttpException(e.getMessage());
		} catch (Exception e){
			log.error("Error in getting response with url:" + url, e);
		}
		return responseEntity;
	}



	private <T> ResponseEntity<T> doRequest(
			StanzaHttpRequestDto requestDto,
			ParameterizedTypeReference<T> responseType
	) {
		return doRequest(requestDto.getUrl(), requestDto.getMethod(), requestDto.getQueryParams(), requestDto.getRequestBody(), requestDto.getHeaders(), responseType, requestDto.getConnectTimeout(), requestDto.getReadTimeout(), requestDto.getProxy());
	}


	public <T> ResponseEntity<T> request(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> get(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.GET);
		requestDto.setRequestBody(null);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> post(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.POST);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> put(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.PUT);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> head(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.HEAD);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> patch(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.PATCH);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> delete(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.DELETE);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> options(StanzaHttpRequestDto requestDto, ParameterizedTypeReference<T> responseType){
		requestDto.setMethod(HttpMethod.OPTIONS);
		return doRequest(requestDto, responseType);
	}
}
