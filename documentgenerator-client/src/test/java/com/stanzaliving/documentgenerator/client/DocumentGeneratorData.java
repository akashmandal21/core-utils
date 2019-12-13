package com.stanzaliving.documentgenerator.client;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfDocumentDto;
import com.stanzaliving.documentgenerator.enums.DocumentGeneratorTemplateType;

public class DocumentGeneratorData {

	public static DocumentGeneratorTemplateRequestDto getHTMLTemplateDto() {

		DocumentGeneratorTemplateRequestDto templateRequestDto = new DocumentGeneratorTemplateRequestDto();
		templateRequestDto.setTemplateName("template_stanza");
		templateRequestDto.setTemplateType(DocumentGeneratorTemplateType.TYPE_HTML.getName());


		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Debendra");
		modelData.put("lastName","Dhinda");
		modelData.put("zipCode","201302");
		modelData.put("street","Noida Sector 34");
		modelData.put("city","Noida");
		templateRequestDto.setTemplateModelData(modelData);

		return templateRequestDto;

	}



	public static DocumentGeneratorTemplateRequestDto getFTLTemplateDto() {

		DocumentGeneratorTemplateRequestDto templateRequestDto = new DocumentGeneratorTemplateRequestDto();
		templateRequestDto.setTemplateName("template_stanza_ftl");
		templateRequestDto.setTemplateType(DocumentGeneratorTemplateType.TYPE_FTL.getName());


		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Debendra");
		modelData.put("lastName","Dhinda");
		modelData.put("zipCode","201302");
		modelData.put("street","Noida Sector 34");
		modelData.put("city","Noida");
		templateRequestDto.setTemplateModelData(modelData);

		return templateRequestDto;

	}





	public static PdfDocumentDto getPdfDocumentDtoFTLTemplateType () {

		PdfDocumentDto pdfDocumentDto = PdfDocumentDto.builder().build();

		pdfDocumentDto.setPdfName("template_stanza_ftl_test");
		pdfDocumentDto.setTopicName("Topic-documentgenerator");
		pdfDocumentDto.setTemplateName("template_stanza_ftl");
		pdfDocumentDto.setTemplateType(DocumentGeneratorTemplateType.TYPE_FTL.getName());


		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Debendra");
		modelData.put("lastName","Dhinda");
		modelData.put("zipCode","201302");
		modelData.put("street","Noida Sector 34");
		modelData.put("city","Noida");
		pdfDocumentDto.setTemplateModelData(modelData);

		return pdfDocumentDto;
	}
	
	
	
	
	public static PdfDocumentDto getPdfDocumentDtoHTMLTemplateType () {

		PdfDocumentDto pdfDocumentDto = PdfDocumentDto.builder().build();

		pdfDocumentDto.setPdfName("template_stanza_html_test");
		pdfDocumentDto.setTopicName("Topic-documentgenerator");
		pdfDocumentDto.setTemplateName("template_stanza_html");
		pdfDocumentDto.setTemplateType(DocumentGeneratorTemplateType.TYPE_HTML.getName());


		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Ankit");
		modelData.put("lastName","Jindal");
		modelData.put("zipCode","201302");
		modelData.put("street","Noida Sector 34");
		modelData.put("city","Noida");
		pdfDocumentDto.setTemplateModelData(modelData);

		return pdfDocumentDto;
	}
}
