package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.PaytmVerificationDto;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.user.enums.OtpType;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.user.request.dto.MobileEmailOtpRequestDto;
import com.stanzaliving.core.user.request.dto.MobileOtpRequestDto;
import com.stanzaliving.core.user.request.dto.MobileOtpValidateRequestDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

import static com.stanzaliving.core.base.constants.SecurityConstants.VENTA_TOKEN_PREFIX;

/**
 * @author harman
 */
@Log4j2
public class ImsClientApi {

    private final StanzaRestClient restClient;

    public ImsClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    private PaytmVerificationDto preparePaytmVerificationDto(String paytmNumber,PaymentMode paymentMode) {
        return PaytmVerificationDto.builder()
                .paytmNumber(paytmNumber)
                .paymentMode(paymentMode)
                .build();
    }

    public ResponseDto<Void> sendPaytmVerificationOtpRequest(String token, String paytmNumber,PaymentMode paymentMode) {
        String path = UriComponentsBuilder.fromPath("/broker/payoutdetails").toUriString();

        return sendPaytmVerificationOtpRequest(path, token, paytmNumber, paymentMode);
    }

    private ResponseDto<Void> sendPaytmVerificationOtpRequest(String path, String token, String paytmNumber, PaymentMode paymentMode) {

        if (StringUtils.isBlank(paytmNumber)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmVerificationDto postBody = preparePaytmVerificationDto(paytmNumber, paymentMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

}
