package com.stanzaliving.wanda.response;

import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.wanda.enums.DocumentSideType;
import com.stanzaliving.wanda.enums.DocumentUploadType;
import com.stanzaliving.wanda.enums.ResidentDocumentContext;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerTemporaryMapping {

	private String userUuid;
	private String currentHostelId;
	private String currentRoomNo;
	
}
