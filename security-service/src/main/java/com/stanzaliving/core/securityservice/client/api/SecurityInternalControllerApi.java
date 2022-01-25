package com.stanzaliving.core.securityservice.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.security.dto.ResidentActivityDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

@Log4j2
public class SecurityInternalControllerApi {
    private StanzaRestClient restClient;

    public SecurityInternalControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
    public List<ResidentActivityDTO> getAllResidentActivities(String residentId) {

        log.info("Security-Service-Internal-Controller::Processing to retrieve recent activity for resident Id {}", residentId);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/{residentId}/resident-activities")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();


        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidentActivityDTO>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ResidentActivityDTO>>>() {};

        try {
            ResponseDto<List<ResidentActivityDTO>> responseDto = this.restClient.invokeAPI(path, HttpMethod.GET
                    , queryParams, null, headerParams, accept, returnType);

            if(Objects.nonNull(responseDto) && responseDto.isStatus()){
                return responseDto.getData();
            }

        }
        catch (Exception exception){
            log.info("Error in fetching recent activity for user with resident id {}, exception {}", residentId, exception);
        }
        return new ArrayList<>();
    }

}
