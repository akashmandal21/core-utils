package com.stanzaliving.core.residence.client.api;


import com.stanzaliving.booking.dto.request.PricingStrategyRequestDto;
import com.stanzaliving.booking.dto.response.InventoryPricingResponseDto;
import com.stanzaliving.booking.dto.response.ServiceMixResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.core.residenceservice.dto.AttributesResponseDto;
import com.stanzaliving.core.residenceservice.dto.ResidenceBlendedPriceDto;
import com.stanzaliving.core.residenceservice.dto.*;
import com.stanzaliving.core.security.helper.SecurityUtils;
import com.stanzaliving.residence.dto.ResidencePropertyCardDto;
import com.stanzaliving.residenceservice.BookingAttributesDto;
import com.stanzaliving.residenceservice.Dto.*;
import com.stanzaliving.residenceservice.enums.ResidenceAttributes;
import com.stanzaliving.residenceservice.enums.VasCategory;
import com.stanzaliving.stayCuration.AlfredResidenceServiceDto;
import com.stanzaliving.venta.RoomInfoDto;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ResidenceDataControllerApi {
    private static final Logger log = LogManager.getLogger(ResidenceDataControllerApi.class);
    private StanzaRestClient restClient;

    public ResidenceDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }


    public ResponseDto<List<String>> fetchLockInDateForResidence(String residenceUuid, MoveInDateDto moveInDateDto) {

        log.info("Residence-Data-Controller::Processing to get lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveInDateDto);

        Object postBody = moveInDateDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/lock-in-date/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveInDateDto);
            return null;
        }
    }

    public ResponseDto<List<ResidenceLockInDto>> fetchResidenceLockInData(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get lock-in date based on residenceUuid {} ", residenceUuid);

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/lock-in/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceLockInDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceLockInDto>>>() {
        };

        try {
            return (ResponseDto<List<ResidenceLockInDto>>) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching lock-in date based on residenceUuid {}", residenceUuid);
            return null;
        }
    }

    public ResponseDto<List<ServiceMixDto>> fetchPackagedServiceForResidenceUuid(String token, String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to fetch packaged service names based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/packaged-service/get/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while fetching packaged service for residenceUuid : {}", residenceUuid);
            return null;
        }
    }

    public ResponseDto<List<ServiceMixDto>> getActivePackagedServiceInInventoryPricing(String residenceUuid, String roomUuid, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to fetch packaged service names based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("roomUuid", roomUuid);
        uriVariables.put("moveIn", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/packaged-service/residenceUuid/{residenceUuid}/room/{roomUuid}/moveIn/{moveIn}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while fetching packaged service for residenceUuid from IP : {}", residenceUuid);
            return null;
        }
    }


    public ResponseDto<Map<Object, Object>> fetchPackagedServiceData(String residenceUuid, String serviceMix) {

        log.info("Residence-Data-Controller::Processing to fetch Package service properties for residenceUuid {}, service-mix {}", residenceUuid, serviceMix);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        uriVariables.put("servicemix", serviceMix);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/packaged-service/get/{residenceUuid}/{servicemix}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<Object, Object>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<Object, Object>>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while fetching packaged service properties for residenceUuid, serviceMix : {} , {}", residenceUuid, serviceMix);
            return null;
        }
    }


    public ResponseDto<PricingDetailsResponseDto> getPricingDetails(String roomUuid, String serviceMixUuid, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUUID", roomUuid);

        uriVariables.put("serviceMixUUID", serviceMixUuid);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-pricing/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
            return null;
        }
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsV2(String roomUuid, String serviceMixUuid, String moveInDate, boolean isNonRecommendedRoom) {

        log.info("Residence-Data-Controller::Processing to get pricing detail based on move in-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("roomUUID", roomUuid);

        if(Objects.isNull(serviceMixUuid)){
            uriVariables.put("serviceMixUUID", "null");
        }else {
            uriVariables.put("serviceMixUUID", serviceMixUuid);
        }

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-pricing/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("isNonRecommendedRoom", String.valueOf(isNonRecommendedRoom));

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
            return null;
        }
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsIncludingDeprecated(String roomUuid, String serviceMixUuid, String moveInDate) {
        return this.getPricingDetailsIncludingDeprecated(roomUuid, serviceMixUuid, moveInDate, false);
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsIncludingDeprecated(String roomUuid, String serviceMixUuid, String moveInDate, boolean isNonRecommendedRoom) {

        log.info("Residence-Data-Controller::Processing to get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("roomUUID", roomUuid);

        uriVariables.put("serviceMixUUID", serviceMixUuid);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-pricing/all/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("isNonRecommendedRoom", String.valueOf(isNonRecommendedRoom));

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail based on move in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
            return null;
        }
    }

    public ResponseDto<List<AttributesResponseDto>> getResidenceAttributes(String residenceUUID) {

        log.info("Residence-Data-Controller::Processing to get list of attributes for residenceUuid {}", residenceUUID);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUUID", residenceUUID);

        String path = UriComponentsBuilder.fromPath("/internal/residence-room-attribute/{residenceUUID}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AttributesResponseDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<AttributesResponseDto>>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching list of attributes for residenceUuid {}", residenceUUID);
            return null;
        }
    }

    public List<BookingAttributesDto> getResidenceData(String residenceUuid) {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/booking-attributes/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new HttpHeaders();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<BookingAttributesDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingAttributesDto>>>() {
        };
        try {
            log.info("Executing the API for getting residence data with Url {}", path);
            ResponseDto<List<BookingAttributesDto>> response = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
            return response.getData();
        } catch (Exception exception) {
            log.error("Exception while fetching residence data from the residence Uuid- {}, Exception is ", residenceUuid, exception);
            return new ArrayList<>();
        }
    }


    public ResponseDto<RoomNumberListingAndCountDto> getAllRoomsInResidenceAndMoveIn(AdvanceRoomSearchDto advanceRoomSearchDto) {

        log.info("Residence-Data-Controller::Processing to get all rooms {}", ObjectMapperUtil.getString(advanceRoomSearchDto));

        Object postBody = advanceRoomSearchDto;

        Map<String, Object> uriVariables = new HashMap<String, Object>();

        String path = UriComponentsBuilder.fromPath("/internal/room-list/advanced").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error(var11);
            log.error("Exception while Processing to get all rooms in residenceUuid and movein-in date");
            return null;
        }
    }

    public ResponseDto<OccupanciesFloorsStatusCountSearchDto> getOccupanciesFloorsAndRoomStatusAndMoveInDateForSearch(String residenceUUID, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to filter search values for residence {} based on movein-in date {}", residenceUUID, moveInDate);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUUID);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-list/search/{residenceUuid}/move-in-date/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while filter search values for residence {} based on movein-in date {}", residenceUUID, moveInDate);
            return null;
        }
    }

    public ResponseDto<RoomInventoryDetailDto> getRoomWithInventory(String roomUUID, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get room inventories for roomUUID {} based on movein-in date {}", roomUUID, moveInDate);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUUID", roomUUID);
        uriVariables.put("moveInDate", moveInDate);
        String path = UriComponentsBuilder.fromPath("/internal/room-inventory/{roomUUID}/move-in-date/{moveInDate}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<RoomInventoryDetailDto>>() {
        };

        try {
            return (ResponseDto<RoomInventoryDetailDto>) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error(ex);
            log.error("Exception while getting room inventories for roomUUID {} based on movein-in date {}", roomUUID, moveInDate);
        }
        return null;
    }

    /**
     * This method is used for fetching residence information including room, bed and blended price's status and count
     *
     * @param residenceUuid->Unique ID corresponding to residence
     * @return Residence Bed, Room and Blended Price info(Status and Count)
     */
    public ResidenceInfoDto getResidenceInformation(String residenceUuid) {
        log.info("Residence-Data-Controller::Processing to get residence information on residenceUUID {}",
                residenceUuid);
        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/information/{residenceUuid}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResidenceInfoDto> returnType = new ParameterizedTypeReference<ResidenceInfoDto>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", residenceUuid, e);
        }
        return null;
    }

    /**
     * This method is used for fetching blended price of residence for given roomUUID
     *
     * @param roomUuid->Unique Id of room
     * @return Blended Price for residence, corresponding to room
     */
    public ResidenceBlendedPriceDto getResidenceBlendedPriceFromRoomUuid(String roomUuid) {
        log.info("Residence-Data-Controller::Processing to get residence blended price on basis of roomUuid {}", roomUuid);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUuid", roomUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/blended-price-info/{roomUuid}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResidenceBlendedPriceDto> returnType = new ParameterizedTypeReference<ResidenceBlendedPriceDto>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", roomUuid, e);
        }
        return null;
    }

    public InventoryPricingResponseDto getInventoryPricingData(String residenceUuid, String inventoryUuid, LocalDate fromDate, LocalDate toDate) {
        log.info("get pricing details for residenceUuid {}, inventoryUuid {},fromDate{}, toDate {},", residenceUuid, inventoryUuid, fromDate, toDate);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("inventoryUuid", inventoryUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/pricing/{residenceUuid}/{inventoryUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        queryParams.add("fromDate", fromDate.toString());
        queryParams.add("toDate", toDate.toString());
        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<InventoryPricingResponseDto>() {
        };

        try {
            return (InventoryPricingResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var14) {
            log.error("Exception while fetching pricing details by residenceUuid, inventoryUuid : {} , {}", residenceUuid, inventoryUuid);
            return null;
        }

    }

    public InventoryPricingResponseDto getInventoryPricingDataWithServiceMix(String residenceUuid, String inventoryUuid, String serviceMixUuid, LocalDate fromDate, LocalDate toDate) {
        log.info("get pricing details for residenceUuid {}, inventoryUuid {},fromDate{}, toDate {},", residenceUuid, inventoryUuid, fromDate, toDate);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("inventoryUuid", inventoryUuid);
        uriVariables.put("serviceMixUuid", serviceMixUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/pricing/{residenceUuid}/{inventoryUuid}/{serviceMixUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        queryParams.add("fromDate", fromDate.toString());
        queryParams.add("toDate", toDate.toString());
        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<InventoryPricingResponseDto>() {
        };

        try {
            return (InventoryPricingResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var14) {
            log.error("Exception while fetching pricing details by residenceUuid, inventoryUuid : {} , {}", residenceUuid, inventoryUuid);
            return null;
        }

    }

    public InventoryPricingResponseDto getInventoryPricingDataWithServiceMixV2(String residenceUuid, String inventoryUuid, String serviceMixUuid, LocalDate fromDate, LocalDate toDate, boolean isNonRecommendedRoom) {
        log.info("get pricing details for residenceUuid {}, inventoryUuid {},fromDate{}, toDate {},", residenceUuid, inventoryUuid, fromDate, toDate);
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("inventoryUuid", inventoryUuid);
        uriVariables.put("serviceMixUuid", serviceMixUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/pricing/{residenceUuid}/{inventoryUuid}/{serviceMixUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("fromDate", fromDate.toString());
        queryParams.add("toDate", toDate.toString());
        queryParams.add("isNonRecommendedRoom", String.valueOf(isNonRecommendedRoom));
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<InventoryPricingResponseDto> returnType = new ParameterizedTypeReference<InventoryPricingResponseDto>() {
        };
        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var14) {
            log.error("Exception while fetching pricing details by residenceUuid, inventoryUuid : {} , {}", residenceUuid, inventoryUuid);
            return null;
        }
    }

    public ResidencePropertyCardDto getResidenceDetails(String residenceUuid, String token) {
        log.info("Processing to get Residence Details");
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/api/v1/residence-property-card/{residenceUuid}")
                .buildAndExpand(uriVariables)
                .toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<ResidencePropertyCardDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidencePropertyCardDto>>() {
        };
        try {
            log.info("Executing the API for getting residence Info with Url {}", path);
            ResponseDto<ResidencePropertyCardDto> response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
            return response.getData();
        } catch (Exception exception) {
            log.error("Exception while fetching residence details from the residence Uuid- {}, Exception is ", residenceUuid, exception);
            return null;
        }
    }

    public ResidencePropertyCardDto getResidenceInternalDetails(String residenceUuid) {
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence-property-card/{residenceUuid}")
                .buildAndExpand(uriVariables)
                .toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<ResidencePropertyCardDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidencePropertyCardDto>>() {
        };
        try {
            log.info("Executing the API for getting residence Info with Url {}", path);
            ResponseDto<ResidencePropertyCardDto> response = this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
            return response.getData();
        } catch (Exception exception) {
            log.error("Exception while fetching residence details from the residence Uuid- {}, Exception is ", residenceUuid, exception);
            return null;
        }
    }

    public RoomCardDetailDto getResidenceInventoryInformation(String residenceUuid) {
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/api/v1/card-details/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<RoomCardDetailDto>() {
        };

        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return (RoomCardDetailDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", residenceUuid, var10);
            return null;
        }
    }


    public ResponseDto<List<ConvertRoomPricesDto>> getConvertRoomPrices(String token, ConvertRoomRequestDto convertRoomRequestDto) {

        log.info("Residence-Data-Controller::Processing to get convert room prices {}", convertRoomRequestDto);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Object postBody = convertRoomRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/api/v1/convert-room/price-listing").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ConvertRoomPricesDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ConvertRoomPricesDto>>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while getting convert room prices {}", convertRoomRequestDto);
        }
        return null;
    }


    public List<RoomDetailsResponseDto> getRoomDetails(List<String> roomUUID) {

        log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/room/").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        roomUUID.forEach(room -> {
            queryParams.add("roomUuid", room);
        });

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RoomDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<List<RoomDetailsResponseDto>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
        }
        return null;

    }


    public ResponseDto<String> convertRoom(String token, ConvertRoomRequestDto convertRoomRequestDto) {

        log.info("Residence-Data-Controller::Processing to get convert room {}", convertRoomRequestDto);

        Object postBody = convertRoomRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/api/v1/room/convert").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while getting convert room prices {}", convertRoomRequestDto);
        }

        return null;

    }

    public ResponseDto<String> revertRoom(String token, ConvertRoomRequestDto convertRoomRequestDto) {

        log.info("Residence-Data-Controller::Processing to get revert room {}", convertRoomRequestDto);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Object postBody = convertRoomRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/api/v1/room/revert").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while getting convert room prices {}", convertRoomRequestDto);
        }
        //todo: check log
        return null;

    }

    public ResponseDto<List<BookingAttributesDto>> getResidenceBookingAttributes(String residenceUuid) {
        log.info("Residence-Attributes-Controller::Processing to fetch residence booking attributes on residence id {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/booking-attributes/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingAttributesDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<BookingAttributesDto>>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching list of booking attributes for residenceUuid {}", residenceUuid);
            return null;
        }
    }


    public ResidenceLockInDto getResidenceLockInData(String residenceUuid,
                                                     String contractStartDate) {

        log.info("get list of ResidenceLockInDto form residenceUuid {} and contractStartDate {}", residenceUuid,
                contractStartDate);

        Map<String, Object> uriVariables = new HashMap<String, Object>();

        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("contractStartDate", contractStartDate);

        String path = UriComponentsBuilder.fromPath("/internal/get/lockIn/tenure/{residenceUuid}/{contractStartDate}")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResidenceLockInDto> returnType = new ParameterizedTypeReference<ResidenceLockInDto>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching list of ResidenceLockInDto form residenceUuid {}", residenceUuid);
            return null;
        }
    }

    public ResponseDto<List<ResidenceAttributesResponseDto>> getBookingAttributes(ResidenceAttributesRequestDto residenceAttributesRequestDto) {

        log.info("Residence-Data-Controller::Processing to get Booking Attributes{}", residenceAttributesRequestDto);

        Object postBody = residenceAttributesRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/get/booking-attributes").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();


        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceAttributesResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceAttributesResponseDto>>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while getting getting booking attributes {}", residenceAttributesRequestDto);
        }
        //todo: check log
        return null;
    }


    public CompletableFuture<RoomDetailsResponseDto> getResidenceAmenitie(String roomUUID, String token) {

        log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("roomUUID", roomUUID);

        String path = UriComponentsBuilder.fromPath("/api/v1/room/{roomUUID}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomDetailsResponseDto> returnType =
                new ParameterizedTypeReference<RoomDetailsResponseDto>() {
                };

        try {
            return CompletableFuture.completedFuture(this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType));

        } catch (Exception ex) {
            log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
        }
        return null;
    }

    public ResponseDto<String> getOccupancyDetails(int occupancy) {
        log.info("Room-Controller::Processing to fetch occupancy {} details ", occupancy);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("occupancy", occupancy);

        String path = UriComponentsBuilder.fromPath("/internal/occupancy/{occupancy}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType =
                new ParameterizedTypeReference<ResponseDto<String>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching occupancy {} description ", occupancy);
            return null;
        }

    }

    public ResponseDto<List<AttributesAndGlobalUuidDto>> getRoomConsumablesAndGlobalUUid(String roomUUID) {

        log.info("Residence-Data-Controller::Processing to get room consumerable details based on roomUUID {}", roomUUID);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUuid", roomUUID);

        String path = UriComponentsBuilder.fromPath("/internal/roomconsumables/{roomUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AttributesAndGlobalUuidDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<AttributesAndGlobalUuidDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
        }
        return null;

    }

    public ResponseDto<List<String>> getRoomInventories(String roomUUID) {

        log.info("Room-Controller::Processing to fetch room inventories details for room {} ", roomUUID);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUUID", roomUUID);

        String path = UriComponentsBuilder.fromPath("/internal/get/room-inventories/{roomUUID}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching room inventories for room {}  ", roomUUID);
            return null;
        }

    }

    public CompletableFuture<ResponseDto<List<ResidenceVasDto>>> getResidenceVas(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get vas details based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence-vas/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceVasDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ResidenceVasDto>>>() {
                };

        try {
            return CompletableFuture.completedFuture(this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType));

        } catch (Exception ex) {
            log.error("Exception while fetching vas Details from residenceUuid: {}", residenceUuid);
        }
        return null;
    }

    public CompletableFuture<ResponseDto<Map<Object, Object>>> fetchPackagedService(String token, String residenceUuid, String serviceMix) {

        log.info("Residence-Data-Controller::Processing to fetch Package service properties for residenceUuid {}, service-mix {}", residenceUuid, serviceMix);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for fetching package service based on residenceUuid");
        }

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        uriVariables.put("servicemix", serviceMix);

        String path = UriComponentsBuilder.fromPath("/api/v1/packaged-service/get/{residenceUuid}/{servicemix}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<Object, Object>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<Object, Object>>>() {
                };

        try {
            return CompletableFuture.completedFuture((ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType));
        } catch (Exception var12) {
            log.error("Exception while fetching packaged service properties for residenceUuid, serviceMix : {} , {}", residenceUuid, serviceMix);
            return null;
        }
    }

    public ResponseDto<OccupanciesFloorsStatusCountSearchDto> getOccupanciesFloorsAndRoomStatusForSearch(String residenceUuid) {

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/room-list/search/dropdown/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();
        String tokenValue = SecurityConstants.TOKEN_HEADER_NAME + "=" + SecurityUtils.getCurrentUserToken();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenValue);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching occupancy floor dto for residence uuid {} with message:{} ", residenceUuid, e.getMessage());
            return null;
        }

    }

    public List<RoomInventoryLogDto> getInventoryDetails(InventoryDetailsRequestDto inventoryDetailsRequestDto) {

        log.info("Residence-Data-Controller::Processing to get inventory Details{}", inventoryDetailsRequestDto);

        Object postBody = inventoryDetailsRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/inventory-details").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();


        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RoomInventoryLogDto>> returnType = new ParameterizedTypeReference<List<RoomInventoryLogDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while getting getting inventory details {}", inventoryDetailsRequestDto);
        }
        //todo: check log
        return null;
    }


    public RoomDetailsResponseDto getRoomByNumber(String roomNumber) {

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("roomNumber", roomNumber);

        String path = UriComponentsBuilder.fromPath("/internal/room/{roomNumber}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();
        String tokenValue = SecurityConstants.TOKEN_HEADER_NAME + "=" + SecurityUtils.getCurrentUserToken();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenValue);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomDetailsResponseDto> returnType =
                new ParameterizedTypeReference<RoomDetailsResponseDto>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching room details for room {} ", roomNumber);
            return null;
        }

    }

    public List<RoomAndInventoryDetailsDto> getRoomAndInventoryDetails(String roomUuid, List<String> inventoryUuids) {

        RoomInventoryDetailsRequestDto roomInventoryDetailsRequestDto = new RoomInventoryDetailsRequestDto();
        roomInventoryDetailsRequestDto.setInventoryUuids(inventoryUuids);
        roomInventoryDetailsRequestDto.setRoomUuid(roomUuid);

        log.info("Residence-Data-Controller::Processing to get inventory Details{}", roomInventoryDetailsRequestDto);

        Object postBody = roomInventoryDetailsRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/room/inventory-details").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RoomAndInventoryDetailsDto>> returnType = new ParameterizedTypeReference<List<RoomAndInventoryDetailsDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while getting getting inventory details {}", roomInventoryDetailsRequestDto);
        }
        //todo: check log
        return null;
    }

    public ResponseDto<List<RoomAndInventoryDetailsDto>> getRoomOccupancyChangeLog(String roomUuid, String moveIn) {

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUuid", roomUuid);
        uriVariables.put("moveIn", moveIn);

        String path = UriComponentsBuilder.fromPath("/internal/room/{roomUuid}/moveIn/{moveIn}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<RoomAndInventoryDetailsDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<RoomAndInventoryDetailsDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching ROCL list form room UUid {}  ", roomUuid);
            return null;
        }
    }

    public List<ResidencePaymentPlanDto> getInstallmentList(String residenceUuid) {

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/get/paymentTerm/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<ResidencePaymentPlanDto>> returnType =
                new ParameterizedTypeReference<List<ResidencePaymentPlanDto>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching paymentTerm list form residenceUuid {}  ", residenceUuid);
            return null;
        }
    }


    public ResponseDto<AttributesResponseDto> getResidenceAttribute(String residenceUUID, ResidenceAttributes attributeName) {

        log.info("Residence-Data-Controller::Processing to get attributes for residenceUuid {} and attributeName {}", residenceUUID, attributeName);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUUID", residenceUUID);
        uriVariables.put("attributeName", attributeName);
        String path = UriComponentsBuilder.fromPath("/internal/booking-attributes/specific/{residenceUUID}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        queryParams.add("key", attributeName.toString());
        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<AttributesResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<AttributesResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching list of attributes for residenceUuid {}", residenceUUID);
            return null;
        }
    }


    public RoomDetailsResponseDto getRoomDetails(String roomUuid) {

        log.info("Residence-Data-Controller::Processing to get Room detail response for room uuid {}", roomUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUuid", roomUuid);

        String path = UriComponentsBuilder.fromPath("/internal/roomDetail/{roomUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomDetailsResponseDto> returnType =
                new ParameterizedTypeReference<RoomDetailsResponseDto>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching getting room detail for room uuid {}", roomUuid);
            log.error(var10);
            return null;
        }
    }


    public ResponseDto<List<AttributesAndGlobalUuidDto>> getRoomConsumables(String roomUuid) {

        log.info("Residence-Data-Controller::Processing to get Room detail consumables response for room uuid {}", roomUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUuid", roomUuid);

        String path = UriComponentsBuilder.fromPath("/internal/roomconsumables/{roomUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AttributesAndGlobalUuidDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<AttributesAndGlobalUuidDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while fetching getting room detail consumables for room uuid {}", roomUuid);
            log.error(var11);
            return null;
        }
    }

    public ResidencePaymentModeDto getPaymentModes(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get payment mode for residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residencePaymentMode/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidencePaymentModeDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<ResidencePaymentModeDto>>() {
                };
        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType).getData();
        } catch (Exception var10) {
            log.error("Exception while fetching getting payment mode for residenceUuid {}", residenceUuid);
            log.error(var10);
            return null;
        }

    }

    public ResponseDto<OccupanciesFloorsStatusCountSearchDto> getFloorsAndRoomStatusFilterForManagedApartment(List<String> residenceUuid, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to filter search values for residence {} based on movein-in date {}", residenceUuid, moveInDate);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/managed-apartment/floor/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, residenceUuid, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while filter search values for residence {} based on movein-in date {}", residenceUuid, moveInDate);
            return null;
        }
    }

    public ResponseDto<Map<String, Object>> fetchPackagedServiceData(String uuid) {

        log.info("Residence-Data-Controller::Processing to fetch Package service for service-mix uuid {}", uuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("uuid", uuid);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/packaged-service/{uuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, Object>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<String, Object>>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching packaged service for service-mix uuid {}", uuid);
            return null;
        }
    }

    public List<ResidenceVasDto> getResidenceVasDetails(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get vas details based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence-vas/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceVasDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ResidenceVasDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();

        } catch (Exception ex) {
            log.error("Exception while fetching vas Details from residenceUuid: {}", residenceUuid);
        }
        return null;
    }

    public List<RoomInfoDto> getRoomDetailsForResidence(String residenceUuid) {
        Object postBody = null;

        List<RoomInfoDto> roomInfoDto = new ArrayList<>();
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/roomInfo/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RoomInfoDto>> returnType = new ParameterizedTypeReference<List<RoomInfoDto>>() {
        };

        try {
            roomInfoDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching room numbers list for residence {} ", residenceUuid);
        }

        return roomInfoDto;
    }

    public ResponseDto<RoomConsumablesDto> getConsumablesPrices(String residenceUuid) {
        log.info("Residence-Data-Controller::Processing to consumablePrices for residence uuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/v1/consumables-prices/ims/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RoomConsumablesDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<RoomConsumablesDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var14) {
            log.error("Exception while fetching consumable prices for residence uuid {}", residenceUuid);
            return null;
        }
    }

    public ResponseDto<RoomInventoryDetailDto> getRoomWithInventoryForManagedApartment(String residenceUuid, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get room inventories for residenceUuid {} based on movein-in date {}", residenceUuid, moveInDate);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("moveInDate", moveInDate);
        String path = UriComponentsBuilder.fromPath("/internal/managed-apartment/room-inventory/{residenceUuid}/move-in-date/{moveInDate}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<RoomInventoryDetailDto>>() {
        };

        try {
            return (ResponseDto<RoomInventoryDetailDto>) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error(ex);
            log.error("Exception while getting room inventories for residenceUuid {} based on movein-in date {}", residenceUuid, moveInDate);
        }
        return null;
    }

    public ResponseDto<ServiceMixResponse> getInventoryServiceMix(String inventoryUUid, String moveInDate) {
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("inventoryUUid", inventoryUUid);
        uriVariables.put("moveInDate", moveInDate);
        String path = UriComponentsBuilder.fromPath("/internal/current-service-mix/inventory/{inventoryUUid}/moveInDate/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<ServiceMixResponse>>() {
        };
        try {
            return (ResponseDto<ServiceMixResponse>) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error(ex);
            log.error("Exception while getting room inventories service mix for  inventoryUUid {} based on movein-in date {}", inventoryUUid, moveInDate);
        }
        return null;
    }

    public InventoryPricingResponseDto getInventoryPricingDataForMultipleInventory(String residenceUuid, Set<String> inventoryUuid, LocalDate fromDate, LocalDate toDate, String serviceMixUuid) {
        log.info("get pricing details for residenceUuid {}, inventoryUuidList {},fromDate{}, toDate {},", residenceUuid, inventoryUuid, fromDate, toDate);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/get/pricing/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        queryParams.add("fromDate", fromDate.toString());
        queryParams.add("toDate", toDate.toString());
        queryParams.add("serviceMixUuid", serviceMixUuid);
        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<InventoryPricingResponseDto>() {
        };

        try {
            return (InventoryPricingResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, inventoryUuid, headerParams, accept, returnType);
        } catch (Exception var14) {
            log.error("Exception while fetching pricing details by residenceUuid, inventoryUuidList : {} , {}", residenceUuid, inventoryUuid);
            return null;
        }

    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsForMultipleRooms(List<String> roomUuidList, String serviceMixUuid, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuidList {}", moveInDate, serviceMixUuid, roomUuidList);

        Map<String, Object> uriVariables = new HashMap();

        if(Objects.isNull(serviceMixUuid)){
            uriVariables.put("serviceMixUUID", "null");
        }else {
            uriVariables.put("serviceMixUUID", serviceMixUuid);
        }

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-pricing/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, roomUuidList, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuidList {}", moveInDate, serviceMixUuid, roomUuidList);
            return null;
        }
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsForMultipleRoomsInCaseOfContractModification(List<String> roomUuidList, String serviceMixUuid, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuidList {}", moveInDate, serviceMixUuid, roomUuidList);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("serviceMixUUID", serviceMixUuid);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-pricing/all/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, roomUuidList, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail based on movein-in date {} , serviceMixUuid {}, roomUuidList {}", moveInDate, serviceMixUuid, roomUuidList);
            return null;
        }
    }


    public ResponseDto<RoomNumberListingAndCountDto> getAllRoomsCardDetails(AdvanceRoomSearchDto advanceRoomSearchDto) {

        log.info("Residence-Data-Controller::Processing to get all rooms in residenceUuid and movein-in date {}", advanceRoomSearchDto);

        Object postBody = advanceRoomSearchDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/room-list").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error(var11);
            log.error("Exception while Processing to get all rooms in residenceUuid and movein-in date");
            return null;
        }
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsForManagedApartment(String roomUuid, String serviceMixUuid, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to get pricing detail for managed-apartment based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUUID", roomUuid);

        uriVariables.put("serviceMixUUID", serviceMixUuid);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/managed-apartment/room-pricing/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail for managed-apartment based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
            return null;
        }
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetailsForManagedApartmentIncludingDeprecated(String roomUuid, String serviceMixUuid, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to get pricing detail for managed-apartment based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUUID", roomUuid);

        uriVariables.put("serviceMixUUID", serviceMixUuid);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/managed-apartment/room-pricing/all/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail for managed-apartment based on movein-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
            return null;
        }
    }

    public ResponseDto<List<AttributesAndGlobalUuidDto>> getRoomConsumablesAndGlobalUUidForAllRooms(List<String> roomUuid) {

        log.info("Residence-Data-Controller::Processing to get room consumables details based on list of roomUuid {}", roomUuid);

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/room-consumables").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AttributesAndGlobalUuidDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<AttributesAndGlobalUuidDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, roomUuid, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching Room Details for list of roomUuid: {}", roomUuid);
        }
        return null;

    }

    public ResponseDto<Float> getInventoryBedsCountByMoveInDate(String roomUuid, String inventoryUuid, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get inventory bed count for room {} and inventory {} and move in date {} ", roomUuid, inventoryUuid, moveInDate);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUuid", roomUuid);
        uriVariables.put("inventoryUuid", inventoryUuid);
        uriVariables.put("moveInDate", moveInDate);
        String path = UriComponentsBuilder.fromPath("/internal/room/{roomUuid}/inventory/{inventoryUuid}/moveInDate/{moveInDate}/bed-count").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Float>> returnType =
                new ParameterizedTypeReference<ResponseDto<Float>>() {
                };
        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while fetching inventory bed count for room {} and inventory {} ", roomUuid, inventoryUuid);
            return null;
        }
    }

    public ResponseDto<Float> getInventoryBedsCount(String roomUuid, String inventoryUuid) {

        log.info("Residence-Data-Controller::Processing to get inventory bed count for room {} and inventory {} ", roomUuid, inventoryUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUuid", roomUuid);

        uriVariables.put("inventoryUuid", inventoryUuid);

        String path = UriComponentsBuilder.fromPath("/internal/update/booking-inventory-occupancy/beds/{roomUuid}/{inventoryUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Float>> returnType =
                new ParameterizedTypeReference<ResponseDto<Float>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while fetching inventory bed count for room {} and inventory {} ", roomUuid, inventoryUuid);
            return null;
        }
    }

    public ResponseDto<RoomNumberListingAndCountDto> getApartmentCount(AdvanceRoomSearchDto advanceRoomSearchDto) {
        Object postBody = advanceRoomSearchDto;
        log.info("Residence-Data-Controller::Processing to get apartment count {} ", advanceRoomSearchDto.getMicroMarketId());

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/apartment-count").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>>() {
                };

        try {
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching apartment count for micromarket {} ", advanceRoomSearchDto.getMicroMarketId(), e);
            return null;
        }
    }

    public OccupancyPricingAndRoomAttributesResponseDto getResidenceOccupancyPricing(String residenceUuid, String propertyEntityType) {

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        uriVariables.put("propertyEntityType", propertyEntityType);

        String path = UriComponentsBuilder.fromPath("/internal/residence/occupancy-pricing/{residenceUuid}/{propertyEntityType}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<OccupancyPricingAndRoomAttributesResponseDto> returnType =
                new ParameterizedTypeReference<OccupancyPricingAndRoomAttributesResponseDto>() {
                };

        try {
            return (OccupancyPricingAndRoomAttributesResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching residence occupancy pricing information based on residenceUUID {}, Exception is ", residenceUuid, var10);
            return null;
        }
    }

    public OccupancyPricingAndRoomAttributesResponseDto getResidenceOccupancyPricingV2(String residenceUuid, String propertyEntityType) {

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        uriVariables.put("propertyEntityType", propertyEntityType);

        String path = UriComponentsBuilder.fromPath("/internal/residence/occupancy-pricing/{residenceUuid}/{propertyEntityType}/v2").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<OccupancyPricingAndRoomAttributesResponseDto> returnType =
                new ParameterizedTypeReference<OccupancyPricingAndRoomAttributesResponseDto>() {
                };

        try {
            return (OccupancyPricingAndRoomAttributesResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching residence occupancy pricing information based on residenceUUID {}, Exception is ", residenceUuid, var10);
            return null;
        }
    }

    public ResidenceVasDto getGlobalVasDetails(String globalVasUuid) {

        log.info("Residence-Data-Controller::Processing to get vas details based on globalVasUUid {}", globalVasUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("globalVasUuid", globalVasUuid);

        String path = UriComponentsBuilder.fromPath("/internal/global-vas-details/{globalVasUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidenceVasDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<ResidenceVasDto>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();

        } catch (Exception ex) {
            log.error("Exception while fetching vas Details from global vas uuid: {}", globalVasUuid);
        }
        return null;
    }

    public ResidenceVasDto getResidenceVasDetails(String globalVasUuid, String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get vas details based on globalVasUUid {} and residence uuid {}", globalVasUuid, residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("globalVasUuid", globalVasUuid);
        uriVariables.put("residenceUuid", residenceUuid);


        String path = UriComponentsBuilder.fromPath("/internal/residence/{residenceUuid}/global-vas-details/{globalVasUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidenceVasDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<ResidenceVasDto>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();

        } catch (Exception ex) {
            log.error("Exception while fetching vas Details :Error is {}", ex.getMessage());
        }
        return null;
    }

    public ResponseDto<PricingStrategyRulesResponseDto> getAllStrategies(PricingStrategyRequestDto requestDto) {

        log.info("get all pricing strategy based on for req:: {} ", requestDto);
        log.info(requestDto);
        Object postBody = requestDto;
        String path = UriComponentsBuilder.fromPath("/internal/pricing-strategy/getApplicableStrategy").toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PricingStrategyRulesResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PricingStrategyRulesResponseDto>>() {
        };
        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.info("exception :: {}", e.toString());
            return null;
        }

    }

    public String getStrategiesQuote(PricingStrategyRequestDto requestDto) {

        log.info("get all pricing strategy based on for req " + requestDto);
        Object postBody = requestDto;
        String path = UriComponentsBuilder.fromPath("/internal/pricing-strategy/getQuote").toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };
        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.info("Error while fetching data from residence-service: {}", e.getMessage());
        }
        return null;
    }

    public RoomCardDetailDto getCardDetailsForPricing(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get pricing details based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence/api/v1/pricing-details/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomCardDetailDto> returnType =
                new ParameterizedTypeReference<RoomCardDetailDto>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {

            log.error("Exception while fetching pricing Details from residenceUuid: {}", residenceUuid);
        }
        return null;
    }

    public RoomCardDetailDto getCardDetailsForPricingUpdate(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get pricing details based on residence uuid {}", residenceUuid);
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/api/v1/pricing-details/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<RoomCardDetailDto> returnType =
                new ParameterizedTypeReference<RoomCardDetailDto>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {

            log.error("Exception while fetching pricing Details from residenceUuid: {}", residenceUuid);
        }
        return null;
    }

    public RoomCardDetailDto getMaxMinRoomPricing(String residenceUuid) {
        log.info("Residence-Data-Controller::Processing to get pricing details based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence/api/v1/room-pricing-details/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomCardDetailDto> returnType =
                new ParameterizedTypeReference<RoomCardDetailDto>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching pricing Details from residenceUuid: {}", residenceUuid);
        }
        return null;
    }

    public RoomCardDetailDto getSingleRoomPricing(List<String> roomUuids) {
        Object postBody = roomUuids;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/residence/api/v1/single-room-pricing-details").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomCardDetailDto> returnType = new ParameterizedTypeReference<RoomCardDetailDto>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception ex {}, while getting getting price details", ex);
        }
        return null;
    }

    //    public PricingStrategyBookingDto getAllStrategiesList(PricingStrategyRequestDto requestDto) {
