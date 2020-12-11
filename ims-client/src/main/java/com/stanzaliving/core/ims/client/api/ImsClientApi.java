package com.stanzaliving.core.ims.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.constants.SecurityConstants;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.ims.client.dto.*;
import com.stanzaliving.core.ims.client.dto.responseDto.*;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
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

    public BrokerDetailsResponseDto sendPaytmVerificationOtpRequest(String token, String paytmNumber, PayoutMode payoutMode, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return sendPaytmVerificationOtpRequest(path, token, paytmNumber, payoutMode, brokerMobile);
    }

    private BrokerDetailsResponseDto sendPaytmVerificationOtpRequest(String path, String token, String paytmNumber, PayoutMode payoutMode, String brokerMobile) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(payoutMode.getName()) || StringUtils.isBlank(brokerMobile)){
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmSendOtpDto postBody = preparePaytmSendOtpDto(paytmNumber, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerDetailsResponseDto> returnType = new ParameterizedTypeReference<BrokerDetailsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------validatePaytmOtp--------------------------------------->

    public BaseResponseDto validatePaytmOtp(String token, String paytmNumber, PayoutMode payoutMode, String validationKey, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(PAYTM_OTP_VALIDATE).toUriString();

        return validatePaytmOtp(path, token, paytmNumber, payoutMode, validationKey, brokerMobile);
    }

    private BaseResponseDto validatePaytmOtp(String path, String token, String paytmNumber, PayoutMode payoutMode, String validationKey, String brokerMobile) {

        if (StringUtils.isBlank(paytmNumber) || StringUtils.isBlank(validationKey) || StringUtils.isBlank(payoutMode.getName()) || StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        PaytmOtpValidationDto postBody = preparePaytmOtpVerificationDto(paytmNumber, payoutMode,validationKey);

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

    //    <----------------------------------------addUPIDetails--------------------------------------->

    public BrokerDetailsResponseDto addUPIDetails(String token, String vpaAddress, PayoutMode payoutMode, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_DETAILS).toUriString();

        return addUPIDetails(path, token, vpaAddress, payoutMode, brokerMobile);
    }

    private BrokerDetailsResponseDto addUPIDetails(String path, String token, String vpaAddress, PayoutMode payoutMode, String brokerMobile) {

        if (StringUtils.isBlank(vpaAddress) || StringUtils.isBlank(payoutMode.getName())) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        UPIDto postBody = prepareUPIDto(vpaAddress, payoutMode);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

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

    public BrokerKYCDetailReponseDto getBrokerKYCDetails(String token, String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(KYC_DETAILS).toUriString();

        return getBrokerKYCDetails(path, token, brokerMobile);
    }

    private BrokerKYCDetailReponseDto getBrokerKYCDetails(String path, String token, String brokerMobile) {

        if (StringUtils.isBlank(token)) {
            throw new IllegalArgumentException("Please check the token provided !");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

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

    public BrokerDetailsResponseDto createBroker(BrokerDto brokerDto, String token) {
        String path = UriComponentsBuilder.fromPath(CREATE_BROKER).toUriString();

        return createBroker(path, brokerDto,token);
    }

    private BrokerDetailsResponseDto createBroker(String path,BrokerDto brokerDto, String token) {

        if (Objects.isNull(brokerDto)) {
            throw new IllegalArgumentException("Request is null for adding user");
        }

        Object postBody = brokerDto;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerDetailsResponseDto> returnType = new ParameterizedTypeReference<BrokerDetailsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------getBrokerDetails--------------------------------------->

    public BrokerDetailsResponseDto getBrokerDetails(String token,String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(BROKER_DETAILS).toUriString();

        return getBrokerDetails(path, token, brokerMobile);
    }

    private BrokerDetailsResponseDto getBrokerDetails(String path, String token, String brokerMobile) {

        if (StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the Params");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerDetailsResponseDto> returnType = new ParameterizedTypeReference<BrokerDetailsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------uploadPanDetails--------------------------------------->

    public BrokerDetailsResponseDto uploadPanDetails(String token, String brokerMobile, String panHolderName, String panNumber, MultipartFile file) throws IOException {
        String path = UriComponentsBuilder.fromPath(PAN_DETAILS).toUriString();

        return uploadPanDetails(path, token, brokerMobile,panHolderName,panNumber,file);
    }

    private BrokerDetailsResponseDto uploadPanDetails(String path, String token, String brokerMobile, String panHolderName, String panNumber, MultipartFile file) throws IOException {

        if (StringUtils.isBlank(brokerMobile) || StringUtils.isBlank(panHolderName) || StringUtils.isBlank(panNumber) || Objects.isNull(file)) {
            throw new IllegalArgumentException("Please check all the Params");
        }

        MultiValueMap<String, Object> postBody = new LinkedMultiValueMap<>();

        postBody.add("file",  file);


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        queryParams.add("panHolderName",panHolderName);

        queryParams.add("panNumber",panNumber);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.setContentType(MediaType.MULTIPART_FORM_DATA);

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerDetailsResponseDto> returnType = new ParameterizedTypeReference<BrokerDetailsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------getTdsInfo--------------------------------------->

    public TdsInfoResponseDto getTdsInfo(String token) {
        String path = UriComponentsBuilder.fromPath(TDS_INFO).toUriString();

        return getTdsInfo(path,token);
    }

    private TdsInfoResponseDto getTdsInfo(String path, String token) {

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<TdsInfoResponseDto> returnType = new ParameterizedTypeReference<TdsInfoResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    //    <----------------------------------------updateTdsPercentageToMax--------------------------------------->

    public TdsResponseDto updateTdsPercentageToMax(String token,String brokerMobile) {
        String path = UriComponentsBuilder.fromPath(UPDATE_TDS_MAX).toUriString();

        return updateTdsPercentageToMax(path, token, brokerMobile);
    }

    private TdsResponseDto updateTdsPercentageToMax(String path, String token, String brokerMobile) {

        if (StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the Params");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<TdsResponseDto> returnType = new ParameterizedTypeReference<TdsResponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------getTdsDetailsForBroker--------------------------------------->

    public BrokerTdsDetailResponse getTdsDetailsForBroker(String token, String brokerMobile, Double amount, String transactionId) {
        String path = UriComponentsBuilder.fromPath(BROKER_TDS_DETAILS).toUriString();

        return getTdsDetailsForBroker(path,token,brokerMobile,amount,transactionId);
    }

    private BrokerTdsDetailResponse getTdsDetailsForBroker(String path, String token, String brokerMobile, Double amount, String transactionId) {

        if (amount == null || StringUtils.isBlank(brokerMobile)) {
            throw new IllegalArgumentException("Please check all the provided params!!");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("amount", String.valueOf(amount));

        queryParams.add("brokerMobile", brokerMobile );

        if (!StringUtils.isBlank(transactionId)){
            queryParams.add("transactionId", transactionId);
        }

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerTdsDetailResponse> returnType = new ParameterizedTypeReference<BrokerTdsDetailResponse>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }


    //    <----------------------------------------redeemPaymentBroker--------------------------------------->

    public ResponseDto<Void> redeemPaymentBroker(PaymentRedeemDto paymentRedeemDto, String token) {
        String path = UriComponentsBuilder.fromPath(PAYOUT_URL).toUriString();

        return redeemPaymentBroker(path, paymentRedeemDto, token);
    }

    private ResponseDto<Void> redeemPaymentBroker(String path, PaymentRedeemDto paymentRedeemDto, String token) {

        if (Objects.isNull(paymentRedeemDto)) {
            throw new IllegalArgumentException("Request is null for Payment");
        }

        Object postBody = paymentRedeemDto;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    //    <----------------------------------------changeBrokerPaymentMode--------------------------------------->

    public BrokerKYCDetailReponseDto changeBrokerPaymentMode(String token, String brokerMobile, int paymentModeId) {
        String path = UriComponentsBuilder.fromPath(CHANGE_PAYMENT_MODE).toUriString();

        return changeBrokerPaymentMode(path, token, brokerMobile, paymentModeId);
    }

    private BrokerKYCDetailReponseDto changeBrokerPaymentMode(String path, String token, String brokerMobile, int paymentModeId) {

        if (StringUtils.isBlank(token) || StringUtils.isBlank(brokerMobile) || StringUtils.isBlank(String.valueOf(paymentModeId))) {
            throw new IllegalArgumentException("Please check the params provided !");
        }

        Object postBody = null;

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        queryParams.add("brokerMobile",brokerMobile);

        queryParams.add("paymentModeId", String.valueOf(paymentModeId));


        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.add(SecurityConstants.AUTHORIZATION_HEADER, VENTA_TOKEN_PREFIX + " " + token );

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<BrokerKYCDetailReponseDto> returnType = new ParameterizedTypeReference<BrokerKYCDetailReponseDto>() {
        };

        return restClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, accept, returnType);
    }
}
