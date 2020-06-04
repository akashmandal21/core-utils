/**
 * 
 */
package com.stanzaliving.core.transformation.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.transformations.pojo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.projectservice.tiles.TileDeciderDto;
import com.stanzaliving.core.projectservice.tiles.TileStatusDto;
import com.stanzaliving.transformations.ui.pojo.Country;

import lombok.extern.log4j.Log4j2;

/**
 * @author naveen.kumar
 *
 * @date 04-Nov-2019
 *
 **/

@Log4j2
public class InternalDataControllerApi {

	private StanzaRestClient restClient;

	public InternalDataControllerApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<StateMetadataDto>> getAllStates() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/states/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<StateMetadataDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<StateMetadataDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<ZoneMetadataDto>> getAllZones() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/zones/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ZoneMetadataDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ZoneMetadataDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<String> getCityName(double latitude, double longitude) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("latitude", latitude);
		uriVariables.put("longitude", longitude);

		String path = UriComponentsBuilder.fromPath("/internal/city/get/{latitude}/{longitude}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<MicroMarketDetailsDto> getMicroMarket(double latitude, double longitude) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("latitude", latitude);
		uriVariables.put("longitude", longitude);

		String path = UriComponentsBuilder.fromPath("/internal/micromarket/get/latlong/{latitude}/{longitude}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MicroMarketDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<MicroMarketDetailsDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<CityMetadataDto>> getAllCities() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/cities/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CityMetadataDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CityMetadataDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<MicroMarketMetadataDto>> getAllMicroMarkets() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/micromarkets/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MicroMarketMetadataDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MicroMarketMetadataDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Map<Long, CountryLevelAccessMetadata>> getHierarchy(AccessLevel accessLevel, List<String> accessLevelUuids) {

		log.info("getHierarchy is called for {}, accessLevelUuids {}", accessLevel, accessLevelUuids);

		if (CollectionUtils.isEmpty(accessLevelUuids)) {
			return null;
		}
		String uuids = String.join(",", accessLevelUuids);
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/access/metadata/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if (AccessLevel.COUNTRY.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "countryIds", uuids));
		} else if (AccessLevel.REGION.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "stateIds", uuids));
		} else if (AccessLevel.CITY.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "cityIds", uuids));
		} else if (AccessLevel.MICROMARKET.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "microMarketIds", uuids));
		}

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<Long, CountryLevelAccessMetadata>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<Long, CountryLevelAccessMetadata>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<PropertyBoqStatusDto>> getPropertiesBoqStatus(List<String> propertyUuids) {

		Object postBody = propertyUuids;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/property/status").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<PropertyBoqStatusDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PropertyBoqStatusDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<Country>> getHierarchyForUI(AccessLevel accessLevel, List<String> accessLevelUuids) {

		log.info("getHierarchyForUI is called for {}, accessLevelUuids {}", accessLevel, accessLevelUuids);

		if (CollectionUtils.isEmpty(accessLevelUuids)) {
			return null;
		}

		String uuids = String.join(",", accessLevelUuids);
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/access/metadata/list/ui").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		if (AccessLevel.COUNTRY.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "countryIds", uuids));
		} else if (AccessLevel.REGION.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "stateIds", uuids));
		} else if (AccessLevel.CITY.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "cityIds", uuids));
		} else if (AccessLevel.MICROMARKET.equals(accessLevel)) {
			queryParams.putAll(restClient.parameterToMultiValueMap(null, "microMarketIds", uuids));
		}

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<Country>>> returnType = new ParameterizedTypeReference<ResponseDto<List<Country>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<TileStatusDto> getTileStatus(TileDeciderDto tileDeciderDto) {

		Object postBody = tileDeciderDto;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/property/tileStatus").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<TileStatusDto>> returnType = new ParameterizedTypeReference<ResponseDto<TileStatusDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<ResidenceMetadataDto>> getAllResidences() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/get/metadata/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceMetadataDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceMetadataDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<CityUIDto> getCityDtoUsingId(Long cityId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("cityId", cityId);

		String path = UriComponentsBuilder.fromPath("/internal/city/get/id/{cityId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CityUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<CityUIDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<CityUIDto> getCityDtoUsingName(String name) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("name", name);

		String path = UriComponentsBuilder.fromPath("/internal/city/get/name/{name}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CityUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<CityUIDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<List<ResidenceUIDto>> getResidenceDetailList() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/detail/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceUIDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceUIDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

}