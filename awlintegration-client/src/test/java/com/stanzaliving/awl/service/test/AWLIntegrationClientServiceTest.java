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
import com.stanzaliving.awl.service.AWLIntegrationClientService;
import com.stanzaliving.awl.service.impl.AWLIntegrationClientServiceImpl;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.utils.StanzaUtils;

import lombok.extern.log4j.Log4j2;

@SpringBootTest(classes = { AWLIntegrationClientService.class, AWLIntegrationClientServiceImpl.class })
@RunWith(SpringRunner.class)
@Log4j2
public class AWLIntegrationClientServiceTest {

	
	String RESPONSE_SUCCESS ="Done.";
	String RESPONSE_FAILED ="Failed";
	
	@Autowired
	AWLIntegrationClientService awlClient;

	@Test
	public void test1_createAWLBatchDetails() {
		assertNotNull(awlClient);
		ResponseDto<String> result =  awlClient.createBatchDetails(Arrays.asList(prepareAWLBatchDetailsData()));
		assertNotNull(result);
		assertEquals(result.getData(),'"' + RESPONSE_SUCCESS + '"');
		
	}
	
	
	@Test
	public void test2_createAWLBatchDetails() {
		AWLBatchDetailsDto dto = prepareAWLBatchDetailsData();
		ResponseDto<String> result =  awlClient.createBatchDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(),'"' + RESPONSE_SUCCESS + '"');
		
		//check for failed now .. duplicate
		result = awlClient.createBatchDetails(Arrays.asList(dto));
		assertNotNull(result);
		assertEquals(result.getData(),'"' + RESPONSE_FAILED + '"');
		
	}

	private AWLBatchDetailsDto prepareAWLBatchDetailsData() {
		return AWLBatchDetailsDto.	builder()
		.Batchno("COVID-1-Test"+StanzaUtils.generateUniqueId(3))
		.Bbuse(12)
		.Custcode("STANZA")
		.Expdate("2021-03-20")
		.Mfgdate("2020-03-25")
		.Mrp(200.99f)
		.Note("Test Data")
		.Sku("COVID-19-Item-"+StanzaUtils.generateUniqueId(3))
		.build();
		
	}
}
