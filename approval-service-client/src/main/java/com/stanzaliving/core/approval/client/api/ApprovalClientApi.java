package com.stanzaliving.core.approval.client.api;

import com.stanzaliving.approval.dto.ApprovalListingDto;
import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
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
import java.util.Objects;

@Log4j2
public class ApprovalClientApi {

	private StanzaRestClient restClient;

	public ApprovalClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<ApprovalListingDto> getApprovalListing(String entityUuid, ApprovalEntityType approvalEntityType){
		ResponseDto<ApprovalListingDto> responseDto = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("internal/getApprovalDto").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("entityUuid", entityUuid);
		queryParams.add("approvalEntityType", approvalEntityType.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ApprovalListingDto>> returnType = new ParameterizedTypeReference<ResponseDto<ApprovalListingDto>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching approval listing for entityUuid: {}", entityUuid, e);
		}

		return (Objects.nonNull(responseDto)) ? responseDto : null;
	}

	public ApprovalListingDto getApprovalData(String entityUuid, ApprovalEntityType approvalEntityType) {
		ResponseDto<ApprovalListingDto> data = getApprovalListing(entityUuid, approvalEntityType);
		return data == null || data.getData() == null ? null : data.getData();
	}

}
