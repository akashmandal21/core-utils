package com.stanzaliving.awl.service;

import java.util.List;

import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLDealerDetailsDto;
import com.stanzaliving.awl.dto.AWLSKUDetailsDto;
import com.stanzaliving.awl.dto.AWLVendorDetailsDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;

public interface AWLIntegrationClientService {

	ResponseDto<String> createBatchDetails(List<AWLBatchDetailsDto> awlBatchDetailsDtos);
	
	
	//ResponseDto<String> createBatchDetailsUsingOKHTTP(AWLBatchDetailsDto awlBatchDetailsDto);
	
	
	ResponseDto<String> createVendorDetails(List<AWLVendorDetailsDto> awlVendorDetailsDtos);
	
	
	ResponseDto<String> createDealerDetails(List<AWLDealerDetailsDto> awlDealerDetailsDtos);
	
	ResponseDto<String> createSKUDetails(List<AWLSKUDetailsDto> awlskuDetailsDtos);
}
