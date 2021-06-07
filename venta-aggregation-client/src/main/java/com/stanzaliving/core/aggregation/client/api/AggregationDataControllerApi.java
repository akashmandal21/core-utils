package com.stanzaliving.core.aggregation.client.api;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.venta_aggregation.ResidenceFilterRequestDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class AggregationDataControllerApi {

    private StanzaRestClient restClient;

    public AggregationDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<Page<ResidenceAggregationEntity>> getResidenceListing(
            ResidenceFilterRequestDto residenceFilterRequestDto) {

        log.info("Venta-Aggregation-Data-Controller::Processing to get residence list for filter {}", residenceFilterRequestDto);

        Object postBody = residenceFilterRequestDto;

        System.out.println(postBody);

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/residence/listing").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Page<ResidenceAggregationEntity>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Page<ResidenceAggregationEntity>>>() {};

        try {
            System.out.println("---------------");
            System.out.println(this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType));
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception ex) {
            System.out.println(ex);
            log.error("Exception while fetching");
        }
        return null;
    }

}
