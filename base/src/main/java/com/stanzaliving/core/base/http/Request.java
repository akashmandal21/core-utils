package com.stanzaliving.core.base.http;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @author piyush srivastava
 *
 * @date 03-Apr-2020
 *
 */


@Log4j2
@UtilityClass
public class Request {

    private HttpHeaders getDefaultHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.ALL));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setCacheControl(CacheControl.noCache());
        return headers;
    }


    private HttpHeaders getHeadersForRequest(HttpHeaders headers){
        HttpHeaders headerParams = new HttpHeaders();
        HttpHeaders defaultHeaders = getDefaultHeaders();

        headerParams.addAll(defaultHeaders);

        if(headers != null) {
            Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
            for (Map.Entry<String, List<String>> entry : entrySet) {
                headerParams.replace(entry.getKey(), entry.getValue());
            }
        }
        return headerParams;
    }



    private <T> T doRequest(String url,
                             HttpMethod method,
                             MultiValueMap<String, String> params,
                             Object requestBody,
                             HttpHeaders headers,
                             ParameterizedTypeReference<T> returnType){

        assert url != null;
        assert method != null;
        params = (params == null) ? new LinkedMultiValueMap<>() : params;
        headers = getHeadersForRequest(headers);

        StanzaRestClient restClient = new StanzaRestClient(url);
        try {
            final T t = restClient.invokeAPI("/", method, params, requestBody, headers, null, returnType );
            return t;
        } catch (Exception e){
            log.error("Unable to send request.", e);
        }
        return null;
    }


    public <T> T get(String url, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.GET, null, null, null, returnType);
    }


    public <T> T get(String url, MultiValueMap<String, String> queryParams, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.GET, queryParams, null, null, returnType);
    }

    public <T> T get(String url, MultiValueMap<String, String> queryParams, HttpHeaders headers, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.GET, queryParams, null, headers, returnType);
    }

    public <T> T post(String url, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.POST, null, null, null, returnType);
    }

    public <T> T post(String url, MultiValueMap<String, String> queryParams, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.POST, queryParams, null, null, returnType);
    }

    public <T> T post(String url, MultiValueMap<String, String> queryParams, Object requestBody, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.POST, queryParams, requestBody, null, returnType);
    }

    public <T> T post(String url, MultiValueMap<String, String> queryParams, Object requestBody, HttpHeaders headers, ParameterizedTypeReference<T> returnType){
        return doRequest(url, HttpMethod.POST, queryParams, requestBody, headers, returnType);
    }

    public <T> T request(String url, HttpMethod method, ParameterizedTypeReference<T> returnType){
        return doRequest(url, method, null, null, null, returnType);
    }

    public <T> T request(String url, HttpMethod method, MultiValueMap<String, String> queryParams, ParameterizedTypeReference<T> returnType){
        return doRequest(url, method, queryParams, null, null, returnType);
    }

    public <T> T request(String url, HttpMethod method, MultiValueMap<String, String> queryParams, Object requestBody, ParameterizedTypeReference<T> returnType){
        return doRequest(url, method, queryParams, requestBody, null, returnType);
    }

    public <T> T request(String url, HttpMethod method, MultiValueMap<String, String> queryParams, Object requestBody, HttpHeaders headers, ParameterizedTypeReference<T> returnType){
        return doRequest(url, method, queryParams, requestBody, headers, returnType);
    }

}
