package com.stanzaliving.core.client.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.stanzaliving.wanda.dtos.*;
import com.stanzaliving.core.base.exception.BaseMarker;
import com.stanzaliving.wanda.venta.response.BookingStatusResponseDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import com.stanzaliving.core.backend.dto.UserHostelDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.internet.response.UserCurrentPlanDetailDto;
import com.stanzaliving.transformations.pojo.ResidenceUIDto;
import com.stanzaliving.venta.OccupiedRoomDto;
import com.stanzaliving.wanda.food.request.DemographicsRequestDto;
import com.stanzaliving.wanda.food.response.FoodRegionPreferenceResponse;
import com.stanzaliving.wanda.response.OnBoardingGetResponse;
import com.stanzaliving.wanda.response.ResidentKYCDocumentResponseDtoV2;
import com.stanzaliving.wanda.response.UserInternetStatusInfoDto;
import com.stanzaliving.wanda.response.WandaFileResponseDto;
import com.stanzaliving.wanda.response.WandaResponse;
import lombok.extern.log4j.Log4j2;
import java.util.Collections;


@Log4j2
public class WandaClientApi {

	private StanzaRestClient restClient;

	public WandaClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public FullUserDto getUserDetails(String userUuid) {
		try {
			Object postBody = null;

			log.info("Received request to get FullUserDto of userUuid {}", userUuid);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("userUuid", userUuid);

			String path = UriComponentsBuilder.fromPath("/coreApi/fulluserdto/id/{userUuid}")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<FullUserDto> returnType = new ParameterizedTypeReference<FullUserDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching user details for userUuid: " + userUuid, e);
		}

		return null;
	}

	public UserDetailDto getUserDetailsByUserCode(String userCode) {

		try {
			Object postBody = null;

			log.info("Received request to get UserDetailDto of userCode: {}", userCode);

			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("userCode", userCode);

			String path = UriComponentsBuilder.fromPath("/coreApi/userDetailDto/id/{userCode}")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<UserDetailDto> returnType = new ParameterizedTypeReference<UserDetailDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching user details for user code: " + userCode, e);
		}

		return null;
	}

	public Map<String, String> getUserCodeIdMap(Set<String> userCodes) {

		Object postBody = userCodes;

		log.info("Received request to get Map of userCode {}", userCodes);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/user/userCodeId").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Map<String, String>> returnType = new ParameterizedTypeReference<Map<String, String>>() {
		};

		Map<String, String> response = new HashMap<>();

