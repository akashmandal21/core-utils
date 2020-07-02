package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.enums.DocumentUploadType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ResidentKYCDocumentResponseDto {

	private List<WandaFileResponseDto> fileResponseDtos;
	
	private List<DocumentUploadType> validDocuments;
	
	private DocumentUploadType[] documentTypes;
	
}
