/**
 *
 */
package com.stanzaliving.core.paymentplan.client.api;

import com.stanzaliving.booking.SoldBookingDto;
import com.stanzaliving.booking.dto.request.*;
import com.stanzaliving.booking.dto.response.CommercialsDetailsResponseDTO;
import com.stanzaliving.booking.dto.response.ContractTerminationResponseDto;
import com.stanzaliving.booking.dto.response.PaymentPlanResponseDto;
import com.stanzaliving.booking.enums.PaymentPlanType;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.paymentPlan.dto.*;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CompletableFuture;

@Log4j2
public class PaymentPlanClientApi {

    private StanzaRestClient restClient;

    public PaymentPlanClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PaymentPlanResponseDto> createPaymentPlan(PaymentPlanRequestDto paymentPlanRequestDto) {

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
            if (Objects.nonNull(response)) {
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
            log.error("error while creating the vas for booking {} error is {}", vasPaymentPlanRequestDTO.getReferenceId(), e);
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

            log.info("raise credit/debit note for contract modification for referenceId {} old payment plan {} ", referenceId, oldPaymentPlan.toString());

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

            restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

    }

    public ResponseDto<List<PaymentPlan>> updatePaymentPlanAfterMoveOutDate(String referenceId, LocalDate moveOutDate, boolean savePaymentPlan, String token) {
        try {
//            if (StringUtils.isBlank(token)) {
//                throw new IllegalArgumentException("Token missing for updating payment plan");
//            }
            Object postBody = null;

            log.info("Request received to update payment plan after move out date for referenceId:{} for move-out-date:{}", referenceId, moveOutDate);

            final Map<String, Object> uriVariables = new HashMap<>();


            uriVariables.put("referenceId", referenceId);


            String path = UriComponentsBuilder.fromPath("/api/v1/exit-flow/get/{referenceId}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("move-out-date", String.valueOf(moveOutDate));
            queryParams.add("savePaymentPlan", String.valueOf(savePaymentPlan));

            HttpHeaders headerParams = new HttpHeaders();

            String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
            headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
            return null;
        }

    }


    public ResponseDto<Boolean> disablePaymentPlan(String referenceId, LocalDate moveOutDate, String token) {
        try {
            if (StringUtils.isBlank(token)) {
                throw new IllegalArgumentException("Token missing for updating payment plan");
            }
            Object postBody = null;

            log.info("Request received to disable payment plan after move out date for referenceId:{} for move-out-date:{}", referenceId, moveOutDate);

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/api/v1/disable").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("moveOutDate", String.valueOf(moveOutDate));
            queryParams.add("referenceId", String.valueOf(referenceId));

            HttpHeaders headerParams = new HttpHeaders();

            String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
            headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while disabling the paymentPlan {}", e);
            return null;
        }

    }

    public ResponseDto<Boolean> enablePaymentPlanForCancelOrModifyExit(String referenceId, String token) {
        try {

            Object postBody = null;

            log.info("request received to enable payment plan for reference Id {}", referenceId);

            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("referenceId", referenceId);


            String path = UriComponentsBuilder.fromPath("/api/v1/exit-flow/undo-split/{referenceId}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
            return null;
        }

    }

    public ResponseDto<List<PaymentPlan>> fetchPaymentPlan(String referenceId, String token) {
        try {

            Object postBody = null;

            log.info("Request received to fetch payment plan for referenceId:{} for move-out-date:{}", referenceId);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("referenceId", referenceId);


            String path = UriComponentsBuilder.fromPath("/api/v1/get/list/{referenceId}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
            headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
            return null;
        }

    }

    public ResponseDto<PaymentPlanAndLineItems> getPaymentPlanAndLineItems(String referenceId) {
        try {
            Object postBody = null;

            log.info("Request received to fetch payment plan and line items for referenceId:{}", referenceId);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("referenceId", referenceId);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/line-items/{referenceId}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<PaymentPlanAndLineItems>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanAndLineItems>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
            return null;
        }

    }

    public ResponseDto<PaymentPlanResponseDto> createContractExtensionPaymentPlan(ContractExtensionPaymentPlanRequestDTO paymentPlanRequestDto) {

        Object postBody = null;

        log.info("ContractExtensionPaymentPlanRequestDTO is {} ", paymentPlanRequestDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/contract-extension/create").buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<List<PaymentPlan>> createContractExtensionPaymentPlanList(PaymentPlanRequestDto paymentPlanRequestDto) {

        Object postBody = null;

        log.info("ContractExtensionPaymentPlanRequestDTO is {} ", paymentPlanRequestDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/contract-extension/create-list").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>>() {
        };
        postBody = paymentPlanRequestDto;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while creating the paymentPlan {}", e);
            return null;
        }

    }


    public ResponseDto<InvoiceGenerationResponseDto> createInvoiceForFutureDues(InvoiceGenerationRequestDto invoiceGenerationRequestDto) {

        Object postBody = null;

        log.info("Invoice_Generation_Request_DTO is {} ", invoiceGenerationRequestDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/create/invoice-for-future-dues").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<InvoiceGenerationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<InvoiceGenerationResponseDto>>() {
        };
        postBody = invoiceGenerationRequestDto;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while generating future invoices {}", e);
            return null;
        }

    }

    public ResponseDto<List<String>> getBookingForInvoicing(Date invoiceDate) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/eligible-for-invoice")
                .buildAndExpand(uriVariables).toUriString();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (invoiceDate != null) {
            queryParams.add("invoiceDate", date.format(invoiceDate));
        }
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching bookings for invoicing {}", e.getMessage());
            return null;
        }
    }

    public ResponseDto<String> optOutVasPaymentPlan(String referenceId, String vasUuid, Date optOutDate, PaymentPlanType paymentPlanType, boolean moveIn) {
        try {

            Object postBody = null;

            log.info("Request received for vas opt-out for  referenceId:{}", referenceId);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("referenceId", referenceId);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/vas/opt-out/{referenceId}").buildAndExpand(uriVariables)
                    .toUriString();

            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            if (optOutDate != null) {
                queryParams.add("optOutDate", date.format(optOutDate));
            }
            queryParams.add("vasUuid", vasUuid);
            queryParams.add("paymentPlanType", paymentPlanType.name());
            queryParams.add("moveIn", String.valueOf(moveIn));
            HttpHeaders headerParams = new HttpHeaders();
            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while opting out vas paymentPlan", e);
            return null;
        }

    }

    public ResponseDto<Boolean> disableAllPaymentPlan(String referenceId) {
        try {

            Object postBody = null;

            log.info("Request received to disable payment plan after move out date for referenceId:{} ", referenceId);

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/disable/all").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("referenceId", String.valueOf(referenceId));

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while disabling the paymentPlan {}", e);
            return null;
        }

    }


    public ResponseDto<String> mapInvoiceUuidToPaymentPlan(String bookingUuid) {
        try {

            Object postBody = null;

            log.info("Request received for update InvoiceUuid for bookingUuid:{}", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/set/invoice-uuid").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.add("bookingUuid", bookingUuid);

            HttpHeaders headerParams = new HttpHeaders();
            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("error while opting out vas paymentPlan", e);

            return null;
        }

    }

    public ResponseDto<Double> getSumOfPriceOfBookingWithinLockIn(@RequestBody Map<String, SoldBookingDto> refIdMap) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/matrix/sum-Of-booking-within-lockIn").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Double>> returnType = new ParameterizedTypeReference<ResponseDto<Double>>() {
        };
        postBody = refIdMap;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while generating future invoices {}", e);

            return null;
        }

    }

    public ResponseDto<Map<String, Double>> getActiveBookingMonthlyBreakUp(@RequestBody List<String> referenceIds) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/matrix/sum-Of-booking-within-lockIn").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, Double>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Double>>>() {
        };
        postBody = referenceIds;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while generating future invoices {}", e);
            return null;
        }

    }

    public ResponseDto<PaymentPlanResponseDto> adjustDiscount(PaymentPlanRequestDto paymentPlanRequestDto) {
        Object postBody = null;
        log.info("PaymentPlanRequestDto is {} ", paymentPlanRequestDto);
        Map<String, Object> uriVariables = new HashMap();
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/adjustDiscount").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
        };
        postBody = paymentPlanRequestDto;

        try {
            return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("error while adjusting the discount {}", var11);
            return null;
        }
    }


    public ResponseDto<PaymentPlanResponseDto> correctPaymentPlan(List<PaymentPlanCorrectionDto> paymentPlanCorrectionDtoList) {

        Object postBody = null;

        log.info("List of PaymentPlanCorrectionDto is {} ", paymentPlanCorrectionDtoList);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/correct/payment-plan").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
        };
        postBody = paymentPlanCorrectionDtoList;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while correcting the paymentPlan {}", e);
            return null;
        }

    }

    public ResponseDto<String> updatePaymentPlanForRevokingContractTermination(String bookingUuid, LocalDate contractTerminationDate, boolean savePaymentPlan) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);
            uriVariables.put("contractTerminationDate", contractTerminationDate);
            uriVariables.put("savePaymentPlan", savePaymentPlan);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/update/contract-termination/revoke/{bookingUuid}/{contractTerminationDate}/{savePaymentPlan}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while updating the paymentPlan while revoking contract termination", e);
        }

        return null;

    }

    public ResponseDto<ContractTerminationResponseDto> updatePaymentPlanForContractTermination(String bookingUuid, LocalDate contractTerminationDate, boolean savePaymentPlan) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);
            uriVariables.put("contractTerminationDate", contractTerminationDate);
            uriVariables.put("savePaymentPlan", savePaymentPlan);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/update/contract-termination/{bookingUuid}/{contractTerminationDate}/{savePaymentPlan}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<ContractTerminationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<ContractTerminationResponseDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while updating the paymentPlan while contract termination", e);
        }

        return null;

    }


    public ResponseDto<ContractTerminationResponseDto> updatePaymentPlanForExitDataCorrection(String bookingUuid, LocalDate chargedTillDate, boolean savePaymentPlan) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);
            uriVariables.put("chargedTillDate", chargedTillDate);
            uriVariables.put("savePaymentPlan", savePaymentPlan);

            String path = UriComponentsBuilder.fromPath("/internal/api/v1//update/exit-data-correction/{bookingUuid}/{chargedTillDate}/{savePaymentPlan}").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<ContractTerminationResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<ContractTerminationResponseDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while updating the paymentPlan while exit data correction", e);
        }

        return null;

    }

    public CompletableFuture<ResponseDto<Boolean>> createSubscriptionPaymentPlan(VasPaymentPlanRequestDTO vasPaymentPlanRequestDTO) {

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

            return CompletableFuture.completedFuture(restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType));
        } catch (Exception e) {
            log.error("error while creating the vas for booking {} error is {}", vasPaymentPlanRequestDTO.getReferenceId(), e);
        }

        return null;

    }

}