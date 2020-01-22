package com.stanzaliving.documentgenerator.client;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.documentgenerator.client.api.InternalDocumentGeneratorClientApi;
import com.stanzaliving.documentgenerator.dto.PdfRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfStampingDataDto;
import com.stanzaliving.documentgenerator.dto.PdfStampingDto;

import lombok.extern.log4j.Log4j2;

@RunWith(MockitoJUnitRunner.class)
@Log4j2
public class InternalDocumentGeneratorClientApiTest {

	StanzaRestClient stanzaRestClient = null;
	InternalDocumentGeneratorClientApi clientApi = null;

	PdfRequestDto pdfRequestDto = null;

	@Before
	public void setupData() {
		stanzaRestClient = new StanzaRestClient("http://localhost:8086/documentgenerator");
		clientApi = new InternalDocumentGeneratorClientApi(stanzaRestClient);

	}

	@Test
	public void test_add_text_to_existing_pdf() {
		log.info(". . . test_add_text_to_existing_pdf ...");

		String originalPdfFilePath ="https://dev-mail-templates-erp.s3.ap-south-1.amazonaws.com/QR_Test/test_leaseterm_646416.pdf";
		String uploadToS3BucketName = "dev-mail-templates-erp";
		String serviceName ="test_appendtext";
		
		
		List<PdfStampingDataDto> dataDtos = new ArrayList<>();
		for(int i=1;i<=3;i++) {
			PdfStampingDataDto dataDto = PdfStampingDataDto.builder()
					.pageNumber(i)
					.stampingText("Hi, I am stampped text for \n page "+ i)
					.stampingTextFontSize(10f)
					.xCoordinate((20*i)+400)
					.yCoordinate((20*i)+600)
					.build();
			dataDtos.add(dataDto);
		}
		
		PdfStampingDto pdfStampingDto = PdfStampingDto.builder()
				.originalPdfFilePath(originalPdfFilePath)
				.pdfStampingDataDtos(dataDtos)
				.serviceName(serviceName)
				.uploadToS3BucketName(uploadToS3BucketName)
				.build();

		ResponseDto<PdfStampingDto> responseDto = clientApi.addTextToExistingPdf(pdfStampingDto);

		assertNotNull(responseDto);
		assertNotNull(responseDto.getData());
		assertNotNull(responseDto.getData().getGeneratedDocumentPath());

		log.info("Generated new pdf file with new text added - "+responseDto.getData().getGeneratedDocumentPath());
	}

	
	
	
	
}
