package com.stanzaliving.core.venta_aggregation_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ventaaggregationservice.dto.*;
import com.stanzaliving.core.venta_aggregation_client.config.RestResponsePage;
import com.stanzaliving.ledger.dto.LedgerBalanceDTO;
import com.stanzaliving.ledger.dto.LedgerResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class LedgerServiceApi {


    private StanzaRestClient restClient;

    public LedgerServiceApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    /**
     * This method is used to fetch ResidenceLedger Data from ledger-Service
     *
     * @param referenceId->Unique ID corresponding to residence
     * @return Aggregated Residence Ledger data on aggregation service
     */
    public ResponseDto<LedgerResponseDTO> getLedgerInformation(String referenceId, String referenceType) {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger/all")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);
        queryParams.add("referenceType", referenceType);

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<LedgerResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<LedgerResponseDTO>>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching ledger information based on referenceId {}, Exception is ", e);
        }
        return null;
    }


    public ResponseDto<LedgerBalanceDTO> getLedgerBalance(String referenceId, String referenceType) {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger/all/balance")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);
        queryParams.add("referenceType", referenceType);

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<LedgerBalanceDTO>> returnType = new ParameterizedTypeReference<ResponseDto<LedgerBalanceDTO>>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching ledger information based on referenceId {}, Exception is ", e);
        }
        return null;
    }
}
