
package com.stanzaliving.core.leadservice.client.api;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.dto.LeadElasticDto;
import com.stanzaliving.core.leaddashboard.enums.MetricEnum;
import com.stanzaliving.leadService.dto.AutoExpireLeadConfigMapDto;
import com.stanzaliving.leadService.dto.AutoExpireLeadDto;
import com.stanzaliving.website.response.dto.LeadDetailEntity;
import com.stanzaliving.website.response.dto.LeadRequestDto;
import com.stanzaliving.website.response.dto.QualificationQuestionResponseDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Log4j2
public class LeadserviceClientApi {

    private StanzaRestClient restClient;

    public LeadserviceClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public ResponseDto<QualificationQuestionResponseDto> getLeadQualificationQuestions() {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/lead/website/qualification/question").buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<QualificationQuestionResponseDto> getLeadQualificationQuestions(String questionUuid,
                                                                                       String answer) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/lead/website/qualification/question").buildAndExpand(uriVariables)
                .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("questionUuid", questionUuid);
        queryParams.add("answer", answer);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> updateBrokerLead(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/qrcode/qualifcation/update").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<QualificationQuestionResponseDto> getLeadVariantQuestion(String formInterface) {
        Object postBody = null;

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/lead/internal/website/lead/variant/qualification/question")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("form", formInterface);

        final HttpHeaders headLeadDetailEntityerParams = new HttpHeaders();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<QualificationQuestionResponseDto>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> leadUpdate(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/internal/website/lead/variant/update").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<String> rescheduleVisitFromThankyouScreen(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/internal/website/reschedule").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }


    public ResponseDto<LeadRequestDto> leadCreation(LeadRequestDto leadRequestDto) {

        try {
            log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

            Object postBody = leadRequestDto;

            String path = UriComponentsBuilder.fromPath("/lead/internal/create/temp/variant").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
        }

        return null;
    }

    public ResponseDto<LeadRequestDto> leadMigration(LeadRequestDto leadRequestDto) {

        try {
            log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

            Object postBody = leadRequestDto;

            String path = UriComponentsBuilder.fromPath("/lead/internal/create/variant").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
        }

        return null;
    }


