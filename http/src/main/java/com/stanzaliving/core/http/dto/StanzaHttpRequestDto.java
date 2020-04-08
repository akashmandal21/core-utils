package com.stanzaliving.core.http.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;

/**
 * @author piyush srivastava
 *
 * @date 06-Apr-2020
 *
 */



@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StanzaHttpRequestDto {
    private int connectTimeout = 10000;

    private int readTimeout = 30000;

    private HttpMethod method;

    private String url;

    private HttpHeaders headers;

    private MultiValueMap<String, String> queryParams;

    private Object requestBody;

    private String proxy;

}
