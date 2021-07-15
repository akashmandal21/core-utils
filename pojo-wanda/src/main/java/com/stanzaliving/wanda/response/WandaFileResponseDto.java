package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.ApprovalStatus;
import com.stanzaliving.wanda.enums.DocumentSideType;
import com.stanzaliving.wanda.enums.DocumentUploadType;
import com.stanzaliving.wanda.enums.ResidentDocumentContext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WandaFileResponseDto {
	
	private ResidentDocumentContext residentDocumentContext;
	
	private DocumentUploadType documentUploadType;

	private DocumentSideType documentSideType;
	
	private String filePath;
	
	private String fileName;
	
	private String fileUrl;
	
	private String metadata;
	
	private String userId;
	
	private String bookingUuid;
	
	private boolean isVerified;

	private String approvalStatus;

	private String rejectedReason;

	private String kycDocumentUuid;

	private String documentLabel;

	private String icon;

	private String statusBackground;
}
