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
import com.stanzaliving.documentgenerator.dto.PdfStampingDto;

import lombok.extern.log4j.Log4j2;


/**
 * Rest client for Internal DocumentGenerator APIs
 * 
 * @since 14-Jan-2020
 * @author debendra.dhinda
 */
 
@Log4j2
public class InternalDocumentGeneratorClientApi {

	private StanzaRestClient restClient;

	public InternalDocumentGeneratorClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	
	/**
	 * 
	 * Api client for adding/stamping new data to the existing PDF.
	 * 
	 * @see {@link PdfStampingDto}
	 * @author debendra.dhinda
	 * **/
	public ResponseDto<PdfStampingDto> addTextToExistingPdf(PdfStampingDto pdfStampingDto) {

		log.info("InternalDocumentGeneratorClientApi - add additional text to existing pdf request for data {} ", pdfStampingDto);

		String path = UriComponentsBuilder.fromPath("/internal/pdf/stamping").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PdfStampingDto>> returnType = new ParameterizedTypeReference<ResponseDto<PdfStampingDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pdfStampingDto, headerParams, accept,
				returnType);
	}

}
