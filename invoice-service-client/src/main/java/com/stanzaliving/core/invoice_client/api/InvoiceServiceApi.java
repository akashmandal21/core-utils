package com.stanzaliving.core.invoice_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.invoice.dto.InvoiceMaxApprovalLevelDto;
import com.stanzaliving.ventaInvoice.dto.DocumentResponseDto;
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
    public ResponseDto<List<DocumentResponseDto>> getARInvoiceDetailsBasedOnBookingUuid(Date fromDate,String bookingUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/advance-rental-invoices/{bookingUuid}")
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
            log.error("error while fetching the AR invoice details for booking uuid{}", bookingUuid,e);
            return null;
        }
    }

    public ResponseDto<String> saveDeptApprovalConfigForNewDept(Department newDepartment, Department refDepartment) {

        log.info("HTTP Client call to save DeptApprovalConfigForNewDept details for new dept: {} refDept: {}" , newDepartment,refDepartment);

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("newDepartment",newDepartment);
        uriVariables.put("refDepartment",refDepartment);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<String>> vddReturnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        String path = UriComponentsBuilder.fromPath("internal/save/deptApprovalConfig/{newDepartment}/{refDepartment}").buildAndExpand(uriVariables).toUriString();

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, vddReturnType);

    }

}
