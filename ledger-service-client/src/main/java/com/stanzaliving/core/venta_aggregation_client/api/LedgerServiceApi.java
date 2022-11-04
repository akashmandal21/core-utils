package com.stanzaliving.core.venta_aggregation_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.ledger.dto.*;
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
import java.util.Set;

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
    public ResponseDto<AllLedgerResponseDTO> getLedgerInformation(String referenceId, String referenceType) {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger/all")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);
        queryParams.add("referenceType", referenceType);

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<AllLedgerResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<AllLedgerResponseDTO>>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching ledger information based on referenceId {}, Exception is ", e);
        }
        return null;
    }

    public ResponseDto<List<HealthCheckCountDto>> ledgerHealthChecks() {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/api/v1/health-check")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<HealthCheckCountDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<HealthCheckCountDto>>>() {
        };
        try {
            log.info("Executing Api for health check with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while checking the health of ledgers, Exception is ", e);
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

    public ResponseDto<List<TotalLedgerBalanceDto>> getTotalLegerBalanceForReferenceIds(Set<String> referenceIds) {
        Object postBody = referenceIds;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger/get/totalBalance").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<TotalLedgerBalanceDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<TotalLedgerBalanceDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error(var11);
            log.error("Exception while Processing to get data for requested referenceIds");
            return null;
        }
    }

    public ResponseDto<String> createLedgerEntry(List<TransactionsDTO> transactionsDTO) {
        Object postBody = transactionsDTO;
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger/all")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api for creating ledger entry Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while creating ledger, Exception is ", e);
        }
        return null;
    }

    public ResponseDto<RefundDetailsResponseDto> getRefundDetails(String referenceId) {
        log.info("Reference id {}", referenceId);
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/refundDetails")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<RefundDetailsResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<RefundDetailsResponseDto>>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching ledger information based on referenceId {}, Exception is ", referenceId, e);
        }
        return null;
    }
}
