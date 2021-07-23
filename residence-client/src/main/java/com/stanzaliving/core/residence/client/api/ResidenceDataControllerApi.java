package com.stanzaliving.core.residence.client.api;

import com.stanzaliving.booking.dto.response.InventoryPricingResponseDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.residenceservice.dto.*;
import com.stanzaliving.residence.dto.ResidencePropertyCardDto;
import com.stanzaliving.residenceservice.BookingAttributesDto;
import com.stanzaliving.residenceservice.Dto.AttributesAndGlobalUuidDto;
import com.stanzaliving.residenceservice.Dto.ResidenceAttributesRequestDto;
import com.stanzaliving.residenceservice.Dto.ResidenceAttributesResponseDto;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ResidenceDataControllerApi {
    private static final Logger log = LogManager.getLogger(ResidenceDataControllerApi.class);
    private StanzaRestClient restClient;

    public ResidenceDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    /**
     * This method is used to fetch room details
     *
     * @param roomUUID->Unique Room ID corresponding to room
     * @param token->Security  token
     * @return RoomDetails
     */
    public RoomDetailsResponseDto getRoomDetails(String roomUUID, String token) {

        log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("roomUUID", roomUUID);

        String path = UriComponentsBuilder.fromPath("/api/v1/room/{roomUUID}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<RoomDetailsResponseDto> returnType =
                new ParameterizedTypeReference<RoomDetailsResponseDto>() {
                };

        try {
            return (RoomDetailsResponseDto) this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object) null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
            return null;
        }
    }


    public ResponseDto<List<String>> fetchLockInDateForResidence(String token, String residenceUuid, MoveInDateDto moveInDateDto) {

        log.info("Residence-Data-Controller::Processing to get lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveInDateDto);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }


        Object postBody = moveInDateDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/lock-in-date/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

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


    public ResponseDto<List<ServiceMixDto>> fetchPackagedServiceForResidenceUuid(String token, String residenceUuid) {

        log.info("Residence-Data-Controller::Processing to fetch packaged service names based on residenceUuid {}", residenceUuid);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving packaged service names based on residenceUuid");
        }

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/api/v1/packaged-service/get/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

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


    public ResponseDto<Map<Object, Object>> fetchPackagedServiceData(String token, String residenceUuid, String serviceMix) {

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
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType).getData();
    }


    public ResponseDto<RoomNumberListingAndCountDto> getAllRoomsInResidenceAndMoveIn(AdvanceRoomSearchDto advanceRoomSearchDto) {

        log.info("Residence-Data-Controller::Processing to get all rooms in residenceUuid {} and movein-in {} date");

        Object postBody = advanceRoomSearchDto;

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/room-list/advanced").buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<OccupanciesFloorsStatusCountSearchDto> getOccupanciesFloorsAndRoomStatusAndMoveInDateForSearch(String residenceUUID, String moveInDate) {

        log.info("Residence-Data-Controller::Processing to filter search values for residence {} based on movein-in date {}", residenceUUID, moveInDate);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("residenceUuid", residenceUUID);

        uriVariables.put("moveInDate", moveInDate);

        String path = UriComponentsBuilder.fromPath("/internal/room-list/search/{residenceUuid}/movein-in-date/{moveInDate}").buildAndExpand(uriVariables).toUriString();

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
        String path = UriComponentsBuilder.fromPath("/internal/room-inventory/{roomUUID}/movein-in-date/{moveInDate}").buildAndExpand(uriVariables).toUriString();
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

    public InventoryPricingResponseDto getInventoryPricingData(String residenceUuid, String inventoryUuid, LocalDate fromDate, LocalDate toDate, String token) {
        log.info("get pricing details for residenceUuid {}, inventoryUuid {},fromDate{}, toDate {},", residenceUuid, inventoryUuid, fromDate, toDate);
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for fetching Pricing details");
        } else {
            Map<String, Object> uriVariables = new HashMap();
            uriVariables.put("residenceUuid", residenceUuid);
            uriVariables.put("inventoryUuid", inventoryUuid);
            String path = UriComponentsBuilder.fromPath("/api/v1/get/pricing/{residenceUuid}/{inventoryUuid}").buildAndExpand(uriVariables).toUriString();
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
            queryParams.add("fromDate", fromDate.toString());
            queryParams.add("toDate", toDate.toString());
            HttpHeaders headerParams = new HttpHeaders();
            headerParams.add("Cookie", "token=" + token);
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


    public List<RoomDetailsResponseDto> getRoomDetails(List<String> roomUUID, String token) {

        log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/api/v1/room/").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        roomUUID.forEach(room -> {
            queryParams.add("roomUuid", room);
        });

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

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
			return CompletableFuture.completedFuture( this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType));

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

    public ResponseDto<List<AttributesAndGlobalUuidDto>> getRoomConsumablesAndGlobalUUid(String roomUUID, String token) {

        log.info("Residence-Data-Controller::Processing to get room consumerable details based on roomUUID {}", roomUUID);

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUuid", roomUUID);

        String path = UriComponentsBuilder.fromPath("/api/v1/roomconsumables/{roomUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);

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

}
