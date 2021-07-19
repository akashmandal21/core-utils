package com.stanzaliving.core.invoice_client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.ventaInvoice.dto.DocumentResponseDto;
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
public class InvoiceServiceApi {

    private StanzaRestClient restClient;

    public InvoiceServiceApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<List<DocumentResponseDto>> getInvoiceInformation(String referenceId,String token) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("referenceId", referenceId);

        String path = UriComponentsBuilder.fromPath("/api/v1/invoice-details/{referenceId}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        headerParams.add("Cookie", "token=" + token);
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


}
