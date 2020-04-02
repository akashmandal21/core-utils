package com.stanzaliving.awl.service;

import java.util.List;

import com.stanzaliving.awl.dto.AWLBaseResponseDto;
import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLDealerDetailsDto;
import com.stanzaliving.awl.dto.AWLSKUDetailsDto;
import com.stanzaliving.awl.dto.AWLVendorDetailsDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;

public interface AWLIntegrationClientService {

	ResponseDto<List<AWLBaseResponseDto>> createBatchDetails(List<AWLBatchDetailsDto> awlBatchDetailsDtos);
	
	
	//ResponseDto<String> createBatchDetailsUsingOKHTTP(AWLBatchDetailsDto awlBatchDetailsDto);
	
	
	ResponseDto<List<AWLBaseResponseDto>> createVendorDetails(List<AWLVendorDetailsDto> awlVendorDetailsDtos);
	
	
	ResponseDto<List<AWLBaseResponseDto>> createDealerDetails(List<AWLDealerDetailsDto> awlDealerDetailsDtos);
	
	ResponseDto<List<AWLBaseResponseDto>> createSKUDetails(List<AWLSKUDetailsDto> awlskuDetailsDtos);
}
