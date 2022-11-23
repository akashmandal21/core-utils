package com.stanzaliving.core.payment.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.VirtualAccountDto;
import com.stanzaliving.core.payment.dto.VirtualAccountMigratedDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.projectservice.dto.UserVirtualAccountDetailsDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class VirtualAccountControllerApi {

    private StanzaRestClient restClient;

    public VirtualAccountControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<UserVirtualAccountDetailsDto> getVirtualAccountDetails(String residentId){

        log.info("Called api to fetch virtual account details");
        Object postBody=null;
        final Map<String,Object> uriVariables=new HashMap<>();
        uriVariables.put("residentId",residentId);
        String path= UriComponentsBuilder.fromPath("/virtualAccount/{residentId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams=new HttpHeaders();
        final String[] accepts = { "*/*" };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<UserVirtualAccountDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserVirtualAccountDetailsDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching virtual account details with residentId",residentId);
        }
        return null;
    }

    public ResponseDto<UserVirtualAccountDetailsDto> createVirtualAccountForUser(VirtualAccountDto virtualAccountDto) {

        try {

            log.info("Creating Virtual Account for Resident with id:{}",virtualAccountDto.getResidentId());
            Object postBody = virtualAccountDto;

            final Map<String, Object> uriVariables = new HashMap<>();

            //https://payment.stanzaliving.com/paymentService/virtualAccount/create
            String path = UriComponentsBuilder.fromPath("/virtualAccount/create").buildAndExpand(uriVariables)
                    .toUriString();
            log.info("Creating Virtual Account for Resident path is {}", path);
            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<UserVirtualAccountDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserVirtualAccountDetailsDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error while creating virtual account for resident with id:{} with message",virtualAccountDto.getResidentId(), e);
        }

        return null;

    }

    public ResponseDto<UserVirtualAccountDetailsDto> saveMigratedVirtualAccount(VirtualAccountMigratedDto migratedDto) {

        try {

            log.info("Saving Migrated Virtual Account for Resident with id:{}",migratedDto.getStudentId());
            Object postBody = migratedDto;

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/virtualAccount/migrate").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<UserVirtualAccountDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserVirtualAccountDetailsDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while SAVING MIGRATED virtual account for resident with id:{} with message:{}",
                    migratedDto.getStudentId(), e.getMessage());
        }

        return null;

    }

    public ResponseDto<String> createVirtualAccountForContract(int contractId, String contractUuid,
                                                                               String organizationName) {

        try {

            log.info("Creating Virtual Account for Contract:{}",contractUuid);
            Object postBody = null;

            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("contractId",String.valueOf(contractId));
            uriVariables.put("contractUuid",contractUuid);
            uriVariables.put("organizationName",organizationName);

            String path = UriComponentsBuilder.fromPath("/virtualAccount/contract/VA/{contractId}/{contractUuid}/{organizationName}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while creating virtual account for Account for Contract:{}",contractUuid);
        }

        return null;

    }

}

