//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.stanzaliving.core.residence.client.api;

import com.stanzaliving.booking.dto.response.InventoryPricingResponseDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.residenceservice.dto.AdvanceRoomSearchDto;
import com.stanzaliving.core.residenceservice.dto.AttributesResponseDto;
import com.stanzaliving.core.residenceservice.dto.MoveInDateDto;
import com.stanzaliving.core.residenceservice.dto.OccupanciesFloorsStatusCountSearchDto;
import com.stanzaliving.core.residenceservice.dto.PricingDetailsResponseDto;
import com.stanzaliving.core.residenceservice.dto.ResidenceBlendedPriceDto;
import com.stanzaliving.core.residenceservice.dto.ResidenceInfoDto;
import com.stanzaliving.core.residenceservice.dto.RoomCardDetailDto;
import com.stanzaliving.core.residenceservice.dto.RoomDetailsResponseDto;
import com.stanzaliving.core.residenceservice.dto.RoomInventoryDetailDto;
import com.stanzaliving.core.residenceservice.dto.RoomNumberListingAndCountDto;
import com.stanzaliving.core.residenceservice.dto.ServiceMixDto;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

public class ResidenceDataControllerApi {
    private static final Logger log = LogManager.getLogger(ResidenceDataControllerApi.class);
    private StanzaRestClient restClient;

    public ResidenceDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public RoomDetailsResponseDto getRoomDetails(String roomUUID, String token) {
        log.info("Residence-Data-Controller::Processing to get room details based on roomUUID {}", roomUUID);
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        } else {
            Map<String, Object> uriVariables = new HashMap();
            uriVariables.put("roomUUID", roomUUID);
            String path = UriComponentsBuilder.fromPath("/api/v1/room/{roomUUID}").buildAndExpand(uriVariables).toUriString();
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
            HttpHeaders headerParams = new HttpHeaders();
            headerParams.add("Cookie", "token=" + token);
            String[] accepts = new String[]{"*/*"};
            List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference returnType = new ParameterizedTypeReference<RoomDetailsResponseDto>() {
            };

            try {
                return (RoomDetailsResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
            } catch (Exception var11) {
                log.error("Exception while fetching Room Details from roomUuid: {}", roomUUID);
                return null;
            }
        }
    }

    public ResponseDto<List<String>> fetchLockInDateForResidence(String token, String residenceUuid, MoveInDateDto moveInDateDto) {
        log.info("Residence-Data-Controller::Processing to get lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveInDateDto);
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        } else {
            Object postBody = moveInDateDto;
            Map<String, Object> uriVariables = new HashMap();
            uriVariables.put("residenceUuid", residenceUuid);
            String path = UriComponentsBuilder.fromPath("/api/v1/lock-in-date/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
            HttpHeaders headerParams = new HttpHeaders();
            headerParams.add("Cookie", "token=" + token);
            String[] accepts = new String[]{"*/*"};
            List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
            };

            try {
                return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
            } catch (Exception var13) {
                log.error("Exception while fetching lock-in date based on residenceUuid {} and moveInDate {}", residenceUuid, moveInDateDto);
                return null;
            }
        }
    }

    public ResponseDto<List<ServiceMixDto>> fetchPackagedServiceForResidenceUuid(String token, String residenceUuid) {
        log.info("Residence-Data-Controller::Processing to fetch packaged service names based on residenceUuid {}", residenceUuid);
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving packaged service names based on residenceUuid");
        } else {
            Map<String, Object> uriVariables = new HashMap();
            uriVariables.put("residenceUuid", residenceUuid);
            String path = UriComponentsBuilder.fromPath("/api/v1/packaged-service/get/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
            HttpHeaders headerParams = new HttpHeaders();
            headerParams.add("Cookie", "token=" + token);
            String[] accepts = new String[]{"*/*"};
            List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<List<ServiceMixDto>>>() {
            };

            try {
                return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
            } catch (Exception var11) {
                log.error("Exception while fetching packaged service for residenceUuid : {}", residenceUuid);
                return null;
            }
        }
    }

