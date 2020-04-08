package com.stanzaliving.core.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.stanzaliving.core.serializer.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.serializer.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.serializer.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.serializer.localtime.Java8LocalTimeSerializer;
import com.sun.deploy.net.proxy.ProxyConfigException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.dto.StanzaHttpRequestDto;

import java.net.*;
import java.time.LocalDate;
import java.time.LocalTime;
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
//@UtilityClass
public class Request {

    private final RestTemplate appRestClient;

    public Request() {
        this.appRestClient = new RestTemplate();
//        appRestClient.setMessageConverters(Collections.singletonList(mappingJackson2HttpMessageConverter()));
        configureRestTemplate(appRestClient);
    }

    private MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = converter.getObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(new Java8LocalDateStdSerializer());
        module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());
        module.addSerializer(new Java8LocalTimeSerializer());
        module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.registerModule(module);
        return converter;
    }


    private void configureRestTemplate(RestTemplate template) {
        for (HttpMessageConverter converter : template.getMessageConverters()) {

            if (converter instanceof AbstractJackson2HttpMessageConverter) {
                ObjectMapper mapper = ((AbstractJackson2HttpMessageConverter) converter).getObjectMapper();

                SimpleModule module = new SimpleModule();
                module.addSerializer(new Java8LocalDateStdSerializer());
                module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());
                module.addSerializer(new Java8LocalTimeSerializer());
                module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
                mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
                mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
                mapper.registerModule(module);
            }
        }
    }




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
        ResponseEntity<T> responseEntity = null;
        try {
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            requestFactory.setConnectTimeout(connectTimeout);
            requestFactory.setReadTimeout(readTimeout);

            if(proxy != null){
                requestFactory.setProxy(getProxy(proxy));
            }

            appRestClient.setRequestFactory(new BufferingClientHttpRequestFactory(requestFactory));
            HttpEntity<Object> httpEntity = new HttpEntity<>(requestBody, headers);

            log.info("Accessing Api with method: "+ method + " and url: " + builder.toUriString());
            try{
                responseEntity = appRestClient.exchange(builder.toUriString(), method, httpEntity, responseType);
            } catch (HttpClientErrorException e){
                if(!e.getStatusCode().is2xxSuccessful()){
                    responseEntity = new ResponseEntity<T>(null , e.getResponseHeaders(), e.getStatusCode());
                }
                log.error("Error while making request to url: " + builder.toUriString(), e);
            }
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
