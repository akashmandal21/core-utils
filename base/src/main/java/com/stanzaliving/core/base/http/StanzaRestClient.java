/**
 * 
 */
package com.stanzaliving.core.base.http;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.stanzaliving.core.base.StanzaConstants;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeSerializer;

import lombok.extern.log4j.Log4j2;
import org.slf4j.MDC;

/**
 * @author naveen
 *
 * @date 17-Oct-2019
 */
@Log4j2
public class StanzaRestClient {

	private String basePath;

	private HttpStatus statusCode;

	private RestTemplate restTemplate;

	private MultiValueMap<String, String> responseHeaders;

	private HttpHeaders defaultHeaders = new HttpHeaders();

	public StanzaRestClient(String basePath) {
		this.basePath = basePath;
		this.restTemplate = buildRestTemplate();
	}
	
	public StanzaRestClient(String basePath, int connectTimeOut, int readTimeOut){
		this.basePath = basePath;
		this.restTemplate = buildRestTemplate(connectTimeOut, readTimeOut);
	}

	public enum CollectionFormat {

		CSV(","),
		TSV("\t"),
		SSV(" "),
		PIPES("|"),
		MULTI(null);

		private final String separator;

		private CollectionFormat(String separator) {
			this.separator = separator;
		}

		private String collectionToString(Collection<? extends CharSequence> collection) {
			return StringUtils.collectionToDelimitedString(collection, separator);
		}
	}

	private RestTemplate buildRestTemplate() {
		RestTemplate template = new RestTemplate();

		configureRestTemplate(template);
		
		// This allows us to read the response more than once - Necessary for debugging.
		template.setRequestFactory(new BufferingClientHttpRequestFactory(template.getRequestFactory()));
		return template;
	}

	private SimpleClientHttpRequestFactory getClientHttpRequestFactory(int connectTimeOut, int readTimeOut) {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		// Connect timeout
		clientHttpRequestFactory.setConnectTimeout(connectTimeOut);

		// Read timeout
		clientHttpRequestFactory.setReadTimeout(readTimeOut);
		return clientHttpRequestFactory;
	}

	private RestTemplate buildRestTemplate(int connectTimeOut, int readTimeOut) {

		RestTemplate template = new RestTemplate(getClientHttpRequestFactory(connectTimeOut, readTimeOut));

		configureRestTemplate(template);
	
		// This allows us to read the response more than once - Necessary for debugging.
		template.setRequestFactory(new BufferingClientHttpRequestFactory(template.getRequestFactory()));
		return template;
	}
	
