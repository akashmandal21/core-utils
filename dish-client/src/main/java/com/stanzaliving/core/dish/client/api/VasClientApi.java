package com.stanzaliving.core.dish.client.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.cafe.dto.CafeVasItemDto;
import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.food.dto.request.GetVasMasterMapRequestDto;
import com.stanzaliving.core.food.dto.request.VasMasterSearchRequestDto;
import com.stanzaliving.core.food.dto.request.VasMasterUpdateRequestDto;
import com.stanzaliving.core.food.dto.response.DishDetailsResponseDto;
import com.stanzaliving.core.food.dto.response.ImageUploadResponseDto;
import com.stanzaliving.core.food.dto.response.VasDataCountDto;
import com.stanzaliving.core.food.dto.response.VasMasterPackagingResponseDto;
import com.stanzaliving.core.food.dto.response.VasMasterResponseDto;
import com.stanzaliving.core.food.dto.response.VasMasterSearchResponseDto;
import com.stanzaliving.core.food.enums.VasOrderStatus;
import com.stanzaliving.food.v2.common.dto.VasFeedbackOptionDto;
import com.stanzaliving.food.v2.common.dto.VasItemCategoryDto;
import com.stanzaliving.food.v2.common.dto.VasMasterDishDto;
import com.stanzaliving.food.v2.common.dto.VasMasterDto;
import com.stanzaliving.food.v2.common.dto.VasMasterFeedbackOptionDto;
import com.stanzaliving.food.v2.common.dto.VasOrderDto;
import com.stanzaliving.food.v2.common.dto.VasOrderItemsDto;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 28-Jul-2021
 */

@Log4j2
public class VasClientApi {

	private final StanzaRestClient restClient;

