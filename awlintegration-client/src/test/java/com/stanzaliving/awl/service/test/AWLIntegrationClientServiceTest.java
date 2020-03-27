package com.stanzaliving.awl.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stanzaliving.awl.dto.AWLBatchDetailsDto;
import com.stanzaliving.awl.dto.AWLDealerDetailsDto;
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

	String RESPONSE_SUCCESS = "Done.";
	String RESPONSE_FAILED = "Failed";

	@Autowired
	AWLIntegrationClientService awlClient;

	@Test
	public void test1_createAWLBatchDetails() {
		assertNotNull(awlClient);
		ResponseDto<String> result = awlClient.createBatchDetails(Arrays.asList(prepareAWLBatchDetailsData()));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_SUCCESS + '"');

	}

	@Test
	public void test2_createAWLBatchDetails() {
		AWLBatchDetailsDto dto = prepareAWLBatchDetailsData();
		ResponseDto<String> result = awlClient.createBatchDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_SUCCESS + '"');

		// check for failed now .. duplicate
		result = awlClient.createBatchDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_FAILED + '"');

	}

	@Test
	public void test3_createVendorDetails() {
		AWLVendorDetailsDto dto = prepareAwlVendorDetailsData();

		ResponseDto<String> result = awlClient.createVendorDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_SUCCESS + '"');

		// check for failed now .. duplicate
		result = awlClient.createVendorDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_FAILED + '"');
	}
	
	
	@Test
	public void test4_createDealerDetails() {
		AWLDealerDetailsDto dto = prepareAWLDealerDetails();

		ResponseDto<String> result = awlClient.createDealerDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_SUCCESS + '"');

		// check for failed now .. duplicate
		result = awlClient.createDealerDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(), '"' + RESPONSE_FAILED + '"');
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
}
