/**
 * 
 */
package com.stanzaliving.core.transformation.client.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.addressbook.AddressBookNameDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.projectservice.tiles.TileDeciderDto;
import com.stanzaliving.core.projectservice.tiles.TileStatusDto;
import com.stanzaliving.transformations.pojo.AddressBookMetaDto;
import com.stanzaliving.transformations.pojo.CityMetadataDto;
import com.stanzaliving.transformations.pojo.CityUIDto;
import com.stanzaliving.transformations.pojo.CityUuidListDto;
import com.stanzaliving.transformations.pojo.CountryLevelAccessMetadata;
import com.stanzaliving.transformations.pojo.CountryUIDto;
import com.stanzaliving.transformations.pojo.FilterAddressDto;
import com.stanzaliving.transformations.pojo.LocationDto;
import com.stanzaliving.transformations.pojo.MicroMarketDetailsDto;
import com.stanzaliving.transformations.pojo.MicroMarketMetadataDto;
import com.stanzaliving.transformations.pojo.MicroMarketUIDto;
import com.stanzaliving.transformations.pojo.PropertyBoqStatusDto;
import com.stanzaliving.transformations.pojo.ResidenceDto;
import com.stanzaliving.transformations.pojo.ResidenceMetadataDto;
import com.stanzaliving.transformations.pojo.ResidenceUIDto;
import com.stanzaliving.transformations.pojo.StateMetadataDto;
import com.stanzaliving.transformations.pojo.StateUIDto;
import com.stanzaliving.transformations.pojo.ZoneMetadataDto;
import com.stanzaliving.transformations.projections.StanzaGstView;
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

	public ResponseDto<List<CountryUIDto>> getAllCountries() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/countries/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CountryUIDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CountryUIDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
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

	public ResponseDto<ResidenceDto> getResidenceData(String residenceUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("residenceUuid", Arrays.asList(residenceUuid));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ResidenceDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	
	public ResponseDto<ResidenceDto> getResidenceForPhoenixProperty(String propertyUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/get/getResidenceByPhoenixPropertyUuid").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("propertyUuid", Arrays.asList(propertyUuid));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ResidenceDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<ResidenceDto>> getPhoenixPropertiesForResidences(Collection<String> residenceUuids) {

		Object postBody = residenceUuids;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/get/getPhoenixPropertyUuidByResidenceUuid").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}



	public ResponseDto<MicroMarketMetadataDto> getMicromarketData(String micromarketUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("micromarketUuid",micromarketUuid);
		String path = UriComponentsBuilder.fromPath("/internal/micromarket/get/{micromarketUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MicroMarketMetadataDto>> returnType = new ParameterizedTypeReference<ResponseDto<MicroMarketMetadataDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

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
	
	public ResponseDto<List<ResidenceMetadataDto>> getAllResidencesBoth() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/get/all").buildAndExpand(uriVariables).toUriString();

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

	public ResponseDto<MicroMarketUIDto> getMicromarketDtoUsingId(Long mmId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("mmId", mmId);

		String path = UriComponentsBuilder.fromPath("/internal/micromarket/get/id/{mmId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MicroMarketUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<MicroMarketUIDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<StateUIDto> getStateDtoUsingId(Long stateId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("stateId", stateId);

		String path = UriComponentsBuilder.fromPath("/internal/state/get/id/{stateId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<StateUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<StateUIDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	public ResponseDto<CountryUIDto> getCountryDtoUsingId(Long countryId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("countryId", countryId);

		String path = UriComponentsBuilder.fromPath("/internal/country/get/id/{countryId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CountryUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<CountryUIDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	public ResponseDto<StanzaGstView> getStanzaGst(String stateId) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("stateUuid", stateId);

		String path = UriComponentsBuilder.fromPath("/internal/get/stanzagst/{stateUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<StanzaGstView>> returnType = new ParameterizedTypeReference<ResponseDto<StanzaGstView>>() {
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

	public ResponseDto<List<ResidenceDto>> getResidenceDetailsByResidenceUuids(List<String> residenceUuids){
		Object postBody = residenceUuids;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/details/get").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<AddressBookMetaDto>> getAddressBookData(FilterAddressDto filterAddress){
		Object postBody = filterAddress;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/addresses/filtered").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<AddressBookMetaDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AddressBookMetaDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<UIKeyValue>> getAddressBookNames(FilterAddressDto filterAddress){
		Object postBody = filterAddress;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/addressnames/filtered").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<UIKeyValue>>> returnType = new ParameterizedTypeReference<ResponseDto<List<UIKeyValue>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}
	public ResponseDto<List<LocationDto>> getAllLocationsDtoList(AccessLevel accessLevel) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
//		uriVariables.put("accessLevel", accessLevel);

		String path = UriComponentsBuilder.fromPath("/internal/locations/all/" + accessLevel.toString()).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<LocationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<LocationDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<List<AddressBookNameDto>> getAddressBookNamesForApp(FilterAddressDto filterAddress){
		Object postBody = filterAddress;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/locationNamesAndType/filtered").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<AddressBookNameDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AddressBookNameDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Void> addVendor(String vendorUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/add/vendor/" + vendorUuid).buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<List<ListingDto>> getMicromarketList(CityUuidListDto cityUuids) {

		Object postBody = cityUuids;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/micromarket/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ListingDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ListingDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<ListingDto>> getMicromarketsByCityUuid(String cityUuid) {

		try {
			Object postBody = null;

			// create path and map variables
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("cityUuid", cityUuid);

			String path = UriComponentsBuilder.fromPath("internal/micromarket/list/{cityUuid}").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {
					"*/*"
			};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<List<ListingDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ListingDto>>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			
			log.error("Exception Caught while Fetching Micromarkets by city Uuid: {}", cityUuid, e);
		}
		return null;
	}
	
	public ResponseDto<List<ResidenceDto>> getResidencesByMicromarketUuid(String micromarketUuid) {

		try {
			Object postBody = null;

			// create path and map variables
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("micromarketUuid", micromarketUuid);

			String path = UriComponentsBuilder.fromPath("internal/get/residences/by/micromarketuuid/{micromarketUuid}").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {
					"*/*"
			};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			
			log.error("Exception Caught while Fetching Residences By Micromarket Uuid: {}", micromarketUuid, e);
		}
		return null;
	}

	public ResponseDto<ResidenceDto> getResidenceDetailsByResidenceName(String residenceName) {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceName", residenceName);
		String path =
				UriComponentsBuilder.fromPath("/residence/get")
						.buildAndExpand(uriVariables)
						.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("residenceName", Arrays.asList(residenceName));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ResidenceDto>> returnType =
				new ParameterizedTypeReference<ResponseDto<ResidenceDto>>() {};

		return restClient.invokeAPI(
				path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<StateUIDto> getStateDetailsByName(String stateName) {

		try {
			Object postBody = null;

			// create path and map variables
			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("name", stateName);

			String path = UriComponentsBuilder.fromPath("internal/state/{name}").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {
					"*/*"
			};
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<StateUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<StateUIDto>>() {
			};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {

			log.error("Exception Caught while Fetching State details By State name: {}", stateName, e);
		}
		return null;
	}
}