	public VasClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}
	
	public List<ListingDto> listing() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/category/listing").build().toUriString();

		TypeReference<ResponseDto<List<ListingDto>>> returnType = new TypeReference<ResponseDto<List<ListingDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<ListingDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting category list for vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public List<KeyValuePairDto> getFeedbackOptionsListing() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/feedback/listing").build().toUriString();

		TypeReference<ResponseDto<List<KeyValuePairDto>>> returnType = new TypeReference<ResponseDto<List<KeyValuePairDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<KeyValuePairDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting feedback option list for vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public VasMasterResponseDto getVasMaster(String vasMasterId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/id/{vasMasterId}").build().toUriString();

		TypeReference<ResponseDto<VasMasterResponseDto>> returnType = new TypeReference<ResponseDto<VasMasterResponseDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<VasMasterResponseDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<VasMasterDto> getVasMasterByUuidIn(Collection<String> uuids) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/vasMasterByUuidIn").build().toUriString();

		TypeReference<ResponseDto<List<VasMasterDto>>> returnType = new TypeReference<ResponseDto<List<VasMasterDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<VasMasterDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, uuids, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<VasMasterDto> getVasMasterByUuidInAndStatus(Collection<String> uuids, Boolean status) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/vasMasterByUuidIn").build().toUriString();

		TypeReference<ResponseDto<List<VasMasterDto>>> returnType = new TypeReference<ResponseDto<List<VasMasterDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		GetVasMasterMapRequestDto requestDto = GetVasMasterMapRequestDto.builder().vasItemIds(uuids).status(status).build();
		
		ResponseDto<List<VasMasterDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<VasMasterDto> findAllByDataComplete(Boolean dataComplete) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/findAll").build().toUriString();

		TypeReference<ResponseDto<List<VasMasterDto>>> returnType = new TypeReference<ResponseDto<List<VasMasterDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("dataComplete", dataComplete.toString());
		
		ResponseDto<List<VasMasterDto>> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public Page<VasMasterDto> searchVasMaster(VasMasterSearchRequestDto searchRequestDto, int pageNo, int limit) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/searchVasMaster/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<Page<VasMasterDto>>> returnType = new TypeReference<ResponseDto<Page<VasMasterDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<Page<VasMasterDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, searchRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while search from vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public Long getActiveItemsCountForCafeMenu(Collection<String> items, Boolean dataComplete) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/activeItemsCountForCafeMenu").build().toUriString();

		TypeReference<ResponseDto<Long>> returnType = new TypeReference<ResponseDto<Long>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		GetVasMasterMapRequestDto requestDto = GetVasMasterMapRequestDto.builder().vasItemIds(items).dataComplete(dataComplete).build();
		
		ResponseDto<Long> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while search from vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public PageResponse<VasMasterSearchResponseDto> search(int pageNo, int limit, VasMasterSearchRequestDto searchRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/search/{pageNo}/{limit}").build().toUriString();

		TypeReference<ResponseDto<PageResponse<VasMasterSearchResponseDto>>> returnType = new TypeReference<ResponseDto<PageResponse<VasMasterSearchResponseDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<PageResponse<VasMasterSearchResponseDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, searchRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while search from vas item master", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public VasDataCountDto getDataCount() {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/data/count").build().toUriString();

		TypeReference<ResponseDto<VasDataCountDto>> returnType = new TypeReference<ResponseDto<VasDataCountDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<VasDataCountDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public String addUpdate(VasMasterUpdateRequestDto updateRequestDto) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/add").build().toUriString();

		TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<String> responseDto = null;

		try {
			responseDto = restClient.put(path, queryParams, updateRequestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while add/update", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public String getImageUrl(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/imageUrl").build().toUriString();

		TypeReference<ResponseDto<String>> returnType = new TypeReference<ResponseDto<String>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);

		ResponseDto<String> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, null, null, null, returnType,
					MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting imageUrl", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public ImageUploadResponseDto uploadImage(MultipartFile file) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/image/upload").build().toUriString();

		TypeReference<ResponseDto<ImageUploadResponseDto>> returnType = new TypeReference<ResponseDto<ImageUploadResponseDto>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<ImageUploadResponseDto> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, file, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while uploading image", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public VasOrderDto getVasOrderDtoByUuid(String orderId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/order/byUuid").build().toUriString();

		TypeReference<ResponseDto<VasOrderDto>> returnType = new TypeReference<ResponseDto<VasOrderDto>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("orderId", orderId);
		
		ResponseDto<VasOrderDto> responseDto = null;

		try {
			responseDto = restClient.get(path, queryParams, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<VasOrderDto> getOrderForMigration(String residenceId, List<String> alreadyMigratedOrder, List<VasOrderStatus> notToInclude) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/order/orderForMigration").build().toUriString();

		TypeReference<ResponseDto<List<VasOrderDto>>> returnType = new TypeReference<ResponseDto<List<VasOrderDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("residenceId", residenceId);
		
		queryParams.add("notToInclude", notToInclude.toString());
		
		ResponseDto<List<VasOrderDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, alreadyMigratedOrder, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public List<VasOrderItemsDto> findVasOrderItemsByOrderIds(Collection<String> vasOrderIds) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/order/findVasOrderItemsByOrderIds").build().toUriString();

		TypeReference<ResponseDto<List<VasOrderItemsDto>>> returnType = new TypeReference<ResponseDto<List<VasOrderItemsDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<VasOrderItemsDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, vasOrderIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<VasOrderItemsDto> findVasOrderItemsByOrderId(String vasOrderId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/order/findVasOrderItemsByOrderId").build().toUriString();

		TypeReference<ResponseDto<List<VasOrderItemsDto>>> returnType = new TypeReference<ResponseDto<List<VasOrderItemsDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("vasOrderId", vasOrderId);
		
		ResponseDto<List<VasOrderItemsDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public List<VasMasterFeedbackOptionDto> getVasMasterFeedbackOptionByVasMasterIdInAndStatus(Collection<String> vasItemIds, Boolean status) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/master/feedback/vasMasterFeedbackOption").build().toUriString();

		TypeReference<ResponseDto<List<VasMasterFeedbackOptionDto>>> returnType = new TypeReference<ResponseDto<List<VasMasterFeedbackOptionDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("status", status.toString());
		
		ResponseDto<List<VasMasterFeedbackOptionDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, vasItemIds, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public List<VasFeedbackOptionDto> getVasFeedbackOptionByUuidIn(Collection<String> uuids) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/master/feedback/vasMasterFeedbackOption/byUuidIn").build().toUriString();

		TypeReference<ResponseDto<List<VasFeedbackOptionDto>>> returnType = new TypeReference<ResponseDto<List<VasFeedbackOptionDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<List<VasFeedbackOptionDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, uuids, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public List<VasFeedbackOptionDto> getVasFeedbackOptionByNameInAndStatus(Collection<String> uuids, Boolean status) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/master/feedback/vasMasterFeedbackOption/byNameIn").build().toUriString();

		TypeReference<ResponseDto<List<VasFeedbackOptionDto>>> returnType = new TypeReference<ResponseDto<List<VasFeedbackOptionDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		queryParams.add("status", status.toString());
		
		ResponseDto<List<VasFeedbackOptionDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, uuids, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	public Map<String, VasMasterDto> getVasMasterMapByUuidIn(Collection<String> uuids) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/vasMasterMapByUuidIn").build().toUriString();

		TypeReference<ResponseDto<Map<String, VasMasterDto>>> returnType = new TypeReference<ResponseDto<Map<String, VasMasterDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<Map<String, VasMasterDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, uuids, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public Map<String, VasMasterDto> getVasMasterMapByUuidInAndStatus(Collection<String> uuids, Boolean status) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/vasMasterMapByUuidInAndStatus").build().toUriString();

		TypeReference<ResponseDto<Map<String, VasMasterDto>>> returnType = new TypeReference<ResponseDto<Map<String, VasMasterDto>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		GetVasMasterMapRequestDto requestDto = GetVasMasterMapRequestDto.builder().vasItemIds(uuids).status(status).build();
		
		ResponseDto<Map<String, VasMasterDto>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, requestDto, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public Map<String, List<String>> getAccompaniments(Collection<String> uuids) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/accompaniments").build().toUriString();

		TypeReference<ResponseDto<Map<String, List<String>>>> returnType = new TypeReference<ResponseDto<Map<String, List<String>>>>() {};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		ResponseDto<Map<String, List<String>>> responseDto = null;

		try {
			responseDto = restClient.post(path, queryParams, uuids, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while geting data count", e);
		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	public VasItemCategoryDto getVasItemCategoryByUuid(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/vasItemCategoryByUuid").build().toUriString();

		TypeReference<ResponseDto<VasItemCategoryDto>> returnType = new TypeReference<ResponseDto<VasItemCategoryDto>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<VasItemCategoryDto> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting VasItemCategoryByUuid", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}

	
	
	
	public List<VasMasterPackagingResponseDto> getPackaging(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/packaging").build().toUriString();

		TypeReference<ResponseDto<List<VasMasterPackagingResponseDto>>> returnType = new TypeReference<ResponseDto<List<VasMasterPackagingResponseDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<List<VasMasterPackagingResponseDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting VasItemCategoryByUuid", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	
	public List<DishDetailsResponseDto> getDishDetails(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/dishDetails").build().toUriString();

		TypeReference<ResponseDto<List<DishDetailsResponseDto>>> returnType = new TypeReference<ResponseDto<List<DishDetailsResponseDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<List<DishDetailsResponseDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting VasItemCategoryByUuid", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	
	public List<VasMasterDishDto> getDishForItem(String itemId) {

		String path = UriComponentsBuilder.fromPath("/internal/cafe/vas/item/dishForItem").build().toUriString();

		TypeReference<ResponseDto<List<VasMasterDishDto>>> returnType = new TypeReference<ResponseDto<List<VasMasterDishDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("itemId", itemId);
		
		ResponseDto<List<VasMasterDishDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting dish for item", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new ArrayList<>();
	}
	
	public void updateIndex(Integer fromVasMasterId, Integer toVasMasterId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/index").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromVasMasterId", fromVasMasterId.toString());
		queryParams.add("toVasMasterId", toVasMasterId.toString());

		try {
			 restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);
		} catch (Exception e) {
			log.error("Error while updating food item", e);
		}

	}
	
	public Map<String, String> getImageUri(Collection<String> itemIds) {

		String path = UriComponentsBuilder.fromPath("/internal/cafe/vas/item/imageUri").build().toUriString();

		TypeReference<ResponseDto<Map<String, String>>> returnType = new TypeReference<ResponseDto<Map<String, String>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ResponseDto<Map<String, String>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting imageUrlMap", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : null;
	}
	
	
	
	public Map<String, CafeVasItemDto> getItemDetailsForVasItem(Collection<VasMasterDto> itemIds, Boolean basicDetailsOnly, Boolean includeImage) {

		String path = UriComponentsBuilder.fromPath("/internal/cafe/vas/item/detailsForVasItem").build().toUriString();

		TypeReference<ResponseDto<Map<String, CafeVasItemDto>>> returnType = new TypeReference<ResponseDto<Map<String, CafeVasItemDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("basicDetailsOnly", basicDetailsOnly.toString());
		queryParams.add("includeImage", includeImage.toString());
		
		ResponseDto<Map<String, CafeVasItemDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting ItemDetailsForVasItem", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
	
	public Map<String, CafeVasItemDto> getItemDetails(Collection<String> itemIds, Boolean basicDetailsOnly, Boolean includeImage){

		String path = UriComponentsBuilder.fromPath("/internal/cafe/vas/item/itemDetails/map").build().toUriString();

		TypeReference<ResponseDto<Map<String, CafeVasItemDto>>> returnType = new TypeReference<ResponseDto<Map<String, CafeVasItemDto>>>() {
		};
		
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("basicDetailsOnly", basicDetailsOnly.toString());
		queryParams.add("includeImage", includeImage.toString());
		
		ResponseDto<Map<String, CafeVasItemDto>> responseDto = null;

		try {

			responseDto = restClient.post(path, queryParams, itemIds, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting ItemDetailsForVasItem", e);

		}

		return (Objects.nonNull(responseDto) && responseDto.isStatus()) ? responseDto.getData() : new HashMap<>();
	}
	
	public void mapNewCityToPackagingCity(String cityId) {

		String path = UriComponentsBuilder.fromPath("/internal/vas/integration/mapNewCityToPackagingCity").build().toUriString();

		TypeReference<ResponseDto<Void>> returnType = new TypeReference<ResponseDto<Void>>() {
		};

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("cityId", cityId);

		try {
			restClient.post(path, queryParams, null, null, null, returnType, MediaType.APPLICATION_JSON);

		} catch (Exception e) {

			log.error("Error while getting mapNewCityToPackagingCity", e);

		}
	}
	
}

