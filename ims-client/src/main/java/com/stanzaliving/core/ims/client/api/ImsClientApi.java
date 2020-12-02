package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.*;
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
import static com.stanzaliving.core.ims.client.constants.ImsConstants.*;

/**
 * @author harman
 */
@Log4j2
public class ImsClientApi {

    private final StanzaRestClient restClient;

    public ImsClientApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }


    private PaytmSendOtpDto preparePaytmSendOtpDto(String paytmNumber, PayoutMode paymentMode) {
        return PaytmSendOtpDto.builder()
                .paytmNumber(paytmNumber)
                .payoutMode(paymentMode)
                .build();
    }

    private PaytmOtpValidationDto preparePaytmOtpVerificationDto(String paytmNumber, PayoutMode paymentMode, String validationKey) {
        return PaytmOtpValidationDto.builder()
                .paytmNumber(paytmNumber)
                .payoutMode(paymentMode)
                .validationKey(validationKey)
                .build();
    }

    private UPIDto prepareUPIDto(String vpaAddress, PayoutMode paymentMode) {
        return UPIDto.builder()
                .vpaAddress(vpaAddress)
                .payoutMode(paymentMode)
                .build();
    }

    private BankAccountVerificationDto prepareBankAccountVerificationDto(String accountName, String accountNumber, String ifscCode, Boolean Live) {
        return BankAccountVerificationDto.builder()
                .accountName(accountName)
                .accountNumber(accountNumber)
                .ifscCode(ifscCode)
                .Live(Live)
                .build();
    }

    private BankAccountVerificationDto prepareAddBankAccountDto(String accountName, String accountNumber, String ifscCode) {
        return BankAccountVerificationDto.builder()
                .accountName(accountName)
                .accountNumber(accountNumber)
                .ifscCode(ifscCode)
                .build();
    }

    //    <----------------------------------------sendPaytmVerificationOtpRequest--------------------------------------->

    public ResponseDto<BrokerResponseDto> sendPaytmVerificationOtpRequest(String token, String paytmNumber, PayoutMode payoutMode) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return sendPaytmVerificationOtpRequest(path, token, paytmNumber, payoutMode);
    }

    private ResponseDto<BrokerResponseDto> sendPaytmVerificationOtpRequest(String path, String token, String paytmNumber, PayoutMode payoutMode) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(payoutMode.getName())){
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmSendOtpDto postBody = preparePaytmSendOtpDto(paytmNumber, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------validatePaytmOtp--------------------------------------->

    public ResponseDto<BrokerResponseDto> validatePaytmOtp(String token, String paytmNumber, PayoutMode payoutMode, String validationKey) {
        String path = UriComponentsBuilder.fromPath(PAYTM_OTP_VALIDATE).toUriString();

        return validatePaytmOtp(path, token, paytmNumber, payoutMode, validationKey);
    }

    private ResponseDto<BrokerResponseDto> validatePaytmOtp(String path, String token, String paytmNumber, PayoutMode payoutMode, String validationKey) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(validationKey) || StringUtils.isBlank(payoutMode.getName())) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmOtpValidationDto postBody = preparePaytmOtpVerificationDto(paytmNumber, payoutMode,validationKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------addUPIDetails--------------------------------------->

    public ResponseDto<BrokerResponseDto> addUPIDetails(String token, String vpaAddress, PayoutMode payoutMode) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return addUPIDetails(path, token, vpaAddress, payoutMode);
    }

    private ResponseDto<BrokerResponseDto> addUPIDetails(String path, String token, String vpaAddress, PayoutMode payoutMode) {

        if (StringUtils.isBlank(vpaAddress) || StringUtils.isBlank(payoutMode.getName())) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        UPIDto postBody = prepareUPIDto(vpaAddress, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------sendPennyForBankAccountVerification--------------------------------------->

    public ResponseDto<BrokerResponseDto> sendPennyForBankAccountVerification(String token, String accountName, String accountNumber, String ifscCode, Boolean Live) {
        String path = UriComponentsBuilder.fromPath(BANK_PENNY_TESTING).toUriString();

        return sendPennyForBankAccountVerification(path, token, accountName, accountNumber, ifscCode, Live);
    }

    private ResponseDto<BrokerResponseDto> sendPennyForBankAccountVerification(String path, String token, String accountName, String accountNumber, String ifscCode, Boolean Live) {

        if (StringUtils.isBlank(accountName) || StringUtils.isBlank(accountNumber) || StringUtils.isBlank(ifscCode)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        BankAccountVerificationDto postBody = prepareBankAccountVerificationDto(accountName,accountNumber,ifscCode,Live);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------validateBankAccount--------------------------------------->

        public ResponseDto<BrokerResponseDto> validateBankAccount(String token, Double amount) {
        String path = UriComponentsBuilder.fromPath(BANK_VERIFICATION).toUriString();

        return validateBankAccount(path, token, amount);
    }

    private ResponseDto<BrokerResponseDto> validateBankAccount(String path, String token, Double amount) {

        if (amount == null) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        Object postBody = new Object();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("amount", String.valueOf(amount));

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------addBankDetails--------------------------------------->

    public ResponseDto<BrokerResponseDto> addBankDetails(String token, String accountName, String accountNumber, String ifscCode) {
        String path = UriComponentsBuilder.fromPath(STORE_BANK_DETAILS).toUriString();

        return addBankDetails(path, token, accountName, accountNumber, ifscCode);
    }

    private ResponseDto<BrokerResponseDto> addBankDetails(String path, String token, String accountName, String accountNumber, String ifscCode) {

        if (StringUtils.isBlank(accountName) || StringUtils.isBlank(accountNumber) || StringUtils.isBlank(ifscCode)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        BankAccountVerificationDto postBody = prepareAddBankAccountDto(accountName,accountNumber,ifscCode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<BrokerResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<BrokerResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

}
