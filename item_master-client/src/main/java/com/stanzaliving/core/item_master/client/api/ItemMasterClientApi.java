package com.stanzaliving.core.item_master.client.api;

import java.math.BigDecimal;
import java.util.*;

import com.stanzaliving.boq_service.BoqItemSearchRequestDto;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.dto.BrandSkuItemDetailDto;
import com.stanzaliving.core.generic.enums.GSTSlabs;
import com.stanzaliving.core.generic.itemmaster.dto.ItemDto;
import com.stanzaliving.item_master.dtos.*;
import com.stanzaliving.transformations.pojo.MasterBoqResponseDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;


@Log4j2
public class ItemMasterClientApi {

	private StanzaRestClient restClient;

	public ItemMasterClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<MasterBoqDto>> getMasterBoqDtos(BoqRequestDto boqRequestDto) {
		
		Object postBody = boqRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/post/fetchBoqItems")
								.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<MasterBoqDto>> getMasterBoqDtosInclusive(BoqRequestDto boqRequestDto) {

		Object postBody = boqRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/post/fetchBoqItemsInclusive")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<MasterBoqDto> getBoqItem(String itemUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("itemUuid",itemUuid);
		String path = UriComponentsBuilder.fromPath("/internal/details/get/boqItem/{itemUuid}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MasterBoqDto>> returnType = new ParameterizedTypeReference<ResponseDto<MasterBoqDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<MasterBoqResponseDto> searchBoqItemsWithSpecs(BoqItemSearchRequestDto boqItemSearchRequestDto) {

		Object postBody = boqItemSearchRequestDto;

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/post/fetchBoqItemsSpecWise")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MasterBoqResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<MasterBoqResponseDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<MasterBoqDto> getBoqItemFromItemCode(String itemCode) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("itemCode",itemCode);
		String path = UriComponentsBuilder.fromPath("/internal/details/get/fetchAdditionalBoqItemFromItemCode/{itemCode}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MasterBoqDto>> returnType = new ParameterizedTypeReference<ResponseDto<MasterBoqDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
	
	public ResponseDto<List<MasterBoqDto>> getBoqItemFromItemCode(List<String> itemCodes) {

		Object postBody = itemCodes.toArray();

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/post/fetchItems")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<List<MasterBoqDto>> getAsIsItemsByCityName(String cityName) {

		final Map<String, Object> uriVariables = new HashMap<>();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		String path = UriComponentsBuilder.fromPath("/internal/details/get/fetchAsIsItems/" + cityName).buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}

	public ResponseDto<List<MasterBoqDto>> getBoqItems(List<String> itemUuid) {

		Object postBody = itemUuid.toArray();

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/fetch/boqItems")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<MasterBoqDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<PageResponse<GenericItemDto>> getGenericItems(FilterDto filterDto) {

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/generic/post/items/fetchItems")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PageResponse<GenericItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<GenericItemDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, filterDto, headerParams, accept, returnType);
	}



	public ResponseDto<List<GenericItemDto>> getItemsWithUuids(List<String> uuids){
		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/details/get/itemByUUids")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<GenericItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericItemDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, uuids, headerParams, accept, returnType);

	}
	public ResponseDto<List<String>> getItemCodes(Department department, List<String> itemNames) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);
		String path = UriComponentsBuilder.fromPath("/internal/generic/post/fetchItemCodes/{department}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, itemNames, headerParams, accept, returnType);
	}
	public ResponseDto<List<GenericItemDto>> getItemInfoFromItemCodes(FilterDto filterDto) {

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/generic/post/items/getItemsFromItemCodes")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<GenericItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericItemDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, filterDto, headerParams, accept, returnType);
	}
	public ResponseDto<ItemMetaDto> getItemMetaInfo(Department department, Boolean includeNames) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);
		uriVariables.put("includeNames",includeNames);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		String path = UriComponentsBuilder.fromPath("/internal/generic/get/metaInfo/{department}/{includeNames}").buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<ItemMetaDto>> returnType = new ParameterizedTypeReference<ResponseDto<ItemMetaDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}


	public ResponseDto<List<GenericItemDto>> getGenericAsisItems(String cityUuid) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("cityUuid",cityUuid);
		String path = UriComponentsBuilder.fromPath("/internal/generic/get/asisItems/{cityUuid}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<GenericItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericItemDto>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}

	public ResponseDto<List<String>> getItemCodeForProvideFilters(FilterDto filterDto) {

		final Map<String, Object> uriVariables = new HashMap<>();
		String path = UriComponentsBuilder.fromPath("/internal/generic//post/getAllItemCodesForFilter")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, filterDto, headerParams, accept, returnType);
	}

	public ResponseDto<FilterDto> getFiltersForDepartment(Department department) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		String path = UriComponentsBuilder.fromPath("/internal/generic/get/filters/{department}").buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<FilterDto>> returnType = new ParameterizedTypeReference<ResponseDto<FilterDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}

