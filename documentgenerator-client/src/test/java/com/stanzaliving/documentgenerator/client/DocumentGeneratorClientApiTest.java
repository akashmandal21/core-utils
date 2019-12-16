package com.stanzaliving.documentgenerator.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.documentgenerator.client.api.DocumentGeneratorClientApi;
import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfDocumentDto;

import lombok.extern.log4j.Log4j2;

@RunWith(MockitoJUnitRunner.class)
@Log4j2
public class DocumentGeneratorClientApiTest {


	StanzaRestClient stanzaRestClient = null;
	DocumentGeneratorTemplateRequestDto mockTemplateDto = null;
	DocumentGeneratorClientApi  clientApi = null;


	PdfDocumentDto pdfDocumentDto =null;
	
	


	@Before
	public void setupData() {
		stanzaRestClient = new StanzaRestClient("http://localhost:8086/documentgenerator");
		clientApi = new DocumentGeneratorClientApi(stanzaRestClient);
		
		
	}


	@Test
	public void test_ProcessHTMLType_Template() {
		log.info(". . . test_ProcessHTMLType_Template ...");
		mockTemplateDto = DocumentGeneratorData.getHTMLTemplateDto();

		assertTemplateDto(mockTemplateDto);

		ResponseDto<String> processedTemplateContent = clientApi.processTemplate(mockTemplateDto);

		assertNotNull(processedTemplateContent);



	}



	@Test
	public void test_ProcessFTLType_Template() {

		log.info(". . . test_ProcessFTLType_Template_ ...");

		mockTemplateDto = DocumentGeneratorData.getFTLTemplateDto();

		assertTemplateDto(mockTemplateDto);

		ResponseDto<String> processedTemplateContent = clientApi.processTemplate(mockTemplateDto);
		assertNotNull(processedTemplateContent);

	}


	///////////generate Pdf //////////

	@Test
	public void  test_GeneratePdf_FTL_TemplateType () {

		log.info(". . . test_GeneratePdf_FTL_TemplateType ...");

		pdfDocumentDto = DocumentGeneratorData.getPdfDocumentDtoFTLTemplateType();

		assertTemplateDto(pdfDocumentDto.getTemplateDto());
		
		assertNotNull(pdfDocumentDto.getDocumentDto().getDocumentOutputFileName());
		
		assertTrue(pdfDocumentDto.getDocumentDto().getDocumentOutputFileName().length()> 0);
		
		ResponseDto<PdfDocumentDto> responsePdf = clientApi.generatePdf(pdfDocumentDto);
		assertNotNull(responsePdf);
		assertNotNull(responsePdf.getData());
		//assertEquals("https://dev-mail-templates-erp.s3.ap-south-1.amazonaws.com/template_stanza_ftl_test.pdf", responsePdf.getData().getDocumentDto().getGeneratedDocumentPath());
		assertThat(responsePdf.getData().getDocumentDto().getGeneratedDocumentPath(), CoreMatchers.containsString("test_service1"));
	}
	
	
	
	@Test
	public void  test_GeneratePdf_HTML_TemplateType () {

		log.info(". . . test_GeneratePdf_HTML_TemplateType ...");

		pdfDocumentDto = DocumentGeneratorData.getPdfDocumentDtoHTMLTemplateType();

		assertTemplateDto(pdfDocumentDto.getTemplateDto());
		
		assertNotNull(pdfDocumentDto.getDocumentDto().getDocumentOutputFileName());
		
		assertTrue(pdfDocumentDto.getDocumentDto().getDocumentOutputFileName().length()> 0);

		ResponseDto<PdfDocumentDto> responsePdf = clientApi.generatePdf(pdfDocumentDto);
		assertNotNull(responsePdf);
		assertNotNull(responsePdf.getData());
		
		assertThat(responsePdf.getData().getDocumentDto().getGeneratedDocumentPath(), CoreMatchers.containsString("test_service2"));
		
		
	}


	
	@Test
	public void  test_Generate_List_Of_Pdf_HTML_TemplateType () {

		log.info(". . . test_Generate_List_Of_Pdf_HTML_TemplateType ...");

		
		List<PdfDocumentDto> pdfDocumentDtos = new ArrayList<>();
		
		for(int i=1;i<=2;i++) {
			PdfDocumentDto dto = DocumentGeneratorData.getPdfDocumentDtoHTMLTemplateType();
			
			assertTemplateDto(dto.getTemplateDto());
			assertNotNull(dto.getDocumentDto().getDocumentOutputFileName());
			assertTrue(dto.getDocumentDto().getDocumentOutputFileName().length()> 0);
			
			dto.getDocumentDto().setDocumentOutputFileName(dto.getDocumentDto().getDocumentOutputFileName()+i);
			
			pdfDocumentDtos.add(dto);
		}
		
		ResponseDto<List<PdfDocumentDto>> responsePdfList = clientApi.generateListOfPdf(pdfDocumentDtos);
		
		assertNotNull(responsePdfList);
		
		assertTrue(responsePdfList.getData().size() > 0);
		
		
	}
	
	
	private void assertTemplateDto(DocumentGeneratorTemplateRequestDto mockTemplateDto) {
		
		assertNotNull(mockTemplateDto);
		assertNotNull(mockTemplateDto.getTemplateName());
		assertNotNull(mockTemplateDto.getTemplateType());
		assertTrue(mockTemplateDto.getTemplateName().length()> 0);
		assertTrue(mockTemplateDto.getTemplateType().length()> 0);
		
		
	}




}
