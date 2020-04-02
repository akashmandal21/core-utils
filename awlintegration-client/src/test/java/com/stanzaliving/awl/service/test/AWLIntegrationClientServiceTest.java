package com.stanzaliving.awl.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stanzaliving.awl.dto.AWLBaseResponseDto;
import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLDealerDetailsDto;
import com.stanzaliving.awl.dto.AWLSKUDetailsDto;
import com.stanzaliving.awl.dto.AWLVendorDetailsDto;
import com.stanzaliving.awl.service.AWLIntegrationClientService;
import com.stanzaliving.awl.service.impl.AWLIntegrationClientServiceImpl;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.utils.StanzaUtils;

import lombok.extern.log4j.Log4j2;

@SpringBootTest(classes = { AWLIntegrationClientService.class, AWLIntegrationClientServiceImpl.class })
@RunWith(SpringRunner.class)
@Log4j2
public class AWLIntegrationClientServiceTest {

	String RESPONSE_SUCCESS = "SUCCESS";
	String RESPONSE_ALREADY_EXISTS = "Already Exist";
	
	boolean STATUS_FALSE=false;
	int STATUS_CODE_409 =409;
	

	@Autowired
	AWLIntegrationClientService awlClient;

	@Test
	public void test1_createAWLBatchDetails() {
		assertNotNull(awlClient);
		ResponseDto<List<AWLBaseResponseDto>> result = awlClient.createBatchDetails(Arrays.asList(prepareAWLBatchDetailsData()));
		assertNotNull(result);
		AWLBaseResponseDto dto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(dto.getMessage(), RESPONSE_SUCCESS);
		assertNotNull(dto.getId());

	}

	@Test
	public void test2_createAWLBatchDetails() {
		AWLBatchDetailsDto dto = prepareAWLBatchDetailsData();
		ResponseDto<List<AWLBaseResponseDto>> result = awlClient.createBatchDetails(Arrays.asList(dto));
		assertNotNull(result);
		AWLBaseResponseDto responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_SUCCESS);
		assertNotNull(responseDto.getId());

		// check for failed now .. duplicate
		result = awlClient.createBatchDetails(Arrays.asList(dto));
		responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_ALREADY_EXISTS);

	}

	@Test
	public void test3_createVendorDetails() {
		AWLVendorDetailsDto dto = prepareAwlVendorDetailsData();

		ResponseDto<List<AWLBaseResponseDto>> result = awlClient.createVendorDetails(Arrays.asList(dto));
		assertNotNull(result);
		AWLBaseResponseDto responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_SUCCESS);
		assertNotNull(responseDto.getId());

		// check for failed now .. duplicate
		result = awlClient.createVendorDetails(Arrays.asList(dto));
		responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_ALREADY_EXISTS);
	}
	
	
	@Test
	public void test4_createDealerDetails() {
		AWLDealerDetailsDto dto = prepareAWLDealerDetails();

		ResponseDto<List<AWLBaseResponseDto>> result = awlClient.createDealerDetails(Arrays.asList(dto));
		assertNotNull(result);
		AWLBaseResponseDto responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_SUCCESS);
		assertNotNull(responseDto.getId());

		// check for failed now .. duplicate
		result = awlClient.createDealerDetails(Arrays.asList(dto));
		responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_ALREADY_EXISTS);
	}
	

	@Test
	public void test5_createSKUDetails() {
		AWLSKUDetailsDto dto = prepareSKUDetails();

		ResponseDto<List<AWLBaseResponseDto>> result = awlClient.createSKUDetails(Arrays.asList(dto));
		assertNotNull(result);
		AWLBaseResponseDto responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_SUCCESS);
		assertNotNull(responseDto.getId());

		// check for failed now .. duplicate
		result = awlClient.createSKUDetails(Arrays.asList(dto));
		responseDto = result.getData().get(0);
		assertNotNull(dto);
		assertEquals(responseDto.getMessage(), RESPONSE_ALREADY_EXISTS);
	}
	
	

	private AWLBatchDetailsDto prepareAWLBatchDetailsData() {
		return AWLBatchDetailsDto.builder().batchNo("COVID-1-Test" + StanzaUtils.generateUniqueId(3)).bestBeforeUse(12)
				.clientCode("STANZA").expDate("2021-03-20").mfgDate("2020-03-25").mrp(200.99f).note("Test Data")
				.itemCode("COVID-19-Item-" + StanzaUtils.generateUniqueId(3)).build();

	}

	private AWLVendorDetailsDto prepareAwlVendorDetailsData() {
		return AWLVendorDetailsDto.builder().cilentCode("STANZA").contact("9910576586").gstNumber("GST-9910")
				// .payTerm("Test payterm")
				.vendorAddress("Aerocity,New Delhi").vendorCity("Delhi").vendorContactPerson("Mr. Covid Rathod")
				.vendorEmail("covid19@death.com").vendorId("COVID-19" + StanzaUtils.generateUniqueId(3))
				.vendorName("Covid-19-" + StanzaUtils.generateUniqueId(3))
				.vendorPan("ARKPD" + StanzaUtils.generateUniqueId(3)).vendorState("Delhi").vendorPinCode("122001")
				.build();
	}

	
	private AWLDealerDetailsDto prepareAWLDealerDetails() {
		return AWLDealerDetailsDto.builder()
				.awlCRMContactNo("9910576586")
				.awlCRMPerson("Mr. Covid-19")
				.billingAddress("Covid-Palace, China")
				.clientCode("STANZA")
				.dealerGSTNo("GST-COVID-19")
				.dealerState("COVID-State"+StanzaUtils.generateUniqueId(3))
				.deliveryAddress("Covid-Death-Garden,China")
				.houseCity("China")
				.houseCode("COVID-HOUSE-"+StanzaUtils.generateUniqueId(3))
				//.houseEmail("")
				.houseName("Covid-House-"+StanzaUtils.generateUniqueId(3))
				.housePinCode("122001")
				.primaryMobile("9910576586")
				.remarks("Test data")
				.secondaryMobile(null)
				.build();
	}
	
	
	private AWLSKUDetailsDto prepareSKUDetails() {
		return AWLSKUDetailsDto.builder()
				.batchNumberExists("YES")
				.breadth(20.5f)
				.catg1("Catg-1")
				.catg2("Catg-2")
				.catg3("Catg-3")
				.color("Red")
				.description("Test SKU")
				.height(12f)
				.hsNo("COVID-SKU-"+StanzaUtils.generateUniqueId(3))
				.isMaster("YES")
				.length(30)
				.masterChildQuantity(1)
				.masterSKU(null)
				.mrp(300f)
				.packOfQuantity("10")
				.packSpecification("Covid-19-SKU-item")
				.season(null)
				.serialNumberExists("YES")
				.size("20")
				.skuName("COVID-19-"+StanzaUtils.generateUniqueId(3))
				.stakingLevel(2)
				.style(null)
				.unit(null)
				.weight(1f)
				.build();
	}
	
}

