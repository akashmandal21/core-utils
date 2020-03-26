package com.stanzaliving.awl.service;

import java.util.List;

import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLVendorDetailsDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;

public interface AWLIntegrationClientService {

	String AWL_INTEGRATION_BASE_PATH = "http://test.eprontoglobal.com/Service1.svc";
	
	ResponseDto<String> createBatchDetails(List<AWLBatchDetailsDto> awlBatchDetailsDtos);
	
	
	//ResponseDto<String> createBatchDetailsUsingOKHTTP(AWLBatchDetailsDto awlBatchDetailsDto);
	
	
	ResponseDto<String> createVendorDetails(List<AWLVendorDetailsDto> awlVendorDetailsDtos);
	
}
