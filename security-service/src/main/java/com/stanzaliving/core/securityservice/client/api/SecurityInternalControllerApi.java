package com.stanzaliving.core.securityservice.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.security.dto.AttendanceDataRequestDto;
import com.stanzaliving.core.security.dto.ResidentActivityDTO;
import com.stanzaliving.core.securityservice.client.dto.InternetAndFoodScanDataResponseDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.*;

@Log4j2
public class SecurityInternalControllerApi {
    private StanzaRestClient restClient;

    public SecurityInternalControllerApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }
    public List<ResidentActivityDTO> getAllResidentActivities(String residentId) {

        log.info("Security-Service-Internal-Controller::Processing to retrieve recent activity for resident Id {}", residentId);

        Map<String, Object> uriVariables = new HashMap();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/{residentId}/resident-activities")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap();

        HttpHeaders headerParams = new HttpHeaders();


        String[] accepts = new String[]{"*/*"};

        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidentActivityDTO>>> returnType =
                new ParameterizedTypeReference<ResponseDto<List<ResidentActivityDTO>>>() {};

        try {
            ResponseDto<List<ResidentActivityDTO>> responseDto = this.restClient.invokeAPI(path, HttpMethod.GET
                    , queryParams, null, headerParams, accept, returnType);

            if(Objects.nonNull(responseDto) && responseDto.isStatus()){
                return responseDto.getData();
            }

        }
        catch (Exception exception){
            log.info("Error in fetching recent activity for user with resident id {}, exception {}", residentId, exception);
        }
        return new ArrayList<>();
    }

    public ResponseDto<InternetAndFoodScanDataResponseDto> getUserLatestInternetUsageAndFoodScanDates(List<String> residentIds, String token) {
        log.info("Request received to getUserLatestInternetUsageAndFoodScanDates with residentIds: {} and token: {}", residentIds, token);
        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Token missing for retrieving room details based on roomUUID");
        }

        Object postBody = residentIds;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/api/v1/attendance/summary/last/data/usage").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();


        String tokenCookie = SecurityConstants.TOKEN_HEADER_NAME + "=" + token;
        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.COOKIE_HEADER_NAME, tokenCookie);

        final String[] accepts = {
                "*/*"
        };
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<InternetAndFoodScanDataResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<InternetAndFoodScanDataResponseDto>>() {
        };

        try {
            log.info("Executing security api to get user's last internet usage and food scan date");
            return (ResponseDto) this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.info("Exception e {},", e);
            return null;
        }
    }

    public Map<String, Integer> getResidenceAttendanceData(Set<String> residenceIds, LocalDate currentDate) {
        log.info("Request received to getUserLatestInternetUsageAndFoodScanDates with residentIds: {} and date: {}", residenceIds, currentDate);

        AttendanceDataRequestDto attendanceDataRequestDto = AttendanceDataRequestDto.builder()
                .residenceIds(residenceIds)
                .date(currentDate)
                .build();
        String path = UriComponentsBuilder.fromPath("/internal/presentAttendance/summary").toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();



        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Map<String, Integer>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Integer>>>() {
        };

        try {
            log.info("Executing security api to get user's last internet usage and food scan date");
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, attendanceDataRequestDto, headerParams, accept, returnType).getData();
        } catch (Exception e) {
            log.info("Exception e {},", e);
            return new HashMap<>();
        }
    }

}
