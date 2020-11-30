package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.BrokerDocumentRequestDTO;
import com.stanzaliving.core.ims.client.dto.PayoutMode;
import com.stanzaliving.core.ims.client.dto.PaytmVerificationDto;
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
import static com.stanzaliving.core.ims.client.constants.ImsConstants.PAYTM_OTP_URL;
import static com.stanzaliving.core.ims.client.constants.ImsConstants.PAYTM_OTP_VALIDATE;

/**
 * @author harman
 */
@Log4j2
public class ImsClientApi {

    private final StanzaRestClient restClient;

    public ImsClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    private PaytmVerificationDto preparePaytmSendOtpDto(String paytmNumber, PayoutMode paymentMode) {
        return PaytmVerificationDto.builder()
                .paytmNumber(paytmNumber)
                .payoutMode(paymentMode)
                .build();
    }

    private PaytmVerificationDto preparePaytmOtpVerificationDto(String paytmNumber, PayoutMode paymentMode, String validationKey) {
        return PaytmVerificationDto.builder()
                .paytmNumber(paytmNumber)
                .payoutMode(paymentMode)
                .validationKey(validationKey)
                .build();
    }


    public ResponseDto<BrokerDocumentRequestDTO> sendPaytmVerificationOtpRequest(String token, String paytmNumber, PayoutMode payoutMode) {
        String path = UriComponentsBuilder.fromPath(PAYTM_OTP_URL).toUriString();

        return sendPaytmVerificationOtpRequest(path, token, paytmNumber, payoutMode);
    }

    private ResponseDto<BrokerDocumentRequestDTO> sendPaytmVerificationOtpRequest(String path, String token, String paytmNumber, PayoutMode payoutMode) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(payoutMode.getName())){
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmVerificationDto postBody = preparePaytmSendOtpDto(paytmNumber, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerDocumentRequestDTO>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerDocumentRequestDTO>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<BrokerDocumentRequestDTO> validatePaytmOtp(String token, String paytmNumber, PayoutMode payoutMode,String validationKey) {
        String path = UriComponentsBuilder.fromPath(PAYTM_OTP_VALIDATE).toUriString();

        return validatePaytmOtp(path, token, paytmNumber, payoutMode, validationKey);
    }

    private ResponseDto<BrokerDocumentRequestDTO> validatePaytmOtp(String path, String token, String paytmNumber, PayoutMode payoutMode, String validationKey) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(validationKey) || StringUtils.isBlank(payoutMode.getName())) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmVerificationDto postBody = preparePaytmOtpVerificationDto(paytmNumber, payoutMode,validationKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerDocumentRequestDTO>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerDocumentRequestDTO>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }



}
