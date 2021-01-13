package com.stanzaliving.banner.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PromotionResponseDto {
	
	private Long id;
	
	private String uuid;
	
	private String createdBy;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

	private String updatedBy;
	
	private Long dashboardId;
	
	private String promotionName;

	private String promotionIcon;

	private int priorityOrder;

	private Boolean isForAllUsers;
	
	private String userListFilePath;
	
	private Boolean isSchedule;

	private LocalDateTime scheduledDate;

	private Boolean isActive;
	
	private Boolean isDraft;

	private LocalDateTime expiryDate;

	private int totalCreatives;
	
	private List<CreativeResponseDto> creatives;
	
}