    public ResponseDto<LeadRequestDto> createCommonLeadFromWebsite(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/internal/website/create/lead").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
            return null;
        }
    }

    public ResponseDto<LeadRequestDto> createScheduledVisitLead(LeadRequestDto leadRequestDto) {

        try {
            log.info("LeadRequestDto while creating the lead {}", leadRequestDto);

            Object postBody = leadRequestDto;

            String path = UriComponentsBuilder.fromPath("/lead/website/create").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};

            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
        }

        return null;
    }

    public ResponseDto<String> updateMobileVerifiedStatus(String phone) {

        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/lead/internal/update/phone/verified").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("phone", phone);

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
            return null;
        }
    }

    public String updateLeadWebsite(LeadRequestDto leadRequestDto) {

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/website/update").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> checkLeadByPhone(String phone) {
        Object postBody = null;

        log.info("Request received for checkLeadByPhone " + phone);

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/lead/internal/check/phone")
                .buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("phone", phone);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<LeadDetailEntity> search(String phoneNumber, String leadUuid) {

        log.debug("Lead client received phone number {}", phoneNumber);
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/internal/lead/leadDetail").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if (Objects.nonNull(phoneNumber))
            queryParams.add("phone", phoneNumber);
        if (Objects.nonNull(leadUuid))
            queryParams.add("leadUuid", leadUuid);

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<LeadDetailEntity>> returnType = new ParameterizedTypeReference<ResponseDto<LeadDetailEntity>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
            return null;
        }
    }

    public ResponseDto<String> sendPushNotificationsForNumberOfVisitScheduledToday() {

        log.debug("Lead client to send push notification while number of visits scheduled today");
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/internal/lead/push-notification/count/visit-schedule/today").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while sending event for push notification", e);
            return null;
        }
    }

    public ResponseDto<LeadRequestDto> fetchPrebookedRefundEligibleLeads(String phone) {

        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/internal/prebooking/refund/fetch/eligible/leads").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        if (Objects.nonNull(phone)) {
            queryParams.add("phone", phone);
        }

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while fetching prebooked refund eligible leads {}", e);
            return null;
        }
    }

    public ResponseDto<LeadRequestDto> createLeadFromWebChatBot(LeadRequestDto leadRequestDto) {

        try {
            Object postBody = leadRequestDto;

            String path = UriComponentsBuilder.fromPath("/lead/internal/create/leadTemp/leadDetail/merged").toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {"*/*"};


            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<LeadRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<LeadRequestDto>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

        } catch (Exception e) {
            log.error("Error while creating the lead {}", e);
        }

        return null;
    }

    public ResponseDto<String> createGuestLead(LeadRequestDto leadRequestDto) {
        log.info("LeadRequestDto while creating the guest lead {}", leadRequestDto);

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/external/create").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.set("headerAuth", "c2510261f27872a22a160f463dc2ac2111ae2");

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<Boolean> sendOtpForVisitStart() {
        Object postBody = null;

        log.info("Request received for sendOtpForVisitStart");

        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/lead/start-visit/otp")
                .buildAndExpand(uriVariables).toUriString();
        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while send Otp For VisitStart {}", e);
            return null;
        }

    }

    public ResponseDto<String> updateLeadSourceGroupForExistingLeads(PaginationRequest paginationRequest) {

        log.debug("Lead client to update lead source group for existing leads");
        Object postBody = paginationRequest;

        String path = UriComponentsBuilder.fromPath("/internal/lead/update/lead-source-group").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while updating lead source group for existing leads", e);
            return null;
        }
    }

    public ResponseDto<String> expireInactiveLead(AutoExpireLeadDto autoExpireLeadDto) {
        log.info("Expire inactive Lead : {}", autoExpireLeadDto);
        Object postBody = autoExpireLeadDto;

        String path = UriComponentsBuilder.fromPath("/internal/lead/auto-expire/inactive").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while checking for inactive lead or expiring an inactive lead", e);
            return null;
        }
    }

    public ResponseDto<Void> syncElasticData(LeadElasticDto leadElasticDto) {
        log.debug("Lead client to lead elastic data");
        Object postBody = leadElasticDto;
        String path = UriComponentsBuilder.fromPath("/internal/lead/sync-elastic-data").toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while syncing lead elastic data", e);
            return null;
        }
    }

    public ResponseDto<List<AutoExpireLeadDto>> getLeadsToCheckForInactivity() {
        log.info("Get leads to check for inactivity");

        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/internal/lead/all/auto-expire/eligible").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<AutoExpireLeadDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<AutoExpireLeadDto>>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while getting leads to check for inactivity", e);
            return null;
        }
    }

    public ResponseDto<String> updateGuestLead(com.stanzaliving.leadService.LeadRequestDto leadRequestDto) {
        log.info("LeadRequestDto while creating the guest lead {}", leadRequestDto);

        Object postBody = leadRequestDto;

        String path = UriComponentsBuilder.fromPath("/lead/external/update").toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final HttpHeaders headerParams = new HttpHeaders();

        headerParams.set("headerAuth", "c2510261f27872a22a160f463dc2ac2111ae2");

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {

        };
        try {
            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while checking for inactive lead or expiring an inactive lead", e);
            return null;
        }
    }

    public ResponseDto<AutoExpireLeadConfigMapDto> getAutoExpireLeadConfigMaps() {
        log.info("Get auto expire lead config maps");

        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/internal/lead/auto-expire/config-maps").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = {"*/*"};

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);


        ParameterizedTypeReference<ResponseDto<AutoExpireLeadConfigMapDto>> returnType = new ParameterizedTypeReference<ResponseDto<AutoExpireLeadConfigMapDto>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while auto expire lead config maps", e);
            return null;
        }
    }

    public ResponseDto<Boolean> checkForHotLead(String phone, String leadUuid) {

        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/internal/lead/is-hot-lead").toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (Objects.nonNull(phone))
            queryParams.add("phone", phone);
        if (Objects.nonNull(leadUuid))
            queryParams.add("leadUuid", leadUuid);
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while auto expire lead config maps", e);
            return null;
        }
    }

    public ResponseDto<String> autoExpireReferralCode() {
        log.info("Expire referralCodes");
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/internal/lead/referralCode/markExpire").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while auto expire referral codes", e);
            return null;
        }
    }


    public ResponseDto<List<String>> fetchMetricData(MetricEnum metricEnum) {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/internal/lead/fetch-metric-data").toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("metricEnum", metricEnum.name());
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while fetching metric data", e);
            return null;
        }
    }


    public void getSmartLeadReassignmentList() {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/internal/lead/reassign-eligible-leads").toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final String[] accepts = {"*/*"};
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        try {
            restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while fetching metric data", e);
        }
    }

    public ResponseDto<List<String>> fetchGroundAssociates() {
        log.info("Fetching ground associates");
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/internal/lead/ground-associates").toUriString();

        final HttpHeaders headerParams = new HttpHeaders();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

        final String[] accepts = { "*/*" };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };

        try {
            return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Exception caused while fetching ground associates", e);
            return null;
        }
    }
}