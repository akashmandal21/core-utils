package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.LeadDto;
import com.stanzaliving.core.ims.client.dto.responseDto.BaseResponseDto;
import com.stanzaliving.core.ims.client.dto.responseDto.BrokerLeadsDetailsResonseDto;
import com.stanzaliving.core.ims.client.dto.responseDto.CityResponseDto;
import com.stanzaliving.core.ims.client.dto.responseDto.BrokerLeadsStatusResponseDto;
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

    public BaseResponseDto createLead(String token, LeadDto leadDto, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(CREATE_LEAD).toUriString();

        return createLead(path, token, leadDto, brokerMobile);
    }

    private BaseResponseDto createLead(String path, String token, LeadDto leadDto, String brokerMobile) {

        if (Objects.isNull(leadDto) || StringUtils.isEmpty(brokerMobile)) {
            throw new IllegalArgumentException("Request is null for adding user or Broker Mobile missing");
        }

        Object postBody = leadDto;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BaseResponseDto> returnType = new ParameterizedTypeReference<BaseResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
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

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerLeadsStatusResponseDto> returnType = new ParameterizedTypeReference<BrokerLeadsStatusResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------searchLead--------------------------------------->

    public BrokerLeadsDetailsResonseDto searchLead(String token, String brokerMobile, String searchTerm, String status, int start , int size) {
        String path = UriComponentsBuilder.fromPath(SEARCH_LEAD).toUriString();

        return searchLead(path, token, brokerMobile,searchTerm,status,start,size);
    }

    private BrokerLeadsDetailsResonseDto searchLead(String path, String token, String brokerMobile, String searchTerm, String status, int start , int size) {

        if (org.apache.commons.lang3.StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the Params");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);
        queryParams.add("searchTerm",searchTerm);
        queryParams.add("status",status);
        queryParams.add("start", String.valueOf(start));
        queryParams.add("size", String.valueOf(size));


        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerLeadsDetailsResonseDto> returnType = new ParameterizedTypeReference<BrokerLeadsDetailsResonseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    //    <----------------------------------------getCityAndLocality--------------------------------------->

    public List<CityResponseDto> getCityAndLocality(String token) {
        String path = UriComponentsBuilder.fromPath(CITY_AND_LOCALITY_DETAILS).toUriString();

        return getCityAndLocality(path,token);
    }

    private List<CityResponseDto> getCityAndLocality(String path, String token) {

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<CityResponseDto>> returnType = new ParameterizedTypeReference<List<CityResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

}
