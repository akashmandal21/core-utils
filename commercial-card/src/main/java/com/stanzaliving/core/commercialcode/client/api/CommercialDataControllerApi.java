package com.stanzaliving.core.commercialcode.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commercialcode.dto.CommercialCardDto;
import com.stanzaliving.core.commercialcode.dto.CommercialCardListDto;
import lombok.extern.log4j.Log4j2;

import java.util.List;


@Log4j2
public class CommercialDataControllerApi {

    private StanzaRestClient restClient;

    public CommercialDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<CommercialCardListDto>> getAllCommercialCards(CommercialCardDto filterDto) {

//        log.info("Commercial-code-Data-Controller::Processing to get residence list for filter {}", residenceFilterRequestDto);

//        Object postBody = residenceFilterRequestDto;
//
//        System.out.println(postBody);
//
//        Map<String, Object> uriVariables = new HashMap();
//
//        String path = UriComponentsBuilder.fromPath("/residence/listing").buildAndExpand(uriVariables).toUriString();
//
//        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
//
//        HttpHeaders headerParams = new HttpHeaders();
//
//        String[] accepts = new String[]{"*/*"};
//
//        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
//
//        ParameterizedTypeReference<ResponseDto<Page<ResidenceAggregationEntity>>> returnType =
//                new ParameterizedTypeReference<ResponseDto<Page<ResidenceAggregationEntity>>>() {};
//
//        try {
//            System.out.println("---------------");
//            System.out.println(this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType));
//            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//            log.error("Exception while fetching");
//        }
        return null;
    }

}
