/**
 *
 */
package com.stanzaliving.core.paymentplan.client.api;

import com.stanzaliving.booking.dto.request.PaymentPlanRequestDto;
import com.stanzaliving.booking.dto.response.PaymentPlanResponseDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.payment.dto.PaymentPlan;
import dto.MonthlyBreakupResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class PaymentPlanClientApi {

    private StanzaRestClient restClient;

    public PaymentPlanClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<PaymentPlanResponseDto> createPaymentPlan(PaymentPlanRequestDto paymentPlanRequestDto, String token) {

        Object postBody = null;

        log.info("PaymentPlanRequestDto is {} ", paymentPlanRequestDto);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/api/v1/create").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        HttpHeaders headerParams = new HttpHeaders();

        headerParams.add("Cookie", "token=" + token);


        final String[] accepts = {"*/*"};


        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<PaymentPlanResponseDto>>() {
        };
        postBody = paymentPlanRequestDto;

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while creating the paymentPlan {}", e);
            return null;
        }


    }


    public ResponseDto<MonthlyBreakupResponseDTO> getMonthlyBreakup(String bookingId, Date contractStartDate, Date fromDate) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("bookingId", bookingId);
        String path = UriComponentsBuilder.fromPath("/internal/api/v1/monthly-breakup/get/{bookingId}").buildAndExpand(uriVariables).toUriString();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("contractStartDate", date.format(contractStartDate));
        queryParams.add("fromDate", date.format(fromDate));
        HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<MonthlyBreakupResponseDTO>> returnType = new ParameterizedTypeReference<ResponseDto<MonthlyBreakupResponseDTO>>() {
        };
        try {
            ResponseDto<MonthlyBreakupResponseDTO> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
            return responseDto;
        } catch (Exception e) {
            log.error("error while fetching the monthly break up {}", e.getMessage());
            return null;
        }
    }

    public ResponseDto<List<PaymentPlan>> getPaymentPlan(String bookingUuid, String token) {

        try {
            Object postBody = null;

            log.info("get paymentPlan by bookingUuid is {} ", bookingUuid);

            final Map<String, Object> uriVariables = new HashMap<>();

            uriVariables.put("bookingUuid", bookingUuid);

            String path = UriComponentsBuilder.fromPath("/api/v1/get/{bookingUuid}").buildAndExpand(uriVariables).toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            HttpHeaders headerParams = new HttpHeaders();

            headerParams.add("Cookie", "token=" + token);

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PaymentPlan>>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("error while fetching the paymentPlan {}", e);
        }

        return null;

    }

}