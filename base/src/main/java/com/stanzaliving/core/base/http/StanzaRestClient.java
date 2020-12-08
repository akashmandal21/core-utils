/**
 *
 */
package com.stanzaliving.core.base.http;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

import org.slf4j.MDC;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.exception.StanzaSecurityException;

import lombok.extern.log4j.Log4j2;

/**
 * @author naveen
 *
 * @date 17-Oct-2019
 */
@Log4j2
public class StanzaRestClient {

    private String basePath;

    private RestTemplate restTemplate;

    private ObjectMapper objectMapper;

    private HttpHeaders defaultHeaders = new HttpHeaders();

    public StanzaRestClient(String basePath) {
        this.basePath = basePath;
        this.restTemplate = buildRestTemplate();
        objectMapper = BaseMapperConfig.getDefaultMapper();
    }

    public StanzaRestClient(String basePath, int connectTimeOut, int readTimeOut) {
        this.basePath = basePath;
        this.restTemplate = buildRestTemplate(connectTimeOut, readTimeOut);
        objectMapper = BaseMapperConfig.getDefaultMapper();
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

    private RestTemplate buildRestTemplate(int connectTimeOut, int readTimeOut) {

        RestTemplate template = new RestTemplate(getClientHttpRequestFactory(connectTimeOut, readTimeOut));

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

    @SuppressWarnings("rawtypes")
    public void configureRestTemplate(RestTemplate template) {
        for (HttpMessageConverter converter : template.getMessageConverters()) {

            if (converter instanceof AbstractJackson2HttpMessageConverter) {
                ObjectMapper mapper = ((AbstractJackson2HttpMessageConverter) converter).getObjectMapper();
                mapper = BaseMapperConfig.configureMapper(mapper);
            }
        }
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

        if (Objects.nonNull(headerParams)) {

            addHeadersToRequest(headerParams, requestBuilder);
        }

        log.info("Accessing API: {}", builder.toUriString());

        RequestEntity<Object> requestEntity = requestBuilder.body(body);

        return getResponse(requestEntity, returnType, builder);
    }

    private <T> T getResponse(RequestEntity<Object> requestEntity, ParameterizedTypeReference<T> returnType, final UriComponentsBuilder builder) {
        ResponseEntity<T> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(requestEntity, returnType);

        } catch (RestClientException e) {
            if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("401")) {
                responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            } else if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("403")) {
                responseEntity = new ResponseEntity<>(HttpStatus.FORBIDDEN);
            } else {

                log.error("Exception caught while making rest call: ", e);
                throw new StanzaHttpException(e.getMessage(), e);
            }
        }

        // TODO: Need to improve code for getting Token from response header
        System.out.println("headers======1====="+responseEntity.getHeaders());
        System.out.println("headers=======2===="+responseEntity.getHeaders().size());
        System.out.println("headers========3==="+responseEntity.getHeaders().get("Set-Cookie"));

        List<String> strings = responseEntity.getHeaders().get("Set-Cookie");

        String token = null;
        if (strings != null && strings.size() > 0) {
            String string = strings.get(0);
            token = string.substring("token=".length(), string.indexOf(";"));
        }
        System.out.println("=======token=====" + token);
        HttpStatus statusCode = responseEntity.getStatusCode();

        log.info("API: {}, Response: {}", builder.toUriString(), statusCode);

        if (responseEntity.getStatusCode() == HttpStatus.NO_CONTENT) {
            return null;
        } else if (responseEntity.getStatusCode().is2xxSuccessful()) {
            if (returnType == null) {
                return null;
            }
            return responseEntity.getBody();
        } else if (responseEntity.getStatusCode() == HttpStatus.UNAUTHORIZED) {
            throw new StanzaSecurityException("Phone number entered doesn’t exist in the system. Please either login with the correct number or sign up.");
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

        log.info("Accessing API: {}", builder.toUriString());

        RequestEntity<Object> requestEntity = requestBuilder.body(body);

        return getResponse(requestEntity, returnType, builder);
    }

    private <T> T getResponse(RequestEntity<Object> requestEntity, Class<T> returnType, final UriComponentsBuilder builder) {

        ResponseEntity<T> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(requestEntity, returnType);
        } catch (RestClientException e) {
            if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("401")) {
                responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            } else if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("403")) {
                responseEntity = new ResponseEntity<>(HttpStatus.FORBIDDEN);
            } else {

                log.error("Exception caught while making rest call: ", e);
                throw new StanzaHttpException(e.getMessage(), e);
            }
        }

        HttpStatus statusCode = responseEntity.getStatusCode();

        log.info("API: {}, Response: {}", builder.toUriString(), statusCode);

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

    public <T> T invokeAPI(
            String path,
            HttpMethod method,
            MultiValueMap<String, String> queryParams,
            Object body,
            HttpHeaders headerParams,
            List<MediaType> accept,
            TypeReference<T> returnType) {

        return invokeAPI(path, method, queryParams, body, headerParams, accept, returnType, MediaType.APPLICATION_JSON);
    }

    public <T> T invokeAPI(
            String path,
            HttpMethod method,
            MultiValueMap<String, String> queryParams,
            Object body,
            HttpHeaders headerParams,
            List<MediaType> accept,
            TypeReference<T> returnType,
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

        log.info("Accessing API: {}", builder.toUriString());

        RequestEntity<Object> requestEntity = requestBuilder.body(body);

        ResponseEntity<String> responseEntity = getResponse(requestEntity);

        return processResponse(returnType, builder, responseEntity);
    }

    private ResponseEntity<String> getResponse(RequestEntity<Object> requestEntity) {

        ResponseEntity<String> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(requestEntity, String.class);

        } catch (RestClientException e) {

            if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("401")) {
                responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            } else if (!StringUtils.isEmpty(e.getMessage()) && e.getMessage().contains("403")) {
                responseEntity = new ResponseEntity<>(HttpStatus.FORBIDDEN);
            } else {

                log.error("Exception caught while making rest call: ", e);
                throw new StanzaHttpException(e.getMessage(), e);
            }
        }

        return responseEntity;
    }

    private <T> T processResponse(TypeReference<T> returnType, UriComponentsBuilder builder, ResponseEntity<String> responseEntity) {

        HttpStatus statusCode = responseEntity.getStatusCode();

        log.info("API: {}, Response: {}", builder.toUriString(), statusCode);

        if (isSuccessCode(statusCode)) {
            if (returnType == null) {
                return null;
            }

            try {
                return objectMapper.readValue(responseEntity.getBody(), returnType);
            } catch (Exception e) {
                log.error("Error reading response: ", e);
                throw new StanzaHttpException("Error while reading response", statusCode.value(), e);
            }
        }

        if (HttpStatus.NO_CONTENT == responseEntity.getStatusCode()) {
            return null;
        }

        if (isAccessDenied(statusCode)) {
            throw new StanzaSecurityException("Access Denied for User", statusCode.value());
        } else {
            // The error handler built into the RestTemplate should handle 400 and 500 series errors.
            throw new StanzaHttpException("API returned " + statusCode + " and it wasn't handled by the RestTemplate error handler", statusCode.value());
        }
    }

    private boolean isSuccessCode(HttpStatus httpStatus) {
        return HttpStatus.OK == httpStatus || HttpStatus.CREATED == httpStatus || HttpStatus.ACCEPTED == httpStatus;
    }

    private boolean isAccessDenied(HttpStatus httpStatus) {
        return HttpStatus.UNAUTHORIZED == httpStatus || HttpStatus.FORBIDDEN == httpStatus;
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

        headers.add(StanzaConstants.GUID, MDC.get(StanzaConstants.GUID));
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