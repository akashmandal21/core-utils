package com.stanzaliving.core.approval.client.api;

import com.stanzaliving.approval.dto.ApprovalListingDto;
import com.stanzaliving.approval.dto.ApprovalResponseDto;
import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Log4j2
public class ApprovalClientApi {

    private StanzaRestClient restClient;

    public ApprovalClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<ApprovalListingDto> getApprovalListing(String entityUuid, ApprovalEntityType approvalEntityType) {
        ResponseDto<ApprovalListingDto> responseDto = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/getApprovalDto").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("entityUuid", entityUuid);
        queryParams.add("approvalEntityType", approvalEntityType.toString());

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ApprovalListingDto>> returnType = new ParameterizedTypeReference<ResponseDto<ApprovalListingDto>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching approval listing for entityUuid: {}", entityUuid, e);
        }

        return (Objects.nonNull(responseDto)) ? responseDto : null;
    }

    public Map<String, ApprovalListingDto> getApprovalData(ApprovalEntityType entityType, Collection<String> uuids) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/get/approval-data").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("entityType", entityType.toString());
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<ApprovalListingDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ApprovalListingDto>>>() {
        };

        try {
            ResponseDto<List<ApprovalListingDto>> responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, uuids, headerParams, accept, returnType);
            return Objects.isNull(responseDto) || CollectionUtils.isEmpty(responseDto.getData()) ? Collections.emptyMap() :
                    responseDto.getData().stream().collect(Collectors.toMap(ApprovalListingDto::getEntityUuid, Function.identity()));
        } catch (Exception e) {
            log.error("Error while fetching approval data for entity type {}", entityType);
            return Collections.emptyMap();
        }
    }

    public ApprovalListingDto getApprovalData(String entityUuid, ApprovalEntityType approvalEntityType) {
        ResponseDto<ApprovalListingDto> data = getApprovalListing(entityUuid, approvalEntityType);
        return data == null || data.getData() == null ? null : data.getData();
    }

    public List<ApprovalStatus> getAllowedStatusForEmail(String emailId, ApprovalEntityType entityType) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/dropdown/approval-status").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("email", emailId);
        queryParams.add("entityType", entityType.toString());
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<EnumListing<ApprovalStatus>>>> returnType = new ParameterizedTypeReference<ResponseDto<List<EnumListing<ApprovalStatus>>>>() {
        };

        try {
            ResponseDto<List<EnumListing<ApprovalStatus>>> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
            return Objects.isNull(responseDto) || CollectionUtils.isEmpty(responseDto.getData()) ? Collections.emptyList() :
                    responseDto.getData().stream().map(EnumListing::getKey).collect(Collectors.toList());
        } catch (Exception e) {
            log.error("Error while fetching approval status for email {}", emailId, e);
            return Collections.emptyList();
        }
    }

    public ResponseDto updateApprovalStatus(ApprovalResponseDto approvalResponseDto, String cookieToken) {
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/updateApprovalStatus").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add("Cookie", cookieToken);
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {};

        try

            {
                return restClient.invokeAPI(path, HttpMethod.POST, queryParams, approvalResponseDto, headerParams, accept, returnType);
            } catch(
            Exception e)

            {
                log.error("Error while updating approval status", e);
            return ResponseDto.failure("Unable to update approval status");
            }
    }
}
