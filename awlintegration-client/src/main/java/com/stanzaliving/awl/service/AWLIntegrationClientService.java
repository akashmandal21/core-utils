package com.stanzaliving.awl.service;

import java.util.List;

import com.stanzaliving.awl.dto.AWLBaseResponseDto;
import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLDealerDetailsDto;
import com.stanzaliving.awl.dto.AWLInwardDataDto;
import com.stanzaliving.awl.dto.AWLSKUDetailsDto;
import com.stanzaliving.awl.dto.AWLVendorDetailsDto;
import com.stanzaliving.core.base.common.dto.ResponseDto;

public interface AWLIntegrationClientService {

	/**
	 * Triggers AWL API to create Batch details at AWL warehouse.
	 * 
	 * Returns the {@link AWLBaseResponseDto} for the supplied data.
	 * 
	 * @param awlBatchDetailsDtos List of Batch details to be created at AWL
	 * 
	 * @author debendra.dhinda
	 * */
	ResponseDto<List<AWLBaseResponseDto>> createBatchDetails(List<AWLBatchDetailsDto> awlBatchDetailsDtos);
	
	
	/**
	 * Triggers AWL API to create Vendor details at AWL warehouse.
	 * 
	 * Returns the {@link AWLBaseResponseDto} for the supplied data.
	 * 
	 * @param awlVendorDetailsDtos List of Vendor details to be created at AWL
	 * 
	 * @author debendra.dhinda
	 * */
	ResponseDto<List<AWLBaseResponseDto>> createVendorDetails(List<AWLVendorDetailsDto> awlVendorDetailsDtos);
	
	
	/**
	 * Triggers AWL API to create Dealer details at AWL warehouse.
	 * 
	 * Returns the {@link AWLBaseResponseDto} for the supplied data.
	 * 
	 * @param awlDealerDetailsDtos List of Dealer details to be created at AWL
	 * 
	 * @author debendra.dhinda
	 * */
	ResponseDto<List<AWLBaseResponseDto>> createDealerDetails(List<AWLDealerDetailsDto> awlDealerDetailsDtos);
	
	
	/**
	 * Triggers AWL API to create SKU details at AWL warehouse.
	 * 
	 * Returns the {@link AWLBaseResponseDto} for the supplied data.
	 * 
	 * @param awlskuDetailsDtos List of SKU details to be created at AWL
	 * 
	 * @author debendra.dhinda
	 * */
	ResponseDto<List<AWLBaseResponseDto>> createSKUDetails(List<AWLSKUDetailsDto> awlskuDetailsDtos);
	
	
	/**
	 * Retrieves list of {@link AWLInwardDataDto} inward data from AWL warehouse.
	 * API : http://test.eprontoglobal.com/Service1.svc/GetInward
	 * 
	 * @author debendra.dhinda
	 * */
	ResponseDto<List<AWLInwardDataDto>> getAllInwardData();
	
	/**
	 * http://test.eprontoglobal.com/Service1.svc/GetInward/All/{vendor},{fdate},{ldate},{catgory}
	 * 
	 * 
	 * */
	ResponseDto<List<AWLInwardDataDto>> getInwardDataForAllFilters(String vendor, String fdate, String ldate, String category);
}
