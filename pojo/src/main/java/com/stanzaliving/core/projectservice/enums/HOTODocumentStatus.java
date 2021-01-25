package com.stanzaliving.core.projectservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  HOTODocumentStatus{

	SAVED_AS_DRAFT("Saved as Draft"),
	DOCUMENT_GENERATED("Docuement generated"),
	SIGNED_DOCUMENT_GENERATED("Signed Docuement generated");
	
	String statusName;
	
	
}
