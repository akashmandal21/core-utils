package com.stanzaliving.operations.client;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.internet.dto.InternetDetails;
import com.stanzaliving.operations.dto.servicemix.ServiceMixEntity;
import com.stanzaliving.operations.enums.ServiceMixStatus;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Log4j2
public class OperationServiceMixClientApi {

	private StanzaRestClient restClient;

	public OperationServiceMixClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ServiceMixEntity getServiceMixEntityByUuid(String uuid) {

		Object postBody = null;

		ServiceMixEntity serviceMixEntity = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMix").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("uuid", uuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ServiceMixEntity> returnType = new ParameterizedTypeReference<ServiceMixEntity>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching service mix with uuid {}", uuid, e);
		}

		return Objects.nonNull(serviceMixEntity) ? serviceMixEntity : null;
	}

	public ServiceMixEntity getServiceMixByUuidAndResidenceId(String serviceMixUuid, String residenceUuid) {

		Object postBody = null;

		ServiceMixEntity serviceMixEntity = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixForResidenceId").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("serviceMixUuid", serviceMixUuid);
		queryParams.add("residenceUuid", residenceUuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ServiceMixEntity> returnType = new ParameterizedTypeReference<ServiceMixEntity>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching service mix with uuid {} and residenceId {}", serviceMixUuid, residenceUuid, e);
		}

		return Objects.nonNull(serviceMixEntity) ? serviceMixEntity : null;
	}

	public List<ServiceMixEntity> getServiceMixByUuidList(List<String> uuidList) {

		Object postBody = null;

		List<ServiceMixEntity> serviceMixEntityList = new ArrayList<>();

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixListForUuids").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.addAll("serviceMixUuidList", uuidList);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<ServiceMixEntity>> returnType = new ParameterizedTypeReference<List<ServiceMixEntity>>() {

		};

		try {
			serviceMixEntityList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching service mix list from uuidList {} ", uuidList, e);
		}

		return serviceMixEntityList;
	}

	public ServiceMixEntity getFirstByFromDateAndResidenceIdAndServiceMixStatusAndDealCategory(LocalDate fromDate, String residenceId,
			ServiceMixStatus serviceMixStatus, DealCategory dealCategory) {

		Object postBody = null;

		ServiceMixEntity serviceMixEntity = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixFromDate").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("fromDate", fromDate.toString());
		queryParams.add("residenceId", residenceId);
		queryParams.add("serviceMixStatus", serviceMixStatus.toString());
		queryParams.add("dealCategory", dealCategory.toString());


		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ServiceMixEntity> returnType = new ParameterizedTypeReference<ServiceMixEntity>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching service mix from fromDate {} ", fromDate, e);
		}

		return Objects.nonNull(serviceMixEntity)? serviceMixEntity: null;
	}

	public List<ServiceMixEntity> getServiceMixListByResidenceId(String residenceId) {

		Object postBody = null;

		List<ServiceMixEntity> serviceMixEntityList = new ArrayList<>();

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixByResidenceId").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("residenceId", residenceId);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<ServiceMixEntity>> returnType = new ParameterizedTypeReference<List<ServiceMixEntity>>() {

		};

		try {
			serviceMixEntityList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching service mix list for residenceId {} ", residenceId, e);
		}

		return serviceMixEntityList;
	}




}
