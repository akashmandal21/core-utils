package com.stanzaliving.core.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.BaseMarker;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.KycDocumentDTO;
import com.stanzaliving.core.dto.KycDocumentsResponseDTO;
import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import com.stanzaliving.kyc.KycDocumentsRequestDto;
import com.stanzaliving.wanda.response.OnBoardingGetResponse;
import com.stanzaliving.wanda.response.WandaResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Log4j2
public class WandaV2ClientApi {

    private final StanzaRestClient restClient;

    public WandaV2ClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public WandaResponse<OnBoardingGetResponse> getOnBoardingDetails(String userUuid) {

        try {
            Object postBody = null;

            log.info("get User details by userUuid is {} ", userUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/onboarding/details").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.put("userUuid", Collections.singletonList(userUuid));

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>> returnType = new ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error(BaseMarker.WANDA_API_ERROR, "error while fetching the user details " + e);
            return null;
        }
    }

    public ResponseDto<KycDocumentsResponseDTO> getKycDocuments(String bookingUuid) {
        try {
            Object postBody = null;

            log.info("get kyc documents by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/documents").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.put("bookingUuid", Collections.singletonList(bookingUuid));

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<KycDocumentsResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<KycDocumentsResponseDTO>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error(BaseMarker.WANDA_API_ERROR, "error while fetching the kyc documents details " + e);
            return null;
        }
    }

    public ResponseDto<List<KycDocumentDTO>> getKycDocumentsForBookingList(KycDocumentsRequestDto kycDocumentsRequestDto) {

        try {
            Object postBody = kycDocumentsRequestDto;

            log.info("get kyc documents by bookingUuid is {} ", kycDocumentsRequestDto.getBookingUuid());

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/kyc-documents").buildAndExpand(uriVariables)
                    .toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<KycDocumentDTO>>> returnType =
                    new ParameterizedTypeReference<ResponseDto<List<KycDocumentDTO>>>() {};

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error(BaseMarker.WANDA_API_ERROR, "error while fetching the kyc documents details " + e);
            return null;
        }

    }

}