//
//        log.info("Request body is mentioned below");
//        log.info(requestDto);
//        Object postBody = requestDto;
//        String path = UriComponentsBuilder.fromPath("/internal/pricing-strategy/get").toUriString();
//        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
//        HttpHeaders headerParams = new HttpHeaders();
//        String[] accepts = new String[]{"*/*"};
//        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
//        ParameterizedTypeReference<PricingStrategyBookingDto> returnType = new ParameterizedTypeReference<PricingStrategyBookingDto>() {
//        };
//        try{
//            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
//        }catch (Exception e){
//            log.info("exception :: {}", e);
//            return null;
//        }
//
//    }
    public ResponseDto<String> getMetricsCron(String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to get vas details based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/residence/{residenceUuid}/metrics-cron").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType =
                new ParameterizedTypeReference<ResponseDto<String>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching vas Details from residenceUuid: {}", residenceUuid);
        }
        return null;
    }

    public ResponseDto<String> getEscalationAlert() {

        log.info("Residence-Data-Controller::for Escalation Alert");

        Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence-escalation/escalation-alert").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType =
                new ParameterizedTypeReference<ResponseDto<String>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while Escalation Alert", ex);
        }
        return null;
    }

    public ResponseDto<Map<Double, List<Double>>> getEscalationTracker(String uuid, String roomUuid, String moveIn) {

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("uuid", uuid);
        uriVariables.put("roomUuid", roomUuid);
        uriVariables.put("moveIn", moveIn);

        String path = UriComponentsBuilder.fromPath("/internal/residence-escalation/escalation-tracker/residence/{uuid}/room-uuid/{roomUuid}/move-in/{moveIn}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<Double, List<Double>>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<Double, List<Double>>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching Details", ex);
        }
        return null;
    }

    public ResponseDto<String> getAccessLevelConfigValue(String residenceUuid, String configKey) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("configKey", configKey);
        String path = UriComponentsBuilder.fromPath("/internal/residence/{residenceUuid}/config-key/{configKey}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception ex) {
            log.error("Exception while fetching Details", ex);
        }
        return null;
    }


    public ResponseDto<List<String>> getAllInventories(String roomUuid, String moveIn) {

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("roomUuid", roomUuid);
        uriVariables.put("moveIn", moveIn);

        String path = UriComponentsBuilder.fromPath("/internal/available-inventories/room-uuid/{roomUuid}/move-in/{moveIn}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<String>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching all inventories", ex);
        }
        return null;
    }
    public ResponseDto<?> sendIMSEmailDigest() {
        log.info("IMS Email Digest ");
        try {

            Object postBody = null;

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/residence/digest").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<?>> returnType = new ParameterizedTypeReference<ResponseDto<?>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Exception occurred while sending IMS Email Digest", e);
            return null;
        }
    }

    public ResponseDto<List<Integer>> getRemoteBookingTokenAmountList(String residenceUuid) {

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/remote-booking-amount/{residenceUuid}/get").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<Integer>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<Integer>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching token amount list for remote booking", ex);
        }
        return null;
    }

    public ResponseDto<List<RoomParticularDto>> getAllRooms(String residenceUuid) {

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/available-rooms/residence-uuid/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<RoomParticularDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<RoomParticularDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching all rooms", ex);
        }
        return null;
    }

    public List<ResidenceVasDto> getResidenceVasDetailsByCategory(String residenceUuid, VasCategory category) {

        log.info("Residence-Data-Controller::Processing to get vas details based on residenceUuid {}", residenceUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence-vas/{residenceUuid}/category").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        String vasCategory = Objects.nonNull(category) ? category.toString(): null;

        queryParams.put("vasCategory", Collections.singletonList(vasCategory));

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceVasDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ResidenceVasDto>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType).getData();

        } catch (Exception ex) {
            log.error("Exception while fetching vas Details from residenceUuid: {}", residenceUuid);
        }
        return Collections.emptyList();
    }

    public ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>> getPlansByServiceMix(String serviceMixUuid, List<VasCategory> vasCategoryList) {

        log.info("Residence-Data-Controller::Processing to get plan details based on serviceMixUuid {}", serviceMixUuid);

        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("serviceMixUuid", serviceMixUuid);

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if(CollectionUtils.isNotEmpty(vasCategoryList)) {
            List<String> vasCategories = vasCategoryList.stream().map(Enum::toString).collect(Collectors.toList());
            queryParams.put("vasCategory", vasCategories);
        }

        String path = UriComponentsBuilder.fromPath("/stay-curation/internal/paid-services/service-mix/{serviceMixUuid}/plans/").buildAndExpand(uriVariables).toUriString();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>> returnType =
                new ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>>() {
                };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

        } catch (Exception ex) {
            log.error("Exception while fetching plan details for serviceMixUuid: {}", serviceMixUuid);
        }
        return null;
    }

    public ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>> fetchOptedPlans(List<String> planUuids) {

        log.info("Residence-Data-Controller::Processing to fetch plan details based on plan uuids {}", planUuids);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/stay-curation/internal/paid-services/plans/").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<VasCategory, List<AlfredResidenceServiceDto>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<VasCategory,List<AlfredResidenceServiceDto>>>>() {
        };

        try {
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, planUuids, headerParams, accept, returnType);
        } catch (Exception var13) {
            log.error("Exception while fetching plan details based on plan uuids  {}", planUuids);
            return null;
        }
    }

}