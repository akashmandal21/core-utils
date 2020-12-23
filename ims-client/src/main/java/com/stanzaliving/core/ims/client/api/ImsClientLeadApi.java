package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.LeadDto;
import com.stanzaliving.core.ims.client.dto.responseDto.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Objects;

import static com.stanzaliving.core.base.constants.SecurityConstants.VENTA_TOKEN_PREFIX;
import static com.stanzaliving.core.ims.client.constants.ImsConstants.*;

/**
 * @author harman
 */
public class ImsClientLeadApi {

    private final StanzaRestClient restClient;

    public ImsClientLeadApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    //    <----------------------------------------createLead--------------------------------------->

    public LeadResponseDto createLead(String token, LeadDto leadDto, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(CREATE_LEAD).toUriString();

        return createLead(path, token, leadDto, brokerMobile);
    }

    private LeadResponseDto createLead(String path, String token, LeadDto leadDto, String brokerMobile) {

        if (Objects.isNull(leadDto) || StringUtils.isEmpty(brokerMobile)) {
            throw new IllegalArgumentException("Request is null for adding user or Broker Mobile missing");
        }

        Object postBody = leadDto;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile", brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token);

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<LeadResponseDto> returnType = new ParameterizedTypeReference<LeadResponseDto>() {
        };

        LeadResponseDto response = restClient.invokeAPIAndSetToken(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType,null);
        if (!response.isStatus()) {
            throw new StanzaException(response.getMessage());
        }
        return response;
    }

    //    <----------------------------------------getLeadDetails--------------------------------------->

    public BrokerLeadsStatusResponseDto getLeadDetails(String token, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(LEAD_DETAILS).toUriString();

        return getLeadDetails(path, token, brokerMobile);
    }

    private BrokerLeadsStatusResponseDto getLeadDetails(String path, String token, String brokerMobile) {

        if (org.apache.commons.lang3.StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the Params");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile", brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token);

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerLeadsStatusResponseDto> returnType = new ParameterizedTypeReference<BrokerLeadsStatusResponseDto>() {
        };

        return restClient.invokeAPIAndSetToken(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType,null);
    }

    //    <----------------------------------------searchLead--------------------------------------->

    public BrokerLeadsDetailsResonseDto searchLead(String token, String brokerMobile, String searchTerm, String status, int start, int size) {
        String path = UriComponentsBuilder.fromPath(SEARCH_LEAD).toUriString();

        return searchLead(path, token, brokerMobile, searchTerm, status, start, size);
    }

    private BrokerLeadsDetailsResonseDto searchLead(String path, String token, String brokerMobile, String searchTerm, String status, int start, int size) {

        if (org.apache.commons.lang3.StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the Params");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile", brokerMobile);
        queryParams.add("searchTerm", searchTerm);
        queryParams.add("status", status);
        queryParams.add("start", String.valueOf(start));
        queryParams.add("size", String.valueOf(size));


        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token);

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerLeadsDetailsResonseDto> returnType = new ParameterizedTypeReference<BrokerLeadsDetailsResonseDto>() {
        };

        return restClient.invokeAPIAndSetToken(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType,null);
    }


    //    <----------------------------------------getCityAndLocality--------------------------------------->

    public List<CityResponseDto> getCityAndLocality(String token) {
        String path = UriComponentsBuilder.fromPath(CITY_AND_LOCALITY_DETAILS).toUriString();

        return getCityAndLocality(path, token);
    }

    private List<CityResponseDto> getCityAndLocality(String path, String token) {

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token);

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<CityResponseDto>> returnType = new ParameterizedTypeReference<List<CityResponseDto>>() {
        };

        return restClient.invokeAPIAndSetToken(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType,null);
    }

}