	@SuppressWarnings("rawtypes")
	public void configureRestTemplate(RestTemplate template) {
		for (HttpMessageConverter converter : template.getMessageConverters()) {

			if (converter instanceof AbstractJackson2HttpMessageConverter) {
				ObjectMapper mapper = ((AbstractJackson2HttpMessageConverter) converter).getObjectMapper();

				mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
				mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);

				SimpleModule module = new SimpleModule();
				module.addSerializer(new Java8LocalDateStdSerializer());
				module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());
				
				module.addSerializer(new Java8LocalTimeSerializer());
				module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

				mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				mapper.registerModule(module);
			}
		}
	}
	
	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public MultiValueMap<String, String> getResponseHeaders() {
		return responseHeaders;
	}

	public StanzaRestClient setUserAgent(String userAgent) {
		addDefaultHeader("User-Agent", userAgent);
		return this;
	}

	public StanzaRestClient addDefaultHeader(String name, String value) {

		if (defaultHeaders.containsKey(name)) {
			defaultHeaders.remove(name);
		}

		defaultHeaders.add(name, value);

		return this;
	}

	public List<MediaType> selectHeaderAccept(String[] accepts) {
		if (accepts.length == 0) {
			return new ArrayList<>();
		}

		for (String accept : accepts) {
			MediaType mediaType = MediaType.parseMediaType(accept);
			if (isJsonMime(mediaType)) {
				return Collections.singletonList(mediaType);
			}
		}
		return MediaType.parseMediaTypes(StringUtils.arrayToCommaDelimitedString(accepts));
	}

	private boolean isJsonMime(MediaType mediaType) {
		return mediaType != null && (MediaType.APPLICATION_JSON.isCompatibleWith(mediaType) || mediaType.getSubtype().matches("^.*\\+json[;]?\\s*$"));
	}

	public <T> T invokeAPI(
			String path,
			HttpMethod method,
			MultiValueMap<String, String> queryParams,
			Object body,
			HttpHeaders headerParams,
			List<MediaType> accept,
			ParameterizedTypeReference<T> returnType) {

		return invokeAPI(path, method, queryParams, body, headerParams, accept, returnType, MediaType.APPLICATION_JSON);
	}
	
	public <T> T invokeAPI(
			String path,
			HttpMethod method,
			MultiValueMap<String, String> queryParams,
			Object body,
			HttpHeaders headerParams,
			List<MediaType> accept,
			ParameterizedTypeReference<T> returnType, 
			MediaType mediaType) {

		final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(basePath).path(path);

		if (queryParams != null) {
			builder.queryParams(queryParams);
		}

		final BodyBuilder requestBuilder = RequestEntity.method(method, builder.build().toUri());

		if (accept != null) {
			requestBuilder.accept(accept.toArray(new MediaType[accept.size()]));
		}

		requestBuilder.contentType(mediaType);

		addHeadersToRequest(headerParams, requestBuilder);
		addGUIDHeader();
		addHeadersToRequest(defaultHeaders, requestBuilder);

		log.debug("Accessing API: " + builder.toUriString());

		RequestEntity<Object> requestEntity = requestBuilder.body(body);

		ResponseEntity<T> responseEntity = null;
		try {
			responseEntity = restTemplate.exchange(requestEntity, returnType);

		} catch (RestClientException e) {
			log.info("Exception caught while making rest call: ",e);
			throw new StanzaHttpException("Exception caught while making rest call: "+e.getCause());
		}

		statusCode = responseEntity.getStatusCode();
		responseHeaders = responseEntity.getHeaders();

		if (responseEntity.getStatusCode() == HttpStatus.NO_CONTENT) {
			return null;
		} else if (responseEntity.getStatusCode().is2xxSuccessful()) {
			if (returnType == null) {
				return null;
			}
			return responseEntity.getBody();
		} else {
			// The error handler built into the RestTemplate should handle 400 and 500 series errors.
			throw new StanzaHttpException("API returned " + statusCode + " and it wasn't handled by the RestTemplate error handler", statusCode.value());
		}
	}

	public <T> T invokeAPI(
			String path,
			HttpMethod method,
			MultiValueMap<String, String> queryParams,
			Object body,
			HttpHeaders headerParams,
			List<MediaType> accept,
			Class<T> returnType) {

		final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(basePath).path(path);

		if (queryParams != null) {
			builder.queryParams(queryParams);
		}

		final BodyBuilder requestBuilder = RequestEntity.method(method, builder.build().toUri());

		if (accept != null) {
			requestBuilder.accept(accept.toArray(new MediaType[accept.size()]));
		}

		requestBuilder.contentType(MediaType.APPLICATION_JSON);

		addHeadersToRequest(headerParams, requestBuilder);
		addHeadersToRequest(defaultHeaders, requestBuilder);

		log.debug("Accessing API: " + builder.toUriString());

		RequestEntity<Object> requestEntity = requestBuilder.body(body);

		ResponseEntity<T> responseEntity = null;
		try {
			responseEntity = restTemplate.exchange(requestEntity, returnType);
		} catch (RestClientException e) {
			log.info("Exception caught while making rest call: ",e);
			throw new StanzaHttpException("Exception caught while making rest call: "+e.getCause());
		}

		statusCode = responseEntity.getStatusCode();
		responseHeaders = responseEntity.getHeaders();

		if (responseEntity.getStatusCode() == HttpStatus.NO_CONTENT) {
			return null;
		} else if (responseEntity.getStatusCode().is2xxSuccessful()) {
			if (returnType == null) {
				return null;
			}
			return responseEntity.getBody();
		
		} else if (responseEntity.getStatusCode() == HttpStatus.BAD_REQUEST) {
			return null;
			
		} else {
			// The error handler built into the RestTemplate should handle 400 and 500 series errors.
			throw new StanzaHttpException("API returned " + statusCode + " and it wasn't handled by the RestTemplate error handler", statusCode.value());
		}
	}

	private void addHeadersToRequest(HttpHeaders headers, BodyBuilder requestBuilder) {

		for (Entry<String, List<String>> entry : headers.entrySet()) {

			List<String> values = entry.getValue();

			for (String value : values) {
				if (value != null) {
					requestBuilder.header(entry.getKey(), value);
				}
			}
		}
	}

	public MultiValueMap<String, String> parameterToMultiValueMap(CollectionFormat collectionFormat, String name, Object value) {
		final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

		if (name == null || name.isEmpty() || value == null) {
			return params;
		}

		if (collectionFormat == null) {
			collectionFormat = CollectionFormat.CSV;
		}

		Collection<?> valueCollection = null;
		if (value instanceof Collection) {
			valueCollection = (Collection<?>) value;
		} else {
			params.add(name, parameterToString(value));
			return params;
		}

		if (valueCollection.isEmpty()) {
			return params;
		}

		if (collectionFormat.equals(CollectionFormat.MULTI)) {
			for (Object item : valueCollection) {
				params.add(name, parameterToString(item));
			}
			return params;
		}

		List<String> values = new ArrayList<>();
		for (Object o : valueCollection) {
			values.add(parameterToString(o));
		}
		params.add(name, collectionFormat.collectionToString(values));

		return params;
	}

	public String parameterToString(Object param) {
		if (param == null) {
			return "";
		} else if (param instanceof Collection) {
			StringBuilder b = new StringBuilder();
			for (Object o : (Collection<?>) param) {
				if (b.length() > 0) {
					b.append(",");
				}
				b.append(String.valueOf(o));
			}
			return b.toString();
		} else {
			return String.valueOf(param);
		}
	}

	// This method is called to add GUID header in internal API calls
	public StanzaRestClient addGUIDHeader() {////////////////////////////

		if (defaultHeaders.containsKey(StanzaConstants.GUID)) {
			defaultHeaders.remove(StanzaConstants.GUID);
		}

		defaultHeaders.add(StanzaConstants.GUID, MDC.get(StanzaConstants.GUID));

		return this;
	}
}