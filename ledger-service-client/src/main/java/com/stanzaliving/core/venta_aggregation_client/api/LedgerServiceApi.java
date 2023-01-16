package com.stanzaliving.core.venta_aggregation_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.ApiValidationException;
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

    public ResponseDto<AllLedgerResponseDTO> getAllLedgerInformation(String referenceId) {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger/all-ledger-balance")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);

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

    public ResponseDto<List<RefundDetailsResponseDto>> getRefundApprovalStatus() {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/current-date/refund-approval-status")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<RefundDetailsResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<RefundDetailsResponseDto>>>() {
        };
        try {
            log.info("Executing Api for getting current date rejected refunds with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while getting current date rejected refunds, Exception is ", e);
        }
        return null;
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

    public void processRefundStatusCheck() {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/processRefundStatusCheck")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception e) {

            log.error("Error while processing refund status check", e);

            throw new ApiValidationException("Some error occurred. Please try again after some time.");
        }

    }

    public ResponseDto<LedgerResponseDTO> getLedgers(String referenceId, String referenceType, String ledgerType) {
        log.info("Reference id {}, reference type {}, ledger type {}", referenceId, referenceType, ledgerType);
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/ledger")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);
        queryParams.add("referenceType", referenceType);
        queryParams.add("ledgerType", ledgerType);

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<LedgerResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<LedgerResponseDTO>>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching ledger information based on referenceId {}, Exception is ", referenceId, e);
        }
        return null;
    }

    public ResponseDto<String> sendFilixCarryForwardPacketsForBookingUuid(String bookingUuid) {
        log.info("sending request for filix carry forward for bookingUuid{}", bookingUuid);
        log.info("bookingUuid {}", bookingUuid);
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/filix/carry-forward")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("bookingUuid", bookingUuid);


        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception for bookingUuid {}, Exception is ", bookingUuid, e);
        }
        return null;
    }

    public ResponseDto<String> sendFilixRefundPacketsForBookingUuid(String bookingUuid) {
        log.info("sending request for filix refund  for bookingUuid{}", bookingUuid);
        log.info("bookingUuid {}", bookingUuid);
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/filix/refund")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("bookingUuid", bookingUuid);


        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception for bookingUuid {}, Exception is ", bookingUuid, e);
        }
        return null;
    }

    public ResponseDto<String> sendFilixSecurityDepositPacketsForBookingUuid(String bookingUuid) {
        log.info("sending request for filix deposit  for bookingUuid{}", bookingUuid);
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/filix/security-deposit")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("bookingUuid", bookingUuid);
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception for bookingUuid {}, Exception is ", bookingUuid, e);
        }
        return null;
    }


    public void settleLedgerStatusMail() {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/mails/rejected-refunds")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<?>> returnType = new ParameterizedTypeReference<ResponseDto<?>>() {
        };

        try {
            restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            throw new ApiValidationException("Error while sending settle-ledger status mail. Exception is " + e.getMessage());
        }
    }

    public ResponseDto<RefundDetailsResponseDto> getRefundDetails(String referenceId) {
        log.info("Reference id {}", referenceId);
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/refundDetails")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);
        queryParams.add("bookingUuid", referenceId);

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


    public ResponseDto<Boolean> getBankDetails(String userUuid) {
        log.info("In getBankDetails for user {}", userUuid);
        Map<String, Object> uriVariables = new HashMap<>();
        ///internal/api/v1/refundAccountDetails/{userUUid}
        //https://erp.stanzaliving.com/ledger_service/internal/api/v1/refundAccountDetails/b12529a8-8213-4bf4-aaf3-a8e336d0d7e6
        uriVariables.put("userUUid", userUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/refundAccountDetails/{userUUid}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching refund details", e);
            return null;
        }
    }
    public ResponseDto<Boolean> sdAutoRefund(AutoRefundDto autoRefundDto) {
        Object postBody = autoRefundDto;
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/sdAutoRefund")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        try {
            log.info("Executing Api for Auto Refund {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while Auto Refund, Exception is ", e);
        }
        return null;
    }
}
