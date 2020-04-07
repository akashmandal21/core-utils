package com.stanzaliving.core.base.http;

import com.stanzaliving.core.base.common.dto.StanzaHttpRequestDto;
import com.sun.deploy.net.proxy.ProxyConfigException;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.*;
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
                headerParams.remove(entry.getKey());
            }
            headerParams.addAll(headers);
        }
        return headerParams;
    }


    private Proxy getProxy(String proxy) throws UnknownHostException, ProxyConfigException {
        String[] tempProxy = proxy.split(":");
        if(tempProxy.length < 2){
            throw new ProxyConfigException("Invalid proxy details");
        }

        InetAddress address = InetAddress.getByName(tempProxy[0]);
        SocketAddress socketAddress = new InetSocketAddress(address, Integer.parseInt(tempProxy[1]));
        return new Proxy(Proxy.Type.HTTP, socketAddress);
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
        params = (params == null) ? new LinkedMultiValueMap<>() : params;

        final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        builder.queryParams(params);

        headers = getHeadersForRequest(headers);

        try {
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            requestFactory.setConnectTimeout(connectTimeout);
            requestFactory.setReadTimeout(readTimeout);

            if(proxy != null){
                requestFactory.setProxy(getProxy(proxy));
            }

            RestTemplate appRestClient = new RestTemplate(new BufferingClientHttpRequestFactory(requestFactory));
            HttpEntity<Object> httpEntity = new HttpEntity<>(requestBody, headers);

            return appRestClient.exchange(builder.toUriString(), method, httpEntity, responseType);
        } catch (Exception e){
            log.error("Unable to send request.", e);
        }
        return null;
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
