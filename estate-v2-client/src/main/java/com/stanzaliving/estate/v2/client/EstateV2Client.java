package com.stanzaliving.estate.v2.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.estate.v2.dto.PropertyAnswer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EstateV2Client {

  private StanzaRestClient restClient;

  public EstateV2Client(StanzaRestClient stanzaRestClient) {
    this.restClient = stanzaRestClient;
  }

  public PropertyAnswer getBlendedPricePerBed(String propertyUuid) {

    final Map<String, Object> uriVariables = new HashMap<>();

    uriVariables.put("propertyAnswerVariable", "blendedPricePerBed");
    uriVariables.put("propertyUuid", propertyUuid);

    String path = UriComponentsBuilder.fromPath("/internal/property/{propertyUuid}/answer/{propertyAnswerVariable}").buildAndExpand(uriVariables).toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

    TypeReference<ResponseDto<PropertyAnswer>> returnType = new TypeReference<ResponseDto<PropertyAnswer>>() {
    };

    ResponseDto<PropertyAnswer> responseDto = null;

    try {

      responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

    } catch (Exception e) {

      log.error("Error while getting blendedPricePerBed", e);

    }

    return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

  }

  public String getATLUrl(String propertyUuid) {

    final Map<String, Object> uriVariables = new HashMap<>();
    uriVariables.put("propertyUuid", propertyUuid);
    String path = UriComponentsBuilder.fromPath("/internal/legal/property/{propertyUuid}").buildAndExpand(uriVariables).toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

    TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {
    };

    ResponseDto<String> responseDto = null;

    try {

      responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);

    } catch (Exception e) {

      log.error("Error while getting ATL url", e);

    }

    return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : "";

  }
}
