/**
 *
 */
package com.stanzaliving.core.transformation.client.api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.invoice.enums.DealType;
import com.stanzaliving.transformations.pojo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.boq_service.dto.BulkActionsModalFilterOptionsDto;
import com.stanzaliving.boq_service.dto.LabelValueDto;
import com.stanzaliving.core.addressbook.AddressBookNameDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.projectservice.tiles.TileDeciderDto;
import com.stanzaliving.core.projectservice.tiles.TileStatusDto;
import com.stanzaliving.transformations.projections.StanzaGstView;
import com.stanzaliving.transformations.ui.pojo.Country;
import com.stanzaliving.ventaAudit.dto.GstInformationDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author naveen.kumar
 *
 * @date 04-Nov-2019
 *
 **/

@Log4j2
public class InternalDataControllerApi {

    private final StanzaRestClient restClient;
    private final boolean activeResidences;

    public InternalDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.activeResidences = true;
        this.restClient = stanzaRestClient;
    }

    public InternalDataControllerApi(StanzaRestClient stanzaRestClient, boolean activeResidences) {
        this.activeResidences = activeResidences;
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

	public ResponseDto<BulkActionsModalFilterOptionsDto> getAllPropertyFilters() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/allFilters").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<BulkActionsModalFilterOptionsDto>> returnType = new ParameterizedTypeReference<ResponseDto<BulkActionsModalFilterOptionsDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<LabelValueDto<String>>> getFilteredPropertyList(BulkActionsModalFilterOptionsDto filters) {

		BulkActionsModalFilterOptionsDto postBody = filters;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/propertyList").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<LabelValueDto<String>>>> returnType = new ParameterizedTypeReference<ResponseDto<List<LabelValueDto<String>>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
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

	public ResponseDto<List<CityMetadataDto>> getMedullaEligibleCities() {

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/cities/all").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("medullaEligible", Arrays.asList("true"));

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
        uriVariables.put("micromarketUuid", micromarketUuid);
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

        if (activeResidences)
            queryParams.add("active", "true");

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceMetadataDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceMetadataDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

	public List<ResidenceUIDto> getAllStudio21Residences() {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residences/studio21/all").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ResidenceUIDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceUIDto>>>() {
		};

		ResponseDto<List<ResidenceUIDto>> responseDto = null;

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, null, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while getting studio21 residences ", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : new ArrayList<>();
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


    public List<String> getCityIdFromCityUUid(List<String> cityUuids) {
        Object postBody = cityUuids;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/city/get/cityByUuids").buildAndExpand(uriVariables).toUriString();
        log.info("Path for get all cities is for commercial code is {}", path);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<CityUIDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CityUIDto>>>() {
        };
        ResponseDto<List<CityUIDto>> response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        List<String> cityIdList = new ArrayList<>();
        if(Objects.nonNull(response) && Objects.nonNull(response.getData())){
            try {
                cityIdList =  response.getData().stream().map(CityUIDto::getId).map(String::valueOf).collect(Collectors.toList());
                if(!cityIdList.isEmpty()){
                    return cityIdList;
                } else return null;
            } catch(Exception e){
                for(CityUIDto city : response.getData()){
                    cityIdList.add(String.valueOf(city.getId()));
                }
                return cityIdList;
            }
        }
        log.info("Response for get all cities is for commercial code is {}", cityIdList);
        return null;
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

    public ResponseDto<StanzaGstView> getStanzaGst(String stateId, DealType dealType) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("stateUuid", stateId);
        String path = UriComponentsBuilder.fromPath("/internal/get/stanzagst/{stateUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if(Objects.nonNull(dealType)){
            queryParams.put("dealType", Arrays.asList(dealType.name()));
        }

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
        try {
            ResponseDto<List<ResidenceUIDto>> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
            if (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) {
                return responseDto;
            }
        } catch(Exception exception){
            log.error("Error while fetching residence ",exception);
            throw new StanzaHttpException("Transformation is down: " + exception.getMessage(), exception);
        }
        log.error("Error while fetching residence");
        throw new StanzaHttpException("Error while fetching Residence List");
    }

    public ResponseDto<List<ResidenceDto>> getResidenceDetailsByResidenceUuids(List<String> residenceUuids) {
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

    public ResponseDto<List<AddressBookMetaDto>> getAddressBookData(FilterAddressDto filterAddress) {
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

    public ResponseDto<List<UIKeyValue>> getAddressBookNames(FilterAddressDto filterAddress) {
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

    public ResponseDto<List<AddressBookNameDto>> getAddressBookNamesForApp(FilterAddressDto filterAddress) {
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

    public ResponseDto<List<ResidenceDto>> getAllResidenceByCode(List<String> codes) {
        Object postBody = codes;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/get").buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<Void> updateResidenceBookingStatus(String residenceUuid, boolean status) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("status", status);

        String path = UriComponentsBuilder.fromPath("/internal/residence/update-booking-status/{residenceUuid}/{status}").
                buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


    /**
     * This method is used to fetch address of property using phoenix uuid.
     */
    public ResponseDto<AddressBookMetaDto> getPropertyAddressByPhoenixUuid(String phoenixUuid) {
        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("phoenixUuid", phoenixUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/get/addressByPropertyUuid/{phoenixUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<AddressBookMetaDto>> returnType = new ParameterizedTypeReference<ResponseDto<AddressBookMetaDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }
    

    public CompletableFuture<ResidenceUIDto> getResidenceUIDto(String residenceUuid) {
        Object postBody = null;

        ResponseDto<ResidenceUIDto> response=new ResponseDto<ResidenceUIDto>();
       
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/get/details").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("residenceUuid", residenceUuid);
		
		final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidenceUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceUIDto>>() {
        };
        
		 try {
	        	response=restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	        return	CompletableFuture.completedFuture(response.getData());
	        } catch (Exception e) {
				 log.error("Exception Caught while Fetching Residences By residenceUuid: {}", residenceUuid, e);
			}
	        
	        return null ;
	   }
   
    public ResponseDto<ResidenceUIDto> getResidenceDetail(String residenceUuid) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/get/details").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.add("residenceUuid", residenceUuid); 
        

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidenceUIDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceUIDto>>() {
        };

		ResponseDto<ResidenceUIDto> responseDto = null;

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching ResidenceUIDto from transformations: ", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto : null;

    }

    public ResponseDto<ResidenceDto> getResidenceDetailsByResidenceName(String residenceName) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceName", residenceName);
        String path =
                UriComponentsBuilder.fromPath("/internal/residence/get")
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

            String path = UriComponentsBuilder.fromPath("/internal/get/{name}")
                    .buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {
                    "*/*"
            };
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<StateUIDto>> returnType =
                    new ParameterizedTypeReference<ResponseDto<StateUIDto>>() {
                    };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {

            log.error("Exception Caught while Fetching State details By State name: {}", stateName, e);
        }
        return null;
	}

	public void publishResidencesToKafkaByPhoenixPropertyUuids(List<String> phoenixPropertyUuids) {
		log.info("publishResidencesToKafkaByPhoenixPropertyUuids is called for phoenixPropertyUuids {}", phoenixPropertyUuids);

		if (CollectionUtils.isEmpty(phoenixPropertyUuids)) {
			return;
		}
		String uuids = String.join(",", phoenixPropertyUuids);
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/residence/publish/kafka/").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		queryParams.putAll(restClient.parameterToMultiValueMap(null, "phoenixPropertyUuids", uuids));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};
		restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}


    public ResponseDto<GstInformationDto> getGstDataByCityUuid(String cityUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid", cityUuid);

        String path = UriComponentsBuilder.fromPath("/internal/invoice/city/{uuid}")
                .buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<GstInformationDto>> returnType = new TypeReference<ResponseDto<GstInformationDto>>() {
        };

        ResponseDto<GstInformationDto> responseDto;
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching Gst Information by City UUID.", e);

        }
        return null;
    }

    public String getResidenceUuidByResidenceId(String residenceId) {
        log.info("Fetching Transformation details for residence id {}", residenceId);
        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceId", residenceId);

        String path = UriComponentsBuilder.fromPath("/internal/residence/get/residenceUuid/{residenceId}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<String> returnType =
                new ParameterizedTypeReference<String>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching residence uuid for residence id {} ", residenceId);
            return null;
        }
    }


    public ResponseDto<GstInformationDto> getGstDataByCityId(String cityId) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("cityId", cityId);

        String path = UriComponentsBuilder.fromPath("/internal/invoice/cityId/{cityId}")
                .buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<GstInformationDto>> returnType = new TypeReference<ResponseDto<GstInformationDto>>() {
        };

        ResponseDto<GstInformationDto> responseDto;
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching Gst Information by cityId.", e);

        }
        return null;
    }

    public ResponseDto<MicroMarketUIDto> getMicroMarketUIDtoByNameAndCityId(String name, String cityId) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("name", name);
        uriVariables.put("cityId",cityId);

        String path = UriComponentsBuilder.fromPath("/internal/micromarket/get/name/{name}/cityId/{cityId}").buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<List<AddressBookMetaDto>> getAllAddressBook() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/get/addresses/all").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AddressBookMetaDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AddressBookMetaDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<List<AddressBookMetaDto>> getAllAddressBookData() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/get/all/addresses").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AddressBookMetaDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AddressBookMetaDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public PropertyInvoiceDetails getGstDataByResidenceUuid(String residenceUuid) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("uuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence/{uuid}/invoice-details")
                .buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<PropertyInvoiceDetails>> returnType = new TypeReference<ResponseDto<PropertyInvoiceDetails>>() {
        };

        ResponseDto<PropertyInvoiceDetails> responseDto;
        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching Gst Information by residence UUID.", e);
            throw new ApiValidationException("Some error occurred. Please try again after some time.");
        }

        if (!responseDto.isStatus()) {
            throw new PreconditionFailedException(responseDto.getMessage());
        }

        PropertyInvoiceDetails gstInformationDto = responseDto.getData();

        return gstInformationDto;
    }

}
