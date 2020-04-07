package com.stanzaliving.core.base.http;

import com.sun.deploy.net.proxy.ProxyConfigException;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.remoting.RemoteProxyFailureException;
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


    private Proxy getProxy(String hostname, int port) throws UnknownHostException {
        if (hostname == null) return null;
        InetAddress address = InetAddress.getByName(hostname);
        SocketAddress socketAddress = new InetSocketAddress(address, 1331);
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
                String[] tempProxy = proxy.split(":");
                if(tempProxy.length < 2){
                    throw new ProxyConfigException("Invalid proxy details");
                }
                requestFactory.setProxy(getProxy(tempProxy[0], Integer.parseInt(tempProxy[1])));
            }



            RestTemplate appRestClient = new RestTemplate(new BufferingClientHttpRequestFactory(requestFactory));
            HttpEntity<Object> httpEntity = new HttpEntity<>(requestBody, headers);

            return appRestClient.exchange(url, method, httpEntity, responseType);
        } catch (Exception e){
            log.error("Unable to send request.", e);
        }
        return null;
    }



    private <T> ResponseEntity<T> doRequest(
            HttpMethod method,
            String url,
            MultiValueMap<String, String> params,
            Object requestBody,
            HttpHeaders headers,
            Class<T> responseType
    ){
        return doRequest(url, method, params, requestBody, headers, responseType, 5000, 30000, null);
    }



    public <T> ResponseEntity<T> get(String url, Class<T> responseType){
        return doRequest(HttpMethod.GET, url, null, null, null, responseType);
    }

    public <T> ResponseEntity<T> get(String url, MultiValueMap<String, String> queryParams, Class<T> responseType){
        return doRequest(HttpMethod.GET, url, queryParams, null, null, responseType);
    }

    public <T> ResponseEntity<T> get(String url, MultiValueMap<String, String> queryParams, HttpHeaders headers, Class<T> responseType){
        return doRequest(HttpMethod.GET, url, queryParams, null, headers, responseType);
    }

    public <T> ResponseEntity<T> post(String url, Class<T> responseType){
        return doRequest(HttpMethod.POST, url, null, null, null, responseType);
    }

    public <T> ResponseEntity<T> post(String url, MultiValueMap<String, String> queryParams, Class<T> responseType){
        return doRequest(HttpMethod.POST, url, queryParams, null, null, responseType);
    }

    public <T> ResponseEntity<T> post(String url, MultiValueMap<String, String> queryParams, Object requestBody, Class<T> responseType){
        return doRequest(HttpMethod.POST, url, queryParams, requestBody, null, responseType);
    }

    public <T> ResponseEntity<T> post(String url, MultiValueMap<String, String> queryParams, Object requestBody, HttpHeaders headers, Class<T> responseType){
        return doRequest(HttpMethod.POST, url, queryParams, requestBody, headers, responseType);
    }

    public <T> ResponseEntity<T> request(HttpMethod method, String url, Class<T> responseType){
        return doRequest(method, url, null, null, null, responseType);
    }

    public <T> ResponseEntity<T> request(HttpMethod method, String url, MultiValueMap<String, String> queryParams, Class<T> responseType){
        return doRequest(method, url, queryParams, null, null, responseType);
    }

    public <T> ResponseEntity<T> request(HttpMethod method, String url, MultiValueMap<String, String> queryParams, Object requestBody, Class<T> responseType){
        return doRequest(method, url, queryParams, requestBody, null, responseType);
    }

    public <T> ResponseEntity<T> request(HttpMethod method, String url, MultiValueMap<String, String> queryParams, Object requestBody, HttpHeaders headers, Class<T> responseType){
        return doRequest(method, url, queryParams, requestBody, headers, responseType);
    }

}
