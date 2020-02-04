package com.stanzaliving.core.legal.client.api;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.documentgenerator.dto.PdfRequestDto;

import lombok.extern.log4j.Log4j2;

@RunWith(MockitoJUnitRunner.class)
@Log4j2
public class LegalClientApiTest {

	StanzaRestClient stanzaRestClient = null;
	LegalClientApi clientApi = null;

	PdfRequestDto pdfRequestDto = null;

	@Before
	public void setupData() {
		stanzaRestClient = new StanzaRestClient("http://localhost:8092/legal");
		clientApi = new LegalClientApi(stanzaRestClient);

	}

	@Test
	public void test_1_getSignedAtlPath() {
		log.info(". . . test_1_getSignedAtlPath ...");

		String estateUuid ="61bd5523-198a-4e01-9a5c-d235a792e3d7";
		ResponseDto<String> responseDto = clientApi.getSignedATlFilePathByEstateUuid(estateUuid);

		assertNotNull(responseDto);
		assertNotNull(responseDto.getData());

		log.info("test_1_getSignedAtlPath - "+responseDto.getData());
	}

	
	
	
	
}
