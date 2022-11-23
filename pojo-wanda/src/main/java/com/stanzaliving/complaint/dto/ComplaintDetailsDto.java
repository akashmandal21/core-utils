package com.stanzaliving.complaint.dto;

import java.util.List;

import com.stanzaliving.core.complaint.dto.ComplaintConversationsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComplaintDetailsDto {

	private List<ComplaintConversationsDto> complaintConversationsDtos;
	
	private ComplaintMetaDataDto complaintMetaDataDto;
	
	private String categoryName;
	
	private String subCategoryName;
	
	private String complaintType;
}
