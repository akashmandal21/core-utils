package com.stanzaliving.core.payment.client.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.client.dto.LeadPaymentRequestDto;
import com.stanzaliving.core.payment.client.dto.LeadPaymentResponseDto;
import com.stanzaliving.core.payment.dto.*;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import com.stanzaliving.core.payment.enums.ReferenceType;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import com.stanzaliving.paymentService.dto.PaymentEntityDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
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
import java.util.Objects;

@Log4j2
public class TransactionControllerApi {

    private StanzaRestClient restClient;

    public TransactionControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<TransactionInitiateDto> initiateRazorpayTransaction(StanzaPaymentService stanzaPaymentService, String userId, String transactionId, Double amount) {

        if (Objects.isNull(stanzaPaymentService) || StringUtils.isBlank(transactionId) || StringUtils.isBlank(userId) || Objects.isNull(amount)) {
            throw new IllegalArgumentException("Missing mandatory parameters for transaction");
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/transaction/razorpay/initiate").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("service", stanzaPaymentService.toString());
        queryParams.add("userId", userId);
        queryParams.add("transactionId", transactionId);
        queryParams.add("amount", String.valueOf(amount));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<TransactionInitiateDto>> returnType = new TypeReference<ResponseDto<TransactionInitiateDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<TransactionInitiateDto> initiateTransactionByPaymentMode(PaymentTransactionRequestDto paymentTransactionRequestDto) {

        if (Objects.isNull(paymentTransactionRequestDto)) {
            throw new IllegalArgumentException("Required payload is missing");
        }

        Object postBody = paymentTransactionRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/transaction/initiate/by/paymentmode").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<TransactionInitiateDto>> returnType = new TypeReference<ResponseDto<TransactionInitiateDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<TransactionInitiateDto> initiateByPaymentMode(StanzaPaymentService stanzaPaymentService, String userId, String transactionId, Double amount, PaymentMode paymentMode) {

        if (Objects.isNull(stanzaPaymentService) || Objects.isNull(paymentMode) || StringUtils.isBlank(transactionId) || StringUtils.isBlank(userId) || Objects.isNull(amount)) {
            throw new IllegalArgumentException("Missing mandatory parameters for transaction");
        }

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/transaction/initiate/by/paymentmode").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("service", stanzaPaymentService.toString());
        queryParams.add("userId", userId);
        queryParams.add("transactionId", transactionId);
        queryParams.add("amount", String.valueOf(amount));
        queryParams.add("paymentMode", paymentMode.toString());

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<TransactionInitiateDto>> returnType = new TypeReference<ResponseDto<TransactionInitiateDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<PaymentDto> checkTransactionStatusInDb(String paymentId) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("paymentId", paymentId);

        String path = UriComponentsBuilder.fromPath("/internal/check/status/paymentId/{paymentId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PaymentDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payment Status {} ", paymentId);
        }
        return null;

    }

    public List<TransactionDto> getTransactionDetails(String referenceId, PaymentStatus paymentStatus, ReferenceType referenceType) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("referenceType", referenceType);
        uriVariables.put("referenceId", referenceId);
        String path = UriComponentsBuilder.fromPath("/internal/get/payment/{referenceType}/{referenceId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("paymentStatus", paymentStatus.toString());

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<TransactionDto>> returnType = new ParameterizedTypeReference<List<TransactionDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payment transaction by {} is  {} ", referenceType, referenceId);
        }
        return null;

    }

