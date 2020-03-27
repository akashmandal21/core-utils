package com.stanzaliving.awl.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLDealerDetailsDto;
import com.stanzaliving.awl.dto.AWLVendorDetailsDto;
import com.stanzaliving.awl.service.AWLIntegrationClientService;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.StanzaHttpException;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Validated
public class AWLIntegrationClientServiceImpl implements AWLIntegrationClientService {

	private StanzaRestClient restClient;

	
	@PostConstruct
	public void initAWLClient() {
		log.info("Initializing AWL Integration Stanza Rest Client");
		this.restClient = new StanzaRestClient(AWLIntegrationClientService.AWL_INTEGRATION_BASE_PATH);
	}

	
	
	@Override
	public ResponseDto<String> createBatchDetails(@Valid List<AWLBatchDetailsDto> awlBatchDetailsDtos) {
		log.info("Create AWLBatch Details with data {} initiated. ", awlBatchDetailsDtos);
		String path = UriComponentsBuilder.fromPath("/InsertBatchDetails").toUriString();
		return createInAWL(awlBatchDetailsDtos, path, AWLVendorDetailsDto.class);
	}



	@Override
	public ResponseDto<String> createVendorDetails(List<AWLVendorDetailsDto> awlVendorDetailsDtos) {
		log.info("Create AWLVendor Details with data {} initiated. ", awlVendorDetailsDtos);
		String path = UriComponentsBuilder.fromPath("/InsertVendorDetails").toUriString();
		return createInAWL(awlVendorDetailsDtos, path, AWLVendorDetailsDto.class);
	}

	

	
	private ResponseDto<String> createInAWL(Object data,String path, Class clazz){
		String response = null;
		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		final HttpHeaders headerParams = new HttpHeaders();
		final String[] accepts = { "*/*" };
		final List<org.springframework.http.MediaType> accept = restClient.selectHeaderAccept(accepts);
		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		try {
			response  =  restClient.invokeAPI(path, HttpMethod.POST, queryParams, data, headerParams, accept,returnType);
			return ResponseDto.success("Success",response);
		} catch (StanzaHttpException e) {
			log.error("HTTP Error occurred during AWL Integration - for instance of {} with data {} with HTTPStatus Code {} ",clazz, data, e.getStatusCode());
		} catch (Exception e) {
			log.error("Error occurred during AWL Integration - Create Batch Details for instance of {} with data {} ", clazz, data);
			log.error(e.getMessage());
		}
		return ResponseDto.failure("Failure",response);
	}



	@Override
	public ResponseDto<String> createDealerDetails(List<AWLDealerDetailsDto> awlDealerDetailsDtos) {
		log.info("Create AWLDealerr Details with data {} initiated. ", awlDealerDetailsDtos);
		String path = UriComponentsBuilder.fromPath("/InsertDealerDetails").toUriString();
		return createInAWL(awlDealerDetailsDtos, path, AWLDealerDetailsDto.class);
	}
	
	
	
	
	
	
	
	
	
	
//	/**
//	@Override
//	public ResponseDto<String> createBatchDetailsUsingOKHTTP(AWLBatchDetailsDto awlBatchDetailsDto) {
//	
//		OkHttpClient client = new OkHttpClient();
//
//		MediaType mediaType = MediaType.parse("application/json");
//		
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
//		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
//		
//		SimpleModule module = new SimpleModule();
//		module.addSerializer(new Java8LocalDateStdSerializer());
//		module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());
//		
//		module.addSerializer(new Java8LocalTimeSerializer());
//		module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());
//
//		mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//		mapper.registerModule(module);
//
//		
//		try {
//			String data =mapper.writeValueAsString(Arrays.asList(awlBatchDetailsDto));
//			
//			RequestBody body = RequestBody.create
//					(mediaType,data);
//			Request request = new Request.Builder()
//			  .url("http://test.eprontoglobal.com/Service1.svc/InsertBatchDetails")
//			  .post(body)
//			  .addHeader("content-type", "application/json")
//			  .addHeader("Accept", "*/*")
//			  .build();
//
//			Response response = client.newCall(request).execute();
//			System.out.println(response.isSuccessful());
//			System.out.println(response.body());
//			System.out.println(response.body().string() +"___"+response.body().toString());
//			System.out.println(response.message());
//			System.out.println(response.networkResponse());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		return null;
//	}
//	
}
