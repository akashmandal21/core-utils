package com.stanzaliving.core.venta_aggregation_client.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import com.stanzaliving.booking.dto.BookingResponseDto;
import com.stanzaliving.core.bookingservice.dto.request.BookingsForUpsellRequestDto;
import com.stanzaliving.core.ventaaggregationservice.dto.*;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.common.dto.RoommateFilterDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.bookingservice.dto.response.ResidenceQrCodeResponseDTO;
import com.stanzaliving.core.dto.LeadElasticDto;
import com.stanzaliving.core.venta_aggregation_client.config.RestResponsePage;
import com.stanzaliving.core.ventaaggregationservice.dto.*;
import com.stanzaliving.ventaInvoice.dto.ResidenceDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

@Log4j2
public class VentaAggregationServiceApi {

    private StanzaRestClient restClient;

    public VentaAggregationServiceApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    /**
     * This method is used to fetch ResidenceAggregation Data from Venta-Aggregation-Service
     *
     * @param residenceUuid->Unique ID corresponding to residence
     * @return Aggregated Residence data on aggregation service
     */
    public ResponseDto<ResidenceAggregationEntityDto> getAggregatedResidenceInformation(String residenceUuid) {
        log.info("Aggregation Residence Controller::Processing to get residence information on basis of residenceUuid {}", residenceUuid);
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/residence/{residenceUuid}")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidenceAggregationEntityDto>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceAggregationEntityDto>>() {
        };
        try {
            log.info("Executing Api for getting residence Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching residence information based on residenceUUID {}, Exception is ", residenceUuid, e);
        }
        return null;
    }

    public ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>> getResidenceListing(ResidenceFilterRequestDto residenceFilterRequestDto) {
        log.info("Aggregation Residence Controller::Processing to get residence listing based on residence filter request dto {}", residenceFilterRequestDto);

        Object postBody = residenceFilterRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/listing").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>>> returnType =
                new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingResidenceAggregationEntityDto>>>() {
                };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<RestResponsePage<BookingAggregationDto>> getBookingAggregationListing(BookingFilterRequestDto bookingFilterRequestDto) {
        log.info("Aggregation Booking Controller getBookingAggregationListing with payload {}", bookingFilterRequestDto.toString());

        Object postBody = bookingFilterRequestDto;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/listing").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("isListing", "true");

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationDto>>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingAggregationDto>> getActiveBookings() {

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/v1/active").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public Map<String, Object> getBookingDetails(String bookingUuid) {
        log.info("Aggregation Booking Details Controller::Processing to get booking information on basis of bookingUuid {}", bookingUuid);

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingUuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/data/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<Map<String, Object>> returnType = new ParameterizedTypeReference<Map<String, Object>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BookingAggregationDto> getBookingDetailsByBookingUuid(String bookingUuid) {
        log.info("Aggregation Booking Details Controller::Processing to get booking on basis of bookingUuid {}", bookingUuid);

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("booking-uuid", bookingUuid);

        String path = UriComponentsBuilder.fromPath("/internal/booking/{booking-uuid}/details").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BookingAggregationDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingAggregationDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

	public ResponseDto<RestResponsePage<BookingAggregationEntityDto>> getBookingListingForInvoicingDashBoard(BookingFilterRequestDto bookingFilterRequestDto,
																								 String type) {
		log.info("Invoice Aggregation Booking Controller getBookingAggregationInvoiceListing with payload {}", bookingFilterRequestDto.toString());
		Map<String, Object> uriVariables = new HashMap<>();

		Object postBody = bookingFilterRequestDto;

		String path = UriComponentsBuilder.fromPath("/booking/invoice/listing").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("type",type);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<RestResponsePage<BookingAggregationEntityDto>>>() {
		};

		try {
			log.info("Executing Api for fetching booked details with Url {}", path);
			return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while fetching booked details , Exception is ", e);
		}
		return null;
	}

    public ResponseDto<String> updateResidencePricingAndBedInformation() {
        log.info("Residence Internal Controller::Processing to update residence pricing and bed info");

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/update-price-bed-cache").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public List<MoveInDetailDataDto> getMoveInDetailData(String date, String residenceUuid) {

        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/booking/move-in-detail-data").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("Date", date);
        if (StringUtils.isNotBlank(residenceUuid)) {
            queryParams.add("residenceUuid", residenceUuid);
        }

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<MoveInDetailDataDto>> returnType = new ParameterizedTypeReference<List<MoveInDetailDataDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<BookingAggregationDto>> fetchAllTrespassersInCity(String cityUuid) {
        try {
            log.info("Aggregation Booking Details Controller::Processing to get tresspasser bookings on basis of cityUuid {}", cityUuid);

            Object postBody = null;

            // create path and map variables
            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("cityUuid", cityUuid);

            String path = UriComponentsBuilder.fromPath("/internal/trespassers/{cityUuid}").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {
                    "*/*"
            };
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>>() {
            };
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception occurred while fetching tresspasser bookings for city id:{} with message", cityUuid, e);
            return null;
        }
    }

    public ResponseDto<BookingAggregationDto> findBookingDetailsForResidentAndBookingStatus(String residentId) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residentId", residentId);

        String path = UriComponentsBuilder.fromPath("/internal/booking/details/resident/{residentId}")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<BookingAggregationDto>> returnType = new ParameterizedTypeReference<ResponseDto<BookingAggregationDto>>() {
        };
        try {
            log.info("Executing Api for getting booked details with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching booked details for resident id {}, Exception is ", residentId, e);
        }
        return null;
    }

    public void updateResidenceGender(String residenceUuid, String gender) {
        log.info("Residence Internal Controller::Processing to update residence gender {}", residenceUuid);

        Object postBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        uriVariables.put("gender", gender);

        String path = UriComponentsBuilder.fromPath("/internal/residence/update/{residenceUuid}/gender/{gender}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<ResidenceQrCodeResponseDTO> updateResidenceQrCode(String residenceUuid) {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/qrCode/{residenceUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<ResidenceQrCodeResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<ResidenceQrCodeResponseDTO>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getRoomByRoomMateFilter(String residenceUuid, RoommateFilterDto roommateFilterDto) {

        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceUuid", residenceUuid);

        String path = UriComponentsBuilder.fromPath("/internal/roommate/filter/{residenceUuid}").buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, roommateFilterDto, headerParams, accept,
                    returnType);
        } catch (Exception e) {
            log.error("Exception occurred while fetching message", e);
        }
        return null;
    }

    public List<ResidenceAndOccupancyPricingResponseDto> getSyncPropertiesDataForCmsWebsite(String residenceUuid) {

        try {
            Object postBody = null;

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("internal/residence/occupancy/pricing").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            queryParams.add("version", "v2");

            if (StringUtils.isNotBlank(residenceUuid)) {
                queryParams.add("residenceUuid", residenceUuid);
            }

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<ResidenceAndOccupancyPricingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceAndOccupancyPricingResponseDto>>>() {
            };

            ResponseDto<List<ResidenceAndOccupancyPricingResponseDto>> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

            return responseDto.isStatus() ? responseDto.getData() : Collections.emptyList();

        } catch (Exception e) {
            log.error("Exception occurred while fetching sync properties data for cms website from venta", e);
            return Collections.emptyList();
        }
    }

    public ResponseDto<String> sendNotificationForContractLockInTerminatingEvents() {
        log.info("Venta Aggregation Controller::Sending booking events notification today {}", LocalDate.now());
        Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/bookings/terminated")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api for getting bookings Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while sending booking events integration notification on {}, Exception is {}", LocalDate.now(), e);
        }
        return null;
    }

    public ResponseDto<List<String>> save(BookingAggregationDto bookingAggregationDto) {
        Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/booking/save")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            log.info("Executing Api for saving booking Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, bookingAggregationDto, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while saving booking Info on {}, Exception is {}", LocalDate.now(), e);
        }
        return null;
    }

    public ResponseDto<List<String>> getResidenceListInMicroMarket(String residenceUuid) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceid", residenceUuid);
        String path = UriComponentsBuilder.fromPath("/internal/residence/residence-list-in-microMarketId/{residenceid}")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            log.info("Executing Api for getting bookings Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while sending booking events integration notification on {}, Exception is {}", LocalDate.now(), e);
        }
        return null;
    }

    public ResponseDto<String> syncMysqlAndElasticData() {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/exit/sync-mysql-elastic").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };
        try {
            log.info("Executing Api for getting bookings Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while sending booking data  on {}, Exception is {}", LocalDate.now(), e);
        }
        return null;
    }

    public ResponseDto<List<String>> getAllResidence() {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/residence/all/").buildAndExpand(uriVariables).toUriString();

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

    public ResponseDto<List<ResidenceAggregationEntityDto>> getAllActiveResidence(String residenceType) {
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("residenceType", residenceType);
        String path = UriComponentsBuilder.fromPath("/internal/residence/all-active-residence")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<ResidenceAggregationEntityDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceAggregationEntityDto>>>() {
        };

        try {
            log.info("Executing Api for getting bookings Info with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while sending booking events integration notification on {}, Exception is {}", LocalDate.now(), e);
        }
        return null;
    }

    public ResponseDto<Void> syncElasticData(LeadElasticDto elasticDto) {
        log.debug("venta aggregation client to booking aggregation elastic data");
        Object postBody = elasticDto;
        String path = UriComponentsBuilder.fromPath("/internal/residence/sync-elastic-data").toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while syncing elastic data", e);
            return null;
        }
    }

    public ResponseDto<Boolean> getActiveBookingDetailsByResidentMobile(String residentMobile) {
        try {
            Object postBody = null;

            final Map<String, Object> uriVariables = new HashMap<>();
            uriVariables.put("residentMobile", residentMobile);

            String path = UriComponentsBuilder.fromPath("/internal/activeBooking/details/mobile/{residentMobile}").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Exception occurred while fetching sync properties data for cms website from venta", e);
            return null;
        }

    }
    public ResponseDto<List<BookingAggregationDto>> getActiveBookingsForDigest(String date) {
        try {
            Object postBody = null;

            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/activeBooking/details/digest").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("digestDate", date);

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingAggregationDto>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Exception occurred while fetching sync properties data for cms website from venta", e);
            return null;
        }
    }

	public List<String> getBookingUuidByResidentId(String residentId) {
		log.info("Resident Details Controller::Processing to get booking uuids on basis of residentId {}", residentId);

		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residentId", residentId);

		String path = UriComponentsBuilder.fromPath("/internal/resident/data/{residentId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

    public ResponseDto<List<BookingResponseDto>> findBookingsByUser(BookingsForUpsellRequestDto upsellRequestDto) {
        Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/v1/bookingUuid-by-user")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<BookingResponseDto>>>() {
        };
        ResponseDto<List<BookingResponseDto>> response = null;
        try {
            log.info("Executing Api for getting bookings for upsellRequestDto {}", upsellRequestDto);
            response = this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, upsellRequestDto, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bookings for upsellRequestDto {}, Exception is ", upsellRequestDto, e);
        }
        return response;
    }

    public ResponseDto<List<String>> getActiveDealsForInvoicing(Date invoiceDate) {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/eligible-for-invoice-b2b")
                .buildAndExpand(uriVariables).toUriString();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (invoiceDate != null) {
            queryParams.add("invoiceDate", date.format(invoiceDate));
        }
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams,
                    null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching bookings for invoicing {}", e.getMessage());
            return null;
        }
    }

    public ResponseDto<List<ResidenceDto>> getResidenceListingForInvoiceDashboard(ResidenceFilterRequestDto residenceFilterRequestDto)  {
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/residence/invoice-dashboard-listing")
                .buildAndExpand(uriVariables).toUriString();
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ResidenceDto>>>() {
        };
        ResponseDto<List<ResidenceDto>> response = null;
        try {
            response = this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, residenceFilterRequestDto, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bookings for upsellRequestDto {}, Exception is ", residenceFilterRequestDto, e);
        }
        return response;
    }

    public ResponseDto<List<String>> getAllBookingsEligibleForTresPassing() {
        log.info("Aggregation Residence Controller::Processing to get bookings eligible for trespassing");
        Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/eligible-for-trespassing")
                .buildAndExpand(uriVariables).toUriString();

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        HttpHeaders headerParams = new HttpHeaders();
        String[] accepts = new String[]{"*/*"};
        List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            log.info("Executing Api for fetching bookings eligible for trespassin with Url {}", path);
            return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception while fetching bookings eligible for trespassing, Exception is {}", e.getMessage(), e);
        }
        return null;
    }
}