		try {

			response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept,
					returnType);

		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Exception while getting user code map from wanda: ", e);
		}

		return response;
	}

	public List<FeaturephoneUserDto> getFeaturePhoneUsers(String hostel) {

		try {
			Object postBody = null;

			log.info("Received request to get Feature phone user dto of hostel: {}", hostel);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/user/list/feature/phone").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("hostel", hostel);
			queryParams.add("featurePhone", Boolean.TRUE.toString());

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<List<FeaturephoneUserDto>> returnType = new ParameterizedTypeReference<List<FeaturephoneUserDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching feature phone users for hostel: " + hostel, e);
		}

		return null;
	}

	public List<FeaturephoneUserDto> getFeaturePhoneUsersV2(String residenceId, Boolean featurePhone, String residentCode) {

      try {
          Object postBody = null;

          log.info("Received request to get Feature phone user dto of residenceId: {}", residenceId);

          final Map<String, Object> uriVariables = new HashMap<>();

          String path = UriComponentsBuilder.fromPath("/coreApi/user/list/feature/phone/v2").buildAndExpand(uriVariables)
                  .toUriString();

          final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
          queryParams.add("hostel", residenceId);
          queryParams.add("featurePhone", Objects.nonNull(featurePhone) ? featurePhone.toString() : null);
          queryParams.add("residentCode", residentCode);

          final HttpHeaders headerParams = new HttpHeaders();

          final String[] accepts = { "*/*" };
          final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

          ParameterizedTypeReference<List<FeaturephoneUserDto>> returnType = new ParameterizedTypeReference<List<FeaturephoneUserDto>>() {
          };

          return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
      } catch (Exception e) {
          log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching feature phone users for hostel: " + residenceId, e);
      }

      return null;
  }

	public List<UserHostelDetailsDto> getUserHostelDetails(String hostelId) {
		return getUserHostelDetails(hostelId, false);
	}

	public List<UserHostelDetailsDto> getUserHostelDetails(String hostelId, boolean currentHostel) {
		try {
			Object postBody = null;

			log.info("Received request to get UserHostelDetailsDto of hostelId: {}", hostelId);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/user/hostel/details").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			queryParams.add("hostelId", hostelId);
			queryParams.add("currentHostel", String.valueOf(currentHostel));

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<List<UserHostelDetailsDto>> returnType = new ParameterizedTypeReference<List<UserHostelDetailsDto>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching users for hostel: " + hostelId, e);
		}

		return null;
	}

	public List<UserHostelDetailsDto> getUserHostelDetailsByHostelIdIn(Collection<String> hostelIds) {

		Object postBody = hostelIds;

		log.info("Received request to get UserHostelDetailsDto of hostelIds: {}", hostelIds);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/user/hostel/details/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		ParameterizedTypeReference<List<UserHostelDetailsDto>> returnType = new ParameterizedTypeReference<List<UserHostelDetailsDto>>() {
		};

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		List<UserHostelDetailsDto> responseDto = null;

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, hostelIds, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while getting userhostel details ", e);
		}

		return Objects.nonNull(responseDto) ? responseDto : new ArrayList<>();

	}

	public List<UserHostelDto> getUserHostelByHostelId(String hostelId) {
		log.info("Received request to get UserHostelDto by HostelId: {}", hostelId);

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("hostelId", hostelId);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/list/hostel/{hostelId}").buildAndExpand(uriVariables).toUriString();
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {"*/*"};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<List<UserHostelDto>> returnType = new ParameterizedTypeReference<List<UserHostelDto>>() {
		};
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
	}


	public List<UserHostelDto> getUserHostelList() {

		Object postBody = null;

		log.info("Received request to get UserHostelDto");

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/user/list/hostel").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserHostelDto>> returnType = new ParameterizedTypeReference<List<UserHostelDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public boolean updateHostelOfUser(String userId, String hostelId) {

		Object postBody = null;

		log.info("Received request to update Hostel of user {} hostelId {} ", userId, hostelId);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);
		uriVariables.put("hostelId", hostelId);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/update/hostel/{userId}/{hostelId}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		try {

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Exception while update hostel for user: " + userId +" to " + hostelId, e);
		}

		return false;
	}

	public UserDetailDto getUserDetailsByMobile(String mobile) {

		Object postBody = null;

		log.info("Received request to get UserDetailDto from mobile: {}", mobile);

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("mobileNumber", mobile);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/userDetailDto/{mobileNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept,
					UserDetailDto.class);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while getting user Details from Core by mobile: " + mobile, e);
		}
		return null;
	}

	public List<UserCodeIdMapDto> getUserDataBySearch(String searchTerm) {

		Object postBody = null;

		log.info("Received request to get UserCodeIdMapDto {}", searchTerm);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/coreApi/get/all/user").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("searchTerm", searchTerm);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<UserCodeIdMapDto>> returnType = new ParameterizedTypeReference<List<UserCodeIdMapDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResidenceUIDto getUserResidenceDetails(String userUuid, String flag) {

		Object postBody = null;

		log.info("Received request to get ResidenceUIDto of userUuid {}", userUuid);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userCode", userUuid);
		uriVariables.put("flag", flag);

		String path = UriComponentsBuilder.fromPath("/coreApi/get/user/residence/{flag}/{userCode}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResidenceUIDto> returnType = new ParameterizedTypeReference<ResidenceUIDto>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public String getUserUuidByUserCode(String userCode) {

		try {
			Object postBody = null;

			log.info("Inside the request for get userUuid {}", userCode);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/get/userUuid").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("userCode", userCode);

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error fetching user uuid for userCode: " + userCode, e);
		}

		return null;
	}

	public String getUserCodeByUserUuid(String userUuid) {

		try {
			Object postBody = null;

			log.info("Inside the request for get userCode {}", userUuid);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/get/userCode").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("userUuid", userUuid);

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
		}

		return null;

	}

	public ResponseDto<List<String>> getListOfUserUuidsForCityMicromarketResidenceUuids(LocationDetailsListDto locationDetailsListDto) {

		try {
			Object postBody = null;

			log.info("Received request to get List of User UUID's by City Micro-market Residence Uuids: {}", locationDetailsListDto);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/internal/student/list")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
			};

			postBody=locationDetailsListDto;

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching User ID's By City Micromarket Residence Uuids: " + locationDetailsListDto, e);
		}

		return null;
	}
	public ResidenceUIDto getUserCityMicromarketResidenceUuidsByUserCode(String usercode) {

		try {
			Object postBody = null;

			log.info("Received request to get User City Micromarket Residence Uuids By UserCode: {}", usercode);

			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("usercode", usercode);

			String path = UriComponentsBuilder.fromPath("/coreApi/get/user/residence/userCode/{usercode}")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResidenceUIDto> returnType = new ParameterizedTypeReference<ResidenceUIDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching User City Micromarket Residence Uuids By UserCode: " + usercode, e);
		}

		return null;
	}


	public List<WandaFileResponseDto> getUserProfile(List<String> userUuids) {


		Object postBody = userUuids;

		log.info("Received request to get profile of user {}" , userUuids);

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/user/profile").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<WandaFileResponseDto>> returnType = new ParameterizedTypeReference<List<WandaFileResponseDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

	}


	public ResidentProfessionalDetailsDto getProfessionalDetails(String userUuid) {

		try {
			Object postBody = null;

			log.info("Received request to get ProfessionalDetails for User :{}", userUuid);

			final Map<String, Object> uriVariables = new HashMap<>();
			uriVariables.put("userUuid", userUuid);

			String path = UriComponentsBuilder.fromPath("/internal/user/professionalDetails/{userUuid}").buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResidentProfessionalDetailsDto> returnType = new ParameterizedTypeReference<ResidentProfessionalDetailsDto>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while fetching get ProfessionalDetails By userUuid: " + userUuid, e);
		}

		return null;
	}

	public boolean updateHostelAndRoomOfUser(String userId, String hostelId, String roomNum) {

		Object postBody = null;

		log.info("Received request to update Hostel of user {} hostelId {} ", userId, hostelId);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userId", userId);
		uriVariables.put("hostelId", hostelId);
		uriVariables.put("roomNum", roomNum);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/update/hostel/{userId}/{hostelId}/{roomNum}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		try {

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Exception while update hostel for user: " + userId + " to " + hostelId, e);
		}

		return false;
	}

	public List<OccupiedRoomDto> getOccupiedRoomDetails(String residenceUuid, LocalDate fromDate, LocalDate toDate) {
		Object postBody = null;

		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residenceUuid", residenceUuid);

		String path = UriComponentsBuilder.fromPath("/coreApi/getOccupiedRoomDetails/{residenceUuid}")
				.buildAndExpand(uriVariables).toUriString();

		List<OccupiedRoomDto> occupiedRoomDtoList = new ArrayList<>();
		// create path and map variables

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("fromDate", fromDate.toString());
		queryParams.add("toDate", toDate.toString());

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<List<OccupiedRoomDto>> returnType = new ParameterizedTypeReference<List<OccupiedRoomDto>>() {
		};

		try {
			occupiedRoomDtoList = restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Error while getting room count for residence: " + residenceUuid);
		}
		return occupiedRoomDtoList;
	}


	public ResponseDto<ResidentKYCDocumentResponseDtoV2> getResidentKYCDocuments(String residentUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("residentUuid", residentUuid);

		String path = UriComponentsBuilder.fromPath("/coreApi/get/resident/kyc/{residentUuid}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };

		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<ResidentKYCDocumentResponseDtoV2>> returnType =
				new ParameterizedTypeReference<ResponseDto<ResidentKYCDocumentResponseDtoV2>>() {
		};

		return restClient.invokeAPI(
				path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public List<FoodRegionPreferenceResponse> getDemoGraphicsData(DemographicsRequestDto demographicsRequestDto) {

		Object postBody = demographicsRequestDto;

		log.info("Received request to get Demographics detail{}", demographicsRequestDto.getHostelIdList().size());

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/demographics/consumer/preference/get").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<FoodRegionPreferenceResponse>>> returnType = new ParameterizedTypeReference<ResponseDto<List<FoodRegionPreferenceResponse>>>() {
		};

		List<FoodRegionPreferenceResponse> response = null;

		try {
			response = restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType).getData();
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Exception while getting user code map from wanda: ", e);
		}

		return response;
	}

	public WandaResponse<OnBoardingGetResponse> getOnboardingDetails(String userId) {

		try {
			Object postBody = null;

			log.info("get User details by userUuid is {} ", userId);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("userId", userId);

			String path = UriComponentsBuilder.fromPath("/internal/get/onboarding/details//{userId}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {"*/*"};

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>> returnType = new ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"error while fetching the user details " + e);
			return null;
		}
	}
	public WandaResponse<OnBoardingGetResponse> getOnBoardingDetails(String userId) {


		try {
			Object postBody = null;

			log.info("get User details by userUuid is {} ", userId);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("userId", userId);

			String path = UriComponentsBuilder.fromPath("/internal/get/onboarding/details/{userId}").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = {"*/*"};

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>> returnType = new ParameterizedTypeReference<WandaResponse<OnBoardingGetResponse>>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR, "error while fetching the user details ", e);
		}

		return null;

	}

	public String getUserCodeByEmail(String email) {

		try {
			Object postBody = null;
			log.info("Inside the request for get userCode {}", email);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/coreApi/get/userCode/by/email").buildAndExpand(uriVariables)
					.toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			queryParams.add("email", email);

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };

			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
			};

			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {

			log.error(BaseMarker.WANDA_API_ERROR, "Error while fetching usercode by email ", e);
		}

		return null;

	}

	public ResponseDto<BankDetailsDto> getBankDetailsForUserId(String userId) {
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("userId", userId);

		String path = UriComponentsBuilder.fromPath("/internal/bank-details/{userId}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();
		String[] accepts = new String[]{"*/*"};
		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<BankDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<BankDetailsDto>>() {
		};
		try {
			log.info("Executing Api for getting bank account details with Url {}", path);
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Exception while fetching bank account details based on userId " + userId, e);
		}
		return null;
	}

	public ResponseDto<UpiDetailsDto> getUpiDetailsForUserId(String userId) {
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("userId", userId);

		String path = UriComponentsBuilder.fromPath("/internal/upi/{userId}").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();
		String[] accepts = new String[]{"*/*"};
		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<UpiDetailsDto>> returnType = new ParameterizedTypeReference<ResponseDto<UpiDetailsDto>>() {
		};
		try {
			log.info("Executing Api for getting bank account details with Url {}", path);
			return this.restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR,"Exception while fetching bank account details based on userId " + userId, e);
		}
		return null;
	}

	public boolean updateHostelOfUserByUserCode(String userCode, String hostelId) {

		Object postBody = null;

		log.info("Received request to update Hostel of user {} hostelId {} ", userCode, hostelId);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userCode", userCode);
		uriVariables.put("hostelId", hostelId);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/hostel/update/{userCode}/{hostelId}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		try {

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR, "Exception while update hostel for user: " + userCode + " to " + hostelId, e);
		}

		return false;
	}

	public boolean updateHostelAndRoomOfUserByUserCode(String userCode, String hostelId, String roomNum) {

		Object postBody = null;

		log.info("Received request to update Hostel of user {} hostelId {} ", userCode, hostelId);

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("userCode", userCode);
		uriVariables.put("hostelId", hostelId);
		uriVariables.put("roomNum", roomNum);

		String path = UriComponentsBuilder.fromPath("/coreApi/user/hostel/update/{userCode}/{hostelId}/{roomNum}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {
		};

		try {

			return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);

		} catch (Exception e) {
			log.error(BaseMarker.WANDA_API_ERROR, "Exception while update hostel for user: " + userCode + " to " + hostelId, e);
		}

		return false;

	}

	public ResponseDto<BookingStatusResponseDto> getBookingStatusByUserUuid(String userUuid) {
		try {
			Object postBody = null;

			log.info("Received request to get BookingStatusResponseDto of userUuid {}", userUuid);

			final Map<String, Object> uriVariables = new HashMap<>();

			uriVariables.put("userUuid", userUuid);

			String path = UriComponentsBuilder.fromPath("/internal/booking-status/id/{userUuid}")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<BookingStatusResponseDto>> returnType =
					new ParameterizedTypeReference<ResponseDto<BookingStatusResponseDto>>() {
			};
 			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching booking status for userUuid: {}", userUuid, e);
		}

		return null;
	}

	public ResponseDto<Boolean> saveUpiDetails(UpiDetailsDto upiDetailsDto) {
		Object postBody = upiDetailsDto;

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/upi").buildAndExpand(uriVariables).toUriString();

		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		HttpHeaders headerParams = new HttpHeaders();
		String[] accepts = new String[]{"*/*"};
		List<MediaType> accept = this.restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
		};
		try {
			log.info("Executing Api for saving upi account details with Url {} on upiDetailsDto {} ", path,upiDetailsDto);
			return this.restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Exception while saving upi account details based on upiDetailsDto {}, Exception is {}", upiDetailsDto, e);
		}
		return null;
	}

	public ResponseDto<UserCurrentPlanDetailDto> getUserInternetUsage(String userId, String residenceUuid) {
		try {

			log.info("Received request to get UserInternetUsage of userUuid {}", userId);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/internal/internet/usage")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			queryParams.put("residenceId", Collections.singletonList(residenceUuid));
			queryParams.put("userId", Collections.singletonList(userId));

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<UserCurrentPlanDetailDto>> returnType =
					new ParameterizedTypeReference<ResponseDto<UserCurrentPlanDetailDto>>() {
					};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching Internet Usage for userUuid: {}", userId, e);
		}

		return ResponseDto.failure("Failed to get internet usage");
	}

	public ResponseDto<UserInternetStatusInfoDto> getUserInternetPlan(String userId, String residenceUuid) {
		try {

			log.info("Received request to get UserInternetPlan of userUuid {}", userId);

			final Map<String, Object> uriVariables = new HashMap<>();

			String path = UriComponentsBuilder.fromPath("/internal/internet/plan")
					.buildAndExpand(uriVariables).toUriString();

			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

			queryParams.put("residenceId", Collections.singletonList(residenceUuid));
			queryParams.put("userId", Collections.singletonList(userId));

			final HttpHeaders headerParams = new HttpHeaders();

			final String[] accepts = { "*/*" };
			final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

			ParameterizedTypeReference<ResponseDto<UserInternetStatusInfoDto>> returnType =
					new ParameterizedTypeReference<ResponseDto<UserInternetStatusInfoDto>>() {
					};
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while fetching Internet Plan for userUuid: {}", userId, e);
		}

		return ResponseDto.failure("Failed to get Plan details");
	}
}
