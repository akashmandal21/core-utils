package com.stanzaliving.documentgenerator.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.documentgenerator.dto.DocumentDto;
import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfDocumentDto;
import com.stanzaliving.documentgenerator.dto.PdfRequestDto;
import com.stanzaliving.documentgenerator.enums.DocumentGeneratorTemplateType;

public class ATLPdfTestData {

	public static Map<String, Object> getAtlPdfData() {
		Map<String, Object> atlData = new HashMap<>();
		atlData.put("atlDate", "31-Dec-2019");
		atlData.put("lessorNameAddressAndPan", "Debendra Dhinda ,<br/> Noida Sector 34, PAN : ARKPD678E");
		atlData.put("lesseeNameAddressAndPan", "Ankit Jindal ,<br/> Mahipalpur, PAN : ARKPD645N");

		atlData.put("siteAddress", "Address: Mahipalpur ,<br/> City: South Delhi, State : Delhi,<br/> PIN : 201302");
		atlData.put("purposeOfLease",
				"Long-stay accommodation for individuals including but not limited to students and working professionals.");
		atlData.put("totalPlotArea", "5000");
		atlData.put("totalPropertyArea", "4000");
		atlData.put("leasedPremisesArea", "2000");
		atlData.put("noOfRooms", "60");
		atlData.put("rentRate", "10lkh");
		atlData.put("noOfRentInstalments", "10");
		atlData.put("rentEscalation", "30");
		atlData.put("rentEscalationYear", "5");
		atlData.put("ifrsdMonths", "5");
		atlData.put("advanceRentAdjustmentMonth", "3");
		atlData.put("advanceRentAdjustmentMonthIn", "2");
		atlData.put("leaseTerm", "20");
		atlData.put("leasedPremisesHandoverDate", "2-Jan-2020");
		
		atlData.put("rentFreeFitOutPeriod", "60");
		atlData.put("rentStartDate", "01-Jan-2020");
		atlData.put("lesseLockInPeriod", "10");
		atlData.put("noticePeriodForExitByLease", "5");
		atlData.put("stampDuty", "Stanza");
		atlData.put("stampDutyBy", "Branch Manager");
		atlData.put("tokenDepositRate", "150000");
		atlData.put("termsOfRunningHostelMonthYear", "Jan 2020");
		atlData.put("lessorName", "Debendra Dhinda");
		atlData.put("lessorDesignation", "Business Person");
		atlData.put("DTwelveName", "Ankit Jindal");
		atlData.put("DTwelveDesignation", "Branch Manager");
		
		return atlData;
	}

	
	public static PdfRequestDto getATLPDFDocumentDto() {

		DocumentDto documentDto = DocumentDto.builder().documentOutputFileName("ATL Document").serviceName("ATL")
				.build();

		Map<String, Object> modelData = getAtlPdfData();
		DocumentGeneratorTemplateRequestDto templateRequestDto = DocumentGeneratorTemplateRequestDto.builder()
				.templateName("ATL_Template_HTML.html").templateType(DocumentGeneratorTemplateType.TYPE_HTML.getName())
				.templateModelData(modelData).build();

		PdfDocumentDto pdfDocumentDto = PdfDocumentDto.builder().documentDto(documentDto)
				.templateDto(templateRequestDto).build();

		PdfRequestDto pdfRequestDto = PdfRequestDto.builder().pdfDocumentDtos(Arrays.asList(pdfDocumentDto)).build();

		return pdfRequestDto;
	}
}