	public ResponseDto<List<ItemDto>> searchItems(Department department, String searchText) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);
		uriVariables.put("searchText",searchText);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		String path = UriComponentsBuilder.fromPath("/internal/generic/get/search/{department}/{searchText}").buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<List<ItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ItemDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}
	public ResponseDto<List<ItemDto>> searchItemsWithFilters(Department department, String searchText, FilterDto filterDto) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);
		uriVariables.put("searchText",searchText);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		String path = UriComponentsBuilder.fromPath("/internal/generic/post/searchwithfilter/{department}/{searchText}").buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<List<ItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ItemDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, filterDto, headerParams, accept, returnType);
	}

	public ResponseDto<Map<String, GSTSlabs>> getGstSlabs(Department department, Collection<String> items, boolean isUuid) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);
		uriVariables.put("isUuid",isUuid);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		String path = UriComponentsBuilder.fromPath("/internal/generic/fetch/gst/{department}/{isUuid}").buildAndExpand(uriVariables).toUriString();

		ParameterizedTypeReference<ResponseDto<Map<String, GSTSlabs>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, GSTSlabs>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, items, headerParams, accept, returnType);
	}

	public ResponseDto<MasterBoqDto> getItemAndRate(String itemUuid, String cityUuid) {

		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemUuid", itemUuid);
		queryParams.add("cityUuid", cityUuid);

		String path = UriComponentsBuilder.fromPath("/internal/details/get/item/and/rate").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<MasterBoqDto>> returnType = new ParameterizedTypeReference<ResponseDto<MasterBoqDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<Collection<GenericItemDto>> getItemsByDepartmentAndItemCode(Department department, Set<String> itemCode) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/generic/item/department/{department}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Collection<GenericItemDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<GenericItemDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, itemCode, headerParams, accept, returnType);
	}

	public ResponseDto<List<String>> getItemCodeByLocation(String locationUuid) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("locationUuid",locationUuid);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/generic/get/item-code/by/location/{locationUuid}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams,null,headerParams, accept, returnType);
	}
	
	public ResponseDto<Collection<BrandSkuItemDetailDto>> getItemDetailsByLocation(String locationUuid) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("locationUuid",locationUuid);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/generic/get/item-details/by/location/{locationUuid}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Collection<BrandSkuItemDetailDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<BrandSkuItemDetailDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams,null,headerParams, accept, returnType);
	}

	public ResponseDto<Collection<BrandSkuItemDetailDto>> getGlobalItemDetailsByDepartment(Department department) {
		
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department",department);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/generic/get/global-item-details/by/department/{department}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Collection<BrandSkuItemDetailDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Collection<BrandSkuItemDetailDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams,null,headerParams, accept, returnType);
	}

	public ResponseDto<Void> removeItemDetailsForDraftLocation(String locationUuid,String userId) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("locationUuid",locationUuid);
		uriVariables.put("userId",userId);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/generic/remove-item-details-draft-location/{locationUuid}/{userId}").buildAndExpand(uriVariables).toUriString();
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		
		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams,null,headerParams, accept, returnType);
	}

	public ResponseDto<Void> addItemDetailsForApprovedLocation(Set<String> itemCodes,String locationUuid,String userId) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("locationUuid",locationUuid);
		uriVariables.put("userId",userId);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/generic/add-item-details-approved-location/{locationUuid}/{userId}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams,itemCodes,headerParams, accept, returnType);
	}

	public ResponseDto<Map<String, MasterBoqDto>> getBulkItemAndRate(List<String> itemUuids, String cityUuid) {

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("cityUuid", cityUuid);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/details/get/item-rate/{cityUuid}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Map<String, MasterBoqDto>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, MasterBoqDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, itemUuids, headerParams, accept, returnType);
	}

	public ResponseDto<List<ConsumableTagResponse>> getConsumableTags(Department department) {

		log.info("HTTP Client call to get consumable tags for department {} ", department);

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("department", department);

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = {"*/*"};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		Map<String, List<String>> map = new HashMap<>();

		ParameterizedTypeReference<ResponseDto<List<ConsumableTagResponse>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ConsumableTagResponse>>>() {
		};

		String path = UriComponentsBuilder.fromPath("/internal/consumable-tag/get/{department}").buildAndExpand(uriVariables).toUriString();

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, map, headerParams, accept, returnType);
	}
}

