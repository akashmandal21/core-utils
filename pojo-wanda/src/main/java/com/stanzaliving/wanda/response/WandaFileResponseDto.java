package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.DocumentUploadType;
import com.stanzaliving.wanda.enums.ResidentDocumentContext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WandaFileResponseDto {
	
	private ResidentDocumentContext residentDocumentContext;
	
	private DocumentUploadType documentUploadType;
	
	private String filePath;
	
	private String fileName;
	
	private String fileUrl;
	
	private String metadata;
	
}
