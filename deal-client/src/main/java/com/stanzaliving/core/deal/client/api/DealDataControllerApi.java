package com.stanzaliving.core.deal.client.api;

import com.stanzaliving.booking.dto.ContractStatusDto;
import com.stanzaliving.booking.dto.RoomAndBedsResponseDto;
import com.stanzaliving.booking.enums.ContractStatus;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.deal.client.dto.*;
import com.stanzaliving.core.dto.B2bBillDetailsDto;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.core.user.enums.Nationality;
import lombok.extern.log4j.Log4j2;
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

@Log4j2
public class DealDataControllerApi {

    private StanzaRestClient restClient;

    public DealDataControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<DealUserResponseDto> updateUserDetails(DealUserRequestDto dealUserRequestDto) {

        log.info("Deal-Data-Controller:: update deal user with uuid {} and payload {}");

        Object putBody = dealUserRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/deal/user").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DealUserResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DealUserResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, putBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getServiceMixUuidForDealAndResidence(String dealUuid, String residenceUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/deal/service-mix/" + dealUuid + "/" + residenceUuid).buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<OccupancyResidenceListDto> getAllowedOccupanciesForDealAndResidence(String dealUuid, String residenceUuid) {

        log.info("fetching allowed occupancies for ContactUuid : " + dealUuid);

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", dealUuid);
        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/deal/allowed-occupancies/{dealUuid}/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<OccupancyResidenceListDto>> returnType = new ParameterizedTypeReference<ResponseDto<OccupancyResidenceListDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<DealUserResponseDto> getUserDetails(String userUuid) {

        log.info("fetching user details for userUuid : " + userUuid);

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/deal/user/" + userUuid).buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DealUserResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<DealUserResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> getPackagedServiceDetailsForUser(String userUuid, String bookingUuid) {
        log.info("fetching user details for userUuid : " + userUuid);

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/user/service-mix/" + userUuid + "/" + bookingUuid).buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<DealApprovedUserPageDto> getApprovedUserList(String contractId,
                                                                    DealApprovedUserRequestDto dealApprovedUserRequestDto, Integer pageNo, Integer pageSize, String sortBy, String sortOrder) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", contractId);
        String path =
                UriComponentsBuilder.fromPath("/internal/deal/{dealUuid}/residents")
                        .buildAndExpand(uriVariables)
                        .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("pageNo", String.valueOf(pageNo));
        queryParams.add("pageSize", String.valueOf(pageSize));
        queryParams.add("sortBy", sortBy);
        queryParams.add("sortOrder", sortOrder);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<DealApprovedUserPageDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<DealApprovedUserPageDto>>() {
                };
        postBody = dealApprovedUserRequestDto;
        return restClient.invokeAPI(
                path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<DealKycResponseDto>> getDealKycDocumentsForUser(String userUuid) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userId", userUuid);

        String path = UriComponentsBuilder.fromPath("/internal/resident/{userId}/documents")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<DealKycResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<DealKycResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> updateExpectedMoveOutDate(String contractUserUuid, LocalDate localDate) {

        Object putBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("contractUserUuid", contractUserUuid);
        uriVariables.put("moveOutDate", String.valueOf(localDate));

        String path = UriComponentsBuilder.fromPath("/internal/{contractUserUuid}/move-out-date/{moveOutDate}")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, putBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getResidenceUuidsForADeal(String dealUuid) {

        log.info("fetching allowed occupancies for ContactUuid : " + dealUuid);

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", dealUuid);

        String path = UriComponentsBuilder.fromPath("/internal/deal/residences/{dealUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<B2bKycPageDto> getDocumentStatusForUser(String userUuid, Nationality nationality) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userId", userUuid);
        uriVariables.put("nationality", nationality);

        String path = UriComponentsBuilder.fromPath("/internal/resident/{userId}/nationality/{nationality}/document-status")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<B2bKycPageDto>> returnType = new ParameterizedTypeReference<ResponseDto<B2bKycPageDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<EnumListing<Nationality>> getNationalityForUser(String userUuid) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("userId", userUuid);

        String path = UriComponentsBuilder.fromPath("/internal/resident/{userId}/nationality")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<EnumListing<Nationality>>> returnType = new ParameterizedTypeReference<ResponseDto<EnumListing<Nationality>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<B2bRoomOccupancyDto>> getRoomsForResidenceAndContractFromBookingService(DealRoomsRequestDto dealRoomsRequestDto) {

        log.info("fetching rooms for ContactUuid : " + dealRoomsRequestDto.getDealUuid());
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", dealRoomsRequestDto.getDealUuid());
        uriVariables.put("residenceUuid", dealRoomsRequestDto.getResidenceUuid());

        String path = UriComponentsBuilder.fromPath("/getRooms/{dealUuid}/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<B2bRoomOccupancyDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<B2bRoomOccupancyDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<RoomOccupancyDto> getRoomsForDeal(DealRoomsRequestDto dealRoomsRequestDto) {

        log.info("fetching rooms for ContactUuid : " + dealRoomsRequestDto.getDealUuid());
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("dealUuid", dealRoomsRequestDto.getDealUuid());
        uriVariables.put("residenceUuid", dealRoomsRequestDto.getResidenceUuid());

        String path = UriComponentsBuilder.fromPath("/getRooms/{dealUuid}/{residenceUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RoomOccupancyDto>> returnType = new ParameterizedTypeReference<List<RoomOccupancyDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<RoomAndBedsResponseDto> getContractPricingDetailsRoomNumbers(String contractUuid) {

        log.info("Booking-Data-Controller::Processing to fetch Contract Pricing Details for Contract uuid {}", contractUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("contractUuid", contractUuid);

        String path = UriComponentsBuilder.fromPath("/contract-pricing/{contractUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<RoomAndBedsResponseDto>> returnType =
                new ParameterizedTypeReference<List<RoomAndBedsResponseDto>>() {
                };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public Map<String,String> getContractDetails(String contractUuid) {

        log.info("Booking-Data-Controller::Processing to fetch Contract Details for Contract uuid {}", contractUuid);

        Map<String, Object> uriVariables = new HashMap();

        uriVariables.put("contractUuid", contractUuid);

        String path = UriComponentsBuilder.fromPath("/contract-details/{contractUuid}").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Map<String,String>> returnType =
                new ParameterizedTypeReference<Map<String,String>>() {
                };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

    }

    public ResponseDto<B2bBillDetailsDto> getBillPricingDetails(String contractUuid, String residenceUuid, String occupancyType) {

        log.info("Booking-Data-Controller::Processing to fetch Contract Details for Contract uuid {}", contractUuid);

        Map<String, Object> uriVariables = new HashMap();

        String path = UriComponentsBuilder.fromPath("/internal/deal/resident/billing-details").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();
        queryParams.add("contractUuid", contractUuid);
        queryParams.add("residenceUuid", residenceUuid);
        queryParams.add("occupancyType", occupancyType);

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<B2bBillDetailsDto>> returnType =
                new ParameterizedTypeReference<ResponseDto<B2bBillDetailsDto>>() {
                };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto markContractStatusExpired(String contractUuid) {

        log.info("Booking-Data-Controller::Processing to mark Contract status expired for Contract uuid {}", contractUuid);
        Map<String, Object> uriVariables = new HashMap<>();

        uriVariables.put("contractUuid", contractUuid);

        String path = UriComponentsBuilder.fromPath("/update/status").buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto> returnType = new
                ParameterizedTypeReference<ResponseDto>() {
                };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, new ContractStatusDto(contractUuid, ContractStatus.EXPIRED), headerParams, accept, returnType);

    }

}