    public List<TransactionDto> getAllTransactionDetails(String referenceId, List<PaymentStatus> paymentStatus, ReferenceType referenceType) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("referenceType", referenceType);
        uriVariables.put("referenceId", referenceId);
        String path = UriComponentsBuilder.fromPath("/internal/get/payment/{referenceType}/{referenceId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        for (PaymentStatus status : paymentStatus) {
            queryParams.add("paymentStatus", status.toString());
        }

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<TransactionDto>> returnType = new ParameterizedTypeReference<List<TransactionDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payment transaction by {} is  {} ", referenceType, referenceId);
        }
        return null;

    }

    public ResponseDto<TransactionDto> getPaymentDetailsByBookingUUid(String referenceId) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("referenceId", referenceId);

        String path = UriComponentsBuilder.fromPath("/internal/payment/{referenceId}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<TransactionDto>> returnType = new ParameterizedTypeReference<ResponseDto<TransactionDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payment Status {} ", referenceId);
        }
        return null;

    }

    public ResponseDto<TransactionDto> deletePayment(String booking, PaymentMode paymentMode, PaymentStatus paymentStatus,
                                                     Double amount) {

        log.info("Called api to delete Payment for booking {}", booking);
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/payment/").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("bookingUuid", booking);
        queryParams.add("paymentMode", String.valueOf(paymentMode));
        queryParams.add("paymentStatus", String.valueOf(paymentStatus));
        queryParams.add("amount", String.valueOf(amount));


        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        TypeReference<ResponseDto<TransactionDto>> returnType = new TypeReference<ResponseDto<TransactionDto>>() {
        };
        ResponseDto<TransactionDto> responseDto;
        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, accept,
                    returnType);
            return responseDto;

        } catch (Exception e) {
            log.error("Exception while deleting Payment with bookingId {}", booking);
        }
        return null;
    }

    public ResponseDto<String> startPaymentReconciliation() {
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        //payment/reconciliation/virtual-account
        String path = UriComponentsBuilder.fromPath("/internal/payment/reconciliation/virtual-account")
                .buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while startPaymentReconciliation. Error is {}", e);
        }
        return null;
    }

    public List<LeadPaymentResponseDto> updatePrebookingtransactionDetails(LeadPaymentRequestDto leadPaymentRequestDto) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/prebooking/payment/v2").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        postBody = leadPaymentRequestDto;
        ParameterizedTypeReference<List<LeadPaymentResponseDto>> returnType = new ParameterizedTypeReference<List<LeadPaymentResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<LeadPaymentResponseDto> updateOnlyPrebookingtransactionDetails(LeadPaymentRequestDto leadPaymentRequestDto) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/prebooking/payment/v2/update").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        postBody = leadPaymentRequestDto;
        ParameterizedTypeReference<List<LeadPaymentResponseDto>> returnType = new ParameterizedTypeReference<List<LeadPaymentResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<LeadPaymentResponseDto> getPrebookingtransactionDetails(String leadUuid) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("leadUuid", leadUuid);

        String path = UriComponentsBuilder.fromPath("/internal/prebooking/payment/{leadUuid}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<LeadPaymentResponseDto>> returnType = new ParameterizedTypeReference<List<LeadPaymentResponseDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching payment Status {} ", leadUuid);
        }
        return null;

    }

    public ResponseDto<PaymentLinkResponseDto> getPaymentLink(PaymentLinkRequestDto paymentLinkRequestDto) {
        log.info("Called api to get payment link");
        Object postBody = paymentLinkRequestDto;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/transaction/razorpay/initiate/paymentLink").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        TypeReference<ResponseDto<PaymentLinkResponseDto>> returnType = new TypeReference<ResponseDto<PaymentLinkResponseDto>>() {
        };
        ResponseDto<PaymentLinkResponseDto> responseDto;

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept,
                    returnType);
            return responseDto;

        } catch (Exception e) {
            log.error("Exception while fetching Payment Link");
        }
        return null;
    }


    public ResponseDto<String> initiateAutoPrebookingRefund(PaymentEntityDto paymentEntityDto) {

        log.info("Called api to initiate auto prebooking refund");
        Object postBody = paymentEntityDto;
        String path = UriComponentsBuilder.fromPath("/internal/initiate/auto-prebook-refund").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {
        };
        ResponseDto<String> responseDto;
        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept,
                    returnType);
            return responseDto;

        } catch (Exception e) {
            log.error("Exception while intitating auto prebooking refund");
        }
        return null;
    }

    public List<LeadPaymentResponseDto> getAllPrebookingtransactionDetails(LeadPaymentRequestDto leadPaymentRequestDto) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/prebooking/payment/v3").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        postBody = leadPaymentRequestDto;
        ParameterizedTypeReference<List<LeadPaymentResponseDto>> returnType = new ParameterizedTypeReference<List<LeadPaymentResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<List<PaymentEntityDto>> getAutoRefundEligiblePrebookings() {
        log.info("Get all auto prebooking refund eligible leads");
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/get/all/auto-refund-eligible-prebooking")
                .buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<PaymentEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentEntityDto>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetch auto refund eligible prebookings. Error is {}", e);
        }
        return null;
    }

    public boolean unmapLeadTransaction(LeadPaymentRequestDto leadPaymentRequestDto) {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/unmap-lead-transaction").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        postBody = leadPaymentRequestDto;
        ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public Long getRefundBalanceResponseFromRazorpayX() {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/payment/razorpayX/available-amount-for-refund")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = {"*/*"};
        List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception while fetching razorPayX details  {} ", e.getMessage());
        }
        return null;
    }

    public ResponseDto<Boolean> validatePrebookedLead(String leadPhone, String leadUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/validate/prebooked/lead").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("leadPhone", leadPhone);
        queryParams.add("leadUuid", leadUuid);
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        TypeReference<ResponseDto<Boolean>> returnType = new TypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }



    public ResponseDto<String> refundRemoteBookingAmount(String bookingUuid) {

        log.info("Called api to refund remote booking amount for bookingUuid: {}", bookingUuid);
        Object postBody = null;
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/remote-booking-refund/{bookingUuid}/bookingUuid").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {
        };
        ResponseDto<String> responseDto;
        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept,
                    returnType);
            return responseDto;

        } catch (Exception e) {
            log.error("Exception while refund of remote booking for bookingUuid : {}, error is {}", bookingUuid, e.getMessage(), e);
        }
        return null;
    }

}