package com.stanzaliving.core.http.client;

import com.stanzaliving.core.http.config.Mapper;
import com.stanzaliving.core.http.util.HeadersUtil;
import com.stanzaliving.core.http.util.RequestFactoryUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.http.dto.StanzaHttpRequestDto;

import java.net.URI;


/**
 * @author piyush srivastava
 *
 * @date 03-Apr-2020
 *
 */


@Log4j2
//@UtilityClass
public class Request {

	private final RestTemplate appRestClient;

	public Request() {
		this.appRestClient = new RestTemplate();
//        appRestClient.setMessageConverters(Collections.singletonList(mappingJackson2HttpMessageConverter()));
		Mapper.configureRestTemplate(appRestClient);
	}


	private <T> ResponseEntity<T> makeRequest(HttpMethod method, String uriString, HttpEntity<Object> httpEntity, Class<T> responseType){
		log.info("Accessing Api with method: "+ method + " and url: " + uriString);
		ResponseEntity<T> responseEntity = null;
		try{
			responseEntity = appRestClient.exchange(uriString, method, httpEntity, responseType);
		} catch (HttpClientErrorException e){
			if(!e.getStatusCode().is2xxSuccessful()){
				responseEntity = new ResponseEntity<T>(null , e.getResponseHeaders(), e.getStatusCode());
			}
			log.error("Error while making request to url: " + uriString, e);
		}
		return responseEntity;
	}


	private <T> ResponseEntity<T> doRequest(
			String url,
			HttpMethod method,
			MultiValueMap<String, String> params,
			Object requestBody,
			HttpHeaders headers,
			Class<T> responseType,
			int connectTimeout,
			int readTimeout,
			String proxy
	){
		ResponseEntity<T> responseEntity = null;
		try {
			params = (params == null) ? new LinkedMultiValueMap<>() : params;
			final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
			final String uriString = builder.queryParams(params).toUriString();
			appRestClient.setRequestFactory(RequestFactoryUtil.getRequestFactory(connectTimeout, readTimeout, proxy));
			HttpEntity<Object> httpEntity = new HttpEntity<>(requestBody, HeadersUtil.getHeadersForRequest(headers));

			responseEntity = makeRequest(method, uriString, httpEntity, responseType);
		} catch (Exception e){
			log.error("Unable to send request.", e);
		}
		return responseEntity;
	}



	private <T> ResponseEntity<T> doRequest(
			StanzaHttpRequestDto requestDto,
			Class<T> responseType
	){
		return doRequest(requestDto.getUrl(), requestDto.getMethod(), requestDto.getQueryParams(), requestDto.getRequestBody(), requestDto.getHeaders(), responseType, requestDto.getConnectTimeout(), requestDto.getReadTimeout(), requestDto.getProxy());
	}


	public <T> ResponseEntity<T> request(StanzaHttpRequestDto requestDto, Class<T> responseType){
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> get(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.GET);
		requestDto.setRequestBody(null);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> post(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.POST);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> put(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.PUT);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> head(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.HEAD);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> patch(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.PATCH);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> delete(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.DELETE);
		return doRequest(requestDto, responseType);
	}

	public <T> ResponseEntity<T> options(StanzaHttpRequestDto requestDto, Class<T> responseType){
		requestDto.setMethod(HttpMethod.OPTIONS);
		return doRequest(requestDto, responseType);
	}
}
