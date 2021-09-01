/**
 *
 */
package com.stanzaliving.core.paymentplan.client.api;

import com.stanzaliving.booking.dto.request.PaymentPlanRequestDto;
import com.stanzaliving.booking.dto.request.VasPaymentPlanRequestDTO;
import com.stanzaliving.booking.dto.response.CommercialsDetailsResponseDTO;
import com.stanzaliving.booking.dto.response.PaymentPlanResponseDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.paymentPlan.dto.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

@Log4j2
public class PaymentPlanClientApi {

    private StanzaRestClient restClient;

    public PaymentPlanClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PaymentPlanResponseDto> createPaymentPlan(PaymentPlanRequestDto paymentPlanRequestDto
                                                                 ) {

        Object postBody = null;

        log.info("PaymentPlanRequestDto is {} ", paymentPlanRequestDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/create").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
        };
        postBody = paymentPlanRequestDto;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while creating the paymentPlan {}", e);
            return null;
        }

    }

    public ResponseDto<CommercialsDetailsResponseDTO> getCommercialDetails(String bookingId, Date fromDate) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingId", bookingId);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/commercials/get/{bookingId}")
                .buildAndExpand(uriVariables).toUriString();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (fromDate != null) {
            queryParams.add("fromDate", date.format(fromDate));
        }
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<CommercialsDetailsResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<CommercialsDetailsResponseDTO>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the monthly break up {}", e.getMessage());
            return null;
        }
    }

    public ResponseDto<PaymentPlanResponseDto> getPaymentPlan(String bookingUuid) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/{bookingUuid}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

        return null;

    }
    
    public List<PaymentPlan> getPaymentPlanList(String bookingUuid) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/list/{bookingUuid}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>>() {
            };

            ResponseDto<List<PaymentPlan>> response = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
            if(Objects.nonNull(response)) {
            	return response.getData();
            }
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

        return null;

    }


    public ResponseDto<PaymentPlanResponseDto> getPaymentPlan(String bookingUuid, String paymentTerm) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/{bookingUuid}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("paymentTerm", paymentTerm);
            
            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

        return null;

    }

    public ResponseDto<List<PaymentPlan>> getPaymentPlanForInvoiceGeneration(GetPaymentPlanRequestDto getPaymentPlanRequestDto) {

        try {
            Object postBody = getPaymentPlanRequestDto;

            log.info("get paymentPlan for booking Id's is {} ", getPaymentPlanRequestDto.getBookingUuid());

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/payment-plan-for-invoice").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan for invoice generation{}", e);
        }

        return null;

    }


    public ResponseDto<List<PaymentPlanLineItem>> getPaymentPlanLineItem(PaymentPlanLineItemRequestDto paymentPlanLineItemRequestDto) {

        try {
            Object postBody = paymentPlanLineItemRequestDto;

            log.info("get Payment Plan line item for PaymentPlan Id's {} ", paymentPlanLineItemRequestDto.getPaymentPlanIds());

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/payment-plan-line-item").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<PaymentPlanLineItem>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlanLineItem>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan for invoice generation{}", e);
        }

        return null;

    }
    
    public CompletableFuture<CommercialsDetailsResponseDTO> getCommercialDetailsByFuture(String bookingId, Date fromDate) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingId", bookingId);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/commercials/get/{bookingId}")
                .buildAndExpand(uriVariables).toUriString();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (fromDate != null) {
            queryParams.add("fromDate", date.format(fromDate));
        }
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<CommercialsDetailsResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<CommercialsDetailsResponseDTO>>() {
        };
        try {
            return CompletableFuture.completedFuture(restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType).getData());
        } catch (Exception e) {
            log.error("error while fetching the monthly break up {}", e.getMessage());
            return null;
        }
    }


    public ResponseDto<InvoiceGenerationResponseDto> createInvoiceFromPayment(InvoiceGenerationRequestDto invoiceGenerationRequestDto) {

        try {
            Object postBody = invoiceGenerationRequestDto;

            log.info("Creating invoice for booking id {} ", invoiceGenerationRequestDto.getBookingUuid());

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/invoice").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<InvoiceGenerationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<InvoiceGenerationResponseDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan for invoice generation{}", e);
        }

        return null;

    }



    public ResponseDto<String> savePaymentPlanAndLineItem(List<PaymentPlan> paymentPlans) {

        try {
            Object postBody = paymentPlans;

            log.info("Saving payment plan");

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/save").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan for invoice generation{}", e);
        }

        return null;

    }


    public ResponseDto<Boolean> createOrUpdateVasServices(VasPaymentPlanRequestDTO vasPaymentPlanRequestDTO) {

        try {
            Object postBody = vasPaymentPlanRequestDTO;

            log.info("Creating vas for booking id {} ", vasPaymentPlanRequestDTO.getReferenceId());

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/create/vas").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while creating the vas for booking {} error is {}",vasPaymentPlanRequestDTO.getReferenceId(), e);
        }

        return null;

    }
    
    public CompletableFuture<ResponseDto<PaymentPlanResponseDto>> getPaymentPlanByFuture(String bookingUuid, String paymentTerm) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/{bookingUuid}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("paymentTerm", paymentTerm);

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
            };

            return CompletableFuture.completedFuture(restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType));
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

        return null;

    }

	public void raiseCreditOrDebitNoteForModifyContract(String referenceId, List<PaymentPlan> oldPaymentPlan) {
		try {
            Object postBody = oldPaymentPlan;

            log.info("raise credit/debit note for contract modification for referenceId {} old payment plan {} ", referenceId, oldPaymentPlan);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("referenceId", referenceId);


            String path = UriComponentsBuilder.fromPath("/internal/api/v1/adjustRentalFee/{referenceId}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto> returnType = new ParameterizedTypeReference<ResponseDto>() {
            };

            restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

	}

}