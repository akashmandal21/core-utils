package com.stanzaliving.documentgenerator.client.api;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfDocumentDto;

import lombok.extern.log4j.Log4j2;


/**
 * Rest client for DocumentGenerator APIs
 * @since 13-Dec-2019
 * @author debendra.dhinda
 * */

@Log4j2
public class DocumentGeneratorClientApi {
	
	private StanzaRestClient restClient;

	public DocumentGeneratorClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	
	/**
	 * 
	 * FreemarkerTemplateProcessorController process template.
	 * */
	public ResponseDto<String> processTemplate(DocumentGeneratorTemplateRequestDto templateRequestDto) {
		
		log.info("DocumentGeneratorClientApi - processTemplate "+templateRequestDto);

		String path = UriComponentsBuilder.fromPath("/freemarker/process").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, templateRequestDto, headerParams, accept, returnType);

	}
	
	
	
	/**
	 * 
	 * Api client to generate PDF document from the supplied data.
	 * **/
	public ResponseDto<PdfDocumentDto> generatePdf(PdfDocumentDto pdfDocumentDto) {

		log.info("DocumentGeneratorClientApi - generatePdf "+pdfDocumentDto);
		
		String path = UriComponentsBuilder.fromPath("/generate/pdf").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PdfDocumentDto>> returnType = new ParameterizedTypeReference<ResponseDto<PdfDocumentDto>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pdfDocumentDto, headerParams, accept, returnType);
	}
	
	
	
	/**
	 * 
	 * Api client to generate List of PDF documents from the supplied data.
	 * **/
	public ResponseDto<List<PdfDocumentDto>> generateListOfPdf(List<PdfDocumentDto> pdfDocumentDtoList) {
		
		log.info("DocumentGeneratorClientApi - generateListOfPdf "+pdfDocumentDtoList);

		String path = UriComponentsBuilder.fromPath("/generate/pdf/list").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<PdfDocumentDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<PdfDocumentDto>>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pdfDocumentDtoList, headerParams, accept, returnType);
	}
	
	
}
