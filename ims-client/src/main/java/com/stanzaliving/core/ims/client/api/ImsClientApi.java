package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.*;
import com.stanzaliving.core.ims.client.dto.responseDto.*;
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
import java.util.Objects;

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

    private StoreBankDetailsDto prepareAddBankAccountDto(String accountName, String accountNumber, String ifscCode) {
        BankAccountVerificationDto brokerBankAccount = BankAccountVerificationDto.builder()
                .accountName(accountName)
                .accountNumber(accountNumber)
                .ifscCode(ifscCode)
                .build();
        return StoreBankDetailsDto.builder().brokerBankAccount(brokerBankAccount).build();
    }

    //    <----------------------------------------sendPaytmVerificationOtpRequest--------------------------------------->

    public BrokerDetailsResponseDto sendPaytmVerificationOtpRequest(String token, String paytmNumber, PayoutMode payoutMode) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return sendPaytmVerificationOtpRequest(path, token, paytmNumber, payoutMode);
    }

    private BrokerDetailsResponseDto sendPaytmVerificationOtpRequest(String path, String token, String paytmNumber, PayoutMode payoutMode) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(payoutMode.getName())){
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmSendOtpDto postBody = preparePaytmSendOtpDto(paytmNumber, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerDetailsResponseDto> returnType = new ParameterizedTypeReference<BrokerDetailsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------validatePaytmOtp--------------------------------------->

    public BaseResponseDto validatePaytmOtp(String token, String paytmNumber, PayoutMode payoutMode, String validationKey) {
        String path = UriComponentsBuilder.fromPath(PAYTM_OTP_VALIDATE).toUriString();

        return validatePaytmOtp(path, token, paytmNumber, payoutMode, validationKey);
    }

    private BaseResponseDto validatePaytmOtp(String path, String token, String paytmNumber, PayoutMode payoutMode, String validationKey) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(validationKey) || StringUtils.isBlank(payoutMode.getName())) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmOtpValidationDto postBody = preparePaytmOtpVerificationDto(paytmNumber, payoutMode,validationKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BaseResponseDto> returnType = new ParameterizedTypeReference<BaseResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------addUPIDetails--------------------------------------->

    public BrokerDetailsResponseDto addUPIDetails(String token, String vpaAddress, PayoutMode payoutMode) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return addUPIDetails(path, token, vpaAddress, payoutMode);
    }

    private BrokerDetailsResponseDto addUPIDetails(String path, String token, String vpaAddress, PayoutMode payoutMode) {

        if (StringUtils.isBlank(vpaAddress) || StringUtils.isBlank(payoutMode.getName())) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        UPIDto postBody = prepareUPIDto(vpaAddress, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerDetailsResponseDto> returnType = new ParameterizedTypeReference<BrokerDetailsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------sendPennyForBankAccountVerification--------------------------------------->

    public BankVerificationResponseDto sendPennyForBankAccountVerification(String token, String brokerMobile, String accountName, String accountNumber, String ifscCode, Boolean Live) {
        String path = UriComponentsBuilder.fromPath(BANK_PENNY_TESTING).toUriString();

        return sendPennyForBankAccountVerification(path, token, brokerMobile, accountName, accountNumber, ifscCode, Live);
    }

    private BankVerificationResponseDto sendPennyForBankAccountVerification(String path, String token, String brokerMobile, String accountName, String accountNumber, String ifscCode, Boolean Live) {

        if (StringUtils.isBlank(accountName) || StringUtils.isBlank(accountNumber) || StringUtils.isBlank(ifscCode)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        BankAccountVerificationDto postBody = prepareBankAccountVerificationDto(accountName,accountNumber,ifscCode,Live);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BankVerificationResponseDto> returnType = new ParameterizedTypeReference<BankVerificationResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------validateBankAccount--------------------------------------->

    public BankVerificationResponseDto validateBankAccount(String token, String brokerMobile, Double amount) {
        String path = UriComponentsBuilder.fromPath(BANK_VERIFICATION).toUriString();

        return validateBankAccount(path, token, brokerMobile, amount);
    }

    private BankVerificationResponseDto validateBankAccount(String path, String token, String brokerMobile, Double amount) {

        if (amount == null) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("amount", String.valueOf(amount));

        queryParams.add("brokerMobile", brokerMobile );

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BankVerificationResponseDto> returnType = new ParameterizedTypeReference<BankVerificationResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------addBankDetails--------------------------------------->

    public BaseResponseDto addBankDetails(String token, String brokerMobile, String accountName, String accountNumber, String ifscCode) {
        String path = UriComponentsBuilder.fromPath(STORE_BANK_DETAILS).toUriString();

        return addBankDetails(path, token, brokerMobile, accountName, accountNumber, ifscCode);
    }

    private BaseResponseDto addBankDetails(String path, String token, String brokerMobile, String accountName, String accountNumber, String ifscCode) {

        if (StringUtils.isBlank(accountName) || StringUtils.isBlank(accountNumber) || StringUtils.isBlank(ifscCode)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        StoreBankDetailsDto postBody = prepareAddBankAccountDto(accountName,accountNumber,ifscCode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BaseResponseDto> returnType = new ParameterizedTypeReference<BaseResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


    //    <----------------------------------------getBrokerKYCDetails--------------------------------------->

    public BrokerKYCDetailReponseDto getBrokerKYCDetails(String token) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return getBrokerKYCDetails(path, token);
    }

    private BrokerKYCDetailReponseDto getBrokerKYCDetails(String path, String token) {

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Please check the token provided !");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerKYCDetailReponseDto> returnType = new ParameterizedTypeReference<BrokerKYCDetailReponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }



    //    <----------------------------------------getPayoutModes--------------------------------------->

    public List<PayoutMode> getPayoutModes(String token) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_MODES).toUriString();

        return getPayoutModes(path, token);
    }

    private List<PayoutMode> getPayoutModes(String path, String token) {

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Please check the token provided !");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<PayoutMode>> returnType = new ParameterizedTypeReference<List<PayoutMode>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    //    <----------------------------------------getCityList--------------------------------------->

    public List<CityResponseDto> getCityList() {
        String path = UriComponentsBuilder.fromPath(CITY_DETAILS).toUriString();

        return getCityList(path);
    }

    private List<CityResponseDto> getCityList(String path) {

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<CityResponseDto>> returnType = new ParameterizedTypeReference<List<CityResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------createBroker--------------------------------------->

    public List<CityResponseDto> createBroker(String token,BrokerDto brokerDto) {
        String path = UriComponentsBuilder.fromPath(CITY_DETAILS).toUriString();

        return createBroker(path, token, brokerDto);
    }

    private List<CityResponseDto> createBroker(String path, String token,BrokerDto brokerDto) {

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Please check the token provided !");
        }

        if (Objects.isNull(brokerDto)) {
            throw new IllegalArgumentException("Request is null for adding user");
        }

        Object postBody = brokerDto;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<List<CityResponseDto>> returnType = new ParameterizedTypeReference<List<CityResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }
}
