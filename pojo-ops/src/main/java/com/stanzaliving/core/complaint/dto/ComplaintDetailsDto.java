package com.stanzaliving.core.complaint.dto;

import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComplaintDetailsDto {

	private TreeSet<ComplaintConversationsDto> complaintConversationsDtos;
	
	private ComplaintMetaDataDto complaintMetaDataDto;
	
	private String categoryName;
	
	private String subCategoryName;
	
	private String complaintType;
}