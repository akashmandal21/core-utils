package com.stanzaliving.complaint.dto;

import java.util.TreeSet;

import com.stanzaliving.core.complaint.dto.ComplaintConversationsDto;

public class ComplaintDetailsDto {

	private TreeSet<ComplaintConversationsDto> complaintConversationsDtos;
	
	private ComplaintMetaDataDto complaintMetaDataDto;
	
	private String categoryName;
	
	private String subCategoryName;
	
	private String complaintType;
}
