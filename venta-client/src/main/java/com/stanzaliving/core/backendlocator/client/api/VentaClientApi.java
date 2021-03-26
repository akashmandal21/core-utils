/**
 *
 */
package com.stanzaliving.core.backendlocator.client.api;

import com.stanzaliving.core.backendlocator.client.dto.ResidenceGstDto;
import com.stanzaliving.core.backendlocator.client.dto.ResidentDto;
import com.stanzaliving.core.backendlocator.client.dto.UserLuggageDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.opscalculator.dto.DeadBedCountDto;
import com.stanzaliving.venta.BedCountDetailsDto;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author raj.kumar
 *
 * @date 12-May-2020
 *
 **/

@Log4j2
public class VentaClientApi {

	private StanzaRestClient restClient;

	public VentaClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<BedCountDetailsDto>> getLiveBedDetails(List<String> micromarketNameList) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/getBedDetails").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		postBody = micromarketNameList;
		ParameterizedTypeReference<ResponseDto<List<BedCountDetailsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BedCountDetailsDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<ResidenceGstDto> getGstDetailsForResidences() {

		String path = UriComponentsBuilder.fromPath("/residence-gst-details").buildAndExpand().toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		ParameterizedTypeReference<List<ResidenceGstDto>> returnType = new ParameterizedTypeReference<List<ResidenceGstDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);

	}
	public List<UserLuggageDto> getUsersWithLuggage() {

		String path = UriComponentsBuilder.fromPath("/getAllLuggageUsers").buildAndExpand().toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		ParameterizedTypeReference<List<UserLuggageDto>> returnType = new ParameterizedTypeReference<List<UserLuggageDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);
	}

	public ResidentDto getResidentDetails(String residentCode) {
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residentCode", residentCode);
		String path = UriComponentsBuilder.fromPath("/student/getStudentDetails/{residentCode}").buildAndExpand(uriVariables).toUriString();
		final HttpHeaders headerParams = new HttpHeaders();
		ParameterizedTypeReference<ResidentDto> returnType = new ParameterizedTypeReference<ResidentDto>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, null, returnType);
		} catch (Exception e) {
			log.error("Error while getting user Details from Core by userCode: {}", residentCode, e);
		}
		return null;
	}

	public HashMap<String, Object> getReferralCodeByUser(String userUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		//uriVariables.put("userUuid", userUuid);

		String path = UriComponentsBuilder.fromPath("/broker").buildAndExpand().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("brokerMobile", userUuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<HashMap<String, Object>> returnType = new ParameterizedTypeReference<HashMap<String, Object>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	
	public String getPdfUrlByType(String type, String typeId,String typeName) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/get/pdf").buildAndExpand().toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("type", type);
		queryParams.add("typeId", typeId);
		queryParams.add("typeName", typeName);
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public List<DeadBedCountDto> getDeadBedDetails(String residenceUuid, LocalDate fromDate, LocalDate toDate) {
		Object postBody = null;

		List<DeadBedCountDto> deadBedCountDtoList = new ArrayList<>();
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/getDeadBedDetails").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("residenceUuid", residenceUuid);
		queryParams.add("fromDate", fromDate.toString());
		queryParams.add("toDate", toDate.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<DeadBedCountDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DeadBedCountDto>>>() {
		};

		try {
			deadBedCountDtoList = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error("Exception while fetching dead bed details for residence {} ", residenceUuid, e);
		}

		return deadBedCountDtoList;
	}
}