    public ResponseDto<Map<Object, Object>> fetchPackagedServiceData(String token, String residenceUuid, String serviceMix) {
        log.info("Residence-Data-Controller::Processing to fetch Package service properties for residenceUuid {}, service-mix {}", residenceUuid, serviceMix);
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for fetching package service based on residenceUuid");
        } else {
            Map<String, Object> uriVariables = new HashMap();
            uriVariables.put("residenceUuid", residenceUuid);
            uriVariables.put("servicemix", serviceMix);
            String path = UriComponentsBuilder.fromPath("/api/v1/packaged-service/get/{residenceUuid}/{servicemix}").buildAndExpand(uriVariables).toUriString();
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
            HttpHeaders headerParams = new HttpHeaders();
            headerParams.add("Cookie", "token=" + token);
            String[] accepts = new String[]{"*/*"};
            List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
            ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<Map<Object, Object>>>() {
            };

            try {
                return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
            } catch (Exception var12) {
                log.error("Exception while fetching packaged service properties for residenceUuid, serviceMix : {} , {}", residenceUuid, serviceMix);
                return null;
            }
        }
    }

    public ResponseDto<PricingDetailsResponseDto> getPricingDetails(String roomUuid, String serviceMixUuid, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get pricing detail based on move-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUUID", roomUuid);
        uriVariables.put("serviceMixUUID", serviceMixUuid);
        uriVariables.put("moveInDate", moveInDate);
        String path = UriComponentsBuilder.fromPath("/internal/room-pricing/{roomUUID}/{serviceMixUUID}/{moveInDate}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<PricingDetailsResponseDto>>() {
        };

        try {
            return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var12) {
            log.error("Exception while get pricing detail based on move-in date {} , serviceMixUuid {}, roomUuid {}", moveInDate, serviceMixUuid, roomUuid);
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
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<List<AttributesResponseDto>>>() {
        };

        try {
            return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching list of attributes for residenceUuid {}", residenceUUID);
            return null;
        }
    }

    public ResponseDto<RoomNumberListingAndCountDto> getAllRoomsInResidenceAndMoveIn(AdvanceRoomSearchDto advanceRoomSearchDto) {
        log.info("Residence-Data-Controller::Processing to get all rooms in residenceUuid {} and move-in {} date");
        Object postBody = advanceRoomSearchDto;
        Map<String, Object> uriVariables = new HashMap();
        String path = UriComponentsBuilder.fromPath("/internal/room-list/advanced").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<RoomNumberListingAndCountDto>>() {
        };

        try {
            return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error(var11);
            log.error("Exception while Processing to get all rooms in residenceUuid and move-in date");
            return null;
        }
    }

    public ResponseDto<OccupanciesFloorsStatusCountSearchDto> getOccupanciesFloorsAndRoomStatusAndMoveInDateForSearch(String residenceUUID, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to filter search values for residence {} based on move-in date {}", residenceUUID, moveInDate);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUUID);
        uriVariables.put("moveInDate", moveInDate);
        String path = UriComponentsBuilder.fromPath("/internal/room-list/search/{residenceUuid}/move-in-date/{moveInDate}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResponseDto<OccupanciesFloorsStatusCountSearchDto>>() {
        };

        try {
            return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error("Exception while filter search values for residence {} based on move-in date {}", residenceUUID, moveInDate);
            return null;
        }
    }

    public ResponseDto<RoomInventoryDetailDto> getRoomWithInventory(String roomUUID, String moveInDate) {
        log.info("Residence-Data-Controller::Processing to get room inventories for roomUUID {} based on move-in date {}", roomUUID, moveInDate);
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
            return (ResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var11) {
            log.error(var11);
            log.error("Exception while getting room inventories for roomUUID {} based on move-in date {}", roomUUID, moveInDate);
            return null;
        }
    }

    public ResidenceInfoDto getResidenceInformation(String residenceUuid) {
        log.info("Residence-Data-Controller::Processing to get residence information on residenceUUID {}", residenceUuid);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/information/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResidenceInfoDto>() {
        };

        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return (ResidenceInfoDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", residenceUuid, var10);
            return null;
        }
    }

    public ResidenceBlendedPriceDto getResidenceBlendedPriceFromRoomUuid(String roomUuid) {
        log.info("Residence-Data-Controller::Processing to get residence blended price on basis of roomUuid {}", roomUuid);
        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("roomUuid", roomUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/blended-price-info/{roomUuid}").buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference returnType = new ParameterizedTypeReference<ResidenceBlendedPriceDto>() {
        };

        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return (ResidenceBlendedPriceDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", roomUuid, var10);
            return null;
        }
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
                return (InventoryPricingResponseDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
            } catch (Exception var14) {
                log.error("Exception while fetching pricing details by residenceUuid, inventoryUuid : {} , {}", residenceUuid, inventoryUuid);
                return null;
            }
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
            return (RoomCardDetailDto)this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, (Object)null, headerParams, accept, returnType);
        } catch (Exception var10) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", residenceUuid, var10);
            return null;
        }
    }
}
