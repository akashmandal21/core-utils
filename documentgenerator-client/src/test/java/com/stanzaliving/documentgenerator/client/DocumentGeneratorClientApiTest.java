package com.stanzaliving.documentgenerator.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.documentgenerator.client.api.DocumentGeneratorClientApi;
import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfRequestDto;

import lombok.extern.log4j.Log4j2;

@RunWith(MockitoJUnitRunner.class)
@Log4j2
public class DocumentGeneratorClientApiTest {

	StanzaRestClient stanzaRestClient = null;
	DocumentGeneratorTemplateRequestDto mockTemplateDto = null;
	DocumentGeneratorClientApi clientApi = null;

	PdfRequestDto pdfRequestDto = null;

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

	/////////// generate Pdf //////////

	@Test
	public void test_GeneratePdf_FTL_TemplateType() {

		log.info(". . . test_GeneratePdf_FTL_TemplateType ...");

		pdfRequestDto = DocumentGeneratorData.getPdfDocumentDtoFTLTemplateType();

		assertTemplateDto(pdfRequestDto.getPdfDocumentDtos().get(0).getTemplateDto());

		assertNotNull(pdfRequestDto.getPdfDocumentDtos().get(0).getDocumentDto().getDocumentOutputFileName());

		assertTrue(pdfRequestDto.getPdfDocumentDtos().get(0).getDocumentDto().getDocumentOutputFileName().length() > 0);

		ResponseDto<PdfRequestDto> responsePdf = clientApi.generatePdf(pdfRequestDto);
		assertNotNull(responsePdf);
		assertNotNull(responsePdf.getData());
		// assertEquals("https://dev-mail-templates-erp.s3.ap-south-1.amazonaws.com/template_stanza_ftl_test.pdf",
		// responsePdf.getData().getDocumentDto().getGeneratedDocumentPath());
		assertThat(responsePdf.getData().getPdfDocumentDtos().get(0).getDocumentDto().getGeneratedDocumentPath(),
				CoreMatchers.containsString("test_service1"));
	}

	@Test
	public void test_GeneratePdf_HTML_TemplateType() {

		log.info(". . . test_GeneratePdf_HTML_TemplateType ...");

		pdfRequestDto = DocumentGeneratorData.getPdfDocumentDtoHTMLTemplateType();

		assertTemplateDto(pdfRequestDto.getPdfDocumentDtos().get(0).getTemplateDto());

		assertNotNull(pdfRequestDto.getPdfDocumentDtos().get(0).getDocumentDto().getDocumentOutputFileName());

		assertTrue(pdfRequestDto.getPdfDocumentDtos().get(0).getDocumentDto().getDocumentOutputFileName().length() > 0);

		ResponseDto<PdfRequestDto> responsePdf = clientApi.generatePdf(pdfRequestDto);
		assertNotNull(responsePdf);
		assertNotNull(responsePdf.getData());

		assertThat(responsePdf.getData().getPdfDocumentDtos().get(0).getDocumentDto().getGeneratedDocumentPath(),
				CoreMatchers.containsString("test_service2"));

	}

	// test ATL pdf
	//@Test
	public void test_ATL_Pdf_HTML_TemplateType() {

		log.info("Generate ATL PDF from ATL HTML template.");
		pdfRequestDto = ATLPdfTestData.getATLPDFDocumentDto();

		assertTemplateDto(pdfRequestDto.getPdfDocumentDtos().get(0).getTemplateDto());
		assertNotNull(pdfRequestDto.getPdfDocumentDtos().get(0).getDocumentDto().getDocumentOutputFileName());
		assertTrue(pdfRequestDto.getPdfDocumentDtos().get(0).getDocumentDto().getDocumentOutputFileName().length() > 0);

		ResponseDto<PdfRequestDto> responsePdf = clientApi.generatePdf(pdfRequestDto);
		assertNotNull(responsePdf);
		assertThat(responsePdf.getData().getPdfDocumentDtos().get(0).getDocumentDto().getGeneratedDocumentPath(),
				CoreMatchers.containsString("ATL"));
	}

	private void assertTemplateDto(DocumentGeneratorTemplateRequestDto mockTemplateDto) {

		assertNotNull(mockTemplateDto);
		assertNotNull(mockTemplateDto.getTemplateName());
		assertNotNull(mockTemplateDto.getTemplateType());
		assertTrue(mockTemplateDto.getTemplateName().length() > 0);
		assertTrue(mockTemplateDto.getTemplateType().length() > 0);

	}

}
