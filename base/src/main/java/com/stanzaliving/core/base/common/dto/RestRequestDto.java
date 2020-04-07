package com.stanzaliving.core.base.common.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RestRequestDto {
    private int connectTimeout;

    private int readTimeout;

    private HttpMethod method;

    private String url;

    private HttpHeaders headers;

    private MultiValueMap<String, String> queryParams;

    private Object requestBody;

    private String proxy;

}
