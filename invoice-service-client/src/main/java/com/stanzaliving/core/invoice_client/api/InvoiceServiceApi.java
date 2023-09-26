package com.stanzaliving.core.invoice_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.ventaInvoice.dto.DocumentRequestDto;
import com.stanzaliving.ventaInvoice.dto.DocumentResponseDto;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class InvoiceServiceApi {

    private StanzaRestClient restClient;

    public InvoiceServiceApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<DocumentResponseDto>> getInvoiceInformation(String referenceId) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("referenceId", referenceId);

        String path = UriComponentsBuilder.fromPath("/internal/invoice-details/{referenceId}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>>() {
        };
        try {
            log.info("Executing Api for getting invoice Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching invoice information based on referenceId {}, Exception is {}", referenceId, e);
        }
        return null;
    }

    public void recreateCreditNote(String bookingUuid, String invoiceUuid, String currentUserToken) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        uriVariables.put("invoiceUuid", invoiceUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/v1/create-credit-note-manually/{bookingUuid}/{invoiceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        headerParams.add("Cookie", "token=" + currentUserToken);
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DocumentResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DocumentResponseDto>>() {
        };
        try {
            log.info("Executing Api for getting invoice Info with Url {}", path);
            this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching invoice information based on referenceId {}, Exception is {}", invoiceUuid, e);
        }
    }

    public void enableDisableInvoice(String invoiceUuid, Boolean status) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("invoiceUuid", invoiceUuid);
        uriVariables.put("status", status);

        String path = UriComponentsBuilder.fromPath("/internal/v1/enable-disable/{invoiceUuid}/{status}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api for getting invoice Info with Url {}", path);
            this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching invoice information based on referenceId {}, Exception is {}", invoiceUuid, e);
        }
    }

    public ResponseDto<List<DocumentResponseDto>> getARInvoice(Date fromDate) {
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/advance-rental-invoices")
                .buildAndExpand(uriVariables).toUriString();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("fromDate", date.format(fromDate));

        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the AR invoice details{}", e.getMessage());
            return null;
        }
    }

    public ResponseDto<String> downloadInvoiceByInvoiceIds(List<String> invoiceIds) {

        log.info("get Invoice Pdf form invoiceIds [" + invoiceIds + "]");

        Object postBody = invoiceIds;

        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/merge-pdf")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<DocumentResponseDto>> getARInvoiceDetailsBasedOnBookingUuid(LocalDate fromDate, String bookingUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/advance-rental-invoices/{bookingUuid}")
                .buildAndExpand(uriVariables).toUriString();
//        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("fromDate", fromDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the AR invoice details for booking uuid{}", bookingUuid, e);
            return null;
        }
    }

    public ResponseDto<String> getInvoicesByType(String referenceId, String invoiceType) {
        final Map<String, Object> uriVariables = new HashMap<>();
        log.info("fetching the  invoice details for booking uuid {}", referenceId);
        String path = UriComponentsBuilder.fromPath("/internal/invoice-details")
                .buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceId);
        queryParams.add("invoiceType", invoiceType);

        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the  invoice details for booking uuid{}", referenceId, e);
            return null;
        }
    }

    public ResponseDto<DocumentResponseDto> createInvoce(DocumentRequestDto documentRequestDto) {
        final Map<String, Object> uriVariables = new HashMap<>();
        log.info("sending request for invoices {}", documentRequestDto);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/invoice/create")
                .buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        log.info("sending documentRequestDto for invoices {}", ObjectMapperUtil.getString(documentRequestDto));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<DocumentResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DocumentResponseDto>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams,
                    documentRequestDto, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error in sending request for filix invoices {}", documentRequestDto, e);
            return null;
        }
    }


    public ResponseDto<String> createAndSendPacketForFilixInvoice(DocumentResponseDto documentResponseDto) {
        final Map<String, Object> uriVariables = new HashMap<>();
        log.info("sending request for filix invoices {}", documentResponseDto);
        String path = UriComponentsBuilder.fromPath("/internal/filix/invoice")
                .buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams,
                    documentResponseDto, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error in sending request for filix invoices {}", documentResponseDto, e);
            return null;
        }
    }

    public ResponseDto<String> createAndSendPacketForFilixCreditNote(DocumentResponseDto documentResponseDto, String invoiceUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        log.info("sending request for filix creditNote {}", documentResponseDto);
        String path = UriComponentsBuilder.fromPath("/internal/filix/credit-note")
                .buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("invoiceUuid", invoiceUuid);

        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams,
                    documentResponseDto, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error in sending request for filix creditNote {}", documentResponseDto, e);
            return null;
        }
    }

    public ResponseDto<String> saveDeptApprovalConfigForNewDept(Department newDepartment, Department refDepartment) {

        log.info("HTTP Client call to save DeptApprovalConfigForNewDept details for new dept: {} refDept: {}", newDepartment, refDepartment);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("newDepartment", newDepartment);
        uriVariables.put("refDepartment", refDepartment);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/save/deptApprovalConfig/{newDepartment}/{refDepartment}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, vddReturnType);

    }

    public ResponseDto<String> rollBack(Department newDepartment) {

        log.info("HTTP Client call to rollBack invoice details for new dept: {} ", newDepartment);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("newDepartment", newDepartment);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("/internal/roll-back/deptApprovalConfig/{newDepartment}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, vddReturnType);

    }

    public ResponseDto<List<DocumentResponseDto>> getCompleteInvoiceDetails(String referenceUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/invoice-complete-details").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceId", referenceUuid);
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DocumentResponseDto>>>() {
        };
        try {
            log.info("Executing Api for getting invoice details with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching invoice information based on referenceId {}, Exception is {}", referenceUuid, e);
        }
        return null;
    }

    public ResponseDto<Long> getInvoiceDetails(double amount,
                                               String remarks,
                                               String referenceUuid,
                                               String generationSource,
                                               String invoiceType,
                                               ReferenceType referenceType,
                                               String creditNoteCategory) {
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/invoices").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("referenceUuid", referenceUuid);
        queryParams.add("generationSource", generationSource);
        queryParams.add("invoiceType", invoiceType);
        queryParams.add("remarks", remarks);
        queryParams.add("amount", String.valueOf(amount));
        queryParams.add("referenceType", String.valueOf(referenceType));
        queryParams.add("creditNoteCategory", creditNoteCategory);


        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Long>> returnType = new ParameterizedTypeReference<ResponseDto<Long>>() {
        };
        try {
            log.info("Executing Api for getting invoice details with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching invoice information based on referenceId {}, Exception is {}", referenceUuid, e);
        }
        return null;
    }


    public ResponseDto<Boolean> deleteInvoiceByUuid(long id) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/internal/invoice/{id}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        try {
            log.info("Executing Api for deleting invoice  with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.DELETE, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while deleting invoice information based on id {}, Exception is {}", id, e);
        }
        return null;
    }
}
