package com.stanzaliving.documentgenerator.client;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.documentgenerator.dto.DocumentDto;
import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfDocumentDto;
import com.stanzaliving.documentgenerator.enums.DocumentGeneratorTemplateType;

public class DocumentGeneratorData {
	
	
	
	public static AddressTestData getAddressTestData() {
		return new AddressTestData("201302","Noida Sector 34","Noida");
	}

	public static DocumentGeneratorTemplateRequestDto getHTMLTemplateDto() {

		DocumentGeneratorTemplateRequestDto templateRequestDto = new DocumentGeneratorTemplateRequestDto();
		templateRequestDto.setTemplateName("template_stanza_html");
		templateRequestDto.setTemplateType(DocumentGeneratorTemplateType.TYPE_HTML.getName());


		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Debendra");
		modelData.put("lastName","Dhinda");
		
		modelData.put("address",getAddressTestData());
		
		modelData.put("image","https://res.cloudinary.com/stanza-living/image/upload/q_60,w_1000/v1554802583/Website/Residences/Boston/1.jpg");
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

		DocumentDto documentDto = DocumentDto.builder()
				.documentOutputFileName("template_stanza_ftl_test")
				.topicName("Topic-documentgenerator")
				.serviceName("test_service1")
				.isOverride(true)
				.build();
		

		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Debendra");
		modelData.put("lastName","Dhinda");
		modelData.put("zipCode","201302");
		modelData.put("street","Noida Sector 34");
		modelData.put("city","Noida");

		DocumentGeneratorTemplateRequestDto templateRequestDto =DocumentGeneratorTemplateRequestDto.builder()
				.templateName("template_stanza_ftl")
				.templateType(DocumentGeneratorTemplateType.TYPE_FTL.getName())
				.templateModelData(modelData)
				.build();
		

		PdfDocumentDto pdfDocumentDto = PdfDocumentDto.builder()
				.documentDto(documentDto)
				.templateDto(templateRequestDto)
				.build();
		return pdfDocumentDto;
	}
	
	
	
	
	public static PdfDocumentDto getPdfDocumentDtoHTMLTemplateType () {

		
		DocumentDto documentDto = DocumentDto.builder()
				.documentOutputFileName("template_stanza_html_test")
				.topicName("Topic-documentgenerator")
				.serviceName("test_service2")
				.isOverride(false)
				.build();
		
		
		Map<String,Object> modelData =new HashMap<>();
		modelData.put("firstName","Ankit");
		modelData.put("lastName","Jindal");
		modelData.put("address",getAddressTestData());
		modelData.put("image","https://res.cloudinary.com/stanza-living/image/upload/q_60,w_1000/v1554802583/Website/Residences/Boston/1.jpg");

		DocumentGeneratorTemplateRequestDto templateRequestDto =DocumentGeneratorTemplateRequestDto.builder()
				.templateName("template_stanza_html")
				.templateType(DocumentGeneratorTemplateType.TYPE_HTML.getName())
				.templateModelData(modelData)
				.build();

		PdfDocumentDto pdfDocumentDto = PdfDocumentDto.builder()
				.documentDto(documentDto)
				.templateDto(templateRequestDto)
				.build();
		
		return pdfDocumentDto;
	}
}
