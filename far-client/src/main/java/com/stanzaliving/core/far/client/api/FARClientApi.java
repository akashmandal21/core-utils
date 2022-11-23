package com.stanzaliving.core.far.client.api;

import com.stanzaliving.core.far.dto.BlockGrnRequestDto;
import com.stanzaliving.core.far.dto.request.GrnMigrationDataUpdateDto;
import com.stanzaliving.core.far.dto.response.BlockGrnResponseDto;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import com.stanzaliving.core.grsi.dto.GrsiEventUpdateDto;
import org.apache.commons.collections.CollectionUtils;

@Log4j2
public class FARClientApi {

    private StanzaRestClient restClient;

    public FARClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<BlockGrnResponseDto> isGSRIAllowed(BlockGrnRequestDto blockGrnRequestDto) {

        log.info("HTTP client call to check grn allowed or not for request: {}", blockGrnRequestDto);

        if (Objects.isNull(blockGrnRequestDto))
            return null;

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BlockGrnResponseDto>> vddReturnType = new ParameterizedTypeReference<ResponseDto<BlockGrnResponseDto>>() {
        };

        String path = UriComponentsBuilder.fromPath("/transfer/block-grn-check").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, blockGrnRequestDto, headerParams, accept, vddReturnType);

    }

    public ResponseDto<List<GrsiEventUpdateDto>> migrateGrnDataFromGrnServiceToFarService(GrnMigrationDataUpdateDto grnMigrationDataUpdateDto) {

        log.info("HTTP client call to migrate grn data from GRN service to FAR service: {}", grnMigrationDataUpdateDto);

        if (Objects.isNull(grnMigrationDataUpdateDto))
            return null;

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        postBody = grnMigrationDataUpdateDto;
        		
        ParameterizedTypeReference<ResponseDto<List<GrsiEventUpdateDto>>> vddReturnType = new ParameterizedTypeReference<ResponseDto<List<GrsiEventUpdateDto>>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/far/grn/data/receive").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, vddReturnType);

    }
}