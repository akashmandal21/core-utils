package com.stanzaliving.core.erpinvoice.client;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.invoice.dto.ErpInvoiceUpdateDto;
import com.stanzaliving.grn.GrnQuantity;
import com.stanzaliving.invoice.dto.InvoiceCsvResponseDto;
import com.stanzaliving.invoice.dto.InvoiceMaxApprovalLevelDto;
import com.stanzaliving.po.enums.PoType;
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
public class ErpInvoiceClient {

    private StanzaRestClient restClient;

    public ErpInvoiceClient(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<ErpInvoiceUpdateDto> getInvoiceStatus(String poUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("poUuid",poUuid);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/get/invoicesStatus/{poUuid}").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<ErpInvoiceUpdateDto>> returnType = new ParameterizedTypeReference<ResponseDto<ErpInvoiceUpdateDto>>() {};

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, String>> getInvoiceCopyByInvoiceNumbers(List<String> invoiceNumbers) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/get/invoice/copy").toUriString();

        ParameterizedTypeReference<ResponseDto<Map<String, String>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, String>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, invoiceNumbers, headerParams, accept, returnType);
    }

    public ResponseDto<Map<String, Integer>> getMaxRejectionCountForInstallableItems(String po_to_uuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("po_uuid",po_to_uuid);
        uriVariables.put("property","maxRejection");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/po/{po_uuid}/invoice/items/{property}/get").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<Map<String, Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Integer>>>() {};

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<InvoiceMaxApprovalLevelDto> getMaxApprovalLevelForDepartment(Department department) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("department", department);

        String path = UriComponentsBuilder.fromPath("/internal/get/max-approval-level-for-department/{department}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<InvoiceMaxApprovalLevelDto>> returnType = new ParameterizedTypeReference<ResponseDto<InvoiceMaxApprovalLevelDto>>() {
        };
        try {
            log.info("Executing Api for getting invoice Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching invoice information based on referenceId {}, Exception is {}", department, e);
        }
        return null;
    }

    public ResponseDto<List<InvoiceCsvResponseDto>> getInvoiceCsvData(List<String> poUuids) {

        final Map<String, Object> uriVariables = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        String path = UriComponentsBuilder.fromPath("/internal/get/invoice/csv/data").buildAndExpand(uriVariables).toUriString();

        ParameterizedTypeReference<ResponseDto<List<InvoiceCsvResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<InvoiceCsvResponseDto>>>() {};

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, poUuids, headerParams, accept, returnType);
    }
}

