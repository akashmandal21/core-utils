package com.stanzaliving.operations.client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.operations.dto.request.ResidentServiceMixVasRequestDto;
import com.stanzaliving.operations.dto.response.ResidentServiceMixV2VasResponseDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.BaseMarker;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.operations.dto.ActiveResidenceDetailsDto;
import com.stanzaliving.core.operations.dto.CurrentServiceMixRequestDto;
import com.stanzaliving.core.operations.dto.DealDto;
import com.stanzaliving.core.operations.dto.ResidentFoodPreferenceCountDto;
import com.stanzaliving.core.operations.dto.ServiceMixDto;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.internet.dto.InternetDetails;
import com.stanzaliving.internet.dto.InternetProviderDetails;
import com.stanzaliving.operations.ServiceMixSeasonResponseDto;
import com.stanzaliving.operations.dto.ResidenceMirSummaryDto;
import com.stanzaliving.operations.dto.request.ResidenceMirRequestDto;
import com.stanzaliving.operations.dto.servicemix.ServiceMixEntityDto;
import com.stanzaliving.operations.dto.servicemix.ServiceNameRequestDto;
import com.stanzaliving.operations.dto.servicemix.ServiceNameResponseDto;
import com.stanzaliving.operations.enums.ServiceMixStatus;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OperationsClientApi {

	private StanzaRestClient restClient;

	public OperationsClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public Map<String, Integer> getResideneMIRMap(LocalDate date) {

		Object postBody = null;

		ResponseDto<Map<String, Integer>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/mir").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("mirDate", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Integer>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching MIR from operations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();

	}

	public List<ResidentFoodPreferenceCountDto> getResidentFoodPreferenceCount(LocalDate date) {

		Object postBody = null;

		ResponseDto<List<ResidentFoodPreferenceCountDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/resident/food/preference/count").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("mirDate", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidentFoodPreferenceCountDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidentFoodPreferenceCountDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching food preference count from operations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public List<UserHostelDto> getUserHostelList(LocalDate date) {

		Object postBody = null;

		ResponseDto<List<UserHostelDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/resident/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("mirDate", date.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UserHostelDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UserHostelDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching resident list from operations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public List<ServiceMixSeasonResponseDto> getSeasonByResidenceId(List<String> residenceIds) {

		if(CollectionUtils.isEmpty(residenceIds)){
			return new ArrayList<>();
		}

		Object postBody = residenceIds;

		ResponseDto<List<ServiceMixSeasonResponseDto>> responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/season/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ServiceMixSeasonResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ServiceMixSeasonResponseDto>>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching Season List from residenceId: {}", residenceIds, e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();

	}

	public InternetProviderDetails getInternetVendor(String residenceId, LocalDate localDate) {

		Object postBody = null;

		InternetDetails responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("key", "internet.internet");
		uriVariables.put("residenceId", residenceId);
		uriVariables.put("date", localDate.toString());

		String path =
				UriComponentsBuilder.fromPath("/internal/servicemix/current/getValueForKey/{residenceId}/{key}/{date}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<InternetDetails> returnType = new ParameterizedTypeReference<InternetDetails>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching Vendor Name from residenceId: {}", residenceId, e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}
	
	public InternetProviderDetails getInternetVendorForB2B(String residenceId, LocalDate localDate, String userCode) {

		Object postBody = null;

		InternetDetails responseDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("key", "internet.internet");
		uriVariables.put("residenceId", residenceId);
		uriVariables.put("date", localDate.toString());
		uriVariables.put("userCode", userCode);

		String path =
				UriComponentsBuilder.fromPath("/internal/servicemix/b2b/current/getValueForKey/{residenceId}/{key}/{date}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<InternetDetails> returnType = new ParameterizedTypeReference<InternetDetails>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching Vendor Name from residenceId: {}", residenceId, e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}

	public ServiceMixEntityDto getServiceMixEntityByUuid(String uuid) {

		Object postBody = null;

		ServiceMixEntityDto serviceMixEntity = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMix").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("uuid", uuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix with uuid {}", uuid, e);
		}

		return serviceMixEntity;
	}

	public ServiceMixEntityDto getServiceMixByUuidAndResidenceId(String serviceMixUuid, String residenceUuid) {

		Object postBody = null;

		ServiceMixEntityDto serviceMixEntity = null;

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

		ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix with uuid {} and residenceId {}", serviceMixUuid, residenceUuid, e);
		}

		return Objects.nonNull(serviceMixEntity) ? serviceMixEntity : null;
	}

	public List<ServiceMixEntityDto> getServiceMixByUuidList(List<String> uuidList) {

		Object postBody = null;

		List<ServiceMixEntityDto> serviceMixEntityList = new ArrayList<>();

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixListForUuids").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.addAll("serviceMixUuidList", uuidList);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ServiceMixEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ServiceMixEntityDto>>>() {

		};

		try {
			serviceMixEntityList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix list from uuidList {} ", uuidList, e);
		}

		return serviceMixEntityList;
	}

	public ServiceMixEntityDto getFirstByFromDateAndResidenceIdAndServiceMixStatusAndDealCategory(LocalDate fromDate, String residenceId,
			ServiceMixStatus serviceMixStatus, DealCategory dealCategory) {

		Object postBody = null;

		ServiceMixEntityDto serviceMixEntity = null;

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

		ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix from fromDate {} ", fromDate, e);
		}

		return Objects.nonNull(serviceMixEntity)? serviceMixEntity: null;
	}

	public List<ServiceMixEntityDto> getServiceMixListByResidenceId(String residenceId) {

		Object postBody = null;

		List<ServiceMixEntityDto> serviceMixEntityList = new ArrayList<>();

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixByResidenceId").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("residenceId", residenceId);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ServiceMixEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ServiceMixEntityDto>>>() {

		};

		try {
			serviceMixEntityList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix list for residenceId {} ", residenceId, e);
		}

		return serviceMixEntityList;
	}

	public ServiceMixDto getCurrentServiceMix(String residenceUuid, String userCode) {

		Object postBody = null;

		ServiceMixDto serviceMixDto = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/servicemix/current/servicemix").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("residenceUuid", residenceUuid);
		queryParams.add("userCode", userCode);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


		ParameterizedTypeReference<ResponseDto<ServiceMixDto>> returnType = new ParameterizedTypeReference<ResponseDto<ServiceMixDto>>() {

		};

		try {
			serviceMixDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix dto for user code {} ", userCode, e);
		}

		return Objects.nonNull(serviceMixDto) ? serviceMixDto : null;
	}
	
	public Map<String, Map<String, ServiceMixDto>> getCurrentServiceMixList(CurrentServiceMixRequestDto currentServiceMixRequestDto){

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/servicemix/current/servicemix/list").buildAndExpand(uriVariables).toUriString();

		TypeReference<ResponseDto<Map<String, Map<String, ServiceMixDto>>>> returnType = new TypeReference<ResponseDto<Map<String, Map<String, ServiceMixDto>>>>() {};

		ResponseDto<Map<String, Map<String, ServiceMixDto>>> responseDto = null;

		try {

			responseDto = restClient.post(path, null, currentServiceMixRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting ServiceMix detail", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new HashMap<>();
	}
	
	public ResponseDto<List<ActiveResidenceDetailsDto>> getActiveResidenceList() {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/residence/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		final String[] accepts = {
				"*/*"
		};
		
		final HttpHeaders headerParams = new HttpHeaders();
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		
		ParameterizedTypeReference<ResponseDto<List<ActiveResidenceDetailsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ActiveResidenceDetailsDto>>>() {

		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		
	}
	
	public ResponseDto<List<ActiveResidenceDetailsDto>> getActiveResidenceListByCityOrMicroMarketOrResidenceUuid(List<String> cityIdList, List<String>  micromarketIdList, List<String>  residenceUuidList) {
		
		if(CollectionUtils.isEmpty(cityIdList)){
			cityIdList = new ArrayList<>();
		}
		if(CollectionUtils.isEmpty(micromarketIdList)){
			micromarketIdList = new ArrayList<>();
		}
		if(CollectionUtils.isEmpty(residenceUuidList)){
			residenceUuidList = new ArrayList<>();
		}
		
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/residence/list/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.addAll("cityIdList", cityIdList);
		queryParams.addAll("micromarketIdList", micromarketIdList);
		queryParams.addAll("residenceUuidList", residenceUuidList);
		
		final String[] accepts = {
				"*/*"
		};
		
		final HttpHeaders headerParams = new HttpHeaders();
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		
		ParameterizedTypeReference<ResponseDto<List<ActiveResidenceDetailsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ActiveResidenceDetailsDto>>>() {

		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		
	}


	public ServiceMixEntityDto getFirstByFromDateAndResidenceIdAndServiceMixStatusAndDealCategoryAndUuidNot(LocalDate fromDate, String residenceId, ServiceMixStatus serviceMixStatus, DealCategory dealCategory, String uuid) {

		Object postBody = null;

		ServiceMixEntityDto serviceMixEntity = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/ops/servicemix/getServiceMixFromDateAndUuidNot").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("fromDate", fromDate.toString());
		queryParams.add("residenceId", residenceId);
		queryParams.add("serviceMixStatus", serviceMixStatus.toString());
		queryParams.add("dealCategory", dealCategory.toString());
		queryParams.add("uuid", uuid);


		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ServiceMixEntityDto>>() {

		};

		try {
			serviceMixEntity = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching service mix from fromDate {} ", fromDate, e);
		}

		return Objects.nonNull(serviceMixEntity) ? serviceMixEntity : null;
	}

	public List<DealDto> getDealsByUuidIn(Collection<String> uuids){

    	String path = UriComponentsBuilder.fromPath("/internal/deal/list").build().toUriString();

		TypeReference<ResponseDto<List<DealDto>>> returnType = new TypeReference<ResponseDto<List<DealDto>>>() {};

		ResponseDto<List<DealDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, null, uuids, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting deal detail", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
	}
	
	public ServiceNameResponseDto getServiceMixNamesByResidenceIds(List<String> residenceIds) {

		try {
			Object postBody = ServiceNameRequestDto.builder().residenceIds(residenceIds).build();

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/internal/servicemix/residence/servicename")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<ServiceNameResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<ServiceNameResponseDto>>() {
			};

			ResponseDto<ServiceNameResponseDto> responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

			return responseDto.isStatus() && Objects.nonNull(responseDto.getData()) ? responseDto.getData() : null;
		} catch (Exception e) {
			log.error("Exception while fetching ServiceMixNames List from residenceIds: {}", residenceIds, e);
			return null;
		}
	}

	public List<String> getResidence(String internetVendor) {

		try {
			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("internetVendor",internetVendor);

			String path = UriComponentsBuilder.fromPath("/internal/hostel/internetVendor/{internetVendor}")
					.buildAndExpand(uriVariables).toUriString();
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {
					"*/*"
			};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
			};
			ResponseDto<List<String>> residenceList =  restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
			return Objects.nonNull(residenceList) && residenceList.isStatus() && Objects.nonNull(residenceList.getData()) ? residenceList.getData() : null;

		} catch (Exception e) {
			log.error(BaseMarker.OPERATIONS_ERROR, "Exception while fetching Residence List from internetVendor: " + internetVendor, e);
			return new ArrayList<>();
		}
	}

    public ResidenceMirSummaryDto getResidenceMirSummary(ResidenceMirRequestDto residenceMirRequestDto) {

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v2/residence/mir").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        TypeReference<ResponseDto<ResidenceMirSummaryDto>> returnType = new TypeReference<ResponseDto<ResidenceMirSummaryDto>>() {
        };

        ResponseDto<ResidenceMirSummaryDto> responseDto = null;

        try {

            responseDto = restClient.post(path, queryParams, residenceMirRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

        } catch (Exception e) {

            log.error("Error while getting mir", e);

        }

        return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

    public ResidenceMirSummaryDto getAllActiveResidenceMirSummary(ResidenceMirRequestDto residenceMirRequestDto) {
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v2/residence/mir/all").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        TypeReference<ResponseDto<ResidenceMirSummaryDto>> returnType = new TypeReference<ResponseDto<ResidenceMirSummaryDto>>() {
        };

        ResponseDto<ResidenceMirSummaryDto> responseDto = null;

        try {

            responseDto = restClient.post(path, queryParams, residenceMirRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

        } catch (Exception e) {

            log.error("Error while getting mir", e);

        }

        return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;
    }

	public ResidentServiceMixV2VasResponseDto customizeVasForResident(ResidentServiceMixVasRequestDto residentServiceMixVasRequestDto) {
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/v2/resident/servicemix/customize/vas").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		TypeReference<ResponseDto<ResidentServiceMixV2VasResponseDto>> returnType = new TypeReference<ResponseDto<ResidentServiceMixV2VasResponseDto>>() {
		};

		ResponseDto<ResidentServiceMixV2VasResponseDto> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, residentServiceMixVasRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while customizing vas for resident", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;
	}
}