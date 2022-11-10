package client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.PreconditionFailedException;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.ventaAudit.dto.AuditStatusResponseDto;
import com.stanzaliving.ventaAudit.dto.InventoryResponseDto;
import com.stanzaliving.ventaAudit.dto.RoomHandoverStatusResponseDto;
import com.stanzaliving.ventaAudit.dto.VentaNotificationDto;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Log4j2
@Data
public class AuditServiceClientApi {

    private final StanzaRestClient stanzaRestClient;


    public AuditServiceClientApi(StanzaRestClient stanzaRestClient) {
        this.stanzaRestClient = stanzaRestClient;
    }


    public ResponseDto<List<RoomHandoverStatusResponseDto>> getRoomHandoverStatus(String bookingUuid, String plans) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        uriVariables.put("plans", plans);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/room-handover-status/{bookingUuid}/{plans}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final java.util.List<MediaType> accept = stanzaRestClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<List<RoomHandoverStatusResponseDto>>> returnType =
                new TypeReference<ResponseDto<List<RoomHandoverStatusResponseDto>>>() {};
        ResponseDto<List<RoomHandoverStatusResponseDto>> responseDto;
        try {
            responseDto =
                    stanzaRestClient.invokeAPI(
                            path,
                            HttpMethod.GET,
                            queryParams,
                            null,
                            headerParams,
                            accept,
                            returnType,
                            MediaType.APPLICATION_JSON);

        } catch (Exception e) {

            log.error("Error while calling audit service", e);

            throw new ApiValidationException("Some error occurred. Please try again after some time.");
        }
        if (!responseDto.isStatus()) {

            throw new PreconditionFailedException(responseDto.getMessage());
        }
        return responseDto;
    }


    public ResponseDto<List<InventoryResponseDto>> getInventoryChecklist(String bookingUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/inventory/resident/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final java.util.List<MediaType> accept = stanzaRestClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<List<InventoryResponseDto>>> returnType =
                new TypeReference<ResponseDto<List<InventoryResponseDto>>>() {};
        ResponseDto<List<InventoryResponseDto>> responseDto;
        try {
            responseDto =
                    stanzaRestClient.invokeAPI(
                            path,
                            HttpMethod.GET,
                            queryParams,
                            null,
                            headerParams,
                            accept,
                            returnType,
                            MediaType.APPLICATION_JSON);

        } catch (Exception e) {

            log.error("Error while calling audit service ", e);

            throw new ApiValidationException("Some error occurred. Please try again after some time.");
        }
        if (!responseDto.isStatus()) {

            throw new PreconditionFailedException(responseDto.getMessage());
        }
        return responseDto;
    }

    public ResponseDto<VentaNotificationDto> getAuditDetails(String bookingUuid) {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid",bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/api/v1/audit/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("bookingUuid", bookingUuid);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = stanzaRestClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<VentaNotificationDto>> returnType = new TypeReference<ResponseDto<VentaNotificationDto>>() {
        };

        ResponseDto<VentaNotificationDto> responseDto;

        try {
            responseDto = stanzaRestClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
            return responseDto;
        } catch (Exception e) {

            log.error("Error while searching from venta aggregation service.", e);

            throw new ApiValidationException("Some error occurred. Please try again after some time.");

        }
    }

    public ResponseDto<String> cancelAudit(String bookingUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/audit/cancel/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final java.util.List<MediaType> accept = stanzaRestClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<String>> returnType =
                new TypeReference<ResponseDto<String>>() {};
        ResponseDto<String> responseDto;
        try {
            responseDto =
                    stanzaRestClient.invokeAPI(
                            path,
                            HttpMethod.POST,
                            queryParams,
                            null,
                            headerParams,
                            accept,
                            returnType,
                            MediaType.APPLICATION_JSON);

        } catch (Exception e) {

            log.error("Error while calling audit service ", e);

            throw new ApiValidationException("Some error occurred. Please try again after some time.");
        }
        if (!responseDto.isStatus()) {

            throw new PreconditionFailedException(responseDto.getMessage());
        }
        return responseDto;
    }

    public ResponseDto<AuditStatusResponseDto> getAuditStatusDetails(String bookingUuid) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/audit/status/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final java.util.List<MediaType> accept = stanzaRestClient.selectHeaderAccept(accepts);

        TypeReference<ResponseDto<AuditStatusResponseDto>> returnType = new TypeReference<ResponseDto<AuditStatusResponseDto>>() {};
        ResponseDto<AuditStatusResponseDto> responseDto;
        try {
            responseDto = stanzaRestClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
            return responseDto;
        } catch (Exception e) {
            log.error("Error while searching from audit service.", e);
            return null;
        }
    }
}
